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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface VpnGatewayOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.VpnGateway)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
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
   * <code>optional string creation_timestamp = 30525366;</code>
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
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The IP family of the gateway IPs for the HA-VPN gateway interfaces. If not specified, IPV4 will be used.
   * Check the GatewayIpVersion enum for the list of possible values.
   * </pre>
   *
   * <code>optional string gateway_ip_version = 65074843;</code>
   *
   * @return Whether the gatewayIpVersion field is set.
   */
  boolean hasGatewayIpVersion();
  /**
   *
   *
   * <pre>
   * The IP family of the gateway IPs for the HA-VPN gateway interfaces. If not specified, IPV4 will be used.
   * Check the GatewayIpVersion enum for the list of possible values.
   * </pre>
   *
   * <code>optional string gateway_ip_version = 65074843;</code>
   *
   * @return The gatewayIpVersion.
   */
  java.lang.String getGatewayIpVersion();
  /**
   *
   *
   * <pre>
   * The IP family of the gateway IPs for the HA-VPN gateway interfaces. If not specified, IPV4 will be used.
   * Check the GatewayIpVersion enum for the list of possible values.
   * </pre>
   *
   * <code>optional string gateway_ip_version = 65074843;</code>
   *
   * @return The bytes for gatewayIpVersion.
   */
  com.google.protobuf.ByteString getGatewayIpVersionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
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
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#vpnGateway for VPN gateways.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#vpnGateway for VPN gateways.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#vpnGateway for VPN gateways.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * A fingerprint for the labels being applied to this VpnGateway, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a VpnGateway.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   *
   * @return Whether the labelFingerprint field is set.
   */
  boolean hasLabelFingerprint();
  /**
   *
   *
   * <pre>
   * A fingerprint for the labels being applied to this VpnGateway, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a VpnGateway.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   *
   * @return The labelFingerprint.
   */
  java.lang.String getLabelFingerprint();
  /**
   *
   *
   * <pre>
   * A fingerprint for the labels being applied to this VpnGateway, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a VpnGateway.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   *
   * @return The bytes for labelFingerprint.
   */
  com.google.protobuf.ByteString getLabelFingerprintBytes();

  /**
   *
   *
   * <pre>
   * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the VPN gateway resides.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the VPN gateway resides.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the VPN gateway resides.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * The stack type for this VPN gateway to identify the IP protocols that are enabled. Possible values are: IPV4_ONLY, IPV4_IPV6. If not specified, IPV4_ONLY will be used.
   * Check the StackType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string stack_type = 425908881;</code>
   *
   * @return Whether the stackType field is set.
   */
  boolean hasStackType();
  /**
   *
   *
   * <pre>
   * The stack type for this VPN gateway to identify the IP protocols that are enabled. Possible values are: IPV4_ONLY, IPV4_IPV6. If not specified, IPV4_ONLY will be used.
   * Check the StackType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string stack_type = 425908881;</code>
   *
   * @return The stackType.
   */
  java.lang.String getStackType();
  /**
   *
   *
   * <pre>
   * The stack type for this VPN gateway to identify the IP protocols that are enabled. Possible values are: IPV4_ONLY, IPV4_IPV6. If not specified, IPV4_ONLY will be used.
   * Check the StackType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string stack_type = 425908881;</code>
   *
   * @return The bytes for stackType.
   */
  com.google.protobuf.ByteString getStackTypeBytes();

  /**
   *
   *
   * <pre>
   * The list of VPN interfaces associated with this VPN gateway.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.VpnGatewayVpnGatewayInterface vpn_interfaces = 91842181;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.VpnGatewayVpnGatewayInterface> getVpnInterfacesList();
  /**
   *
   *
   * <pre>
   * The list of VPN interfaces associated with this VPN gateway.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.VpnGatewayVpnGatewayInterface vpn_interfaces = 91842181;
   * </code>
   */
  com.google.cloud.compute.v1.VpnGatewayVpnGatewayInterface getVpnInterfaces(int index);
  /**
   *
   *
   * <pre>
   * The list of VPN interfaces associated with this VPN gateway.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.VpnGatewayVpnGatewayInterface vpn_interfaces = 91842181;
   * </code>
   */
  int getVpnInterfacesCount();
  /**
   *
   *
   * <pre>
   * The list of VPN interfaces associated with this VPN gateway.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.VpnGatewayVpnGatewayInterface vpn_interfaces = 91842181;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.VpnGatewayVpnGatewayInterfaceOrBuilder>
      getVpnInterfacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of VPN interfaces associated with this VPN gateway.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.VpnGatewayVpnGatewayInterface vpn_interfaces = 91842181;
   * </code>
   */
  com.google.cloud.compute.v1.VpnGatewayVpnGatewayInterfaceOrBuilder getVpnInterfacesOrBuilder(
      int index);
}
