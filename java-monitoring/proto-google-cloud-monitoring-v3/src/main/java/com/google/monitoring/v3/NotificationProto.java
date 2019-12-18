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
// source: google/monitoring/v3/notification.proto

package com.google.monitoring.v3;

public final class NotificationProto {
  private NotificationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_NotificationChannelDescriptor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannelDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_NotificationChannel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/monitoring/v3/notification.prot"
          + "o\022\024google.monitoring.v3\032\026google/api/labe"
          + "l.proto\032\035google/api/launch_stage.proto\032!"
          + "google/monitoring/v3/common.proto\032\036googl"
          + "e/protobuf/wrappers.proto\"\323\001\n\035Notificati"
          + "onChannelDescriptor\022\014\n\004name\030\006 \001(\t\022\014\n\004typ"
          + "e\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\023\n\013descrip"
          + "tion\030\003 \001(\t\022+\n\006labels\030\004 \003(\0132\033.google.api."
          + "LabelDescriptor\022>\n\017supported_tiers\030\005 \003(\016"
          + "2!.google.monitoring.v3.ServiceTierB\002\030\001\""
          + "\266\004\n\023NotificationChannel\022\014\n\004type\030\001 \001(\t\022\014\n"
          + "\004name\030\006 \001(\t\022\024\n\014display_name\030\003 \001(\t\022\023\n\013des"
          + "cription\030\004 \001(\t\022E\n\006labels\030\005 \003(\01325.google."
          + "monitoring.v3.NotificationChannel.Labels"
          + "Entry\022N\n\013user_labels\030\010 \003(\01329.google.moni"
          + "toring.v3.NotificationChannel.UserLabels"
          + "Entry\022Y\n\023verification_status\030\t \001(\0162<.goo"
          + "gle.monitoring.v3.NotificationChannel.Ve"
          + "rificationStatus\022+\n\007enabled\030\013 \001(\0132\032.goog"
          + "le.protobuf.BoolValue\032-\n\013LabelsEntry\022\013\n\003"
          + "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0321\n\017UserLabe"
          + "lsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\""
          + "W\n\022VerificationStatus\022#\n\037VERIFICATION_ST"
          + "ATUS_UNSPECIFIED\020\000\022\016\n\nUNVERIFIED\020\001\022\014\n\010VE"
          + "RIFIED\020\002B\251\001\n\030com.google.monitoring.v3B\021N"
          + "otificationProtoP\001Z>google.golang.org/ge"
          + "nproto/googleapis/monitoring/v3;monitori"
          + "ng\252\002\032Google.Cloud.Monitoring.V3\312\002\032Google"
          + "\\Cloud\\Monitoring\\V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.LabelProto.getDescriptor(),
              com.google.api.LaunchStageProto.getDescriptor(),
              com.google.monitoring.v3.CommonProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_NotificationChannelDescriptor_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_NotificationChannelDescriptor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_NotificationChannelDescriptor_descriptor,
            new java.lang.String[] {
              "Name", "Type", "DisplayName", "Description", "Labels", "SupportedTiers",
            });
    internal_static_google_monitoring_v3_NotificationChannel_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_NotificationChannel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_NotificationChannel_descriptor,
            new java.lang.String[] {
              "Type",
              "Name",
              "DisplayName",
              "Description",
              "Labels",
              "UserLabels",
              "VerificationStatus",
              "Enabled",
            });
    internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_descriptor =
        internal_static_google_monitoring_v3_NotificationChannel_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_descriptor =
        internal_static_google_monitoring_v3_NotificationChannel_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.api.LabelProto.getDescriptor();
    com.google.api.LaunchStageProto.getDescriptor();
    com.google.monitoring.v3.CommonProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
