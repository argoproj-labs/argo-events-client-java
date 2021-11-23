/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.5.0
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
import io.argoproj.events.models.sensor.FileArtifact;
import io.argoproj.events.models.sensor.GitArtifact;
import io.argoproj.events.models.sensor.URLArtifact;
import io.kubernetes.client.openapi.models.V1ConfigMapKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ArtifactLocation describes the source location for an external artifact
 */
@ApiModel(description = "ArtifactLocation describes the source location for an external artifact")

public class ArtifactLocation {
  public static final String SERIALIZED_NAME_CONFIGMAP = "configmap";
  @SerializedName(SERIALIZED_NAME_CONFIGMAP)
  private V1ConfigMapKeySelector configmap = null;

  public static final String SERIALIZED_NAME_GIT = "git";
  @SerializedName(SERIALIZED_NAME_GIT)
  private GitArtifact git;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private java.lang.Object resource = null;

  public static final String SERIALIZED_NAME_S3 = "s3";
  @SerializedName(SERIALIZED_NAME_S3)
  private io.argoproj.events.models.common.S3Artifact s3 = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URLArtifact url;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private FileArtifact file;

  public static final String SERIALIZED_NAME_INLINE = "inline";
  @SerializedName(SERIALIZED_NAME_INLINE)
  private String inline;


  public ArtifactLocation configmap(V1ConfigMapKeySelector configmap) {
    
    this.configmap = configmap;
    return this;
  }

   /**
   * Get configmap
   * @return configmap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ConfigMapKeySelector getConfigmap() {
    return configmap;
  }


  public void setConfigmap(V1ConfigMapKeySelector configmap) {
    this.configmap = configmap;
  }


  public ArtifactLocation git(GitArtifact git) {
    
    this.git = git;
    return this;
  }

   /**
   * Get git
   * @return git
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GitArtifact getGit() {
    return git;
  }


  public void setGit(GitArtifact git) {
    this.git = git;
  }


  public ArtifactLocation resource(java.lang.Object resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.lang.Object getResource() {
    return resource;
  }


  public void setResource(java.lang.Object resource) {
    this.resource = resource;
  }


  public ArtifactLocation s3(io.argoproj.events.models.common.S3Artifact s3) {
    
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.argoproj.events.models.common.S3Artifact getS3() {
    return s3;
  }


  public void setS3(io.argoproj.events.models.common.S3Artifact s3) {
    this.s3 = s3;
  }


  public ArtifactLocation url(URLArtifact url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URLArtifact getUrl() {
    return url;
  }


  public void setUrl(URLArtifact url) {
    this.url = url;
  }


  public ArtifactLocation file(FileArtifact file) {
    
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileArtifact getFile() {
    return file;
  }


  public void setFile(FileArtifact file) {
    this.file = file;
  }


  public ArtifactLocation inline(String inline) {
    
    this.inline = inline;
    return this;
  }

   /**
   * Inline artifact is embedded in sensor spec as a string
   * @return inline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Inline artifact is embedded in sensor spec as a string")

  public String getInline() {
    return inline;
  }


  public void setInline(String inline) {
    this.inline = inline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactLocation artifactLocation = (ArtifactLocation) o;
    return Objects.equals(this.configmap, artifactLocation.configmap) &&
        Objects.equals(this.git, artifactLocation.git) &&
        Objects.equals(this.resource, artifactLocation.resource) &&
        Objects.equals(this.s3, artifactLocation.s3) &&
        Objects.equals(this.url, artifactLocation.url) &&
        Objects.equals(this.file, artifactLocation.file) &&
        Objects.equals(this.inline, artifactLocation.inline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configmap, git, resource, s3, url, file, inline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactLocation {\n");
    sb.append("    configmap: ").append(toIndentedString(configmap)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    inline: ").append(toIndentedString(inline)).append("\n");
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

