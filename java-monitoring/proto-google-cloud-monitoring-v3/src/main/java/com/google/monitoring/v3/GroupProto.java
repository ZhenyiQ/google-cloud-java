/*
 * Copyright 2019 Google LLC
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
// source: google/monitoring/v3/group.proto

package com.google.monitoring.v3;

public final class GroupProto {
  private GroupProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Group_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Group_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n google/monitoring/v3/group.proto\022\024goog"
          + "le.monitoring.v3\"d\n\005Group\022\014\n\004name\030\001 \001(\t\022"
          + "\024\n\014display_name\030\002 \001(\t\022\023\n\013parent_name\030\003 \001"
          + "(\t\022\016\n\006filter\030\005 \001(\t\022\022\n\nis_cluster\030\006 \001(\010B\242"
          + "\001\n\030com.google.monitoring.v3B\nGroupProtoP"
          + "\001Z>google.golang.org/genproto/googleapis"
          + "/monitoring/v3;monitoring\252\002\032Google.Cloud"
          + ".Monitoring.V3\312\002\032Google\\Cloud\\Monitoring"
          + "\\V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_monitoring_v3_Group_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_Group_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Group_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "ParentName", "Filter", "IsCluster",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
