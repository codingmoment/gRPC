package com.grpc.basic;

import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {

  public static void main(String[] args) throws Exception {
    final ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

    RequestMessage request = RequestMessage.newBuilder().setName("Nilesh").build();

    ResponseMessage response = null;

    try {
      response = GreetingServiceGrpc.newBlockingStub(channel).sayHello(request);
      System.out.println(response.getMessage());
    }
    finally {
      channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
  }
}
