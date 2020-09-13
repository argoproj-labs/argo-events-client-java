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
import io.argoproj.events.models.sensor.TriggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * KafkaTrigger refers to the specification of the Kafka trigger.
 */
@ApiModel(description = "KafkaTrigger refers to the specification of the Kafka trigger.")

public class KafkaTrigger {
  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private io.argoproj.events.models.common.TLSConfig tls = null;

  public static final String SERIALIZED_NAME_PARTITIONING_KEY = "partitioningKey";
  @SerializedName(SERIALIZED_NAME_PARTITIONING_KEY)
  private String partitioningKey;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_PARTITION = "partition";
  @SerializedName(SERIALIZED_NAME_PARTITION)
  private Integer partition;

  public static final String SERIALIZED_NAME_COMPRESS = "compress";
  @SerializedName(SERIALIZED_NAME_COMPRESS)
  private Boolean compress;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_REQUIRED_ACKS = "requiredAcks";
  @SerializedName(SERIALIZED_NAME_REQUIRED_ACKS)
  private Integer requiredAcks;

  public static final String SERIALIZED_NAME_FLUSH_FREQUENCY = "flushFrequency";
  @SerializedName(SERIALIZED_NAME_FLUSH_FREQUENCY)
  private Integer flushFrequency;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private List<TriggerParameter> payload = new ArrayList<TriggerParameter>();


  public KafkaTrigger tls(io.argoproj.events.models.common.TLSConfig tls) {
    
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


  public KafkaTrigger partitioningKey(String partitioningKey) {
    
    this.partitioningKey = partitioningKey;
    return this;
  }

   /**
   * The partitioning key for the messages put on the Kafka topic. Defaults to broker url.
   * @return partitioningKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The partitioning key for the messages put on the Kafka topic. Defaults to broker url.")

  public String getPartitioningKey() {
    return partitioningKey;
  }


  public void setPartitioningKey(String partitioningKey) {
    this.partitioningKey = partitioningKey;
  }


  public KafkaTrigger parameters(List<TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public KafkaTrigger addParametersItem(TriggerParameter parametersItem) {
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


  public KafkaTrigger url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL of the Kafka broker.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL of the Kafka broker.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public KafkaTrigger partition(Integer partition) {
    
    this.partition = partition;
    return this;
  }

   /**
   * Partition to write data to.
   * @return partition
  **/
  @ApiModelProperty(required = true, value = "Partition to write data to.")

  public Integer getPartition() {
    return partition;
  }


  public void setPartition(Integer partition) {
    this.partition = partition;
  }


  public KafkaTrigger compress(Boolean compress) {
    
    this.compress = compress;
    return this;
  }

   /**
   * Compress determines whether to compress message or not. Defaults to false. If set to true, compresses message using snappy compression.
   * @return compress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Compress determines whether to compress message or not. Defaults to false. If set to true, compresses message using snappy compression.")

  public Boolean getCompress() {
    return compress;
  }


  public void setCompress(Boolean compress) {
    this.compress = compress;
  }


  public KafkaTrigger topic(String topic) {
    
    this.topic = topic;
    return this;
  }

   /**
   * Name of the topic. More info at https://kafka.apache.org/documentation/#intro_topics
   * @return topic
  **/
  @ApiModelProperty(required = true, value = "Name of the topic. More info at https://kafka.apache.org/documentation/#intro_topics")

  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    this.topic = topic;
  }


  public KafkaTrigger requiredAcks(Integer requiredAcks) {
    
    this.requiredAcks = requiredAcks;
    return this;
  }

   /**
   * RequiredAcks used in producer to tell the broker how many replica acknowledgements Defaults to 1 (Only wait for the leader to ack).
   * @return requiredAcks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RequiredAcks used in producer to tell the broker how many replica acknowledgements Defaults to 1 (Only wait for the leader to ack).")

  public Integer getRequiredAcks() {
    return requiredAcks;
  }


  public void setRequiredAcks(Integer requiredAcks) {
    this.requiredAcks = requiredAcks;
  }


  public KafkaTrigger flushFrequency(Integer flushFrequency) {
    
    this.flushFrequency = flushFrequency;
    return this;
  }

   /**
   * FlushFrequency refers to the frequency in milliseconds to flush batches. Defaults to 500 milliseconds.
   * @return flushFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FlushFrequency refers to the frequency in milliseconds to flush batches. Defaults to 500 milliseconds.")

  public Integer getFlushFrequency() {
    return flushFrequency;
  }


  public void setFlushFrequency(Integer flushFrequency) {
    this.flushFrequency = flushFrequency;
  }


  public KafkaTrigger payload(List<TriggerParameter> payload) {
    
    this.payload = payload;
    return this;
  }

  public KafkaTrigger addPayloadItem(TriggerParameter payloadItem) {
    this.payload.add(payloadItem);
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(required = true, value = "")

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
    KafkaTrigger kafkaTrigger = (KafkaTrigger) o;
    return Objects.equals(this.tls, kafkaTrigger.tls) &&
        Objects.equals(this.partitioningKey, kafkaTrigger.partitioningKey) &&
        Objects.equals(this.parameters, kafkaTrigger.parameters) &&
        Objects.equals(this.url, kafkaTrigger.url) &&
        Objects.equals(this.partition, kafkaTrigger.partition) &&
        Objects.equals(this.compress, kafkaTrigger.compress) &&
        Objects.equals(this.topic, kafkaTrigger.topic) &&
        Objects.equals(this.requiredAcks, kafkaTrigger.requiredAcks) &&
        Objects.equals(this.flushFrequency, kafkaTrigger.flushFrequency) &&
        Objects.equals(this.payload, kafkaTrigger.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tls, partitioningKey, parameters, url, partition, compress, topic, requiredAcks, flushFrequency, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaTrigger {\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    partitioningKey: ").append(toIndentedString(partitioningKey)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    requiredAcks: ").append(toIndentedString(requiredAcks)).append("\n");
    sb.append("    flushFrequency: ").append(toIndentedString(flushFrequency)).append("\n");
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
