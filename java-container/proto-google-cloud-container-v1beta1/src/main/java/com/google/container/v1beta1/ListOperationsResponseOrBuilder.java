/*
 * Copyright 2024 Google LLC
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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface ListOperationsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.ListOperationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of operations in the project in the specified zone.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Operation operations = 1;</code>
   */
  java.util.List<com.google.container.v1beta1.Operation> getOperationsList();
  /**
   *
   *
   * <pre>
   * A list of operations in the project in the specified zone.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Operation operations = 1;</code>
   */
  com.google.container.v1beta1.Operation getOperations(int index);
  /**
   *
   *
   * <pre>
   * A list of operations in the project in the specified zone.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Operation operations = 1;</code>
   */
  int getOperationsCount();
  /**
   *
   *
   * <pre>
   * A list of operations in the project in the specified zone.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Operation operations = 1;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.OperationOrBuilder>
      getOperationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of operations in the project in the specified zone.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Operation operations = 1;</code>
   */
  com.google.container.v1beta1.OperationOrBuilder getOperationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If any zones are listed here, the list of operations returned
   * may be missing the operations from those zones.
   * </pre>
   *
   * <code>repeated string missing_zones = 2;</code>
   *
   * @return A list containing the missingZones.
   */
  java.util.List<java.lang.String> getMissingZonesList();
  /**
   *
   *
   * <pre>
   * If any zones are listed here, the list of operations returned
   * may be missing the operations from those zones.
   * </pre>
   *
   * <code>repeated string missing_zones = 2;</code>
   *
   * @return The count of missingZones.
   */
  int getMissingZonesCount();
  /**
   *
   *
   * <pre>
   * If any zones are listed here, the list of operations returned
   * may be missing the operations from those zones.
   * </pre>
   *
   * <code>repeated string missing_zones = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The missingZones at the given index.
   */
  java.lang.String getMissingZones(int index);
  /**
   *
   *
   * <pre>
   * If any zones are listed here, the list of operations returned
   * may be missing the operations from those zones.
   * </pre>
   *
   * <code>repeated string missing_zones = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the missingZones at the given index.
   */
  com.google.protobuf.ByteString getMissingZonesBytes(int index);
}
