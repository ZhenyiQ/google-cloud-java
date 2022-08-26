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
// source: google/cloud/automl/v1beta1/regression.proto

package com.google.cloud.automl.v1beta1;

public final class RegressionProto {
  private RegressionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface RegressionEvaluationMetricsOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.RegressionEvaluationMetrics)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Output only. Root Mean Squared Error (RMSE).
     * </pre>
     *
     * <code>float root_mean_squared_error = 1;</code>
     *
     * @return The rootMeanSquaredError.
     */
    float getRootMeanSquaredError();

    /**
     *
     *
     * <pre>
     * Output only. Mean Absolute Error (MAE).
     * </pre>
     *
     * <code>float mean_absolute_error = 2;</code>
     *
     * @return The meanAbsoluteError.
     */
    float getMeanAbsoluteError();

    /**
     *
     *
     * <pre>
     * Output only. Mean absolute percentage error. Only set if all ground truth
     * values are are positive.
     * </pre>
     *
     * <code>float mean_absolute_percentage_error = 3;</code>
     *
     * @return The meanAbsolutePercentageError.
     */
    float getMeanAbsolutePercentageError();

    /**
     *
     *
     * <pre>
     * Output only. R squared.
     * </pre>
     *
     * <code>float r_squared = 4;</code>
     *
     * @return The rSquared.
     */
    float getRSquared();

    /**
     *
     *
     * <pre>
     * Output only. Root mean squared log error.
     * </pre>
     *
     * <code>float root_mean_squared_log_error = 5;</code>
     *
     * @return The rootMeanSquaredLogError.
     */
    float getRootMeanSquaredLogError();
  }
  /**
   *
   *
   * <pre>
   * Metrics for regression problems.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.RegressionEvaluationMetrics}
   */
  public static final class RegressionEvaluationMetrics
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.RegressionEvaluationMetrics)
      RegressionEvaluationMetricsOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use RegressionEvaluationMetrics.newBuilder() to construct.
    private RegressionEvaluationMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private RegressionEvaluationMetrics() {}

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new RegressionEvaluationMetrics();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private RegressionEvaluationMetrics(
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
            case 13:
              {
                rootMeanSquaredError_ = input.readFloat();
                break;
              }
            case 21:
              {
                meanAbsoluteError_ = input.readFloat();
                break;
              }
            case 29:
              {
                meanAbsolutePercentageError_ = input.readFloat();
                break;
              }
            case 37:
              {
                rSquared_ = input.readFloat();
                break;
              }
            case 45:
              {
                rootMeanSquaredLogError_ = input.readFloat();
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
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.RegressionProto
          .internal_static_google_cloud_automl_v1beta1_RegressionEvaluationMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.RegressionProto
          .internal_static_google_cloud_automl_v1beta1_RegressionEvaluationMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics.class,
              com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics.Builder
                  .class);
    }

    public static final int ROOT_MEAN_SQUARED_ERROR_FIELD_NUMBER = 1;
    private float rootMeanSquaredError_;
    /**
     *
     *
     * <pre>
     * Output only. Root Mean Squared Error (RMSE).
     * </pre>
     *
     * <code>float root_mean_squared_error = 1;</code>
     *
     * @return The rootMeanSquaredError.
     */
    @java.lang.Override
    public float getRootMeanSquaredError() {
      return rootMeanSquaredError_;
    }

    public static final int MEAN_ABSOLUTE_ERROR_FIELD_NUMBER = 2;
    private float meanAbsoluteError_;
    /**
     *
     *
     * <pre>
     * Output only. Mean Absolute Error (MAE).
     * </pre>
     *
     * <code>float mean_absolute_error = 2;</code>
     *
     * @return The meanAbsoluteError.
     */
    @java.lang.Override
    public float getMeanAbsoluteError() {
      return meanAbsoluteError_;
    }

    public static final int MEAN_ABSOLUTE_PERCENTAGE_ERROR_FIELD_NUMBER = 3;
    private float meanAbsolutePercentageError_;
    /**
     *
     *
     * <pre>
     * Output only. Mean absolute percentage error. Only set if all ground truth
     * values are are positive.
     * </pre>
     *
     * <code>float mean_absolute_percentage_error = 3;</code>
     *
     * @return The meanAbsolutePercentageError.
     */
    @java.lang.Override
    public float getMeanAbsolutePercentageError() {
      return meanAbsolutePercentageError_;
    }

    public static final int R_SQUARED_FIELD_NUMBER = 4;
    private float rSquared_;
    /**
     *
     *
     * <pre>
     * Output only. R squared.
     * </pre>
     *
     * <code>float r_squared = 4;</code>
     *
     * @return The rSquared.
     */
    @java.lang.Override
    public float getRSquared() {
      return rSquared_;
    }

    public static final int ROOT_MEAN_SQUARED_LOG_ERROR_FIELD_NUMBER = 5;
    private float rootMeanSquaredLogError_;
    /**
     *
     *
     * <pre>
     * Output only. Root mean squared log error.
     * </pre>
     *
     * <code>float root_mean_squared_log_error = 5;</code>
     *
     * @return The rootMeanSquaredLogError.
     */
    @java.lang.Override
    public float getRootMeanSquaredLogError() {
      return rootMeanSquaredLogError_;
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
      if (java.lang.Float.floatToRawIntBits(rootMeanSquaredError_) != 0) {
        output.writeFloat(1, rootMeanSquaredError_);
      }
      if (java.lang.Float.floatToRawIntBits(meanAbsoluteError_) != 0) {
        output.writeFloat(2, meanAbsoluteError_);
      }
      if (java.lang.Float.floatToRawIntBits(meanAbsolutePercentageError_) != 0) {
        output.writeFloat(3, meanAbsolutePercentageError_);
      }
      if (java.lang.Float.floatToRawIntBits(rSquared_) != 0) {
        output.writeFloat(4, rSquared_);
      }
      if (java.lang.Float.floatToRawIntBits(rootMeanSquaredLogError_) != 0) {
        output.writeFloat(5, rootMeanSquaredLogError_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(rootMeanSquaredError_) != 0) {
        size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, rootMeanSquaredError_);
      }
      if (java.lang.Float.floatToRawIntBits(meanAbsoluteError_) != 0) {
        size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, meanAbsoluteError_);
      }
      if (java.lang.Float.floatToRawIntBits(meanAbsolutePercentageError_) != 0) {
        size +=
            com.google.protobuf.CodedOutputStream.computeFloatSize(3, meanAbsolutePercentageError_);
      }
      if (java.lang.Float.floatToRawIntBits(rSquared_) != 0) {
        size += com.google.protobuf.CodedOutputStream.computeFloatSize(4, rSquared_);
      }
      if (java.lang.Float.floatToRawIntBits(rootMeanSquaredLogError_) != 0) {
        size += com.google.protobuf.CodedOutputStream.computeFloatSize(5, rootMeanSquaredLogError_);
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
      if (!(obj
          instanceof com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics)) {
        return super.equals(obj);
      }
      com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics other =
          (com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics) obj;

      if (java.lang.Float.floatToIntBits(getRootMeanSquaredError())
          != java.lang.Float.floatToIntBits(other.getRootMeanSquaredError())) return false;
      if (java.lang.Float.floatToIntBits(getMeanAbsoluteError())
          != java.lang.Float.floatToIntBits(other.getMeanAbsoluteError())) return false;
      if (java.lang.Float.floatToIntBits(getMeanAbsolutePercentageError())
          != java.lang.Float.floatToIntBits(other.getMeanAbsolutePercentageError())) return false;
      if (java.lang.Float.floatToIntBits(getRSquared())
          != java.lang.Float.floatToIntBits(other.getRSquared())) return false;
      if (java.lang.Float.floatToIntBits(getRootMeanSquaredLogError())
          != java.lang.Float.floatToIntBits(other.getRootMeanSquaredLogError())) return false;
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
      hash = (37 * hash) + ROOT_MEAN_SQUARED_ERROR_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getRootMeanSquaredError());
      hash = (37 * hash) + MEAN_ABSOLUTE_ERROR_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getMeanAbsoluteError());
      hash = (37 * hash) + MEAN_ABSOLUTE_PERCENTAGE_ERROR_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getMeanAbsolutePercentageError());
      hash = (37 * hash) + R_SQUARED_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getRSquared());
      hash = (37 * hash) + ROOT_MEAN_SQUARED_LOG_ERROR_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getRootMeanSquaredLogError());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        parseFrom(
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
        com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * Metrics for regression problems.
     * </pre>
     *
     * Protobuf type {@code google.cloud.automl.v1beta1.RegressionEvaluationMetrics}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.RegressionEvaluationMetrics)
        com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetricsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.cloud.automl.v1beta1.RegressionProto
            .internal_static_google_cloud_automl_v1beta1_RegressionEvaluationMetrics_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.cloud.automl.v1beta1.RegressionProto
            .internal_static_google_cloud_automl_v1beta1_RegressionEvaluationMetrics_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics.class,
                com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics.Builder
                    .class);
      }

      // Construct using
      // com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics.newBuilder()
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
        rootMeanSquaredError_ = 0F;

        meanAbsoluteError_ = 0F;

        meanAbsolutePercentageError_ = 0F;

        rSquared_ = 0F;

        rootMeanSquaredLogError_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.cloud.automl.v1beta1.RegressionProto
            .internal_static_google_cloud_automl_v1beta1_RegressionEvaluationMetrics_descriptor;
      }

      @java.lang.Override
      public com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
          getDefaultInstanceForType() {
        return com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
            .getDefaultInstance();
      }

      @java.lang.Override
      public com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics build() {
        com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
          buildPartial() {
        com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics result =
            new com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics(this);
        result.rootMeanSquaredError_ = rootMeanSquaredError_;
        result.meanAbsoluteError_ = meanAbsoluteError_;
        result.meanAbsolutePercentageError_ = meanAbsolutePercentageError_;
        result.rSquared_ = rSquared_;
        result.rootMeanSquaredLogError_ = rootMeanSquaredLogError_;
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
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics) {
          return mergeFrom(
              (com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics other) {
        if (other
            == com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
                .getDefaultInstance()) return this;
        if (other.getRootMeanSquaredError() != 0F) {
          setRootMeanSquaredError(other.getRootMeanSquaredError());
        }
        if (other.getMeanAbsoluteError() != 0F) {
          setMeanAbsoluteError(other.getMeanAbsoluteError());
        }
        if (other.getMeanAbsolutePercentageError() != 0F) {
          setMeanAbsolutePercentageError(other.getMeanAbsolutePercentageError());
        }
        if (other.getRSquared() != 0F) {
          setRSquared(other.getRSquared());
        }
        if (other.getRootMeanSquaredLogError() != 0F) {
          setRootMeanSquaredLogError(other.getRootMeanSquaredLogError());
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
        com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float rootMeanSquaredError_;
      /**
       *
       *
       * <pre>
       * Output only. Root Mean Squared Error (RMSE).
       * </pre>
       *
       * <code>float root_mean_squared_error = 1;</code>
       *
       * @return The rootMeanSquaredError.
       */
      @java.lang.Override
      public float getRootMeanSquaredError() {
        return rootMeanSquaredError_;
      }
      /**
       *
       *
       * <pre>
       * Output only. Root Mean Squared Error (RMSE).
       * </pre>
       *
       * <code>float root_mean_squared_error = 1;</code>
       *
       * @param value The rootMeanSquaredError to set.
       * @return This builder for chaining.
       */
      public Builder setRootMeanSquaredError(float value) {

        rootMeanSquaredError_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Output only. Root Mean Squared Error (RMSE).
       * </pre>
       *
       * <code>float root_mean_squared_error = 1;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearRootMeanSquaredError() {

        rootMeanSquaredError_ = 0F;
        onChanged();
        return this;
      }

      private float meanAbsoluteError_;
      /**
       *
       *
       * <pre>
       * Output only. Mean Absolute Error (MAE).
       * </pre>
       *
       * <code>float mean_absolute_error = 2;</code>
       *
       * @return The meanAbsoluteError.
       */
      @java.lang.Override
      public float getMeanAbsoluteError() {
        return meanAbsoluteError_;
      }
      /**
       *
       *
       * <pre>
       * Output only. Mean Absolute Error (MAE).
       * </pre>
       *
       * <code>float mean_absolute_error = 2;</code>
       *
       * @param value The meanAbsoluteError to set.
       * @return This builder for chaining.
       */
      public Builder setMeanAbsoluteError(float value) {

        meanAbsoluteError_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Output only. Mean Absolute Error (MAE).
       * </pre>
       *
       * <code>float mean_absolute_error = 2;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearMeanAbsoluteError() {

        meanAbsoluteError_ = 0F;
        onChanged();
        return this;
      }

      private float meanAbsolutePercentageError_;
      /**
       *
       *
       * <pre>
       * Output only. Mean absolute percentage error. Only set if all ground truth
       * values are are positive.
       * </pre>
       *
       * <code>float mean_absolute_percentage_error = 3;</code>
       *
       * @return The meanAbsolutePercentageError.
       */
      @java.lang.Override
      public float getMeanAbsolutePercentageError() {
        return meanAbsolutePercentageError_;
      }
      /**
       *
       *
       * <pre>
       * Output only. Mean absolute percentage error. Only set if all ground truth
       * values are are positive.
       * </pre>
       *
       * <code>float mean_absolute_percentage_error = 3;</code>
       *
       * @param value The meanAbsolutePercentageError to set.
       * @return This builder for chaining.
       */
      public Builder setMeanAbsolutePercentageError(float value) {

        meanAbsolutePercentageError_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Output only. Mean absolute percentage error. Only set if all ground truth
       * values are are positive.
       * </pre>
       *
       * <code>float mean_absolute_percentage_error = 3;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearMeanAbsolutePercentageError() {

        meanAbsolutePercentageError_ = 0F;
        onChanged();
        return this;
      }

      private float rSquared_;
      /**
       *
       *
       * <pre>
       * Output only. R squared.
       * </pre>
       *
       * <code>float r_squared = 4;</code>
       *
       * @return The rSquared.
       */
      @java.lang.Override
      public float getRSquared() {
        return rSquared_;
      }
      /**
       *
       *
       * <pre>
       * Output only. R squared.
       * </pre>
       *
       * <code>float r_squared = 4;</code>
       *
       * @param value The rSquared to set.
       * @return This builder for chaining.
       */
      public Builder setRSquared(float value) {

        rSquared_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Output only. R squared.
       * </pre>
       *
       * <code>float r_squared = 4;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearRSquared() {

        rSquared_ = 0F;
        onChanged();
        return this;
      }

      private float rootMeanSquaredLogError_;
      /**
       *
       *
       * <pre>
       * Output only. Root mean squared log error.
       * </pre>
       *
       * <code>float root_mean_squared_log_error = 5;</code>
       *
       * @return The rootMeanSquaredLogError.
       */
      @java.lang.Override
      public float getRootMeanSquaredLogError() {
        return rootMeanSquaredLogError_;
      }
      /**
       *
       *
       * <pre>
       * Output only. Root mean squared log error.
       * </pre>
       *
       * <code>float root_mean_squared_log_error = 5;</code>
       *
       * @param value The rootMeanSquaredLogError to set.
       * @return This builder for chaining.
       */
      public Builder setRootMeanSquaredLogError(float value) {

        rootMeanSquaredLogError_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Output only. Root mean squared log error.
       * </pre>
       *
       * <code>float root_mean_squared_log_error = 5;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearRootMeanSquaredLogError() {

        rootMeanSquaredLogError_ = 0F;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.RegressionEvaluationMetrics)
    }

    // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.RegressionEvaluationMetrics)
    private static final com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics();
    }

    public static com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RegressionEvaluationMetrics> PARSER =
        new com.google.protobuf.AbstractParser<RegressionEvaluationMetrics>() {
          @java.lang.Override
          public RegressionEvaluationMetrics parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new RegressionEvaluationMetrics(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<RegressionEvaluationMetrics> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RegressionEvaluationMetrics> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.RegressionProto.RegressionEvaluationMetrics
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_RegressionEvaluationMetrics_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_RegressionEvaluationMetrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/automl/v1beta1/regression"
          + ".proto\022\033google.cloud.automl.v1beta1\"\273\001\n\033"
          + "RegressionEvaluationMetrics\022\037\n\027root_mean"
          + "_squared_error\030\001 \001(\002\022\033\n\023mean_absolute_er"
          + "ror\030\002 \001(\002\022&\n\036mean_absolute_percentage_er"
          + "ror\030\003 \001(\002\022\021\n\tr_squared\030\004 \001(\002\022#\n\033root_mea"
          + "n_squared_log_error\030\005 \001(\002B\264\001\n\037com.google"
          + ".cloud.automl.v1beta1B\017RegressionProtoZA"
          + "google.golang.org/genproto/googleapis/cl"
          + "oud/automl/v1beta1;automl\312\002\033Google\\Cloud"
          + "\\AutoMl\\V1beta1\352\002\036Google::Cloud::AutoML:"
          + ":V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_automl_v1beta1_RegressionEvaluationMetrics_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_RegressionEvaluationMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_RegressionEvaluationMetrics_descriptor,
            new java.lang.String[] {
              "RootMeanSquaredError",
              "MeanAbsoluteError",
              "MeanAbsolutePercentageError",
              "RSquared",
              "RootMeanSquaredLogError",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}