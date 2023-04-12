package com.grpc.basic;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.stub.StreamObserver;

@GRpcService
public class GreetingService extends GreetingServiceGrpc.GreetingServiceImplBase {

  @Override
  public void sayHello(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {
    ResponseMessage reply = ResponseMessage.newBuilder().setMessage("Hello " + request.getName() + ", from server").build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
