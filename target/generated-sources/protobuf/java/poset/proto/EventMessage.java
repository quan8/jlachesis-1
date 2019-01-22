// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: poset/event.proto

package poset.proto;

/**
 * Protobuf type {@code poset.proto.EventMessage}
 */
public  final class EventMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:poset.proto.EventMessage)
    EventMessageOrBuilder {
  // Use EventMessage.newBuilder() to construct.
  private EventMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventMessage() {
    signature_ = "";
    flagTable_ = com.google.protobuf.ByteString.EMPTY;
    witnessProof_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    selfParentIndex_ = 0L;
    otherParentCreatorID_ = 0L;
    otherParentIndex_ = 0L;
    creatorID_ = 0L;
    topologicalIndex_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EventMessage(
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
          case 10: {
            poset.proto.EventBody.Builder subBuilder = null;
            if (body_ != null) {
              subBuilder = body_.toBuilder();
            }
            body_ = input.readMessage(poset.proto.EventBody.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(body_);
              body_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            signature_ = s;
            break;
          }
          case 26: {

            flagTable_ = input.readBytes();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              witnessProof_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            witnessProof_.add(s);
            break;
          }
          case 40: {

            selfParentIndex_ = input.readInt64();
            break;
          }
          case 48: {

            otherParentCreatorID_ = input.readInt64();
            break;
          }
          case 56: {

            otherParentIndex_ = input.readInt64();
            break;
          }
          case 64: {

            creatorID_ = input.readInt64();
            break;
          }
          case 72: {

            topologicalIndex_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        witnessProof_ = witnessProof_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return poset.proto.PEvent.internal_static_poset_proto_EventMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return poset.proto.PEvent.internal_static_poset_proto_EventMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            poset.proto.EventMessage.class, poset.proto.EventMessage.Builder.class);
  }

  private int bitField0_;
  public static final int BODY_FIELD_NUMBER = 1;
  private poset.proto.EventBody body_;
  /**
   * <code>.poset.proto.EventBody Body = 1;</code>
   */
  public boolean hasBody() {
    return body_ != null;
  }
  /**
   * <code>.poset.proto.EventBody Body = 1;</code>
   */
  public poset.proto.EventBody getBody() {
    return body_ == null ? poset.proto.EventBody.getDefaultInstance() : body_;
  }
  /**
   * <code>.poset.proto.EventBody Body = 1;</code>
   */
  public poset.proto.EventBodyOrBuilder getBodyOrBuilder() {
    return getBody();
  }

  public static final int SIGNATURE_FIELD_NUMBER = 2;
  private volatile java.lang.Object signature_;
  /**
   * <code>string Signature = 2;</code>
   */
  public java.lang.String getSignature() {
    java.lang.Object ref = signature_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signature_ = s;
      return s;
    }
  }
  /**
   * <code>string Signature = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSignatureBytes() {
    java.lang.Object ref = signature_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signature_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FLAGTABLE_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString flagTable_;
  /**
   * <code>bytes FlagTable = 3;</code>
   */
  public com.google.protobuf.ByteString getFlagTable() {
    return flagTable_;
  }

  public static final int WITNESSPROOF_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList witnessProof_;
  /**
   * <code>repeated string WitnessProof = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getWitnessProofList() {
    return witnessProof_;
  }
  /**
   * <code>repeated string WitnessProof = 4;</code>
   */
  public int getWitnessProofCount() {
    return witnessProof_.size();
  }
  /**
   * <code>repeated string WitnessProof = 4;</code>
   */
  public java.lang.String getWitnessProof(int index) {
    return witnessProof_.get(index);
  }
  /**
   * <code>repeated string WitnessProof = 4;</code>
   */
  public com.google.protobuf.ByteString
      getWitnessProofBytes(int index) {
    return witnessProof_.getByteString(index);
  }

  public static final int SELFPARENTINDEX_FIELD_NUMBER = 5;
  private long selfParentIndex_;
  /**
   * <code>int64 SelfParentIndex = 5;</code>
   */
  public long getSelfParentIndex() {
    return selfParentIndex_;
  }

  public static final int OTHERPARENTCREATORID_FIELD_NUMBER = 6;
  private long otherParentCreatorID_;
  /**
   * <code>int64 OtherParentCreatorID = 6;</code>
   */
  public long getOtherParentCreatorID() {
    return otherParentCreatorID_;
  }

  public static final int OTHERPARENTINDEX_FIELD_NUMBER = 7;
  private long otherParentIndex_;
  /**
   * <code>int64 OtherParentIndex = 7;</code>
   */
  public long getOtherParentIndex() {
    return otherParentIndex_;
  }

  public static final int CREATORID_FIELD_NUMBER = 8;
  private long creatorID_;
  /**
   * <code>int64 CreatorID = 8;</code>
   */
  public long getCreatorID() {
    return creatorID_;
  }

  public static final int TOPOLOGICALINDEX_FIELD_NUMBER = 9;
  private long topologicalIndex_;
  /**
   * <code>int64 TopologicalIndex = 9;</code>
   */
  public long getTopologicalIndex() {
    return topologicalIndex_;
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
    if (body_ != null) {
      output.writeMessage(1, getBody());
    }
    if (!getSignatureBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, signature_);
    }
    if (!flagTable_.isEmpty()) {
      output.writeBytes(3, flagTable_);
    }
    for (int i = 0; i < witnessProof_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, witnessProof_.getRaw(i));
    }
    if (selfParentIndex_ != 0L) {
      output.writeInt64(5, selfParentIndex_);
    }
    if (otherParentCreatorID_ != 0L) {
      output.writeInt64(6, otherParentCreatorID_);
    }
    if (otherParentIndex_ != 0L) {
      output.writeInt64(7, otherParentIndex_);
    }
    if (creatorID_ != 0L) {
      output.writeInt64(8, creatorID_);
    }
    if (topologicalIndex_ != 0L) {
      output.writeInt64(9, topologicalIndex_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (body_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBody());
    }
    if (!getSignatureBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, signature_);
    }
    if (!flagTable_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, flagTable_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < witnessProof_.size(); i++) {
        dataSize += computeStringSizeNoTag(witnessProof_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getWitnessProofList().size();
    }
    if (selfParentIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, selfParentIndex_);
    }
    if (otherParentCreatorID_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, otherParentCreatorID_);
    }
    if (otherParentIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, otherParentIndex_);
    }
    if (creatorID_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, creatorID_);
    }
    if (topologicalIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(9, topologicalIndex_);
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
    if (!(obj instanceof poset.proto.EventMessage)) {
      return super.equals(obj);
    }
    poset.proto.EventMessage other = (poset.proto.EventMessage) obj;

    boolean result = true;
    result = result && (hasBody() == other.hasBody());
    if (hasBody()) {
      result = result && getBody()
          .equals(other.getBody());
    }
    result = result && getSignature()
        .equals(other.getSignature());
    result = result && getFlagTable()
        .equals(other.getFlagTable());
    result = result && getWitnessProofList()
        .equals(other.getWitnessProofList());
    result = result && (getSelfParentIndex()
        == other.getSelfParentIndex());
    result = result && (getOtherParentCreatorID()
        == other.getOtherParentCreatorID());
    result = result && (getOtherParentIndex()
        == other.getOtherParentIndex());
    result = result && (getCreatorID()
        == other.getCreatorID());
    result = result && (getTopologicalIndex()
        == other.getTopologicalIndex());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBody()) {
      hash = (37 * hash) + BODY_FIELD_NUMBER;
      hash = (53 * hash) + getBody().hashCode();
    }
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (37 * hash) + FLAGTABLE_FIELD_NUMBER;
    hash = (53 * hash) + getFlagTable().hashCode();
    if (getWitnessProofCount() > 0) {
      hash = (37 * hash) + WITNESSPROOF_FIELD_NUMBER;
      hash = (53 * hash) + getWitnessProofList().hashCode();
    }
    hash = (37 * hash) + SELFPARENTINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSelfParentIndex());
    hash = (37 * hash) + OTHERPARENTCREATORID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOtherParentCreatorID());
    hash = (37 * hash) + OTHERPARENTINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOtherParentIndex());
    hash = (37 * hash) + CREATORID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreatorID());
    hash = (37 * hash) + TOPOLOGICALINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTopologicalIndex());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static poset.proto.EventMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static poset.proto.EventMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static poset.proto.EventMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static poset.proto.EventMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static poset.proto.EventMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static poset.proto.EventMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static poset.proto.EventMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static poset.proto.EventMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static poset.proto.EventMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static poset.proto.EventMessage parseFrom(
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
  public static Builder newBuilder(poset.proto.EventMessage prototype) {
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
   * Protobuf type {@code poset.proto.EventMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:poset.proto.EventMessage)
      poset.proto.EventMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return poset.proto.PEvent.internal_static_poset_proto_EventMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return poset.proto.PEvent.internal_static_poset_proto_EventMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              poset.proto.EventMessage.class, poset.proto.EventMessage.Builder.class);
    }

    // Construct using poset.proto.EventMessage.newBuilder()
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
      if (bodyBuilder_ == null) {
        body_ = null;
      } else {
        body_ = null;
        bodyBuilder_ = null;
      }
      signature_ = "";

      flagTable_ = com.google.protobuf.ByteString.EMPTY;

      witnessProof_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      selfParentIndex_ = 0L;

      otherParentCreatorID_ = 0L;

      otherParentIndex_ = 0L;

      creatorID_ = 0L;

      topologicalIndex_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return poset.proto.PEvent.internal_static_poset_proto_EventMessage_descriptor;
    }

    public poset.proto.EventMessage getDefaultInstanceForType() {
      return poset.proto.EventMessage.getDefaultInstance();
    }

    public poset.proto.EventMessage build() {
      poset.proto.EventMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public poset.proto.EventMessage buildPartial() {
      poset.proto.EventMessage result = new poset.proto.EventMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (bodyBuilder_ == null) {
        result.body_ = body_;
      } else {
        result.body_ = bodyBuilder_.build();
      }
      result.signature_ = signature_;
      result.flagTable_ = flagTable_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        witnessProof_ = witnessProof_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.witnessProof_ = witnessProof_;
      result.selfParentIndex_ = selfParentIndex_;
      result.otherParentCreatorID_ = otherParentCreatorID_;
      result.otherParentIndex_ = otherParentIndex_;
      result.creatorID_ = creatorID_;
      result.topologicalIndex_ = topologicalIndex_;
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
      if (other instanceof poset.proto.EventMessage) {
        return mergeFrom((poset.proto.EventMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(poset.proto.EventMessage other) {
      if (other == poset.proto.EventMessage.getDefaultInstance()) return this;
      if (other.hasBody()) {
        mergeBody(other.getBody());
      }
      if (!other.getSignature().isEmpty()) {
        signature_ = other.signature_;
        onChanged();
      }
      if (other.getFlagTable() != com.google.protobuf.ByteString.EMPTY) {
        setFlagTable(other.getFlagTable());
      }
      if (!other.witnessProof_.isEmpty()) {
        if (witnessProof_.isEmpty()) {
          witnessProof_ = other.witnessProof_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureWitnessProofIsMutable();
          witnessProof_.addAll(other.witnessProof_);
        }
        onChanged();
      }
      if (other.getSelfParentIndex() != 0L) {
        setSelfParentIndex(other.getSelfParentIndex());
      }
      if (other.getOtherParentCreatorID() != 0L) {
        setOtherParentCreatorID(other.getOtherParentCreatorID());
      }
      if (other.getOtherParentIndex() != 0L) {
        setOtherParentIndex(other.getOtherParentIndex());
      }
      if (other.getCreatorID() != 0L) {
        setCreatorID(other.getCreatorID());
      }
      if (other.getTopologicalIndex() != 0L) {
        setTopologicalIndex(other.getTopologicalIndex());
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
      poset.proto.EventMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (poset.proto.EventMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private poset.proto.EventBody body_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        poset.proto.EventBody, poset.proto.EventBody.Builder, poset.proto.EventBodyOrBuilder> bodyBuilder_;
    /**
     * <code>.poset.proto.EventBody Body = 1;</code>
     */
    public boolean hasBody() {
      return bodyBuilder_ != null || body_ != null;
    }
    /**
     * <code>.poset.proto.EventBody Body = 1;</code>
     */
    public poset.proto.EventBody getBody() {
      if (bodyBuilder_ == null) {
        return body_ == null ? poset.proto.EventBody.getDefaultInstance() : body_;
      } else {
        return bodyBuilder_.getMessage();
      }
    }
    /**
     * <code>.poset.proto.EventBody Body = 1;</code>
     */
    public Builder setBody(poset.proto.EventBody value) {
      if (bodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        body_ = value;
        onChanged();
      } else {
        bodyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.poset.proto.EventBody Body = 1;</code>
     */
    public Builder setBody(
        poset.proto.EventBody.Builder builderForValue) {
      if (bodyBuilder_ == null) {
        body_ = builderForValue.build();
        onChanged();
      } else {
        bodyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.poset.proto.EventBody Body = 1;</code>
     */
    public Builder mergeBody(poset.proto.EventBody value) {
      if (bodyBuilder_ == null) {
        if (body_ != null) {
          body_ =
            poset.proto.EventBody.newBuilder(body_).mergeFrom(value).buildPartial();
        } else {
          body_ = value;
        }
        onChanged();
      } else {
        bodyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.poset.proto.EventBody Body = 1;</code>
     */
    public Builder clearBody() {
      if (bodyBuilder_ == null) {
        body_ = null;
        onChanged();
      } else {
        body_ = null;
        bodyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.poset.proto.EventBody Body = 1;</code>
     */
    public poset.proto.EventBody.Builder getBodyBuilder() {
      
      onChanged();
      return getBodyFieldBuilder().getBuilder();
    }
    /**
     * <code>.poset.proto.EventBody Body = 1;</code>
     */
    public poset.proto.EventBodyOrBuilder getBodyOrBuilder() {
      if (bodyBuilder_ != null) {
        return bodyBuilder_.getMessageOrBuilder();
      } else {
        return body_ == null ?
            poset.proto.EventBody.getDefaultInstance() : body_;
      }
    }
    /**
     * <code>.poset.proto.EventBody Body = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        poset.proto.EventBody, poset.proto.EventBody.Builder, poset.proto.EventBodyOrBuilder> 
        getBodyFieldBuilder() {
      if (bodyBuilder_ == null) {
        bodyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            poset.proto.EventBody, poset.proto.EventBody.Builder, poset.proto.EventBodyOrBuilder>(
                getBody(),
                getParentForChildren(),
                isClean());
        body_ = null;
      }
      return bodyBuilder_;
    }

    private java.lang.Object signature_ = "";
    /**
     * <code>string Signature = 2;</code>
     */
    public java.lang.String getSignature() {
      java.lang.Object ref = signature_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signature_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Signature = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSignatureBytes() {
      java.lang.Object ref = signature_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signature_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Signature = 2;</code>
     */
    public Builder setSignature(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      signature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Signature = 2;</code>
     */
    public Builder clearSignature() {
      
      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
    }
    /**
     * <code>string Signature = 2;</code>
     */
    public Builder setSignatureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      signature_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString flagTable_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes FlagTable = 3;</code>
     */
    public com.google.protobuf.ByteString getFlagTable() {
      return flagTable_;
    }
    /**
     * <code>bytes FlagTable = 3;</code>
     */
    public Builder setFlagTable(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      flagTable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes FlagTable = 3;</code>
     */
    public Builder clearFlagTable() {
      
      flagTable_ = getDefaultInstance().getFlagTable();
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList witnessProof_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureWitnessProofIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        witnessProof_ = new com.google.protobuf.LazyStringArrayList(witnessProof_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated string WitnessProof = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getWitnessProofList() {
      return witnessProof_.getUnmodifiableView();
    }
    /**
     * <code>repeated string WitnessProof = 4;</code>
     */
    public int getWitnessProofCount() {
      return witnessProof_.size();
    }
    /**
     * <code>repeated string WitnessProof = 4;</code>
     */
    public java.lang.String getWitnessProof(int index) {
      return witnessProof_.get(index);
    }
    /**
     * <code>repeated string WitnessProof = 4;</code>
     */
    public com.google.protobuf.ByteString
        getWitnessProofBytes(int index) {
      return witnessProof_.getByteString(index);
    }
    /**
     * <code>repeated string WitnessProof = 4;</code>
     */
    public Builder setWitnessProof(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureWitnessProofIsMutable();
      witnessProof_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string WitnessProof = 4;</code>
     */
    public Builder addWitnessProof(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureWitnessProofIsMutable();
      witnessProof_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string WitnessProof = 4;</code>
     */
    public Builder addAllWitnessProof(
        java.lang.Iterable<java.lang.String> values) {
      ensureWitnessProofIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, witnessProof_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string WitnessProof = 4;</code>
     */
    public Builder clearWitnessProof() {
      witnessProof_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string WitnessProof = 4;</code>
     */
    public Builder addWitnessProofBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureWitnessProofIsMutable();
      witnessProof_.add(value);
      onChanged();
      return this;
    }

    private long selfParentIndex_ ;
    /**
     * <code>int64 SelfParentIndex = 5;</code>
     */
    public long getSelfParentIndex() {
      return selfParentIndex_;
    }
    /**
     * <code>int64 SelfParentIndex = 5;</code>
     */
    public Builder setSelfParentIndex(long value) {
      
      selfParentIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 SelfParentIndex = 5;</code>
     */
    public Builder clearSelfParentIndex() {
      
      selfParentIndex_ = 0L;
      onChanged();
      return this;
    }

    private long otherParentCreatorID_ ;
    /**
     * <code>int64 OtherParentCreatorID = 6;</code>
     */
    public long getOtherParentCreatorID() {
      return otherParentCreatorID_;
    }
    /**
     * <code>int64 OtherParentCreatorID = 6;</code>
     */
    public Builder setOtherParentCreatorID(long value) {
      
      otherParentCreatorID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 OtherParentCreatorID = 6;</code>
     */
    public Builder clearOtherParentCreatorID() {
      
      otherParentCreatorID_ = 0L;
      onChanged();
      return this;
    }

    private long otherParentIndex_ ;
    /**
     * <code>int64 OtherParentIndex = 7;</code>
     */
    public long getOtherParentIndex() {
      return otherParentIndex_;
    }
    /**
     * <code>int64 OtherParentIndex = 7;</code>
     */
    public Builder setOtherParentIndex(long value) {
      
      otherParentIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 OtherParentIndex = 7;</code>
     */
    public Builder clearOtherParentIndex() {
      
      otherParentIndex_ = 0L;
      onChanged();
      return this;
    }

    private long creatorID_ ;
    /**
     * <code>int64 CreatorID = 8;</code>
     */
    public long getCreatorID() {
      return creatorID_;
    }
    /**
     * <code>int64 CreatorID = 8;</code>
     */
    public Builder setCreatorID(long value) {
      
      creatorID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 CreatorID = 8;</code>
     */
    public Builder clearCreatorID() {
      
      creatorID_ = 0L;
      onChanged();
      return this;
    }

    private long topologicalIndex_ ;
    /**
     * <code>int64 TopologicalIndex = 9;</code>
     */
    public long getTopologicalIndex() {
      return topologicalIndex_;
    }
    /**
     * <code>int64 TopologicalIndex = 9;</code>
     */
    public Builder setTopologicalIndex(long value) {
      
      topologicalIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 TopologicalIndex = 9;</code>
     */
    public Builder clearTopologicalIndex() {
      
      topologicalIndex_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:poset.proto.EventMessage)
  }

  // @@protoc_insertion_point(class_scope:poset.proto.EventMessage)
  private static final poset.proto.EventMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new poset.proto.EventMessage();
  }

  public static poset.proto.EventMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventMessage>
      PARSER = new com.google.protobuf.AbstractParser<EventMessage>() {
    public EventMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EventMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EventMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventMessage> getParserForType() {
    return PARSER;
  }

  public poset.proto.EventMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

