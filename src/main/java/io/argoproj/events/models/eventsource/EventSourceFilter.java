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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EventSourceFilter
 */

public class EventSourceFilter {
  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;


  public EventSourceFilter expression(String expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSourceFilter eventSourceFilter = (EventSourceFilter) o;
    return Objects.equals(this.expression, eventSourceFilter.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSourceFilter {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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
