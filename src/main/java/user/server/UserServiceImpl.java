package user.server;

import com.google.protobuf.Empty;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.proto.blog.User;
import com.proto.blog.UserId;
import com.proto.blog.UserServiceGrpc;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.bson.Document;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;

public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    private final MongoCollection<Document> mongoCollection;

    UserServiceImpl(MongoClient client) {
        MongoDatabase db = client.getDatabase("userdb");
        mongoCollection = db.getCollection("user");
    }

    @Override
    public void createUser(com.proto.blog.User request, StreamObserver<com.proto.blog.UserId> responseObserver) {

        Document doc = new Document("first_name", request.getFirstName())
                .append("last_name", request.getLastName())
                .append("age", request.getAge())
                .append("phone", request.getPhone())
                .append("email", request.getEmail());

        InsertOneResult result;

        try {
            result = mongoCollection.insertOne(doc);
        } catch (MongoException e) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription(e.getLocalizedMessage())
                    .asRuntimeException());
            return;
        }

        if(!result.wasAcknowledged() || result.getInsertedId() == null) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("User could not be created.")
                    .asRuntimeException());
            return;
        }

        String id = result.getInsertedId().asObjectId().getValue().toString();

        responseObserver.onNext(UserId.newBuilder().setId(id).build());
        responseObserver.onCompleted();
    }

    @Override
    public void readUser(UserId request, StreamObserver<User> responseObserver) {
        if (request.getId().isEmpty()) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("The User ID cannot be empty")
                    .asRuntimeException());
            return;
        }

        String id = request.getId();
        Document result = mongoCollection.find(eq("_id", new ObjectId(id))).first();

        if (result == null) {
            responseObserver.onError(Status.NOT_FOUND
                    .withDescription("User was not found")
                    .augmentDescription("UserId: " + id)
                    .asRuntimeException());
            return;
        }

        responseObserver.onNext(User.newBuilder()
                .setFirstName(result.getString("first_name"))
                .setLastName(result.getString("last_name"))
                .setAge(result.getInteger("age"))
                .setPhone(result.getString("phone"))
                .setEmail(result.getString("email"))
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void listUsers(Empty request, StreamObserver<User> responseObserver) {
        for (Document document : mongoCollection.find()) {
            responseObserver.onNext(User.newBuilder()
                    .setId(document.getObjectId("_id").toString())
                    .setFirstName(document.getString("first_name"))
                    .setLastName(document.getString("last_name"))
                    .setAge(document.getInteger("age"))
                    .setPhone(document.getString("phone"))
                    .setEmail(document.getString("email"))
                    .build());
        }

        responseObserver.onCompleted();
    }

    @Override
    public void deleteUser(UserId request, StreamObserver<Empty> responseObserver) {
        if (request.getId().isEmpty()) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("The User ID cannot be empty")
                    .asRuntimeException());
            return;
        }

        String id = request.getId();
        DeleteResult result;

        try {
            result = mongoCollection.deleteOne(eq("_id", new ObjectId(id)));
        } catch (MongoException e) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("User cannot be deleted")
                    .asRuntimeException());
            return;
        }

        if (!result.wasAcknowledged()) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("User could not be deleted")
                    .asRuntimeException());
            return;
        }

        if (result.getDeletedCount() == 0) {
            responseObserver.onError(Status.NOT_FOUND
                    .withDescription("The blog was not found")
                    .augmentDescription("BlogId: " + id)
                    .asRuntimeException());
            return;
        }

        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}
