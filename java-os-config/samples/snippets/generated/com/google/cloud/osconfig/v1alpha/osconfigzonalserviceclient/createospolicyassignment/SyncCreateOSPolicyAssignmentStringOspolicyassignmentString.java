/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.osconfig.v1alpha.samples;

// [START osconfig_v1alpha_generated_osconfigzonalserviceclient_createospolicyassignment_stringospolicyassignmentstring_sync]
import com.google.cloud.osconfig.v1alpha.LocationName;
import com.google.cloud.osconfig.v1alpha.OSPolicyAssignment;
import com.google.cloud.osconfig.v1alpha.OsConfigZonalServiceClient;

public class SyncCreateOSPolicyAssignmentStringOspolicyassignmentString {

  public static void main(String[] args) throws Exception {
    syncCreateOSPolicyAssignmentStringOspolicyassignmentString();
  }

  public static void syncCreateOSPolicyAssignmentStringOspolicyassignmentString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (OsConfigZonalServiceClient osConfigZonalServiceClient =
        OsConfigZonalServiceClient.create()) {
      String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
      OSPolicyAssignment osPolicyAssignment = OSPolicyAssignment.newBuilder().build();
      String osPolicyAssignmentId = "osPolicyAssignmentId-44079074";
      OSPolicyAssignment response =
          osConfigZonalServiceClient
              .createOSPolicyAssignmentAsync(parent, osPolicyAssignment, osPolicyAssignmentId)
              .get();
    }
  }
}
// [END osconfig_v1alpha_generated_osconfigzonalserviceclient_createospolicyassignment_stringospolicyassignmentstring_sync]