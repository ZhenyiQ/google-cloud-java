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
// source: google/cloud/dataproc/v1beta2/autoscaling_policies.proto

package com.google.cloud.dataproc.v1beta2;

public final class AutoscalingPoliciesProto {
  private AutoscalingPoliciesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1beta2_AutoscalingPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1beta2_AutoscalingPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1beta2_BasicAutoscalingAlgorithm_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1beta2_BasicAutoscalingAlgorithm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1beta2_BasicYarnAutoscalingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1beta2_BasicYarnAutoscalingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1beta2_InstanceGroupAutoscalingPolicyConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1beta2_InstanceGroupAutoscalingPolicyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1beta2_CreateAutoscalingPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1beta2_CreateAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1beta2_GetAutoscalingPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1beta2_GetAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1beta2_UpdateAutoscalingPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1beta2_UpdateAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1beta2_DeleteAutoscalingPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1beta2_DeleteAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1beta2_ListAutoscalingPoliciesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1beta2_ListAutoscalingPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1beta2_ListAutoscalingPoliciesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1beta2_ListAutoscalingPoliciesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/dataproc/v1beta2/autoscal"
          + "ing_policies.proto\022\035google.cloud.datapro"
          + "c.v1beta2\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032\036google/protobuf/duration.proto\032\033go"
          + "ogle/protobuf/empty.proto\"\271\004\n\021Autoscalin"
          + "gPolicy\022\017\n\002id\030\001 \001(\tB\003\340A\002\022\021\n\004name\030\002 \001(\tB\003"
          + "\340A\003\022S\n\017basic_algorithm\030\003 \001(\01328.google.cl"
          + "oud.dataproc.v1beta2.BasicAutoscalingAlg"
          + "orithmH\000\022_\n\rworker_config\030\004 \001(\0132C.google"
          + ".cloud.dataproc.v1beta2.InstanceGroupAut"
          + "oscalingPolicyConfigB\003\340A\002\022i\n\027secondary_w"
          + "orker_config\030\005 \001(\0132C.google.cloud.datapr"
          + "oc.v1beta2.InstanceGroupAutoscalingPolic"
          + "yConfigB\003\340A\001:\321\001\352A\315\001\n)dataproc.googleapis"
          + ".com/AutoscalingPolicy\022Lprojects/{projec"
          + "t}/regions/{region}/autoscalingPolicies/"
          + "{autoscaling_policy}\022Pprojects/{project}"
          + "/locations/{location}/autoscalingPolicie"
          + "s/{autoscaling_policy} \001B\013\n\talgorithm\"\251\001"
          + "\n\031BasicAutoscalingAlgorithm\022S\n\013yarn_conf"
          + "ig\030\001 \001(\01329.google.cloud.dataproc.v1beta2"
          + ".BasicYarnAutoscalingConfigB\003\340A\002\0227\n\017cool"
          + "down_period\030\002 \001(\0132\031.google.protobuf.Dura"
          + "tionB\003\340A\001\"\371\001\n\032BasicYarnAutoscalingConfig"
          + "\022E\n\035graceful_decommission_timeout\030\005 \001(\0132"
          + "\031.google.protobuf.DurationB\003\340A\002\022\034\n\017scale"
          + "_up_factor\030\001 \001(\001B\003\340A\002\022\036\n\021scale_down_fact"
          + "or\030\002 \001(\001B\003\340A\002\022)\n\034scale_up_min_worker_fra"
          + "ction\030\003 \001(\001B\003\340A\001\022+\n\036scale_down_min_worke"
          + "r_fraction\030\004 \001(\001B\003\340A\001\"s\n$InstanceGroupAu"
          + "toscalingPolicyConfig\022\032\n\rmin_instances\030\001"
          + " \001(\005B\003\340A\001\022\032\n\rmax_instances\030\002 \001(\005B\003\340A\001\022\023\n"
          + "\006weight\030\003 \001(\005B\003\340A\001\"\252\001\n\036CreateAutoscaling"
          + "PolicyRequest\022A\n\006parent\030\001 \001(\tB1\340A\002\372A+\022)d"
          + "ataproc.googleapis.com/AutoscalingPolicy"
          + "\022E\n\006policy\030\002 \001(\01320.google.cloud.dataproc"
          + ".v1beta2.AutoscalingPolicyB\003\340A\002\"^\n\033GetAu"
          + "toscalingPolicyRequest\022?\n\004name\030\001 \001(\tB1\340A"
          + "\002\372A+\n)dataproc.googleapis.com/Autoscalin"
          + "gPolicy\"\225\001\n\036UpdateAutoscalingPolicyReque"
          + "st\022s\n\006policy\030\001 \001(\01320.google.cloud.datapr"
          + "oc.v1beta2.AutoscalingPolicyB1\340A\002\372A+\n)da"
          + "taproc.googleapis.com/AutoscalingPolicy\""
          + "a\n\036DeleteAutoscalingPolicyRequest\022?\n\004nam"
          + "e\030\001 \001(\tB1\340A\002\372A+\n)dataproc.googleapis.com"
          + "/AutoscalingPolicy\"\224\001\n\036ListAutoscalingPo"
          + "liciesRequest\022A\n\006parent\030\001 \001(\tB1\340A\002\372A+\022)d"
          + "ataproc.googleapis.com/AutoscalingPolicy"
          + "\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003"
          + " \001(\tB\003\340A\001\"\210\001\n\037ListAutoscalingPoliciesRes"
          + "ponse\022G\n\010policies\030\001 \003(\01320.google.cloud.d"
          + "ataproc.v1beta2.AutoscalingPolicyB\003\340A\003\022\034"
          + "\n\017next_page_token\030\002 \001(\tB\003\340A\0032\217\014\n\030Autosca"
          + "lingPolicyService\022\260\002\n\027CreateAutoscalingP"
          + "olicy\022=.google.cloud.dataproc.v1beta2.Cr"
          + "eateAutoscalingPolicyRequest\0320.google.cl"
          + "oud.dataproc.v1beta2.AutoscalingPolicy\"\243"
          + "\001\202\323\344\223\002\214\001\"</v1beta2/{parent=projects/*/lo"
          + "cations/*}/autoscalingPolicies:\006policyZD"
          + "\":/v1beta2/{parent=projects/*/regions/*}"
          + "/autoscalingPolicies:\006policy\332A\rparent,po"
          + "licy\022\267\002\n\027UpdateAutoscalingPolicy\022=.googl"
          + "e.cloud.dataproc.v1beta2.UpdateAutoscali"
          + "ngPolicyRequest\0320.google.cloud.dataproc."
          + "v1beta2.AutoscalingPolicy\"\252\001\202\323\344\223\002\232\001\032C/v1"
          + "beta2/{policy.name=projects/*/locations/"
          + "*/autoscalingPolicies/*}:\006policyZK\032A/v1b"
          + "eta2/{policy.name=projects/*/regions/*/a"
          + "utoscalingPolicies/*}:\006policy\332A\006policy\022\220"
          + "\002\n\024GetAutoscalingPolicy\022:.google.cloud.d"
          + "ataproc.v1beta2.GetAutoscalingPolicyRequ"
          + "est\0320.google.cloud.dataproc.v1beta2.Auto"
          + "scalingPolicy\"\211\001\202\323\344\223\002|\022</v1beta2/{name=p"
          + "rojects/*/locations/*/autoscalingPolicie"
          + "s/*}Z<\022:/v1beta2/{name=projects/*/region"
          + "s/*/autoscalingPolicies/*}\332A\004name\022\246\002\n\027Li"
          + "stAutoscalingPolicies\022=.google.cloud.dat"
          + "aproc.v1beta2.ListAutoscalingPoliciesReq"
          + "uest\032>.google.cloud.dataproc.v1beta2.Lis"
          + "tAutoscalingPoliciesResponse\"\213\001\202\323\344\223\002|\022</"
          + "v1beta2/{parent=projects/*/locations/*}/"
          + "autoscalingPoliciesZ<\022:/v1beta2/{parent="
          + "projects/*/regions/*}/autoscalingPolicie"
          + "s\332A\006parent\022\374\001\n\027DeleteAutoscalingPolicy\022="
          + ".google.cloud.dataproc.v1beta2.DeleteAut"
          + "oscalingPolicyRequest\032\026.google.protobuf."
          + "Empty\"\211\001\202\323\344\223\002|*</v1beta2/{name=projects/"
          + "*/locations/*/autoscalingPolicies/*}Z<*:"
          + "/v1beta2/{name=projects/*/regions/*/auto"
          + "scalingPolicies/*}\332A\004name\032K\312A\027dataproc.g"
          + "oogleapis.com\322A.https://www.googleapis.c"
          + "om/auth/cloud-platformB\206\001\n!com.google.cl"
          + "oud.dataproc.v1beta2B\030AutoscalingPolicie"
          + "sProtoP\001ZEgoogle.golang.org/genproto/goo"
          + "gleapis/cloud/dataproc/v1beta2;dataprocb"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_cloud_dataproc_v1beta2_AutoscalingPolicy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataproc_v1beta2_AutoscalingPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1beta2_AutoscalingPolicy_descriptor,
            new java.lang.String[] {
              "Id", "Name", "BasicAlgorithm", "WorkerConfig", "SecondaryWorkerConfig", "Algorithm",
            });
    internal_static_google_cloud_dataproc_v1beta2_BasicAutoscalingAlgorithm_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataproc_v1beta2_BasicAutoscalingAlgorithm_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1beta2_BasicAutoscalingAlgorithm_descriptor,
            new java.lang.String[] {
              "YarnConfig", "CooldownPeriod",
            });
    internal_static_google_cloud_dataproc_v1beta2_BasicYarnAutoscalingConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataproc_v1beta2_BasicYarnAutoscalingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1beta2_BasicYarnAutoscalingConfig_descriptor,
            new java.lang.String[] {
              "GracefulDecommissionTimeout",
              "ScaleUpFactor",
              "ScaleDownFactor",
              "ScaleUpMinWorkerFraction",
              "ScaleDownMinWorkerFraction",
            });
    internal_static_google_cloud_dataproc_v1beta2_InstanceGroupAutoscalingPolicyConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dataproc_v1beta2_InstanceGroupAutoscalingPolicyConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1beta2_InstanceGroupAutoscalingPolicyConfig_descriptor,
            new java.lang.String[] {
              "MinInstances", "MaxInstances", "Weight",
            });
    internal_static_google_cloud_dataproc_v1beta2_CreateAutoscalingPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dataproc_v1beta2_CreateAutoscalingPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1beta2_CreateAutoscalingPolicyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Policy",
            });
    internal_static_google_cloud_dataproc_v1beta2_GetAutoscalingPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dataproc_v1beta2_GetAutoscalingPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1beta2_GetAutoscalingPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataproc_v1beta2_UpdateAutoscalingPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dataproc_v1beta2_UpdateAutoscalingPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1beta2_UpdateAutoscalingPolicyRequest_descriptor,
            new java.lang.String[] {
              "Policy",
            });
    internal_static_google_cloud_dataproc_v1beta2_DeleteAutoscalingPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dataproc_v1beta2_DeleteAutoscalingPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1beta2_DeleteAutoscalingPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataproc_v1beta2_ListAutoscalingPoliciesRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dataproc_v1beta2_ListAutoscalingPoliciesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1beta2_ListAutoscalingPoliciesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dataproc_v1beta2_ListAutoscalingPoliciesResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dataproc_v1beta2_ListAutoscalingPoliciesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1beta2_ListAutoscalingPoliciesResponse_descriptor,
            new java.lang.String[] {
              "Policies", "NextPageToken",
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
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
