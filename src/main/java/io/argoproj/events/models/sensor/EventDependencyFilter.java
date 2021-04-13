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
import io.argoproj.events.models.sensor.DataFilter;
import io.argoproj.events.models.sensor.EventContext;
import io.argoproj.events.models.sensor.TimeFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EventDependencyFilter defines filters and constraints for a event.
 */
@ApiModel(description = "EventDependencyFilter defines filters and constraints for a event.")

public class EventDependencyFilter {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<DataFilter> data = null;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private EventContext context;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private TimeFilter time;


  public EventDependencyFilter data(List<DataFilter> data) {
    
    this.data = data;
    return this;
  }

  public EventDependencyFilter addDataItem(DataFilter dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<DataFilter>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Data filter constraints with escalation
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data filter constraints with escalation")

  public List<DataFilter> getData() {
    return data;
  }


  public void setData(List<DataFilter> data) {
    this.data = data;
  }


  public EventDependencyFilter context(EventContext context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventContext getContext() {
    return context;
  }


  public void setContext(EventContext context) {
    this.context = context;
  }


  public EventDependencyFilter time(TimeFilter time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeFilter getTime() {
    return time;
  }


  public void setTime(TimeFilter time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDependencyFilter eventDependencyFilter = (EventDependencyFilter) o;
    return Objects.equals(this.data, eventDependencyFilter.data) &&
        Objects.equals(this.context, eventDependencyFilter.context) &&
        Objects.equals(this.time, eventDependencyFilter.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, context, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDependencyFilter {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

