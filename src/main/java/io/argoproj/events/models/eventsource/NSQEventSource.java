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
 * NSQEventSource describes the event source for NSQ PubSub More info at https://godoc.org/github.com/nsqio/go-nsq
 */
@ApiModel(description = "NSQEventSource describes the event source for NSQ PubSub More info at https://godoc.org/github.com/nsqio/go-nsq")

public class NSQEventSource {
  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private io.argoproj.events.models.common.TLSConfig tls = null;

  public static final String SERIALIZED_NAME_CONNECTION_BACKOFF = "connectionBackoff";
  @SerializedName(SERIALIZED_NAME_CONNECTION_BACKOFF)
  private io.argoproj.events.models.common.Backoff connectionBackoff = null;

  public static final String SERIALIZED_NAME_JSON_BODY = "jsonBody";
  @SerializedName(SERIALIZED_NAME_JSON_BODY)
  private Boolean jsonBody;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_HOST_ADDRESS = "hostAddress";
  @SerializedName(SERIALIZED_NAME_HOST_ADDRESS)
  private String hostAddress;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public NSQEventSource tls(io.argoproj.events.models.common.TLSConfig tls) {
    
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


  public NSQEventSource connectionBackoff(io.argoproj.events.models.common.Backoff connectionBackoff) {
    
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


  public NSQEventSource jsonBody(Boolean jsonBody) {
    
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


  public NSQEventSource topic(String topic) {
    
    this.topic = topic;
    return this;
  }

   /**
   * Topic to subscribe to.
   * @return topic
  **/
  @ApiModelProperty(required = true, value = "Topic to subscribe to.")

  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    this.topic = topic;
  }


  public NSQEventSource hostAddress(String hostAddress) {
    
    this.hostAddress = hostAddress;
    return this;
  }

   /**
   * HostAddress is the address of the host for NSQ lookup
   * @return hostAddress
  **/
  @ApiModelProperty(required = true, value = "HostAddress is the address of the host for NSQ lookup")

  public String getHostAddress() {
    return hostAddress;
  }


  public void setHostAddress(String hostAddress) {
    this.hostAddress = hostAddress;
  }


  public NSQEventSource channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Channel used for subscription
   * @return channel
  **/
  @ApiModelProperty(required = true, value = "Channel used for subscription")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public NSQEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public NSQEventSource putMetadataItem(String key, String metadataItem) {
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
    NSQEventSource nsQEventSource = (NSQEventSource) o;
    return Objects.equals(this.tls, nsQEventSource.tls) &&
        Objects.equals(this.connectionBackoff, nsQEventSource.connectionBackoff) &&
        Objects.equals(this.jsonBody, nsQEventSource.jsonBody) &&
        Objects.equals(this.topic, nsQEventSource.topic) &&
        Objects.equals(this.hostAddress, nsQEventSource.hostAddress) &&
        Objects.equals(this.channel, nsQEventSource.channel) &&
        Objects.equals(this.metadata, nsQEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tls, connectionBackoff, jsonBody, topic, hostAddress, channel, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NSQEventSource {\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

