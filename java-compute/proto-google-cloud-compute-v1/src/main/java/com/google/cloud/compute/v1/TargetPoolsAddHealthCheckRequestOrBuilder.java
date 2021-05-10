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

public interface TargetPoolsAddHealthCheckRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The HttpHealthCheck to add to the target pool.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  java.util.List<com.google.cloud.compute.v1.HealthCheckReference> getHealthChecksList();
  /**
   *
   *
   * <pre>
   * The HttpHealthCheck to add to the target pool.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  com.google.cloud.compute.v1.HealthCheckReference getHealthChecks(int index);
  /**
   *
   *
   * <pre>
   * The HttpHealthCheck to add to the target pool.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  int getHealthChecksCount();
  /**
   *
   *
   * <pre>
   * The HttpHealthCheck to add to the target pool.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.HealthCheckReferenceOrBuilder>
      getHealthChecksOrBuilderList();
  /**
   *
   *
   * <pre>
   * The HttpHealthCheck to add to the target pool.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  com.google.cloud.compute.v1.HealthCheckReferenceOrBuilder getHealthChecksOrBuilder(int index);
}
