package calculator.client;

import com.proto.calculator.*;
import com.proto.greeting.GreetingRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

public class CalculatorClient {

    private static void doSum(ManagedChannel channel) {
        System.out.println("Enter doSum");
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);
        SumResponse response = stub.sum(SumRequest.newBuilder().setFirstNumber(95121).setSecondNumber(1120).build());

        System.out.println("Sum = " + response.getResult());
    }

    private static void  doPrimes(ManagedChannel channel) {
        System.out.println("Enter doPrimes");
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        stub.primes(PrimesRequest.newBuilder().setNumber(567890).build()).forEachRemaining(response -> {
            System.out.println(response.getPrimeFactor());
        });
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Needs one argument to work");
            return;
        }

        ManagedChannel channel = ManagedChannelBuilder.forAddress("Localhost", 50052)
                .usePlaintext()
                .build();

        switch (args[0]) {
            case "sum": doSum(channel); break;
            case "primes": doPrimes(channel); break;
            default:
                System.out.println("Keyword Invalid" + args[0]);
        }
    }
}
