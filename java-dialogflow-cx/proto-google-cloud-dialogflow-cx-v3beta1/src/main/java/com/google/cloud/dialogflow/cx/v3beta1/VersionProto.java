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
// source: google/cloud/dialogflow/cx/v3beta1/version.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class VersionProto {
  private VersionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Version_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Version_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListVersionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListVersionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_LoadVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_LoadVersionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/dialogflow/cx/v3beta1/ver"
          + "sion.proto\022\"google.cloud.dialogflow.cx.v"
          + "3beta1\032\034google/api/annotations.proto\032\027go"
          + "ogle/api/client.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\032-google/cloud/dialogflow/cx/v3beta1/fl"
          + "ow.proto\032#google/longrunning/operations."
          + "proto\032\033google/protobuf/empty.proto\032 goog"
          + "le/protobuf/field_mask.proto\032\037google/pro"
          + "tobuf/timestamp.proto\"Y\n\036CreateVersionOp"
          + "erationMetadata\0227\n\007version\030\001 \001(\tB&\372A#\n!d"
          + "ialogflow.googleapis.com/Version\"\330\003\n\007Ver"
          + "sion\022\014\n\004name\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\t"
          + "B\003\340A\002\022\023\n\013description\030\003 \001(\t\022J\n\014nlu_settin"
          + "gs\030\004 \001(\0132/.google.cloud.dialogflow.cx.v3"
          + "beta1.NluSettingsB\003\340A\003\0224\n\013create_time\030\005 "
          + "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\022E\n\005"
          + "state\030\006 \001(\01621.google.cloud.dialogflow.cx"
          + ".v3beta1.Version.StateB\003\340A\003\"F\n\005State\022\025\n\021"
          + "STATE_UNSPECIFIED\020\000\022\013\n\007RUNNING\020\001\022\r\n\tSUCC"
          + "EEDED\020\002\022\n\n\006FAILED\020\003:~\352A{\n!dialogflow.goo"
          + "gleapis.com/Version\022Vprojects/{project}/"
          + "locations/{location}/agents/{agent}/flow"
          + "s/{flow}/versions/{version}\"w\n\023ListVersi"
          + "onsRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\022!dial"
          + "ogflow.googleapis.com/Version\022\021\n\tpage_si"
          + "ze\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"n\n\024ListVers"
          + "ionsResponse\022=\n\010versions\030\001 \003(\0132+.google."
          + "cloud.dialogflow.cx.v3beta1.Version\022\027\n\017n"
          + "ext_page_token\030\002 \001(\t\"L\n\021GetVersionReques"
          + "t\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!dialogflow.goog"
          + "leapis.com/Version\"\224\001\n\024CreateVersionRequ"
          + "est\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\022!dialogflow."
          + "googleapis.com/Version\022A\n\007version\030\002 \001(\0132"
          + "+.google.cloud.dialogflow.cx.v3beta1.Ver"
          + "sionB\003\340A\002\"\217\001\n\024UpdateVersionRequest\022A\n\007ve"
          + "rsion\030\001 \001(\0132+.google.cloud.dialogflow.cx"
          + ".v3beta1.VersionB\003\340A\002\0224\n\013update_mask\030\002 \001"
          + "(\0132\032.google.protobuf.FieldMaskB\003\340A\002\"O\n\024D"
          + "eleteVersionRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A"
          + "#\n!dialogflow.googleapis.com/Version\"u\n\022"
          + "LoadVersionRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#"
          + "\n!dialogflow.googleapis.com/Version\022&\n\036a"
          + "llow_override_agent_resources\030\002 \001(\0102\271\013\n\010"
          + "Versions\022\326\001\n\014ListVersions\0227.google.cloud"
          + ".dialogflow.cx.v3beta1.ListVersionsReque"
          + "st\0328.google.cloud.dialogflow.cx.v3beta1."
          + "ListVersionsResponse\"S\202\323\344\223\002D\022B/v3beta1/{"
          + "parent=projects/*/locations/*/agents/*/f"
          + "lows/*}/versions\332A\006parent\022\303\001\n\nGetVersion"
          + "\0225.google.cloud.dialogflow.cx.v3beta1.Ge"
          + "tVersionRequest\032+.google.cloud.dialogflo"
          + "w.cx.v3beta1.Version\"Q\202\323\344\223\002D\022B/v3beta1/{"
          + "name=projects/*/locations/*/agents/*/flo"
          + "ws/*/versions/*}\332A\004name\022\373\001\n\rCreateVersio"
          + "n\0228.google.cloud.dialogflow.cx.v3beta1.C"
          + "reateVersionRequest\032\035.google.longrunning"
          + ".Operation\"\220\001\202\323\344\223\002M\"B/v3beta1/{parent=pr"
          + "ojects/*/locations/*/agents/*/flows/*}/v"
          + "ersions:\007version\332A\016parent,version\312A)\n\007Ve"
          + "rsion\022\036CreateVersionOperationMetadata\022\351\001"
          + "\n\rUpdateVersion\0228.google.cloud.dialogflo"
          + "w.cx.v3beta1.UpdateVersionRequest\032+.goog"
          + "le.cloud.dialogflow.cx.v3beta1.Version\"q"
          + "\202\323\344\223\002U2J/v3beta1/{version.name=projects/"
          + "*/locations/*/agents/*/flows/*/versions/"
          + "*}:\007version\332A\023version,update_mask\022\264\001\n\rDe"
          + "leteVersion\0228.google.cloud.dialogflow.cx"
          + ".v3beta1.DeleteVersionRequest\032\026.google.p"
          + "rotobuf.Empty\"Q\202\323\344\223\002D*B/v3beta1/{name=pr"
          + "ojects/*/locations/*/agents/*/flows/*/ve"
          + "rsions/*}\332A\004name\022\362\001\n\013LoadVersion\0226.googl"
          + "e.cloud.dialogflow.cx.v3beta1.LoadVersio"
          + "nRequest\032\035.google.longrunning.Operation\""
          + "\213\001\202\323\344\223\002L\"G/v3beta1/{name=projects/*/loca"
          + "tions/*/agents/*/flows/*/versions/*}:loa"
          + "d:\001*\332A\004name\312A/\n\025google.protobuf.Empty\022\026g"
          + "oogle.protobuf.Struct\032x\312A\031dialogflow.goo"
          + "gleapis.com\322AYhttps://www.googleapis.com"
          + "/auth/cloud-platform,https://www.googlea"
          + "pis.com/auth/dialogflowB\253\001\n&com.google.c"
          + "loud.dialogflow.cx.v3beta1B\014VersionProto"
          + "P\001ZDgoogle.golang.org/genproto/googleapi"
          + "s/cloud/dialogflow/cx/v3beta1;cx\370\001\001\242\002\002DF"
          + "\252\002\"Google.Cloud.Dialogflow.Cx.V3Beta1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.FlowProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionOperationMetadata_descriptor,
            new java.lang.String[] {
              "Version",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Version_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Version_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Version_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "NluSettings", "CreateTime", "State",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListVersionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListVersionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListVersionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListVersionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListVersionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListVersionsResponse_descriptor,
            new java.lang.String[] {
              "Versions", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetVersionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateVersionRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Version",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateVersionRequest_descriptor,
            new java.lang.String[] {
              "Version", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteVersionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_LoadVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3beta1_LoadVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_LoadVersionRequest_descriptor,
            new java.lang.String[] {
              "Name", "AllowOverrideAgentResources",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.FlowProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
