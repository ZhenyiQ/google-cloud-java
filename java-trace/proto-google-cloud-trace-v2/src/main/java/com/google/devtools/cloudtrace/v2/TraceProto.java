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
// source: google/devtools/cloudtrace/v2/trace.proto

// Protobuf Java Version: 3.25.2
package com.google.devtools.cloudtrace.v2;

public final class TraceProto {
  private TraceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_Attributes_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_Attributes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_Attributes_AttributeMapEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_Attributes_AttributeMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_Annotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_Annotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_MessageEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_MessageEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvents_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvents_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_Link_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_Link_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_Links_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_Links_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_AttributeValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_AttributeValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_StackTrace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_StackTrace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrame_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrame_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrames_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrames_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Module_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Module_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_TruncatableString_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_TruncatableString_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/devtools/cloudtrace/v2/trace.pr"
          + "oto\022\035google.devtools.cloudtrace.v2\032\037goog"
          + "le/api/field_behavior.proto\032\031google/api/"
          + "resource.proto\032\037google/protobuf/timestam"
          + "p.proto\032\036google/protobuf/wrappers.proto\032"
          + "\027google/rpc/status.proto\"\361\021\n\004Span\022\021\n\004nam"
          + "e\030\001 \001(\tB\003\340A\002\022\024\n\007span_id\030\002 \001(\tB\003\340A\002\022\026\n\016pa"
          + "rent_span_id\030\003 \001(\t\022K\n\014display_name\030\004 \001(\013"
          + "20.google.devtools.cloudtrace.v2.Truncat"
          + "ableStringB\003\340A\002\0223\n\nstart_time\030\005 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\003\340A\002\0221\n\010end_time"
          + "\030\006 \001(\0132\032.google.protobuf.TimestampB\003\340A\002\022"
          + "B\n\nattributes\030\007 \001(\0132..google.devtools.cl"
          + "oudtrace.v2.Span.Attributes\022>\n\013stack_tra"
          + "ce\030\010 \001(\0132).google.devtools.cloudtrace.v2"
          + ".StackTrace\022C\n\013time_events\030\t \001(\0132..googl"
          + "e.devtools.cloudtrace.v2.Span.TimeEvents"
          + "\0228\n\005links\030\n \001(\0132).google.devtools.cloudt"
          + "race.v2.Span.Links\022\'\n\006status\030\013 \001(\0132\022.goo"
          + "gle.rpc.StatusB\003\340A\001\022D\n\033same_process_as_p"
          + "arent_span\030\014 \001(\0132\032.google.protobuf.BoolV"
          + "alueB\003\340A\001\022:\n\020child_span_count\030\r \001(\0132\033.go"
          + "ogle.protobuf.Int32ValueB\003\340A\001\022D\n\tspan_ki"
          + "nd\030\016 \001(\0162,.google.devtools.cloudtrace.v2"
          + ".Span.SpanKindB\003\340A\001\032\353\001\n\nAttributes\022W\n\rat"
          + "tribute_map\030\001 \003(\0132@.google.devtools.clou"
          + "dtrace.v2.Span.Attributes.AttributeMapEn"
          + "try\022 \n\030dropped_attributes_count\030\002 \001(\005\032b\n"
          + "\021AttributeMapEntry\022\013\n\003key\030\001 \001(\t\022<\n\005value"
          + "\030\002 \001(\0132-.google.devtools.cloudtrace.v2.A"
          + "ttributeValue:\0028\001\032\337\004\n\tTimeEvent\022(\n\004time\030"
          + "\001 \001(\0132\032.google.protobuf.Timestamp\022N\n\nann"
          + "otation\030\002 \001(\01328.google.devtools.cloudtra"
          + "ce.v2.Span.TimeEvent.AnnotationH\000\022S\n\rmes"
          + "sage_event\030\003 \001(\0132:.google.devtools.cloud"
          + "trace.v2.Span.TimeEvent.MessageEventH\000\032\227"
          + "\001\n\nAnnotation\022E\n\013description\030\001 \001(\01320.goo"
          + "gle.devtools.cloudtrace.v2.TruncatableSt"
          + "ring\022B\n\nattributes\030\002 \001(\0132..google.devtoo"
          + "ls.cloudtrace.v2.Span.Attributes\032\337\001\n\014Mes"
          + "sageEvent\022M\n\004type\030\001 \001(\0162?.google.devtool"
          + "s.cloudtrace.v2.Span.TimeEvent.MessageEv"
          + "ent.Type\022\n\n\002id\030\002 \001(\003\022\037\n\027uncompressed_siz"
          + "e_bytes\030\003 \001(\003\022\035\n\025compressed_size_bytes\030\004"
          + " \001(\003\"4\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\010\n\004SE"
          + "NT\020\001\022\014\n\010RECEIVED\020\002B\007\n\005value\032\230\001\n\nTimeEven"
          + "ts\022A\n\ntime_event\030\001 \003(\0132-.google.devtools"
          + ".cloudtrace.v2.Span.TimeEvent\022!\n\031dropped"
          + "_annotations_count\030\002 \001(\005\022$\n\034dropped_mess"
          + "age_events_count\030\003 \001(\005\032\367\001\n\004Link\022\020\n\010trace"
          + "_id\030\001 \001(\t\022\017\n\007span_id\030\002 \001(\t\022;\n\004type\030\003 \001(\016"
          + "2-.google.devtools.cloudtrace.v2.Span.Li"
          + "nk.Type\022B\n\nattributes\030\004 \001(\0132..google.dev"
          + "tools.cloudtrace.v2.Span.Attributes\"K\n\004T"
          + "ype\022\024\n\020TYPE_UNSPECIFIED\020\000\022\025\n\021CHILD_LINKE"
          + "D_SPAN\020\001\022\026\n\022PARENT_LINKED_SPAN\020\002\032\\\n\005Link"
          + "s\0226\n\004link\030\001 \003(\0132(.google.devtools.cloudt"
          + "race.v2.Span.Link\022\033\n\023dropped_links_count"
          + "\030\002 \001(\005\"g\n\010SpanKind\022\031\n\025SPAN_KIND_UNSPECIF"
          + "IED\020\000\022\014\n\010INTERNAL\020\001\022\n\n\006SERVER\020\002\022\n\n\006CLIEN"
          + "T\020\003\022\014\n\010PRODUCER\020\004\022\014\n\010CONSUMER\020\005:S\352AP\n\036cl"
          + "oudtrace.googleapis.com/Span\022.projects/{"
          + "project}/traces/{trace}/spans/{span}\"\216\001\n"
          + "\016AttributeValue\022H\n\014string_value\030\001 \001(\01320."
          + "google.devtools.cloudtrace.v2.Truncatabl"
          + "eStringH\000\022\023\n\tint_value\030\002 \001(\003H\000\022\024\n\nbool_v"
          + "alue\030\003 \001(\010H\000B\007\n\005value\"\211\005\n\nStackTrace\022K\n\014"
          + "stack_frames\030\001 \001(\01325.google.devtools.clo"
          + "udtrace.v2.StackTrace.StackFrames\022\033\n\023sta"
          + "ck_trace_hash_id\030\002 \001(\003\032\236\003\n\nStackFrame\022G\n"
          + "\rfunction_name\030\001 \001(\01320.google.devtools.c"
          + "loudtrace.v2.TruncatableString\022P\n\026origin"
          + "al_function_name\030\002 \001(\01320.google.devtools"
          + ".cloudtrace.v2.TruncatableString\022C\n\tfile"
          + "_name\030\003 \001(\01320.google.devtools.cloudtrace"
          + ".v2.TruncatableString\022\023\n\013line_number\030\004 \001"
          + "(\003\022\025\n\rcolumn_number\030\005 \001(\003\022:\n\013load_module"
          + "\030\006 \001(\0132%.google.devtools.cloudtrace.v2.M"
          + "odule\022H\n\016source_version\030\007 \001(\01320.google.d"
          + "evtools.cloudtrace.v2.TruncatableString\032"
          + "p\n\013StackFrames\022C\n\005frame\030\001 \003(\01324.google.d"
          + "evtools.cloudtrace.v2.StackTrace.StackFr"
          + "ame\022\034\n\024dropped_frames_count\030\002 \001(\005\"\216\001\n\006Mo"
          + "dule\022@\n\006module\030\001 \001(\01320.google.devtools.c"
          + "loudtrace.v2.TruncatableString\022B\n\010build_"
          + "id\030\002 \001(\01320.google.devtools.cloudtrace.v2"
          + ".TruncatableString\"@\n\021TruncatableString\022"
          + "\r\n\005value\030\001 \001(\t\022\034\n\024truncated_byte_count\030\002"
          + " \001(\005B\255\001\n!com.google.devtools.cloudtrace."
          + "v2B\nTraceProtoP\001Z/cloud.google.com/go/tr"
          + "ace/apiv2/tracepb;tracepb\252\002\025Google.Cloud"
          + ".Trace.V2\312\002\025Google\\Cloud\\Trace\\V2\352\002\030Goog"
          + "le::Cloud::Trace::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_devtools_cloudtrace_v2_Span_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_cloudtrace_v2_Span_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_descriptor,
            new java.lang.String[] {
              "Name",
              "SpanId",
              "ParentSpanId",
              "DisplayName",
              "StartTime",
              "EndTime",
              "Attributes",
              "StackTrace",
              "TimeEvents",
              "Links",
              "Status",
              "SameProcessAsParentSpan",
              "ChildSpanCount",
              "SpanKind",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_Attributes_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_descriptor.getNestedTypes().get(0);
    internal_static_google_devtools_cloudtrace_v2_Span_Attributes_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_Attributes_descriptor,
            new java.lang.String[] {
              "AttributeMap", "DroppedAttributesCount",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_Attributes_AttributeMapEntry_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_Attributes_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_devtools_cloudtrace_v2_Span_Attributes_AttributeMapEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_Attributes_AttributeMapEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_descriptor.getNestedTypes().get(1);
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_descriptor,
            new java.lang.String[] {
              "Time", "Annotation", "MessageEvent", "Value",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_Annotation_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_Annotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_Annotation_descriptor,
            new java.lang.String[] {
              "Description", "Attributes",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_MessageEvent_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_MessageEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_MessageEvent_descriptor,
            new java.lang.String[] {
              "Type", "Id", "UncompressedSizeBytes", "CompressedSizeBytes",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvents_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_descriptor.getNestedTypes().get(2);
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvents_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_TimeEvents_descriptor,
            new java.lang.String[] {
              "TimeEvent", "DroppedAnnotationsCount", "DroppedMessageEventsCount",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_Link_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_descriptor.getNestedTypes().get(3);
    internal_static_google_devtools_cloudtrace_v2_Span_Link_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_Link_descriptor,
            new java.lang.String[] {
              "TraceId", "SpanId", "Type", "Attributes",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_Links_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_descriptor.getNestedTypes().get(4);
    internal_static_google_devtools_cloudtrace_v2_Span_Links_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_Links_descriptor,
            new java.lang.String[] {
              "Link", "DroppedLinksCount",
            });
    internal_static_google_devtools_cloudtrace_v2_AttributeValue_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_cloudtrace_v2_AttributeValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_AttributeValue_descriptor,
            new java.lang.String[] {
              "StringValue", "IntValue", "BoolValue", "Value",
            });
    internal_static_google_devtools_cloudtrace_v2_StackTrace_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_cloudtrace_v2_StackTrace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_StackTrace_descriptor,
            new java.lang.String[] {
              "StackFrames", "StackTraceHashId",
            });
    internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrame_descriptor =
        internal_static_google_devtools_cloudtrace_v2_StackTrace_descriptor.getNestedTypes().get(0);
    internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrame_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrame_descriptor,
            new java.lang.String[] {
              "FunctionName",
              "OriginalFunctionName",
              "FileName",
              "LineNumber",
              "ColumnNumber",
              "LoadModule",
              "SourceVersion",
            });
    internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrames_descriptor =
        internal_static_google_devtools_cloudtrace_v2_StackTrace_descriptor.getNestedTypes().get(1);
    internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrames_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrames_descriptor,
            new java.lang.String[] {
              "Frame", "DroppedFramesCount",
            });
    internal_static_google_devtools_cloudtrace_v2_Module_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_cloudtrace_v2_Module_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Module_descriptor,
            new java.lang.String[] {
              "Module", "BuildId",
            });
    internal_static_google_devtools_cloudtrace_v2_TruncatableString_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_cloudtrace_v2_TruncatableString_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_TruncatableString_descriptor,
            new java.lang.String[] {
              "Value", "TruncatedByteCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
