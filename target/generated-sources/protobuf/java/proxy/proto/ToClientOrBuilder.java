// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy/grpc.proto

package proxy.proto;

public interface ToClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proxy.proto.ToClient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.proxy.proto.ToClient.Block block = 1;</code>
   */
  proxy.proto.ToClient.Block getBlock();
  /**
   * <code>.proxy.proto.ToClient.Block block = 1;</code>
   */
  proxy.proto.ToClient.BlockOrBuilder getBlockOrBuilder();

  /**
   * <code>.proxy.proto.ToClient.Query query = 2;</code>
   */
  proxy.proto.ToClient.Query getQuery();
  /**
   * <code>.proxy.proto.ToClient.Query query = 2;</code>
   */
  proxy.proto.ToClient.QueryOrBuilder getQueryOrBuilder();

  /**
   * <code>.proxy.proto.ToClient.Restore restore = 3;</code>
   */
  proxy.proto.ToClient.Restore getRestore();
  /**
   * <code>.proxy.proto.ToClient.Restore restore = 3;</code>
   */
  proxy.proto.ToClient.RestoreOrBuilder getRestoreOrBuilder();

  public proxy.proto.ToClient.EventCase getEventCase();
}
