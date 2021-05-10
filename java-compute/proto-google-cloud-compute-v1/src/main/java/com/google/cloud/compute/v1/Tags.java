/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * A set of instance tags.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.Tags}
 */
public final class Tags extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.Tags)
    TagsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Tags.newBuilder() to construct.
  private Tags(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Tags() {
    fingerprint_ = "";
    items_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Tags();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Tags(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 804208130:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                items_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              items_.add(s);
              break;
            }
          case 1877428002:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              fingerprint_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        items_ = items_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_Tags_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_Tags_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.Tags.class, com.google.cloud.compute.v1.Tags.Builder.class);
  }

  private int bitField0_;
  public static final int FINGERPRINT_FIELD_NUMBER = 234678500;
  private volatile java.lang.Object fingerprint_;
  /**
   *
   *
   * <pre>
   * Specifies a fingerprint for this request, which is essentially a hash of the tags' contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update tags. You must always provide an up-to-date fingerprint hash in order to update or change tags.
   * To see the latest fingerprint, make get() request to the instance.
   * </pre>
   *
   * <code>string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  @java.lang.Override
  public boolean hasFingerprint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Specifies a fingerprint for this request, which is essentially a hash of the tags' contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update tags. You must always provide an up-to-date fingerprint hash in order to update or change tags.
   * To see the latest fingerprint, make get() request to the instance.
   * </pre>
   *
   * <code>string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  @java.lang.Override
  public java.lang.String getFingerprint() {
    java.lang.Object ref = fingerprint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fingerprint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Specifies a fingerprint for this request, which is essentially a hash of the tags' contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update tags. You must always provide an up-to-date fingerprint hash in order to update or change tags.
   * To see the latest fingerprint, make get() request to the instance.
   * </pre>
   *
   * <code>string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFingerprintBytes() {
    java.lang.Object ref = fingerprint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      fingerprint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEMS_FIELD_NUMBER = 100526016;
  private com.google.protobuf.LazyStringList items_;
  /**
   *
   *
   * <pre>
   * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
   * </pre>
   *
   * <code>repeated string items = 100526016;</code>
   *
   * @return A list containing the items.
   */
  public com.google.protobuf.ProtocolStringList getItemsList() {
    return items_;
  }
  /**
   *
   *
   * <pre>
   * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
   * </pre>
   *
   * <code>repeated string items = 100526016;</code>
   *
   * @return The count of items.
   */
  public int getItemsCount() {
    return items_.size();
  }
  /**
   *
   *
   * <pre>
   * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
   * </pre>
   *
   * <code>repeated string items = 100526016;</code>
   *
   * @param index The index of the element to return.
   * @return The items at the given index.
   */
  public java.lang.String getItems(int index) {
    return items_.get(index);
  }
  /**
   *
   *
   * <pre>
   * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
   * </pre>
   *
   * <code>repeated string items = 100526016;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the items at the given index.
   */
  public com.google.protobuf.ByteString getItemsBytes(int index) {
    return items_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < items_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 100526016, items_.getRaw(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 234678500, fingerprint_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < items_.size(); i++) {
        dataSize += computeStringSizeNoTag(items_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getItemsList().size();
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(234678500, fingerprint_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.Tags)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.Tags other = (com.google.cloud.compute.v1.Tags) obj;

    if (hasFingerprint() != other.hasFingerprint()) return false;
    if (hasFingerprint()) {
      if (!getFingerprint().equals(other.getFingerprint())) return false;
    }
    if (!getItemsList().equals(other.getItemsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasFingerprint()) {
      hash = (37 * hash) + FINGERPRINT_FIELD_NUMBER;
      hash = (53 * hash) + getFingerprint().hashCode();
    }
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.Tags parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Tags parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Tags parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Tags parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Tags parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Tags parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Tags parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Tags parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Tags parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Tags parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Tags parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Tags parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.compute.v1.Tags prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A set of instance tags.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.Tags}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.Tags)
      com.google.cloud.compute.v1.TagsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Tags_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Tags_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.Tags.class,
              com.google.cloud.compute.v1.Tags.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.Tags.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      fingerprint_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      items_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Tags_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Tags getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.Tags.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Tags build() {
      com.google.cloud.compute.v1.Tags result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Tags buildPartial() {
      com.google.cloud.compute.v1.Tags result = new com.google.cloud.compute.v1.Tags(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.fingerprint_ = fingerprint_;
      if (((bitField0_ & 0x00000002) != 0)) {
        items_ = items_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.items_ = items_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.Tags) {
        return mergeFrom((com.google.cloud.compute.v1.Tags) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.Tags other) {
      if (other == com.google.cloud.compute.v1.Tags.getDefaultInstance()) return this;
      if (other.hasFingerprint()) {
        bitField0_ |= 0x00000001;
        fingerprint_ = other.fingerprint_;
        onChanged();
      }
      if (!other.items_.isEmpty()) {
        if (items_.isEmpty()) {
          items_ = other.items_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureItemsIsMutable();
          items_.addAll(other.items_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.compute.v1.Tags parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.Tags) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object fingerprint_ = "";
    /**
     *
     *
     * <pre>
     * Specifies a fingerprint for this request, which is essentially a hash of the tags' contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update tags. You must always provide an up-to-date fingerprint hash in order to update or change tags.
     * To see the latest fingerprint, make get() request to the instance.
     * </pre>
     *
     * <code>string fingerprint = 234678500;</code>
     *
     * @return Whether the fingerprint field is set.
     */
    public boolean hasFingerprint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Specifies a fingerprint for this request, which is essentially a hash of the tags' contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update tags. You must always provide an up-to-date fingerprint hash in order to update or change tags.
     * To see the latest fingerprint, make get() request to the instance.
     * </pre>
     *
     * <code>string fingerprint = 234678500;</code>
     *
     * @return The fingerprint.
     */
    public java.lang.String getFingerprint() {
      java.lang.Object ref = fingerprint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fingerprint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies a fingerprint for this request, which is essentially a hash of the tags' contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update tags. You must always provide an up-to-date fingerprint hash in order to update or change tags.
     * To see the latest fingerprint, make get() request to the instance.
     * </pre>
     *
     * <code>string fingerprint = 234678500;</code>
     *
     * @return The bytes for fingerprint.
     */
    public com.google.protobuf.ByteString getFingerprintBytes() {
      java.lang.Object ref = fingerprint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        fingerprint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies a fingerprint for this request, which is essentially a hash of the tags' contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update tags. You must always provide an up-to-date fingerprint hash in order to update or change tags.
     * To see the latest fingerprint, make get() request to the instance.
     * </pre>
     *
     * <code>string fingerprint = 234678500;</code>
     *
     * @param value The fingerprint to set.
     * @return This builder for chaining.
     */
    public Builder setFingerprint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      fingerprint_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies a fingerprint for this request, which is essentially a hash of the tags' contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update tags. You must always provide an up-to-date fingerprint hash in order to update or change tags.
     * To see the latest fingerprint, make get() request to the instance.
     * </pre>
     *
     * <code>string fingerprint = 234678500;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFingerprint() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fingerprint_ = getDefaultInstance().getFingerprint();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies a fingerprint for this request, which is essentially a hash of the tags' contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update tags. You must always provide an up-to-date fingerprint hash in order to update or change tags.
     * To see the latest fingerprint, make get() request to the instance.
     * </pre>
     *
     * <code>string fingerprint = 234678500;</code>
     *
     * @param value The bytes for fingerprint to set.
     * @return This builder for chaining.
     */
    public Builder setFingerprintBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      fingerprint_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList items_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        items_ = new com.google.protobuf.LazyStringArrayList(items_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
     * </pre>
     *
     * <code>repeated string items = 100526016;</code>
     *
     * @return A list containing the items.
     */
    public com.google.protobuf.ProtocolStringList getItemsList() {
      return items_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
     * </pre>
     *
     * <code>repeated string items = 100526016;</code>
     *
     * @return The count of items.
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
     * </pre>
     *
     * <code>repeated string items = 100526016;</code>
     *
     * @param index The index of the element to return.
     * @return The items at the given index.
     */
    public java.lang.String getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
     * </pre>
     *
     * <code>repeated string items = 100526016;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the items at the given index.
     */
    public com.google.protobuf.ByteString getItemsBytes(int index) {
      return items_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
     * </pre>
     *
     * <code>repeated string items = 100526016;</code>
     *
     * @param index The index to set the value at.
     * @param value The items to set.
     * @return This builder for chaining.
     */
    public Builder setItems(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureItemsIsMutable();
      items_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
     * </pre>
     *
     * <code>repeated string items = 100526016;</code>
     *
     * @param value The items to add.
     * @return This builder for chaining.
     */
    public Builder addItems(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureItemsIsMutable();
      items_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
     * </pre>
     *
     * <code>repeated string items = 100526016;</code>
     *
     * @param values The items to add.
     * @return This builder for chaining.
     */
    public Builder addAllItems(java.lang.Iterable<java.lang.String> values) {
      ensureItemsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
     * </pre>
     *
     * <code>repeated string items = 100526016;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearItems() {
      items_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
     * </pre>
     *
     * <code>repeated string items = 100526016;</code>
     *
     * @param value The bytes of the items to add.
     * @return This builder for chaining.
     */
    public Builder addItemsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureItemsIsMutable();
      items_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.Tags)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.Tags)
  private static final com.google.cloud.compute.v1.Tags DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.Tags();
  }

  public static com.google.cloud.compute.v1.Tags getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Tags> PARSER =
      new com.google.protobuf.AbstractParser<Tags>() {
        @java.lang.Override
        public Tags parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Tags(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Tags> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Tags> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.Tags getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
