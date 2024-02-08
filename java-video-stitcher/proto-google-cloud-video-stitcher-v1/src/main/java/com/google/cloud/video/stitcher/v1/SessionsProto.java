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
// source: google/cloud/video/stitcher/v1/sessions.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.stitcher.v1;

public final class SessionsProto {
  private SessionsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_VodSession_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_VodSession_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_VodSession_GamSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_VodSession_GamSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_VodSession_AdTagMacroMapEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_VodSession_AdTagMacroMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_Interstitials_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_Interstitials_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_VodSessionAd_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_VodSessionAd_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_VodSessionContent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_VodSessionContent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_VodSessionAdBreak_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_VodSessionAdBreak_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_LiveSession_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_LiveSession_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_LiveSession_GamSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_LiveSession_GamSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_LiveSession_AdTagMacrosEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_LiveSession_AdTagMacrosEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_ManifestOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_ManifestOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_RenditionFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_RenditionFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/video/stitcher/v1/session"
          + "s.proto\022\036google.cloud.video.stitcher.v1\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032/google/cloud/video/"
          + "stitcher/v1/companions.proto\032+google/clo"
          + "ud/video/stitcher/v1/events.proto\0321googl"
          + "e/cloud/video/stitcher/v1/live_configs.p"
          + "roto\032\036google/protobuf/duration.proto\"\353\005\n"
          + "\nVodSession\022\021\n\004name\030\001 \001(\tB\003\340A\003\022I\n\rinters"
          + "titials\030\002 \001(\0132-.google.cloud.video.stitc"
          + "her.v1.InterstitialsB\003\340A\003\022\025\n\010play_uri\030\004 "
          + "\001(\tB\003\340A\003\022\027\n\nsource_uri\030\005 \001(\tB\003\340A\002\022\027\n\nad_"
          + "tag_uri\030\006 \001(\tB\003\340A\002\022W\n\020ad_tag_macro_map\030\007"
          + " \003(\0132=.google.cloud.video.stitcher.v1.Vo"
          + "dSession.AdTagMacroMapEntry\022I\n\020manifest_"
          + "options\030\t \001(\0132/.google.cloud.video.stitc"
          + "her.v1.ManifestOptions\022\025\n\010asset_id\030\n \001(\t"
          + "B\003\340A\003\022D\n\013ad_tracking\030\013 \001(\0162*.google.clou"
          + "d.video.stitcher.v1.AdTrackingB\003\340A\002\022L\n\014g"
          + "am_settings\030\r \001(\01326.google.cloud.video.s"
          + "titcher.v1.VodSession.GamSettings\032@\n\013Gam"
          + "Settings\022\031\n\014network_code\030\001 \001(\tB\003\340A\002\022\026\n\ts"
          + "tream_id\030\002 \001(\tB\003\340A\002\0324\n\022AdTagMacroMapEntr"
          + "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:o\352Al\n\'"
          + "videostitcher.googleapis.com/VodSession\022"
          + "Aprojects/{project}/locations/{location}"
          + "/vodSessions/{vod_session}\"\241\001\n\rInterstit"
          + "ials\022D\n\tad_breaks\030\001 \003(\01321.google.cloud.v"
          + "ideo.stitcher.v1.VodSessionAdBreak\022J\n\017se"
          + "ssion_content\030\002 \001(\01321.google.cloud.video"
          + ".stitcher.v1.VodSessionContent\"\300\001\n\014VodSe"
          + "ssionAd\022+\n\010duration\030\001 \001(\0132\031.google.proto"
          + "buf.Duration\022C\n\rcompanion_ads\030\002 \001(\0132,.go"
          + "ogle.cloud.video.stitcher.v1.CompanionAd"
          + "s\022>\n\017activity_events\030\003 \003(\0132%.google.clou"
          + "d.video.stitcher.v1.Event\"@\n\021VodSessionC"
          + "ontent\022+\n\010duration\030\001 \001(\0132\031.google.protob"
          + "uf.Duration\"\200\002\n\021VodSessionAdBreak\022F\n\017pro"
          + "gress_events\030\001 \003(\0132-.google.cloud.video."
          + "stitcher.v1.ProgressEvent\0229\n\003ads\030\002 \003(\0132,"
          + ".google.cloud.video.stitcher.v1.VodSessi"
          + "onAd\0222\n\017end_time_offset\030\003 \001(\0132\031.google.p"
          + "rotobuf.Duration\0224\n\021start_time_offset\030\004 "
          + "\001(\0132\031.google.protobuf.Duration\"\273\004\n\013LiveS"
          + "ession\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\025\n\010play_uri\030\002 "
          + "\001(\tB\003\340A\003\022S\n\rad_tag_macros\030\006 \003(\0132<.google"
          + ".cloud.video.stitcher.v1.LiveSession.AdT"
          + "agMacrosEntry\022I\n\020manifest_options\030\n \001(\0132"
          + "/.google.cloud.video.stitcher.v1.Manifes"
          + "tOptions\022M\n\014gam_settings\030\017 \001(\01327.google."
          + "cloud.video.stitcher.v1.LiveSession.GamS"
          + "ettings\022D\n\013live_config\030\020 \001(\tB/\340A\002\372A)\n\'vi"
          + "deostitcher.googleapis.com/LiveConfig\032%\n"
          + "\013GamSettings\022\026\n\tstream_id\030\001 \001(\tB\003\340A\002\0322\n\020"
          + "AdTagMacrosEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001:r\352Ao\n(videostitcher.googleapis."
          + "com/LiveSession\022Cprojects/{project}/loca"
          + "tions/{location}/liveSessions/{live_sess"
          + "ion}\"\376\001\n\017ManifestOptions\022K\n\022include_rend"
          + "itions\030\001 \003(\0132/.google.cloud.video.stitch"
          + "er.v1.RenditionFilter\022R\n\rbitrate_order\030\002"
          + " \001(\0162;.google.cloud.video.stitcher.v1.Ma"
          + "nifestOptions.OrderPolicy\"J\n\013OrderPolicy"
          + "\022\034\n\030ORDER_POLICY_UNSPECIFIED\020\000\022\r\n\tASCEND"
          + "ING\020\001\022\016\n\nDESCENDING\020\002\"6\n\017RenditionFilter"
          + "\022\023\n\013bitrate_bps\030\001 \001(\005\022\016\n\006codecs\030\002 \001(\tBu\n"
          + "\"com.google.cloud.video.stitcher.v1B\rSes"
          + "sionsProtoP\001Z>cloud.google.com/go/video/"
          + "stitcher/apiv1/stitcherpb;stitcherpbb\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.video.stitcher.v1.CompanionsProto.getDescriptor(),
              com.google.cloud.video.stitcher.v1.EventsProto.getDescriptor(),
              com.google.cloud.video.stitcher.v1.LiveConfigsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_video_stitcher_v1_VodSession_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_video_stitcher_v1_VodSession_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_VodSession_descriptor,
            new java.lang.String[] {
              "Name",
              "Interstitials",
              "PlayUri",
              "SourceUri",
              "AdTagUri",
              "AdTagMacroMap",
              "ManifestOptions",
              "AssetId",
              "AdTracking",
              "GamSettings",
            });
    internal_static_google_cloud_video_stitcher_v1_VodSession_GamSettings_descriptor =
        internal_static_google_cloud_video_stitcher_v1_VodSession_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_video_stitcher_v1_VodSession_GamSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_VodSession_GamSettings_descriptor,
            new java.lang.String[] {
              "NetworkCode", "StreamId",
            });
    internal_static_google_cloud_video_stitcher_v1_VodSession_AdTagMacroMapEntry_descriptor =
        internal_static_google_cloud_video_stitcher_v1_VodSession_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_video_stitcher_v1_VodSession_AdTagMacroMapEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_VodSession_AdTagMacroMapEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_video_stitcher_v1_Interstitials_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_video_stitcher_v1_Interstitials_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_Interstitials_descriptor,
            new java.lang.String[] {
              "AdBreaks", "SessionContent",
            });
    internal_static_google_cloud_video_stitcher_v1_VodSessionAd_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_video_stitcher_v1_VodSessionAd_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_VodSessionAd_descriptor,
            new java.lang.String[] {
              "Duration", "CompanionAds", "ActivityEvents",
            });
    internal_static_google_cloud_video_stitcher_v1_VodSessionContent_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_video_stitcher_v1_VodSessionContent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_VodSessionContent_descriptor,
            new java.lang.String[] {
              "Duration",
            });
    internal_static_google_cloud_video_stitcher_v1_VodSessionAdBreak_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_video_stitcher_v1_VodSessionAdBreak_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_VodSessionAdBreak_descriptor,
            new java.lang.String[] {
              "ProgressEvents", "Ads", "EndTimeOffset", "StartTimeOffset",
            });
    internal_static_google_cloud_video_stitcher_v1_LiveSession_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_video_stitcher_v1_LiveSession_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_LiveSession_descriptor,
            new java.lang.String[] {
              "Name", "PlayUri", "AdTagMacros", "ManifestOptions", "GamSettings", "LiveConfig",
            });
    internal_static_google_cloud_video_stitcher_v1_LiveSession_GamSettings_descriptor =
        internal_static_google_cloud_video_stitcher_v1_LiveSession_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_video_stitcher_v1_LiveSession_GamSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_LiveSession_GamSettings_descriptor,
            new java.lang.String[] {
              "StreamId",
            });
    internal_static_google_cloud_video_stitcher_v1_LiveSession_AdTagMacrosEntry_descriptor =
        internal_static_google_cloud_video_stitcher_v1_LiveSession_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_video_stitcher_v1_LiveSession_AdTagMacrosEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_LiveSession_AdTagMacrosEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_video_stitcher_v1_ManifestOptions_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_video_stitcher_v1_ManifestOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_ManifestOptions_descriptor,
            new java.lang.String[] {
              "IncludeRenditions", "BitrateOrder",
            });
    internal_static_google_cloud_video_stitcher_v1_RenditionFilter_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_video_stitcher_v1_RenditionFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_RenditionFilter_descriptor,
            new java.lang.String[] {
              "BitrateBps", "Codecs",
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
    com.google.cloud.video.stitcher.v1.CompanionsProto.getDescriptor();
    com.google.cloud.video.stitcher.v1.EventsProto.getDescriptor();
    com.google.cloud.video.stitcher.v1.LiveConfigsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
