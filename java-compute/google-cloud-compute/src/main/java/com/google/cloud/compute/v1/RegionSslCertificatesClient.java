/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.compute.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.RegionSslCertificatesStub;
import com.google.cloud.compute.v1.stub.RegionSslCertificatesStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The RegionSslCertificates API.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (RegionSslCertificatesClient regionSslCertificatesClient =
 *     RegionSslCertificatesClient.create()) {
 *   String project = "project-309310695";
 *   String region = "region-934795532";
 *   String sslCertificate = "sslCertificate-1304941589";
 *   SslCertificate response = regionSslCertificatesClient.get(project, region, sslCertificate);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the RegionSslCertificatesClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> Delete</td>
 *      <td><p> Deletes the specified SslCertificate resource in the region.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteAsync(DeleteRegionSslCertificateRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteAsync(String project, String region, String sslCertificate)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteOperationCallable()
 *           <li><p> deleteCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Get</td>
 *      <td><p> Returns the specified SslCertificate resource in the specified region. Get a list of available SSL certificates by making a list() request.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> get(GetRegionSslCertificateRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> get(String project, String region, String sslCertificate)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Insert</td>
 *      <td><p> Creates a SslCertificate resource in the specified project and region using the data included in the request</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> insertAsync(InsertRegionSslCertificateRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> insertAsync(String project, String region, SslCertificate sslCertificateResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> insertOperationCallable()
 *           <li><p> insertCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> List</td>
 *      <td><p> Retrieves the list of SslCertificate resources available to the specified project in the specified region.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> list(ListRegionSslCertificatesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> list(String project, String region)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listPagedCallable()
 *           <li><p> listCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of RegionSslCertificatesSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RegionSslCertificatesSettings regionSslCertificatesSettings =
 *     RegionSslCertificatesSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RegionSslCertificatesClient regionSslCertificatesClient =
 *     RegionSslCertificatesClient.create(regionSslCertificatesSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RegionSslCertificatesSettings regionSslCertificatesSettings =
 *     RegionSslCertificatesSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RegionSslCertificatesClient regionSslCertificatesClient =
 *     RegionSslCertificatesClient.create(regionSslCertificatesSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class RegionSslCertificatesClient implements BackgroundResource {
  private final RegionSslCertificatesSettings settings;
  private final RegionSslCertificatesStub stub;

  /** Constructs an instance of RegionSslCertificatesClient with default settings. */
  public static final RegionSslCertificatesClient create() throws IOException {
    return create(RegionSslCertificatesSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RegionSslCertificatesClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final RegionSslCertificatesClient create(RegionSslCertificatesSettings settings)
      throws IOException {
    return new RegionSslCertificatesClient(settings);
  }

  /**
   * Constructs an instance of RegionSslCertificatesClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(RegionSslCertificatesSettings).
   */
  public static final RegionSslCertificatesClient create(RegionSslCertificatesStub stub) {
    return new RegionSslCertificatesClient(stub);
  }

  /**
   * Constructs an instance of RegionSslCertificatesClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected RegionSslCertificatesClient(RegionSslCertificatesSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((RegionSslCertificatesStubSettings) settings.getStubSettings()).createStub();
  }

  protected RegionSslCertificatesClient(RegionSslCertificatesStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RegionSslCertificatesSettings getSettings() {
    return settings;
  }

  public RegionSslCertificatesStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified SslCertificate resource in the region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String sslCertificate = "sslCertificate-1304941589";
   *   Operation response =
   *       regionSslCertificatesClient.deleteAsync(project, region, sslCertificate).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region scoping this request.
   * @param sslCertificate Name of the SslCertificate resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> deleteAsync(
      String project, String region, String sslCertificate) {
    DeleteRegionSslCertificateRequest request =
        DeleteRegionSslCertificateRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setSslCertificate(sslCertificate)
            .build();
    return deleteAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified SslCertificate resource in the region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   DeleteRegionSslCertificateRequest request =
   *       DeleteRegionSslCertificateRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setSslCertificate("sslCertificate-1304941589")
   *           .build();
   *   Operation response = regionSslCertificatesClient.deleteAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> deleteAsync(
      DeleteRegionSslCertificateRequest request) {
    return deleteOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified SslCertificate resource in the region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   DeleteRegionSslCertificateRequest request =
   *       DeleteRegionSslCertificateRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setSslCertificate("sslCertificate-1304941589")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionSslCertificatesClient.deleteOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteRegionSslCertificateRequest, Operation, Operation>
      deleteOperationCallable() {
    return stub.deleteOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified SslCertificate resource in the region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   DeleteRegionSslCertificateRequest request =
   *       DeleteRegionSslCertificateRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setSslCertificate("sslCertificate-1304941589")
   *           .build();
   *   ApiFuture<Operation> future =
   *       regionSslCertificatesClient.deleteCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteRegionSslCertificateRequest, Operation> deleteCallable() {
    return stub.deleteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified SslCertificate resource in the specified region. Get a list of available
   * SSL certificates by making a list() request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String sslCertificate = "sslCertificate-1304941589";
   *   SslCertificate response = regionSslCertificatesClient.get(project, region, sslCertificate);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region scoping this request.
   * @param sslCertificate Name of the SslCertificate resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SslCertificate get(String project, String region, String sslCertificate) {
    GetRegionSslCertificateRequest request =
        GetRegionSslCertificateRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setSslCertificate(sslCertificate)
            .build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified SslCertificate resource in the specified region. Get a list of available
   * SSL certificates by making a list() request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   GetRegionSslCertificateRequest request =
   *       GetRegionSslCertificateRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setSslCertificate("sslCertificate-1304941589")
   *           .build();
   *   SslCertificate response = regionSslCertificatesClient.get(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SslCertificate get(GetRegionSslCertificateRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified SslCertificate resource in the specified region. Get a list of available
   * SSL certificates by making a list() request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   GetRegionSslCertificateRequest request =
   *       GetRegionSslCertificateRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setSslCertificate("sslCertificate-1304941589")
   *           .build();
   *   ApiFuture<SslCertificate> future =
   *       regionSslCertificatesClient.getCallable().futureCall(request);
   *   // Do something.
   *   SslCertificate response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetRegionSslCertificateRequest, SslCertificate> getCallable() {
    return stub.getCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a SslCertificate resource in the specified project and region using the data included
   * in the request
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   SslCertificate sslCertificateResource = SslCertificate.newBuilder().build();
   *   Operation response =
   *       regionSslCertificatesClient.insertAsync(project, region, sslCertificateResource).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region scoping this request.
   * @param sslCertificateResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> insertAsync(
      String project, String region, SslCertificate sslCertificateResource) {
    InsertRegionSslCertificateRequest request =
        InsertRegionSslCertificateRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setSslCertificateResource(sslCertificateResource)
            .build();
    return insertAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a SslCertificate resource in the specified project and region using the data included
   * in the request
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   InsertRegionSslCertificateRequest request =
   *       InsertRegionSslCertificateRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setSslCertificateResource(SslCertificate.newBuilder().build())
   *           .build();
   *   Operation response = regionSslCertificatesClient.insertAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> insertAsync(
      InsertRegionSslCertificateRequest request) {
    return insertOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a SslCertificate resource in the specified project and region using the data included
   * in the request
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   InsertRegionSslCertificateRequest request =
   *       InsertRegionSslCertificateRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setSslCertificateResource(SslCertificate.newBuilder().build())
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionSslCertificatesClient.insertOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<InsertRegionSslCertificateRequest, Operation, Operation>
      insertOperationCallable() {
    return stub.insertOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a SslCertificate resource in the specified project and region using the data included
   * in the request
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   InsertRegionSslCertificateRequest request =
   *       InsertRegionSslCertificateRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setSslCertificateResource(SslCertificate.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       regionSslCertificatesClient.insertCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<InsertRegionSslCertificateRequest, Operation> insertCallable() {
    return stub.insertCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of SslCertificate resources available to the specified project in the
   * specified region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   for (SslCertificate element :
   *       regionSslCertificatesClient.list(project, region).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(String project, String region) {
    ListRegionSslCertificatesRequest request =
        ListRegionSslCertificatesRequest.newBuilder().setProject(project).setRegion(region).build();
    return list(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of SslCertificate resources available to the specified project in the
   * specified region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   ListRegionSslCertificatesRequest request =
   *       ListRegionSslCertificatesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   for (SslCertificate element : regionSslCertificatesClient.list(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(ListRegionSslCertificatesRequest request) {
    return listPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of SslCertificate resources available to the specified project in the
   * specified region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   ListRegionSslCertificatesRequest request =
   *       ListRegionSslCertificatesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   ApiFuture<SslCertificate> future =
   *       regionSslCertificatesClient.listPagedCallable().futureCall(request);
   *   // Do something.
   *   for (SslCertificate element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListRegionSslCertificatesRequest, ListPagedResponse>
      listPagedCallable() {
    return stub.listPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of SslCertificate resources available to the specified project in the
   * specified region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionSslCertificatesClient regionSslCertificatesClient =
   *     RegionSslCertificatesClient.create()) {
   *   ListRegionSslCertificatesRequest request =
   *       ListRegionSslCertificatesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   while (true) {
   *     SslCertificateList response = regionSslCertificatesClient.listCallable().call(request);
   *     for (SslCertificate element : response.getItemsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListRegionSslCertificatesRequest, SslCertificateList> listCallable() {
    return stub.listCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListPagedResponse
      extends AbstractPagedListResponse<
          ListRegionSslCertificatesRequest,
          SslCertificateList,
          SslCertificate,
          ListPage,
          ListFixedSizeCollection> {

    public static ApiFuture<ListPagedResponse> createAsync(
        PageContext<ListRegionSslCertificatesRequest, SslCertificateList, SslCertificate> context,
        ApiFuture<SslCertificateList> futureResponse) {
      ApiFuture<ListPage> futurePage =
          ListPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListPagedResponse(ListPage page) {
      super(page, ListFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListPage
      extends AbstractPage<
          ListRegionSslCertificatesRequest, SslCertificateList, SslCertificate, ListPage> {

    private ListPage(
        PageContext<ListRegionSslCertificatesRequest, SslCertificateList, SslCertificate> context,
        SslCertificateList response) {
      super(context, response);
    }

    private static ListPage createEmptyPage() {
      return new ListPage(null, null);
    }

    @Override
    protected ListPage createPage(
        PageContext<ListRegionSslCertificatesRequest, SslCertificateList, SslCertificate> context,
        SslCertificateList response) {
      return new ListPage(context, response);
    }

    @Override
    public ApiFuture<ListPage> createPageAsync(
        PageContext<ListRegionSslCertificatesRequest, SslCertificateList, SslCertificate> context,
        ApiFuture<SslCertificateList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListRegionSslCertificatesRequest,
          SslCertificateList,
          SslCertificate,
          ListPage,
          ListFixedSizeCollection> {

    private ListFixedSizeCollection(List<ListPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFixedSizeCollection createEmptyCollection() {
      return new ListFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFixedSizeCollection createCollection(List<ListPage> pages, int collectionSize) {
      return new ListFixedSizeCollection(pages, collectionSize);
    }
  }
}
