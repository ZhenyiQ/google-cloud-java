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
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.UrlMapsValidateRequest}
 */
public final class UrlMapsValidateRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.UrlMapsValidateRequest)
    UrlMapsValidateRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UrlMapsValidateRequest.newBuilder() to construct.
  private UrlMapsValidateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UrlMapsValidateRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UrlMapsValidateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UrlMapsValidateRequest(
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
          case 1566449778:
            {
              com.google.cloud.compute.v1.UrlMap.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = resource_.toBuilder();
              }
              resource_ =
                  input.readMessage(com.google.cloud.compute.v1.UrlMap.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(resource_);
                resource_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_UrlMapsValidateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_UrlMapsValidateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.UrlMapsValidateRequest.class,
            com.google.cloud.compute.v1.UrlMapsValidateRequest.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_FIELD_NUMBER = 195806222;
  private com.google.cloud.compute.v1.UrlMap resource_;
  /**
   *
   *
   * <pre>
   * Content of the UrlMap to be validated.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.UrlMap resource = 195806222;</code>
   *
   * @return Whether the resource field is set.
   */
  @java.lang.Override
  public boolean hasResource() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Content of the UrlMap to be validated.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.UrlMap resource = 195806222;</code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.UrlMap getResource() {
    return resource_ == null ? com.google.cloud.compute.v1.UrlMap.getDefaultInstance() : resource_;
  }
  /**
   *
   *
   * <pre>
   * Content of the UrlMap to be validated.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.UrlMap resource = 195806222;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.UrlMapOrBuilder getResourceOrBuilder() {
    return resource_ == null ? com.google.cloud.compute.v1.UrlMap.getDefaultInstance() : resource_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(195806222, getResource());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(195806222, getResource());
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
    if (!(obj instanceof com.google.cloud.compute.v1.UrlMapsValidateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.UrlMapsValidateRequest other =
        (com.google.cloud.compute.v1.UrlMapsValidateRequest) obj;

    if (hasResource() != other.hasResource()) return false;
    if (hasResource()) {
      if (!getResource().equals(other.getResource())) return false;
    }
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
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.UrlMapsValidateRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.UrlMapsValidateRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.UrlMapsValidateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.UrlMapsValidateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.UrlMapsValidateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.UrlMapsValidateRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.UrlMapsValidateRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.UrlMapsValidateRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.UrlMapsValidateRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.UrlMapsValidateRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.UrlMapsValidateRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.UrlMapsValidateRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.UrlMapsValidateRequest prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.UrlMapsValidateRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.UrlMapsValidateRequest)
      com.google.cloud.compute.v1.UrlMapsValidateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_UrlMapsValidateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_UrlMapsValidateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.UrlMapsValidateRequest.class,
              com.google.cloud.compute.v1.UrlMapsValidateRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.UrlMapsValidateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getResourceFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resourceBuilder_ == null) {
        resource_ = null;
      } else {
        resourceBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_UrlMapsValidateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.UrlMapsValidateRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.UrlMapsValidateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.UrlMapsValidateRequest build() {
      com.google.cloud.compute.v1.UrlMapsValidateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.UrlMapsValidateRequest buildPartial() {
      com.google.cloud.compute.v1.UrlMapsValidateRequest result =
          new com.google.cloud.compute.v1.UrlMapsValidateRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (resourceBuilder_ == null) {
          result.resource_ = resource_;
        } else {
          result.resource_ = resourceBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
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
      if (other instanceof com.google.cloud.compute.v1.UrlMapsValidateRequest) {
        return mergeFrom((com.google.cloud.compute.v1.UrlMapsValidateRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.UrlMapsValidateRequest other) {
      if (other == com.google.cloud.compute.v1.UrlMapsValidateRequest.getDefaultInstance())
        return this;
      if (other.hasResource()) {
        mergeResource(other.getResource());
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
      com.google.cloud.compute.v1.UrlMapsValidateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.UrlMapsValidateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.cloud.compute.v1.UrlMap resource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.UrlMap,
            com.google.cloud.compute.v1.UrlMap.Builder,
            com.google.cloud.compute.v1.UrlMapOrBuilder>
        resourceBuilder_;
    /**
     *
     *
     * <pre>
     * Content of the UrlMap to be validated.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.UrlMap resource = 195806222;</code>
     *
     * @return Whether the resource field is set.
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Content of the UrlMap to be validated.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.UrlMap resource = 195806222;</code>
     *
     * @return The resource.
     */
    public com.google.cloud.compute.v1.UrlMap getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null
            ? com.google.cloud.compute.v1.UrlMap.getDefaultInstance()
            : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Content of the UrlMap to be validated.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.UrlMap resource = 195806222;</code>
     */
    public Builder setResource(com.google.cloud.compute.v1.UrlMap value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
        onChanged();
      } else {
        resourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Content of the UrlMap to be validated.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.UrlMap resource = 195806222;</code>
     */
    public Builder setResource(com.google.cloud.compute.v1.UrlMap.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
        onChanged();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Content of the UrlMap to be validated.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.UrlMap resource = 195806222;</code>
     */
    public Builder mergeResource(com.google.cloud.compute.v1.UrlMap value) {
      if (resourceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && resource_ != null
            && resource_ != com.google.cloud.compute.v1.UrlMap.getDefaultInstance()) {
          resource_ =
              com.google.cloud.compute.v1.UrlMap.newBuilder(resource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          resource_ = value;
        }
        onChanged();
      } else {
        resourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Content of the UrlMap to be validated.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.UrlMap resource = 195806222;</code>
     */
    public Builder clearResource() {
      if (resourceBuilder_ == null) {
        resource_ = null;
        onChanged();
      } else {
        resourceBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Content of the UrlMap to be validated.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.UrlMap resource = 195806222;</code>
     */
    public com.google.cloud.compute.v1.UrlMap.Builder getResourceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Content of the UrlMap to be validated.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.UrlMap resource = 195806222;</code>
     */
    public com.google.cloud.compute.v1.UrlMapOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null
            ? com.google.cloud.compute.v1.UrlMap.getDefaultInstance()
            : resource_;
      }
    }
    /**
     *
     *
     * <pre>
     * Content of the UrlMap to be validated.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.UrlMap resource = 195806222;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.UrlMap,
            com.google.cloud.compute.v1.UrlMap.Builder,
            com.google.cloud.compute.v1.UrlMapOrBuilder>
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.UrlMap,
                com.google.cloud.compute.v1.UrlMap.Builder,
                com.google.cloud.compute.v1.UrlMapOrBuilder>(
                getResource(), getParentForChildren(), isClean());
        resource_ = null;
      }
      return resourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.UrlMapsValidateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.UrlMapsValidateRequest)
  private static final com.google.cloud.compute.v1.UrlMapsValidateRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.UrlMapsValidateRequest();
  }

  public static com.google.cloud.compute.v1.UrlMapsValidateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UrlMapsValidateRequest> PARSER =
      new com.google.protobuf.AbstractParser<UrlMapsValidateRequest>() {
        @java.lang.Override
        public UrlMapsValidateRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UrlMapsValidateRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UrlMapsValidateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UrlMapsValidateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.UrlMapsValidateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
