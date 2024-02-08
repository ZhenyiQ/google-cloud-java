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
// source: google/cloud/video/livestream/v1/outputs.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.video.livestream.v1;

public final class OutputsProto {
  private OutputsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_ElementaryStream_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_ElementaryStream_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_MuxStream_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_MuxStream_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_Manifest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_Manifest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_SpriteSheet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_SpriteSheet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Audio_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Audio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Crop_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Crop_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Pad_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Pad_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_VideoStream_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_VideoStream_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_VideoStream_H264CodecSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_VideoStream_H264CodecSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_AudioStream_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_AudioStream_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_AudioStream_AudioMapping_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_AudioStream_AudioMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_TextStream_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_TextStream_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_SegmentSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_SegmentSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_livestream_v1_TimecodeConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_livestream_v1_TimecodeConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/video/livestream/v1/outpu"
          + "ts.proto\022 google.cloud.video.livestream."
          + "v1\032\037google/api/field_behavior.proto\032\036goo"
          + "gle/protobuf/duration.proto\032\032google/type"
          + "/datetime.proto\"\207\002\n\020ElementaryStream\022\013\n\003"
          + "key\030\004 \001(\t\022E\n\014video_stream\030\001 \001(\0132-.google"
          + ".cloud.video.livestream.v1.VideoStreamH\000"
          + "\022E\n\014audio_stream\030\002 \001(\0132-.google.cloud.vi"
          + "deo.livestream.v1.AudioStreamH\000\022C\n\013text_"
          + "stream\030\003 \001(\0132,.google.cloud.video.livest"
          + "ream.v1.TextStreamH\000B\023\n\021elementary_strea"
          + "m\"\253\001\n\tMuxStream\022\013\n\003key\030\001 \001(\t\022\021\n\tcontaine"
          + "r\030\003 \001(\t\022\032\n\022elementary_streams\030\004 \003(\t\022K\n\020s"
          + "egment_settings\030\005 \001(\01321.google.cloud.vid"
          + "eo.livestream.v1.SegmentSettings\022\025\n\rencr"
          + "yption_id\030\006 \001(\t\"\274\002\n\010Manifest\022\021\n\tfile_nam"
          + "e\030\001 \001(\t\022J\n\004type\030\002 \001(\01627.google.cloud.vid"
          + "eo.livestream.v1.Manifest.ManifestTypeB\003"
          + "\340A\002\022\030\n\013mux_streams\030\003 \003(\tB\003\340A\002\022\031\n\021max_seg"
          + "ment_count\030\004 \001(\005\0228\n\025segment_keep_duratio"
          + "n\030\005 \001(\0132\031.google.protobuf.Duration\022 \n\030us"
          + "e_timecode_as_timeline\030\006 \001(\010\"@\n\014Manifest"
          + "Type\022\035\n\031MANIFEST_TYPE_UNSPECIFIED\020\000\022\007\n\003H"
          + "LS\020\001\022\010\n\004DASH\020\002\"\343\001\n\013SpriteSheet\022\016\n\006format"
          + "\030\001 \001(\t\022\030\n\013file_prefix\030\002 \001(\tB\003\340A\002\022 \n\023spri"
          + "te_width_pixels\030\003 \001(\005B\003\340A\002\022!\n\024sprite_hei"
          + "ght_pixels\030\004 \001(\005B\003\340A\002\022\024\n\014column_count\030\005 "
          + "\001(\005\022\021\n\trow_count\030\006 \001(\005\022+\n\010interval\030\007 \001(\013"
          + "2\031.google.protobuf.Duration\022\017\n\007quality\030\010"
          + " \001(\005\"\305\003\n\023PreprocessingConfig\022J\n\005audio\030\001 "
          + "\001(\0132;.google.cloud.video.livestream.v1.P"
          + "reprocessingConfig.Audio\022H\n\004crop\030\002 \001(\0132:"
          + ".google.cloud.video.livestream.v1.Prepro"
          + "cessingConfig.Crop\022F\n\003pad\030\003 \001(\01329.google"
          + ".cloud.video.livestream.v1.Preprocessing"
          + "Config.Pad\032\025\n\005Audio\022\014\n\004lufs\030\001 \001(\001\032\\\n\004Cro"
          + "p\022\022\n\ntop_pixels\030\001 \001(\005\022\025\n\rbottom_pixels\030\002"
          + " \001(\005\022\023\n\013left_pixels\030\003 \001(\005\022\024\n\014right_pixel"
          + "s\030\004 \001(\005\032[\n\003Pad\022\022\n\ntop_pixels\030\001 \001(\005\022\025\n\rbo"
          + "ttom_pixels\030\002 \001(\005\022\023\n\013left_pixels\030\003 \001(\005\022\024"
          + "\n\014right_pixels\030\004 \001(\005\"\377\003\n\013VideoStream\022O\n\004"
          + "h264\030\024 \001(\0132?.google.cloud.video.livestre"
          + "am.v1.VideoStream.H264CodecSettingsH\000\032\214\003"
          + "\n\021H264CodecSettings\022\024\n\014width_pixels\030\001 \001("
          + "\005\022\025\n\rheight_pixels\030\002 \001(\005\022\027\n\nframe_rate\030\003"
          + " \001(\001B\003\340A\002\022\030\n\013bitrate_bps\030\004 \001(\005B\003\340A\002\022\026\n\016a"
          + "llow_open_gop\030\006 \001(\010\022\031\n\017gop_frame_count\030\007"
          + " \001(\005H\000\0221\n\014gop_duration\030\010 \001(\0132\031.google.pr"
          + "otobuf.DurationH\000\022\025\n\rvbv_size_bits\030\t \001(\005"
          + "\022\031\n\021vbv_fullness_bits\030\n \001(\005\022\025\n\rentropy_c"
          + "oder\030\013 \001(\t\022\021\n\tb_pyramid\030\014 \001(\010\022\025\n\rb_frame"
          + "_count\030\r \001(\005\022\023\n\013aq_strength\030\016 \001(\001\022\017\n\007pro"
          + "file\030\017 \001(\t\022\014\n\004tune\030\020 \001(\tB\n\n\010gop_modeB\020\n\016"
          + "codec_settings\"\354\002\n\013AudioStream\022\020\n\010transm"
          + "ux\030\010 \001(\010\022\r\n\005codec\030\001 \001(\t\022\030\n\013bitrate_bps\030\002"
          + " \001(\005B\003\340A\002\022\025\n\rchannel_count\030\003 \001(\005\022\026\n\016chan"
          + "nel_layout\030\004 \003(\t\022K\n\007mapping\030\005 \003(\0132:.goog"
          + "le.cloud.video.livestream.v1.AudioStream"
          + ".AudioMapping\022\031\n\021sample_rate_hertz\030\006 \001(\005"
          + "\032\212\001\n\014AudioMapping\022\026\n\tinput_key\030\006 \001(\tB\003\340A"
          + "\002\022\030\n\013input_track\030\002 \001(\005B\003\340A\002\022\032\n\rinput_cha"
          + "nnel\030\003 \001(\005B\003\340A\002\022\033\n\016output_channel\030\004 \001(\005B"
          + "\003\340A\002\022\017\n\007gain_db\030\005 \001(\001\" \n\nTextStream\022\022\n\005c"
          + "odec\030\001 \001(\tB\003\340A\002\"F\n\017SegmentSettings\0223\n\020se"
          + "gment_duration\030\001 \001(\0132\031.google.protobuf.D"
          + "uration\"\254\002\n\016TimecodeConfig\022O\n\006source\030\001 \001"
          + "(\0162?.google.cloud.video.livestream.v1.Ti"
          + "mecodeConfig.TimecodeSource\022/\n\nutc_offse"
          + "t\030\002 \001(\0132\031.google.protobuf.DurationH\000\022*\n\t"
          + "time_zone\030\003 \001(\0132\025.google.type.TimeZoneH\000"
          + "\"]\n\016TimecodeSource\022\037\n\033TIMECODE_SOURCE_UN"
          + "SPECIFIED\020\000\022\023\n\017MEDIA_TIMESTAMP\020\001\022\025\n\021EMBE"
          + "DDED_TIMECODE\020\002B\r\n\013time_offsetB\351\001\n$com.g"
          + "oogle.cloud.video.livestream.v1B\014Outputs"
          + "ProtoP\001ZDcloud.google.com/go/video/lives"
          + "tream/apiv1/livestreampb;livestreampb\252\002 "
          + "Google.Cloud.Video.LiveStream.V1\312\002 Googl"
          + "e\\Cloud\\Video\\LiveStream\\V1\352\002$Google::Cl"
          + "oud::Video::LiveStream::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.type.DateTimeProto.getDescriptor(),
            });
    internal_static_google_cloud_video_livestream_v1_ElementaryStream_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_video_livestream_v1_ElementaryStream_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_ElementaryStream_descriptor,
            new java.lang.String[] {
              "Key", "VideoStream", "AudioStream", "TextStream", "ElementaryStream",
            });
    internal_static_google_cloud_video_livestream_v1_MuxStream_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_video_livestream_v1_MuxStream_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_MuxStream_descriptor,
            new java.lang.String[] {
              "Key", "Container", "ElementaryStreams", "SegmentSettings", "EncryptionId",
            });
    internal_static_google_cloud_video_livestream_v1_Manifest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_video_livestream_v1_Manifest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_Manifest_descriptor,
            new java.lang.String[] {
              "FileName",
              "Type",
              "MuxStreams",
              "MaxSegmentCount",
              "SegmentKeepDuration",
              "UseTimecodeAsTimeline",
            });
    internal_static_google_cloud_video_livestream_v1_SpriteSheet_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_video_livestream_v1_SpriteSheet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_SpriteSheet_descriptor,
            new java.lang.String[] {
              "Format",
              "FilePrefix",
              "SpriteWidthPixels",
              "SpriteHeightPixels",
              "ColumnCount",
              "RowCount",
              "Interval",
              "Quality",
            });
    internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_descriptor,
            new java.lang.String[] {
              "Audio", "Crop", "Pad",
            });
    internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Audio_descriptor =
        internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Audio_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Audio_descriptor,
            new java.lang.String[] {
              "Lufs",
            });
    internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Crop_descriptor =
        internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Crop_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Crop_descriptor,
            new java.lang.String[] {
              "TopPixels", "BottomPixels", "LeftPixels", "RightPixels",
            });
    internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Pad_descriptor =
        internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Pad_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_PreprocessingConfig_Pad_descriptor,
            new java.lang.String[] {
              "TopPixels", "BottomPixels", "LeftPixels", "RightPixels",
            });
    internal_static_google_cloud_video_livestream_v1_VideoStream_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_video_livestream_v1_VideoStream_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_VideoStream_descriptor,
            new java.lang.String[] {
              "H264", "CodecSettings",
            });
    internal_static_google_cloud_video_livestream_v1_VideoStream_H264CodecSettings_descriptor =
        internal_static_google_cloud_video_livestream_v1_VideoStream_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_video_livestream_v1_VideoStream_H264CodecSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_VideoStream_H264CodecSettings_descriptor,
            new java.lang.String[] {
              "WidthPixels",
              "HeightPixels",
              "FrameRate",
              "BitrateBps",
              "AllowOpenGop",
              "GopFrameCount",
              "GopDuration",
              "VbvSizeBits",
              "VbvFullnessBits",
              "EntropyCoder",
              "BPyramid",
              "BFrameCount",
              "AqStrength",
              "Profile",
              "Tune",
              "GopMode",
            });
    internal_static_google_cloud_video_livestream_v1_AudioStream_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_video_livestream_v1_AudioStream_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_AudioStream_descriptor,
            new java.lang.String[] {
              "Transmux",
              "Codec",
              "BitrateBps",
              "ChannelCount",
              "ChannelLayout",
              "Mapping",
              "SampleRateHertz",
            });
    internal_static_google_cloud_video_livestream_v1_AudioStream_AudioMapping_descriptor =
        internal_static_google_cloud_video_livestream_v1_AudioStream_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_video_livestream_v1_AudioStream_AudioMapping_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_AudioStream_AudioMapping_descriptor,
            new java.lang.String[] {
              "InputKey", "InputTrack", "InputChannel", "OutputChannel", "GainDb",
            });
    internal_static_google_cloud_video_livestream_v1_TextStream_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_video_livestream_v1_TextStream_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_TextStream_descriptor,
            new java.lang.String[] {
              "Codec",
            });
    internal_static_google_cloud_video_livestream_v1_SegmentSettings_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_video_livestream_v1_SegmentSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_SegmentSettings_descriptor,
            new java.lang.String[] {
              "SegmentDuration",
            });
    internal_static_google_cloud_video_livestream_v1_TimecodeConfig_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_video_livestream_v1_TimecodeConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_livestream_v1_TimecodeConfig_descriptor,
            new java.lang.String[] {
              "Source", "UtcOffset", "TimeZone", "TimeOffset",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.type.DateTimeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
