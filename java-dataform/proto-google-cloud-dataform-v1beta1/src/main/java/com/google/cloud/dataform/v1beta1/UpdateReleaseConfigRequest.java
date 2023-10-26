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
// source: google/cloud/dataform/v1beta1/dataform.proto

package com.google.cloud.dataform.v1beta1;

/**
 *
 *
 * <pre>
 * `UpdateReleaseConfig` request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest}
 */
public final class UpdateReleaseConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest)
    UpdateReleaseConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateReleaseConfigRequest.newBuilder() to construct.
  private UpdateReleaseConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateReleaseConfigRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateReleaseConfigRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_UpdateReleaseConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_UpdateReleaseConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest.class,
            com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Optional. Specifies the fields to be updated in the release config. If left
   * unset, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. Specifies the fields to be updated in the release config. If left
   * unset, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Specifies the fields to be updated in the release config. If left
   * unset, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int RELEASE_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.dataform.v1beta1.ReleaseConfig releaseConfig_;
  /**
   *
   *
   * <pre>
   * Required. The release config to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the releaseConfig field is set.
   */
  @java.lang.Override
  public boolean hasReleaseConfig() {
    return releaseConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The release config to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The releaseConfig.
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.ReleaseConfig getReleaseConfig() {
    return releaseConfig_ == null
        ? com.google.cloud.dataform.v1beta1.ReleaseConfig.getDefaultInstance()
        : releaseConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The release config to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.ReleaseConfigOrBuilder getReleaseConfigOrBuilder() {
    return releaseConfig_ == null
        ? com.google.cloud.dataform.v1beta1.ReleaseConfig.getDefaultInstance()
        : releaseConfig_;
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
    if (updateMask_ != null) {
      output.writeMessage(1, getUpdateMask());
    }
    if (releaseConfig_ != null) {
      output.writeMessage(2, getReleaseConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdateMask());
    }
    if (releaseConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getReleaseConfig());
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
    if (!(obj instanceof com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest other =
        (com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (hasReleaseConfig() != other.hasReleaseConfig()) return false;
    if (hasReleaseConfig()) {
      if (!getReleaseConfig().equals(other.getReleaseConfig())) return false;
    }
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasReleaseConfig()) {
      hash = (37 * hash) + RELEASE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getReleaseConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest parseFrom(
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
      com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest prototype) {
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
   * `UpdateReleaseConfig` request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest)
      com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_UpdateReleaseConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_UpdateReleaseConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest.class,
              com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      releaseConfig_ = null;
      if (releaseConfigBuilder_ != null) {
        releaseConfigBuilder_.dispose();
        releaseConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_UpdateReleaseConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest build() {
      com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest buildPartial() {
      com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest result =
          new com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.releaseConfig_ =
            releaseConfigBuilder_ == null ? releaseConfig_ : releaseConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest) {
        return mergeFrom((com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest other) {
      if (other
          == com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest.getDefaultInstance())
        return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasReleaseConfig()) {
        mergeReleaseConfig(other.getReleaseConfig());
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
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getReleaseConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. Specifies the fields to be updated in the release config. If left
     * unset, all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Specifies the fields to be updated in the release config. If left
     * unset, all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Specifies the fields to be updated in the release config. If left
     * unset, all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Specifies the fields to be updated in the release config. If left
     * unset, all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Specifies the fields to be updated in the release config. If left
     * unset, all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Specifies the fields to be updated in the release config. If left
     * unset, all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Specifies the fields to be updated in the release config. If left
     * unset, all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. Specifies the fields to be updated in the release config. If left
     * unset, all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Specifies the fields to be updated in the release config. If left
     * unset, all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private com.google.cloud.dataform.v1beta1.ReleaseConfig releaseConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1beta1.ReleaseConfig,
            com.google.cloud.dataform.v1beta1.ReleaseConfig.Builder,
            com.google.cloud.dataform.v1beta1.ReleaseConfigOrBuilder>
        releaseConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The release config to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the releaseConfig field is set.
     */
    public boolean hasReleaseConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The releaseConfig.
     */
    public com.google.cloud.dataform.v1beta1.ReleaseConfig getReleaseConfig() {
      if (releaseConfigBuilder_ == null) {
        return releaseConfig_ == null
            ? com.google.cloud.dataform.v1beta1.ReleaseConfig.getDefaultInstance()
            : releaseConfig_;
      } else {
        return releaseConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReleaseConfig(com.google.cloud.dataform.v1beta1.ReleaseConfig value) {
      if (releaseConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        releaseConfig_ = value;
      } else {
        releaseConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReleaseConfig(
        com.google.cloud.dataform.v1beta1.ReleaseConfig.Builder builderForValue) {
      if (releaseConfigBuilder_ == null) {
        releaseConfig_ = builderForValue.build();
      } else {
        releaseConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeReleaseConfig(com.google.cloud.dataform.v1beta1.ReleaseConfig value) {
      if (releaseConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && releaseConfig_ != null
            && releaseConfig_
                != com.google.cloud.dataform.v1beta1.ReleaseConfig.getDefaultInstance()) {
          getReleaseConfigBuilder().mergeFrom(value);
        } else {
          releaseConfig_ = value;
        }
      } else {
        releaseConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearReleaseConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      releaseConfig_ = null;
      if (releaseConfigBuilder_ != null) {
        releaseConfigBuilder_.dispose();
        releaseConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataform.v1beta1.ReleaseConfig.Builder getReleaseConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getReleaseConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataform.v1beta1.ReleaseConfigOrBuilder getReleaseConfigOrBuilder() {
      if (releaseConfigBuilder_ != null) {
        return releaseConfigBuilder_.getMessageOrBuilder();
      } else {
        return releaseConfig_ == null
            ? com.google.cloud.dataform.v1beta1.ReleaseConfig.getDefaultInstance()
            : releaseConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The release config to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.ReleaseConfig release_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1beta1.ReleaseConfig,
            com.google.cloud.dataform.v1beta1.ReleaseConfig.Builder,
            com.google.cloud.dataform.v1beta1.ReleaseConfigOrBuilder>
        getReleaseConfigFieldBuilder() {
      if (releaseConfigBuilder_ == null) {
        releaseConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataform.v1beta1.ReleaseConfig,
                com.google.cloud.dataform.v1beta1.ReleaseConfig.Builder,
                com.google.cloud.dataform.v1beta1.ReleaseConfigOrBuilder>(
                getReleaseConfig(), getParentForChildren(), isClean());
        releaseConfig_ = null;
      }
      return releaseConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest)
  private static final com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest();
  }

  public static com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateReleaseConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateReleaseConfigRequest>() {
        @java.lang.Override
        public UpdateReleaseConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateReleaseConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateReleaseConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.UpdateReleaseConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
