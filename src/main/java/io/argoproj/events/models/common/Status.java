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


package io.argoproj.events.models.common;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.events.models.common.Condition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Status is a common structure which can be used for Status field.
 */
@ApiModel(description = "Status is a common structure which can be used for Status field.")

public class Status {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<Condition> conditions = null;


  public Status conditions(List<Condition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public Status addConditionsItem(Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<Condition>();
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

  public List<Condition> getConditions() {
    return conditions;
  }


  public void setConditions(List<Condition> conditions) {
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
    Status status = (Status) o;
    return Objects.equals(this.conditions, status.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
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

