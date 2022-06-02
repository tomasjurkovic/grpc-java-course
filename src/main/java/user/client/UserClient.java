package user.client;

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
                            .setFirstName("Tomas")
                            .setLastName("Jurkovic")
                            .setAge(28)
                            .setPhone("0903909901")
                            .setEmail("tomas.jurkovic@hotmail.com")
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

    private static void run(ManagedChannel channel) {
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);

        UserId userId = createUser(stub);

        if (userId == null) {
            return;
        }
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
