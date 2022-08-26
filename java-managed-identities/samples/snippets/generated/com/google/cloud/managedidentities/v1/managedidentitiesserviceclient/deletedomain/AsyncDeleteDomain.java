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

package com.google.cloud.managedidentities.v1.samples;

// [START managedidentities_v1_generated_managedidentitiesserviceclient_deletedomain_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.managedidentities.v1.DeleteDomainRequest;
import com.google.cloud.managedidentities.v1.DomainName;
import com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceClient;
import com.google.longrunning.Operation;

public class AsyncDeleteDomain {

  public static void main(String[] args) throws Exception {
    asyncDeleteDomain();
  }

  public static void asyncDeleteDomain() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ManagedIdentitiesServiceClient managedIdentitiesServiceClient =
        ManagedIdentitiesServiceClient.create()) {
      DeleteDomainRequest request =
          DeleteDomainRequest.newBuilder()
              .setName(DomainName.of("[PROJECT]", "[LOCATION]", "[DOMAIN]").toString())
              .build();
      ApiFuture<Operation> future =
          managedIdentitiesServiceClient.deleteDomainCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END managedidentities_v1_generated_managedidentitiesserviceclient_deletedomain_async]