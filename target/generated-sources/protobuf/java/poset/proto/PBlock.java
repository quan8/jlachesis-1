// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: poset/block.proto

package poset.proto;

public final class PBlock {
  private PBlock() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poset_proto_BlockBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poset_proto_BlockBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poset_proto_WireBlockSignature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poset_proto_WireBlockSignature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poset_proto_Block_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poset_proto_Block_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poset_proto_Block_SignaturesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poset_proto_Block_SignaturesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021poset/block.proto\022\013poset.proto\"G\n\tBloc" +
      "kBody\022\r\n\005Index\030\001 \001(\003\022\025\n\rRoundReceived\030\002 " +
      "\001(\003\022\024\n\014Transactions\030\005 \003(\014\"6\n\022WireBlockSi" +
      "gnature\022\r\n\005Index\030\001 \001(\003\022\021\n\tSignature\030\002 \001(" +
      "\t\"\331\001\n\005Block\022$\n\004Body\030\001 \001(\0132\026.poset.proto." +
      "BlockBody\0226\n\nSignatures\030\002 \003(\0132\".poset.pr" +
      "oto.Block.SignaturesEntry\022\014\n\004hash\030\003 \001(\014\022" +
      "\013\n\003hex\030\004 \001(\t\022\021\n\tStateHash\030\005 \001(\014\022\021\n\tFrame" +
      "Hash\030\006 \001(\014\0321\n\017SignaturesEntry\022\013\n\003key\030\001 \001" +
      "(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\nB\006PBlockP\001b\006proto",
      "3"
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
    internal_static_poset_proto_BlockBody_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_poset_proto_BlockBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poset_proto_BlockBody_descriptor,
        new java.lang.String[] { "Index", "RoundReceived", "Transactions", });
    internal_static_poset_proto_WireBlockSignature_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_poset_proto_WireBlockSignature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poset_proto_WireBlockSignature_descriptor,
        new java.lang.String[] { "Index", "Signature", });
    internal_static_poset_proto_Block_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_poset_proto_Block_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poset_proto_Block_descriptor,
        new java.lang.String[] { "Body", "Signatures", "Hash", "Hex", "StateHash", "FrameHash", });
    internal_static_poset_proto_Block_SignaturesEntry_descriptor =
      internal_static_poset_proto_Block_descriptor.getNestedTypes().get(0);
    internal_static_poset_proto_Block_SignaturesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poset_proto_Block_SignaturesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
