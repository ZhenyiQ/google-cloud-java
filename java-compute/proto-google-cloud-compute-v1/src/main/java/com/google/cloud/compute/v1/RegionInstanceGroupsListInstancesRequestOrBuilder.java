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

public interface RegionInstanceGroupsListInstancesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Instances in which state should be returned. Valid options are: 'ALL', 'RUNNING'. By default, it lists all instances.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest.InstanceState instance_state = 92223591;
   * </code>
   *
   * @return Whether the instanceState field is set.
   */
  boolean hasInstanceState();
  /**
   *
   *
   * <pre>
   * Instances in which state should be returned. Valid options are: 'ALL', 'RUNNING'. By default, it lists all instances.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest.InstanceState instance_state = 92223591;
   * </code>
   *
   * @return The enum numeric value on the wire for instanceState.
   */
  int getInstanceStateValue();
  /**
   *
   *
   * <pre>
   * Instances in which state should be returned. Valid options are: 'ALL', 'RUNNING'. By default, it lists all instances.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest.InstanceState instance_state = 92223591;
   * </code>
   *
   * @return The instanceState.
   */
  com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest.InstanceState
      getInstanceState();

  /**
   *
   *
   * <pre>
   * Name of port user is interested in. It is optional. If it is set, only information about this ports will be returned. If it is not set, all the named ports will be returned. Always lists all instances.
   * </pre>
   *
   * <code>string port_name = 41534345;</code>
   *
   * @return Whether the portName field is set.
   */
  boolean hasPortName();
  /**
   *
   *
   * <pre>
   * Name of port user is interested in. It is optional. If it is set, only information about this ports will be returned. If it is not set, all the named ports will be returned. Always lists all instances.
   * </pre>
   *
   * <code>string port_name = 41534345;</code>
   *
   * @return The portName.
   */
  java.lang.String getPortName();
  /**
   *
   *
   * <pre>
   * Name of port user is interested in. It is optional. If it is set, only information about this ports will be returned. If it is not set, all the named ports will be returned. Always lists all instances.
   * </pre>
   *
   * <code>string port_name = 41534345;</code>
   *
   * @return The bytes for portName.
   */
  com.google.protobuf.ByteString getPortNameBytes();
}
