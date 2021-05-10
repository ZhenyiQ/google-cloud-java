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
 * Information about any potential InterconnectAttachments between an Interconnect at a specific InterconnectLocation, and a specific Cloud Region.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InterconnectLocationRegionInfo}
 */
public final class InterconnectLocationRegionInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InterconnectLocationRegionInfo)
    InterconnectLocationRegionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InterconnectLocationRegionInfo.newBuilder() to construct.
  private InterconnectLocationRegionInfo(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InterconnectLocationRegionInfo() {
    expectedRttMs_ = "";
    locationPresence_ = 0;
    region_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InterconnectLocationRegionInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InterconnectLocationRegionInfo(
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
          case 812143144:
            {
              int rawValue = input.readEnum();
              bitField0_ |= 0x00000002;
              locationPresence_ = rawValue;
              break;
            }
          case 1111570338:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              region_ = s;
              break;
            }
          case -914616366:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              expectedRttMs_ = s;
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
        .internal_static_google_cloud_compute_v1_InterconnectLocationRegionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectLocationRegionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InterconnectLocationRegionInfo.class,
            com.google.cloud.compute.v1.InterconnectLocationRegionInfo.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Identifies the network presence of this location.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence}
   */
  public enum LocationPresence implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_LOCATION_PRESENCE = 0;</code>
     */
    UNDEFINED_LOCATION_PRESENCE(0),
    /** <code>GLOBAL = 494663587;</code> */
    GLOBAL(494663587),
    /** <code>LOCAL_REGION = 403535464;</code> */
    LOCAL_REGION(403535464),
    /** <code>LP_GLOBAL = 429584062;</code> */
    LP_GLOBAL(429584062),
    /** <code>LP_LOCAL_REGION = 488598851;</code> */
    LP_LOCAL_REGION(488598851),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_LOCATION_PRESENCE = 0;</code>
     */
    public static final int UNDEFINED_LOCATION_PRESENCE_VALUE = 0;
    /** <code>GLOBAL = 494663587;</code> */
    public static final int GLOBAL_VALUE = 494663587;
    /** <code>LOCAL_REGION = 403535464;</code> */
    public static final int LOCAL_REGION_VALUE = 403535464;
    /** <code>LP_GLOBAL = 429584062;</code> */
    public static final int LP_GLOBAL_VALUE = 429584062;
    /** <code>LP_LOCAL_REGION = 488598851;</code> */
    public static final int LP_LOCAL_REGION_VALUE = 488598851;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LocationPresence valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LocationPresence forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_LOCATION_PRESENCE;
        case 494663587:
          return GLOBAL;
        case 403535464:
          return LOCAL_REGION;
        case 429584062:
          return LP_GLOBAL;
        case 488598851:
          return LP_LOCAL_REGION;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LocationPresence> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<LocationPresence>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<LocationPresence>() {
              public LocationPresence findValueByNumber(int number) {
                return LocationPresence.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.compute.v1.InterconnectLocationRegionInfo.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final LocationPresence[] VALUES = values();

    public static LocationPresence valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LocationPresence(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence)
  }

  private int bitField0_;
  public static final int EXPECTED_RTT_MS_FIELD_NUMBER = 422543866;
  private volatile java.lang.Object expectedRttMs_;
  /**
   *
   *
   * <pre>
   * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
   * </pre>
   *
   * <code>string expected_rtt_ms = 422543866;</code>
   *
   * @return Whether the expectedRttMs field is set.
   */
  @java.lang.Override
  public boolean hasExpectedRttMs() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
   * </pre>
   *
   * <code>string expected_rtt_ms = 422543866;</code>
   *
   * @return The expectedRttMs.
   */
  @java.lang.Override
  public java.lang.String getExpectedRttMs() {
    java.lang.Object ref = expectedRttMs_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expectedRttMs_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
   * </pre>
   *
   * <code>string expected_rtt_ms = 422543866;</code>
   *
   * @return The bytes for expectedRttMs.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExpectedRttMsBytes() {
    java.lang.Object ref = expectedRttMs_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      expectedRttMs_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_PRESENCE_FIELD_NUMBER = 101517893;
  private int locationPresence_;
  /**
   *
   *
   * <pre>
   * Identifies the network presence of this location.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence location_presence = 101517893;
   * </code>
   *
   * @return Whether the locationPresence field is set.
   */
  @java.lang.Override
  public boolean hasLocationPresence() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Identifies the network presence of this location.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence location_presence = 101517893;
   * </code>
   *
   * @return The enum numeric value on the wire for locationPresence.
   */
  @java.lang.Override
  public int getLocationPresenceValue() {
    return locationPresence_;
  }
  /**
   *
   *
   * <pre>
   * Identifies the network presence of this location.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence location_presence = 101517893;
   * </code>
   *
   * @return The locationPresence.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence
      getLocationPresence() {
    @SuppressWarnings("deprecation")
    com.google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence result =
        com.google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence.valueOf(
            locationPresence_);
    return result == null
        ? com.google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence.UNRECOGNIZED
        : result;
  }

  public static final int REGION_FIELD_NUMBER = 138946292;
  private volatile java.lang.Object region_;
  /**
   *
   *
   * <pre>
   * URL for the region of this location.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  @java.lang.Override
  public boolean hasRegion() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * URL for the region of this location.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return The region.
   */
  @java.lang.Override
  public java.lang.String getRegion() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      region_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URL for the region of this location.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRegionBytes() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      region_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(101517893, locationPresence_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 138946292, region_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 422543866, expectedRttMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(101517893, locationPresence_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(138946292, region_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(422543866, expectedRttMs_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InterconnectLocationRegionInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InterconnectLocationRegionInfo other =
        (com.google.cloud.compute.v1.InterconnectLocationRegionInfo) obj;

    if (hasExpectedRttMs() != other.hasExpectedRttMs()) return false;
    if (hasExpectedRttMs()) {
      if (!getExpectedRttMs().equals(other.getExpectedRttMs())) return false;
    }
    if (hasLocationPresence() != other.hasLocationPresence()) return false;
    if (hasLocationPresence()) {
      if (locationPresence_ != other.locationPresence_) return false;
    }
    if (hasRegion() != other.hasRegion()) return false;
    if (hasRegion()) {
      if (!getRegion().equals(other.getRegion())) return false;
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
    if (hasExpectedRttMs()) {
      hash = (37 * hash) + EXPECTED_RTT_MS_FIELD_NUMBER;
      hash = (53 * hash) + getExpectedRttMs().hashCode();
    }
    if (hasLocationPresence()) {
      hash = (37 * hash) + LOCATION_PRESENCE_FIELD_NUMBER;
      hash = (53 * hash) + locationPresence_;
    }
    if (hasRegion()) {
      hash = (37 * hash) + REGION_FIELD_NUMBER;
      hash = (53 * hash) + getRegion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
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
      com.google.cloud.compute.v1.InterconnectLocationRegionInfo prototype) {
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
   * Information about any potential InterconnectAttachments between an Interconnect at a specific InterconnectLocation, and a specific Cloud Region.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InterconnectLocationRegionInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InterconnectLocationRegionInfo)
      com.google.cloud.compute.v1.InterconnectLocationRegionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectLocationRegionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectLocationRegionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InterconnectLocationRegionInfo.class,
              com.google.cloud.compute.v1.InterconnectLocationRegionInfo.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InterconnectLocationRegionInfo.newBuilder()
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
      expectedRttMs_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      locationPresence_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      region_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectLocationRegionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectLocationRegionInfo getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InterconnectLocationRegionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectLocationRegionInfo build() {
      com.google.cloud.compute.v1.InterconnectLocationRegionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectLocationRegionInfo buildPartial() {
      com.google.cloud.compute.v1.InterconnectLocationRegionInfo result =
          new com.google.cloud.compute.v1.InterconnectLocationRegionInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.expectedRttMs_ = expectedRttMs_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.locationPresence_ = locationPresence_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.region_ = region_;
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
      if (other instanceof com.google.cloud.compute.v1.InterconnectLocationRegionInfo) {
        return mergeFrom((com.google.cloud.compute.v1.InterconnectLocationRegionInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InterconnectLocationRegionInfo other) {
      if (other == com.google.cloud.compute.v1.InterconnectLocationRegionInfo.getDefaultInstance())
        return this;
      if (other.hasExpectedRttMs()) {
        bitField0_ |= 0x00000001;
        expectedRttMs_ = other.expectedRttMs_;
        onChanged();
      }
      if (other.hasLocationPresence()) {
        setLocationPresence(other.getLocationPresence());
      }
      if (other.hasRegion()) {
        bitField0_ |= 0x00000004;
        region_ = other.region_;
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
      com.google.cloud.compute.v1.InterconnectLocationRegionInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.InterconnectLocationRegionInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object expectedRttMs_ = "";
    /**
     *
     *
     * <pre>
     * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
     * </pre>
     *
     * <code>string expected_rtt_ms = 422543866;</code>
     *
     * @return Whether the expectedRttMs field is set.
     */
    public boolean hasExpectedRttMs() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
     * </pre>
     *
     * <code>string expected_rtt_ms = 422543866;</code>
     *
     * @return The expectedRttMs.
     */
    public java.lang.String getExpectedRttMs() {
      java.lang.Object ref = expectedRttMs_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expectedRttMs_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
     * </pre>
     *
     * <code>string expected_rtt_ms = 422543866;</code>
     *
     * @return The bytes for expectedRttMs.
     */
    public com.google.protobuf.ByteString getExpectedRttMsBytes() {
      java.lang.Object ref = expectedRttMs_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        expectedRttMs_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
     * </pre>
     *
     * <code>string expected_rtt_ms = 422543866;</code>
     *
     * @param value The expectedRttMs to set.
     * @return This builder for chaining.
     */
    public Builder setExpectedRttMs(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      expectedRttMs_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
     * </pre>
     *
     * <code>string expected_rtt_ms = 422543866;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExpectedRttMs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      expectedRttMs_ = getDefaultInstance().getExpectedRttMs();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
     * </pre>
     *
     * <code>string expected_rtt_ms = 422543866;</code>
     *
     * @param value The bytes for expectedRttMs to set.
     * @return This builder for chaining.
     */
    public Builder setExpectedRttMsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      expectedRttMs_ = value;
      onChanged();
      return this;
    }

    private int locationPresence_ = 0;
    /**
     *
     *
     * <pre>
     * Identifies the network presence of this location.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence location_presence = 101517893;
     * </code>
     *
     * @return Whether the locationPresence field is set.
     */
    @java.lang.Override
    public boolean hasLocationPresence() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Identifies the network presence of this location.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence location_presence = 101517893;
     * </code>
     *
     * @return The enum numeric value on the wire for locationPresence.
     */
    @java.lang.Override
    public int getLocationPresenceValue() {
      return locationPresence_;
    }
    /**
     *
     *
     * <pre>
     * Identifies the network presence of this location.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence location_presence = 101517893;
     * </code>
     *
     * @param value The enum numeric value on the wire for locationPresence to set.
     * @return This builder for chaining.
     */
    public Builder setLocationPresenceValue(int value) {
      bitField0_ |= 0x00000002;
      locationPresence_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifies the network presence of this location.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence location_presence = 101517893;
     * </code>
     *
     * @return The locationPresence.
     */
    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence
        getLocationPresence() {
      @SuppressWarnings("deprecation")
      com.google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence result =
          com.google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence.valueOf(
              locationPresence_);
      return result == null
          ? com.google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Identifies the network presence of this location.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence location_presence = 101517893;
     * </code>
     *
     * @param value The locationPresence to set.
     * @return This builder for chaining.
     */
    public Builder setLocationPresence(
        com.google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      locationPresence_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifies the network presence of this location.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence location_presence = 101517893;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocationPresence() {
      bitField0_ = (bitField0_ & ~0x00000002);
      locationPresence_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object region_ = "";
    /**
     *
     *
     * <pre>
     * URL for the region of this location.
     * </pre>
     *
     * <code>string region = 138946292;</code>
     *
     * @return Whether the region field is set.
     */
    public boolean hasRegion() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * URL for the region of this location.
     * </pre>
     *
     * <code>string region = 138946292;</code>
     *
     * @return The region.
     */
    public java.lang.String getRegion() {
      java.lang.Object ref = region_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        region_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL for the region of this location.
     * </pre>
     *
     * <code>string region = 138946292;</code>
     *
     * @return The bytes for region.
     */
    public com.google.protobuf.ByteString getRegionBytes() {
      java.lang.Object ref = region_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        region_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL for the region of this location.
     * </pre>
     *
     * <code>string region = 138946292;</code>
     *
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      region_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL for the region of this location.
     * </pre>
     *
     * <code>string region = 138946292;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRegion() {
      bitField0_ = (bitField0_ & ~0x00000004);
      region_ = getDefaultInstance().getRegion();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL for the region of this location.
     * </pre>
     *
     * <code>string region = 138946292;</code>
     *
     * @param value The bytes for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      region_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InterconnectLocationRegionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InterconnectLocationRegionInfo)
  private static final com.google.cloud.compute.v1.InterconnectLocationRegionInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InterconnectLocationRegionInfo();
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InterconnectLocationRegionInfo> PARSER =
      new com.google.protobuf.AbstractParser<InterconnectLocationRegionInfo>() {
        @java.lang.Override
        public InterconnectLocationRegionInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InterconnectLocationRegionInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InterconnectLocationRegionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InterconnectLocationRegionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectLocationRegionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
