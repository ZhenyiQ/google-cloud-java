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
// source: google/cloud/config/v1/config.proto

package com.google.cloud.config.v1;

public interface PreviewArtifactsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.config.v1.PreviewArtifacts)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Location of a blueprint copy and other content in Google Cloud
   * Storage. Format: `gs://{bucket}/{object}`
   * </pre>
   *
   * <code>string content = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The content.
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * Output only. Location of a blueprint copy and other content in Google Cloud
   * Storage. Format: `gs://{bucket}/{object}`
   * </pre>
   *
   * <code>string content = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * Output only. Location of artifacts in Google Cloud Storage.
   * Format: `gs://{bucket}/{object}`
   * </pre>
   *
   * <code>string artifacts = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The artifacts.
   */
  java.lang.String getArtifacts();
  /**
   *
   *
   * <pre>
   * Output only. Location of artifacts in Google Cloud Storage.
   * Format: `gs://{bucket}/{object}`
   * </pre>
   *
   * <code>string artifacts = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for artifacts.
   */
  com.google.protobuf.ByteString getArtifactsBytes();
}
