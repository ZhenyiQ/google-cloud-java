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
// source: google/cloud/securitycenter/v1/run_asset_discovery_response.proto

package com.google.cloud.securitycenter.v1;

public interface RunAssetDiscoveryResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.RunAssetDiscoveryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The state of an asset discovery run.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.RunAssetDiscoveryResponse.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of an asset discovery run.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.RunAssetDiscoveryResponse.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.securitycenter.v1.RunAssetDiscoveryResponse.State getState();

  /**
   *
   *
   * <pre>
   * The duration between asset discovery run start and end
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   *
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   *
   *
   * <pre>
   * The duration between asset discovery run start and end
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   *
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   *
   *
   * <pre>
   * The duration between asset discovery run start and end
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();
}