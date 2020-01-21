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
// source: google/cloud/talent/v4beta1/profile_service.proto

package com.google.cloud.talent.v4beta1;

public interface CreateProfileRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CreateProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the tenant this profile belongs to.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenants/bar".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the tenant this profile belongs to.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenants/bar".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The profile to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the profile field is set.
   */
  boolean hasProfile();
  /**
   *
   *
   * <pre>
   * Required. The profile to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The profile.
   */
  com.google.cloud.talent.v4beta1.Profile getProfile();
  /**
   *
   *
   * <pre>
   * Required. The profile to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.Profile profile = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.talent.v4beta1.ProfileOrBuilder getProfileOrBuilder();
}
