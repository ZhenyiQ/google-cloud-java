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

public interface ReportResultsMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ReportResultsMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Details of the completed report.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Report report = 1;</code>
   *
   * @return Whether the report field is set.
   */
  boolean hasReport();
  /**
   *
   *
   * <pre>
   * Details of the completed report.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Report report = 1;</code>
   *
   * @return The report.
   */
  com.google.cloud.channel.v1.Report getReport();
  /**
   *
   *
   * <pre>
   * Details of the completed report.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Report report = 1;</code>
   */
  com.google.cloud.channel.v1.ReportOrBuilder getReportOrBuilder();

  /**
   *
   *
   * <pre>
   * The total number of rows of data in the final report.
   * </pre>
   *
   * <code>int64 row_count = 2;</code>
   *
   * @return The rowCount.
   */
  long getRowCount();

  /**
   *
   *
   * <pre>
   * The date range of reported usage.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.DateRange date_range = 3;</code>
   *
   * @return Whether the dateRange field is set.
   */
  boolean hasDateRange();
  /**
   *
   *
   * <pre>
   * The date range of reported usage.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.DateRange date_range = 3;</code>
   *
   * @return The dateRange.
   */
  com.google.cloud.channel.v1.DateRange getDateRange();
  /**
   *
   *
   * <pre>
   * The date range of reported usage.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.DateRange date_range = 3;</code>
   */
  com.google.cloud.channel.v1.DateRangeOrBuilder getDateRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * The usage dates immediately preceding `date_range` with the same duration.
   * Use this to calculate trending usage and costs. This is only populated if
   * you request trending data.
   * For example, if `date_range` is July 1-15, `preceding_date_range` will be
   * June 16-30.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.DateRange preceding_date_range = 4;</code>
   *
   * @return Whether the precedingDateRange field is set.
   */
  boolean hasPrecedingDateRange();
  /**
   *
   *
   * <pre>
   * The usage dates immediately preceding `date_range` with the same duration.
   * Use this to calculate trending usage and costs. This is only populated if
   * you request trending data.
   * For example, if `date_range` is July 1-15, `preceding_date_range` will be
   * June 16-30.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.DateRange preceding_date_range = 4;</code>
   *
   * @return The precedingDateRange.
   */
  com.google.cloud.channel.v1.DateRange getPrecedingDateRange();
  /**
   *
   *
   * <pre>
   * The usage dates immediately preceding `date_range` with the same duration.
   * Use this to calculate trending usage and costs. This is only populated if
   * you request trending data.
   * For example, if `date_range` is July 1-15, `preceding_date_range` will be
   * June 16-30.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.DateRange preceding_date_range = 4;</code>
   */
  com.google.cloud.channel.v1.DateRangeOrBuilder getPrecedingDateRangeOrBuilder();
}
