/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/dataform/v1beta1/dataform.proto

package com.google.cloud.dataform.v1beta1;

public interface UpdateWorkflowConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.UpdateWorkflowConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Specifies the fields to be updated in the workflow config. If
   * left unset, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the fields to be updated in the workflow config. If
   * left unset, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the fields to be updated in the workflow config. If
   * left unset, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The workflow config to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.WorkflowConfig workflow_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workflowConfig field is set.
   */
  boolean hasWorkflowConfig();
  /**
   *
   *
   * <pre>
   * Required. The workflow config to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.WorkflowConfig workflow_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workflowConfig.
   */
  com.google.cloud.dataform.v1beta1.WorkflowConfig getWorkflowConfig();
  /**
   *
   *
   * <pre>
   * Required. The workflow config to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.WorkflowConfig workflow_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataform.v1beta1.WorkflowConfigOrBuilder getWorkflowConfigOrBuilder();
}
