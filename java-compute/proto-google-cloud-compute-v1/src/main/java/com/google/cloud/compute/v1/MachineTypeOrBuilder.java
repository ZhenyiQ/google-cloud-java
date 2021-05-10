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

public interface MachineTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.MachineType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] A list of accelerator configurations assigned to this machine type.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Accelerators accelerators = 269577064;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Accelerators> getAcceleratorsList();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of accelerator configurations assigned to this machine type.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Accelerators accelerators = 269577064;</code>
   */
  com.google.cloud.compute.v1.Accelerators getAccelerators(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] A list of accelerator configurations assigned to this machine type.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Accelerators accelerators = 269577064;</code>
   */
  int getAcceleratorsCount();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of accelerator configurations assigned to this machine type.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Accelerators accelerators = 269577064;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AcceleratorsOrBuilder>
      getAcceleratorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of accelerator configurations assigned to this machine type.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Accelerators accelerators = 269577064;</code>
   */
  com.google.cloud.compute.v1.AcceleratorsOrBuilder getAcceleratorsOrBuilder(int index);

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
   *
   *
   * <pre>
   * [Output Only] The deprecation status associated with this machine type. Only applicable if the machine type is unavailable.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.DeprecationStatus deprecated = 515138995;</code>
   *
   * @return Whether the deprecated field is set.
   */
  boolean hasDeprecated();
  /**
   *
   *
   * <pre>
   * [Output Only] The deprecation status associated with this machine type. Only applicable if the machine type is unavailable.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.DeprecationStatus deprecated = 515138995;</code>
   *
   * @return The deprecated.
   */
  com.google.cloud.compute.v1.DeprecationStatus getDeprecated();
  /**
   *
   *
   * <pre>
   * [Output Only] The deprecation status associated with this machine type. Only applicable if the machine type is unavailable.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.DeprecationStatus deprecated = 515138995;</code>
   */
  com.google.cloud.compute.v1.DeprecationStatusOrBuilder getDeprecatedOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] An optional textual description of the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * [Output Only] An optional textual description of the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * [Output Only] An optional textual description of the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The number of virtual CPUs that are available to the instance.
   * </pre>
   *
   * <code>int32 guest_cpus = 393356754;</code>
   *
   * @return Whether the guestCpus field is set.
   */
  boolean hasGuestCpus();
  /**
   *
   *
   * <pre>
   * [Output Only] The number of virtual CPUs that are available to the instance.
   * </pre>
   *
   * <code>int32 guest_cpus = 393356754;</code>
   *
   * @return The guestCpus.
   */
  int getGuestCpus();

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
   * [Deprecated] This property is deprecated and will never be populated with any relevant values.
   * </pre>
   *
   * <code>int32 image_space_gb = 75331864;</code>
   *
   * @return Whether the imageSpaceGb field is set.
   */
  boolean hasImageSpaceGb();
  /**
   *
   *
   * <pre>
   * [Deprecated] This property is deprecated and will never be populated with any relevant values.
   * </pre>
   *
   * <code>int32 image_space_gb = 75331864;</code>
   *
   * @return The imageSpaceGb.
   */
  int getImageSpaceGb();

  /**
   *
   *
   * <pre>
   * [Output Only] Whether this machine type has a shared CPU. See Shared-core machine types for more information.
   * </pre>
   *
   * <code>bool is_shared_cpu = 521399555;</code>
   *
   * @return Whether the isSharedCpu field is set.
   */
  boolean hasIsSharedCpu();
  /**
   *
   *
   * <pre>
   * [Output Only] Whether this machine type has a shared CPU. See Shared-core machine types for more information.
   * </pre>
   *
   * <code>bool is_shared_cpu = 521399555;</code>
   *
   * @return The isSharedCpu.
   */
  boolean getIsSharedCpu();

  /**
   *
   *
   * <pre>
   * [Output Only] The type of the resource. Always compute#machineType for machine types.
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
   * [Output Only] The type of the resource. Always compute#machineType for machine types.
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
   * [Output Only] The type of the resource. Always compute#machineType for machine types.
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
   * [Output Only] Maximum persistent disks allowed.
   * </pre>
   *
   * <code>int32 maximum_persistent_disks = 496220941;</code>
   *
   * @return Whether the maximumPersistentDisks field is set.
   */
  boolean hasMaximumPersistentDisks();
  /**
   *
   *
   * <pre>
   * [Output Only] Maximum persistent disks allowed.
   * </pre>
   *
   * <code>int32 maximum_persistent_disks = 496220941;</code>
   *
   * @return The maximumPersistentDisks.
   */
  int getMaximumPersistentDisks();

  /**
   *
   *
   * <pre>
   * [Output Only] Maximum total persistent disks size (GB) allowed.
   * </pre>
   *
   * <code>string maximum_persistent_disks_size_gb = 154274471;</code>
   *
   * @return Whether the maximumPersistentDisksSizeGb field is set.
   */
  boolean hasMaximumPersistentDisksSizeGb();
  /**
   *
   *
   * <pre>
   * [Output Only] Maximum total persistent disks size (GB) allowed.
   * </pre>
   *
   * <code>string maximum_persistent_disks_size_gb = 154274471;</code>
   *
   * @return The maximumPersistentDisksSizeGb.
   */
  java.lang.String getMaximumPersistentDisksSizeGb();
  /**
   *
   *
   * <pre>
   * [Output Only] Maximum total persistent disks size (GB) allowed.
   * </pre>
   *
   * <code>string maximum_persistent_disks_size_gb = 154274471;</code>
   *
   * @return The bytes for maximumPersistentDisksSizeGb.
   */
  com.google.protobuf.ByteString getMaximumPersistentDisksSizeGbBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The amount of physical memory available to the instance, defined in MB.
   * </pre>
   *
   * <code>int32 memory_mb = 116001171;</code>
   *
   * @return Whether the memoryMb field is set.
   */
  boolean hasMemoryMb();
  /**
   *
   *
   * <pre>
   * [Output Only] The amount of physical memory available to the instance, defined in MB.
   * </pre>
   *
   * <code>int32 memory_mb = 116001171;</code>
   *
   * @return The memoryMb.
   */
  int getMemoryMb();

  /**
   *
   *
   * <pre>
   * [Output Only] Name of the resource.
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
   * [Output Only] Name of the resource.
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
   * [Output Only] Name of the resource.
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
   * [Output Only] A list of extended scratch disks assigned to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ScratchDisks scratch_disks = 480778481;</code>
   */
  java.util.List<com.google.cloud.compute.v1.ScratchDisks> getScratchDisksList();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of extended scratch disks assigned to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ScratchDisks scratch_disks = 480778481;</code>
   */
  com.google.cloud.compute.v1.ScratchDisks getScratchDisks(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] A list of extended scratch disks assigned to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ScratchDisks scratch_disks = 480778481;</code>
   */
  int getScratchDisksCount();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of extended scratch disks assigned to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ScratchDisks scratch_disks = 480778481;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ScratchDisksOrBuilder>
      getScratchDisksOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] A list of extended scratch disks assigned to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ScratchDisks scratch_disks = 480778481;</code>
   */
  com.google.cloud.compute.v1.ScratchDisksOrBuilder getScratchDisksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
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
   * [Output Only] Server-defined URL for the resource.
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
   * [Output Only] Server-defined URL for the resource.
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
   * [Output Only] The name of the zone where the machine type resides, such as us-central1-a.
   * </pre>
   *
   * <code>string zone = 3744684;</code>
   *
   * @return Whether the zone field is set.
   */
  boolean hasZone();
  /**
   *
   *
   * <pre>
   * [Output Only] The name of the zone where the machine type resides, such as us-central1-a.
   * </pre>
   *
   * <code>string zone = 3744684;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * [Output Only] The name of the zone where the machine type resides, such as us-central1-a.
   * </pre>
   *
   * <code>string zone = 3744684;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
