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
// source: google/monitoring/dashboard/v1/metrics.proto

package com.google.monitoring.dashboard.v1;

public final class MetricsProto {
  private MetricsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_TimeSeriesQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_TimeSeriesFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_RatioPart_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_RatioPart_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Threshold_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Threshold_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/monitoring/dashboard/v1/metrics"
          + ".proto\022\036google.monitoring.dashboard.v1\032\037"
          + "google/api/field_behavior.proto\032+google/"
          + "monitoring/dashboard/v1/common.proto\"\335\001\n"
          + "\017TimeSeriesQuery\022N\n\022time_series_filter\030\001"
          + " \001(\01320.google.monitoring.dashboard.v1.Ti"
          + "meSeriesFilterH\000\022Y\n\030time_series_filter_r"
          + "atio\030\002 \001(\01325.google.monitoring.dashboard"
          + ".v1.TimeSeriesFilterRatioH\000\022\025\n\runit_over"
          + "ride\030\005 \001(\tB\010\n\006source\"\272\002\n\020TimeSeriesFilte"
          + "r\022\023\n\006filter\030\001 \001(\tB\003\340A\002\022@\n\013aggregation\030\002 "
          + "\001(\0132+.google.monitoring.dashboard.v1.Agg"
          + "regation\022W\n\027pick_time_series_filter\030\004 \001("
          + "\01324.google.monitoring.dashboard.v1.PickT"
          + "imeSeriesFilterH\000\022e\n\036statistical_time_se"
          + "ries_filter\030\005 \001(\0132;.google.monitoring.da"
          + "shboard.v1.StatisticalTimeSeriesFilterH\000"
          + "B\017\n\routput_filter\"\302\004\n\025TimeSeriesFilterRa"
          + "tio\022R\n\tnumerator\030\001 \001(\0132?.google.monitori"
          + "ng.dashboard.v1.TimeSeriesFilterRatio.Ra"
          + "tioPart\022T\n\013denominator\030\002 \001(\0132?.google.mo"
          + "nitoring.dashboard.v1.TimeSeriesFilterRa"
          + "tio.RatioPart\022J\n\025secondary_aggregation\030\003"
          + " \001(\0132+.google.monitoring.dashboard.v1.Ag"
          + "gregation\022W\n\027pick_time_series_filter\030\004 \001"
          + "(\01324.google.monitoring.dashboard.v1.Pick"
          + "TimeSeriesFilterH\000\022e\n\036statistical_time_s"
          + "eries_filter\030\005 \001(\0132;.google.monitoring.d"
          + "ashboard.v1.StatisticalTimeSeriesFilterH"
          + "\000\032b\n\tRatioPart\022\023\n\006filter\030\001 \001(\tB\003\340A\002\022@\n\013a"
          + "ggregation\030\002 \001(\0132+.google.monitoring.das"
          + "hboard.v1.AggregationB\017\n\routput_filter\"\244"
          + "\002\n\tThreshold\022\r\n\005label\030\001 \001(\t\022\r\n\005value\030\002 \001"
          + "(\001\022>\n\005color\030\003 \001(\0162/.google.monitoring.da"
          + "shboard.v1.Threshold.Color\022F\n\tdirection\030"
          + "\004 \001(\01623.google.monitoring.dashboard.v1.T"
          + "hreshold.Direction\"3\n\005Color\022\025\n\021COLOR_UNS"
          + "PECIFIED\020\000\022\n\n\006YELLOW\020\004\022\007\n\003RED\020\006\"<\n\tDirec"
          + "tion\022\031\n\025DIRECTION_UNSPECIFIED\020\000\022\t\n\005ABOVE"
          + "\020\001\022\t\n\005BELOW\020\002*Q\n\016SparkChartType\022 \n\034SPARK"
          + "_CHART_TYPE_UNSPECIFIED\020\000\022\016\n\nSPARK_LINE\020"
          + "\001\022\r\n\tSPARK_BAR\020\002B}\n\"com.google.monitorin"
          + "g.dashboard.v1B\014MetricsProtoP\001ZGgoogle.g"
          + "olang.org/genproto/googleapis/monitoring"
          + "/dashboard/v1;dashboardb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.CommonProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesQuery_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_TimeSeriesQuery_descriptor,
            new java.lang.String[] {
              "TimeSeriesFilter", "TimeSeriesFilterRatio", "UnitOverride", "Source",
            });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesFilter_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_TimeSeriesFilter_descriptor,
            new java.lang.String[] {
              "Filter",
              "Aggregation",
              "PickTimeSeriesFilter",
              "StatisticalTimeSeriesFilter",
              "OutputFilter",
            });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_descriptor,
            new java.lang.String[] {
              "Numerator",
              "Denominator",
              "SecondaryAggregation",
              "PickTimeSeriesFilter",
              "StatisticalTimeSeriesFilter",
              "OutputFilter",
            });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_RatioPart_descriptor =
        internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_RatioPart_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_RatioPart_descriptor,
            new java.lang.String[] {
              "Filter", "Aggregation",
            });
    internal_static_google_monitoring_dashboard_v1_Threshold_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_dashboard_v1_Threshold_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Threshold_descriptor,
            new java.lang.String[] {
              "Label", "Value", "Color", "Direction",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.monitoring.dashboard.v1.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
