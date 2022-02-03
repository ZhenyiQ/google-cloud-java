/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/image.proto

/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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

package io.grafeas.v1;

public interface ImageNoteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.ImageNote)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Immutable. The resource_url for the resource representing the
   * basis of associated occurrence images.
   * </pre>
   *
   * <code>string resource_url = 1;</code>
   *
   * @return The resourceUrl.
   */
  java.lang.String getResourceUrl();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The resource_url for the resource representing the
   * basis of associated occurrence images.
   * </pre>
   *
   * <code>string resource_url = 1;</code>
   *
   * @return The bytes for resourceUrl.
   */
  com.google.protobuf.ByteString getResourceUrlBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The fingerprint of the base image.
   * </pre>
   *
   * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The fingerprint of the base image.
   * </pre>
   *
   * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
   *
   * @return The fingerprint.
   */
  io.grafeas.v1.Fingerprint getFingerprint();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The fingerprint of the base image.
   * </pre>
   *
   * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
   */
  io.grafeas.v1.FingerprintOrBuilder getFingerprintOrBuilder();
}
