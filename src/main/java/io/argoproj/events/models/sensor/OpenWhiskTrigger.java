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


package io.argoproj.events.models.sensor;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.events.models.sensor.TriggerParameter;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
 */
@ApiModel(description = "OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.")

public class OpenWhiskTrigger {
  public static final String SERIALIZED_NAME_AUTH_TOKEN = "authToken";
  @SerializedName(SERIALIZED_NAME_AUTH_TOKEN)
  private V1SecretKeySelector authToken = null;

  public static final String SERIALIZED_NAME_ACTION_NAME = "actionName";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME)
  private String actionName;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private List<TriggerParameter> payload = new ArrayList<TriggerParameter>();


  public OpenWhiskTrigger authToken(V1SecretKeySelector authToken) {
    
    this.authToken = authToken;
    return this;
  }

   /**
   * Get authToken
   * @return authToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getAuthToken() {
    return authToken;
  }


  public void setAuthToken(V1SecretKeySelector authToken) {
    this.authToken = authToken;
  }


  public OpenWhiskTrigger actionName(String actionName) {
    
    this.actionName = actionName;
    return this;
  }

   /**
   * Name of the action/function.
   * @return actionName
  **/
  @ApiModelProperty(required = true, value = "Name of the action/function.")

  public String getActionName() {
    return actionName;
  }


  public void setActionName(String actionName) {
    this.actionName = actionName;
  }


  public OpenWhiskTrigger parameters(List<TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public OpenWhiskTrigger addParametersItem(TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameters is the list of key-value extracted from event&#39;s payload that are applied to the trigger resource.
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameters is the list of key-value extracted from event's payload that are applied to the trigger resource.")

  public List<TriggerParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<TriggerParameter> parameters) {
    this.parameters = parameters;
  }


  public OpenWhiskTrigger namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace for the action. Defaults to \&quot;_\&quot;.
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Namespace for the action. Defaults to \"_\".")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public OpenWhiskTrigger host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Host URL of the OpenWhisk.
   * @return host
  **/
  @ApiModelProperty(required = true, value = "Host URL of the OpenWhisk.")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public OpenWhiskTrigger version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version for the API. Defaults to v1.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version for the API. Defaults to v1.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public OpenWhiskTrigger payload(List<TriggerParameter> payload) {
    
    this.payload = payload;
    return this;
  }

  public OpenWhiskTrigger addPayloadItem(TriggerParameter payloadItem) {
    this.payload.add(payloadItem);
    return this;
  }

   /**
   * Payload is the list of key-value extracted from an event payload to construct the request payload.
   * @return payload
  **/
  @ApiModelProperty(required = true, value = "Payload is the list of key-value extracted from an event payload to construct the request payload.")

  public List<TriggerParameter> getPayload() {
    return payload;
  }


  public void setPayload(List<TriggerParameter> payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenWhiskTrigger openWhiskTrigger = (OpenWhiskTrigger) o;
    return Objects.equals(this.authToken, openWhiskTrigger.authToken) &&
        Objects.equals(this.actionName, openWhiskTrigger.actionName) &&
        Objects.equals(this.parameters, openWhiskTrigger.parameters) &&
        Objects.equals(this.namespace, openWhiskTrigger.namespace) &&
        Objects.equals(this.host, openWhiskTrigger.host) &&
        Objects.equals(this.version, openWhiskTrigger.version) &&
        Objects.equals(this.payload, openWhiskTrigger.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authToken, actionName, parameters, namespace, host, version, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenWhiskTrigger {\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

