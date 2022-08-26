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
// source: google/cloud/functions/v1/functions.proto

package com.google.cloud.functions.v1;

public interface GenerateUploadUrlResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v1.GenerateUploadUrlResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The generated Google Cloud Storage signed URL that should be used for a
   * function source code upload. The uploaded file should be a zip archive
   * which contains a function.
   * </pre>
   *
   * <code>string upload_url = 1;</code>
   *
   * @return The uploadUrl.
   */
  java.lang.String getUploadUrl();
  /**
   *
   *
   * <pre>
   * The generated Google Cloud Storage signed URL that should be used for a
   * function source code upload. The uploaded file should be a zip archive
   * which contains a function.
   * </pre>
   *
   * <code>string upload_url = 1;</code>
   *
   * @return The bytes for uploadUrl.
   */
  com.google.protobuf.ByteString getUploadUrlBytes();
}
