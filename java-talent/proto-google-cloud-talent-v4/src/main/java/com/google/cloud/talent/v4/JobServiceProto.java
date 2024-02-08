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
// source: google/cloud/talent/v4/job_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.talent.v4;

public final class JobServiceProto {
  private JobServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_CreateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_CreateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_GetJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_GetJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_UpdateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_UpdateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_DeleteJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_DeleteJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_ListJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_ListJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_ListJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_ListJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_SearchJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_SearchJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_SearchJobsRequest_CustomRankingInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_SearchJobsRequest_CustomRankingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_SearchJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_SearchJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_SearchJobsResponse_MatchingJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_SearchJobsResponse_MatchingJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_SearchJobsResponse_CommuteInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_SearchJobsResponse_CommuteInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_BatchCreateJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_BatchCreateJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_BatchUpdateJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_BatchUpdateJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_BatchDeleteJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_BatchDeleteJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_JobResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_JobResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_BatchCreateJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_BatchCreateJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_BatchUpdateJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_BatchUpdateJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_BatchDeleteJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_BatchDeleteJobsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/talent/v4/job_service.pro"
          + "to\022\026google.cloud.talent.v4\032\034google/api/a"
          + "nnotations.proto\032\027google/api/client.prot"
          + "o\032\037google/api/field_behavior.proto\032\031goog"
          + "le/api/resource.proto\032#google/cloud/tale"
          + "nt/v4/common.proto\032$google/cloud/talent/"
          + "v4/filters.proto\032&google/cloud/talent/v4"
          + "/histogram.proto\032 google/cloud/talent/v4"
          + "/job.proto\032#google/longrunning/operation"
          + "s.proto\032\036google/protobuf/duration.proto\032"
          + "\033google/protobuf/empty.proto\032 google/pro"
          + "tobuf/field_mask.proto\032\027google/rpc/statu"
          + "s.proto\"r\n\020CreateJobRequest\022/\n\006parent\030\001 "
          + "\001(\tB\037\340A\002\372A\031\022\027jobs.googleapis.com/Job\022-\n\003"
          + "job\030\002 \001(\0132\033.google.cloud.talent.v4.JobB\003"
          + "\340A\002\">\n\rGetJobRequest\022-\n\004name\030\001 \001(\tB\037\340A\002\372"
          + "A\031\n\027jobs.googleapis.com/Job\"r\n\020UpdateJob"
          + "Request\022-\n\003job\030\001 \001(\0132\033.google.cloud.tale"
          + "nt.v4.JobB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.go"
          + "ogle.protobuf.FieldMask\"A\n\020DeleteJobRequ"
          + "est\022-\n\004name\030\001 \001(\tB\037\340A\002\372A\031\n\027jobs.googleap"
          + "is.com/Job\"\261\001\n\017ListJobsRequest\022/\n\006parent"
          + "\030\001 \001(\tB\037\340A\002\372A\031\022\027jobs.googleapis.com/Job\022"
          + "\023\n\006filter\030\002 \001(\tB\003\340A\002\022\022\n\npage_token\030\003 \001(\t"
          + "\022\021\n\tpage_size\030\004 \001(\005\0221\n\010job_view\030\005 \001(\0162\037."
          + "google.cloud.talent.v4.JobView\"\222\001\n\020ListJ"
          + "obsResponse\022)\n\004jobs\030\001 \003(\0132\033.google.cloud"
          + ".talent.v4.Job\022\027\n\017next_page_token\030\002 \001(\t\022"
          + ":\n\010metadata\030\003 \001(\0132(.google.cloud.talent."
          + "v4.ResponseMetadata\"\327\013\n\021SearchJobsReques"
          + "t\022/\n\006parent\030\001 \001(\tB\037\340A\002\372A\031\022\027jobs.googleap"
          + "is.com/Job\022I\n\013search_mode\030\002 \001(\01624.google"
          + ".cloud.talent.v4.SearchJobsRequest.Searc"
          + "hMode\022F\n\020request_metadata\030\003 \001(\0132\'.google"
          + ".cloud.talent.v4.RequestMetadataB\003\340A\002\0223\n"
          + "\tjob_query\030\004 \001(\0132 .google.cloud.talent.v"
          + "4.JobQuery\022\031\n\021enable_broadening\030\005 \001(\010\022A\n"
          + "\021histogram_queries\030\007 \003(\0132&.google.cloud."
          + "talent.v4.HistogramQuery\0221\n\010job_view\030\010 \001"
          + "(\0162\037.google.cloud.talent.v4.JobView\022\016\n\006o"
          + "ffset\030\t \001(\005\022\025\n\rmax_page_size\030\n \001(\005\022\022\n\npa"
          + "ge_token\030\013 \001(\t\022\020\n\010order_by\030\014 \001(\t\022]\n\025dive"
          + "rsification_level\030\r \001(\0162>.google.cloud.t"
          + "alent.v4.SearchJobsRequest.Diversificati"
          + "onLevel\022X\n\023custom_ranking_info\030\016 \001(\0132;.g"
          + "oogle.cloud.talent.v4.SearchJobsRequest."
          + "CustomRankingInfo\022!\n\025disable_keyword_mat"
          + "ch\030\020 \001(\010B\002\030\001\022V\n\022keyword_match_mode\030\022 \001(\016"
          + "2:.google.cloud.talent.v4.SearchJobsRequ"
          + "est.KeywordMatchMode\032\225\002\n\021CustomRankingIn"
          + "fo\022j\n\020importance_level\030\001 \001(\0162K.google.cl"
          + "oud.talent.v4.SearchJobsRequest.CustomRa"
          + "nkingInfo.ImportanceLevelB\003\340A\002\022\037\n\022rankin"
          + "g_expression\030\002 \001(\tB\003\340A\002\"s\n\017ImportanceLev"
          + "el\022 \n\034IMPORTANCE_LEVEL_UNSPECIFIED\020\000\022\010\n\004"
          + "NONE\020\001\022\007\n\003LOW\020\002\022\010\n\004MILD\020\003\022\n\n\006MEDIUM\020\004\022\010\n"
          + "\004HIGH\020\005\022\013\n\007EXTREME\020\006\"R\n\nSearchMode\022\033\n\027SE"
          + "ARCH_MODE_UNSPECIFIED\020\000\022\016\n\nJOB_SEARCH\020\001\022"
          + "\027\n\023FEATURED_JOB_SEARCH\020\002\"\300\001\n\024Diversifica"
          + "tionLevel\022%\n!DIVERSIFICATION_LEVEL_UNSPE"
          + "CIFIED\020\000\022\014\n\010DISABLED\020\001\022\n\n\006SIMPLE\020\002\022\023\n\017ON"
          + "E_PER_COMPANY\020\003\022\023\n\017TWO_PER_COMPANY\020\004\022\031\n\025"
          + "MAX_THREE_PER_COMPANY\020\006\022\"\n\036DIVERSIFY_BY_"
          + "LOOSER_SIMILARITY\020\005\"\207\001\n\020KeywordMatchMode"
          + "\022\"\n\036KEYWORD_MATCH_MODE_UNSPECIFIED\020\000\022\032\n\026"
          + "KEYWORD_MATCH_DISABLED\020\001\022\025\n\021KEYWORD_MATC"
          + "H_ALL\020\002\022\034\n\030KEYWORD_MATCH_TITLE_ONLY\020\003\"\221\006"
          + "\n\022SearchJobsResponse\022M\n\rmatching_jobs\030\001 "
          + "\003(\01326.google.cloud.talent.v4.SearchJobsR"
          + "esponse.MatchingJob\022M\n\027histogram_query_r"
          + "esults\030\002 \003(\0132,.google.cloud.talent.v4.Hi"
          + "stogramQueryResult\022\027\n\017next_page_token\030\003 "
          + "\001(\t\022:\n\020location_filters\030\004 \003(\0132 .google.c"
          + "loud.talent.v4.Location\022\022\n\ntotal_size\030\006 "
          + "\001(\005\022:\n\010metadata\030\007 \001(\0132(.google.cloud.tal"
          + "ent.v4.ResponseMetadata\022\"\n\032broadened_que"
          + "ry_jobs_count\030\010 \001(\005\022D\n\020spell_correction\030"
          + "\t \001(\0132*.google.cloud.talent.v4.SpellingC"
          + "orrection\032\322\001\n\013MatchingJob\022(\n\003job\030\001 \001(\0132\033"
          + ".google.cloud.talent.v4.Job\022\023\n\013job_summa"
          + "ry\030\002 \001(\t\022\031\n\021job_title_snippet\030\003 \001(\t\022\033\n\023s"
          + "earch_text_snippet\030\004 \001(\t\022L\n\014commute_info"
          + "\030\005 \001(\01326.google.cloud.talent.v4.SearchJo"
          + "bsResponse.CommuteInfo\032y\n\013CommuteInfo\0226\n"
          + "\014job_location\030\001 \001(\0132 .google.cloud.talen"
          + "t.v4.Location\0222\n\017travel_duration\030\002 \001(\0132\031"
          + ".google.protobuf.Duration\"y\n\026BatchCreate"
          + "JobsRequest\022/\n\006parent\030\001 \001(\tB\037\340A\002\372A\031\022\027job"
          + "s.googleapis.com/Job\022.\n\004jobs\030\002 \003(\0132\033.goo"
          + "gle.cloud.talent.v4.JobB\003\340A\002\"\252\001\n\026BatchUp"
          + "dateJobsRequest\022/\n\006parent\030\001 \001(\tB\037\340A\002\372A\031\022"
          + "\027jobs.googleapis.com/Job\022.\n\004jobs\030\002 \003(\0132\033"
          + ".google.cloud.talent.v4.JobB\003\340A\002\022/\n\013upda"
          + "te_mask\030\003 \001(\0132\032.google.protobuf.FieldMas"
          + "k\"y\n\026BatchDeleteJobsRequest\0222\n\006parent\030\001 "
          + "\001(\tB\"\340A\002\372A\034\n\032jobs.googleapis.com/Tenant\022"
          + "+\n\005names\030\002 \003(\tB\034\372A\031\n\027jobs.googleapis.com"
          + "/Job\"Y\n\tJobResult\022(\n\003job\030\001 \001(\0132\033.google."
          + "cloud.talent.v4.Job\022\"\n\006status\030\002 \001(\0132\022.go"
          + "ogle.rpc.Status\"Q\n\027BatchCreateJobsRespon"
          + "se\0226\n\013job_results\030\001 \003(\0132!.google.cloud.t"
          + "alent.v4.JobResult\"Q\n\027BatchUpdateJobsRes"
          + "ponse\0226\n\013job_results\030\001 \003(\0132!.google.clou"
          + "d.talent.v4.JobResult\"Q\n\027BatchDeleteJobs"
          + "Response\0226\n\013job_results\030\001 \003(\0132!.google.c"
          + "loud.talent.v4.JobResult*v\n\007JobView\022\030\n\024J"
          + "OB_VIEW_UNSPECIFIED\020\000\022\024\n\020JOB_VIEW_ID_ONL"
          + "Y\020\001\022\024\n\020JOB_VIEW_MINIMAL\020\002\022\022\n\016JOB_VIEW_SM"
          + "ALL\020\003\022\021\n\rJOB_VIEW_FULL\020\0042\334\016\n\nJobService\022"
          + "\224\001\n\tCreateJob\022(.google.cloud.talent.v4.C"
          + "reateJobRequest\032\033.google.cloud.talent.v4"
          + ".Job\"@\332A\nparent,job\202\323\344\223\002-\"&/v4/{parent=p"
          + "rojects/*/tenants/*}/jobs:\003job\022\341\001\n\017Batch"
          + "CreateJobs\022..google.cloud.talent.v4.Batc"
          + "hCreateJobsRequest\032\035.google.longrunning."
          + "Operation\"\177\312A1\n\027BatchCreateJobsResponse\022"
          + "\026BatchOperationMetadata\332A\013parent,jobs\202\323\344"
          + "\223\0027\"2/v4/{parent=projects/*/tenants/*}/j"
          + "obs:batchCreate:\001*\022\203\001\n\006GetJob\022%.google.c"
          + "loud.talent.v4.GetJobRequest\032\033.google.cl"
          + "oud.talent.v4.Job\"5\332A\004name\202\323\344\223\002(\022&/v4/{n"
          + "ame=projects/*/tenants/*/jobs/*}\022\235\001\n\tUpd"
          + "ateJob\022(.google.cloud.talent.v4.UpdateJo"
          + "bRequest\032\033.google.cloud.talent.v4.Job\"I\332"
          + "A\017job,update_mask\202\323\344\223\00212*/v4/{job.name=p"
          + "rojects/*/tenants/*/jobs/*}:\003job\022\341\001\n\017Bat"
          + "chUpdateJobs\022..google.cloud.talent.v4.Ba"
          + "tchUpdateJobsRequest\032\035.google.longrunnin"
          + "g.Operation\"\177\312A1\n\027BatchUpdateJobsRespons"
          + "e\022\026BatchOperationMetadata\332A\013parent,jobs\202"
          + "\323\344\223\0027\"2/v4/{parent=projects/*/tenants/*}"
          + "/jobs:batchUpdate:\001*\022\204\001\n\tDeleteJob\022(.goo"
          + "gle.cloud.talent.v4.DeleteJobRequest\032\026.g"
          + "oogle.protobuf.Empty\"5\332A\004name\202\323\344\223\002(*&/v4"
          + "/{name=projects/*/tenants/*/jobs/*}\022\343\001\n\017"
          + "BatchDeleteJobs\022..google.cloud.talent.v4"
          + ".BatchDeleteJobsRequest\032\035.google.longrun"
          + "ning.Operation\"\200\001\312A1\n\027BatchDeleteJobsRes"
          + "ponse\022\026BatchOperationMetadata\332A\014parent,n"
          + "ames\202\323\344\223\0027\"2/v4/{parent=projects/*/tenan"
          + "ts/*}/jobs:batchDelete:\001*\022\235\001\n\010ListJobs\022\'"
          + ".google.cloud.talent.v4.ListJobsRequest\032"
          + "(.google.cloud.talent.v4.ListJobsRespons"
          + "e\">\332A\rparent,filter\202\323\344\223\002(\022&/v4/{parent=p"
          + "rojects/*/tenants/*}/jobs\022\235\001\n\nSearchJobs"
          + "\022).google.cloud.talent.v4.SearchJobsRequ"
          + "est\032*.google.cloud.talent.v4.SearchJobsR"
          + "esponse\"8\202\323\344\223\0022\"-/v4/{parent=projects/*/"
          + "tenants/*}/jobs:search:\001*\022\255\001\n\022SearchJobs"
          + "ForAlert\022).google.cloud.talent.v4.Search"
          + "JobsRequest\032*.google.cloud.talent.v4.Sea"
          + "rchJobsResponse\"@\202\323\344\223\002:\"5/v4/{parent=pro"
          + "jects/*/tenants/*}/jobs:searchForAlert:\001"
          + "*\032l\312A\023jobs.googleapis.com\322AShttps://www."
          + "googleapis.com/auth/cloud-platform,https"
          + "://www.googleapis.com/auth/jobsBi\n\032com.g"
          + "oogle.cloud.talent.v4B\017JobServiceProtoP\001"
          + "Z2cloud.google.com/go/talent/apiv4/talen"
          + "tpb;talentpb\242\002\003CTSb\006proto3"
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
              com.google.cloud.talent.v4.FiltersProto.getDescriptor(),
              com.google.cloud.talent.v4.HistogramProto.getDescriptor(),
              com.google.cloud.talent.v4.JobProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4_CreateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4_CreateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_CreateJobRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Job",
            });
    internal_static_google_cloud_talent_v4_GetJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4_GetJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_GetJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4_UpdateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4_UpdateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_UpdateJobRequest_descriptor,
            new java.lang.String[] {
              "Job", "UpdateMask",
            });
    internal_static_google_cloud_talent_v4_DeleteJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4_DeleteJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_DeleteJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4_ListJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4_ListJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_ListJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageToken", "PageSize", "JobView",
            });
    internal_static_google_cloud_talent_v4_ListJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4_ListJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_ListJobsResponse_descriptor,
            new java.lang.String[] {
              "Jobs", "NextPageToken", "Metadata",
            });
    internal_static_google_cloud_talent_v4_SearchJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_talent_v4_SearchJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_SearchJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "SearchMode",
              "RequestMetadata",
              "JobQuery",
              "EnableBroadening",
              "HistogramQueries",
              "JobView",
              "Offset",
              "MaxPageSize",
              "PageToken",
              "OrderBy",
              "DiversificationLevel",
              "CustomRankingInfo",
              "DisableKeywordMatch",
              "KeywordMatchMode",
            });
    internal_static_google_cloud_talent_v4_SearchJobsRequest_CustomRankingInfo_descriptor =
        internal_static_google_cloud_talent_v4_SearchJobsRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_talent_v4_SearchJobsRequest_CustomRankingInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_SearchJobsRequest_CustomRankingInfo_descriptor,
            new java.lang.String[] {
              "ImportanceLevel", "RankingExpression",
            });
    internal_static_google_cloud_talent_v4_SearchJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_talent_v4_SearchJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_SearchJobsResponse_descriptor,
            new java.lang.String[] {
              "MatchingJobs",
              "HistogramQueryResults",
              "NextPageToken",
              "LocationFilters",
              "TotalSize",
              "Metadata",
              "BroadenedQueryJobsCount",
              "SpellCorrection",
            });
    internal_static_google_cloud_talent_v4_SearchJobsResponse_MatchingJob_descriptor =
        internal_static_google_cloud_talent_v4_SearchJobsResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_talent_v4_SearchJobsResponse_MatchingJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_SearchJobsResponse_MatchingJob_descriptor,
            new java.lang.String[] {
              "Job", "JobSummary", "JobTitleSnippet", "SearchTextSnippet", "CommuteInfo",
            });
    internal_static_google_cloud_talent_v4_SearchJobsResponse_CommuteInfo_descriptor =
        internal_static_google_cloud_talent_v4_SearchJobsResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_talent_v4_SearchJobsResponse_CommuteInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_SearchJobsResponse_CommuteInfo_descriptor,
            new java.lang.String[] {
              "JobLocation", "TravelDuration",
            });
    internal_static_google_cloud_talent_v4_BatchCreateJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_talent_v4_BatchCreateJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_BatchCreateJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Jobs",
            });
    internal_static_google_cloud_talent_v4_BatchUpdateJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_talent_v4_BatchUpdateJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_BatchUpdateJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Jobs", "UpdateMask",
            });
    internal_static_google_cloud_talent_v4_BatchDeleteJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_talent_v4_BatchDeleteJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_BatchDeleteJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Names",
            });
    internal_static_google_cloud_talent_v4_JobResult_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_talent_v4_JobResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_JobResult_descriptor,
            new java.lang.String[] {
              "Job", "Status",
            });
    internal_static_google_cloud_talent_v4_BatchCreateJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_talent_v4_BatchCreateJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_BatchCreateJobsResponse_descriptor,
            new java.lang.String[] {
              "JobResults",
            });
    internal_static_google_cloud_talent_v4_BatchUpdateJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_talent_v4_BatchUpdateJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_BatchUpdateJobsResponse_descriptor,
            new java.lang.String[] {
              "JobResults",
            });
    internal_static_google_cloud_talent_v4_BatchDeleteJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_talent_v4_BatchDeleteJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_BatchDeleteJobsResponse_descriptor,
            new java.lang.String[] {
              "JobResults",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.talent.v4.CommonProto.getDescriptor();
    com.google.cloud.talent.v4.FiltersProto.getDescriptor();
    com.google.cloud.talent.v4.HistogramProto.getDescriptor();
    com.google.cloud.talent.v4.JobProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
