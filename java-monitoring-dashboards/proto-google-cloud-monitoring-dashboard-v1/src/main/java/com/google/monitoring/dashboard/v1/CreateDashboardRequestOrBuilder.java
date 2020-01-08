/*
 * Copyright 2019 Google LLC
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
// source: google/monitoring/dashboard/v1/dashboards_service.proto

package com.google.monitoring.dashboard.v1;

public interface CreateDashboardRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.CreateDashboardRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project on which to execute the request. The format is
   * `"projects/{project_id_or_number}"`. The {project_id_or_number} must match
   * the dashboard resource name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project on which to execute the request. The format is
   * `"projects/{project_id_or_number}"`. The {project_id_or_number} must match
   * the dashboard resource name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The initial dashboard specification.
   * </pre>
   *
   * <code>
   * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dashboard field is set.
   */
  boolean hasDashboard();
  /**
   *
   *
   * <pre>
   * Required. The initial dashboard specification.
   * </pre>
   *
   * <code>
   * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dashboard.
   */
  com.google.monitoring.dashboard.v1.Dashboard getDashboard();
  /**
   *
   *
   * <pre>
   * Required. The initial dashboard specification.
   * </pre>
   *
   * <code>
   * .google.monitoring.dashboard.v1.Dashboard dashboard = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.dashboard.v1.DashboardOrBuilder getDashboardOrBuilder();
}
