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

package com.google.cloud.filestore.v1beta1.samples;

// [START filestore_v1beta1_generated_cloudfilestoremanagerclient_listbackups_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.filestore.v1beta1.Backup;
import com.google.cloud.filestore.v1beta1.CloudFilestoreManagerClient;
import com.google.cloud.filestore.v1beta1.ListBackupsRequest;
import com.google.cloud.filestore.v1beta1.LocationName;

public class AsyncListBackups {

  public static void main(String[] args) throws Exception {
    asyncListBackups();
  }

  public static void asyncListBackups() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudFilestoreManagerClient cloudFilestoreManagerClient =
        CloudFilestoreManagerClient.create()) {
      ListBackupsRequest request =
          ListBackupsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setOrderBy("orderBy-1207110587")
              .setFilter("filter-1274492040")
              .build();
      ApiFuture<Backup> future =
          cloudFilestoreManagerClient.listBackupsPagedCallable().futureCall(request);
      // Do something.
      for (Backup element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END filestore_v1beta1_generated_cloudfilestoremanagerclient_listbackups_async]