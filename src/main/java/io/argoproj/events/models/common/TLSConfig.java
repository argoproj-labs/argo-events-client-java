/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.events.models.common;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TLSConfig refers to TLS configuration for a client.
 */
@ApiModel(description = "TLSConfig refers to TLS configuration for a client.")

public class TLSConfig {
  public static final String SERIALIZED_NAME_CA_CERT_SECRET = "caCertSecret";
  @SerializedName(SERIALIZED_NAME_CA_CERT_SECRET)
  private V1SecretKeySelector caCertSecret = null;

  public static final String SERIALIZED_NAME_CLIENT_CERT_SECRET = "clientCertSecret";
  @SerializedName(SERIALIZED_NAME_CLIENT_CERT_SECRET)
  private V1SecretKeySelector clientCertSecret = null;

  public static final String SERIALIZED_NAME_CLIENT_KEY_SECRET = "clientKeySecret";
  @SerializedName(SERIALIZED_NAME_CLIENT_KEY_SECRET)
  private V1SecretKeySelector clientKeySecret = null;


  public TLSConfig caCertSecret(V1SecretKeySelector caCertSecret) {
    
    this.caCertSecret = caCertSecret;
    return this;
  }

   /**
   * Get caCertSecret
   * @return caCertSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getCaCertSecret() {
    return caCertSecret;
  }


  public void setCaCertSecret(V1SecretKeySelector caCertSecret) {
    this.caCertSecret = caCertSecret;
  }


  public TLSConfig clientCertSecret(V1SecretKeySelector clientCertSecret) {
    
    this.clientCertSecret = clientCertSecret;
    return this;
  }

   /**
   * Get clientCertSecret
   * @return clientCertSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getClientCertSecret() {
    return clientCertSecret;
  }


  public void setClientCertSecret(V1SecretKeySelector clientCertSecret) {
    this.clientCertSecret = clientCertSecret;
  }


  public TLSConfig clientKeySecret(V1SecretKeySelector clientKeySecret) {
    
    this.clientKeySecret = clientKeySecret;
    return this;
  }

   /**
   * Get clientKeySecret
   * @return clientKeySecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getClientKeySecret() {
    return clientKeySecret;
  }


  public void setClientKeySecret(V1SecretKeySelector clientKeySecret) {
    this.clientKeySecret = clientKeySecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TLSConfig tlSConfig = (TLSConfig) o;
    return Objects.equals(this.caCertSecret, tlSConfig.caCertSecret) &&
        Objects.equals(this.clientCertSecret, tlSConfig.clientCertSecret) &&
        Objects.equals(this.clientKeySecret, tlSConfig.clientKeySecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caCertSecret, clientCertSecret, clientKeySecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TLSConfig {\n");
    sb.append("    caCertSecret: ").append(toIndentedString(caCertSecret)).append("\n");
    sb.append("    clientCertSecret: ").append(toIndentedString(clientCertSecret)).append("\n");
    sb.append("    clientKeySecret: ").append(toIndentedString(clientKeySecret)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

