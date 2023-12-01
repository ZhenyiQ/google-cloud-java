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
// source: google/maps/places/v1/ev_charging.proto

package com.google.maps.places.v1;

public interface EVChargeOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.EVChargeOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Number of connectors at this station. However, because some ports can have
   * multiple connectors but only be able to charge one car at a time (e.g.) the
   * number of connectors may be greater than the total number of cars which can
   * charge simultaneously.
   * </pre>
   *
   * <code>int32 connector_count = 1;</code>
   *
   * @return The connectorCount.
   */
  int getConnectorCount();

  /**
   *
   *
   * <pre>
   * A list of EV charging connector aggregations that contain connectors of the
   * same type and same charge rate.
   * </pre>
   *
   * <code>
   * repeated .google.maps.places.v1.EVChargeOptions.ConnectorAggregation connector_aggregation = 2;
   * </code>
   */
  java.util.List<com.google.maps.places.v1.EVChargeOptions.ConnectorAggregation>
      getConnectorAggregationList();
  /**
   *
   *
   * <pre>
   * A list of EV charging connector aggregations that contain connectors of the
   * same type and same charge rate.
   * </pre>
   *
   * <code>
   * repeated .google.maps.places.v1.EVChargeOptions.ConnectorAggregation connector_aggregation = 2;
   * </code>
   */
  com.google.maps.places.v1.EVChargeOptions.ConnectorAggregation getConnectorAggregation(int index);
  /**
   *
   *
   * <pre>
   * A list of EV charging connector aggregations that contain connectors of the
   * same type and same charge rate.
   * </pre>
   *
   * <code>
   * repeated .google.maps.places.v1.EVChargeOptions.ConnectorAggregation connector_aggregation = 2;
   * </code>
   */
  int getConnectorAggregationCount();
  /**
   *
   *
   * <pre>
   * A list of EV charging connector aggregations that contain connectors of the
   * same type and same charge rate.
   * </pre>
   *
   * <code>
   * repeated .google.maps.places.v1.EVChargeOptions.ConnectorAggregation connector_aggregation = 2;
   * </code>
   */
  java.util.List<? extends com.google.maps.places.v1.EVChargeOptions.ConnectorAggregationOrBuilder>
      getConnectorAggregationOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of EV charging connector aggregations that contain connectors of the
   * same type and same charge rate.
   * </pre>
   *
   * <code>
   * repeated .google.maps.places.v1.EVChargeOptions.ConnectorAggregation connector_aggregation = 2;
   * </code>
   */
  com.google.maps.places.v1.EVChargeOptions.ConnectorAggregationOrBuilder
      getConnectorAggregationOrBuilder(int index);
}
