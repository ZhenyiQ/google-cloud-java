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

public interface TargetHttpsProxiesScopedListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TargetHttpsProxiesScopedList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of TargetHttpsProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.TargetHttpsProxy> getTargetHttpsProxiesList();
  /**
   *
   *
   * <pre>
   * A list of TargetHttpsProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;
   * </code>
   */
  com.google.cloud.compute.v1.TargetHttpsProxy getTargetHttpsProxies(int index);
  /**
   *
   *
   * <pre>
   * A list of TargetHttpsProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;
   * </code>
   */
  int getTargetHttpsProxiesCount();
  /**
   *
   *
   * <pre>
   * A list of TargetHttpsProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.TargetHttpsProxyOrBuilder>
      getTargetHttpsProxiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of TargetHttpsProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpsProxy target_https_proxies = 366607882;
   * </code>
   */
  com.google.cloud.compute.v1.TargetHttpsProxyOrBuilder getTargetHttpsProxiesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();
  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}
