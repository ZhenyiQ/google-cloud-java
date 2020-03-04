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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/** The available logging options for the load balancer traffic served by this backend service. */
public final class BackendServiceLogConfig implements ApiMessage {
  private final Boolean enable;
  private final Float sampleRate;

  private BackendServiceLogConfig() {
    this.enable = null;
    this.sampleRate = null;
  }

  private BackendServiceLogConfig(Boolean enable, Float sampleRate) {
    this.enable = enable;
    this.sampleRate = sampleRate;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("enable".equals(fieldName)) {
      return enable;
    }
    if ("sampleRate".equals(fieldName)) {
      return sampleRate;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return null;
  }

  /**
   * This field denotes whether to enable logging for the load balancer traffic served by this
   * backend service.
   */
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This field can only be specified if logging is enabled for this backend service. The value of
   * the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer
   * where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported.
   * The default value is 1.0.
   */
  public Float getSampleRate() {
    return sampleRate;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(BackendServiceLogConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static BackendServiceLogConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final BackendServiceLogConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new BackendServiceLogConfig();
  }

  public static class Builder {
    private Boolean enable;
    private Float sampleRate;

    Builder() {}

    public Builder mergeFrom(BackendServiceLogConfig other) {
      if (other == BackendServiceLogConfig.getDefaultInstance()) return this;
      if (other.getEnable() != null) {
        this.enable = other.enable;
      }
      if (other.getSampleRate() != null) {
        this.sampleRate = other.sampleRate;
      }
      return this;
    }

    Builder(BackendServiceLogConfig source) {
      this.enable = source.enable;
      this.sampleRate = source.sampleRate;
    }

    /**
     * This field denotes whether to enable logging for the load balancer traffic served by this
     * backend service.
     */
    public Boolean getEnable() {
      return enable;
    }

    /**
     * This field denotes whether to enable logging for the load balancer traffic served by this
     * backend service.
     */
    public Builder setEnable(Boolean enable) {
      this.enable = enable;
      return this;
    }

    /**
     * This field can only be specified if logging is enabled for this backend service. The value of
     * the field must be in [0, 1]. This configures the sampling rate of requests to the load
     * balancer where 1.0 means all logged requests are reported and 0.0 means no logged requests
     * are reported. The default value is 1.0.
     */
    public Float getSampleRate() {
      return sampleRate;
    }

    /**
     * This field can only be specified if logging is enabled for this backend service. The value of
     * the field must be in [0, 1]. This configures the sampling rate of requests to the load
     * balancer where 1.0 means all logged requests are reported and 0.0 means no logged requests
     * are reported. The default value is 1.0.
     */
    public Builder setSampleRate(Float sampleRate) {
      this.sampleRate = sampleRate;
      return this;
    }

    public BackendServiceLogConfig build() {

      return new BackendServiceLogConfig(enable, sampleRate);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setEnable(this.enable);
      newBuilder.setSampleRate(this.sampleRate);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "BackendServiceLogConfig{"
        + "enable="
        + enable
        + ", "
        + "sampleRate="
        + sampleRate
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BackendServiceLogConfig) {
      BackendServiceLogConfig that = (BackendServiceLogConfig) o;
      return Objects.equals(this.enable, that.getEnable())
          && Objects.equals(this.sampleRate, that.getSampleRate());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, sampleRate);
  }
}
