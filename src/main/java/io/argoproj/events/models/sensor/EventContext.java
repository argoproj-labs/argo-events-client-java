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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * EventContext holds the context of the cloudevent received from an event source.
 */
@ApiModel(description = "EventContext holds the context of the cloudevent received from an event source.")

public class EventContext {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private org.joda.time.DateTime time = null;

  public static final String SERIALIZED_NAME_DATACONTENTTYPE = "datacontenttype";
  @SerializedName(SERIALIZED_NAME_DATACONTENTTYPE)
  private String datacontenttype;

  public static final String SERIALIZED_NAME_SPECVERSION = "specversion";
  @SerializedName(SERIALIZED_NAME_SPECVERSION)
  private String specversion;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;


  public EventContext type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type - The type of the occurrence which has happened.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type - The type of the occurrence which has happened.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public EventContext source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Source - A URI describing the event producer.
   * @return source
  **/
  @ApiModelProperty(required = true, value = "Source - A URI describing the event producer.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public EventContext time(org.joda.time.DateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(required = true, value = "")

  public org.joda.time.DateTime getTime() {
    return time;
  }


  public void setTime(org.joda.time.DateTime time) {
    this.time = time;
  }


  public EventContext datacontenttype(String datacontenttype) {
    
    this.datacontenttype = datacontenttype;
    return this;
  }

   /**
   * DataContentType - A MIME (RFC2046) string describing the media type of &#x60;data&#x60;.
   * @return datacontenttype
  **/
  @ApiModelProperty(required = true, value = "DataContentType - A MIME (RFC2046) string describing the media type of `data`.")

  public String getDatacontenttype() {
    return datacontenttype;
  }


  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }


  public EventContext specversion(String specversion) {
    
    this.specversion = specversion;
    return this;
  }

   /**
   * SpecVersion - The version of the CloudEvents specification used by the event.
   * @return specversion
  **/
  @ApiModelProperty(required = true, value = "SpecVersion - The version of the CloudEvents specification used by the event.")

  public String getSpecversion() {
    return specversion;
  }


  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }


  public EventContext id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the event; must be non-empty and unique within the scope of the producer.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID of the event; must be non-empty and unique within the scope of the producer.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EventContext subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject - The subject of the event in the context of the event producer
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "Subject - The subject of the event in the context of the event producer")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventContext eventContext = (EventContext) o;
    return Objects.equals(this.type, eventContext.type) &&
        Objects.equals(this.source, eventContext.source) &&
        Objects.equals(this.time, eventContext.time) &&
        Objects.equals(this.datacontenttype, eventContext.datacontenttype) &&
        Objects.equals(this.specversion, eventContext.specversion) &&
        Objects.equals(this.id, eventContext.id) &&
        Objects.equals(this.subject, eventContext.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, source, time, datacontenttype, specversion, id, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventContext {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    datacontenttype: ").append(toIndentedString(datacontenttype)).append("\n");
    sb.append("    specversion: ").append(toIndentedString(specversion)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
