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
// source: google/api/cloudquotas/v1/cloudquotas.proto

package com.google.api.cloudquotas.v1;

public interface UpdateQuotaPreferenceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.cloudquotas.v1.UpdateQuotaPreferenceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * QuotaPreference resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * QuotaPreference resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * QuotaPreference resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource being updated
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1.QuotaPreference quota_preference = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the quotaPreference field is set.
   */
  boolean hasQuotaPreference();
  /**
   *
   *
   * <pre>
   * Required. The resource being updated
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1.QuotaPreference quota_preference = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The quotaPreference.
   */
  com.google.api.cloudquotas.v1.QuotaPreference getQuotaPreference();
  /**
   *
   *
   * <pre>
   * Required. The resource being updated
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1.QuotaPreference quota_preference = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.api.cloudquotas.v1.QuotaPreferenceOrBuilder getQuotaPreferenceOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If set to true, and the quota preference is not found, a new one
   * will be created. In this situation, `update_mask` is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();

  /**
   *
   *
   * <pre>
   * Optional. If set to true, validate the request, but do not actually update.
   * Note that a request being valid does not mean that the request is
   * guaranteed to be fulfilled.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   *
   *
   * <pre>
   * The list of quota safety checks to be ignored.
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaSafetyCheck ignore_safety_checks = 5;</code>
   *
   * @return A list containing the ignoreSafetyChecks.
   */
  java.util.List<com.google.api.cloudquotas.v1.QuotaSafetyCheck> getIgnoreSafetyChecksList();
  /**
   *
   *
   * <pre>
   * The list of quota safety checks to be ignored.
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaSafetyCheck ignore_safety_checks = 5;</code>
   *
   * @return The count of ignoreSafetyChecks.
   */
  int getIgnoreSafetyChecksCount();
  /**
   *
   *
   * <pre>
   * The list of quota safety checks to be ignored.
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaSafetyCheck ignore_safety_checks = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The ignoreSafetyChecks at the given index.
   */
  com.google.api.cloudquotas.v1.QuotaSafetyCheck getIgnoreSafetyChecks(int index);
  /**
   *
   *
   * <pre>
   * The list of quota safety checks to be ignored.
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaSafetyCheck ignore_safety_checks = 5;</code>
   *
   * @return A list containing the enum numeric values on the wire for ignoreSafetyChecks.
   */
  java.util.List<java.lang.Integer> getIgnoreSafetyChecksValueList();
  /**
   *
   *
   * <pre>
   * The list of quota safety checks to be ignored.
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaSafetyCheck ignore_safety_checks = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of ignoreSafetyChecks at the given index.
   */
  int getIgnoreSafetyChecksValue(int index);
}
