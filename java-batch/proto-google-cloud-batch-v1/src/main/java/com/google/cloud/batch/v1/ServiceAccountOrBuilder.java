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
// source: google/cloud/batch/v1/job.proto

package com.google.cloud.batch.v1;

public interface ServiceAccountOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1.ServiceAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Email address of the service account. If not specified, the default
   * Compute Engine service account for the project will be used. If instance
   * template is being used, the service account has to be specified in the
   * instance template and it has to match the email field here.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   *
   *
   * <pre>
   * Email address of the service account. If not specified, the default
   * Compute Engine service account for the project will be used. If instance
   * template is being used, the service account has to be specified in the
   * instance template and it has to match the email field here.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString getEmailBytes();
}