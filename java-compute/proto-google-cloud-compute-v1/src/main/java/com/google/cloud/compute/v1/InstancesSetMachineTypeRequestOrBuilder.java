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

public interface InstancesSetMachineTypeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstancesSetMachineTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full or partial URL of the machine type resource. See Machine Types for a full list of machine types. For example: zones/us-central1-f/machineTypes/n1-standard-1
   * </pre>
   *
   * <code>string machine_type = 227711026;</code>
   *
   * @return Whether the machineType field is set.
   */
  boolean hasMachineType();
  /**
   *
   *
   * <pre>
   * Full or partial URL of the machine type resource. See Machine Types for a full list of machine types. For example: zones/us-central1-f/machineTypes/n1-standard-1
   * </pre>
   *
   * <code>string machine_type = 227711026;</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * Full or partial URL of the machine type resource. See Machine Types for a full list of machine types. For example: zones/us-central1-f/machineTypes/n1-standard-1
   * </pre>
   *
   * <code>string machine_type = 227711026;</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();
}
