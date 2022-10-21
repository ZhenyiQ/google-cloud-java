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
// source: google/cloud/contentwarehouse/v1/document_link_service.proto

package com.google.cloud.contentwarehouse.v1;

public interface CreateDocumentLinkRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.CreateDocumentLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parent of the document-link to be created.
   * parent of document-link should be a document.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{source_document_id}.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Parent of the document-link to be created.
   * parent of document-link should be a document.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{source_document_id}.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Document links associated with the source documents (source_document_id).
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.DocumentLink document_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the documentLink field is set.
   */
  boolean hasDocumentLink();
  /**
   *
   *
   * <pre>
   * Required. Document links associated with the source documents (source_document_id).
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.DocumentLink document_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The documentLink.
   */
  com.google.cloud.contentwarehouse.v1.DocumentLink getDocumentLink();
  /**
   *
   *
   * <pre>
   * Required. Document links associated with the source documents (source_document_id).
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.DocumentLink document_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.contentwarehouse.v1.DocumentLinkOrBuilder getDocumentLinkOrBuilder();

  /**
   *
   *
   * <pre>
   * The meta information collected about the document creator, used to enforce
   * access control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 3;</code>
   *
   * @return Whether the requestMetadata field is set.
   */
  boolean hasRequestMetadata();
  /**
   *
   *
   * <pre>
   * The meta information collected about the document creator, used to enforce
   * access control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 3;</code>
   *
   * @return The requestMetadata.
   */
  com.google.cloud.contentwarehouse.v1.RequestMetadata getRequestMetadata();
  /**
   *
   *
   * <pre>
   * The meta information collected about the document creator, used to enforce
   * access control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder getRequestMetadataOrBuilder();
}