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

public interface PerInstanceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.PerInstanceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Fingerprint of this per-instance config. This field can be used in optimistic locking. It is ignored when inserting a per-instance config. An up-to-date fingerprint must be provided in order to update an existing per-instance config or the field needs to be unset.
   * </pre>
   *
   * <code>string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();
  /**
   *
   *
   * <pre>
   * Fingerprint of this per-instance config. This field can be used in optimistic locking. It is ignored when inserting a per-instance config. An up-to-date fingerprint must be provided in order to update an existing per-instance config or the field needs to be unset.
   * </pre>
   *
   * <code>string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();
  /**
   *
   *
   * <pre>
   * Fingerprint of this per-instance config. This field can be used in optimistic locking. It is ignored when inserting a per-instance config. An up-to-date fingerprint must be provided in order to update an existing per-instance config or the field needs to be unset.
   * </pre>
   *
   * <code>string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString getFingerprintBytes();

  /**
   *
   *
   * <pre>
   * The name of a per-instance config and its corresponding instance. Serves as a merge key during UpdatePerInstanceConfigs operations, that is, if a per-instance config with the same name exists then it will be updated, otherwise a new one will be created for the VM instance with the same name. An attempt to create a per-instance config for a VM instance that either doesn't exist or is not part of the group will result in an error.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * The name of a per-instance config and its corresponding instance. Serves as a merge key during UpdatePerInstanceConfigs operations, that is, if a per-instance config with the same name exists then it will be updated, otherwise a new one will be created for the VM instance with the same name. An attempt to create a per-instance config for a VM instance that either doesn't exist or is not part of the group will result in an error.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of a per-instance config and its corresponding instance. Serves as a merge key during UpdatePerInstanceConfigs operations, that is, if a per-instance config with the same name exists then it will be updated, otherwise a new one will be created for the VM instance with the same name. An attempt to create a per-instance config for a VM instance that either doesn't exist or is not part of the group will result in an error.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The intended preserved state for the given instance. Does not contain preserved state generated from a stateful policy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.PreservedState preserved_state = 2634026;</code>
   *
   * @return Whether the preservedState field is set.
   */
  boolean hasPreservedState();
  /**
   *
   *
   * <pre>
   * The intended preserved state for the given instance. Does not contain preserved state generated from a stateful policy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.PreservedState preserved_state = 2634026;</code>
   *
   * @return The preservedState.
   */
  com.google.cloud.compute.v1.PreservedState getPreservedState();
  /**
   *
   *
   * <pre>
   * The intended preserved state for the given instance. Does not contain preserved state generated from a stateful policy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.PreservedState preserved_state = 2634026;</code>
   */
  com.google.cloud.compute.v1.PreservedStateOrBuilder getPreservedStateOrBuilder();

  /**
   *
   *
   * <pre>
   * The status of applying this per-instance config on the corresponding managed instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.PerInstanceConfig.Status status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * The status of applying this per-instance config on the corresponding managed instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.PerInstanceConfig.Status status = 181260274;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * The status of applying this per-instance config on the corresponding managed instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.PerInstanceConfig.Status status = 181260274;</code>
   *
   * @return The status.
   */
  com.google.cloud.compute.v1.PerInstanceConfig.Status getStatus();
}
