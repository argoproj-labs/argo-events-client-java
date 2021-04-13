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

/**
 * AMQPQueueDeclareConfig holds the configuration of a queue to hold messages and deliver to consumers. Declaring creates a queue if it doesn&#39;t already exist, or ensures that an existing queue matches the same parameters
 */
@ApiModel(description = "AMQPQueueDeclareConfig holds the configuration of a queue to hold messages and deliver to consumers. Declaring creates a queue if it doesn't already exist, or ensures that an existing queue matches the same parameters")

public class AMQPQueueDeclareConfig {
  public static final String SERIALIZED_NAME_EXCLUSIVE = "exclusive";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE)
  private Boolean exclusive;

  public static final String SERIALIZED_NAME_DURABLE = "durable";
  @SerializedName(SERIALIZED_NAME_DURABLE)
  private Boolean durable;

  public static final String SERIALIZED_NAME_NO_WAIT = "noWait";
  @SerializedName(SERIALIZED_NAME_NO_WAIT)
  private Boolean noWait;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AUTO_DELETE = "autoDelete";
  @SerializedName(SERIALIZED_NAME_AUTO_DELETE)
  private Boolean autoDelete;


  public AMQPQueueDeclareConfig exclusive(Boolean exclusive) {
    
    this.exclusive = exclusive;
    return this;
  }

   /**
   * Exclusive sets the queues to be accessible only by the connection that declares them and will be deleted wgen the connection closes
   * @return exclusive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exclusive sets the queues to be accessible only by the connection that declares them and will be deleted wgen the connection closes")

  public Boolean getExclusive() {
    return exclusive;
  }


  public void setExclusive(Boolean exclusive) {
    this.exclusive = exclusive;
  }


  public AMQPQueueDeclareConfig durable(Boolean durable) {
    
    this.durable = durable;
    return this;
  }

   /**
   * Durable keeps the queue also after the server restarts
   * @return durable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Durable keeps the queue also after the server restarts")

  public Boolean getDurable() {
    return durable;
  }


  public void setDurable(Boolean durable) {
    this.durable = durable;
  }


  public AMQPQueueDeclareConfig noWait(Boolean noWait) {
    
    this.noWait = noWait;
    return this;
  }

   /**
   * NowWait when true, the queue assumes to be declared on the server
   * @return noWait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NowWait when true, the queue assumes to be declared on the server")

  public Boolean getNoWait() {
    return noWait;
  }


  public void setNoWait(Boolean noWait) {
    this.noWait = noWait;
  }


  public AMQPQueueDeclareConfig name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the queue. If empty the server auto-generates a unique name for this queue
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the queue. If empty the server auto-generates a unique name for this queue")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AMQPQueueDeclareConfig autoDelete(Boolean autoDelete) {
    
    this.autoDelete = autoDelete;
    return this;
  }

   /**
   * AutoDelete removes the queue when no consumers are active
   * @return autoDelete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AutoDelete removes the queue when no consumers are active")

  public Boolean getAutoDelete() {
    return autoDelete;
  }


  public void setAutoDelete(Boolean autoDelete) {
    this.autoDelete = autoDelete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AMQPQueueDeclareConfig amQPQueueDeclareConfig = (AMQPQueueDeclareConfig) o;
    return Objects.equals(this.exclusive, amQPQueueDeclareConfig.exclusive) &&
        Objects.equals(this.durable, amQPQueueDeclareConfig.durable) &&
        Objects.equals(this.noWait, amQPQueueDeclareConfig.noWait) &&
        Objects.equals(this.name, amQPQueueDeclareConfig.name) &&
        Objects.equals(this.autoDelete, amQPQueueDeclareConfig.autoDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclusive, durable, noWait, name, autoDelete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AMQPQueueDeclareConfig {\n");
    sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
    sb.append("    durable: ").append(toIndentedString(durable)).append("\n");
    sb.append("    noWait: ").append(toIndentedString(noWait)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    autoDelete: ").append(toIndentedString(autoDelete)).append("\n");
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
