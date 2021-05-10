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

public interface InstanceGroupManagersListManagedInstancesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The list of instances in the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ManagedInstance managed_instances = 336219614;</code>
   */
  java.util.List<com.google.cloud.compute.v1.ManagedInstance> getManagedInstancesList();
  /**
   *
   *
   * <pre>
   * [Output Only] The list of instances in the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ManagedInstance managed_instances = 336219614;</code>
   */
  com.google.cloud.compute.v1.ManagedInstance getManagedInstances(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] The list of instances in the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ManagedInstance managed_instances = 336219614;</code>
   */
  int getManagedInstancesCount();
  /**
   *
   *
   * <pre>
   * [Output Only] The list of instances in the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ManagedInstance managed_instances = 336219614;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ManagedInstanceOrBuilder>
      getManagedInstancesOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] The list of instances in the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ManagedInstance managed_instances = 336219614;</code>
   */
  com.google.cloud.compute.v1.ManagedInstanceOrBuilder getManagedInstancesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>string next_page_token = 79797525;</code>
   *
   * @return Whether the nextPageToken field is set.
   */
  boolean hasNextPageToken();
  /**
   *
   *
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>string next_page_token = 79797525;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>string next_page_token = 79797525;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
