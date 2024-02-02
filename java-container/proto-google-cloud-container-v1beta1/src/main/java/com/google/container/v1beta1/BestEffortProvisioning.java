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
 * Best effort provisioning.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.BestEffortProvisioning}
 */
public final class BestEffortProvisioning extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.BestEffortProvisioning)
    BestEffortProvisioningOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BestEffortProvisioning.newBuilder() to construct.
  private BestEffortProvisioning(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BestEffortProvisioning() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BestEffortProvisioning();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_BestEffortProvisioning_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_BestEffortProvisioning_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.BestEffortProvisioning.class,
            com.google.container.v1beta1.BestEffortProvisioning.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_ = false;
  /**
   *
   *
   * <pre>
   * When this is enabled, cluster/node pool creations will ignore non-fatal
   * errors like stockout to best provision as many nodes as possible right now
   * and eventually bring up all target number of nodes
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int MIN_PROVISION_NODES_FIELD_NUMBER = 2;
  private int minProvisionNodes_ = 0;
  /**
   *
   *
   * <pre>
   * Minimum number of nodes to be provisioned to be considered as succeeded,
   * and the rest of nodes will be provisioned gradually and eventually when
   * stockout issue has been resolved.
   * </pre>
   *
   * <code>int32 min_provision_nodes = 2;</code>
   *
   * @return The minProvisionNodes.
   */
  @java.lang.Override
  public int getMinProvisionNodes() {
    return minProvisionNodes_;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (minProvisionNodes_ != 0) {
      output.writeInt32(2, minProvisionNodes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enabled_);
    }
    if (minProvisionNodes_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, minProvisionNodes_);
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
    if (!(obj instanceof com.google.container.v1beta1.BestEffortProvisioning)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.BestEffortProvisioning other =
        (com.google.container.v1beta1.BestEffortProvisioning) obj;

    if (getEnabled() != other.getEnabled()) return false;
    if (getMinProvisionNodes() != other.getMinProvisionNodes()) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnabled());
    hash = (37 * hash) + MIN_PROVISION_NODES_FIELD_NUMBER;
    hash = (53 * hash) + getMinProvisionNodes();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.BestEffortProvisioning parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.BestEffortProvisioning parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.BestEffortProvisioning parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.BestEffortProvisioning parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.BestEffortProvisioning parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.BestEffortProvisioning parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.BestEffortProvisioning parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.BestEffortProvisioning parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.BestEffortProvisioning parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.BestEffortProvisioning parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.BestEffortProvisioning parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.BestEffortProvisioning parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.BestEffortProvisioning prototype) {
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
   * Best effort provisioning.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.BestEffortProvisioning}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.BestEffortProvisioning)
      com.google.container.v1beta1.BestEffortProvisioningOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_BestEffortProvisioning_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_BestEffortProvisioning_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.BestEffortProvisioning.class,
              com.google.container.v1beta1.BestEffortProvisioning.Builder.class);
    }

    // Construct using com.google.container.v1beta1.BestEffortProvisioning.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enabled_ = false;
      minProvisionNodes_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_BestEffortProvisioning_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.BestEffortProvisioning getDefaultInstanceForType() {
      return com.google.container.v1beta1.BestEffortProvisioning.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.BestEffortProvisioning build() {
      com.google.container.v1beta1.BestEffortProvisioning result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.BestEffortProvisioning buildPartial() {
      com.google.container.v1beta1.BestEffortProvisioning result =
          new com.google.container.v1beta1.BestEffortProvisioning(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.BestEffortProvisioning result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minProvisionNodes_ = minProvisionNodes_;
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
      if (other instanceof com.google.container.v1beta1.BestEffortProvisioning) {
        return mergeFrom((com.google.container.v1beta1.BestEffortProvisioning) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.BestEffortProvisioning other) {
      if (other == com.google.container.v1beta1.BestEffortProvisioning.getDefaultInstance())
        return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.getMinProvisionNodes() != 0) {
        setMinProvisionNodes(other.getMinProvisionNodes());
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
                enabled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                minProvisionNodes_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private boolean enabled_;
    /**
     *
     *
     * <pre>
     * When this is enabled, cluster/node pool creations will ignore non-fatal
     * errors like stockout to best provision as many nodes as possible right now
     * and eventually bring up all target number of nodes
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     *
     *
     * <pre>
     * When this is enabled, cluster/node pool creations will ignore non-fatal
     * errors like stockout to best provision as many nodes as possible right now
     * and eventually bring up all target number of nodes
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {

      enabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When this is enabled, cluster/node pool creations will ignore non-fatal
     * errors like stockout to best provision as many nodes as possible right now
     * and eventually bring up all target number of nodes
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private int minProvisionNodes_;
    /**
     *
     *
     * <pre>
     * Minimum number of nodes to be provisioned to be considered as succeeded,
     * and the rest of nodes will be provisioned gradually and eventually when
     * stockout issue has been resolved.
     * </pre>
     *
     * <code>int32 min_provision_nodes = 2;</code>
     *
     * @return The minProvisionNodes.
     */
    @java.lang.Override
    public int getMinProvisionNodes() {
      return minProvisionNodes_;
    }
    /**
     *
     *
     * <pre>
     * Minimum number of nodes to be provisioned to be considered as succeeded,
     * and the rest of nodes will be provisioned gradually and eventually when
     * stockout issue has been resolved.
     * </pre>
     *
     * <code>int32 min_provision_nodes = 2;</code>
     *
     * @param value The minProvisionNodes to set.
     * @return This builder for chaining.
     */
    public Builder setMinProvisionNodes(int value) {

      minProvisionNodes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Minimum number of nodes to be provisioned to be considered as succeeded,
     * and the rest of nodes will be provisioned gradually and eventually when
     * stockout issue has been resolved.
     * </pre>
     *
     * <code>int32 min_provision_nodes = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinProvisionNodes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minProvisionNodes_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.BestEffortProvisioning)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.BestEffortProvisioning)
  private static final com.google.container.v1beta1.BestEffortProvisioning DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.BestEffortProvisioning();
  }

  public static com.google.container.v1beta1.BestEffortProvisioning getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BestEffortProvisioning> PARSER =
      new com.google.protobuf.AbstractParser<BestEffortProvisioning>() {
        @java.lang.Override
        public BestEffortProvisioning parsePartialFrom(
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

  public static com.google.protobuf.Parser<BestEffortProvisioning> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BestEffortProvisioning> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.BestEffortProvisioning getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
