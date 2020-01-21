/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Details of an interview.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.Interview}
 */
public final class Interview extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.Interview)
    InterviewOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Interview.newBuilder() to construct.
  private Interview(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Interview() {
    outcome_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Interview();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Interview(
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
          case 50:
            {
              com.google.cloud.talent.v4beta1.Rating.Builder subBuilder = null;
              if (rating_ != null) {
                subBuilder = rating_.toBuilder();
              }
              rating_ =
                  input.readMessage(
                      com.google.cloud.talent.v4beta1.Rating.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rating_);
                rating_ = subBuilder.buildPartial();
              }

              break;
            }
          case 56:
            {
              int rawValue = input.readEnum();

              outcome_ = rawValue;
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
    return com.google.cloud.talent.v4beta1.CommonProto
        .internal_static_google_cloud_talent_v4beta1_Interview_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.CommonProto
        .internal_static_google_cloud_talent_v4beta1_Interview_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.Interview.class,
            com.google.cloud.talent.v4beta1.Interview.Builder.class);
  }

  public static final int RATING_FIELD_NUMBER = 6;
  private com.google.cloud.talent.v4beta1.Rating rating_;
  /**
   *
   *
   * <pre>
   * The rating on this interview.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
   *
   * @return Whether the rating field is set.
   */
  public boolean hasRating() {
    return rating_ != null;
  }
  /**
   *
   *
   * <pre>
   * The rating on this interview.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
   *
   * @return The rating.
   */
  public com.google.cloud.talent.v4beta1.Rating getRating() {
    return rating_ == null ? com.google.cloud.talent.v4beta1.Rating.getDefaultInstance() : rating_;
  }
  /**
   *
   *
   * <pre>
   * The rating on this interview.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
   */
  public com.google.cloud.talent.v4beta1.RatingOrBuilder getRatingOrBuilder() {
    return getRating();
  }

  public static final int OUTCOME_FIELD_NUMBER = 7;
  private int outcome_;
  /**
   *
   *
   * <pre>
   * Required. The overall decision resulting from this interview (positive, negative,
   * nuetral).
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.Outcome outcome = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for outcome.
   */
  public int getOutcomeValue() {
    return outcome_;
  }
  /**
   *
   *
   * <pre>
   * Required. The overall decision resulting from this interview (positive, negative,
   * nuetral).
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.Outcome outcome = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The outcome.
   */
  public com.google.cloud.talent.v4beta1.Outcome getOutcome() {
    @SuppressWarnings("deprecation")
    com.google.cloud.talent.v4beta1.Outcome result =
        com.google.cloud.talent.v4beta1.Outcome.valueOf(outcome_);
    return result == null ? com.google.cloud.talent.v4beta1.Outcome.UNRECOGNIZED : result;
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
    if (rating_ != null) {
      output.writeMessage(6, getRating());
    }
    if (outcome_ != com.google.cloud.talent.v4beta1.Outcome.OUTCOME_UNSPECIFIED.getNumber()) {
      output.writeEnum(7, outcome_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rating_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, getRating());
    }
    if (outcome_ != com.google.cloud.talent.v4beta1.Outcome.OUTCOME_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(7, outcome_);
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.Interview)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.Interview other =
        (com.google.cloud.talent.v4beta1.Interview) obj;

    if (hasRating() != other.hasRating()) return false;
    if (hasRating()) {
      if (!getRating().equals(other.getRating())) return false;
    }
    if (outcome_ != other.outcome_) return false;
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
    if (hasRating()) {
      hash = (37 * hash) + RATING_FIELD_NUMBER;
      hash = (53 * hash) + getRating().hashCode();
    }
    hash = (37 * hash) + OUTCOME_FIELD_NUMBER;
    hash = (53 * hash) + outcome_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.Interview parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.Interview parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Interview parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.Interview parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Interview parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.Interview parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Interview parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.Interview parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Interview parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.Interview parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Interview parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.Interview parseFrom(
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

  public static Builder newBuilder(com.google.cloud.talent.v4beta1.Interview prototype) {
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
   * Details of an interview.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.Interview}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.Interview)
      com.google.cloud.talent.v4beta1.InterviewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.CommonProto
          .internal_static_google_cloud_talent_v4beta1_Interview_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.CommonProto
          .internal_static_google_cloud_talent_v4beta1_Interview_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.Interview.class,
              com.google.cloud.talent.v4beta1.Interview.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.Interview.newBuilder()
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
      if (ratingBuilder_ == null) {
        rating_ = null;
      } else {
        rating_ = null;
        ratingBuilder_ = null;
      }
      outcome_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.CommonProto
          .internal_static_google_cloud_talent_v4beta1_Interview_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.Interview getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.Interview.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.Interview build() {
      com.google.cloud.talent.v4beta1.Interview result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.Interview buildPartial() {
      com.google.cloud.talent.v4beta1.Interview result =
          new com.google.cloud.talent.v4beta1.Interview(this);
      if (ratingBuilder_ == null) {
        result.rating_ = rating_;
      } else {
        result.rating_ = ratingBuilder_.build();
      }
      result.outcome_ = outcome_;
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
      if (other instanceof com.google.cloud.talent.v4beta1.Interview) {
        return mergeFrom((com.google.cloud.talent.v4beta1.Interview) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.Interview other) {
      if (other == com.google.cloud.talent.v4beta1.Interview.getDefaultInstance()) return this;
      if (other.hasRating()) {
        mergeRating(other.getRating());
      }
      if (other.outcome_ != 0) {
        setOutcomeValue(other.getOutcomeValue());
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
      com.google.cloud.talent.v4beta1.Interview parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.talent.v4beta1.Interview) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.talent.v4beta1.Rating rating_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Rating,
            com.google.cloud.talent.v4beta1.Rating.Builder,
            com.google.cloud.talent.v4beta1.RatingOrBuilder>
        ratingBuilder_;
    /**
     *
     *
     * <pre>
     * The rating on this interview.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
     *
     * @return Whether the rating field is set.
     */
    public boolean hasRating() {
      return ratingBuilder_ != null || rating_ != null;
    }
    /**
     *
     *
     * <pre>
     * The rating on this interview.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
     *
     * @return The rating.
     */
    public com.google.cloud.talent.v4beta1.Rating getRating() {
      if (ratingBuilder_ == null) {
        return rating_ == null
            ? com.google.cloud.talent.v4beta1.Rating.getDefaultInstance()
            : rating_;
      } else {
        return ratingBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The rating on this interview.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
     */
    public Builder setRating(com.google.cloud.talent.v4beta1.Rating value) {
      if (ratingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rating_ = value;
        onChanged();
      } else {
        ratingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The rating on this interview.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
     */
    public Builder setRating(com.google.cloud.talent.v4beta1.Rating.Builder builderForValue) {
      if (ratingBuilder_ == null) {
        rating_ = builderForValue.build();
        onChanged();
      } else {
        ratingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The rating on this interview.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
     */
    public Builder mergeRating(com.google.cloud.talent.v4beta1.Rating value) {
      if (ratingBuilder_ == null) {
        if (rating_ != null) {
          rating_ =
              com.google.cloud.talent.v4beta1.Rating.newBuilder(rating_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          rating_ = value;
        }
        onChanged();
      } else {
        ratingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The rating on this interview.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
     */
    public Builder clearRating() {
      if (ratingBuilder_ == null) {
        rating_ = null;
        onChanged();
      } else {
        rating_ = null;
        ratingBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The rating on this interview.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
     */
    public com.google.cloud.talent.v4beta1.Rating.Builder getRatingBuilder() {

      onChanged();
      return getRatingFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The rating on this interview.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
     */
    public com.google.cloud.talent.v4beta1.RatingOrBuilder getRatingOrBuilder() {
      if (ratingBuilder_ != null) {
        return ratingBuilder_.getMessageOrBuilder();
      } else {
        return rating_ == null
            ? com.google.cloud.talent.v4beta1.Rating.getDefaultInstance()
            : rating_;
      }
    }
    /**
     *
     *
     * <pre>
     * The rating on this interview.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Rating rating = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Rating,
            com.google.cloud.talent.v4beta1.Rating.Builder,
            com.google.cloud.talent.v4beta1.RatingOrBuilder>
        getRatingFieldBuilder() {
      if (ratingBuilder_ == null) {
        ratingBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.talent.v4beta1.Rating,
                com.google.cloud.talent.v4beta1.Rating.Builder,
                com.google.cloud.talent.v4beta1.RatingOrBuilder>(
                getRating(), getParentForChildren(), isClean());
        rating_ = null;
      }
      return ratingBuilder_;
    }

    private int outcome_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The overall decision resulting from this interview (positive, negative,
     * nuetral).
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Outcome outcome = 7 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for outcome.
     */
    public int getOutcomeValue() {
      return outcome_;
    }
    /**
     *
     *
     * <pre>
     * Required. The overall decision resulting from this interview (positive, negative,
     * nuetral).
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Outcome outcome = 7 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for outcome to set.
     * @return This builder for chaining.
     */
    public Builder setOutcomeValue(int value) {
      outcome_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The overall decision resulting from this interview (positive, negative,
     * nuetral).
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Outcome outcome = 7 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The outcome.
     */
    public com.google.cloud.talent.v4beta1.Outcome getOutcome() {
      @SuppressWarnings("deprecation")
      com.google.cloud.talent.v4beta1.Outcome result =
          com.google.cloud.talent.v4beta1.Outcome.valueOf(outcome_);
      return result == null ? com.google.cloud.talent.v4beta1.Outcome.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The overall decision resulting from this interview (positive, negative,
     * nuetral).
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Outcome outcome = 7 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The outcome to set.
     * @return This builder for chaining.
     */
    public Builder setOutcome(com.google.cloud.talent.v4beta1.Outcome value) {
      if (value == null) {
        throw new NullPointerException();
      }

      outcome_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The overall decision resulting from this interview (positive, negative,
     * nuetral).
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Outcome outcome = 7 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOutcome() {

      outcome_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.Interview)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.Interview)
  private static final com.google.cloud.talent.v4beta1.Interview DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.Interview();
  }

  public static com.google.cloud.talent.v4beta1.Interview getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Interview> PARSER =
      new com.google.protobuf.AbstractParser<Interview>() {
        @java.lang.Override
        public Interview parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Interview(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Interview> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Interview> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.Interview getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
