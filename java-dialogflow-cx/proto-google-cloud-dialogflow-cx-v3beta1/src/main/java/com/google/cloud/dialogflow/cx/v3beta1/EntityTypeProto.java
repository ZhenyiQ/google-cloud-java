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
// source: google/cloud/dialogflow/cx/v3beta1/entity_type.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class EntityTypeProto {
  private EntityTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_Entity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_ExcludedPhrase_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_ExcludedPhrase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteEntityTypeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/dialogflow/cx/v3beta1/ent"
          + "ity_type.proto\022\"google.cloud.dialogflow."
          + "cx.v3beta1\032\034google/api/annotations.proto"
          + "\032\027google/api/client.proto\032\037google/api/fi"
          + "eld_behavior.proto\032\031google/api/resource."
          + "proto\032\033google/protobuf/empty.proto\032 goog"
          + "le/protobuf/field_mask.proto\"\236\006\n\nEntityT"
          + "ype\022\014\n\004name\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB"
          + "\003\340A\002\022F\n\004kind\030\003 \001(\01623.google.cloud.dialog"
          + "flow.cx.v3beta1.EntityType.KindB\003\340A\002\022]\n\023"
          + "auto_expansion_mode\030\004 \001(\0162@.google.cloud"
          + ".dialogflow.cx.v3beta1.EntityType.AutoEx"
          + "pansionMode\022G\n\010entities\030\005 \003(\01325.google.c"
          + "loud.dialogflow.cx.v3beta1.EntityType.En"
          + "tity\022W\n\020excluded_phrases\030\006 \003(\0132=.google."
          + "cloud.dialogflow.cx.v3beta1.EntityType.E"
          + "xcludedPhrase\022\037\n\027enable_fuzzy_extraction"
          + "\030\007 \001(\010\0323\n\006Entity\022\022\n\005value\030\001 \001(\tB\003\340A\002\022\025\n\010"
          + "synonyms\030\002 \003(\tB\003\340A\002\032$\n\016ExcludedPhrase\022\022\n"
          + "\005value\030\001 \001(\tB\003\340A\002\"J\n\004Kind\022\024\n\020KIND_UNSPEC"
          + "IFIED\020\000\022\014\n\010KIND_MAP\020\001\022\r\n\tKIND_LIST\020\002\022\017\n\013"
          + "KIND_REGEXP\020\003\"Y\n\021AutoExpansionMode\022#\n\037AU"
          + "TO_EXPANSION_MODE_UNSPECIFIED\020\000\022\037\n\033AUTO_"
          + "EXPANSION_MODE_DEFAULT\020\001:{\352Ax\n$dialogflo"
          + "w.googleapis.com/EntityType\022Pprojects/{p"
          + "roject}/locations/{location}/agents/{age"
          + "nt}/entityTypes/{entity_type}\"\224\001\n\026ListEn"
          + "tityTypesRequest\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&"
          + "\022$dialogflow.googleapis.com/EntityType\022\025"
          + "\n\rlanguage_code\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005"
          + "\022\022\n\npage_token\030\004 \001(\t\"x\n\027ListEntityTypesR"
          + "esponse\022D\n\014entity_types\030\001 \003(\0132..google.c"
          + "loud.dialogflow.cx.v3beta1.EntityType\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"i\n\024GetEntityTypeR"
          + "equest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$dialogflow"
          + ".googleapis.com/EntityType\022\025\n\rlanguage_c"
          + "ode\030\002 \001(\t\"\270\001\n\027CreateEntityTypeRequest\022<\n"
          + "\006parent\030\001 \001(\tB,\340A\002\372A&\022$dialogflow.google"
          + "apis.com/EntityType\022H\n\013entity_type\030\002 \001(\013"
          + "2..google.cloud.dialogflow.cx.v3beta1.En"
          + "tityTypeB\003\340A\002\022\025\n\rlanguage_code\030\003 \001(\t\"\253\001\n"
          + "\027UpdateEntityTypeRequest\022H\n\013entity_type\030"
          + "\001 \001(\0132..google.cloud.dialogflow.cx.v3bet"
          + "a1.EntityTypeB\003\340A\002\022\025\n\rlanguage_code\030\002 \001("
          + "\t\022/\n\013update_mask\030\003 \001(\0132\032.google.protobuf"
          + ".FieldMask\"U\n\027DeleteEntityTypeRequest\022:\n"
          + "\004name\030\001 \001(\tB,\340A\002\372A&\n$dialogflow.googleap"
          + "is.com/EntityType2\315\t\n\013EntityTypes\022\332\001\n\017Li"
          + "stEntityTypes\022:.google.cloud.dialogflow."
          + "cx.v3beta1.ListEntityTypesRequest\032;.goog"
          + "le.cloud.dialogflow.cx.v3beta1.ListEntit"
          + "yTypesResponse\"N\202\323\344\223\002?\022=/v3beta1/{parent"
          + "=projects/*/locations/*/agents/*}/entity"
          + "Types\332A\006parent\022\307\001\n\rGetEntityType\0228.googl"
          + "e.cloud.dialogflow.cx.v3beta1.GetEntityT"
          + "ypeRequest\032..google.cloud.dialogflow.cx."
          + "v3beta1.EntityType\"L\202\323\344\223\002?\022=/v3beta1/{na"
          + "me=projects/*/locations/*/agents/*/entit"
          + "yTypes/*}\332A\004name\022\350\001\n\020CreateEntityType\022;."
          + "google.cloud.dialogflow.cx.v3beta1.Creat"
          + "eEntityTypeRequest\032..google.cloud.dialog"
          + "flow.cx.v3beta1.EntityType\"g\202\323\344\223\002L\"=/v3b"
          + "eta1/{parent=projects/*/locations/*/agen"
          + "ts/*}/entityTypes:\013entity_type\332A\022parent,"
          + "entity_type\022\371\001\n\020UpdateEntityType\022;.googl"
          + "e.cloud.dialogflow.cx.v3beta1.UpdateEnti"
          + "tyTypeRequest\032..google.cloud.dialogflow."
          + "cx.v3beta1.EntityType\"x\202\323\344\223\002X2I/v3beta1/"
          + "{entity_type.name=projects/*/locations/*"
          + "/agents/*/entityTypes/*}:\013entity_type\332A\027"
          + "entity_type,update_mask\022\265\001\n\020DeleteEntity"
          + "Type\022;.google.cloud.dialogflow.cx.v3beta"
          + "1.DeleteEntityTypeRequest\032\026.google.proto"
          + "buf.Empty\"L\202\323\344\223\002?*=/v3beta1/{name=projec"
          + "ts/*/locations/*/agents/*/entityTypes/*}"
          + "\332A\004name\032x\312A\031dialogflow.googleapis.com\322AY"
          + "https://www.googleapis.com/auth/cloud-pl"
          + "atform,https://www.googleapis.com/auth/d"
          + "ialogflowB\256\001\n&com.google.cloud.dialogflo"
          + "w.cx.v3beta1B\017EntityTypeProtoP\001ZDgoogle."
          + "golang.org/genproto/googleapis/cloud/dia"
          + "logflow/cx/v3beta1;cx\370\001\001\242\002\002DF\252\002\"Google.C"
          + "loud.Dialogflow.Cx.V3Beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Kind",
              "AutoExpansionMode",
              "Entities",
              "ExcludedPhrases",
              "EnableFuzzyExtraction",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_Entity_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_Entity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_Entity_descriptor,
            new java.lang.String[] {
              "Value", "Synonyms",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_ExcludedPhrase_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_ExcludedPhrase_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_EntityType_ExcludedPhrase_descriptor,
            new java.lang.String[] {
              "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityType", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "EntityType", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name",
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
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
