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
// source: google/cloud/talent/v4/company_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.talent.v4;

public final class CompanyServiceProto {
  private CompanyServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_CreateCompanyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_CreateCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_GetCompanyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_GetCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_UpdateCompanyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_UpdateCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_DeleteCompanyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_DeleteCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_ListCompaniesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_ListCompaniesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_ListCompaniesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_ListCompaniesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/talent/v4/company_service"
          + ".proto\022\026google.cloud.talent.v4\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032#google/cloud/"
          + "talent/v4/common.proto\032$google/cloud/tal"
          + "ent/v4/company.proto\032\033google/protobuf/em"
          + "pty.proto\032 google/protobuf/field_mask.pr"
          + "oto\"\201\001\n\024CreateCompanyRequest\0222\n\006parent\030\001"
          + " \001(\tB\"\340A\002\372A\034\n\032jobs.googleapis.com/Tenant"
          + "\0225\n\007company\030\002 \001(\0132\037.google.cloud.talent."
          + "v4.CompanyB\003\340A\002\"F\n\021GetCompanyRequest\0221\n\004"
          + "name\030\001 \001(\tB#\340A\002\372A\035\n\033jobs.googleapis.com/"
          + "Company\"~\n\024UpdateCompanyRequest\0225\n\007compa"
          + "ny\030\001 \001(\0132\037.google.cloud.talent.v4.Compan"
          + "yB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.google.pro"
          + "tobuf.FieldMask\"I\n\024DeleteCompanyRequest\022"
          + "1\n\004name\030\001 \001(\tB#\340A\002\372A\035\n\033jobs.googleapis.c"
          + "om/Company\"\214\001\n\024ListCompaniesRequest\0222\n\006p"
          + "arent\030\001 \001(\tB\"\340A\002\372A\034\n\032jobs.googleapis.com"
          + "/Tenant\022\022\n\npage_token\030\002 \001(\t\022\021\n\tpage_size"
          + "\030\003 \001(\005\022\031\n\021require_open_jobs\030\004 \001(\010\"\240\001\n\025Li"
          + "stCompaniesResponse\0222\n\tcompanies\030\001 \003(\0132\037"
          + ".google.cloud.talent.v4.Company\022\027\n\017next_"
          + "page_token\030\002 \001(\t\022:\n\010metadata\030\003 \001(\0132(.goo"
          + "gle.cloud.talent.v4.ResponseMetadata2\303\007\n"
          + "\016CompanyService\022\255\001\n\rCreateCompany\022,.goog"
          + "le.cloud.talent.v4.CreateCompanyRequest\032"
          + "\037.google.cloud.talent.v4.Company\"M\332A\016par"
          + "ent,company\202\323\344\223\0026\"+/v4/{parent=projects/"
          + "*/tenants/*}/companies:\007company\022\224\001\n\nGetC"
          + "ompany\022).google.cloud.talent.v4.GetCompa"
          + "nyRequest\032\037.google.cloud.talent.v4.Compa"
          + "ny\":\332A\004name\202\323\344\223\002-\022+/v4/{name=projects/*/"
          + "tenants/*/companies/*}\022\272\001\n\rUpdateCompany"
          + "\022,.google.cloud.talent.v4.UpdateCompanyR"
          + "equest\032\037.google.cloud.talent.v4.Company\""
          + "Z\332A\023company,update_mask\202\323\344\223\002>23/v4/{comp"
          + "any.name=projects/*/tenants/*/companies/"
          + "*}:\007company\022\221\001\n\rDeleteCompany\022,.google.c"
          + "loud.talent.v4.DeleteCompanyRequest\032\026.go"
          + "ogle.protobuf.Empty\":\332A\004name\202\323\344\223\002-*+/v4/"
          + "{name=projects/*/tenants/*/companies/*}\022"
          + "\252\001\n\rListCompanies\022,.google.cloud.talent."
          + "v4.ListCompaniesRequest\032-.google.cloud.t"
          + "alent.v4.ListCompaniesResponse\"<\332A\006paren"
          + "t\202\323\344\223\002-\022+/v4/{parent=projects/*/tenants/"
          + "*}/companies\032l\312A\023jobs.googleapis.com\322ASh"
          + "ttps://www.googleapis.com/auth/cloud-pla"
          + "tform,https://www.googleapis.com/auth/jo"
          + "bsBm\n\032com.google.cloud.talent.v4B\023Compan"
          + "yServiceProtoP\001Z2cloud.google.com/go/tal"
          + "ent/apiv4/talentpb;talentpb\242\002\003CTSb\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.talent.v4.CommonProto.getDescriptor(),
              com.google.cloud.talent.v4.CompanyProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4_CreateCompanyRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4_CreateCompanyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_CreateCompanyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Company",
            });
    internal_static_google_cloud_talent_v4_GetCompanyRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4_GetCompanyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_GetCompanyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4_UpdateCompanyRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4_UpdateCompanyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_UpdateCompanyRequest_descriptor,
            new java.lang.String[] {
              "Company", "UpdateMask",
            });
    internal_static_google_cloud_talent_v4_DeleteCompanyRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4_DeleteCompanyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_DeleteCompanyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4_ListCompaniesRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4_ListCompaniesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_ListCompaniesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageToken", "PageSize", "RequireOpenJobs",
            });
    internal_static_google_cloud_talent_v4_ListCompaniesResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4_ListCompaniesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_ListCompaniesResponse_descriptor,
            new java.lang.String[] {
              "Companies", "NextPageToken", "Metadata",
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
    com.google.cloud.talent.v4.CommonProto.getDescriptor();
    com.google.cloud.talent.v4.CompanyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
