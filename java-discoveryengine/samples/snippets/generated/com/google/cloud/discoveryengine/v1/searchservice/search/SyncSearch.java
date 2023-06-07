/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.discoveryengine.v1.samples;

// [START discoveryengine_v1_generated_SearchService_Search_sync]
import com.google.cloud.discoveryengine.v1.BranchName;
import com.google.cloud.discoveryengine.v1.SearchRequest;
import com.google.cloud.discoveryengine.v1.SearchResponse;
import com.google.cloud.discoveryengine.v1.SearchServiceClient;
import com.google.cloud.discoveryengine.v1.ServingConfigName;
import com.google.cloud.discoveryengine.v1.UserInfo;
import com.google.protobuf.Value;
import java.util.HashMap;

public class SyncSearch {

  public static void main(String[] args) throws Exception {
    syncSearch();
  }

  public static void syncSearch() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SearchServiceClient searchServiceClient = SearchServiceClient.create()) {
      SearchRequest request =
          SearchRequest.newBuilder()
              .setServingConfig(
                  ServingConfigName.ofProjectLocationDataStoreServingConfigName(
                          "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[SERVING_CONFIG]")
                      .toString())
              .setBranch(
                  BranchName.ofProjectLocationDataStoreBranchName(
                          "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[BRANCH]")
                      .toString())
              .setQuery("query107944136")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setOffset(-1019779949)
              .setUserInfo(UserInfo.newBuilder().build())
              .putAllParams(new HashMap<String, Value>())
              .setQueryExpansionSpec(SearchRequest.QueryExpansionSpec.newBuilder().build())
              .setSpellCorrectionSpec(SearchRequest.SpellCorrectionSpec.newBuilder().build())
              .setUserPseudoId("userPseudoId-1155274652")
              .setContentSearchSpec(SearchRequest.ContentSearchSpec.newBuilder().build())
              .setSafeSearch(true)
              .putAllUserLabels(new HashMap<String, String>())
              .build();
      for (SearchResponse.SearchResult element : searchServiceClient.search(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END discoveryengine_v1_generated_SearchService_Search_sync]
