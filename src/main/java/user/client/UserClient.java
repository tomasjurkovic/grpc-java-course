package user.client;

import com.google.protobuf.Empty;
import com.proto.blog.User;
import com.proto.blog.UserId;
import com.proto.blog.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;


public class UserClient {

    private static UserId createUser(UserServiceGrpc.UserServiceBlockingStub stub) {
        try {
            UserId createResponse = stub.createUser(
                    User.newBuilder()
                            .setFirstName("Diego")
                            .setLastName("Costa")
                            .setAge(38)
                            .setPhone("0911234225")
                            .setEmail("diego.costa@hotmail.com")
                            .build()
            );

            System.out.println("User created: " + createResponse.getId());
            return createResponse;

        } catch (StatusRuntimeException e) {
            System.out.println("Could not create user");
            e.printStackTrace();
            return null;
        }
    }

    private static void readUser(UserServiceGrpc.UserServiceBlockingStub stub, UserId userId) {
        try {
            User readResponse = stub.readUser(userId);

            System.out.println("User read: " + readResponse);
        } catch (StatusRuntimeException e) {
            System.out.println("Could not read the blog");
            e.printStackTrace();
        }
    }

    private static void listUsers(UserServiceGrpc.UserServiceBlockingStub stub) {
        stub.listUsers(Empty.getDefaultInstance()).forEachRemaining(System.out::println);
    }

    private static void deleteUser(UserServiceGrpc.UserServiceBlockingStub stub, UserId userId) {
        try {
            stub.deleteUser(userId);
            System.out.println("User deleted: " + userId.getId());
        } catch (StatusRuntimeException e) {
            System.out.println("User cannot be deleted");
            e.printStackTrace();
        }
    }

    private static void run(ManagedChannel channel) {
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);

        UserId userId = createUser(stub);

        if (userId == null) {
            return;
        }

        readUser(stub, userId);
        listUsers(stub);
        deleteUser(stub, userId);

    }

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        run(channel);

        System.out.println("Shutting down");
        channel.shutdown();
    }

}
