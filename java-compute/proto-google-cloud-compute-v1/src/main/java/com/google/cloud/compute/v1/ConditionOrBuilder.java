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

public interface ConditionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Condition)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Trusted attributes supplied by the IAM system.
   * </pre>
   *
   * <code>string iam = 104021;</code>
   *
   * @return Whether the iam field is set.
   */
  boolean hasIam();
  /**
   *
   *
   * <pre>
   * Trusted attributes supplied by the IAM system.
   * </pre>
   *
   * <code>string iam = 104021;</code>
   *
   * @return The iam.
   */
  java.lang.String getIam();
  /**
   *
   *
   * <pre>
   * Trusted attributes supplied by the IAM system.
   * </pre>
   *
   * <code>string iam = 104021;</code>
   *
   * @return The bytes for iam.
   */
  com.google.protobuf.ByteString getIamBytes();

  /**
   *
   *
   * <pre>
   * An operator to apply the subject with.
   * </pre>
   *
   * <code>string op = 3553;</code>
   *
   * @return Whether the op field is set.
   */
  boolean hasOp();
  /**
   *
   *
   * <pre>
   * An operator to apply the subject with.
   * </pre>
   *
   * <code>string op = 3553;</code>
   *
   * @return The op.
   */
  java.lang.String getOp();
  /**
   *
   *
   * <pre>
   * An operator to apply the subject with.
   * </pre>
   *
   * <code>string op = 3553;</code>
   *
   * @return The bytes for op.
   */
  com.google.protobuf.ByteString getOpBytes();

  /**
   *
   *
   * <pre>
   * Trusted attributes discharged by the service.
   * </pre>
   *
   * <code>string svc = 114272;</code>
   *
   * @return Whether the svc field is set.
   */
  boolean hasSvc();
  /**
   *
   *
   * <pre>
   * Trusted attributes discharged by the service.
   * </pre>
   *
   * <code>string svc = 114272;</code>
   *
   * @return The svc.
   */
  java.lang.String getSvc();
  /**
   *
   *
   * <pre>
   * Trusted attributes discharged by the service.
   * </pre>
   *
   * <code>string svc = 114272;</code>
   *
   * @return The bytes for svc.
   */
  com.google.protobuf.ByteString getSvcBytes();

  /**
   *
   *
   * <pre>
   * Trusted attributes supplied by any service that owns resources and uses the IAM system for access control.
   * </pre>
   *
   * <code>string sys = 114381;</code>
   *
   * @return Whether the sys field is set.
   */
  boolean hasSys();
  /**
   *
   *
   * <pre>
   * Trusted attributes supplied by any service that owns resources and uses the IAM system for access control.
   * </pre>
   *
   * <code>string sys = 114381;</code>
   *
   * @return The sys.
   */
  java.lang.String getSys();
  /**
   *
   *
   * <pre>
   * Trusted attributes supplied by any service that owns resources and uses the IAM system for access control.
   * </pre>
   *
   * <code>string sys = 114381;</code>
   *
   * @return The bytes for sys.
   */
  com.google.protobuf.ByteString getSysBytes();

  /**
   *
   *
   * <pre>
   * The objects of the condition.
   * </pre>
   *
   * <code>repeated string values = 249928994;</code>
   *
   * @return A list containing the values.
   */
  java.util.List<java.lang.String> getValuesList();
  /**
   *
   *
   * <pre>
   * The objects of the condition.
   * </pre>
   *
   * <code>repeated string values = 249928994;</code>
   *
   * @return The count of values.
   */
  int getValuesCount();
  /**
   *
   *
   * <pre>
   * The objects of the condition.
   * </pre>
   *
   * <code>repeated string values = 249928994;</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   *
   *
   * <pre>
   * The objects of the condition.
   * </pre>
   *
   * <code>repeated string values = 249928994;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString getValuesBytes(int index);
}
