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
 * A request message for BackendServices.GetHealth. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.GetHealthBackendServiceRequest}
 */
public final class GetHealthBackendServiceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.GetHealthBackendServiceRequest)
    GetHealthBackendServiceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetHealthBackendServiceRequest.newBuilder() to construct.
  private GetHealthBackendServiceRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetHealthBackendServiceRequest() {
    backendService_ = "";
    project_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetHealthBackendServiceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GetHealthBackendServiceRequest(
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
          case 903608986:
            {
              com.google.cloud.compute.v1.ResourceGroupReference.Builder subBuilder = null;
              if (resourceGroupReferenceResource_ != null) {
                subBuilder = resourceGroupReferenceResource_.toBuilder();
              }
              resourceGroupReferenceResource_ =
                  input.readMessage(
                      com.google.cloud.compute.v1.ResourceGroupReference.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(resourceGroupReferenceResource_);
                resourceGroupReferenceResource_ = subBuilder.buildPartial();
              }

              break;
            }
          case 1820481738:
            {
              java.lang.String s = input.readStringRequireUtf8();

              project_ = s;
              break;
            }
          case -1839398830:
            {
              java.lang.String s = input.readStringRequireUtf8();

              backendService_ = s;
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
        .internal_static_google_cloud_compute_v1_GetHealthBackendServiceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_GetHealthBackendServiceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.GetHealthBackendServiceRequest.class,
            com.google.cloud.compute.v1.GetHealthBackendServiceRequest.Builder.class);
  }

  public static final int BACKEND_SERVICE_FIELD_NUMBER = 306946058;
  private volatile java.lang.Object backendService_;
  /**
   *
   *
   * <pre>
   * Name of the BackendService resource to which the queried instance belongs.
   * </pre>
   *
   * <code>string backend_service = 306946058 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The backendService.
   */
  @java.lang.Override
  public java.lang.String getBackendService() {
    java.lang.Object ref = backendService_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      backendService_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the BackendService resource to which the queried instance belongs.
   * </pre>
   *
   * <code>string backend_service = 306946058 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for backendService.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBackendServiceBytes() {
    java.lang.Object ref = backendService_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      backendService_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_FIELD_NUMBER = 227560217;
  private volatile java.lang.Object project_;
  /**
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_GROUP_REFERENCE_RESOURCE_FIELD_NUMBER = 112951123;
  private com.google.cloud.compute.v1.ResourceGroupReference resourceGroupReferenceResource_;
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the resourceGroupReferenceResource field is set.
   */
  @java.lang.Override
  public boolean hasResourceGroupReferenceResource() {
    return resourceGroupReferenceResource_ != null;
  }
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The resourceGroupReferenceResource.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ResourceGroupReference getResourceGroupReferenceResource() {
    return resourceGroupReferenceResource_ == null
        ? com.google.cloud.compute.v1.ResourceGroupReference.getDefaultInstance()
        : resourceGroupReferenceResource_;
  }
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ResourceGroupReferenceOrBuilder
      getResourceGroupReferenceResourceOrBuilder() {
    return getResourceGroupReferenceResource();
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
    if (resourceGroupReferenceResource_ != null) {
      output.writeMessage(112951123, getResourceGroupReferenceResource());
    }
    if (!getProjectBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227560217, project_);
    }
    if (!getBackendServiceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 306946058, backendService_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resourceGroupReferenceResource_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              112951123, getResourceGroupReferenceResource());
    }
    if (!getProjectBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227560217, project_);
    }
    if (!getBackendServiceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(306946058, backendService_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.GetHealthBackendServiceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.GetHealthBackendServiceRequest other =
        (com.google.cloud.compute.v1.GetHealthBackendServiceRequest) obj;

    if (!getBackendService().equals(other.getBackendService())) return false;
    if (!getProject().equals(other.getProject())) return false;
    if (hasResourceGroupReferenceResource() != other.hasResourceGroupReferenceResource())
      return false;
    if (hasResourceGroupReferenceResource()) {
      if (!getResourceGroupReferenceResource().equals(other.getResourceGroupReferenceResource()))
        return false;
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
    hash = (37 * hash) + BACKEND_SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getBackendService().hashCode();
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    if (hasResourceGroupReferenceResource()) {
      hash = (37 * hash) + RESOURCE_GROUP_REFERENCE_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResourceGroupReferenceResource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.GetHealthBackendServiceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GetHealthBackendServiceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetHealthBackendServiceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GetHealthBackendServiceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetHealthBackendServiceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GetHealthBackendServiceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetHealthBackendServiceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GetHealthBackendServiceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetHealthBackendServiceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GetHealthBackendServiceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetHealthBackendServiceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GetHealthBackendServiceRequest parseFrom(
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
      com.google.cloud.compute.v1.GetHealthBackendServiceRequest prototype) {
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
   * A request message for BackendServices.GetHealth. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.GetHealthBackendServiceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.GetHealthBackendServiceRequest)
      com.google.cloud.compute.v1.GetHealthBackendServiceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GetHealthBackendServiceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GetHealthBackendServiceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.GetHealthBackendServiceRequest.class,
              com.google.cloud.compute.v1.GetHealthBackendServiceRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.GetHealthBackendServiceRequest.newBuilder()
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
      backendService_ = "";

      project_ = "";

      if (resourceGroupReferenceResourceBuilder_ == null) {
        resourceGroupReferenceResource_ = null;
      } else {
        resourceGroupReferenceResource_ = null;
        resourceGroupReferenceResourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GetHealthBackendServiceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetHealthBackendServiceRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.GetHealthBackendServiceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetHealthBackendServiceRequest build() {
      com.google.cloud.compute.v1.GetHealthBackendServiceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetHealthBackendServiceRequest buildPartial() {
      com.google.cloud.compute.v1.GetHealthBackendServiceRequest result =
          new com.google.cloud.compute.v1.GetHealthBackendServiceRequest(this);
      result.backendService_ = backendService_;
      result.project_ = project_;
      if (resourceGroupReferenceResourceBuilder_ == null) {
        result.resourceGroupReferenceResource_ = resourceGroupReferenceResource_;
      } else {
        result.resourceGroupReferenceResource_ = resourceGroupReferenceResourceBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.GetHealthBackendServiceRequest) {
        return mergeFrom((com.google.cloud.compute.v1.GetHealthBackendServiceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.GetHealthBackendServiceRequest other) {
      if (other == com.google.cloud.compute.v1.GetHealthBackendServiceRequest.getDefaultInstance())
        return this;
      if (!other.getBackendService().isEmpty()) {
        backendService_ = other.backendService_;
        onChanged();
      }
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        onChanged();
      }
      if (other.hasResourceGroupReferenceResource()) {
        mergeResourceGroupReferenceResource(other.getResourceGroupReferenceResource());
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
      com.google.cloud.compute.v1.GetHealthBackendServiceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.GetHealthBackendServiceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object backendService_ = "";
    /**
     *
     *
     * <pre>
     * Name of the BackendService resource to which the queried instance belongs.
     * </pre>
     *
     * <code>string backend_service = 306946058 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The backendService.
     */
    public java.lang.String getBackendService() {
      java.lang.Object ref = backendService_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        backendService_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the BackendService resource to which the queried instance belongs.
     * </pre>
     *
     * <code>string backend_service = 306946058 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for backendService.
     */
    public com.google.protobuf.ByteString getBackendServiceBytes() {
      java.lang.Object ref = backendService_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        backendService_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the BackendService resource to which the queried instance belongs.
     * </pre>
     *
     * <code>string backend_service = 306946058 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The backendService to set.
     * @return This builder for chaining.
     */
    public Builder setBackendService(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      backendService_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the BackendService resource to which the queried instance belongs.
     * </pre>
     *
     * <code>string backend_service = 306946058 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBackendService() {

      backendService_ = getDefaultInstance().getBackendService();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the BackendService resource to which the queried instance belongs.
     * </pre>
     *
     * <code>string backend_service = 306946058 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for backendService to set.
     * @return This builder for chaining.
     */
    public Builder setBackendServiceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      backendService_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object project_ = "";
    /**
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      project_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProject() {

      project_ = getDefaultInstance().getProject();
      onChanged();
      return this;
    }
    /**
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      project_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.compute.v1.ResourceGroupReference resourceGroupReferenceResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.ResourceGroupReference,
            com.google.cloud.compute.v1.ResourceGroupReference.Builder,
            com.google.cloud.compute.v1.ResourceGroupReferenceOrBuilder>
        resourceGroupReferenceResourceBuilder_;
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the resourceGroupReferenceResource field is set.
     */
    public boolean hasResourceGroupReferenceResource() {
      return resourceGroupReferenceResourceBuilder_ != null
          || resourceGroupReferenceResource_ != null;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The resourceGroupReferenceResource.
     */
    public com.google.cloud.compute.v1.ResourceGroupReference getResourceGroupReferenceResource() {
      if (resourceGroupReferenceResourceBuilder_ == null) {
        return resourceGroupReferenceResource_ == null
            ? com.google.cloud.compute.v1.ResourceGroupReference.getDefaultInstance()
            : resourceGroupReferenceResource_;
      } else {
        return resourceGroupReferenceResourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setResourceGroupReferenceResource(
        com.google.cloud.compute.v1.ResourceGroupReference value) {
      if (resourceGroupReferenceResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resourceGroupReferenceResource_ = value;
        onChanged();
      } else {
        resourceGroupReferenceResourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setResourceGroupReferenceResource(
        com.google.cloud.compute.v1.ResourceGroupReference.Builder builderForValue) {
      if (resourceGroupReferenceResourceBuilder_ == null) {
        resourceGroupReferenceResource_ = builderForValue.build();
        onChanged();
      } else {
        resourceGroupReferenceResourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeResourceGroupReferenceResource(
        com.google.cloud.compute.v1.ResourceGroupReference value) {
      if (resourceGroupReferenceResourceBuilder_ == null) {
        if (resourceGroupReferenceResource_ != null) {
          resourceGroupReferenceResource_ =
              com.google.cloud.compute.v1.ResourceGroupReference.newBuilder(
                      resourceGroupReferenceResource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          resourceGroupReferenceResource_ = value;
        }
        onChanged();
      } else {
        resourceGroupReferenceResourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearResourceGroupReferenceResource() {
      if (resourceGroupReferenceResourceBuilder_ == null) {
        resourceGroupReferenceResource_ = null;
        onChanged();
      } else {
        resourceGroupReferenceResource_ = null;
        resourceGroupReferenceResourceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.compute.v1.ResourceGroupReference.Builder
        getResourceGroupReferenceResourceBuilder() {

      onChanged();
      return getResourceGroupReferenceResourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.compute.v1.ResourceGroupReferenceOrBuilder
        getResourceGroupReferenceResourceOrBuilder() {
      if (resourceGroupReferenceResourceBuilder_ != null) {
        return resourceGroupReferenceResourceBuilder_.getMessageOrBuilder();
      } else {
        return resourceGroupReferenceResource_ == null
            ? com.google.cloud.compute.v1.ResourceGroupReference.getDefaultInstance()
            : resourceGroupReferenceResource_;
      }
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.ResourceGroupReference,
            com.google.cloud.compute.v1.ResourceGroupReference.Builder,
            com.google.cloud.compute.v1.ResourceGroupReferenceOrBuilder>
        getResourceGroupReferenceResourceFieldBuilder() {
      if (resourceGroupReferenceResourceBuilder_ == null) {
        resourceGroupReferenceResourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.ResourceGroupReference,
                com.google.cloud.compute.v1.ResourceGroupReference.Builder,
                com.google.cloud.compute.v1.ResourceGroupReferenceOrBuilder>(
                getResourceGroupReferenceResource(), getParentForChildren(), isClean());
        resourceGroupReferenceResource_ = null;
      }
      return resourceGroupReferenceResourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.GetHealthBackendServiceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.GetHealthBackendServiceRequest)
  private static final com.google.cloud.compute.v1.GetHealthBackendServiceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.GetHealthBackendServiceRequest();
  }

  public static com.google.cloud.compute.v1.GetHealthBackendServiceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetHealthBackendServiceRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetHealthBackendServiceRequest>() {
        @java.lang.Override
        public GetHealthBackendServiceRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetHealthBackendServiceRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GetHealthBackendServiceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetHealthBackendServiceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.GetHealthBackendServiceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
