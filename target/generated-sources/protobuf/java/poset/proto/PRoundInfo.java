// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: poset/roundInfo.proto

package poset.proto;

public final class PRoundInfo {
  private PRoundInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poset_proto_RoundEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poset_proto_RoundEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poset_proto_RoundInfoMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poset_proto_RoundInfoMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poset_proto_RoundInfoMessage_EventsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poset_proto_RoundInfoMessage_EventsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025poset/roundInfo.proto\022\013poset.proto\"V\n\n" +
      "RoundEvent\022\021\n\tConsensus\030\001 \001(\010\022\017\n\007Witness" +
      "\030\002 \001(\010\022$\n\006Famous\030\003 \001(\0162\024.poset.proto.Tri" +
      "lean\"\225\001\n\020RoundInfoMessage\0229\n\006Events\030\001 \003(" +
      "\0132).poset.proto.RoundInfoMessage.EventsE" +
      "ntry\032F\n\013EventsEntry\022\013\n\003key\030\001 \001(\t\022&\n\005valu" +
      "e\030\002 \001(\0132\027.poset.proto.RoundEvent:\0028\001*-\n\007" +
      "Trilean\022\r\n\tUNDEFINED\020\000\022\010\n\004TRUE\020\001\022\t\n\005FALS" +
      "E\020\002B\016B\nPRoundInfoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_poset_proto_RoundEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_poset_proto_RoundEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poset_proto_RoundEvent_descriptor,
        new java.lang.String[] { "Consensus", "Witness", "Famous", });
    internal_static_poset_proto_RoundInfoMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_poset_proto_RoundInfoMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poset_proto_RoundInfoMessage_descriptor,
        new java.lang.String[] { "Events", });
    internal_static_poset_proto_RoundInfoMessage_EventsEntry_descriptor =
      internal_static_poset_proto_RoundInfoMessage_descriptor.getNestedTypes().get(0);
    internal_static_poset_proto_RoundInfoMessage_EventsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poset_proto_RoundInfoMessage_EventsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}