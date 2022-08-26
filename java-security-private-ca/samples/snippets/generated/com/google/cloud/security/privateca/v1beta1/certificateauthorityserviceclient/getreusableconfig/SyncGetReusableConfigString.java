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

package com.google.cloud.security.privateca.v1beta1.samples;

// [START privateca_v1beta1_generated_certificateauthorityserviceclient_getreusableconfig_string_sync]
import com.google.cloud.security.privateca.v1beta1.CertificateAuthorityServiceClient;
import com.google.cloud.security.privateca.v1beta1.ReusableConfig;
import com.google.cloud.security.privateca.v1beta1.ReusableConfigName;

public class SyncGetReusableConfigString {

  public static void main(String[] args) throws Exception {
    syncGetReusableConfigString();
  }

  public static void syncGetReusableConfigString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CertificateAuthorityServiceClient certificateAuthorityServiceClient =
        CertificateAuthorityServiceClient.create()) {
      String name =
          ReusableConfigName.of("[PROJECT]", "[LOCATION]", "[REUSABLE_CONFIG]").toString();
      ReusableConfig response = certificateAuthorityServiceClient.getReusableConfig(name);
    }
  }
}
// [END privateca_v1beta1_generated_certificateauthorityserviceclient_getreusableconfig_string_sync]