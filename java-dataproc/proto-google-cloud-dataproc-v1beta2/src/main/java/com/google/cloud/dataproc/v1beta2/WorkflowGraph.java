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
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

/**
 *
 *
 * <pre>
 * The workflow graph.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1beta2.WorkflowGraph}
 */
public final class WorkflowGraph extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1beta2.WorkflowGraph)
    WorkflowGraphOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WorkflowGraph.newBuilder() to construct.
  private WorkflowGraph(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WorkflowGraph() {
    nodes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WorkflowGraph();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private WorkflowGraph(
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
                nodes_ = new java.util.ArrayList<com.google.cloud.dataproc.v1beta2.WorkflowNode>();
                mutable_bitField0_ |= 0x00000001;
              }
              nodes_.add(
                  input.readMessage(
                      com.google.cloud.dataproc.v1beta2.WorkflowNode.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        nodes_ = java.util.Collections.unmodifiableList(nodes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1beta2_WorkflowGraph_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1beta2_WorkflowGraph_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1beta2.WorkflowGraph.class,
            com.google.cloud.dataproc.v1beta2.WorkflowGraph.Builder.class);
  }

  public static final int NODES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dataproc.v1beta2.WorkflowNode> nodes_;
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  public java.util.List<com.google.cloud.dataproc.v1beta2.WorkflowNode> getNodesList() {
    return nodes_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  public java.util.List<? extends com.google.cloud.dataproc.v1beta2.WorkflowNodeOrBuilder>
      getNodesOrBuilderList() {
    return nodes_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  public int getNodesCount() {
    return nodes_.size();
  }
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  public com.google.cloud.dataproc.v1beta2.WorkflowNode getNodes(int index) {
    return nodes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  public com.google.cloud.dataproc.v1beta2.WorkflowNodeOrBuilder getNodesOrBuilder(int index) {
    return nodes_.get(index);
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
    for (int i = 0; i < nodes_.size(); i++) {
      output.writeMessage(1, nodes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nodes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, nodes_.get(i));
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
    if (!(obj instanceof com.google.cloud.dataproc.v1beta2.WorkflowGraph)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1beta2.WorkflowGraph other =
        (com.google.cloud.dataproc.v1beta2.WorkflowGraph) obj;

    if (!getNodesList().equals(other.getNodesList())) return false;
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
    if (getNodesCount() > 0) {
      hash = (37 * hash) + NODES_FIELD_NUMBER;
      hash = (53 * hash) + getNodesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowGraph parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowGraph parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowGraph parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowGraph parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowGraph parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowGraph parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowGraph parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowGraph parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowGraph parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowGraph parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowGraph parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowGraph parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1beta2.WorkflowGraph prototype) {
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
   * The workflow graph.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1beta2.WorkflowGraph}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1beta2.WorkflowGraph)
      com.google.cloud.dataproc.v1beta2.WorkflowGraphOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1beta2_WorkflowGraph_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1beta2_WorkflowGraph_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1beta2.WorkflowGraph.class,
              com.google.cloud.dataproc.v1beta2.WorkflowGraph.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1beta2.WorkflowGraph.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getNodesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (nodesBuilder_ == null) {
        nodes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        nodesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1beta2_WorkflowGraph_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.WorkflowGraph getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1beta2.WorkflowGraph.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.WorkflowGraph build() {
      com.google.cloud.dataproc.v1beta2.WorkflowGraph result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.WorkflowGraph buildPartial() {
      com.google.cloud.dataproc.v1beta2.WorkflowGraph result =
          new com.google.cloud.dataproc.v1beta2.WorkflowGraph(this);
      int from_bitField0_ = bitField0_;
      if (nodesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nodes_ = java.util.Collections.unmodifiableList(nodes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nodes_ = nodes_;
      } else {
        result.nodes_ = nodesBuilder_.build();
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
      if (other instanceof com.google.cloud.dataproc.v1beta2.WorkflowGraph) {
        return mergeFrom((com.google.cloud.dataproc.v1beta2.WorkflowGraph) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1beta2.WorkflowGraph other) {
      if (other == com.google.cloud.dataproc.v1beta2.WorkflowGraph.getDefaultInstance())
        return this;
      if (nodesBuilder_ == null) {
        if (!other.nodes_.isEmpty()) {
          if (nodes_.isEmpty()) {
            nodes_ = other.nodes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNodesIsMutable();
            nodes_.addAll(other.nodes_);
          }
          onChanged();
        }
      } else {
        if (!other.nodes_.isEmpty()) {
          if (nodesBuilder_.isEmpty()) {
            nodesBuilder_.dispose();
            nodesBuilder_ = null;
            nodes_ = other.nodes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nodesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getNodesFieldBuilder()
                    : null;
          } else {
            nodesBuilder_.addAllMessages(other.nodes_);
          }
        }
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
      com.google.cloud.dataproc.v1beta2.WorkflowGraph parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1beta2.WorkflowGraph) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.dataproc.v1beta2.WorkflowNode> nodes_ =
        java.util.Collections.emptyList();

    private void ensureNodesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nodes_ = new java.util.ArrayList<com.google.cloud.dataproc.v1beta2.WorkflowNode>(nodes_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataproc.v1beta2.WorkflowNode,
            com.google.cloud.dataproc.v1beta2.WorkflowNode.Builder,
            com.google.cloud.dataproc.v1beta2.WorkflowNodeOrBuilder>
        nodesBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.dataproc.v1beta2.WorkflowNode> getNodesList() {
      if (nodesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nodes_);
      } else {
        return nodesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public int getNodesCount() {
      if (nodesBuilder_ == null) {
        return nodes_.size();
      } else {
        return nodesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1beta2.WorkflowNode getNodes(int index) {
      if (nodesBuilder_ == null) {
        return nodes_.get(index);
      } else {
        return nodesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setNodes(int index, com.google.cloud.dataproc.v1beta2.WorkflowNode value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.set(index, value);
        onChanged();
      } else {
        nodesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setNodes(
        int index, com.google.cloud.dataproc.v1beta2.WorkflowNode.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.set(index, builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addNodes(com.google.cloud.dataproc.v1beta2.WorkflowNode value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.add(value);
        onChanged();
      } else {
        nodesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addNodes(int index, com.google.cloud.dataproc.v1beta2.WorkflowNode value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.add(index, value);
        onChanged();
      } else {
        nodesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addNodes(
        com.google.cloud.dataproc.v1beta2.WorkflowNode.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.add(builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addNodes(
        int index, com.google.cloud.dataproc.v1beta2.WorkflowNode.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.add(index, builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAllNodes(
        java.lang.Iterable<? extends com.google.cloud.dataproc.v1beta2.WorkflowNode> values) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, nodes_);
        onChanged();
      } else {
        nodesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearNodes() {
      if (nodesBuilder_ == null) {
        nodes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nodesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder removeNodes(int index) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.remove(index);
        onChanged();
      } else {
        nodesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1beta2.WorkflowNode.Builder getNodesBuilder(int index) {
      return getNodesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1beta2.WorkflowNodeOrBuilder getNodesOrBuilder(int index) {
      if (nodesBuilder_ == null) {
        return nodes_.get(index);
      } else {
        return nodesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.dataproc.v1beta2.WorkflowNodeOrBuilder>
        getNodesOrBuilderList() {
      if (nodesBuilder_ != null) {
        return nodesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nodes_);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1beta2.WorkflowNode.Builder addNodesBuilder() {
      return getNodesFieldBuilder()
          .addBuilder(com.google.cloud.dataproc.v1beta2.WorkflowNode.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1beta2.WorkflowNode.Builder addNodesBuilder(int index) {
      return getNodesFieldBuilder()
          .addBuilder(index, com.google.cloud.dataproc.v1beta2.WorkflowNode.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.dataproc.v1beta2.WorkflowNode.Builder>
        getNodesBuilderList() {
      return getNodesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataproc.v1beta2.WorkflowNode,
            com.google.cloud.dataproc.v1beta2.WorkflowNode.Builder,
            com.google.cloud.dataproc.v1beta2.WorkflowNodeOrBuilder>
        getNodesFieldBuilder() {
      if (nodesBuilder_ == null) {
        nodesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dataproc.v1beta2.WorkflowNode,
                com.google.cloud.dataproc.v1beta2.WorkflowNode.Builder,
                com.google.cloud.dataproc.v1beta2.WorkflowNodeOrBuilder>(
                nodes_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        nodes_ = null;
      }
      return nodesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1beta2.WorkflowGraph)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1beta2.WorkflowGraph)
  private static final com.google.cloud.dataproc.v1beta2.WorkflowGraph DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1beta2.WorkflowGraph();
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowGraph getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkflowGraph> PARSER =
      new com.google.protobuf.AbstractParser<WorkflowGraph>() {
        @java.lang.Override
        public WorkflowGraph parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new WorkflowGraph(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<WorkflowGraph> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkflowGraph> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1beta2.WorkflowGraph getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
