/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.events.models.sensor;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * URLArtifact contains information about an artifact at an http endpoint.
 */
@ApiModel(description = "URLArtifact contains information about an artifact at an http endpoint.")

public class URLArtifact {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_VERIFY_CERT = "verifyCert";
  @SerializedName(SERIALIZED_NAME_VERIFY_CERT)
  private Boolean verifyCert;


  public URLArtifact path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path is the complete URL
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Path is the complete URL")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public URLArtifact verifyCert(Boolean verifyCert) {
    
    this.verifyCert = verifyCert;
    return this;
  }

   /**
   * VerifyCert decides whether the connection is secure or not
   * @return verifyCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VerifyCert decides whether the connection is secure or not")

  public Boolean getVerifyCert() {
    return verifyCert;
  }


  public void setVerifyCert(Boolean verifyCert) {
    this.verifyCert = verifyCert;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    URLArtifact urLArtifact = (URLArtifact) o;
    return Objects.equals(this.path, urLArtifact.path) &&
        Objects.equals(this.verifyCert, urLArtifact.verifyCert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, verifyCert);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class URLArtifact {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    verifyCert: ").append(toIndentedString(verifyCert)).append("\n");
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

