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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface RecordConditionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.RecordCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An expression.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordCondition.Expressions expressions = 3;</code>
   *
   * @return Whether the expressions field is set.
   */
  boolean hasExpressions();
  /**
   *
   *
   * <pre>
   * An expression.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordCondition.Expressions expressions = 3;</code>
   *
   * @return The expressions.
   */
  com.google.privacy.dlp.v2.RecordCondition.Expressions getExpressions();
  /**
   *
   *
   * <pre>
   * An expression.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordCondition.Expressions expressions = 3;</code>
   */
  com.google.privacy.dlp.v2.RecordCondition.ExpressionsOrBuilder getExpressionsOrBuilder();
}