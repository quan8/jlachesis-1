// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: poset/block.proto

package poset.proto;

/**
 * Protobuf type {@code poset.proto.BlockBody}
 */
public  final class BlockBody extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:poset.proto.BlockBody)
    BlockBodyOrBuilder {
  // Use BlockBody.newBuilder() to construct.
  private BlockBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockBody() {
    index_ = 0L;
    roundReceived_ = 0L;
    transactions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BlockBody(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            index_ = input.readInt64();
            break;
          }
          case 16: {

            roundReceived_ = input.readInt64();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              transactions_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000004;
            }
            transactions_.add(input.readBytes());
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        transactions_ = java.util.Collections.unmodifiableList(transactions_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return poset.proto.PBlock.internal_static_poset_proto_BlockBody_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return poset.proto.PBlock.internal_static_poset_proto_BlockBody_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            poset.proto.BlockBody.class, poset.proto.BlockBody.Builder.class);
  }

  private int bitField0_;
  public static final int INDEX_FIELD_NUMBER = 1;
  private long index_;
  /**
   * <code>int64 Index = 1;</code>
   */
  public long getIndex() {
    return index_;
  }

  public static final int ROUNDRECEIVED_FIELD_NUMBER = 2;
  private long roundReceived_;
  /**
   * <code>int64 RoundReceived = 2;</code>
   */
  public long getRoundReceived() {
    return roundReceived_;
  }

  public static final int TRANSACTIONS_FIELD_NUMBER = 5;
  private java.util.List<com.google.protobuf.ByteString> transactions_;
  /**
   * <code>repeated bytes Transactions = 5;</code>
   */
  public java.util.List<com.google.protobuf.ByteString>
      getTransactionsList() {
    return transactions_;
  }
  /**
   * <code>repeated bytes Transactions = 5;</code>
   */
  public int getTransactionsCount() {
    return transactions_.size();
  }
  /**
   * <code>repeated bytes Transactions = 5;</code>
   */
  public com.google.protobuf.ByteString getTransactions(int index) {
    return transactions_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (index_ != 0L) {
      output.writeInt64(1, index_);
    }
    if (roundReceived_ != 0L) {
      output.writeInt64(2, roundReceived_);
    }
    for (int i = 0; i < transactions_.size(); i++) {
      output.writeBytes(5, transactions_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (index_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, index_);
    }
    if (roundReceived_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, roundReceived_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < transactions_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(transactions_.get(i));
      }
      size += dataSize;
      size += 1 * getTransactionsList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof poset.proto.BlockBody)) {
      return super.equals(obj);
    }
    poset.proto.BlockBody other = (poset.proto.BlockBody) obj;

    boolean result = true;
    result = result && (getIndex()
        == other.getIndex());
    result = result && (getRoundReceived()
        == other.getRoundReceived());
    result = result && getTransactionsList()
        .equals(other.getTransactionsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIndex());
    hash = (37 * hash) + ROUNDRECEIVED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRoundReceived());
    if (getTransactionsCount() > 0) {
      hash = (37 * hash) + TRANSACTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getTransactionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static poset.proto.BlockBody parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static poset.proto.BlockBody parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static poset.proto.BlockBody parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static poset.proto.BlockBody parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static poset.proto.BlockBody parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static poset.proto.BlockBody parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static poset.proto.BlockBody parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static poset.proto.BlockBody parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static poset.proto.BlockBody parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static poset.proto.BlockBody parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(poset.proto.BlockBody prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code poset.proto.BlockBody}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:poset.proto.BlockBody)
      poset.proto.BlockBodyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return poset.proto.PBlock.internal_static_poset_proto_BlockBody_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return poset.proto.PBlock.internal_static_poset_proto_BlockBody_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              poset.proto.BlockBody.class, poset.proto.BlockBody.Builder.class);
    }

    // Construct using poset.proto.BlockBody.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      index_ = 0L;

      roundReceived_ = 0L;

      transactions_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return poset.proto.PBlock.internal_static_poset_proto_BlockBody_descriptor;
    }

    public poset.proto.BlockBody getDefaultInstanceForType() {
      return poset.proto.BlockBody.getDefaultInstance();
    }

    public poset.proto.BlockBody build() {
      poset.proto.BlockBody result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public poset.proto.BlockBody buildPartial() {
      poset.proto.BlockBody result = new poset.proto.BlockBody(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.index_ = index_;
      result.roundReceived_ = roundReceived_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        transactions_ = java.util.Collections.unmodifiableList(transactions_);
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.transactions_ = transactions_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof poset.proto.BlockBody) {
        return mergeFrom((poset.proto.BlockBody)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(poset.proto.BlockBody other) {
      if (other == poset.proto.BlockBody.getDefaultInstance()) return this;
      if (other.getIndex() != 0L) {
        setIndex(other.getIndex());
      }
      if (other.getRoundReceived() != 0L) {
        setRoundReceived(other.getRoundReceived());
      }
      if (!other.transactions_.isEmpty()) {
        if (transactions_.isEmpty()) {
          transactions_ = other.transactions_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureTransactionsIsMutable();
          transactions_.addAll(other.transactions_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      poset.proto.BlockBody parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (poset.proto.BlockBody) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long index_ ;
    /**
     * <code>int64 Index = 1;</code>
     */
    public long getIndex() {
      return index_;
    }
    /**
     * <code>int64 Index = 1;</code>
     */
    public Builder setIndex(long value) {
      
      index_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 Index = 1;</code>
     */
    public Builder clearIndex() {
      
      index_ = 0L;
      onChanged();
      return this;
    }

    private long roundReceived_ ;
    /**
     * <code>int64 RoundReceived = 2;</code>
     */
    public long getRoundReceived() {
      return roundReceived_;
    }
    /**
     * <code>int64 RoundReceived = 2;</code>
     */
    public Builder setRoundReceived(long value) {
      
      roundReceived_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 RoundReceived = 2;</code>
     */
    public Builder clearRoundReceived() {
      
      roundReceived_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.ByteString> transactions_ = java.util.Collections.emptyList();
    private void ensureTransactionsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        transactions_ = new java.util.ArrayList<com.google.protobuf.ByteString>(transactions_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated bytes Transactions = 5;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getTransactionsList() {
      return java.util.Collections.unmodifiableList(transactions_);
    }
    /**
     * <code>repeated bytes Transactions = 5;</code>
     */
    public int getTransactionsCount() {
      return transactions_.size();
    }
    /**
     * <code>repeated bytes Transactions = 5;</code>
     */
    public com.google.protobuf.ByteString getTransactions(int index) {
      return transactions_.get(index);
    }
    /**
     * <code>repeated bytes Transactions = 5;</code>
     */
    public Builder setTransactions(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTransactionsIsMutable();
      transactions_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes Transactions = 5;</code>
     */
    public Builder addTransactions(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTransactionsIsMutable();
      transactions_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes Transactions = 5;</code>
     */
    public Builder addAllTransactions(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureTransactionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, transactions_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes Transactions = 5;</code>
     */
    public Builder clearTransactions() {
      transactions_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:poset.proto.BlockBody)
  }

  // @@protoc_insertion_point(class_scope:poset.proto.BlockBody)
  private static final poset.proto.BlockBody DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new poset.proto.BlockBody();
  }

  public static poset.proto.BlockBody getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockBody>
      PARSER = new com.google.protobuf.AbstractParser<BlockBody>() {
    public BlockBody parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlockBody(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlockBody> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockBody> getParserForType() {
    return PARSER;
  }

  public poset.proto.BlockBody getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

