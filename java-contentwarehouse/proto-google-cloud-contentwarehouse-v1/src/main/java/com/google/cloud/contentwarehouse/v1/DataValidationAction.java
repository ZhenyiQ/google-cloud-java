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
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Represents the action responsible for data validation operations.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.DataValidationAction}
 */
public final class DataValidationAction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.DataValidationAction)
    DataValidationActionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataValidationAction.newBuilder() to construct.
  private DataValidationAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataValidationAction() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataValidationAction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetConditions();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.DataValidationAction.class,
            com.google.cloud.contentwarehouse.v1.DataValidationAction.Builder.class);
  }

  public static final int CONDITIONS_FIELD_NUMBER = 1;

  private static final class ConditionsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.contentwarehouse.v1.RuleEngineProto
                .internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_ConditionsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> conditions_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetConditions() {
    if (conditions_ == null) {
      return com.google.protobuf.MapField.emptyMapField(ConditionsDefaultEntryHolder.defaultEntry);
    }
    return conditions_;
  }

  public int getConditionsCount() {
    return internalGetConditions().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Map of (K, V) -&gt; (field, string condition to be evaluated on the field)
   * E.g., ("age", "age &gt; 18  &amp;&amp; age &lt; 60") entry triggers validation of field
   * age with the given condition. Map entries will be ANDed during validation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; conditions = 1;</code>
   */
  @java.lang.Override
  public boolean containsConditions(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetConditions().getMap().containsKey(key);
  }
  /** Use {@link #getConditionsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getConditions() {
    return getConditionsMap();
  }
  /**
   *
   *
   * <pre>
   * Map of (K, V) -&gt; (field, string condition to be evaluated on the field)
   * E.g., ("age", "age &gt; 18  &amp;&amp; age &lt; 60") entry triggers validation of field
   * age with the given condition. Map entries will be ANDed during validation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; conditions = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getConditionsMap() {
    return internalGetConditions().getMap();
  }
  /**
   *
   *
   * <pre>
   * Map of (K, V) -&gt; (field, string condition to be evaluated on the field)
   * E.g., ("age", "age &gt; 18  &amp;&amp; age &lt; 60") entry triggers validation of field
   * age with the given condition. Map entries will be ANDed during validation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; conditions = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getConditionsOrDefault(
      java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetConditions().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Map of (K, V) -&gt; (field, string condition to be evaluated on the field)
   * E.g., ("age", "age &gt; 18  &amp;&amp; age &lt; 60") entry triggers validation of field
   * age with the given condition. Map entries will be ANDed during validation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; conditions = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getConditionsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetConditions().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetConditions(), ConditionsDefaultEntryHolder.defaultEntry, 1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetConditions().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> conditions__ =
          ConditionsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, conditions__);
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.DataValidationAction)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.DataValidationAction other =
        (com.google.cloud.contentwarehouse.v1.DataValidationAction) obj;

    if (!internalGetConditions().equals(other.internalGetConditions())) return false;
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
    if (!internalGetConditions().getMap().isEmpty()) {
      hash = (37 * hash) + CONDITIONS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetConditions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.DataValidationAction parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.DataValidationAction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DataValidationAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.DataValidationAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DataValidationAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.DataValidationAction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DataValidationAction parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.DataValidationAction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DataValidationAction parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.DataValidationAction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DataValidationAction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.DataValidationAction parseFrom(
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
      com.google.cloud.contentwarehouse.v1.DataValidationAction prototype) {
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
   * Represents the action responsible for data validation operations.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.DataValidationAction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.DataValidationAction)
      com.google.cloud.contentwarehouse.v1.DataValidationActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetConditions();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableConditions();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.DataValidationAction.class,
              com.google.cloud.contentwarehouse.v1.DataValidationAction.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.DataValidationAction.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableConditions().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.DataValidationAction getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.DataValidationAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.DataValidationAction build() {
      com.google.cloud.contentwarehouse.v1.DataValidationAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.DataValidationAction buildPartial() {
      com.google.cloud.contentwarehouse.v1.DataValidationAction result =
          new com.google.cloud.contentwarehouse.v1.DataValidationAction(this);
      int from_bitField0_ = bitField0_;
      result.conditions_ = internalGetConditions();
      result.conditions_.makeImmutable();
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.DataValidationAction) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.DataValidationAction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.DataValidationAction other) {
      if (other == com.google.cloud.contentwarehouse.v1.DataValidationAction.getDefaultInstance())
        return this;
      internalGetMutableConditions().mergeFrom(other.internalGetConditions());
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
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> conditions__ =
                    input.readMessage(
                        ConditionsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableConditions()
                    .getMutableMap()
                    .put(conditions__.getKey(), conditions__.getValue());
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

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> conditions_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetConditions() {
      if (conditions_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ConditionsDefaultEntryHolder.defaultEntry);
      }
      return conditions_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableConditions() {
      onChanged();
      ;
      if (conditions_ == null) {
        conditions_ =
            com.google.protobuf.MapField.newMapField(ConditionsDefaultEntryHolder.defaultEntry);
      }
      if (!conditions_.isMutable()) {
        conditions_ = conditions_.copy();
      }
      return conditions_;
    }

    public int getConditionsCount() {
      return internalGetConditions().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (field, string condition to be evaluated on the field)
     * E.g., ("age", "age &gt; 18  &amp;&amp; age &lt; 60") entry triggers validation of field
     * age with the given condition. Map entries will be ANDed during validation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; conditions = 1;</code>
     */
    @java.lang.Override
    public boolean containsConditions(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetConditions().getMap().containsKey(key);
    }
    /** Use {@link #getConditionsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getConditions() {
      return getConditionsMap();
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (field, string condition to be evaluated on the field)
     * E.g., ("age", "age &gt; 18  &amp;&amp; age &lt; 60") entry triggers validation of field
     * age with the given condition. Map entries will be ANDed during validation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; conditions = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getConditionsMap() {
      return internalGetConditions().getMap();
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (field, string condition to be evaluated on the field)
     * E.g., ("age", "age &gt; 18  &amp;&amp; age &lt; 60") entry triggers validation of field
     * age with the given condition. Map entries will be ANDed during validation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; conditions = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getConditionsOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetConditions().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (field, string condition to be evaluated on the field)
     * E.g., ("age", "age &gt; 18  &amp;&amp; age &lt; 60") entry triggers validation of field
     * age with the given condition. Map entries will be ANDed during validation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; conditions = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getConditionsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetConditions().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearConditions() {
      internalGetMutableConditions().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (field, string condition to be evaluated on the field)
     * E.g., ("age", "age &gt; 18  &amp;&amp; age &lt; 60") entry triggers validation of field
     * age with the given condition. Map entries will be ANDed during validation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; conditions = 1;</code>
     */
    public Builder removeConditions(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableConditions().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableConditions() {
      return internalGetMutableConditions().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (field, string condition to be evaluated on the field)
     * E.g., ("age", "age &gt; 18  &amp;&amp; age &lt; 60") entry triggers validation of field
     * age with the given condition. Map entries will be ANDed during validation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; conditions = 1;</code>
     */
    public Builder putConditions(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }

      internalGetMutableConditions().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map of (K, V) -&gt; (field, string condition to be evaluated on the field)
     * E.g., ("age", "age &gt; 18  &amp;&amp; age &lt; 60") entry triggers validation of field
     * age with the given condition. Map entries will be ANDed during validation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; conditions = 1;</code>
     */
    public Builder putAllConditions(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableConditions().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.DataValidationAction)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.DataValidationAction)
  private static final com.google.cloud.contentwarehouse.v1.DataValidationAction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.DataValidationAction();
  }

  public static com.google.cloud.contentwarehouse.v1.DataValidationAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataValidationAction> PARSER =
      new com.google.protobuf.AbstractParser<DataValidationAction>() {
        @java.lang.Override
        public DataValidationAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataValidationAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataValidationAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.DataValidationAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}