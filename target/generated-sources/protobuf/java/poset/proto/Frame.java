// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: poset/frame.proto

package poset.proto;

/**
 * Protobuf type {@code poset.proto.Frame}
 */
public  final class Frame extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:poset.proto.Frame)
    FrameOrBuilder {
  // Use Frame.newBuilder() to construct.
  private Frame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Frame() {
    round_ = 0L;
    roots_ = java.util.Collections.emptyList();
    events_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Frame(
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

            round_ = input.readInt64();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              roots_ = new java.util.ArrayList<poset.proto.Root>();
              mutable_bitField0_ |= 0x00000002;
            }
            roots_.add(
                input.readMessage(poset.proto.Root.parser(), extensionRegistry));
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              events_ = new java.util.ArrayList<poset.proto.EventMessage>();
              mutable_bitField0_ |= 0x00000004;
            }
            events_.add(
                input.readMessage(poset.proto.EventMessage.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        roots_ = java.util.Collections.unmodifiableList(roots_);
      }
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        events_ = java.util.Collections.unmodifiableList(events_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return poset.proto.PFrame.internal_static_poset_proto_Frame_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return poset.proto.PFrame.internal_static_poset_proto_Frame_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            poset.proto.Frame.class, poset.proto.Frame.Builder.class);
  }

  private int bitField0_;
  public static final int ROUND_FIELD_NUMBER = 1;
  private long round_;
  /**
   * <code>int64 Round = 1;</code>
   */
  public long getRound() {
    return round_;
  }

  public static final int ROOTS_FIELD_NUMBER = 2;
  private java.util.List<poset.proto.Root> roots_;
  /**
   * <code>repeated .poset.proto.Root Roots = 2;</code>
   */
  public java.util.List<poset.proto.Root> getRootsList() {
    return roots_;
  }
  /**
   * <code>repeated .poset.proto.Root Roots = 2;</code>
   */
  public java.util.List<? extends poset.proto.RootOrBuilder> 
      getRootsOrBuilderList() {
    return roots_;
  }
  /**
   * <code>repeated .poset.proto.Root Roots = 2;</code>
   */
  public int getRootsCount() {
    return roots_.size();
  }
  /**
   * <code>repeated .poset.proto.Root Roots = 2;</code>
   */
  public poset.proto.Root getRoots(int index) {
    return roots_.get(index);
  }
  /**
   * <code>repeated .poset.proto.Root Roots = 2;</code>
   */
  public poset.proto.RootOrBuilder getRootsOrBuilder(
      int index) {
    return roots_.get(index);
  }

  public static final int EVENTS_FIELD_NUMBER = 3;
  private java.util.List<poset.proto.EventMessage> events_;
  /**
   * <code>repeated .poset.proto.EventMessage Events = 3;</code>
   */
  public java.util.List<poset.proto.EventMessage> getEventsList() {
    return events_;
  }
  /**
   * <code>repeated .poset.proto.EventMessage Events = 3;</code>
   */
  public java.util.List<? extends poset.proto.EventMessageOrBuilder> 
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <code>repeated .poset.proto.EventMessage Events = 3;</code>
   */
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <code>repeated .poset.proto.EventMessage Events = 3;</code>
   */
  public poset.proto.EventMessage getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <code>repeated .poset.proto.EventMessage Events = 3;</code>
   */
  public poset.proto.EventMessageOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
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
    if (round_ != 0L) {
      output.writeInt64(1, round_);
    }
    for (int i = 0; i < roots_.size(); i++) {
      output.writeMessage(2, roots_.get(i));
    }
    for (int i = 0; i < events_.size(); i++) {
      output.writeMessage(3, events_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (round_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, round_);
    }
    for (int i = 0; i < roots_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, roots_.get(i));
    }
    for (int i = 0; i < events_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, events_.get(i));
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
    if (!(obj instanceof poset.proto.Frame)) {
      return super.equals(obj);
    }
    poset.proto.Frame other = (poset.proto.Frame) obj;

    boolean result = true;
    result = result && (getRound()
        == other.getRound());
    result = result && getRootsList()
        .equals(other.getRootsList());
    result = result && getEventsList()
        .equals(other.getEventsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ROUND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRound());
    if (getRootsCount() > 0) {
      hash = (37 * hash) + ROOTS_FIELD_NUMBER;
      hash = (53 * hash) + getRootsList().hashCode();
    }
    if (getEventsCount() > 0) {
      hash = (37 * hash) + EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static poset.proto.Frame parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static poset.proto.Frame parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static poset.proto.Frame parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static poset.proto.Frame parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static poset.proto.Frame parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static poset.proto.Frame parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static poset.proto.Frame parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static poset.proto.Frame parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static poset.proto.Frame parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static poset.proto.Frame parseFrom(
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
  public static Builder newBuilder(poset.proto.Frame prototype) {
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
   * Protobuf type {@code poset.proto.Frame}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:poset.proto.Frame)
      poset.proto.FrameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return poset.proto.PFrame.internal_static_poset_proto_Frame_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return poset.proto.PFrame.internal_static_poset_proto_Frame_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              poset.proto.Frame.class, poset.proto.Frame.Builder.class);
    }

    // Construct using poset.proto.Frame.newBuilder()
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
        getRootsFieldBuilder();
        getEventsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      round_ = 0L;

      if (rootsBuilder_ == null) {
        roots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        rootsBuilder_.clear();
      }
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return poset.proto.PFrame.internal_static_poset_proto_Frame_descriptor;
    }

    public poset.proto.Frame getDefaultInstanceForType() {
      return poset.proto.Frame.getDefaultInstance();
    }

    public poset.proto.Frame build() {
      poset.proto.Frame result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public poset.proto.Frame buildPartial() {
      poset.proto.Frame result = new poset.proto.Frame(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.round_ = round_;
      if (rootsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          roots_ = java.util.Collections.unmodifiableList(roots_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.roots_ = roots_;
      } else {
        result.roots_ = rootsBuilder_.build();
      }
      if (eventsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          events_ = java.util.Collections.unmodifiableList(events_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.events_ = events_;
      } else {
        result.events_ = eventsBuilder_.build();
      }
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
      if (other instanceof poset.proto.Frame) {
        return mergeFrom((poset.proto.Frame)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(poset.proto.Frame other) {
      if (other == poset.proto.Frame.getDefaultInstance()) return this;
      if (other.getRound() != 0L) {
        setRound(other.getRound());
      }
      if (rootsBuilder_ == null) {
        if (!other.roots_.isEmpty()) {
          if (roots_.isEmpty()) {
            roots_ = other.roots_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRootsIsMutable();
            roots_.addAll(other.roots_);
          }
          onChanged();
        }
      } else {
        if (!other.roots_.isEmpty()) {
          if (rootsBuilder_.isEmpty()) {
            rootsBuilder_.dispose();
            rootsBuilder_ = null;
            roots_ = other.roots_;
            bitField0_ = (bitField0_ & ~0x00000002);
            rootsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRootsFieldBuilder() : null;
          } else {
            rootsBuilder_.addAllMessages(other.roots_);
          }
        }
      }
      if (eventsBuilder_ == null) {
        if (!other.events_.isEmpty()) {
          if (events_.isEmpty()) {
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureEventsIsMutable();
            events_.addAll(other.events_);
          }
          onChanged();
        }
      } else {
        if (!other.events_.isEmpty()) {
          if (eventsBuilder_.isEmpty()) {
            eventsBuilder_.dispose();
            eventsBuilder_ = null;
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000004);
            eventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEventsFieldBuilder() : null;
          } else {
            eventsBuilder_.addAllMessages(other.events_);
          }
        }
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
      poset.proto.Frame parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (poset.proto.Frame) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long round_ ;
    /**
     * <code>int64 Round = 1;</code>
     */
    public long getRound() {
      return round_;
    }
    /**
     * <code>int64 Round = 1;</code>
     */
    public Builder setRound(long value) {
      
      round_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 Round = 1;</code>
     */
    public Builder clearRound() {
      
      round_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<poset.proto.Root> roots_ =
      java.util.Collections.emptyList();
    private void ensureRootsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        roots_ = new java.util.ArrayList<poset.proto.Root>(roots_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        poset.proto.Root, poset.proto.Root.Builder, poset.proto.RootOrBuilder> rootsBuilder_;

    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public java.util.List<poset.proto.Root> getRootsList() {
      if (rootsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(roots_);
      } else {
        return rootsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public int getRootsCount() {
      if (rootsBuilder_ == null) {
        return roots_.size();
      } else {
        return rootsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public poset.proto.Root getRoots(int index) {
      if (rootsBuilder_ == null) {
        return roots_.get(index);
      } else {
        return rootsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public Builder setRoots(
        int index, poset.proto.Root value) {
      if (rootsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRootsIsMutable();
        roots_.set(index, value);
        onChanged();
      } else {
        rootsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public Builder setRoots(
        int index, poset.proto.Root.Builder builderForValue) {
      if (rootsBuilder_ == null) {
        ensureRootsIsMutable();
        roots_.set(index, builderForValue.build());
        onChanged();
      } else {
        rootsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public Builder addRoots(poset.proto.Root value) {
      if (rootsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRootsIsMutable();
        roots_.add(value);
        onChanged();
      } else {
        rootsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public Builder addRoots(
        int index, poset.proto.Root value) {
      if (rootsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRootsIsMutable();
        roots_.add(index, value);
        onChanged();
      } else {
        rootsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public Builder addRoots(
        poset.proto.Root.Builder builderForValue) {
      if (rootsBuilder_ == null) {
        ensureRootsIsMutable();
        roots_.add(builderForValue.build());
        onChanged();
      } else {
        rootsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public Builder addRoots(
        int index, poset.proto.Root.Builder builderForValue) {
      if (rootsBuilder_ == null) {
        ensureRootsIsMutable();
        roots_.add(index, builderForValue.build());
        onChanged();
      } else {
        rootsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public Builder addAllRoots(
        java.lang.Iterable<? extends poset.proto.Root> values) {
      if (rootsBuilder_ == null) {
        ensureRootsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, roots_);
        onChanged();
      } else {
        rootsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public Builder clearRoots() {
      if (rootsBuilder_ == null) {
        roots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        rootsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public Builder removeRoots(int index) {
      if (rootsBuilder_ == null) {
        ensureRootsIsMutable();
        roots_.remove(index);
        onChanged();
      } else {
        rootsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public poset.proto.Root.Builder getRootsBuilder(
        int index) {
      return getRootsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public poset.proto.RootOrBuilder getRootsOrBuilder(
        int index) {
      if (rootsBuilder_ == null) {
        return roots_.get(index);  } else {
        return rootsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public java.util.List<? extends poset.proto.RootOrBuilder> 
         getRootsOrBuilderList() {
      if (rootsBuilder_ != null) {
        return rootsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(roots_);
      }
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public poset.proto.Root.Builder addRootsBuilder() {
      return getRootsFieldBuilder().addBuilder(
          poset.proto.Root.getDefaultInstance());
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public poset.proto.Root.Builder addRootsBuilder(
        int index) {
      return getRootsFieldBuilder().addBuilder(
          index, poset.proto.Root.getDefaultInstance());
    }
    /**
     * <code>repeated .poset.proto.Root Roots = 2;</code>
     */
    public java.util.List<poset.proto.Root.Builder> 
         getRootsBuilderList() {
      return getRootsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        poset.proto.Root, poset.proto.Root.Builder, poset.proto.RootOrBuilder> 
        getRootsFieldBuilder() {
      if (rootsBuilder_ == null) {
        rootsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            poset.proto.Root, poset.proto.Root.Builder, poset.proto.RootOrBuilder>(
                roots_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        roots_ = null;
      }
      return rootsBuilder_;
    }

    private java.util.List<poset.proto.EventMessage> events_ =
      java.util.Collections.emptyList();
    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        events_ = new java.util.ArrayList<poset.proto.EventMessage>(events_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        poset.proto.EventMessage, poset.proto.EventMessage.Builder, poset.proto.EventMessageOrBuilder> eventsBuilder_;

    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public java.util.List<poset.proto.EventMessage> getEventsList() {
      if (eventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(events_);
      } else {
        return eventsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public int getEventsCount() {
      if (eventsBuilder_ == null) {
        return events_.size();
      } else {
        return eventsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public poset.proto.EventMessage getEvents(int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);
      } else {
        return eventsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public Builder setEvents(
        int index, poset.proto.EventMessage value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.set(index, value);
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public Builder setEvents(
        int index, poset.proto.EventMessage.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public Builder addEvents(poset.proto.EventMessage value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public Builder addEvents(
        int index, poset.proto.EventMessage value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(index, value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public Builder addEvents(
        poset.proto.EventMessage.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public Builder addEvents(
        int index, poset.proto.EventMessage.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public Builder addAllEvents(
        java.lang.Iterable<? extends poset.proto.EventMessage> values) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, events_);
        onChanged();
      } else {
        eventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public Builder clearEvents() {
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public Builder removeEvents(int index) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.remove(index);
        onChanged();
      } else {
        eventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public poset.proto.EventMessage.Builder getEventsBuilder(
        int index) {
      return getEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public poset.proto.EventMessageOrBuilder getEventsOrBuilder(
        int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);  } else {
        return eventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public java.util.List<? extends poset.proto.EventMessageOrBuilder> 
         getEventsOrBuilderList() {
      if (eventsBuilder_ != null) {
        return eventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(events_);
      }
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public poset.proto.EventMessage.Builder addEventsBuilder() {
      return getEventsFieldBuilder().addBuilder(
          poset.proto.EventMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public poset.proto.EventMessage.Builder addEventsBuilder(
        int index) {
      return getEventsFieldBuilder().addBuilder(
          index, poset.proto.EventMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .poset.proto.EventMessage Events = 3;</code>
     */
    public java.util.List<poset.proto.EventMessage.Builder> 
         getEventsBuilderList() {
      return getEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        poset.proto.EventMessage, poset.proto.EventMessage.Builder, poset.proto.EventMessageOrBuilder> 
        getEventsFieldBuilder() {
      if (eventsBuilder_ == null) {
        eventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            poset.proto.EventMessage, poset.proto.EventMessage.Builder, poset.proto.EventMessageOrBuilder>(
                events_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        events_ = null;
      }
      return eventsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:poset.proto.Frame)
  }

  // @@protoc_insertion_point(class_scope:poset.proto.Frame)
  private static final poset.proto.Frame DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new poset.proto.Frame();
  }

  public static poset.proto.Frame getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Frame>
      PARSER = new com.google.protobuf.AbstractParser<Frame>() {
    public Frame parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Frame(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Frame> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Frame> getParserForType() {
    return PARSER;
  }

  public poset.proto.Frame getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

