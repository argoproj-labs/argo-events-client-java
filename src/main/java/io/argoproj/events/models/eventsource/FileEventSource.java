/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.5.0
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
import io.argoproj.events.models.eventsource.WatchPathConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FileEventSource describes an event-source for file related events.
 */
@ApiModel(description = "FileEventSource describes an event-source for file related events.")

public class FileEventSource {
  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_WATCH_PATH_CONFIG = "watchPathConfig";
  @SerializedName(SERIALIZED_NAME_WATCH_PATH_CONFIG)
  private WatchPathConfig watchPathConfig;

  public static final String SERIALIZED_NAME_POLLING = "polling";
  @SerializedName(SERIALIZED_NAME_POLLING)
  private Boolean polling;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public FileEventSource eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Type of file operations to watch Refer https://github.com/fsnotify/fsnotify/blob/master/fsnotify.go for more information
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "Type of file operations to watch Refer https://github.com/fsnotify/fsnotify/blob/master/fsnotify.go for more information")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public FileEventSource watchPathConfig(WatchPathConfig watchPathConfig) {
    
    this.watchPathConfig = watchPathConfig;
    return this;
  }

   /**
   * Get watchPathConfig
   * @return watchPathConfig
  **/
  @ApiModelProperty(required = true, value = "")

  public WatchPathConfig getWatchPathConfig() {
    return watchPathConfig;
  }


  public void setWatchPathConfig(WatchPathConfig watchPathConfig) {
    this.watchPathConfig = watchPathConfig;
  }


  public FileEventSource polling(Boolean polling) {
    
    this.polling = polling;
    return this;
  }

   /**
   * Use polling instead of inotify
   * @return polling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use polling instead of inotify")

  public Boolean getPolling() {
    return polling;
  }


  public void setPolling(Boolean polling) {
    this.polling = polling;
  }


  public FileEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public FileEventSource putMetadataItem(String key, String metadataItem) {
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
    FileEventSource fileEventSource = (FileEventSource) o;
    return Objects.equals(this.eventType, fileEventSource.eventType) &&
        Objects.equals(this.watchPathConfig, fileEventSource.watchPathConfig) &&
        Objects.equals(this.polling, fileEventSource.polling) &&
        Objects.equals(this.metadata, fileEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, watchPathConfig, polling, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileEventSource {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    watchPathConfig: ").append(toIndentedString(watchPathConfig)).append("\n");
    sb.append("    polling: ").append(toIndentedString(polling)).append("\n");
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

