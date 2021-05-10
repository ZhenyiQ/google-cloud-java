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

public interface ResourcePolicySnapshotSchedulePolicyRetentionPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Maximum age of the snapshot that is allowed to be kept.
   * </pre>
   *
   * <code>int32 max_retention_days = 324296979;</code>
   *
   * @return Whether the maxRetentionDays field is set.
   */
  boolean hasMaxRetentionDays();
  /**
   *
   *
   * <pre>
   * Maximum age of the snapshot that is allowed to be kept.
   * </pre>
   *
   * <code>int32 max_retention_days = 324296979;</code>
   *
   * @return The maxRetentionDays.
   */
  int getMaxRetentionDays();

  /**
   *
   *
   * <pre>
   * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy.OnSourceDiskDelete on_source_disk_delete = 321955529;
   * </code>
   *
   * @return Whether the onSourceDiskDelete field is set.
   */
  boolean hasOnSourceDiskDelete();
  /**
   *
   *
   * <pre>
   * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy.OnSourceDiskDelete on_source_disk_delete = 321955529;
   * </code>
   *
   * @return The enum numeric value on the wire for onSourceDiskDelete.
   */
  int getOnSourceDiskDeleteValue();
  /**
   *
   *
   * <pre>
   * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy.OnSourceDiskDelete on_source_disk_delete = 321955529;
   * </code>
   *
   * @return The onSourceDiskDelete.
   */
  com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy.OnSourceDiskDelete
      getOnSourceDiskDelete();
}
