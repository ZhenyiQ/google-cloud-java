/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/dialogflow/cx/v3beta1/intent.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface ImportIntentsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ImportIntentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the imported intents.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>repeated string intents = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the intents.
   */
  java.util.List<java.lang.String> getIntentsList();
  /**
   *
   *
   * <pre>
   * The unique identifier of the imported intents.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>repeated string intents = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of intents.
   */
  int getIntentsCount();
  /**
   *
   *
   * <pre>
   * The unique identifier of the imported intents.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>repeated string intents = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The intents at the given index.
   */
  java.lang.String getIntents(int index);
  /**
   *
   *
   * <pre>
   * The unique identifier of the imported intents.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>repeated string intents = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the intents at the given index.
   */
  com.google.protobuf.ByteString getIntentsBytes(int index);

  /**
   *
   *
   * <pre>
   * Info which resources have conflicts when
   * [REPORT_CONFLICT][ImportIntentsResponse.REPORT_CONFLICT] merge_option is
   * set in ImportIntentsRequest.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.ImportIntentsResponse.ConflictingResources conflicting_resources = 2;
   * </code>
   *
   * @return Whether the conflictingResources field is set.
   */
  boolean hasConflictingResources();
  /**
   *
   *
   * <pre>
   * Info which resources have conflicts when
   * [REPORT_CONFLICT][ImportIntentsResponse.REPORT_CONFLICT] merge_option is
   * set in ImportIntentsRequest.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.ImportIntentsResponse.ConflictingResources conflicting_resources = 2;
   * </code>
   *
   * @return The conflictingResources.
   */
  com.google.cloud.dialogflow.cx.v3beta1.ImportIntentsResponse.ConflictingResources
      getConflictingResources();
  /**
   *
   *
   * <pre>
   * Info which resources have conflicts when
   * [REPORT_CONFLICT][ImportIntentsResponse.REPORT_CONFLICT] merge_option is
   * set in ImportIntentsRequest.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.ImportIntentsResponse.ConflictingResources conflicting_resources = 2;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ImportIntentsResponse.ConflictingResourcesOrBuilder
      getConflictingResourcesOrBuilder();
}
