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
 * The request message for [Versions.LoadVersion][google.cloud.dialogflow.cx.v3beta1.Versions.LoadVersion].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest}
 */
public final class LoadVersionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest)
    LoadVersionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LoadVersionRequest.newBuilder() to construct.
  private LoadVersionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LoadVersionRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LoadVersionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LoadVersionRequest(
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

              name_ = s;
              break;
            }
          case 16:
            {
              allowOverrideAgentResources_ = input.readBool();
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
        .internal_static_google_cloud_dialogflow_cx_v3beta1_LoadVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_LoadVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest.class,
            com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The [Version][google.cloud.dialogflow.cx.v3beta1.Version] to be loaded to draft version.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The [Version][google.cloud.dialogflow.cx.v3beta1.Version] to be loaded to draft version.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALLOW_OVERRIDE_AGENT_RESOURCES_FIELD_NUMBER = 2;
  private boolean allowOverrideAgentResources_;
  /**
   *
   *
   * <pre>
   * This field is used to prevent accidental overwrite of other agent resources
   * in the draft version, which can potentially impact other flow's behavior.
   * If `allow_override_agent_resources` is false, conflicted agent-level
   * resources will not be overridden (i.e. intents, entities, webhooks).
   * </pre>
   *
   * <code>bool allow_override_agent_resources = 2;</code>
   *
   * @return The allowOverrideAgentResources.
   */
  @java.lang.Override
  public boolean getAllowOverrideAgentResources() {
    return allowOverrideAgentResources_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (allowOverrideAgentResources_ != false) {
      output.writeBool(2, allowOverrideAgentResources_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (allowOverrideAgentResources_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(2, allowOverrideAgentResources_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest other =
        (com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (getAllowOverrideAgentResources() != other.getAllowOverrideAgentResources()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ALLOW_OVERRIDE_AGENT_RESOURCES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowOverrideAgentResources());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest parseFrom(
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
      com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest prototype) {
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
   * The request message for [Versions.LoadVersion][google.cloud.dialogflow.cx.v3beta1.Versions.LoadVersion].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest)
      com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_LoadVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_LoadVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest.class,
              com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest.newBuilder()
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
      name_ = "";

      allowOverrideAgentResources_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_LoadVersionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest build() {
      com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest result =
          new com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest(this);
      result.name_ = name_;
      result.allowOverrideAgentResources_ = allowOverrideAgentResources_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getAllowOverrideAgentResources() != false) {
        setAllowOverrideAgentResources(other.getAllowOverrideAgentResources());
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
      com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The [Version][google.cloud.dialogflow.cx.v3beta1.Version] to be loaded to draft version.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [Version][google.cloud.dialogflow.cx.v3beta1.Version] to be loaded to draft version.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [Version][google.cloud.dialogflow.cx.v3beta1.Version] to be loaded to draft version.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Version][google.cloud.dialogflow.cx.v3beta1.Version] to be loaded to draft version.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Version][google.cloud.dialogflow.cx.v3beta1.Version] to be loaded to draft version.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private boolean allowOverrideAgentResources_;
    /**
     *
     *
     * <pre>
     * This field is used to prevent accidental overwrite of other agent resources
     * in the draft version, which can potentially impact other flow's behavior.
     * If `allow_override_agent_resources` is false, conflicted agent-level
     * resources will not be overridden (i.e. intents, entities, webhooks).
     * </pre>
     *
     * <code>bool allow_override_agent_resources = 2;</code>
     *
     * @return The allowOverrideAgentResources.
     */
    @java.lang.Override
    public boolean getAllowOverrideAgentResources() {
      return allowOverrideAgentResources_;
    }
    /**
     *
     *
     * <pre>
     * This field is used to prevent accidental overwrite of other agent resources
     * in the draft version, which can potentially impact other flow's behavior.
     * If `allow_override_agent_resources` is false, conflicted agent-level
     * resources will not be overridden (i.e. intents, entities, webhooks).
     * </pre>
     *
     * <code>bool allow_override_agent_resources = 2;</code>
     *
     * @param value The allowOverrideAgentResources to set.
     * @return This builder for chaining.
     */
    public Builder setAllowOverrideAgentResources(boolean value) {

      allowOverrideAgentResources_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This field is used to prevent accidental overwrite of other agent resources
     * in the draft version, which can potentially impact other flow's behavior.
     * If `allow_override_agent_resources` is false, conflicted agent-level
     * resources will not be overridden (i.e. intents, entities, webhooks).
     * </pre>
     *
     * <code>bool allow_override_agent_resources = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowOverrideAgentResources() {

      allowOverrideAgentResources_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest)
  private static final com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoadVersionRequest> PARSER =
      new com.google.protobuf.AbstractParser<LoadVersionRequest>() {
        @java.lang.Override
        public LoadVersionRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LoadVersionRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LoadVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoadVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.LoadVersionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
