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
// source: google/api/cloudquotas/v1/resources.proto

package com.google.api.cloudquotas.v1;

/**
 *
 *
 * <pre>
 * Eligibility information regarding requesting increase adjustment of a quota.
 * </pre>
 *
 * Protobuf type {@code google.api.cloudquotas.v1.QuotaIncreaseEligibility}
 */
public final class QuotaIncreaseEligibility extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.cloudquotas.v1.QuotaIncreaseEligibility)
    QuotaIncreaseEligibilityOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use QuotaIncreaseEligibility.newBuilder() to construct.
  private QuotaIncreaseEligibility(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private QuotaIncreaseEligibility() {
    ineligibilityReason_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new QuotaIncreaseEligibility();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.cloudquotas.v1.ResourcesProto
        .internal_static_google_api_cloudquotas_v1_QuotaIncreaseEligibility_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.cloudquotas.v1.ResourcesProto
        .internal_static_google_api_cloudquotas_v1_QuotaIncreaseEligibility_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.class,
            com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The enumeration of reasons when it is ineligible to request increase
   * adjustment.
   * </pre>
   *
   * Protobuf enum {@code google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason}
   */
  public enum IneligibilityReason implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value when is_eligible is true.
     * </pre>
     *
     * <code>INELIGIBILITY_REASON_UNSPECIFIED = 0;</code>
     */
    INELIGIBILITY_REASON_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The container is not linked with a billing account.
     * </pre>
     *
     * <code>NO_BILLING_ACCOUNT = 2;</code>
     */
    NO_BILLING_ACCOUNT(2),
    /**
     *
     *
     * <pre>
     * Other reasons.
     * </pre>
     *
     * <code>OTHER = 3;</code>
     */
    OTHER(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value when is_eligible is true.
     * </pre>
     *
     * <code>INELIGIBILITY_REASON_UNSPECIFIED = 0;</code>
     */
    public static final int INELIGIBILITY_REASON_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The container is not linked with a billing account.
     * </pre>
     *
     * <code>NO_BILLING_ACCOUNT = 2;</code>
     */
    public static final int NO_BILLING_ACCOUNT_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Other reasons.
     * </pre>
     *
     * <code>OTHER = 3;</code>
     */
    public static final int OTHER_VALUE = 3;

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
    public static IneligibilityReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IneligibilityReason forNumber(int value) {
      switch (value) {
        case 0:
          return INELIGIBILITY_REASON_UNSPECIFIED;
        case 2:
          return NO_BILLING_ACCOUNT;
        case 3:
          return OTHER;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IneligibilityReason>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<IneligibilityReason>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<IneligibilityReason>() {
              public IneligibilityReason findValueByNumber(int number) {
                return IneligibilityReason.forNumber(number);
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
      return com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final IneligibilityReason[] VALUES = values();

    public static IneligibilityReason valueOf(
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

    private IneligibilityReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason)
  }

  public static final int IS_ELIGIBLE_FIELD_NUMBER = 1;
  private boolean isEligible_ = false;
  /**
   *
   *
   * <pre>
   * Whether a higher quota value can be requested for the quota.
   * </pre>
   *
   * <code>bool is_eligible = 1;</code>
   *
   * @return The isEligible.
   */
  @java.lang.Override
  public boolean getIsEligible() {
    return isEligible_;
  }

  public static final int INELIGIBILITY_REASON_FIELD_NUMBER = 2;
  private int ineligibilityReason_ = 0;
  /**
   *
   *
   * <pre>
   * The reason of why it is ineligible to request increased value of the quota.
   * If the is_eligible field is true, it defaults to
   * INELIGIBILITY_REASON_UNSPECIFIED.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason ineligibility_reason = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for ineligibilityReason.
   */
  @java.lang.Override
  public int getIneligibilityReasonValue() {
    return ineligibilityReason_;
  }
  /**
   *
   *
   * <pre>
   * The reason of why it is ineligible to request increased value of the quota.
   * If the is_eligible field is true, it defaults to
   * INELIGIBILITY_REASON_UNSPECIFIED.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason ineligibility_reason = 2;
   * </code>
   *
   * @return The ineligibilityReason.
   */
  @java.lang.Override
  public com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason
      getIneligibilityReason() {
    com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason result =
        com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason.forNumber(
            ineligibilityReason_);
    return result == null
        ? com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason.UNRECOGNIZED
        : result;
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
    if (isEligible_ != false) {
      output.writeBool(1, isEligible_);
    }
    if (ineligibilityReason_
        != com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason
            .INELIGIBILITY_REASON_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, ineligibilityReason_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isEligible_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, isEligible_);
    }
    if (ineligibilityReason_
        != com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason
            .INELIGIBILITY_REASON_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, ineligibilityReason_);
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
    if (!(obj instanceof com.google.api.cloudquotas.v1.QuotaIncreaseEligibility)) {
      return super.equals(obj);
    }
    com.google.api.cloudquotas.v1.QuotaIncreaseEligibility other =
        (com.google.api.cloudquotas.v1.QuotaIncreaseEligibility) obj;

    if (getIsEligible() != other.getIsEligible()) return false;
    if (ineligibilityReason_ != other.ineligibilityReason_) return false;
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
    hash = (37 * hash) + IS_ELIGIBLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsEligible());
    hash = (37 * hash) + INELIGIBILITY_REASON_FIELD_NUMBER;
    hash = (53 * hash) + ineligibilityReason_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.cloudquotas.v1.QuotaIncreaseEligibility parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.cloudquotas.v1.QuotaIncreaseEligibility parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1.QuotaIncreaseEligibility parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.cloudquotas.v1.QuotaIncreaseEligibility parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1.QuotaIncreaseEligibility parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.cloudquotas.v1.QuotaIncreaseEligibility parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1.QuotaIncreaseEligibility parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.cloudquotas.v1.QuotaIncreaseEligibility parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1.QuotaIncreaseEligibility parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.cloudquotas.v1.QuotaIncreaseEligibility parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1.QuotaIncreaseEligibility parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.cloudquotas.v1.QuotaIncreaseEligibility parseFrom(
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
      com.google.api.cloudquotas.v1.QuotaIncreaseEligibility prototype) {
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
   * Eligibility information regarding requesting increase adjustment of a quota.
   * </pre>
   *
   * Protobuf type {@code google.api.cloudquotas.v1.QuotaIncreaseEligibility}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.cloudquotas.v1.QuotaIncreaseEligibility)
      com.google.api.cloudquotas.v1.QuotaIncreaseEligibilityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.cloudquotas.v1.ResourcesProto
          .internal_static_google_api_cloudquotas_v1_QuotaIncreaseEligibility_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.cloudquotas.v1.ResourcesProto
          .internal_static_google_api_cloudquotas_v1_QuotaIncreaseEligibility_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.class,
              com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.Builder.class);
    }

    // Construct using com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      isEligible_ = false;
      ineligibilityReason_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.cloudquotas.v1.ResourcesProto
          .internal_static_google_api_cloudquotas_v1_QuotaIncreaseEligibility_descriptor;
    }

    @java.lang.Override
    public com.google.api.cloudquotas.v1.QuotaIncreaseEligibility getDefaultInstanceForType() {
      return com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.cloudquotas.v1.QuotaIncreaseEligibility build() {
      com.google.api.cloudquotas.v1.QuotaIncreaseEligibility result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.cloudquotas.v1.QuotaIncreaseEligibility buildPartial() {
      com.google.api.cloudquotas.v1.QuotaIncreaseEligibility result =
          new com.google.api.cloudquotas.v1.QuotaIncreaseEligibility(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.cloudquotas.v1.QuotaIncreaseEligibility result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isEligible_ = isEligible_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ineligibilityReason_ = ineligibilityReason_;
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
      if (other instanceof com.google.api.cloudquotas.v1.QuotaIncreaseEligibility) {
        return mergeFrom((com.google.api.cloudquotas.v1.QuotaIncreaseEligibility) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.cloudquotas.v1.QuotaIncreaseEligibility other) {
      if (other == com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.getDefaultInstance())
        return this;
      if (other.getIsEligible() != false) {
        setIsEligible(other.getIsEligible());
      }
      if (other.ineligibilityReason_ != 0) {
        setIneligibilityReasonValue(other.getIneligibilityReasonValue());
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
                isEligible_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                ineligibilityReason_ = input.readEnum();
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

    private boolean isEligible_;
    /**
     *
     *
     * <pre>
     * Whether a higher quota value can be requested for the quota.
     * </pre>
     *
     * <code>bool is_eligible = 1;</code>
     *
     * @return The isEligible.
     */
    @java.lang.Override
    public boolean getIsEligible() {
      return isEligible_;
    }
    /**
     *
     *
     * <pre>
     * Whether a higher quota value can be requested for the quota.
     * </pre>
     *
     * <code>bool is_eligible = 1;</code>
     *
     * @param value The isEligible to set.
     * @return This builder for chaining.
     */
    public Builder setIsEligible(boolean value) {

      isEligible_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether a higher quota value can be requested for the quota.
     * </pre>
     *
     * <code>bool is_eligible = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIsEligible() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isEligible_ = false;
      onChanged();
      return this;
    }

    private int ineligibilityReason_ = 0;
    /**
     *
     *
     * <pre>
     * The reason of why it is ineligible to request increased value of the quota.
     * If the is_eligible field is true, it defaults to
     * INELIGIBILITY_REASON_UNSPECIFIED.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason ineligibility_reason = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for ineligibilityReason.
     */
    @java.lang.Override
    public int getIneligibilityReasonValue() {
      return ineligibilityReason_;
    }
    /**
     *
     *
     * <pre>
     * The reason of why it is ineligible to request increased value of the quota.
     * If the is_eligible field is true, it defaults to
     * INELIGIBILITY_REASON_UNSPECIFIED.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason ineligibility_reason = 2;
     * </code>
     *
     * @param value The enum numeric value on the wire for ineligibilityReason to set.
     * @return This builder for chaining.
     */
    public Builder setIneligibilityReasonValue(int value) {
      ineligibilityReason_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reason of why it is ineligible to request increased value of the quota.
     * If the is_eligible field is true, it defaults to
     * INELIGIBILITY_REASON_UNSPECIFIED.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason ineligibility_reason = 2;
     * </code>
     *
     * @return The ineligibilityReason.
     */
    @java.lang.Override
    public com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason
        getIneligibilityReason() {
      com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason result =
          com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason.forNumber(
              ineligibilityReason_);
      return result == null
          ? com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The reason of why it is ineligible to request increased value of the quota.
     * If the is_eligible field is true, it defaults to
     * INELIGIBILITY_REASON_UNSPECIFIED.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason ineligibility_reason = 2;
     * </code>
     *
     * @param value The ineligibilityReason to set.
     * @return This builder for chaining.
     */
    public Builder setIneligibilityReason(
        com.google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      ineligibilityReason_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The reason of why it is ineligible to request increased value of the quota.
     * If the is_eligible field is true, it defaults to
     * INELIGIBILITY_REASON_UNSPECIFIED.
     * </pre>
     *
     * <code>
     * .google.api.cloudquotas.v1.QuotaIncreaseEligibility.IneligibilityReason ineligibility_reason = 2;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIneligibilityReason() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ineligibilityReason_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.api.cloudquotas.v1.QuotaIncreaseEligibility)
  }

  // @@protoc_insertion_point(class_scope:google.api.cloudquotas.v1.QuotaIncreaseEligibility)
  private static final com.google.api.cloudquotas.v1.QuotaIncreaseEligibility DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.cloudquotas.v1.QuotaIncreaseEligibility();
  }

  public static com.google.api.cloudquotas.v1.QuotaIncreaseEligibility getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuotaIncreaseEligibility> PARSER =
      new com.google.protobuf.AbstractParser<QuotaIncreaseEligibility>() {
        @java.lang.Override
        public QuotaIncreaseEligibility parsePartialFrom(
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

  public static com.google.protobuf.Parser<QuotaIncreaseEligibility> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuotaIncreaseEligibility> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.cloudquotas.v1.QuotaIncreaseEligibility getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
