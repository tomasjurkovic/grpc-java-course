// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/calculator.proto

package com.proto.calculator;

public final class Calculator {
  private Calculator() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033calculator/calculator.proto\022\ncalculato" +
      "r\032\024calculator/sum.proto\032\027calculator/prim" +
      "es.proto\032\024calculator/avg.proto\032\024calculat" +
      "or/max.proto\032\025calculator/sqrt.proto2\277\002\n\021" +
      "CalculatorService\0226\n\003sum\022\026.calculator.Su" +
      "mRequest\032\027.calculator.SumResponse\022A\n\006pri" +
      "mes\022\031.calculator.PrimesRequest\032\032.calcula" +
      "tor.PrimesResponse0\001\0228\n\003avg\022\026.calculator" +
      ".AvgRequest\032\027.calculator.AvgResponse(\001\022:" +
      "\n\003max\022\026.calculator.MaxRequest\032\027.calculat" +
      "or.MaxResponse(\0010\001\0229\n\004sqrt\022\027.calculator." +
      "SqrtRequest\032\030.calculator.SqrtResponseB\030\n" +
      "\024com.proto.calculatorP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.proto.calculator.Sum.getDescriptor(),
          com.proto.calculator.Primes.getDescriptor(),
          com.proto.calculator.Avg.getDescriptor(),
          com.proto.calculator.Max.getDescriptor(),
          com.proto.calculator.Sqrt.getDescriptor(),
        });
    com.proto.calculator.Sum.getDescriptor();
    com.proto.calculator.Primes.getDescriptor();
    com.proto.calculator.Avg.getDescriptor();
    com.proto.calculator.Max.getDescriptor();
    com.proto.calculator.Sqrt.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
