/*
 * Copyright 2024 Google LLC
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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * EphemeralStorageConfig contains configuration for the ephemeral storage
 * filesystem.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.EphemeralStorageConfig}
 */
public final class EphemeralStorageConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.EphemeralStorageConfig)
    EphemeralStorageConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EphemeralStorageConfig.newBuilder() to construct.
  private EphemeralStorageConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EphemeralStorageConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EphemeralStorageConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_EphemeralStorageConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_EphemeralStorageConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.EphemeralStorageConfig.class,
            com.google.container.v1beta1.EphemeralStorageConfig.Builder.class);
  }

  public static final int LOCAL_SSD_COUNT_FIELD_NUMBER = 1;
  private int localSsdCount_ = 0;
  /**
   *
   *
   * <pre>
   * Number of local SSDs to use to back ephemeral storage. Uses NVMe
   * interfaces. The limit for this value is dependent upon the maximum number
   * of disk available on a machine per zone. See:
   * https://cloud.google.com/compute/docs/disks/local-ssd
   * for more information.
   *
   * A zero (or unset) value has different meanings depending on machine type
   * being used:
   * 1. For pre-Gen3 machines, which support flexible numbers of local ssds,
   * zero (or unset) means to disable using local SSDs as ephemeral storage.
   * 2. For Gen3 machines which dictate a specific number of local ssds, zero
   * (or unset) means to use the default number of local ssds that goes with
   * that machine type. For example, for a c3-standard-8-lssd machine, 2 local
   * ssds would be provisioned. For c3-standard-8 (which doesn't support local
   * ssds), 0 will be provisioned. See
   * https://cloud.google.com/compute/docs/disks/local-ssd#choose_number_local_ssds
   * for more info.
   * </pre>
   *
   * <code>int32 local_ssd_count = 1;</code>
   *
   * @return The localSsdCount.
   */
  @java.lang.Override
  public int getLocalSsdCount() {
    return localSsdCount_;
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
    if (localSsdCount_ != 0) {
      output.writeInt32(1, localSsdCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (localSsdCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, localSsdCount_);
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
    if (!(obj instanceof com.google.container.v1beta1.EphemeralStorageConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.EphemeralStorageConfig other =
        (com.google.container.v1beta1.EphemeralStorageConfig) obj;

    if (getLocalSsdCount() != other.getLocalSsdCount()) return false;
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
    hash = (37 * hash) + LOCAL_SSD_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getLocalSsdCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.EphemeralStorageConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.EphemeralStorageConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.EphemeralStorageConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.EphemeralStorageConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.EphemeralStorageConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.EphemeralStorageConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.EphemeralStorageConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.EphemeralStorageConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.EphemeralStorageConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.EphemeralStorageConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.EphemeralStorageConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.EphemeralStorageConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.EphemeralStorageConfig prototype) {
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
   * EphemeralStorageConfig contains configuration for the ephemeral storage
   * filesystem.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.EphemeralStorageConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.EphemeralStorageConfig)
      com.google.container.v1beta1.EphemeralStorageConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_EphemeralStorageConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_EphemeralStorageConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.EphemeralStorageConfig.class,
              com.google.container.v1beta1.EphemeralStorageConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.EphemeralStorageConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      localSsdCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_EphemeralStorageConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.EphemeralStorageConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.EphemeralStorageConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.EphemeralStorageConfig build() {
      com.google.container.v1beta1.EphemeralStorageConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.EphemeralStorageConfig buildPartial() {
      com.google.container.v1beta1.EphemeralStorageConfig result =
          new com.google.container.v1beta1.EphemeralStorageConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.EphemeralStorageConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.localSsdCount_ = localSsdCount_;
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
      if (other instanceof com.google.container.v1beta1.EphemeralStorageConfig) {
        return mergeFrom((com.google.container.v1beta1.EphemeralStorageConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.EphemeralStorageConfig other) {
      if (other == com.google.container.v1beta1.EphemeralStorageConfig.getDefaultInstance())
        return this;
      if (other.getLocalSsdCount() != 0) {
        setLocalSsdCount(other.getLocalSsdCount());
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
            case 8:
              {
                localSsdCount_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int localSsdCount_;
    /**
     *
     *
     * <pre>
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe
     * interfaces. The limit for this value is dependent upon the maximum number
     * of disk available on a machine per zone. See:
     * https://cloud.google.com/compute/docs/disks/local-ssd
     * for more information.
     *
     * A zero (or unset) value has different meanings depending on machine type
     * being used:
     * 1. For pre-Gen3 machines, which support flexible numbers of local ssds,
     * zero (or unset) means to disable using local SSDs as ephemeral storage.
     * 2. For Gen3 machines which dictate a specific number of local ssds, zero
     * (or unset) means to use the default number of local ssds that goes with
     * that machine type. For example, for a c3-standard-8-lssd machine, 2 local
     * ssds would be provisioned. For c3-standard-8 (which doesn't support local
     * ssds), 0 will be provisioned. See
     * https://cloud.google.com/compute/docs/disks/local-ssd#choose_number_local_ssds
     * for more info.
     * </pre>
     *
     * <code>int32 local_ssd_count = 1;</code>
     *
     * @return The localSsdCount.
     */
    @java.lang.Override
    public int getLocalSsdCount() {
      return localSsdCount_;
    }
    /**
     *
     *
     * <pre>
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe
     * interfaces. The limit for this value is dependent upon the maximum number
     * of disk available on a machine per zone. See:
     * https://cloud.google.com/compute/docs/disks/local-ssd
     * for more information.
     *
     * A zero (or unset) value has different meanings depending on machine type
     * being used:
     * 1. For pre-Gen3 machines, which support flexible numbers of local ssds,
     * zero (or unset) means to disable using local SSDs as ephemeral storage.
     * 2. For Gen3 machines which dictate a specific number of local ssds, zero
     * (or unset) means to use the default number of local ssds that goes with
     * that machine type. For example, for a c3-standard-8-lssd machine, 2 local
     * ssds would be provisioned. For c3-standard-8 (which doesn't support local
     * ssds), 0 will be provisioned. See
     * https://cloud.google.com/compute/docs/disks/local-ssd#choose_number_local_ssds
     * for more info.
     * </pre>
     *
     * <code>int32 local_ssd_count = 1;</code>
     *
     * @param value The localSsdCount to set.
     * @return This builder for chaining.
     */
    public Builder setLocalSsdCount(int value) {

      localSsdCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe
     * interfaces. The limit for this value is dependent upon the maximum number
     * of disk available on a machine per zone. See:
     * https://cloud.google.com/compute/docs/disks/local-ssd
     * for more information.
     *
     * A zero (or unset) value has different meanings depending on machine type
     * being used:
     * 1. For pre-Gen3 machines, which support flexible numbers of local ssds,
     * zero (or unset) means to disable using local SSDs as ephemeral storage.
     * 2. For Gen3 machines which dictate a specific number of local ssds, zero
     * (or unset) means to use the default number of local ssds that goes with
     * that machine type. For example, for a c3-standard-8-lssd machine, 2 local
     * ssds would be provisioned. For c3-standard-8 (which doesn't support local
     * ssds), 0 will be provisioned. See
     * https://cloud.google.com/compute/docs/disks/local-ssd#choose_number_local_ssds
     * for more info.
     * </pre>
     *
     * <code>int32 local_ssd_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocalSsdCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      localSsdCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.EphemeralStorageConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.EphemeralStorageConfig)
  private static final com.google.container.v1beta1.EphemeralStorageConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.EphemeralStorageConfig();
  }

  public static com.google.container.v1beta1.EphemeralStorageConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EphemeralStorageConfig> PARSER =
      new com.google.protobuf.AbstractParser<EphemeralStorageConfig>() {
        @java.lang.Override
        public EphemeralStorageConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<EphemeralStorageConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EphemeralStorageConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.EphemeralStorageConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
