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
// source: google/cloud/dataproc/v1beta2/autoscaling_policies.proto

package com.google.cloud.dataproc.v1beta2;

public interface InstanceGroupAutoscalingPolicyConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.InstanceGroupAutoscalingPolicyConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Minimum number of instances for this group.
   * Primary workers - Bounds: [2, max_instances]. Default: 2.
   * Secondary workers - Bounds: [0, max_instances]. Default: 0.
   * </pre>
   *
   * <code>int32 min_instances = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The minInstances.
   */
  int getMinInstances();

  /**
   *
   *
   * <pre>
   * Optional. Maximum number of instances for this group. Required for primary
   * workers. Note that by default, clusters will not use secondary workers.
   * Required for secondary workers if the minimum secondary instances is set.
   * Primary workers - Bounds: [min_instances, ). Required.
   * Secondary workers - Bounds: [min_instances, ). Default: 0.
   * </pre>
   *
   * <code>int32 max_instances = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxInstances.
   */
  int getMaxInstances();

  /**
   *
   *
   * <pre>
   * Optional. Weight for the instance group, which is used to determine the
   * fraction of total workers in the cluster from this instance group.
   * For example, if primary workers have weight 2, and secondary workers have
   * weight 1, the cluster will have approximately 2 primary workers for each
   * secondary worker.
   * The cluster may not reach the specified balance if constrained
   * by min/max bounds or other autoscaling settings. For example, if
   * `max_instances` for secondary workers is 0, then only primary workers will
   * be added. The cluster can also be out of balance when created.
   * If weight is not set on any instance group, the cluster will default to
   * equal weight for all groups: the cluster will attempt to maintain an equal
   * number of workers in each group within the configured size bounds for each
   * group. If weight is set for one group only, the cluster will default to
   * zero weight on the unset group. For example if weight is set only on
   * primary workers, the cluster will use primary workers only and no
   * secondary workers.
   * </pre>
   *
   * <code>int32 weight = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The weight.
   */
  int getWeight();
}
