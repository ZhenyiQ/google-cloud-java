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
// source: google/monitoring/dashboard/v1/widget.proto

package com.google.monitoring.dashboard.v1;

public final class WidgetProto {
  private WidgetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Widget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Widget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/monitoring/dashboard/v1/widget."
          + "proto\022\036google.monitoring.dashboard.v1\032\037g"
          + "oogle/api/field_behavior.proto\032.google/m"
          + "onitoring/dashboard/v1/scorecard.proto\032)"
          + "google/monitoring/dashboard/v1/text.prot"
          + "o\032,google/monitoring/dashboard/v1/xychar"
          + "t.proto\032\033google/protobuf/empty.proto\"\203\002\n"
          + "\006Widget\022\022\n\005title\030\001 \001(\tB\003\340A\001\022;\n\010xy_chart\030"
          + "\002 \001(\0132\'.google.monitoring.dashboard.v1.X"
          + "yChartH\000\022>\n\tscorecard\030\003 \001(\0132).google.mon"
          + "itoring.dashboard.v1.ScorecardH\000\0224\n\004text"
          + "\030\004 \001(\0132$.google.monitoring.dashboard.v1."
          + "TextH\000\022\'\n\005blank\030\005 \001(\0132\026.google.protobuf."
          + "EmptyH\000B\t\n\007contentB|\n\"com.google.monitor"
          + "ing.dashboard.v1B\013WidgetProtoP\001ZGgoogle."
          + "golang.org/genproto/googleapis/monitorin"
          + "g/dashboard/v1;dashboardb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.ScorecardProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.TextProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.XyChartProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_Widget_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_Widget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Widget_descriptor,
            new java.lang.String[] {
              "Title", "XyChart", "Scorecard", "Text", "Blank", "Content",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.monitoring.dashboard.v1.ScorecardProto.getDescriptor();
    com.google.monitoring.dashboard.v1.TextProto.getDescriptor();
    com.google.monitoring.dashboard.v1.XyChartProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
