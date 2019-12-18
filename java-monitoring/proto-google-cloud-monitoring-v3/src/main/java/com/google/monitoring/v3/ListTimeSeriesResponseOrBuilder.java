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
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

public interface ListTimeSeriesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListTimeSeriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * One or more time series that match the filter included in the request.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
   */
  java.util.List<com.google.monitoring.v3.TimeSeries> getTimeSeriesList();
  /**
   *
   *
   * <pre>
   * One or more time series that match the filter included in the request.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
   */
  com.google.monitoring.v3.TimeSeries getTimeSeries(int index);
  /**
   *
   *
   * <pre>
   * One or more time series that match the filter included in the request.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
   */
  int getTimeSeriesCount();
  /**
   *
   *
   * <pre>
   * One or more time series that match the filter included in the request.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
   */
  java.util.List<? extends com.google.monitoring.v3.TimeSeriesOrBuilder>
      getTimeSeriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * One or more time series that match the filter included in the request.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
   */
  com.google.monitoring.v3.TimeSeriesOrBuilder getTimeSeriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `pageToken` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `pageToken` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Query execution errors that may have caused the time series data returned
   * to be incomplete.
   * </pre>
   *
   * <code>repeated .google.rpc.Status execution_errors = 3;</code>
   */
  java.util.List<com.google.rpc.Status> getExecutionErrorsList();
  /**
   *
   *
   * <pre>
   * Query execution errors that may have caused the time series data returned
   * to be incomplete.
   * </pre>
   *
   * <code>repeated .google.rpc.Status execution_errors = 3;</code>
   */
  com.google.rpc.Status getExecutionErrors(int index);
  /**
   *
   *
   * <pre>
   * Query execution errors that may have caused the time series data returned
   * to be incomplete.
   * </pre>
   *
   * <code>repeated .google.rpc.Status execution_errors = 3;</code>
   */
  int getExecutionErrorsCount();
  /**
   *
   *
   * <pre>
   * Query execution errors that may have caused the time series data returned
   * to be incomplete.
   * </pre>
   *
   * <code>repeated .google.rpc.Status execution_errors = 3;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getExecutionErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Query execution errors that may have caused the time series data returned
   * to be incomplete.
   * </pre>
   *
   * <code>repeated .google.rpc.Status execution_errors = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getExecutionErrorsOrBuilder(int index);
}
