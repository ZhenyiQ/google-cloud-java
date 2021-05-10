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

public interface InstanceManagedByIgmErrorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceManagedByIgmError)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Contents of the error.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InstanceManagedByIgmErrorManagedInstanceError error = 96784904;
   * </code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * [Output Only] Contents of the error.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InstanceManagedByIgmErrorManagedInstanceError error = 96784904;
   * </code>
   *
   * @return The error.
   */
  com.google.cloud.compute.v1.InstanceManagedByIgmErrorManagedInstanceError getError();
  /**
   *
   *
   * <pre>
   * [Output Only] Contents of the error.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InstanceManagedByIgmErrorManagedInstanceError error = 96784904;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceManagedByIgmErrorManagedInstanceErrorOrBuilder
      getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Details of the instance action that triggered this error. May be null, if the error was not caused by an action on an instance. This field is optional.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceManagedByIgmErrorInstanceActionDetails instance_action_details = 292224547;
   * </code>
   *
   * @return Whether the instanceActionDetails field is set.
   */
  boolean hasInstanceActionDetails();
  /**
   *
   *
   * <pre>
   * [Output Only] Details of the instance action that triggered this error. May be null, if the error was not caused by an action on an instance. This field is optional.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceManagedByIgmErrorInstanceActionDetails instance_action_details = 292224547;
   * </code>
   *
   * @return The instanceActionDetails.
   */
  com.google.cloud.compute.v1.InstanceManagedByIgmErrorInstanceActionDetails
      getInstanceActionDetails();
  /**
   *
   *
   * <pre>
   * [Output Only] Details of the instance action that triggered this error. May be null, if the error was not caused by an action on an instance. This field is optional.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceManagedByIgmErrorInstanceActionDetails instance_action_details = 292224547;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceManagedByIgmErrorInstanceActionDetailsOrBuilder
      getInstanceActionDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The time that this error occurred. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>string timestamp = 55126294;</code>
   *
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] The time that this error occurred. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>string timestamp = 55126294;</code>
   *
   * @return The timestamp.
   */
  java.lang.String getTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] The time that this error occurred. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>string timestamp = 55126294;</code>
   *
   * @return The bytes for timestamp.
   */
  com.google.protobuf.ByteString getTimestampBytes();
}
