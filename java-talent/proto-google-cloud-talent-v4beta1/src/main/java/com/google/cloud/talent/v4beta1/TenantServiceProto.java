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
// source: google/cloud/talent/v4beta1/tenant_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.talent.v4beta1;

public final class TenantServiceProto {
  private TenantServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CreateTenantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateTenantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_GetTenantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_GetTenantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_DeleteTenantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeleteTenantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListTenantsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListTenantsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListTenantsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListTenantsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/talent/v4beta1/tenant_ser"
          + "vice.proto\022\033google.cloud.talent.v4beta1\032"
          + "\034google/api/annotations.proto\032\027google/ap"
          + "i/client.proto\032\037google/api/field_behavio"
          + "r.proto\032\031google/api/resource.proto\032(goog"
          + "le/cloud/talent/v4beta1/common.proto\032(go"
          + "ogle/cloud/talent/v4beta1/tenant.proto\032\033"
          + "google/protobuf/empty.proto\032 google/prot"
          + "obuf/field_mask.proto\"\224\001\n\023CreateTenantRe"
          + "quest\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-\n+cloudreso"
          + "urcemanager.googleapis.com/Project\0228\n\006te"
          + "nant\030\002 \001(\0132#.google.cloud.talent.v4beta1"
          + ".TenantB\003\340A\002\"D\n\020GetTenantRequest\0220\n\004name"
          + "\030\001 \001(\tB\"\340A\002\372A\034\n\032jobs.googleapis.com/Tena"
          + "nt\"\200\001\n\023UpdateTenantRequest\0228\n\006tenant\030\001 \001"
          + "(\0132#.google.cloud.talent.v4beta1.TenantB"
          + "\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.google.proto"
          + "buf.FieldMask\"G\n\023DeleteTenantRequest\0220\n\004"
          + "name\030\001 \001(\tB\"\340A\002\372A\034\n\032jobs.googleapis.com/"
          + "Tenant\"\200\001\n\022ListTenantsRequest\022C\n\006parent\030"
          + "\001 \001(\tB3\340A\002\372A-\n+cloudresourcemanager.goog"
          + "leapis.com/Project\022\022\n\npage_token\030\002 \001(\t\022\021"
          + "\n\tpage_size\030\003 \001(\005\"\245\001\n\023ListTenantsRespons"
          + "e\0224\n\007tenants\030\001 \003(\0132#.google.cloud.talent"
          + ".v4beta1.Tenant\022\027\n\017next_page_token\030\002 \001(\t"
          + "\022?\n\010metadata\030\003 \001(\0132-.google.cloud.talent"
          + ".v4beta1.ResponseMetadata2\240\007\n\rTenantServ"
          + "ice\022\246\001\n\014CreateTenant\0220.google.cloud.tale"
          + "nt.v4beta1.CreateTenantRequest\032#.google."
          + "cloud.talent.v4beta1.Tenant\"?\332A\rparent,t"
          + "enant\202\323\344\223\002)\"$/v4beta1/{parent=projects/*"
          + "}/tenants:\001*\022\224\001\n\tGetTenant\022-.google.clou"
          + "d.talent.v4beta1.GetTenantRequest\032#.goog"
          + "le.cloud.talent.v4beta1.Tenant\"3\332A\004name\202"
          + "\323\344\223\002&\022$/v4beta1/{name=projects/*/tenants"
          + "/*}\022\246\001\n\014UpdateTenant\0220.google.cloud.tale"
          + "nt.v4beta1.UpdateTenantRequest\032#.google."
          + "cloud.talent.v4beta1.Tenant\"?\332A\006tenant\202\323"
          + "\344\223\00202+/v4beta1/{tenant.name=projects/*/t"
          + "enants/*}:\001*\022\215\001\n\014DeleteTenant\0220.google.c"
          + "loud.talent.v4beta1.DeleteTenantRequest\032"
          + "\026.google.protobuf.Empty\"3\332A\004name\202\323\344\223\002&*$"
          + "/v4beta1/{name=projects/*/tenants/*}\022\247\001\n"
          + "\013ListTenants\022/.google.cloud.talent.v4bet"
          + "a1.ListTenantsRequest\0320.google.cloud.tal"
          + "ent.v4beta1.ListTenantsResponse\"5\332A\006pare"
          + "nt\202\323\344\223\002&\022$/v4beta1/{parent=projects/*}/t"
          + "enants\032l\312A\023jobs.googleapis.com\322AShttps:/"
          + "/www.googleapis.com/auth/cloud-platform,"
          + "https://www.googleapis.com/auth/jobsBv\n\037"
          + "com.google.cloud.talent.v4beta1B\022TenantS"
          + "erviceProtoP\001Z7cloud.google.com/go/talen"
          + "t/apiv4beta1/talentpb;talentpb\242\002\003CTSb\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.TenantResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4beta1_CreateTenantRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CreateTenantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CreateTenantRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Tenant",
            });
    internal_static_google_cloud_talent_v4beta1_GetTenantRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_GetTenantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_GetTenantRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_descriptor,
            new java.lang.String[] {
              "Tenant", "UpdateMask",
            });
    internal_static_google_cloud_talent_v4beta1_DeleteTenantRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_DeleteTenantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_DeleteTenantRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_ListTenantsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_ListTenantsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListTenantsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageToken", "PageSize",
            });
    internal_static_google_cloud_talent_v4beta1_ListTenantsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_ListTenantsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListTenantsResponse_descriptor,
            new java.lang.String[] {
              "Tenants", "NextPageToken", "Metadata",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.cloud.talent.v4beta1.TenantResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
