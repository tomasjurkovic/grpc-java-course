package user.server;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import com.mongodb.client.result.InsertOneResult;
import com.proto.blog.UserId;
import com.proto.blog.UserServiceGrpc;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.bson.Document;

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



}
