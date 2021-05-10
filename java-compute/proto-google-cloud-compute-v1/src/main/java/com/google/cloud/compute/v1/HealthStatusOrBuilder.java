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

public interface HealthStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HealthStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Metadata defined as annotations for network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Metadata defined as annotations for network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Metadata defined as annotations for network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Metadata defined as annotations for network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  java.lang.String getAnnotationsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Metadata defined as annotations for network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Health state of the instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HealthStatus.HealthState health_state = 324007150;</code>
   *
   * @return Whether the healthState field is set.
   */
  boolean hasHealthState();
  /**
   *
   *
   * <pre>
   * Health state of the instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HealthStatus.HealthState health_state = 324007150;</code>
   *
   * @return The enum numeric value on the wire for healthState.
   */
  int getHealthStateValue();
  /**
   *
   *
   * <pre>
   * Health state of the instance.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HealthStatus.HealthState health_state = 324007150;</code>
   *
   * @return The healthState.
   */
  com.google.cloud.compute.v1.HealthStatus.HealthState getHealthState();

  /**
   *
   *
   * <pre>
   * URL of the instance resource.
   * </pre>
   *
   * <code>string instance = 18257045;</code>
   *
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   *
   *
   * <pre>
   * URL of the instance resource.
   * </pre>
   *
   * <code>string instance = 18257045;</code>
   *
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   *
   *
   * <pre>
   * URL of the instance resource.
   * </pre>
   *
   * <code>string instance = 18257045;</code>
   *
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString getInstanceBytes();

  /**
   *
   *
   * <pre>
   * A forwarding rule IP address assigned to this instance.
   * </pre>
   *
   * <code>string ip_address = 406272220;</code>
   *
   * @return Whether the ipAddress field is set.
   */
  boolean hasIpAddress();
  /**
   *
   *
   * <pre>
   * A forwarding rule IP address assigned to this instance.
   * </pre>
   *
   * <code>string ip_address = 406272220;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * A forwarding rule IP address assigned to this instance.
   * </pre>
   *
   * <code>string ip_address = 406272220;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * The named port of the instance group, not necessarily the port that is health-checked.
   * </pre>
   *
   * <code>int32 port = 3446913;</code>
   *
   * @return Whether the port field is set.
   */
  boolean hasPort();
  /**
   *
   *
   * <pre>
   * The named port of the instance group, not necessarily the port that is health-checked.
   * </pre>
   *
   * <code>int32 port = 3446913;</code>
   *
   * @return The port.
   */
  int getPort();

  /**
   * <code>string weight = 282149496;</code>
   *
   * @return Whether the weight field is set.
   */
  boolean hasWeight();
  /**
   * <code>string weight = 282149496;</code>
   *
   * @return The weight.
   */
  java.lang.String getWeight();
  /**
   * <code>string weight = 282149496;</code>
   *
   * @return The bytes for weight.
   */
  com.google.protobuf.ByteString getWeightBytes();

  /**
   * <code>.google.cloud.compute.v1.HealthStatus.WeightError weight_error = 522501505;</code>
   *
   * @return Whether the weightError field is set.
   */
  boolean hasWeightError();
  /**
   * <code>.google.cloud.compute.v1.HealthStatus.WeightError weight_error = 522501505;</code>
   *
   * @return The enum numeric value on the wire for weightError.
   */
  int getWeightErrorValue();
  /**
   * <code>.google.cloud.compute.v1.HealthStatus.WeightError weight_error = 522501505;</code>
   *
   * @return The weightError.
   */
  com.google.cloud.compute.v1.HealthStatus.WeightError getWeightError();
}
