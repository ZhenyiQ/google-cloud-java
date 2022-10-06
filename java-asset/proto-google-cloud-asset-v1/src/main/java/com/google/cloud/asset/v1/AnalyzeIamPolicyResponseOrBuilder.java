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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface AnalyzeIamPolicyResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.AnalyzeIamPolicyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The main analysis that matches the original request.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysis main_analysis = 1;
   * </code>
   *
   * @return Whether the mainAnalysis field is set.
   */
  boolean hasMainAnalysis();
  /**
   *
   *
   * <pre>
   * The main analysis that matches the original request.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysis main_analysis = 1;
   * </code>
   *
   * @return The mainAnalysis.
   */
  com.google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysis getMainAnalysis();
  /**
   *
   *
   * <pre>
   * The main analysis that matches the original request.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysis main_analysis = 1;
   * </code>
   */
  com.google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysisOrBuilder
      getMainAnalysisOrBuilder();

  /**
   *
   *
   * <pre>
   * The service account impersonation analysis if
   * [AnalyzeIamPolicyRequest.analyze_service_account_impersonation][] is
   * enabled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysis service_account_impersonation_analysis = 2;
   * </code>
   */
  java.util.List<com.google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysis>
      getServiceAccountImpersonationAnalysisList();
  /**
   *
   *
   * <pre>
   * The service account impersonation analysis if
   * [AnalyzeIamPolicyRequest.analyze_service_account_impersonation][] is
   * enabled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysis service_account_impersonation_analysis = 2;
   * </code>
   */
  com.google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysis
      getServiceAccountImpersonationAnalysis(int index);
  /**
   *
   *
   * <pre>
   * The service account impersonation analysis if
   * [AnalyzeIamPolicyRequest.analyze_service_account_impersonation][] is
   * enabled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysis service_account_impersonation_analysis = 2;
   * </code>
   */
  int getServiceAccountImpersonationAnalysisCount();
  /**
   *
   *
   * <pre>
   * The service account impersonation analysis if
   * [AnalyzeIamPolicyRequest.analyze_service_account_impersonation][] is
   * enabled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysis service_account_impersonation_analysis = 2;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysisOrBuilder>
      getServiceAccountImpersonationAnalysisOrBuilderList();
  /**
   *
   *
   * <pre>
   * The service account impersonation analysis if
   * [AnalyzeIamPolicyRequest.analyze_service_account_impersonation][] is
   * enabled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysis service_account_impersonation_analysis = 2;
   * </code>
   */
  com.google.cloud.asset.v1.AnalyzeIamPolicyResponse.IamPolicyAnalysisOrBuilder
      getServiceAccountImpersonationAnalysisOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Represents whether all entries in the [main_analysis][google.cloud.asset.v1.AnalyzeIamPolicyResponse.main_analysis] and
   * [service_account_impersonation_analysis][google.cloud.asset.v1.AnalyzeIamPolicyResponse.service_account_impersonation_analysis] have been fully explored to
   * answer the query in the request.
   * </pre>
   *
   * <code>bool fully_explored = 3;</code>
   *
   * @return The fullyExplored.
   */
  boolean getFullyExplored();
}
