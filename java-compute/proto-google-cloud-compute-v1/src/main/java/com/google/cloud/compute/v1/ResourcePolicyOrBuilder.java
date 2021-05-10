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

public interface ResourcePolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ResourcePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   * <code>string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Resource policy for instances for placement configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourcePolicyGroupPlacementPolicy group_placement_policy = 10931596;
   * </code>
   *
   * @return Whether the groupPlacementPolicy field is set.
   */
  boolean hasGroupPlacementPolicy();
  /**
   *
   *
   * <pre>
   * Resource policy for instances for placement configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourcePolicyGroupPlacementPolicy group_placement_policy = 10931596;
   * </code>
   *
   * @return The groupPlacementPolicy.
   */
  com.google.cloud.compute.v1.ResourcePolicyGroupPlacementPolicy getGroupPlacementPolicy();
  /**
   *
   *
   * <pre>
   * Resource policy for instances for placement configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourcePolicyGroupPlacementPolicy group_placement_policy = 10931596;
   * </code>
   */
  com.google.cloud.compute.v1.ResourcePolicyGroupPlacementPolicyOrBuilder
      getGroupPlacementPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#resource_policies for resource policies.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#resource_policies for resource policies.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#resource_policies for resource policies.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   * <code>string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   * <code>string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <code>string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * Resource policy for persistent disks for creating snapshots.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicy snapshot_schedule_policy = 218131295;
   * </code>
   *
   * @return Whether the snapshotSchedulePolicy field is set.
   */
  boolean hasSnapshotSchedulePolicy();
  /**
   *
   *
   * <pre>
   * Resource policy for persistent disks for creating snapshots.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicy snapshot_schedule_policy = 218131295;
   * </code>
   *
   * @return The snapshotSchedulePolicy.
   */
  com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicy getSnapshotSchedulePolicy();
  /**
   *
   *
   * <pre>
   * Resource policy for persistent disks for creating snapshots.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicy snapshot_schedule_policy = 218131295;
   * </code>
   */
  com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyOrBuilder
      getSnapshotSchedulePolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The status of resource policy creation.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ResourcePolicy.Status status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of resource policy creation.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ResourcePolicy.Status status = 181260274;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of resource policy creation.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ResourcePolicy.Status status = 181260274;</code>
   *
   * @return The status.
   */
  com.google.cloud.compute.v1.ResourcePolicy.Status getStatus();
}
