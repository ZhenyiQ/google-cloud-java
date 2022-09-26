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
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

/**
 *
 *
 * <pre>
 * Response message for the
 * [ListCustomClasses][google.cloud.speech.v2.Speech.ListCustomClasses] method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v2.ListCustomClassesResponse}
 */
public final class ListCustomClassesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v2.ListCustomClassesResponse)
    ListCustomClassesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListCustomClassesResponse.newBuilder() to construct.
  private ListCustomClassesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListCustomClassesResponse() {
    customClasses_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListCustomClassesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListCustomClassesResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                customClasses_ = new java.util.ArrayList<com.google.cloud.speech.v2.CustomClass>();
                mutable_bitField0_ |= 0x00000001;
              }
              customClasses_.add(
                  input.readMessage(
                      com.google.cloud.speech.v2.CustomClass.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        customClasses_ = java.util.Collections.unmodifiableList(customClasses_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v2.CloudSpeechProto
        .internal_static_google_cloud_speech_v2_ListCustomClassesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v2.CloudSpeechProto
        .internal_static_google_cloud_speech_v2_ListCustomClassesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v2.ListCustomClassesResponse.class,
            com.google.cloud.speech.v2.ListCustomClassesResponse.Builder.class);
  }

  public static final int CUSTOM_CLASSES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.speech.v2.CustomClass> customClasses_;
  /**
   *
   *
   * <pre>
   * The list of requested CustomClasses.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.speech.v2.CustomClass> getCustomClassesList() {
    return customClasses_;
  }
  /**
   *
   *
   * <pre>
   * The list of requested CustomClasses.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.speech.v2.CustomClassOrBuilder>
      getCustomClassesOrBuilderList() {
    return customClasses_;
  }
  /**
   *
   *
   * <pre>
   * The list of requested CustomClasses.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
   */
  @java.lang.Override
  public int getCustomClassesCount() {
    return customClasses_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of requested CustomClasses.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.CustomClass getCustomClasses(int index) {
    return customClasses_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of requested CustomClasses.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.CustomClassOrBuilder getCustomClassesOrBuilder(int index) {
    return customClasses_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [page_token][google.cloud.speech.v2.ListCustomClassesRequest.page_token] to
   * retrieve the next page. If this field is omitted, there are no subsequent
   * pages. This token expires after 72 hours.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [page_token][google.cloud.speech.v2.ListCustomClassesRequest.page_token] to
   * retrieve the next page. If this field is omitted, there are no subsequent
   * pages. This token expires after 72 hours.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < customClasses_.size(); i++) {
      output.writeMessage(1, customClasses_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < customClasses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, customClasses_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.speech.v2.ListCustomClassesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v2.ListCustomClassesResponse other =
        (com.google.cloud.speech.v2.ListCustomClassesResponse) obj;

    if (!getCustomClassesList().equals(other.getCustomClassesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getCustomClassesCount() > 0) {
      hash = (37 * hash) + CUSTOM_CLASSES_FIELD_NUMBER;
      hash = (53 * hash) + getCustomClassesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v2.ListCustomClassesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.ListCustomClassesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ListCustomClassesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.ListCustomClassesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ListCustomClassesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.ListCustomClassesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ListCustomClassesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.ListCustomClassesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ListCustomClassesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.ListCustomClassesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ListCustomClassesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.ListCustomClassesResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.speech.v2.ListCustomClassesResponse prototype) {
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
   * Response message for the
   * [ListCustomClasses][google.cloud.speech.v2.Speech.ListCustomClasses] method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v2.ListCustomClassesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v2.ListCustomClassesResponse)
      com.google.cloud.speech.v2.ListCustomClassesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_ListCustomClassesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_ListCustomClassesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v2.ListCustomClassesResponse.class,
              com.google.cloud.speech.v2.ListCustomClassesResponse.Builder.class);
    }

    // Construct using com.google.cloud.speech.v2.ListCustomClassesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCustomClassesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (customClassesBuilder_ == null) {
        customClasses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        customClassesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_ListCustomClassesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.ListCustomClassesResponse getDefaultInstanceForType() {
      return com.google.cloud.speech.v2.ListCustomClassesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.ListCustomClassesResponse build() {
      com.google.cloud.speech.v2.ListCustomClassesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.ListCustomClassesResponse buildPartial() {
      com.google.cloud.speech.v2.ListCustomClassesResponse result =
          new com.google.cloud.speech.v2.ListCustomClassesResponse(this);
      int from_bitField0_ = bitField0_;
      if (customClassesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          customClasses_ = java.util.Collections.unmodifiableList(customClasses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.customClasses_ = customClasses_;
      } else {
        result.customClasses_ = customClassesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.speech.v2.ListCustomClassesResponse) {
        return mergeFrom((com.google.cloud.speech.v2.ListCustomClassesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v2.ListCustomClassesResponse other) {
      if (other == com.google.cloud.speech.v2.ListCustomClassesResponse.getDefaultInstance())
        return this;
      if (customClassesBuilder_ == null) {
        if (!other.customClasses_.isEmpty()) {
          if (customClasses_.isEmpty()) {
            customClasses_ = other.customClasses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCustomClassesIsMutable();
            customClasses_.addAll(other.customClasses_);
          }
          onChanged();
        }
      } else {
        if (!other.customClasses_.isEmpty()) {
          if (customClassesBuilder_.isEmpty()) {
            customClassesBuilder_.dispose();
            customClassesBuilder_ = null;
            customClasses_ = other.customClasses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            customClassesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCustomClassesFieldBuilder()
                    : null;
          } else {
            customClassesBuilder_.addAllMessages(other.customClasses_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.speech.v2.ListCustomClassesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.speech.v2.ListCustomClassesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.speech.v2.CustomClass> customClasses_ =
        java.util.Collections.emptyList();

    private void ensureCustomClassesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        customClasses_ =
            new java.util.ArrayList<com.google.cloud.speech.v2.CustomClass>(customClasses_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.speech.v2.CustomClass,
            com.google.cloud.speech.v2.CustomClass.Builder,
            com.google.cloud.speech.v2.CustomClassOrBuilder>
        customClassesBuilder_;

    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public java.util.List<com.google.cloud.speech.v2.CustomClass> getCustomClassesList() {
      if (customClassesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(customClasses_);
      } else {
        return customClassesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public int getCustomClassesCount() {
      if (customClassesBuilder_ == null) {
        return customClasses_.size();
      } else {
        return customClassesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public com.google.cloud.speech.v2.CustomClass getCustomClasses(int index) {
      if (customClassesBuilder_ == null) {
        return customClasses_.get(index);
      } else {
        return customClassesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public Builder setCustomClasses(int index, com.google.cloud.speech.v2.CustomClass value) {
      if (customClassesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomClassesIsMutable();
        customClasses_.set(index, value);
        onChanged();
      } else {
        customClassesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public Builder setCustomClasses(
        int index, com.google.cloud.speech.v2.CustomClass.Builder builderForValue) {
      if (customClassesBuilder_ == null) {
        ensureCustomClassesIsMutable();
        customClasses_.set(index, builderForValue.build());
        onChanged();
      } else {
        customClassesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public Builder addCustomClasses(com.google.cloud.speech.v2.CustomClass value) {
      if (customClassesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomClassesIsMutable();
        customClasses_.add(value);
        onChanged();
      } else {
        customClassesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public Builder addCustomClasses(int index, com.google.cloud.speech.v2.CustomClass value) {
      if (customClassesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomClassesIsMutable();
        customClasses_.add(index, value);
        onChanged();
      } else {
        customClassesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public Builder addCustomClasses(
        com.google.cloud.speech.v2.CustomClass.Builder builderForValue) {
      if (customClassesBuilder_ == null) {
        ensureCustomClassesIsMutable();
        customClasses_.add(builderForValue.build());
        onChanged();
      } else {
        customClassesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public Builder addCustomClasses(
        int index, com.google.cloud.speech.v2.CustomClass.Builder builderForValue) {
      if (customClassesBuilder_ == null) {
        ensureCustomClassesIsMutable();
        customClasses_.add(index, builderForValue.build());
        onChanged();
      } else {
        customClassesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public Builder addAllCustomClasses(
        java.lang.Iterable<? extends com.google.cloud.speech.v2.CustomClass> values) {
      if (customClassesBuilder_ == null) {
        ensureCustomClassesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, customClasses_);
        onChanged();
      } else {
        customClassesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public Builder clearCustomClasses() {
      if (customClassesBuilder_ == null) {
        customClasses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        customClassesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public Builder removeCustomClasses(int index) {
      if (customClassesBuilder_ == null) {
        ensureCustomClassesIsMutable();
        customClasses_.remove(index);
        onChanged();
      } else {
        customClassesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public com.google.cloud.speech.v2.CustomClass.Builder getCustomClassesBuilder(int index) {
      return getCustomClassesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public com.google.cloud.speech.v2.CustomClassOrBuilder getCustomClassesOrBuilder(int index) {
      if (customClassesBuilder_ == null) {
        return customClasses_.get(index);
      } else {
        return customClassesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.speech.v2.CustomClassOrBuilder>
        getCustomClassesOrBuilderList() {
      if (customClassesBuilder_ != null) {
        return customClassesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(customClasses_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public com.google.cloud.speech.v2.CustomClass.Builder addCustomClassesBuilder() {
      return getCustomClassesFieldBuilder()
          .addBuilder(com.google.cloud.speech.v2.CustomClass.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public com.google.cloud.speech.v2.CustomClass.Builder addCustomClassesBuilder(int index) {
      return getCustomClassesFieldBuilder()
          .addBuilder(index, com.google.cloud.speech.v2.CustomClass.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of requested CustomClasses.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 1;</code>
     */
    public java.util.List<com.google.cloud.speech.v2.CustomClass.Builder>
        getCustomClassesBuilderList() {
      return getCustomClassesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.speech.v2.CustomClass,
            com.google.cloud.speech.v2.CustomClass.Builder,
            com.google.cloud.speech.v2.CustomClassOrBuilder>
        getCustomClassesFieldBuilder() {
      if (customClassesBuilder_ == null) {
        customClassesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.speech.v2.CustomClass,
                com.google.cloud.speech.v2.CustomClass.Builder,
                com.google.cloud.speech.v2.CustomClassOrBuilder>(
                customClasses_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        customClasses_ = null;
      }
      return customClassesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [page_token][google.cloud.speech.v2.ListCustomClassesRequest.page_token] to
     * retrieve the next page. If this field is omitted, there are no subsequent
     * pages. This token expires after 72 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [page_token][google.cloud.speech.v2.ListCustomClassesRequest.page_token] to
     * retrieve the next page. If this field is omitted, there are no subsequent
     * pages. This token expires after 72 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [page_token][google.cloud.speech.v2.ListCustomClassesRequest.page_token] to
     * retrieve the next page. If this field is omitted, there are no subsequent
     * pages. This token expires after 72 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [page_token][google.cloud.speech.v2.ListCustomClassesRequest.page_token] to
     * retrieve the next page. If this field is omitted, there are no subsequent
     * pages. This token expires after 72 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [page_token][google.cloud.speech.v2.ListCustomClassesRequest.page_token] to
     * retrieve the next page. If this field is omitted, there are no subsequent
     * pages. This token expires after 72 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v2.ListCustomClassesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v2.ListCustomClassesResponse)
  private static final com.google.cloud.speech.v2.ListCustomClassesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v2.ListCustomClassesResponse();
  }

  public static com.google.cloud.speech.v2.ListCustomClassesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCustomClassesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListCustomClassesResponse>() {
        @java.lang.Override
        public ListCustomClassesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListCustomClassesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListCustomClassesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCustomClassesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v2.ListCustomClassesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}