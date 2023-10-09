/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/pipeline_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [PipelineService.CreatePipelineJob][google.cloud.aiplatform.v1beta1.PipelineService.CreatePipelineJob].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest}
 */
public final class CreatePipelineJobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest)
    CreatePipelineJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreatePipelineJobRequest.newBuilder() to construct.
  private CreatePipelineJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreatePipelineJobRequest() {
    parent_ = "";
    pipelineJobId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreatePipelineJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.PipelineServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.PipelineServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest.class,
            com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the PipelineJob in.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The resource name of the Location to create the PipelineJob in.
   * Format: `projects/{project}/locations/{location}`
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

  public static final int PIPELINE_JOB_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.PipelineJob pipelineJob_;
  /**
   *
   *
   * <pre>
   * Required. The PipelineJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the pipelineJob field is set.
   */
  @java.lang.Override
  public boolean hasPipelineJob() {
    return pipelineJob_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The PipelineJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The pipelineJob.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PipelineJob getPipelineJob() {
    return pipelineJob_ == null
        ? com.google.cloud.aiplatform.v1beta1.PipelineJob.getDefaultInstance()
        : pipelineJob_;
  }
  /**
   *
   *
   * <pre>
   * Required. The PipelineJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder getPipelineJobOrBuilder() {
    return pipelineJob_ == null
        ? com.google.cloud.aiplatform.v1beta1.PipelineJob.getDefaultInstance()
        : pipelineJob_;
  }

  public static final int PIPELINE_JOB_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pipelineJobId_ = "";
  /**
   *
   *
   * <pre>
   * The ID to use for the PipelineJob, which will become the final component of
   * the PipelineJob name. If not provided, an ID will be automatically
   * generated.
   *
   * This value should be less than 128 characters, and valid characters
   * are `/[a-z][0-9]-/`.
   * </pre>
   *
   * <code>string pipeline_job_id = 3;</code>
   *
   * @return The pipelineJobId.
   */
  @java.lang.Override
  public java.lang.String getPipelineJobId() {
    java.lang.Object ref = pipelineJobId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pipelineJobId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID to use for the PipelineJob, which will become the final component of
   * the PipelineJob name. If not provided, an ID will be automatically
   * generated.
   *
   * This value should be less than 128 characters, and valid characters
   * are `/[a-z][0-9]-/`.
   * </pre>
   *
   * <code>string pipeline_job_id = 3;</code>
   *
   * @return The bytes for pipelineJobId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPipelineJobIdBytes() {
    java.lang.Object ref = pipelineJobId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pipelineJobId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (pipelineJob_ != null) {
      output.writeMessage(2, getPipelineJob());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pipelineJobId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pipelineJobId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (pipelineJob_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPipelineJob());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pipelineJobId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pipelineJobId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest other =
        (com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasPipelineJob() != other.hasPipelineJob()) return false;
    if (hasPipelineJob()) {
      if (!getPipelineJob().equals(other.getPipelineJob())) return false;
    }
    if (!getPipelineJobId().equals(other.getPipelineJobId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
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
    if (hasPipelineJob()) {
      hash = (37 * hash) + PIPELINE_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getPipelineJob().hashCode();
    }
    hash = (37 * hash) + PIPELINE_JOB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPipelineJobId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest prototype) {
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
   * Request message for
   * [PipelineService.CreatePipelineJob][google.cloud.aiplatform.v1beta1.PipelineService.CreatePipelineJob].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest)
      com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.PipelineServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.PipelineServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest.class,
              com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      pipelineJob_ = null;
      if (pipelineJobBuilder_ != null) {
        pipelineJobBuilder_.dispose();
        pipelineJobBuilder_ = null;
      }
      pipelineJobId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.PipelineServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest build() {
      com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest result =
          new com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pipelineJob_ =
            pipelineJobBuilder_ == null ? pipelineJob_ : pipelineJobBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pipelineJobId_ = pipelineJobId_;
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPipelineJob()) {
        mergePipelineJob(other.getPipelineJob());
      }
      if (!other.getPipelineJobId().isEmpty()) {
        pipelineJobId_ = other.pipelineJobId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getPipelineJobFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                pipelineJobId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Location to create the PipelineJob in.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The resource name of the Location to create the PipelineJob in.
     * Format: `projects/{project}/locations/{location}`
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
     * Required. The resource name of the Location to create the PipelineJob in.
     * Format: `projects/{project}/locations/{location}`
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Location to create the PipelineJob in.
     * Format: `projects/{project}/locations/{location}`
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
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Location to create the PipelineJob in.
     * Format: `projects/{project}/locations/{location}`
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.PipelineJob pipelineJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.PipelineJob,
            com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder,
            com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder>
        pipelineJobBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The PipelineJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the pipelineJob field is set.
     */
    public boolean hasPipelineJob() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The PipelineJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The pipelineJob.
     */
    public com.google.cloud.aiplatform.v1beta1.PipelineJob getPipelineJob() {
      if (pipelineJobBuilder_ == null) {
        return pipelineJob_ == null
            ? com.google.cloud.aiplatform.v1beta1.PipelineJob.getDefaultInstance()
            : pipelineJob_;
      } else {
        return pipelineJobBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The PipelineJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPipelineJob(com.google.cloud.aiplatform.v1beta1.PipelineJob value) {
      if (pipelineJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pipelineJob_ = value;
      } else {
        pipelineJobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The PipelineJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPipelineJob(
        com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder builderForValue) {
      if (pipelineJobBuilder_ == null) {
        pipelineJob_ = builderForValue.build();
      } else {
        pipelineJobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The PipelineJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergePipelineJob(com.google.cloud.aiplatform.v1beta1.PipelineJob value) {
      if (pipelineJobBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && pipelineJob_ != null
            && pipelineJob_
                != com.google.cloud.aiplatform.v1beta1.PipelineJob.getDefaultInstance()) {
          getPipelineJobBuilder().mergeFrom(value);
        } else {
          pipelineJob_ = value;
        }
      } else {
        pipelineJobBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The PipelineJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearPipelineJob() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pipelineJob_ = null;
      if (pipelineJobBuilder_ != null) {
        pipelineJobBuilder_.dispose();
        pipelineJobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The PipelineJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder getPipelineJobBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPipelineJobFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The PipelineJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder getPipelineJobOrBuilder() {
      if (pipelineJobBuilder_ != null) {
        return pipelineJobBuilder_.getMessageOrBuilder();
      } else {
        return pipelineJob_ == null
            ? com.google.cloud.aiplatform.v1beta1.PipelineJob.getDefaultInstance()
            : pipelineJob_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The PipelineJob to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_job = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.PipelineJob,
            com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder,
            com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder>
        getPipelineJobFieldBuilder() {
      if (pipelineJobBuilder_ == null) {
        pipelineJobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.PipelineJob,
                com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder,
                com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder>(
                getPipelineJob(), getParentForChildren(), isClean());
        pipelineJob_ = null;
      }
      return pipelineJobBuilder_;
    }

    private java.lang.Object pipelineJobId_ = "";
    /**
     *
     *
     * <pre>
     * The ID to use for the PipelineJob, which will become the final component of
     * the PipelineJob name. If not provided, an ID will be automatically
     * generated.
     *
     * This value should be less than 128 characters, and valid characters
     * are `/[a-z][0-9]-/`.
     * </pre>
     *
     * <code>string pipeline_job_id = 3;</code>
     *
     * @return The pipelineJobId.
     */
    public java.lang.String getPipelineJobId() {
      java.lang.Object ref = pipelineJobId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pipelineJobId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID to use for the PipelineJob, which will become the final component of
     * the PipelineJob name. If not provided, an ID will be automatically
     * generated.
     *
     * This value should be less than 128 characters, and valid characters
     * are `/[a-z][0-9]-/`.
     * </pre>
     *
     * <code>string pipeline_job_id = 3;</code>
     *
     * @return The bytes for pipelineJobId.
     */
    public com.google.protobuf.ByteString getPipelineJobIdBytes() {
      java.lang.Object ref = pipelineJobId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pipelineJobId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID to use for the PipelineJob, which will become the final component of
     * the PipelineJob name. If not provided, an ID will be automatically
     * generated.
     *
     * This value should be less than 128 characters, and valid characters
     * are `/[a-z][0-9]-/`.
     * </pre>
     *
     * <code>string pipeline_job_id = 3;</code>
     *
     * @param value The pipelineJobId to set.
     * @return This builder for chaining.
     */
    public Builder setPipelineJobId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pipelineJobId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID to use for the PipelineJob, which will become the final component of
     * the PipelineJob name. If not provided, an ID will be automatically
     * generated.
     *
     * This value should be less than 128 characters, and valid characters
     * are `/[a-z][0-9]-/`.
     * </pre>
     *
     * <code>string pipeline_job_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPipelineJobId() {
      pipelineJobId_ = getDefaultInstance().getPipelineJobId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID to use for the PipelineJob, which will become the final component of
     * the PipelineJob name. If not provided, an ID will be automatically
     * generated.
     *
     * This value should be less than 128 characters, and valid characters
     * are `/[a-z][0-9]-/`.
     * </pre>
     *
     * <code>string pipeline_job_id = 3;</code>
     *
     * @param value The bytes for pipelineJobId to set.
     * @return This builder for chaining.
     */
    public Builder setPipelineJobIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      pipelineJobId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest)
  private static final com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePipelineJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreatePipelineJobRequest>() {
        @java.lang.Override
        public CreatePipelineJobRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<CreatePipelineJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePipelineJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
