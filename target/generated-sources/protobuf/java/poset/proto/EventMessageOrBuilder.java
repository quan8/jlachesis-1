// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: poset/event.proto

package poset.proto;

public interface EventMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:poset.proto.EventMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.poset.proto.EventBody Body = 1;</code>
   */
  boolean hasBody();
  /**
   * <code>.poset.proto.EventBody Body = 1;</code>
   */
  poset.proto.EventBody getBody();
  /**
   * <code>.poset.proto.EventBody Body = 1;</code>
   */
  poset.proto.EventBodyOrBuilder getBodyOrBuilder();

  /**
   * <code>string Signature = 2;</code>
   */
  java.lang.String getSignature();
  /**
   * <code>string Signature = 2;</code>
   */
  com.google.protobuf.ByteString
      getSignatureBytes();

  /**
   * <code>bytes FlagTable = 3;</code>
   */
  com.google.protobuf.ByteString getFlagTable();

  /**
   * <code>repeated string WitnessProof = 4;</code>
   */
  java.util.List<java.lang.String>
      getWitnessProofList();
  /**
   * <code>repeated string WitnessProof = 4;</code>
   */
  int getWitnessProofCount();
  /**
   * <code>repeated string WitnessProof = 4;</code>
   */
  java.lang.String getWitnessProof(int index);
  /**
   * <code>repeated string WitnessProof = 4;</code>
   */
  com.google.protobuf.ByteString
      getWitnessProofBytes(int index);

  /**
   * <code>int64 SelfParentIndex = 5;</code>
   */
  long getSelfParentIndex();

  /**
   * <code>int64 OtherParentCreatorID = 6;</code>
   */
  long getOtherParentCreatorID();

  /**
   * <code>int64 OtherParentIndex = 7;</code>
   */
  long getOtherParentIndex();

  /**
   * <code>int64 CreatorID = 8;</code>
   */
  long getCreatorID();

  /**
   * <code>int64 TopologicalIndex = 9;</code>
   */
  long getTopologicalIndex();
}
