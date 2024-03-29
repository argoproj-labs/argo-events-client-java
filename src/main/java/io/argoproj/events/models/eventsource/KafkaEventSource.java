/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.6.3
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
import io.argoproj.events.models.eventsource.EventSourceFilter;
import io.argoproj.events.models.eventsource.KafkaConsumerGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * KafkaEventSource refers to event-source for Kafka related events
 */
@ApiModel(description = "KafkaEventSource refers to event-source for Kafka related events")

public class KafkaEventSource {
  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private io.argoproj.events.models.common.TLSConfig tls = null;

  public static final String SERIALIZED_NAME_CONNECTION_BACKOFF = "connectionBackoff";
  @SerializedName(SERIALIZED_NAME_CONNECTION_BACKOFF)
  private io.argoproj.events.models.common.Backoff connectionBackoff = null;

  public static final String SERIALIZED_NAME_CONSUMER_GROUP = "consumerGroup";
  @SerializedName(SERIALIZED_NAME_CONSUMER_GROUP)
  private KafkaConsumerGroup consumerGroup;

  public static final String SERIALIZED_NAME_JSON_BODY = "jsonBody";
  @SerializedName(SERIALIZED_NAME_JSON_BODY)
  private Boolean jsonBody;

  public static final String SERIALIZED_NAME_PARTITION = "partition";
  @SerializedName(SERIALIZED_NAME_PARTITION)
  private String partition;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private EventSourceFilter filter;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_SASL = "sasl";
  @SerializedName(SERIALIZED_NAME_SASL)
  private io.argoproj.events.models.common.SASLConfig sasl = null;

  public static final String SERIALIZED_NAME_LIMIT_EVENTS_PER_SECOND = "limitEventsPerSecond";
  @SerializedName(SERIALIZED_NAME_LIMIT_EVENTS_PER_SECOND)
  private Long limitEventsPerSecond;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public KafkaEventSource tls(io.argoproj.events.models.common.TLSConfig tls) {
    
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


  public KafkaEventSource connectionBackoff(io.argoproj.events.models.common.Backoff connectionBackoff) {
    
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


  public KafkaEventSource consumerGroup(KafkaConsumerGroup consumerGroup) {
    
    this.consumerGroup = consumerGroup;
    return this;
  }

   /**
   * Get consumerGroup
   * @return consumerGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KafkaConsumerGroup getConsumerGroup() {
    return consumerGroup;
  }


  public void setConsumerGroup(KafkaConsumerGroup consumerGroup) {
    this.consumerGroup = consumerGroup;
  }


  public KafkaEventSource jsonBody(Boolean jsonBody) {
    
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


  public KafkaEventSource partition(String partition) {
    
    this.partition = partition;
    return this;
  }

   /**
   * Partition name
   * @return partition
  **/
  @ApiModelProperty(required = true, value = "Partition name")

  public String getPartition() {
    return partition;
  }


  public void setPartition(String partition) {
    this.partition = partition;
  }


  public KafkaEventSource filter(EventSourceFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventSourceFilter getFilter() {
    return filter;
  }


  public void setFilter(EventSourceFilter filter) {
    this.filter = filter;
  }


  public KafkaEventSource url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL to kafka cluster, multiple URLs separated by comma
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL to kafka cluster, multiple URLs separated by comma")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public KafkaEventSource topic(String topic) {
    
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


  public KafkaEventSource version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Specify what kafka version is being connected to enables certain features in sarama, defaults to 1.0.0
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify what kafka version is being connected to enables certain features in sarama, defaults to 1.0.0")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public KafkaEventSource sasl(io.argoproj.events.models.common.SASLConfig sasl) {
    
    this.sasl = sasl;
    return this;
  }

   /**
   * Get sasl
   * @return sasl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.argoproj.events.models.common.SASLConfig getSasl() {
    return sasl;
  }


  public void setSasl(io.argoproj.events.models.common.SASLConfig sasl) {
    this.sasl = sasl;
  }


  public KafkaEventSource limitEventsPerSecond(Long limitEventsPerSecond) {
    
    this.limitEventsPerSecond = limitEventsPerSecond;
    return this;
  }

   /**
   * Sets a limit on how many events get read from kafka per second.
   * @return limitEventsPerSecond
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets a limit on how many events get read from kafka per second.")

  public Long getLimitEventsPerSecond() {
    return limitEventsPerSecond;
  }


  public void setLimitEventsPerSecond(Long limitEventsPerSecond) {
    this.limitEventsPerSecond = limitEventsPerSecond;
  }


  public KafkaEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public KafkaEventSource putMetadataItem(String key, String metadataItem) {
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
    KafkaEventSource kafkaEventSource = (KafkaEventSource) o;
    return Objects.equals(this.tls, kafkaEventSource.tls) &&
        Objects.equals(this.connectionBackoff, kafkaEventSource.connectionBackoff) &&
        Objects.equals(this.consumerGroup, kafkaEventSource.consumerGroup) &&
        Objects.equals(this.jsonBody, kafkaEventSource.jsonBody) &&
        Objects.equals(this.partition, kafkaEventSource.partition) &&
        Objects.equals(this.filter, kafkaEventSource.filter) &&
        Objects.equals(this.url, kafkaEventSource.url) &&
        Objects.equals(this.topic, kafkaEventSource.topic) &&
        Objects.equals(this.version, kafkaEventSource.version) &&
        Objects.equals(this.sasl, kafkaEventSource.sasl) &&
        Objects.equals(this.limitEventsPerSecond, kafkaEventSource.limitEventsPerSecond) &&
        Objects.equals(this.metadata, kafkaEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tls, connectionBackoff, consumerGroup, jsonBody, partition, filter, url, topic, version, sasl, limitEventsPerSecond, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaEventSource {\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
    sb.append("    consumerGroup: ").append(toIndentedString(consumerGroup)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    sasl: ").append(toIndentedString(sasl)).append("\n");
    sb.append("    limitEventsPerSecond: ").append(toIndentedString(limitEventsPerSecond)).append("\n");
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

