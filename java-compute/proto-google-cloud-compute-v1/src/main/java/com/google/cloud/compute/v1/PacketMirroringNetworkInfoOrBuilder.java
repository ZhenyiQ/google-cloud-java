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

public interface PacketMirroringNetworkInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.PacketMirroringNetworkInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Unique identifier for the network; defined by the server.
   * </pre>
   *
   * <code>string canonical_url = 512294820;</code>
   *
   * @return Whether the canonicalUrl field is set.
   */
  boolean hasCanonicalUrl();
  /**
   *
   *
   * <pre>
   * [Output Only] Unique identifier for the network; defined by the server.
   * </pre>
   *
   * <code>string canonical_url = 512294820;</code>
   *
   * @return The canonicalUrl.
   */
  java.lang.String getCanonicalUrl();
  /**
   *
   *
   * <pre>
   * [Output Only] Unique identifier for the network; defined by the server.
   * </pre>
   *
   * <code>string canonical_url = 512294820;</code>
   *
   * @return The bytes for canonicalUrl.
   */
  com.google.protobuf.ByteString getCanonicalUrlBytes();

  /**
   *
   *
   * <pre>
   * URL of the network resource.
   * </pre>
   *
   * <code>string url = 116079;</code>
   *
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   *
   *
   * <pre>
   * URL of the network resource.
   * </pre>
   *
   * <code>string url = 116079;</code>
   *
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   *
   *
   * <pre>
   * URL of the network resource.
   * </pre>
   *
   * <code>string url = 116079;</code>
   *
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString getUrlBytes();
}
