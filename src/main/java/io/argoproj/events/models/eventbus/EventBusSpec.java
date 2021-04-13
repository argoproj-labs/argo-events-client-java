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


package io.argoproj.events.models.eventbus;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.events.models.eventbus.NATSBus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EventBusSpec refers to specification of eventbus resource
 */
@ApiModel(description = "EventBusSpec refers to specification of eventbus resource")

public class EventBusSpec {
  public static final String SERIALIZED_NAME_NATS = "nats";
  @SerializedName(SERIALIZED_NAME_NATS)
  private NATSBus nats;


  public EventBusSpec nats(NATSBus nats) {
    
    this.nats = nats;
    return this;
  }

   /**
   * Get nats
   * @return nats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NATSBus getNats() {
    return nats;
  }


  public void setNats(NATSBus nats) {
    this.nats = nats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventBusSpec eventBusSpec = (EventBusSpec) o;
    return Objects.equals(this.nats, eventBusSpec.nats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventBusSpec {\n");
    sb.append("    nats: ").append(toIndentedString(nats)).append("\n");
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

