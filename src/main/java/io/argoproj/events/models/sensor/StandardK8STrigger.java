/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.3.0
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
import io.argoproj.events.models.sensor.ArtifactLocation;
import io.argoproj.events.models.sensor.TriggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StandardK8STrigger is the standard Kubernetes resource trigger
 */
@ApiModel(description = "StandardK8STrigger is the standard Kubernetes resource trigger")

public class StandardK8STrigger {
  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_LIVE_OBJECT = "liveObject";
  @SerializedName(SERIALIZED_NAME_LIVE_OBJECT)
  private Boolean liveObject;

  public static final String SERIALIZED_NAME_PATCH_STRATEGY = "patchStrategy";
  @SerializedName(SERIALIZED_NAME_PATCH_STRATEGY)
  private String patchStrategy;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private ArtifactLocation source;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;


  public StandardK8STrigger resource(String resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @ApiModelProperty(required = true, value = "")

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  public StandardK8STrigger parameters(List<TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public StandardK8STrigger addParametersItem(TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TriggerParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<TriggerParameter> parameters) {
    this.parameters = parameters;
  }


  public StandardK8STrigger liveObject(Boolean liveObject) {
    
    this.liveObject = liveObject;
    return this;
  }

   /**
   * LiveObject specifies whether the resource should be directly fetched from K8s instead of being marshaled from the resource artifact. If set to true, the resource artifact must contain the information required to uniquely identify the resource in the cluster, that is, you must specify \&quot;apiVersion\&quot;, \&quot;kind\&quot; as well as \&quot;name\&quot; and \&quot;namespace\&quot; meta data. Only valid for operation type &#x60;update&#x60;
   * @return liveObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LiveObject specifies whether the resource should be directly fetched from K8s instead of being marshaled from the resource artifact. If set to true, the resource artifact must contain the information required to uniquely identify the resource in the cluster, that is, you must specify \"apiVersion\", \"kind\" as well as \"name\" and \"namespace\" meta data. Only valid for operation type `update`")

  public Boolean getLiveObject() {
    return liveObject;
  }


  public void setLiveObject(Boolean liveObject) {
    this.liveObject = liveObject;
  }


  public StandardK8STrigger patchStrategy(String patchStrategy) {
    
    this.patchStrategy = patchStrategy;
    return this;
  }

   /**
   * PatchStrategy controls the K8s object patching strategy when the trigger operation is specified as patch. possible values: \&quot;application/json-patch+json\&quot; \&quot;application/merge-patch+json\&quot; \&quot;application/strategic-merge-patch+json\&quot; \&quot;application/apply-patch+yaml\&quot;. Defaults to \&quot;application/merge-patch+json\&quot;
   * @return patchStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PatchStrategy controls the K8s object patching strategy when the trigger operation is specified as patch. possible values: \"application/json-patch+json\" \"application/merge-patch+json\" \"application/strategic-merge-patch+json\" \"application/apply-patch+yaml\". Defaults to \"application/merge-patch+json\"")

  public String getPatchStrategy() {
    return patchStrategy;
  }


  public void setPatchStrategy(String patchStrategy) {
    this.patchStrategy = patchStrategy;
  }


  public StandardK8STrigger source(ArtifactLocation source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArtifactLocation getSource() {
    return source;
  }


  public void setSource(ArtifactLocation source) {
    this.source = source;
  }


  public StandardK8STrigger version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public StandardK8STrigger group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(required = true, value = "")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public StandardK8STrigger operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Operation refers to the type of operation performed on the k8s resource. Default value is Create.
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operation refers to the type of operation performed on the k8s resource. Default value is Create.")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardK8STrigger standardK8STrigger = (StandardK8STrigger) o;
    return Objects.equals(this.resource, standardK8STrigger.resource) &&
        Objects.equals(this.parameters, standardK8STrigger.parameters) &&
        Objects.equals(this.liveObject, standardK8STrigger.liveObject) &&
        Objects.equals(this.patchStrategy, standardK8STrigger.patchStrategy) &&
        Objects.equals(this.source, standardK8STrigger.source) &&
        Objects.equals(this.version, standardK8STrigger.version) &&
        Objects.equals(this.group, standardK8STrigger.group) &&
        Objects.equals(this.operation, standardK8STrigger.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, parameters, liveObject, patchStrategy, source, version, group, operation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardK8STrigger {\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    liveObject: ").append(toIndentedString(liveObject)).append("\n");
    sb.append("    patchStrategy: ").append(toIndentedString(patchStrategy)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

