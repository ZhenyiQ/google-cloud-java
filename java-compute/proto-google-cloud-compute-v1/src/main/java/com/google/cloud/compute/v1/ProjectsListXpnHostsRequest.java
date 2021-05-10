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
 * Protobuf type {@code google.cloud.compute.v1.ProjectsListXpnHostsRequest}
 */
public final class ProjectsListXpnHostsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ProjectsListXpnHostsRequest)
    ProjectsListXpnHostsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProjectsListXpnHostsRequest.newBuilder() to construct.
  private ProjectsListXpnHostsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProjectsListXpnHostsRequest() {
    organization_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProjectsListXpnHostsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ProjectsListXpnHostsRequest(
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
          case 841443738:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              organization_ = s;
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
        .internal_static_google_cloud_compute_v1_ProjectsListXpnHostsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ProjectsListXpnHostsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ProjectsListXpnHostsRequest.class,
            com.google.cloud.compute.v1.ProjectsListXpnHostsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ORGANIZATION_FIELD_NUMBER = 105180467;
  private volatile java.lang.Object organization_;
  /**
   *
   *
   * <pre>
   * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project.
   * </pre>
   *
   * <code>string organization = 105180467;</code>
   *
   * @return Whether the organization field is set.
   */
  @java.lang.Override
  public boolean hasOrganization() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project.
   * </pre>
   *
   * <code>string organization = 105180467;</code>
   *
   * @return The organization.
   */
  @java.lang.Override
  public java.lang.String getOrganization() {
    java.lang.Object ref = organization_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      organization_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project.
   * </pre>
   *
   * <code>string organization = 105180467;</code>
   *
   * @return The bytes for organization.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOrganizationBytes() {
    java.lang.Object ref = organization_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      organization_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 105180467, organization_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(105180467, organization_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ProjectsListXpnHostsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ProjectsListXpnHostsRequest other =
        (com.google.cloud.compute.v1.ProjectsListXpnHostsRequest) obj;

    if (hasOrganization() != other.hasOrganization()) return false;
    if (hasOrganization()) {
      if (!getOrganization().equals(other.getOrganization())) return false;
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
    if (hasOrganization()) {
      hash = (37 * hash) + ORGANIZATION_FIELD_NUMBER;
      hash = (53 * hash) + getOrganization().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ProjectsListXpnHostsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsListXpnHostsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsListXpnHostsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsListXpnHostsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsListXpnHostsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsListXpnHostsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsListXpnHostsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsListXpnHostsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsListXpnHostsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsListXpnHostsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsListXpnHostsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsListXpnHostsRequest parseFrom(
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
      com.google.cloud.compute.v1.ProjectsListXpnHostsRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.ProjectsListXpnHostsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ProjectsListXpnHostsRequest)
      com.google.cloud.compute.v1.ProjectsListXpnHostsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsListXpnHostsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsListXpnHostsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ProjectsListXpnHostsRequest.class,
              com.google.cloud.compute.v1.ProjectsListXpnHostsRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ProjectsListXpnHostsRequest.newBuilder()
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
      organization_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsListXpnHostsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsListXpnHostsRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ProjectsListXpnHostsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsListXpnHostsRequest build() {
      com.google.cloud.compute.v1.ProjectsListXpnHostsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsListXpnHostsRequest buildPartial() {
      com.google.cloud.compute.v1.ProjectsListXpnHostsRequest result =
          new com.google.cloud.compute.v1.ProjectsListXpnHostsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.organization_ = organization_;
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
      if (other instanceof com.google.cloud.compute.v1.ProjectsListXpnHostsRequest) {
        return mergeFrom((com.google.cloud.compute.v1.ProjectsListXpnHostsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ProjectsListXpnHostsRequest other) {
      if (other == com.google.cloud.compute.v1.ProjectsListXpnHostsRequest.getDefaultInstance())
        return this;
      if (other.hasOrganization()) {
        bitField0_ |= 0x00000001;
        organization_ = other.organization_;
        onChanged();
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
      com.google.cloud.compute.v1.ProjectsListXpnHostsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.ProjectsListXpnHostsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object organization_ = "";
    /**
     *
     *
     * <pre>
     * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project.
     * </pre>
     *
     * <code>string organization = 105180467;</code>
     *
     * @return Whether the organization field is set.
     */
    public boolean hasOrganization() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project.
     * </pre>
     *
     * <code>string organization = 105180467;</code>
     *
     * @return The organization.
     */
    public java.lang.String getOrganization() {
      java.lang.Object ref = organization_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        organization_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project.
     * </pre>
     *
     * <code>string organization = 105180467;</code>
     *
     * @return The bytes for organization.
     */
    public com.google.protobuf.ByteString getOrganizationBytes() {
      java.lang.Object ref = organization_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        organization_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project.
     * </pre>
     *
     * <code>string organization = 105180467;</code>
     *
     * @param value The organization to set.
     * @return This builder for chaining.
     */
    public Builder setOrganization(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      organization_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project.
     * </pre>
     *
     * <code>string organization = 105180467;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOrganization() {
      bitField0_ = (bitField0_ & ~0x00000001);
      organization_ = getDefaultInstance().getOrganization();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project.
     * </pre>
     *
     * <code>string organization = 105180467;</code>
     *
     * @param value The bytes for organization to set.
     * @return This builder for chaining.
     */
    public Builder setOrganizationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      organization_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ProjectsListXpnHostsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ProjectsListXpnHostsRequest)
  private static final com.google.cloud.compute.v1.ProjectsListXpnHostsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ProjectsListXpnHostsRequest();
  }

  public static com.google.cloud.compute.v1.ProjectsListXpnHostsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProjectsListXpnHostsRequest> PARSER =
      new com.google.protobuf.AbstractParser<ProjectsListXpnHostsRequest>() {
        @java.lang.Override
        public ProjectsListXpnHostsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ProjectsListXpnHostsRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ProjectsListXpnHostsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProjectsListXpnHostsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ProjectsListXpnHostsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
