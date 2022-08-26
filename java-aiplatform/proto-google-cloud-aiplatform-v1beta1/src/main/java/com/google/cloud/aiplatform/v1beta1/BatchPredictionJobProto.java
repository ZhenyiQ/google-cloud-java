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
// source: google/cloud/aiplatform/v1beta1/batch_prediction_job.proto

package com.google.cloud.aiplatform.v1beta1;

public final class BatchPredictionJobProto {
  private BatchPredictionJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_InputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_InputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/aiplatform/v1beta1/batch_"
          + "prediction_job.proto\022\037google.cloud.aipla"
          + "tform.v1beta1\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\0326googl"
          + "e/cloud/aiplatform/v1beta1/completion_st"
          + "ats.proto\0325google/cloud/aiplatform/v1bet"
          + "a1/encryption_spec.proto\0321google/cloud/a"
          + "iplatform/v1beta1/explanation.proto\032(goo"
          + "gle/cloud/aiplatform/v1beta1/io.proto\032/g"
          + "oogle/cloud/aiplatform/v1beta1/job_state"
          + ".proto\0327google/cloud/aiplatform/v1beta1/"
          + "machine_resources.proto\032Dgoogle/cloud/ai"
          + "platform/v1beta1/manual_batch_tuning_par"
          + "ameters.proto\0326google/cloud/aiplatform/v"
          + "1beta1/model_monitoring.proto\032?google/cl"
          + "oud/aiplatform/v1beta1/unmanaged_contain"
          + "er_model.proto\032\034google/protobuf/struct.p"
          + "roto\032\037google/protobuf/timestamp.proto\032\027g"
          + "oogle/rpc/status.proto\"\373\022\n\022BatchPredicti"
          + "onJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display_name"
          + "\030\002 \001(\tB\003\340A\002\0223\n\005model\030\003 \001(\tB$\372A!\n\037aiplatf"
          + "orm.googleapis.com/Model\022\035\n\020model_versio"
          + "n_id\030\036 \001(\tB\003\340A\003\022[\n\031unmanaged_container_m"
          + "odel\030\034 \001(\01328.google.cloud.aiplatform.v1b"
          + "eta1.UnmanagedContainerModel\022Z\n\014input_co"
          + "nfig\030\004 \001(\0132?.google.cloud.aiplatform.v1b"
          + "eta1.BatchPredictionJob.InputConfigB\003\340A\002"
          + "\0220\n\020model_parameters\030\005 \001(\0132\026.google.prot"
          + "obuf.Value\022\\\n\routput_config\030\006 \001(\0132@.goog"
          + "le.cloud.aiplatform.v1beta1.BatchPredict"
          + "ionJob.OutputConfigB\003\340A\002\022U\n\023dedicated_re"
          + "sources\030\007 \001(\01328.google.cloud.aiplatform."
          + "v1beta1.BatchDedicatedResources\022\027\n\017servi"
          + "ce_account\030\035 \001(\t\022i\n\036manual_batch_tuning_"
          + "parameters\030\010 \001(\0132<.google.cloud.aiplatfo"
          + "rm.v1beta1.ManualBatchTuningParametersB\003"
          + "\340A\005\022\034\n\024generate_explanation\030\027 \001(\010\022J\n\020exp"
          + "lanation_spec\030\031 \001(\01320.google.cloud.aipla"
          + "tform.v1beta1.ExplanationSpec\022X\n\013output_"
          + "info\030\t \001(\0132>.google.cloud.aiplatform.v1b"
          + "eta1.BatchPredictionJob.OutputInfoB\003\340A\003\022"
          + "=\n\005state\030\n \001(\0162).google.cloud.aiplatform"
          + ".v1beta1.JobStateB\003\340A\003\022&\n\005error\030\013 \001(\0132\022."
          + "google.rpc.StatusB\003\340A\003\0221\n\020partial_failur"
          + "es\030\014 \003(\0132\022.google.rpc.StatusB\003\340A\003\022S\n\022res"
          + "ources_consumed\030\r \001(\01322.google.cloud.aip"
          + "latform.v1beta1.ResourcesConsumedB\003\340A\003\022O"
          + "\n\020completion_stats\030\016 \001(\01320.google.cloud."
          + "aiplatform.v1beta1.CompletionStatsB\003\340A\003\022"
          + "4\n\013create_time\030\017 \001(\0132\032.google.protobuf.T"
          + "imestampB\003\340A\003\0223\n\nstart_time\030\020 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\003\340A\003\0221\n\010end_time\030\021"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\022 \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\022O\n\006labels\030\023 \003(\0132?.google.clo"
          + "ud.aiplatform.v1beta1.BatchPredictionJob"
          + ".LabelsEntry\022H\n\017encryption_spec\030\030 \001(\0132/."
          + "google.cloud.aiplatform.v1beta1.Encrypti"
          + "onSpec\022W\n\027model_monitoring_config\030\032 \001(\0132"
          + "6.google.cloud.aiplatform.v1beta1.ModelM"
          + "onitoringConfig\032\304\001\n\013InputConfig\022@\n\ngcs_s"
          + "ource\030\002 \001(\0132*.google.cloud.aiplatform.v1"
          + "beta1.GcsSourceH\000\022J\n\017bigquery_source\030\003 \001"
          + "(\0132/.google.cloud.aiplatform.v1beta1.Big"
          + "QuerySourceH\000\022\035\n\020instances_format\030\001 \001(\tB"
          + "\003\340A\002B\010\n\006source\032\340\001\n\014OutputConfig\022J\n\017gcs_d"
          + "estination\030\002 \001(\0132/.google.cloud.aiplatfo"
          + "rm.v1beta1.GcsDestinationH\000\022T\n\024bigquery_"
          + "destination\030\003 \001(\01324.google.cloud.aiplatf"
          + "orm.v1beta1.BigQueryDestinationH\000\022\037\n\022pre"
          + "dictions_format\030\001 \001(\tB\003\340A\002B\r\n\013destinatio"
          + "n\032\220\001\n\nOutputInfo\022#\n\024gcs_output_directory"
          + "\030\001 \001(\tB\003\340A\003H\000\022&\n\027bigquery_output_dataset"
          + "\030\002 \001(\tB\003\340A\003H\000\022\"\n\025bigquery_output_table\030\004"
          + " \001(\tB\003\340A\003B\021\n\017output_location\032-\n\013LabelsEn"
          + "try\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\206\001\352A"
          + "\202\001\n,aiplatform.googleapis.com/BatchPredi"
          + "ctionJob\022Rprojects/{project}/locations/{"
          + "location}/batchPredictionJobs/{batch_pre"
          + "diction_job}B\364\001\n#com.google.cloud.aiplat"
          + "form.v1beta1B\027BatchPredictionJobProtoP\001Z"
          + "Igoogle.golang.org/genproto/googleapis/c"
          + "loud/aiplatform/v1beta1;aiplatform\252\002\037Goo"
          + "gle.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cl"
          + "oud\\AIPlatform\\V1beta1\352\002\"Google::Cloud::"
          + "AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.CompletionStatsProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParametersProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelMonitoringProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.UnmanagedContainerModelProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Model",
              "ModelVersionId",
              "UnmanagedContainerModel",
              "InputConfig",
              "ModelParameters",
              "OutputConfig",
              "DedicatedResources",
              "ServiceAccount",
              "ManualBatchTuningParameters",
              "GenerateExplanation",
              "ExplanationSpec",
              "OutputInfo",
              "State",
              "Error",
              "PartialFailures",
              "ResourcesConsumed",
              "CompletionStats",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Labels",
              "EncryptionSpec",
              "ModelMonitoringConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_InputConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_InputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_InputConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "BigquerySource", "InstancesFormat", "Source",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "BigqueryDestination", "PredictionsFormat", "Destination",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputInfo_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputInfo_descriptor,
            new java.lang.String[] {
              "GcsOutputDirectory",
              "BigqueryOutputDataset",
              "BigqueryOutputTable",
              "OutputLocation",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.CompletionStatsProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParametersProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelMonitoringProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.UnmanagedContainerModelProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}