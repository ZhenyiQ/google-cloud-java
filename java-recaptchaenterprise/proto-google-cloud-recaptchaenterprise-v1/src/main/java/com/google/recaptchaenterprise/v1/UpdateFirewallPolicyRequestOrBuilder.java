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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface UpdateFirewallPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.UpdateFirewallPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The policy to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the firewallPolicy field is set.
   */
  boolean hasFirewallPolicy();
  /**
   *
   *
   * <pre>
   * Required. The policy to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The firewallPolicy.
   */
  com.google.recaptchaenterprise.v1.FirewallPolicy getFirewallPolicy();
  /**
   *
   *
   * <pre>
   * Required. The policy to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.FirewallPolicy firewall_policy = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.recaptchaenterprise.v1.FirewallPolicyOrBuilder getFirewallPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields of the policy get updated. If
   * the mask is not present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields of the policy get updated. If
   * the mask is not present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields of the policy get updated. If
   * the mask is not present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
