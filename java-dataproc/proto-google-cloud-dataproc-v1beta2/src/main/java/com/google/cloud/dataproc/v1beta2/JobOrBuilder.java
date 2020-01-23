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
// source: google/cloud/dataproc/v1beta2/jobs.proto

package com.google.cloud.dataproc.v1beta2;

public interface JobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.Job)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The fully qualified reference to the job, which can be used to
   * obtain the equivalent REST path of the job resource. If this property
   * is not specified when a job is created, the server generates a
   * &lt;code&gt;job_id&lt;/code&gt;.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.JobReference reference = 1;</code>
   *
   * @return Whether the reference field is set.
   */
  boolean hasReference();
  /**
   *
   *
   * <pre>
   * Optional. The fully qualified reference to the job, which can be used to
   * obtain the equivalent REST path of the job resource. If this property
   * is not specified when a job is created, the server generates a
   * &lt;code&gt;job_id&lt;/code&gt;.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.JobReference reference = 1;</code>
   *
   * @return The reference.
   */
  com.google.cloud.dataproc.v1beta2.JobReference getReference();
  /**
   *
   *
   * <pre>
   * Optional. The fully qualified reference to the job, which can be used to
   * obtain the equivalent REST path of the job resource. If this property
   * is not specified when a job is created, the server generates a
   * &lt;code&gt;job_id&lt;/code&gt;.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.JobReference reference = 1;</code>
   */
  com.google.cloud.dataproc.v1beta2.JobReferenceOrBuilder getReferenceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Job information, including how, when, and where to
   * run the job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.JobPlacement placement = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the placement field is set.
   */
  boolean hasPlacement();
  /**
   *
   *
   * <pre>
   * Required. Job information, including how, when, and where to
   * run the job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.JobPlacement placement = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The placement.
   */
  com.google.cloud.dataproc.v1beta2.JobPlacement getPlacement();
  /**
   *
   *
   * <pre>
   * Required. Job information, including how, when, and where to
   * run the job.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.JobPlacement placement = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1beta2.JobPlacementOrBuilder getPlacementOrBuilder();

  /**
   *
   *
   * <pre>
   * Job is a Hadoop job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.HadoopJob hadoop_job = 3;</code>
   *
   * @return Whether the hadoopJob field is set.
   */
  boolean hasHadoopJob();
  /**
   *
   *
   * <pre>
   * Job is a Hadoop job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.HadoopJob hadoop_job = 3;</code>
   *
   * @return The hadoopJob.
   */
  com.google.cloud.dataproc.v1beta2.HadoopJob getHadoopJob();
  /**
   *
   *
   * <pre>
   * Job is a Hadoop job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.HadoopJob hadoop_job = 3;</code>
   */
  com.google.cloud.dataproc.v1beta2.HadoopJobOrBuilder getHadoopJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Job is a Spark job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkJob spark_job = 4;</code>
   *
   * @return Whether the sparkJob field is set.
   */
  boolean hasSparkJob();
  /**
   *
   *
   * <pre>
   * Job is a Spark job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkJob spark_job = 4;</code>
   *
   * @return The sparkJob.
   */
  com.google.cloud.dataproc.v1beta2.SparkJob getSparkJob();
  /**
   *
   *
   * <pre>
   * Job is a Spark job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkJob spark_job = 4;</code>
   */
  com.google.cloud.dataproc.v1beta2.SparkJobOrBuilder getSparkJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Job is a Pyspark job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.PySparkJob pyspark_job = 5;</code>
   *
   * @return Whether the pysparkJob field is set.
   */
  boolean hasPysparkJob();
  /**
   *
   *
   * <pre>
   * Job is a Pyspark job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.PySparkJob pyspark_job = 5;</code>
   *
   * @return The pysparkJob.
   */
  com.google.cloud.dataproc.v1beta2.PySparkJob getPysparkJob();
  /**
   *
   *
   * <pre>
   * Job is a Pyspark job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.PySparkJob pyspark_job = 5;</code>
   */
  com.google.cloud.dataproc.v1beta2.PySparkJobOrBuilder getPysparkJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Job is a Hive job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.HiveJob hive_job = 6;</code>
   *
   * @return Whether the hiveJob field is set.
   */
  boolean hasHiveJob();
  /**
   *
   *
   * <pre>
   * Job is a Hive job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.HiveJob hive_job = 6;</code>
   *
   * @return The hiveJob.
   */
  com.google.cloud.dataproc.v1beta2.HiveJob getHiveJob();
  /**
   *
   *
   * <pre>
   * Job is a Hive job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.HiveJob hive_job = 6;</code>
   */
  com.google.cloud.dataproc.v1beta2.HiveJobOrBuilder getHiveJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Job is a Pig job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.PigJob pig_job = 7;</code>
   *
   * @return Whether the pigJob field is set.
   */
  boolean hasPigJob();
  /**
   *
   *
   * <pre>
   * Job is a Pig job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.PigJob pig_job = 7;</code>
   *
   * @return The pigJob.
   */
  com.google.cloud.dataproc.v1beta2.PigJob getPigJob();
  /**
   *
   *
   * <pre>
   * Job is a Pig job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.PigJob pig_job = 7;</code>
   */
  com.google.cloud.dataproc.v1beta2.PigJobOrBuilder getPigJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Job is a SparkR job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkRJob spark_r_job = 21;</code>
   *
   * @return Whether the sparkRJob field is set.
   */
  boolean hasSparkRJob();
  /**
   *
   *
   * <pre>
   * Job is a SparkR job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkRJob spark_r_job = 21;</code>
   *
   * @return The sparkRJob.
   */
  com.google.cloud.dataproc.v1beta2.SparkRJob getSparkRJob();
  /**
   *
   *
   * <pre>
   * Job is a SparkR job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkRJob spark_r_job = 21;</code>
   */
  com.google.cloud.dataproc.v1beta2.SparkRJobOrBuilder getSparkRJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Job is a SparkSql job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkSqlJob spark_sql_job = 12;</code>
   *
   * @return Whether the sparkSqlJob field is set.
   */
  boolean hasSparkSqlJob();
  /**
   *
   *
   * <pre>
   * Job is a SparkSql job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkSqlJob spark_sql_job = 12;</code>
   *
   * @return The sparkSqlJob.
   */
  com.google.cloud.dataproc.v1beta2.SparkSqlJob getSparkSqlJob();
  /**
   *
   *
   * <pre>
   * Job is a SparkSql job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SparkSqlJob spark_sql_job = 12;</code>
   */
  com.google.cloud.dataproc.v1beta2.SparkSqlJobOrBuilder getSparkSqlJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The job status. Additional application-specific
   * status information may be contained in the &lt;code&gt;type_job&lt;/code&gt;
   * and &lt;code&gt;yarn_applications&lt;/code&gt; fields.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.JobStatus status = 8;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Output only. The job status. Additional application-specific
   * status information may be contained in the &lt;code&gt;type_job&lt;/code&gt;
   * and &lt;code&gt;yarn_applications&lt;/code&gt; fields.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.JobStatus status = 8;</code>
   *
   * @return The status.
   */
  com.google.cloud.dataproc.v1beta2.JobStatus getStatus();
  /**
   *
   *
   * <pre>
   * Output only. The job status. Additional application-specific
   * status information may be contained in the &lt;code&gt;type_job&lt;/code&gt;
   * and &lt;code&gt;yarn_applications&lt;/code&gt; fields.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.JobStatus status = 8;</code>
   */
  com.google.cloud.dataproc.v1beta2.JobStatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The previous job status.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.JobStatus status_history = 13;</code>
   */
  java.util.List<com.google.cloud.dataproc.v1beta2.JobStatus> getStatusHistoryList();
  /**
   *
   *
   * <pre>
   * Output only. The previous job status.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.JobStatus status_history = 13;</code>
   */
  com.google.cloud.dataproc.v1beta2.JobStatus getStatusHistory(int index);
  /**
   *
   *
   * <pre>
   * Output only. The previous job status.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.JobStatus status_history = 13;</code>
   */
  int getStatusHistoryCount();
  /**
   *
   *
   * <pre>
   * Output only. The previous job status.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.JobStatus status_history = 13;</code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1beta2.JobStatusOrBuilder>
      getStatusHistoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The previous job status.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.JobStatus status_history = 13;</code>
   */
  com.google.cloud.dataproc.v1beta2.JobStatusOrBuilder getStatusHistoryOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The collection of YARN applications spun up by this job.
   * **Beta** Feature: This report is available for testing purposes only. It
   * may be changed before final release.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.YarnApplication yarn_applications = 9;</code>
   */
  java.util.List<com.google.cloud.dataproc.v1beta2.YarnApplication> getYarnApplicationsList();
  /**
   *
   *
   * <pre>
   * Output only. The collection of YARN applications spun up by this job.
   * **Beta** Feature: This report is available for testing purposes only. It
   * may be changed before final release.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.YarnApplication yarn_applications = 9;</code>
   */
  com.google.cloud.dataproc.v1beta2.YarnApplication getYarnApplications(int index);
  /**
   *
   *
   * <pre>
   * Output only. The collection of YARN applications spun up by this job.
   * **Beta** Feature: This report is available for testing purposes only. It
   * may be changed before final release.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.YarnApplication yarn_applications = 9;</code>
   */
  int getYarnApplicationsCount();
  /**
   *
   *
   * <pre>
   * Output only. The collection of YARN applications spun up by this job.
   * **Beta** Feature: This report is available for testing purposes only. It
   * may be changed before final release.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.YarnApplication yarn_applications = 9;</code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1beta2.YarnApplicationOrBuilder>
      getYarnApplicationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The collection of YARN applications spun up by this job.
   * **Beta** Feature: This report is available for testing purposes only. It
   * may be changed before final release.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.YarnApplication yarn_applications = 9;</code>
   */
  com.google.cloud.dataproc.v1beta2.YarnApplicationOrBuilder getYarnApplicationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. The email address of the user submitting the job. For jobs
   * submitted on the cluster, the address is &lt;code&gt;username&#64;hostname&lt;/code&gt;.
   * </pre>
   *
   * <code>string submitted_by = 10;</code>
   *
   * @return The submittedBy.
   */
  java.lang.String getSubmittedBy();
  /**
   *
   *
   * <pre>
   * Output only. The email address of the user submitting the job. For jobs
   * submitted on the cluster, the address is &lt;code&gt;username&#64;hostname&lt;/code&gt;.
   * </pre>
   *
   * <code>string submitted_by = 10;</code>
   *
   * @return The bytes for submittedBy.
   */
  com.google.protobuf.ByteString getSubmittedByBytes();

  /**
   *
   *
   * <pre>
   * Output only. A URI pointing to the location of the stdout of the job's
   * driver program.
   * </pre>
   *
   * <code>string driver_output_resource_uri = 17;</code>
   *
   * @return The driverOutputResourceUri.
   */
  java.lang.String getDriverOutputResourceUri();
  /**
   *
   *
   * <pre>
   * Output only. A URI pointing to the location of the stdout of the job's
   * driver program.
   * </pre>
   *
   * <code>string driver_output_resource_uri = 17;</code>
   *
   * @return The bytes for driverOutputResourceUri.
   */
  com.google.protobuf.ByteString getDriverOutputResourceUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. If present, the location of miscellaneous control files
   * which may be used as part of job setup and handling. If not present,
   * control files may be placed in the same location as `driver_output_uri`.
   * </pre>
   *
   * <code>string driver_control_files_uri = 15;</code>
   *
   * @return The driverControlFilesUri.
   */
  java.lang.String getDriverControlFilesUri();
  /**
   *
   *
   * <pre>
   * Output only. If present, the location of miscellaneous control files
   * which may be used as part of job setup and handling. If not present,
   * control files may be placed in the same location as `driver_output_uri`.
   * </pre>
   *
   * <code>string driver_control_files_uri = 15;</code>
   *
   * @return The bytes for driverControlFilesUri.
   */
  com.google.protobuf.ByteString getDriverControlFilesUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Job scheduling configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.JobScheduling scheduling = 20;</code>
   *
   * @return Whether the scheduling field is set.
   */
  boolean hasScheduling();
  /**
   *
   *
   * <pre>
   * Optional. Job scheduling configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.JobScheduling scheduling = 20;</code>
   *
   * @return The scheduling.
   */
  com.google.cloud.dataproc.v1beta2.JobScheduling getScheduling();
  /**
   *
   *
   * <pre>
   * Optional. Job scheduling configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.JobScheduling scheduling = 20;</code>
   */
  com.google.cloud.dataproc.v1beta2.JobSchedulingOrBuilder getSchedulingOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A UUID that uniquely identifies a job within the project
   * over time. This is in contrast to a user-settable reference.job_id that
   * may be reused over time.
   * </pre>
   *
   * <code>string job_uuid = 22;</code>
   *
   * @return The jobUuid.
   */
  java.lang.String getJobUuid();
  /**
   *
   *
   * <pre>
   * Output only. A UUID that uniquely identifies a job within the project
   * over time. This is in contrast to a user-settable reference.job_id that
   * may be reused over time.
   * </pre>
   *
   * <code>string job_uuid = 22;</code>
   *
   * @return The bytes for jobUuid.
   */
  com.google.protobuf.ByteString getJobUuidBytes();

  public com.google.cloud.dataproc.v1beta2.Job.TypeJobCase getTypeJobCase();
}
