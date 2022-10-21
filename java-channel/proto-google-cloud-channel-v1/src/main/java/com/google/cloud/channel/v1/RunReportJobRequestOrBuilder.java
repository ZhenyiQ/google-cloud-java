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
// source: google/cloud/channel/v1/reports_service.proto

package com.google.cloud.channel.v1;

public interface RunReportJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.RunReportJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The report's resource name. Specifies the account and report used to
   * generate report data. The report_id identifier is a UID (for example,
   * `613bf59q`).
   * Name uses the format:
   * accounts/{account_id}/reports/{report_id}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The report's resource name. Specifies the account and report used to
   * generate report data. The report_id identifier is a UID (for example,
   * `613bf59q`).
   * Name uses the format:
   * accounts/{account_id}/reports/{report_id}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The range of usage or invoice dates to include in the result.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.DateRange date_range = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the dateRange field is set.
   */
  boolean hasDateRange();
  /**
   *
   *
   * <pre>
   * Optional. The range of usage or invoice dates to include in the result.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.DateRange date_range = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dateRange.
   */
  com.google.cloud.channel.v1.DateRange getDateRange();
  /**
   *
   *
   * <pre>
   * Optional. The range of usage or invoice dates to include in the result.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.DateRange date_range = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.channel.v1.DateRangeOrBuilder getDateRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A structured string that defines conditions on dimension columns to
   * restrict the report output.
   * Filters support logical operators (AND, OR, NOT) and conditional operators
   * (=, !=, &lt;, &gt;, &lt;=, and &gt;=) using `column_id` as keys.
   * For example:
   * `(customer:"accounts/C123abc/customers/S456def" OR
   * customer:"accounts/C123abc/customers/S789ghi") AND
   * invoice_start_date.year &gt;= 2022`
   * </pre>
   *
   * <code>string filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. A structured string that defines conditions on dimension columns to
   * restrict the report output.
   * Filters support logical operators (AND, OR, NOT) and conditional operators
   * (=, !=, &lt;, &gt;, &lt;=, and &gt;=) using `column_id` as keys.
   * For example:
   * `(customer:"accounts/C123abc/customers/S456def" OR
   * customer:"accounts/C123abc/customers/S789ghi") AND
   * invoice_start_date.year &gt;= 2022`
   * </pre>
   *
   * <code>string filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. The BCP-47 language code, such as "en-US".  If specified, the
   * response is localized to the corresponding language code if the
   * original data sources support it.
   * Default is "en-US".
   * </pre>
   *
   * <code>string language_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The BCP-47 language code, such as "en-US".  If specified, the
   * response is localized to the corresponding language code if the
   * original data sources support it.
   * Default is "en-US".
   * </pre>
   *
   * <code>string language_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
