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
import io.argoproj.events.models.eventsource.Selector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * ResourceFilter contains K8s ObjectMeta information to further filter resource event objects
 */
@ApiModel(description = "ResourceFilter contains K8s ObjectMeta information to further filter resource event objects")

public class ResourceFilter {
  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<Selector> fields = null;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<Selector> labels = null;

  public static final String SERIALIZED_NAME_AFTER_START = "afterStart";
  @SerializedName(SERIALIZED_NAME_AFTER_START)
  private Boolean afterStart;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private org.joda.time.DateTime createdBy = null;


  public ResourceFilter fields(List<Selector> fields) {
    
    this.fields = fields;
    return this;
  }

  public ResourceFilter addFieldsItem(Selector fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<Selector>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Fields provide field filters similar to K8s field selector (see https://kubernetes.io/docs/concepts/overview/working-with-objects/field-selectors/). Unlike K8s field selector, it supports arbitrary fileds like \&quot;spec.serviceAccountName\&quot;, and the value could be a string or a regex. Same as K8s field selector, operator \&quot;&#x3D;\&quot;, \&quot;&#x3D;&#x3D;\&quot; and \&quot;!&#x3D;\&quot; are supported.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fields provide field filters similar to K8s field selector (see https://kubernetes.io/docs/concepts/overview/working-with-objects/field-selectors/). Unlike K8s field selector, it supports arbitrary fileds like \"spec.serviceAccountName\", and the value could be a string or a regex. Same as K8s field selector, operator \"=\", \"==\" and \"!=\" are supported.")

  public List<Selector> getFields() {
    return fields;
  }


  public void setFields(List<Selector> fields) {
    this.fields = fields;
  }


  public ResourceFilter prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Prefix filter is applied on the resource name.
   * @return prefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prefix filter is applied on the resource name.")

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public ResourceFilter labels(List<Selector> labels) {
    
    this.labels = labels;
    return this;
  }

  public ResourceFilter addLabelsItem(Selector labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Selector>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Labels provide listing options to K8s API to watch resource/s. Refer https://kubernetes.io/docs/concepts/overview/working-with-objects/label-selectors/ for more info.
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Labels provide listing options to K8s API to watch resource/s. Refer https://kubernetes.io/docs/concepts/overview/working-with-objects/label-selectors/ for more info.")

  public List<Selector> getLabels() {
    return labels;
  }


  public void setLabels(List<Selector> labels) {
    this.labels = labels;
  }


  public ResourceFilter afterStart(Boolean afterStart) {
    
    this.afterStart = afterStart;
    return this;
  }

   /**
   * If the resource is created after the start time then the event is treated as valid.
   * @return afterStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the resource is created after the start time then the event is treated as valid.")

  public Boolean getAfterStart() {
    return afterStart;
  }


  public void setAfterStart(Boolean afterStart) {
    this.afterStart = afterStart;
  }


  public ResourceFilter createdBy(org.joda.time.DateTime createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public org.joda.time.DateTime getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(org.joda.time.DateTime createdBy) {
    this.createdBy = createdBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceFilter resourceFilter = (ResourceFilter) o;
    return Objects.equals(this.fields, resourceFilter.fields) &&
        Objects.equals(this.prefix, resourceFilter.prefix) &&
        Objects.equals(this.labels, resourceFilter.labels) &&
        Objects.equals(this.afterStart, resourceFilter.afterStart) &&
        Objects.equals(this.createdBy, resourceFilter.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, prefix, labels, afterStart, createdBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceFilter {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    afterStart: ").append(toIndentedString(afterStart)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

