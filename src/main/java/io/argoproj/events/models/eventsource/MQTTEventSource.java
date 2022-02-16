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


package io.argoproj.events.models.eventsource;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MQTTEventSource refers to event-source for MQTT related events
 */
@ApiModel(description = "MQTTEventSource refers to event-source for MQTT related events")

public class MQTTEventSource {
  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private io.argoproj.events.models.common.TLSConfig tls = null;

  public static final String SERIALIZED_NAME_CONNECTION_BACKOFF = "connectionBackoff";
  @SerializedName(SERIALIZED_NAME_CONNECTION_BACKOFF)
  private io.argoproj.events.models.common.Backoff connectionBackoff = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_JSON_BODY = "jsonBody";
  @SerializedName(SERIALIZED_NAME_JSON_BODY)
  private Boolean jsonBody;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public MQTTEventSource tls(io.argoproj.events.models.common.TLSConfig tls) {
    
    this.tls = tls;
    return this;
  }

   /**
   * Get tls
   * @return tls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.argoproj.events.models.common.TLSConfig getTls() {
    return tls;
  }


  public void setTls(io.argoproj.events.models.common.TLSConfig tls) {
    this.tls = tls;
  }


  public MQTTEventSource connectionBackoff(io.argoproj.events.models.common.Backoff connectionBackoff) {
    
    this.connectionBackoff = connectionBackoff;
    return this;
  }

   /**
   * Get connectionBackoff
   * @return connectionBackoff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.argoproj.events.models.common.Backoff getConnectionBackoff() {
    return connectionBackoff;
  }


  public void setConnectionBackoff(io.argoproj.events.models.common.Backoff connectionBackoff) {
    this.connectionBackoff = connectionBackoff;
  }


  public MQTTEventSource url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL to connect to broker
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL to connect to broker")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public MQTTEventSource jsonBody(Boolean jsonBody) {
    
    this.jsonBody = jsonBody;
    return this;
  }

   /**
   * JSONBody specifies that all event body payload coming from this source will be JSON
   * @return jsonBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JSONBody specifies that all event body payload coming from this source will be JSON")

  public Boolean getJsonBody() {
    return jsonBody;
  }


  public void setJsonBody(Boolean jsonBody) {
    this.jsonBody = jsonBody;
  }


  public MQTTEventSource clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * ClientID is the id of the client
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "ClientID is the id of the client")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public MQTTEventSource topic(String topic) {
    
    this.topic = topic;
    return this;
  }

   /**
   * Topic name
   * @return topic
  **/
  @ApiModelProperty(required = true, value = "Topic name")

  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    this.topic = topic;
  }


  public MQTTEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public MQTTEventSource putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata holds the user defined metadata which will passed along the event payload.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata holds the user defined metadata which will passed along the event payload.")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MQTTEventSource mqTTEventSource = (MQTTEventSource) o;
    return Objects.equals(this.tls, mqTTEventSource.tls) &&
        Objects.equals(this.connectionBackoff, mqTTEventSource.connectionBackoff) &&
        Objects.equals(this.url, mqTTEventSource.url) &&
        Objects.equals(this.jsonBody, mqTTEventSource.jsonBody) &&
        Objects.equals(this.clientId, mqTTEventSource.clientId) &&
        Objects.equals(this.topic, mqTTEventSource.topic) &&
        Objects.equals(this.metadata, mqTTEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tls, connectionBackoff, url, jsonBody, clientId, topic, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MQTTEventSource {\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

