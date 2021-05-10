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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface RouteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Route)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this field when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this field when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this field when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
   * </pre>
   *
   * <code>string dest_range = 381327712;</code>
   *
   * @return Whether the destRange field is set.
   */
  boolean hasDestRange();
  /**
   *
   *
   * <pre>
   * The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
   * </pre>
   *
   * <code>string dest_range = 381327712;</code>
   *
   * @return The destRange.
   */
  java.lang.String getDestRange();
  /**
   *
   *
   * <pre>
   * The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
   * </pre>
   *
   * <code>string dest_range = 381327712;</code>
   *
   * @return The bytes for destRange.
   */
  com.google.protobuf.ByteString getDestRangeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of this resource. Always compute#routes for Route resources.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of this resource. Always compute#routes for Route resources.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of this resource. Always compute#routes for Route resources.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Fully-qualified URL of the network that this route applies to.
   * </pre>
   *
   * <code>string network = 232872494;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * Fully-qualified URL of the network that this route applies to.
   * </pre>
   *
   * <code>string network = 232872494;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Fully-qualified URL of the network that this route applies to.
   * </pre>
   *
   * <code>string network = 232872494;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL:  projects/project/global/gateways/default-internet-gateway
   * </pre>
   *
   * <code>string next_hop_gateway = 377175298;</code>
   *
   * @return Whether the nextHopGateway field is set.
   */
  boolean hasNextHopGateway();
  /**
   *
   *
   * <pre>
   * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL:  projects/project/global/gateways/default-internet-gateway
   * </pre>
   *
   * <code>string next_hop_gateway = 377175298;</code>
   *
   * @return The nextHopGateway.
   */
  java.lang.String getNextHopGateway();
  /**
   *
   *
   * <pre>
   * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL:  projects/project/global/gateways/default-internet-gateway
   * </pre>
   *
   * <code>string next_hop_gateway = 377175298;</code>
   *
   * @return The bytes for nextHopGateway.
   */
  com.google.protobuf.ByteString getNextHopGatewayBytes();

  /**
   *
   *
   * <pre>
   * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs:
   * - 10.128.0.56
   * - https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
   * - regions/region/forwardingRules/forwardingRule
   * </pre>
   *
   * <code>string next_hop_ilb = 198679901;</code>
   *
   * @return Whether the nextHopIlb field is set.
   */
  boolean hasNextHopIlb();
  /**
   *
   *
   * <pre>
   * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs:
   * - 10.128.0.56
   * - https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
   * - regions/region/forwardingRules/forwardingRule
   * </pre>
   *
   * <code>string next_hop_ilb = 198679901;</code>
   *
   * @return The nextHopIlb.
   */
  java.lang.String getNextHopIlb();
  /**
   *
   *
   * <pre>
   * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs:
   * - 10.128.0.56
   * - https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
   * - regions/region/forwardingRules/forwardingRule
   * </pre>
   *
   * <code>string next_hop_ilb = 198679901;</code>
   *
   * @return The bytes for nextHopIlb.
   */
  com.google.protobuf.ByteString getNextHopIlbBytes();

  /**
   *
   *
   * <pre>
   * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example:
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
   * </pre>
   *
   * <code>string next_hop_instance = 393508247;</code>
   *
   * @return Whether the nextHopInstance field is set.
   */
  boolean hasNextHopInstance();
  /**
   *
   *
   * <pre>
   * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example:
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
   * </pre>
   *
   * <code>string next_hop_instance = 393508247;</code>
   *
   * @return The nextHopInstance.
   */
  java.lang.String getNextHopInstance();
  /**
   *
   *
   * <pre>
   * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example:
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
   * </pre>
   *
   * <code>string next_hop_instance = 393508247;</code>
   *
   * @return The bytes for nextHopInstance.
   */
  com.google.protobuf.ByteString getNextHopInstanceBytes();

  /**
   *
   *
   * <pre>
   * The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
   * </pre>
   *
   * <code>string next_hop_ip = 110319529;</code>
   *
   * @return Whether the nextHopIp field is set.
   */
  boolean hasNextHopIp();
  /**
   *
   *
   * <pre>
   * The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
   * </pre>
   *
   * <code>string next_hop_ip = 110319529;</code>
   *
   * @return The nextHopIp.
   */
  java.lang.String getNextHopIp();
  /**
   *
   *
   * <pre>
   * The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
   * </pre>
   *
   * <code>string next_hop_ip = 110319529;</code>
   *
   * @return The bytes for nextHopIp.
   */
  com.google.protobuf.ByteString getNextHopIpBytes();

  /**
   *
   *
   * <pre>
   * The URL of the local network if it should handle matching packets.
   * </pre>
   *
   * <code>string next_hop_network = 262295788;</code>
   *
   * @return Whether the nextHopNetwork field is set.
   */
  boolean hasNextHopNetwork();
  /**
   *
   *
   * <pre>
   * The URL of the local network if it should handle matching packets.
   * </pre>
   *
   * <code>string next_hop_network = 262295788;</code>
   *
   * @return The nextHopNetwork.
   */
  java.lang.String getNextHopNetwork();
  /**
   *
   *
   * <pre>
   * The URL of the local network if it should handle matching packets.
   * </pre>
   *
   * <code>string next_hop_network = 262295788;</code>
   *
   * @return The bytes for nextHopNetwork.
   */
  com.google.protobuf.ByteString getNextHopNetworkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The network peering name that should handle matching packets, which should conform to RFC1035.
   * </pre>
   *
   * <code>string next_hop_peering = 412682750;</code>
   *
   * @return Whether the nextHopPeering field is set.
   */
  boolean hasNextHopPeering();
  /**
   *
   *
   * <pre>
   * [Output Only] The network peering name that should handle matching packets, which should conform to RFC1035.
   * </pre>
   *
   * <code>string next_hop_peering = 412682750;</code>
   *
   * @return The nextHopPeering.
   */
  java.lang.String getNextHopPeering();
  /**
   *
   *
   * <pre>
   * [Output Only] The network peering name that should handle matching packets, which should conform to RFC1035.
   * </pre>
   *
   * <code>string next_hop_peering = 412682750;</code>
   *
   * @return The bytes for nextHopPeering.
   */
  com.google.protobuf.ByteString getNextHopPeeringBytes();

  /**
   *
   *
   * <pre>
   * The URL to a VpnTunnel that should handle matching packets.
   * </pre>
   *
   * <code>string next_hop_vpn_tunnel = 519844501;</code>
   *
   * @return Whether the nextHopVpnTunnel field is set.
   */
  boolean hasNextHopVpnTunnel();
  /**
   *
   *
   * <pre>
   * The URL to a VpnTunnel that should handle matching packets.
   * </pre>
   *
   * <code>string next_hop_vpn_tunnel = 519844501;</code>
   *
   * @return The nextHopVpnTunnel.
   */
  java.lang.String getNextHopVpnTunnel();
  /**
   *
   *
   * <pre>
   * The URL to a VpnTunnel that should handle matching packets.
   * </pre>
   *
   * <code>string next_hop_vpn_tunnel = 519844501;</code>
   *
   * @return The bytes for nextHopVpnTunnel.
   */
  com.google.protobuf.ByteString getNextHopVpnTunnelBytes();

  /**
   *
   *
   * <pre>
   * The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
   * </pre>
   *
   * <code>uint32 priority = 445151652;</code>
   *
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   *
   *
   * <pre>
   * The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
   * </pre>
   *
   * <code>uint32 priority = 445151652;</code>
   *
   * @return The priority.
   */
  int getPriority();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * A list of instance tags to which this route applies.
   * </pre>
   *
   * <code>repeated string tags = 3552281;</code>
   *
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String> getTagsList();
  /**
   *
   *
   * <pre>
   * A list of instance tags to which this route applies.
   * </pre>
   *
   * <code>repeated string tags = 3552281;</code>
   *
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * A list of instance tags to which this route applies.
   * </pre>
   *
   * <code>repeated string tags = 3552281;</code>
   *
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   *
   *
   * <pre>
   * A list of instance tags to which this route applies.
   * </pre>
   *
   * <code>repeated string tags = 3552281;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString getTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] If potential misconfigurations are detected for this route, this field will be populated with warning messages.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Warnings> getWarningsList();
  /**
   *
   *
   * <pre>
   * [Output Only] If potential misconfigurations are detected for this route, this field will be populated with warning messages.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  com.google.cloud.compute.v1.Warnings getWarnings(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] If potential misconfigurations are detected for this route, this field will be populated with warning messages.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  int getWarningsCount();
  /**
   *
   *
   * <pre>
   * [Output Only] If potential misconfigurations are detected for this route, this field will be populated with warning messages.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.WarningsOrBuilder>
      getWarningsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] If potential misconfigurations are detected for this route, this field will be populated with warning messages.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  com.google.cloud.compute.v1.WarningsOrBuilder getWarningsOrBuilder(int index);
}
