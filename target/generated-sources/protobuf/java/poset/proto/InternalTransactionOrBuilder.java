// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: poset/event.proto

package poset.proto;

public interface InternalTransactionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:poset.proto.InternalTransaction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.poset.proto.TransactionType Type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>.poset.proto.TransactionType Type = 1;</code>
   */
  poset.proto.TransactionType getType();

  /**
   * <code>.peers.proto.Peer peer = 2;</code>
   */
  boolean hasPeer();
  /**
   * <code>.peers.proto.Peer peer = 2;</code>
   */
  peers.proto.Peer getPeer();
  /**
   * <code>.peers.proto.Peer peer = 2;</code>
   */
  peers.proto.PeerOrBuilder getPeerOrBuilder();
}