// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: poset/frame.proto

package poset.proto;

public final class PFrame {
  private PFrame() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poset_proto_Frame_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poset_proto_Frame_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021poset/frame.proto\022\013poset.proto\032\020poset/" +
      "root.proto\032\021poset/event.proto\"c\n\005Frame\022\r" +
      "\n\005Round\030\001 \001(\003\022 \n\005Roots\030\002 \003(\0132\021.poset.pro" +
      "to.Root\022)\n\006Events\030\003 \003(\0132\031.poset.proto.Ev" +
      "entMessageB\nB\006PFrameP\001b\006proto3"
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
          poset.proto.PRoot.getDescriptor(),
          poset.proto.PEvent.getDescriptor(),
        }, assigner);
    internal_static_poset_proto_Frame_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_poset_proto_Frame_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poset_proto_Frame_descriptor,
        new java.lang.String[] { "Round", "Roots", "Events", });
    poset.proto.PRoot.getDescriptor();
    poset.proto.PEvent.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
