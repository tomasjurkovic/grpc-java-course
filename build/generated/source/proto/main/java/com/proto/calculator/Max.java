// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/max.proto

package com.proto.calculator;

public final class Max {
  private Max() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_MaxRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_MaxRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_MaxResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_MaxResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024calculator/max.proto\022\ncalculator\"\034\n\nMa" +
      "xRequest\022\016\n\006number\030\001 \001(\005\"\032\n\013MaxResponse\022" +
      "\013\n\003max\030\001 \001(\005B\030\n\024com.proto.calculatorP\001b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_calculator_MaxRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_calculator_MaxRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_MaxRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_MaxResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_calculator_MaxResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_MaxResponse_descriptor,
        new java.lang.String[] { "Max", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
