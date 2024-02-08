/*
 * Copyright 2024 Google LLC
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
// source: google/devtools/cloudtrace/v1/trace.proto

// Protobuf Java Version: 3.25.2
package com.google.devtools.cloudtrace.v1;

public final class TraceProto {
  private TraceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v1_Trace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v1_Trace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v1_Traces_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v1_Traces_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v1_TraceSpan_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v1_TraceSpan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v1_TraceSpan_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v1_TraceSpan_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v1_ListTracesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v1_ListTracesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v1_ListTracesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v1_ListTracesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v1_GetTraceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v1_GetTraceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v1_PatchTracesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v1_PatchTracesRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/devtools/cloudtrace/v1/trace.pr"
          + "oto\022\035google.devtools.cloudtrace.v1\032\027goog"
          + "le/api/client.proto\032\037google/api/field_be"
          + "havior.proto\032\033google/protobuf/empty.prot"
          + "o\032\037google/protobuf/timestamp.proto\032\034goog"
          + "le/api/annotations.proto\"f\n\005Trace\022\022\n\npro"
          + "ject_id\030\001 \001(\t\022\020\n\010trace_id\030\002 \001(\t\0227\n\005spans"
          + "\030\003 \003(\0132(.google.devtools.cloudtrace.v1.T"
          + "raceSpan\">\n\006Traces\0224\n\006traces\030\001 \003(\0132$.goo"
          + "gle.devtools.cloudtrace.v1.Trace\"\242\003\n\tTra"
          + "ceSpan\022\017\n\007span_id\030\001 \001(\006\022?\n\004kind\030\002 \001(\01621."
          + "google.devtools.cloudtrace.v1.TraceSpan."
          + "SpanKind\022\014\n\004name\030\003 \001(\t\022.\n\nstart_time\030\004 \001"
          + "(\0132\032.google.protobuf.Timestamp\022,\n\010end_ti"
          + "me\030\005 \001(\0132\032.google.protobuf.Timestamp\022\033\n\016"
          + "parent_span_id\030\006 \001(\006B\003\340A\001\022D\n\006labels\030\007 \003("
          + "\01324.google.devtools.cloudtrace.v1.TraceS"
          + "pan.LabelsEntry\032-\n\013LabelsEntry\022\013\n\003key\030\001 "
          + "\001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"E\n\010SpanKind\022\031\n\025SP"
          + "AN_KIND_UNSPECIFIED\020\000\022\016\n\nRPC_SERVER\020\001\022\016\n"
          + "\nRPC_CLIENT\020\002\"\200\003\n\021ListTracesRequest\022\027\n\np"
          + "roject_id\030\001 \001(\tB\003\340A\002\022L\n\004view\030\002 \001(\01629.goo"
          + "gle.devtools.cloudtrace.v1.ListTracesReq"
          + "uest.ViewTypeB\003\340A\001\022\026\n\tpage_size\030\003 \001(\005B\003\340"
          + "A\001\022\022\n\npage_token\030\004 \001(\t\022.\n\nstart_time\030\005 \001"
          + "(\0132\032.google.protobuf.Timestamp\022,\n\010end_ti"
          + "me\030\006 \001(\0132\032.google.protobuf.Timestamp\022\023\n\006"
          + "filter\030\007 \001(\tB\003\340A\001\022\025\n\010order_by\030\010 \001(\tB\003\340A\001"
          + "\"N\n\010ViewType\022\031\n\025VIEW_TYPE_UNSPECIFIED\020\000\022"
          + "\013\n\007MINIMAL\020\001\022\014\n\010ROOTSPAN\020\002\022\014\n\010COMPLETE\020\003"
          + "\"c\n\022ListTracesResponse\0224\n\006traces\030\001 \003(\0132$"
          + ".google.devtools.cloudtrace.v1.Trace\022\027\n\017"
          + "next_page_token\030\002 \001(\t\"A\n\017GetTraceRequest"
          + "\022\027\n\nproject_id\030\001 \001(\tB\003\340A\002\022\025\n\010trace_id\030\002 "
          + "\001(\tB\003\340A\002\"i\n\022PatchTracesRequest\022\027\n\nprojec"
          + "t_id\030\001 \001(\tB\003\340A\002\022:\n\006traces\030\002 \001(\0132%.google"
          + ".devtools.cloudtrace.v1.TracesB\003\340A\0022\265\005\n\014"
          + "TraceService\022\250\001\n\nListTraces\0220.google.dev"
          + "tools.cloudtrace.v1.ListTracesRequest\0321."
          + "google.devtools.cloudtrace.v1.ListTraces"
          + "Response\"5\332A\nproject_id\202\323\344\223\002\"\022 /v1/proje"
          + "cts/{project_id}/traces\022\253\001\n\010GetTrace\022..g"
          + "oogle.devtools.cloudtrace.v1.GetTraceReq"
          + "uest\032$.google.devtools.cloudtrace.v1.Tra"
          + "ce\"I\332A\023project_id,trace_id\202\323\344\223\002-\022+/v1/pr"
          + "ojects/{project_id}/traces/{trace_id}\022\236\001"
          + "\n\013PatchTraces\0221.google.devtools.cloudtra"
          + "ce.v1.PatchTracesRequest\032\026.google.protob"
          + "uf.Empty\"D\332A\021project_id,traces\202\323\344\223\002*2 /v"
          + "1/projects/{project_id}/traces:\006traces\032\252"
          + "\001\312A\031cloudtrace.googleapis.com\322A\212\001https:/"
          + "/www.googleapis.com/auth/cloud-platform,"
          + "https://www.googleapis.com/auth/trace.ap"
          + "pend,https://www.googleapis.com/auth/tra"
          + "ce.readonlyB\255\001\n!com.google.devtools.clou"
          + "dtrace.v1B\nTraceProtoP\001Z/cloud.google.co"
          + "m/go/trace/apiv1/tracepb;tracepb\252\002\025Googl"
          + "e.Cloud.Trace.V1\312\002\025Google\\Cloud\\Trace\\V1"
          + "\352\002\030Google::Cloud::Trace::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_devtools_cloudtrace_v1_Trace_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_cloudtrace_v1_Trace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v1_Trace_descriptor,
            new java.lang.String[] {
              "ProjectId", "TraceId", "Spans",
            });
    internal_static_google_devtools_cloudtrace_v1_Traces_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_cloudtrace_v1_Traces_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v1_Traces_descriptor,
            new java.lang.String[] {
              "Traces",
            });
    internal_static_google_devtools_cloudtrace_v1_TraceSpan_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_cloudtrace_v1_TraceSpan_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v1_TraceSpan_descriptor,
            new java.lang.String[] {
              "SpanId", "Kind", "Name", "StartTime", "EndTime", "ParentSpanId", "Labels",
            });
    internal_static_google_devtools_cloudtrace_v1_TraceSpan_LabelsEntry_descriptor =
        internal_static_google_devtools_cloudtrace_v1_TraceSpan_descriptor.getNestedTypes().get(0);
    internal_static_google_devtools_cloudtrace_v1_TraceSpan_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v1_TraceSpan_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_devtools_cloudtrace_v1_ListTracesRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_cloudtrace_v1_ListTracesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v1_ListTracesRequest_descriptor,
            new java.lang.String[] {
              "ProjectId",
              "View",
              "PageSize",
              "PageToken",
              "StartTime",
              "EndTime",
              "Filter",
              "OrderBy",
            });
    internal_static_google_devtools_cloudtrace_v1_ListTracesResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_cloudtrace_v1_ListTracesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v1_ListTracesResponse_descriptor,
            new java.lang.String[] {
              "Traces", "NextPageToken",
            });
    internal_static_google_devtools_cloudtrace_v1_GetTraceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_cloudtrace_v1_GetTraceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v1_GetTraceRequest_descriptor,
            new java.lang.String[] {
              "ProjectId", "TraceId",
            });
    internal_static_google_devtools_cloudtrace_v1_PatchTracesRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_devtools_cloudtrace_v1_PatchTracesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v1_PatchTracesRequest_descriptor,
            new java.lang.String[] {
              "ProjectId", "Traces",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
