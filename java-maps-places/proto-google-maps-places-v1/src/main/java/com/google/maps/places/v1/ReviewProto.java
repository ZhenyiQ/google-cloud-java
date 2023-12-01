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
// source: google/maps/places/v1/review.proto

package com.google.maps.places.v1;

public final class ReviewProto {
  private ReviewProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_Review_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_Review_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/maps/places/v1/review.proto\022\025go"
          + "ogle.maps.places.v1\032\037google/api/field_be"
          + "havior.proto\032\031google/api/resource.proto\032"
          + "\'google/maps/places/v1/attribution.proto"
          + "\032\037google/protobuf/timestamp.proto\032 googl"
          + "e/type/localized_text.proto\"\245\003\n\006Review\022\022"
          + "\n\004name\030\001 \001(\tB\004\342A\001\003\022/\n!relative_publish_t"
          + "ime_description\030\002 \001(\tB\004\342A\001\003\022.\n\004text\030\t \001("
          + "\0132\032.google.type.LocalizedTextB\004\342A\001\003\0227\n\ro"
          + "riginal_text\030\014 \001(\0132\032.google.type.Localiz"
          + "edTextB\004\342A\001\003\022\024\n\006rating\030\007 \001(\001B\004\342A\001\003\022J\n\022au"
          + "thor_attribution\030\r \001(\0132(.google.maps.pla"
          + "ces.v1.AuthorAttributionB\004\342A\001\003\0226\n\014publis"
          + "h_time\030\016 \001(\0132\032.google.protobuf.Timestamp"
          + "B\004\342A\001\003:S\352AP\n\034places.googleapis.com/Revie"
          + "w\022\037places/{place}/reviews/{review}*\007revi"
          + "ews2\006reviewB\237\001\n\031com.google.maps.places.v"
          + "1B\013ReviewProtoP\001Z7cloud.google.com/go/ma"
          + "ps/places/apiv1/placespb;placespb\370\001\001\242\002\006G"
          + "MPSV1\252\002\025Google.Maps.Places.V1\312\002\025Google\\M"
          + "aps\\Places\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.maps.places.v1.AttributionProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.LocalizedTextProto.getDescriptor(),
            });
    internal_static_google_maps_places_v1_Review_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_places_v1_Review_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_Review_descriptor,
            new java.lang.String[] {
              "Name",
              "RelativePublishTimeDescription",
              "Text",
              "OriginalText",
              "Rating",
              "AuthorAttribution",
              "PublishTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.maps.places.v1.AttributionProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.LocalizedTextProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
