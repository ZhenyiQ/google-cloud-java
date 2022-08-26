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

package com.google.cloud.dataplex.v1.samples;

// [START dataplex_v1_generated_dataplexserviceclient_getzone_zonename_sync]
import com.google.cloud.dataplex.v1.DataplexServiceClient;
import com.google.cloud.dataplex.v1.Zone;
import com.google.cloud.dataplex.v1.ZoneName;

public class SyncGetZoneZonename {

  public static void main(String[] args) throws Exception {
    syncGetZoneZonename();
  }

  public static void syncGetZoneZonename() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataplexServiceClient dataplexServiceClient = DataplexServiceClient.create()) {
      ZoneName name = ZoneName.of("[PROJECT]", "[LOCATION]", "[LAKE]", "[ZONE]");
      Zone response = dataplexServiceClient.getZone(name);
    }
  }
}
// [END dataplex_v1_generated_dataplexserviceclient_getzone_zonename_sync]