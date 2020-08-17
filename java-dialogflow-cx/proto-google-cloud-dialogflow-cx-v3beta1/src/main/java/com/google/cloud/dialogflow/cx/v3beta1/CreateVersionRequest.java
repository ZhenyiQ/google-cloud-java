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
// source: google/cloud/dialogflow/cx/v3beta1/version.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * The request message for [Versions.CreateVersion][google.cloud.dialogflow.cx.v3beta1.Versions.CreateVersion].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest}
 */
public final class CreateVersionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest)
    CreateVersionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateVersionRequest.newBuilder() to construct.
  private CreateVersionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateVersionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateVersionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateVersionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.dialogflow.cx.v3beta1.Version.Builder subBuilder = null;
              if (version_ != null) {
                subBuilder = version_.toBuilder();
              }
              version_ =
                  input.readMessage(
                      com.google.cloud.dialogflow.cx.v3beta1.Version.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(version_);
                version_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest.class,
            com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The [Flow][google.cloud.dialogflow.cx.v3beta1.Flow] to create an [Version][google.cloud.dialogflow.cx.v3beta1.Version] for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The [Flow][google.cloud.dialogflow.cx.v3beta1.Flow] to create an [Version][google.cloud.dialogflow.cx.v3beta1.Version] for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.cx.v3beta1.Version version_;
  /**
   *
   *
   * <pre>
   * Required. The version to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Version version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return version_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The version to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Version version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The version.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.Version getVersion() {
    return version_ == null
        ? com.google.cloud.dialogflow.cx.v3beta1.Version.getDefaultInstance()
        : version_;
  }
  /**
   *
   *
   * <pre>
   * Required. The version to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Version version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.VersionOrBuilder getVersionOrBuilder() {
    return getVersion();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (version_ != null) {
      output.writeMessage(2, getVersion());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (version_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getVersion());
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest other =
        (com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion().equals(other.getVersion())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest prototype) {
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
   * The request message for [Versions.CreateVersion][google.cloud.dialogflow.cx.v3beta1.Versions.CreateVersion].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest)
      com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest.class,
              com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest.newBuilder()
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
      parent_ = "";

      if (versionBuilder_ == null) {
        version_ = null;
      } else {
        version_ = null;
        versionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest build() {
      com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest result =
          new com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest(this);
      result.parent_ = parent_;
      if (versionBuilder_ == null) {
        result.version_ = version_;
      } else {
        result.version_ = versionBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
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
      com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The [Flow][google.cloud.dialogflow.cx.v3beta1.Flow] to create an [Version][google.cloud.dialogflow.cx.v3beta1.Version] for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [Flow][google.cloud.dialogflow.cx.v3beta1.Flow] to create an [Version][google.cloud.dialogflow.cx.v3beta1.Version] for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [Flow][google.cloud.dialogflow.cx.v3beta1.Flow] to create an [Version][google.cloud.dialogflow.cx.v3beta1.Version] for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Flow][google.cloud.dialogflow.cx.v3beta1.Flow] to create an [Version][google.cloud.dialogflow.cx.v3beta1.Version] for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Flow][google.cloud.dialogflow.cx.v3beta1.Flow] to create an [Version][google.cloud.dialogflow.cx.v3beta1.Version] for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.cx.v3beta1.Version version_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.Version,
            com.google.cloud.dialogflow.cx.v3beta1.Version.Builder,
            com.google.cloud.dialogflow.cx.v3beta1.VersionOrBuilder>
        versionBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Version version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return versionBuilder_ != null || version_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Version version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The version.
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Version getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null
            ? com.google.cloud.dialogflow.cx.v3beta1.Version.getDefaultInstance()
            : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Version version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setVersion(com.google.cloud.dialogflow.cx.v3beta1.Version value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
        onChanged();
      } else {
        versionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Version version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setVersion(
        com.google.cloud.dialogflow.cx.v3beta1.Version.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
        onChanged();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Version version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeVersion(com.google.cloud.dialogflow.cx.v3beta1.Version value) {
      if (versionBuilder_ == null) {
        if (version_ != null) {
          version_ =
              com.google.cloud.dialogflow.cx.v3beta1.Version.newBuilder(version_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          version_ = value;
        }
        onChanged();
      } else {
        versionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Version version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearVersion() {
      if (versionBuilder_ == null) {
        version_ = null;
        onChanged();
      } else {
        version_ = null;
        versionBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Version version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Version.Builder getVersionBuilder() {

      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Version version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.VersionOrBuilder getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null
            ? com.google.cloud.dialogflow.cx.v3beta1.Version.getDefaultInstance()
            : version_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The version to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Version version = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.Version,
            com.google.cloud.dialogflow.cx.v3beta1.Version.Builder,
            com.google.cloud.dialogflow.cx.v3beta1.VersionOrBuilder>
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.cx.v3beta1.Version,
                com.google.cloud.dialogflow.cx.v3beta1.Version.Builder,
                com.google.cloud.dialogflow.cx.v3beta1.VersionOrBuilder>(
                getVersion(), getParentForChildren(), isClean());
        version_ = null;
      }
      return versionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest)
  private static final com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateVersionRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateVersionRequest>() {
        @java.lang.Override
        public CreateVersionRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateVersionRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.CreateVersionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
