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
import java.util.ArrayList;
import java.util.List;

/**
 * EventSourceStatus holds the status of the event-source resource
 */
@ApiModel(description = "EventSourceStatus holds the status of the event-source resource")

public class EventSourceStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<io.argoproj.events.models.common.Condition> conditions = null;


  public EventSourceStatus conditions(List<io.argoproj.events.models.common.Condition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public EventSourceStatus addConditionsItem(io.argoproj.events.models.common.Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<io.argoproj.events.models.common.Condition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions are the latest available observations of a resource&#39;s current state.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Conditions are the latest available observations of a resource's current state.")

  public List<io.argoproj.events.models.common.Condition> getConditions() {
    return conditions;
  }


  public void setConditions(List<io.argoproj.events.models.common.Condition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSourceStatus eventSourceStatus = (EventSourceStatus) o;
    return Objects.equals(this.conditions, eventSourceStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSourceStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

