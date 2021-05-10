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

public interface RawDiskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RawDisk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RawDisk.ContainerType container_type = 318809144;</code>
   *
   * @return Whether the containerType field is set.
   */
  boolean hasContainerType();
  /**
   *
   *
   * <pre>
   * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RawDisk.ContainerType container_type = 318809144;</code>
   *
   * @return The enum numeric value on the wire for containerType.
   */
  int getContainerTypeValue();
  /**
   *
   *
   * <pre>
   * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RawDisk.ContainerType container_type = 318809144;</code>
   *
   * @return The containerType.
   */
  com.google.cloud.compute.v1.RawDisk.ContainerType getContainerType();

  /**
   *
   *
   * <pre>
   * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
   * </pre>
   *
   * <code>string sha1_checksum = 314444349;</code>
   *
   * @return Whether the sha1Checksum field is set.
   */
  boolean hasSha1Checksum();
  /**
   *
   *
   * <pre>
   * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
   * </pre>
   *
   * <code>string sha1_checksum = 314444349;</code>
   *
   * @return The sha1Checksum.
   */
  java.lang.String getSha1Checksum();
  /**
   *
   *
   * <pre>
   * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
   * </pre>
   *
   * <code>string sha1_checksum = 314444349;</code>
   *
   * @return The bytes for sha1Checksum.
   */
  com.google.protobuf.ByteString getSha1ChecksumBytes();

  /**
   *
   *
   * <pre>
   * The full Google Cloud Storage URL where the disk image is stored. You must provide either this property or the sourceDisk property but not both.
   * </pre>
   *
   * <code>string source = 177235995;</code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * The full Google Cloud Storage URL where the disk image is stored. You must provide either this property or the sourceDisk property but not both.
   * </pre>
   *
   * <code>string source = 177235995;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * The full Google Cloud Storage URL where the disk image is stored. You must provide either this property or the sourceDisk property but not both.
   * </pre>
   *
   * <code>string source = 177235995;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();
}
