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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

/**
 *
 *
 * <pre>
 * NodePoolLoggingConfig specifies logging configuration for nodepools.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.NodePoolLoggingConfig}
 */
public final class NodePoolLoggingConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.NodePoolLoggingConfig)
    NodePoolLoggingConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NodePoolLoggingConfig.newBuilder() to construct.
  private NodePoolLoggingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NodePoolLoggingConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NodePoolLoggingConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_NodePoolLoggingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_NodePoolLoggingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.NodePoolLoggingConfig.class,
            com.google.container.v1.NodePoolLoggingConfig.Builder.class);
  }

  private int bitField0_;
  public static final int VARIANT_CONFIG_FIELD_NUMBER = 1;
  private com.google.container.v1.LoggingVariantConfig variantConfig_;
  /**
   *
   *
   * <pre>
   * Logging variant configuration.
   * </pre>
   *
   * <code>.google.container.v1.LoggingVariantConfig variant_config = 1;</code>
   *
   * @return Whether the variantConfig field is set.
   */
  @java.lang.Override
  public boolean hasVariantConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Logging variant configuration.
   * </pre>
   *
   * <code>.google.container.v1.LoggingVariantConfig variant_config = 1;</code>
   *
   * @return The variantConfig.
   */
  @java.lang.Override
  public com.google.container.v1.LoggingVariantConfig getVariantConfig() {
    return variantConfig_ == null
        ? com.google.container.v1.LoggingVariantConfig.getDefaultInstance()
        : variantConfig_;
  }
  /**
   *
   *
   * <pre>
   * Logging variant configuration.
   * </pre>
   *
   * <code>.google.container.v1.LoggingVariantConfig variant_config = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1.LoggingVariantConfigOrBuilder getVariantConfigOrBuilder() {
    return variantConfig_ == null
        ? com.google.container.v1.LoggingVariantConfig.getDefaultInstance()
        : variantConfig_;
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
      output.writeMessage(1, getVariantConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getVariantConfig());
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
    if (!(obj instanceof com.google.container.v1.NodePoolLoggingConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.NodePoolLoggingConfig other =
        (com.google.container.v1.NodePoolLoggingConfig) obj;

    if (hasVariantConfig() != other.hasVariantConfig()) return false;
    if (hasVariantConfig()) {
      if (!getVariantConfig().equals(other.getVariantConfig())) return false;
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
    if (hasVariantConfig()) {
      hash = (37 * hash) + VARIANT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getVariantConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.NodePoolLoggingConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.NodePoolLoggingConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.NodePoolLoggingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.NodePoolLoggingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.NodePoolLoggingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.NodePoolLoggingConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.NodePoolLoggingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.NodePoolLoggingConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.NodePoolLoggingConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.NodePoolLoggingConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.NodePoolLoggingConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.NodePoolLoggingConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.NodePoolLoggingConfig prototype) {
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
   * NodePoolLoggingConfig specifies logging configuration for nodepools.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.NodePoolLoggingConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.NodePoolLoggingConfig)
      com.google.container.v1.NodePoolLoggingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_NodePoolLoggingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_NodePoolLoggingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.NodePoolLoggingConfig.class,
              com.google.container.v1.NodePoolLoggingConfig.Builder.class);
    }

    // Construct using com.google.container.v1.NodePoolLoggingConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getVariantConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      variantConfig_ = null;
      if (variantConfigBuilder_ != null) {
        variantConfigBuilder_.dispose();
        variantConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_NodePoolLoggingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.NodePoolLoggingConfig getDefaultInstanceForType() {
      return com.google.container.v1.NodePoolLoggingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.NodePoolLoggingConfig build() {
      com.google.container.v1.NodePoolLoggingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.NodePoolLoggingConfig buildPartial() {
      com.google.container.v1.NodePoolLoggingConfig result =
          new com.google.container.v1.NodePoolLoggingConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.NodePoolLoggingConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.variantConfig_ =
            variantConfigBuilder_ == null ? variantConfig_ : variantConfigBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.container.v1.NodePoolLoggingConfig) {
        return mergeFrom((com.google.container.v1.NodePoolLoggingConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.NodePoolLoggingConfig other) {
      if (other == com.google.container.v1.NodePoolLoggingConfig.getDefaultInstance()) return this;
      if (other.hasVariantConfig()) {
        mergeVariantConfig(other.getVariantConfig());
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
                input.readMessage(getVariantConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.container.v1.LoggingVariantConfig variantConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.LoggingVariantConfig,
            com.google.container.v1.LoggingVariantConfig.Builder,
            com.google.container.v1.LoggingVariantConfigOrBuilder>
        variantConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Logging variant configuration.
     * </pre>
     *
     * <code>.google.container.v1.LoggingVariantConfig variant_config = 1;</code>
     *
     * @return Whether the variantConfig field is set.
     */
    public boolean hasVariantConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Logging variant configuration.
     * </pre>
     *
     * <code>.google.container.v1.LoggingVariantConfig variant_config = 1;</code>
     *
     * @return The variantConfig.
     */
    public com.google.container.v1.LoggingVariantConfig getVariantConfig() {
      if (variantConfigBuilder_ == null) {
        return variantConfig_ == null
            ? com.google.container.v1.LoggingVariantConfig.getDefaultInstance()
            : variantConfig_;
      } else {
        return variantConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Logging variant configuration.
     * </pre>
     *
     * <code>.google.container.v1.LoggingVariantConfig variant_config = 1;</code>
     */
    public Builder setVariantConfig(com.google.container.v1.LoggingVariantConfig value) {
      if (variantConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        variantConfig_ = value;
      } else {
        variantConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Logging variant configuration.
     * </pre>
     *
     * <code>.google.container.v1.LoggingVariantConfig variant_config = 1;</code>
     */
    public Builder setVariantConfig(
        com.google.container.v1.LoggingVariantConfig.Builder builderForValue) {
      if (variantConfigBuilder_ == null) {
        variantConfig_ = builderForValue.build();
      } else {
        variantConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Logging variant configuration.
     * </pre>
     *
     * <code>.google.container.v1.LoggingVariantConfig variant_config = 1;</code>
     */
    public Builder mergeVariantConfig(com.google.container.v1.LoggingVariantConfig value) {
      if (variantConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && variantConfig_ != null
            && variantConfig_
                != com.google.container.v1.LoggingVariantConfig.getDefaultInstance()) {
          getVariantConfigBuilder().mergeFrom(value);
        } else {
          variantConfig_ = value;
        }
      } else {
        variantConfigBuilder_.mergeFrom(value);
      }
      if (variantConfig_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Logging variant configuration.
     * </pre>
     *
     * <code>.google.container.v1.LoggingVariantConfig variant_config = 1;</code>
     */
    public Builder clearVariantConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      variantConfig_ = null;
      if (variantConfigBuilder_ != null) {
        variantConfigBuilder_.dispose();
        variantConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Logging variant configuration.
     * </pre>
     *
     * <code>.google.container.v1.LoggingVariantConfig variant_config = 1;</code>
     */
    public com.google.container.v1.LoggingVariantConfig.Builder getVariantConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getVariantConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Logging variant configuration.
     * </pre>
     *
     * <code>.google.container.v1.LoggingVariantConfig variant_config = 1;</code>
     */
    public com.google.container.v1.LoggingVariantConfigOrBuilder getVariantConfigOrBuilder() {
      if (variantConfigBuilder_ != null) {
        return variantConfigBuilder_.getMessageOrBuilder();
      } else {
        return variantConfig_ == null
            ? com.google.container.v1.LoggingVariantConfig.getDefaultInstance()
            : variantConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Logging variant configuration.
     * </pre>
     *
     * <code>.google.container.v1.LoggingVariantConfig variant_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.LoggingVariantConfig,
            com.google.container.v1.LoggingVariantConfig.Builder,
            com.google.container.v1.LoggingVariantConfigOrBuilder>
        getVariantConfigFieldBuilder() {
      if (variantConfigBuilder_ == null) {
        variantConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.container.v1.LoggingVariantConfig,
                com.google.container.v1.LoggingVariantConfig.Builder,
                com.google.container.v1.LoggingVariantConfigOrBuilder>(
                getVariantConfig(), getParentForChildren(), isClean());
        variantConfig_ = null;
      }
      return variantConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.NodePoolLoggingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.NodePoolLoggingConfig)
  private static final com.google.container.v1.NodePoolLoggingConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.NodePoolLoggingConfig();
  }

  public static com.google.container.v1.NodePoolLoggingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodePoolLoggingConfig> PARSER =
      new com.google.protobuf.AbstractParser<NodePoolLoggingConfig>() {
        @java.lang.Override
        public NodePoolLoggingConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<NodePoolLoggingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodePoolLoggingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.NodePoolLoggingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
