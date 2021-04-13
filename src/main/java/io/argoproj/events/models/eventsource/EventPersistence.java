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
import io.argoproj.events.models.eventsource.CatchupConfiguration;
import io.argoproj.events.models.eventsource.ConfigMapPersistence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EventPersistence
 */

public class EventPersistence {
  public static final String SERIALIZED_NAME_CATCHUP = "catchup";
  @SerializedName(SERIALIZED_NAME_CATCHUP)
  private CatchupConfiguration catchup;

  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private ConfigMapPersistence configMap;


  public EventPersistence catchup(CatchupConfiguration catchup) {
    
    this.catchup = catchup;
    return this;
  }

   /**
   * Get catchup
   * @return catchup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatchupConfiguration getCatchup() {
    return catchup;
  }


  public void setCatchup(CatchupConfiguration catchup) {
    this.catchup = catchup;
  }


  public EventPersistence configMap(ConfigMapPersistence configMap) {
    
    this.configMap = configMap;
    return this;
  }

   /**
   * Get configMap
   * @return configMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigMapPersistence getConfigMap() {
    return configMap;
  }


  public void setConfigMap(ConfigMapPersistence configMap) {
    this.configMap = configMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventPersistence eventPersistence = (EventPersistence) o;
    return Objects.equals(this.catchup, eventPersistence.catchup) &&
        Objects.equals(this.configMap, eventPersistence.configMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catchup, configMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventPersistence {\n");
    sb.append("    catchup: ").append(toIndentedString(catchup)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
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

