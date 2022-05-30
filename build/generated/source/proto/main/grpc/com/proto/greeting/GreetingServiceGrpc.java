package com.proto.greeting;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: greeting/greeting.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreetingServiceGrpc {

  private GreetingServiceGrpc() {}

  public static final String SERVICE_NAME = "greeting.GreetingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest,
      com.proto.greeting.GreetingResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greet",
      requestType = com.proto.greeting.GreetingRequest.class,
      responseType = com.proto.greeting.GreetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest,
      com.proto.greeting.GreetingResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest, com.proto.greeting.GreetingResponse> getGreetMethod;
    if ((getGreetMethod = GreetingServiceGrpc.getGreetMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getGreetMethod = GreetingServiceGrpc.getGreetMethod) == null) {
          GreetingServiceGrpc.getGreetMethod = getGreetMethod =
              io.grpc.MethodDescriptor.<com.proto.greeting.GreetingRequest, com.proto.greeting.GreetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("greet"))
              .build();
        }
      }
    }
    return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest,
      com.proto.greeting.GreetingResponse> getGreetManyTimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetManyTimes",
      requestType = com.proto.greeting.GreetingRequest.class,
      responseType = com.proto.greeting.GreetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest,
      com.proto.greeting.GreetingResponse> getGreetManyTimesMethod() {
    io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest, com.proto.greeting.GreetingResponse> getGreetManyTimesMethod;
    if ((getGreetManyTimesMethod = GreetingServiceGrpc.getGreetManyTimesMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getGreetManyTimesMethod = GreetingServiceGrpc.getGreetManyTimesMethod) == null) {
          GreetingServiceGrpc.getGreetManyTimesMethod = getGreetManyTimesMethod =
              io.grpc.MethodDescriptor.<com.proto.greeting.GreetingRequest, com.proto.greeting.GreetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greetManyTimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("greetManyTimes"))
              .build();
        }
      }
    }
    return getGreetManyTimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest,
      com.proto.greeting.GreetingResponse> getLongGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "longGreet",
      requestType = com.proto.greeting.GreetingRequest.class,
      responseType = com.proto.greeting.GreetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest,
      com.proto.greeting.GreetingResponse> getLongGreetMethod() {
    io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest, com.proto.greeting.GreetingResponse> getLongGreetMethod;
    if ((getLongGreetMethod = GreetingServiceGrpc.getLongGreetMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getLongGreetMethod = GreetingServiceGrpc.getLongGreetMethod) == null) {
          GreetingServiceGrpc.getLongGreetMethod = getLongGreetMethod =
              io.grpc.MethodDescriptor.<com.proto.greeting.GreetingRequest, com.proto.greeting.GreetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "longGreet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("longGreet"))
              .build();
        }
      }
    }
    return getLongGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest,
      com.proto.greeting.GreetingResponse> getGreetEveryoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetEveryone",
      requestType = com.proto.greeting.GreetingRequest.class,
      responseType = com.proto.greeting.GreetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest,
      com.proto.greeting.GreetingResponse> getGreetEveryoneMethod() {
    io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest, com.proto.greeting.GreetingResponse> getGreetEveryoneMethod;
    if ((getGreetEveryoneMethod = GreetingServiceGrpc.getGreetEveryoneMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getGreetEveryoneMethod = GreetingServiceGrpc.getGreetEveryoneMethod) == null) {
          GreetingServiceGrpc.getGreetEveryoneMethod = getGreetEveryoneMethod =
              io.grpc.MethodDescriptor.<com.proto.greeting.GreetingRequest, com.proto.greeting.GreetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greetEveryone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("greetEveryone"))
              .build();
        }
      }
    }
    return getGreetEveryoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest,
      com.proto.greeting.GreetingResponse> getGreetWithDeadlineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetWithDeadline",
      requestType = com.proto.greeting.GreetingRequest.class,
      responseType = com.proto.greeting.GreetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest,
      com.proto.greeting.GreetingResponse> getGreetWithDeadlineMethod() {
    io.grpc.MethodDescriptor<com.proto.greeting.GreetingRequest, com.proto.greeting.GreetingResponse> getGreetWithDeadlineMethod;
    if ((getGreetWithDeadlineMethod = GreetingServiceGrpc.getGreetWithDeadlineMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getGreetWithDeadlineMethod = GreetingServiceGrpc.getGreetWithDeadlineMethod) == null) {
          GreetingServiceGrpc.getGreetWithDeadlineMethod = getGreetWithDeadlineMethod =
              io.grpc.MethodDescriptor.<com.proto.greeting.GreetingRequest, com.proto.greeting.GreetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greetWithDeadline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greeting.GreetingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("greetWithDeadline"))
              .build();
        }
      }
    }
    return getGreetWithDeadlineMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetingServiceStub>() {
        @java.lang.Override
        public GreetingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetingServiceStub(channel, callOptions);
        }
      };
    return GreetingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetingServiceBlockingStub>() {
        @java.lang.Override
        public GreetingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetingServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetingServiceFutureStub>() {
        @java.lang.Override
        public GreetingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetingServiceFutureStub(channel, callOptions);
        }
      };
    return GreetingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreetingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void greet(com.proto.greeting.GreetingRequest request,
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     */
    public void greetManyTimes(com.proto.greeting.GreetingRequest request,
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetManyTimesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greeting.GreetingRequest> longGreet(
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLongGreetMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greeting.GreetingRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGreetEveryoneMethod(), responseObserver);
    }

    /**
     */
    public void greetWithDeadline(com.proto.greeting.GreetingRequest request,
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetWithDeadlineMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.greeting.GreetingRequest,
                com.proto.greeting.GreetingResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getGreetManyTimesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.greeting.GreetingRequest,
                com.proto.greeting.GreetingResponse>(
                  this, METHODID_GREET_MANY_TIMES)))
          .addMethod(
            getLongGreetMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.greeting.GreetingRequest,
                com.proto.greeting.GreetingResponse>(
                  this, METHODID_LONG_GREET)))
          .addMethod(
            getGreetEveryoneMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.greeting.GreetingRequest,
                com.proto.greeting.GreetingResponse>(
                  this, METHODID_GREET_EVERYONE)))
          .addMethod(
            getGreetWithDeadlineMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.greeting.GreetingRequest,
                com.proto.greeting.GreetingResponse>(
                  this, METHODID_GREET_WITH_DEADLINE)))
          .build();
    }
  }

  /**
   */
  public static final class GreetingServiceStub extends io.grpc.stub.AbstractAsyncStub<GreetingServiceStub> {
    private GreetingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetingServiceStub(channel, callOptions);
    }

    /**
     */
    public void greet(com.proto.greeting.GreetingRequest request,
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void greetManyTimes(com.proto.greeting.GreetingRequest request,
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGreetManyTimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greeting.GreetingRequest> longGreet(
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getLongGreetMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greeting.GreetingRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGreetEveryoneMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void greetWithDeadline(com.proto.greeting.GreetingRequest request,
        io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetWithDeadlineMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreetingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreetingServiceBlockingStub> {
    private GreetingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.greeting.GreetingResponse greet(com.proto.greeting.GreetingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.greeting.GreetingResponse> greetManyTimes(
        com.proto.greeting.GreetingRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGreetManyTimesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.greeting.GreetingResponse greetWithDeadline(com.proto.greeting.GreetingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetWithDeadlineMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GreetingServiceFutureStub> {
    private GreetingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.greeting.GreetingResponse> greet(
        com.proto.greeting.GreetingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.greeting.GreetingResponse> greetWithDeadline(
        com.proto.greeting.GreetingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetWithDeadlineMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_GREET_MANY_TIMES = 1;
  private static final int METHODID_GREET_WITH_DEADLINE = 2;
  private static final int METHODID_LONG_GREET = 3;
  private static final int METHODID_GREET_EVERYONE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((com.proto.greeting.GreetingRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse>) responseObserver);
          break;
        case METHODID_GREET_MANY_TIMES:
          serviceImpl.greetManyTimes((com.proto.greeting.GreetingRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse>) responseObserver);
          break;
        case METHODID_GREET_WITH_DEADLINE:
          serviceImpl.greetWithDeadline((com.proto.greeting.GreetingRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LONG_GREET:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.longGreet(
              (io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse>) responseObserver);
        case METHODID_GREET_EVERYONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetEveryone(
              (io.grpc.stub.StreamObserver<com.proto.greeting.GreetingResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.greeting.Greeting.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetingService");
    }
  }

  private static final class GreetingServiceFileDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier {
    GreetingServiceFileDescriptorSupplier() {}
  }

  private static final class GreetingServiceMethodDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetingServiceFileDescriptorSupplier())
              .addMethod(getGreetMethod())
              .addMethod(getGreetManyTimesMethod())
              .addMethod(getLongGreetMethod())
              .addMethod(getGreetEveryoneMethod())
              .addMethod(getGreetWithDeadlineMethod())
              .build();
        }
      }
    }
    return result;
  }
}
