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
import java.util.ArrayList;
import java.util.List;

/**
 * DataFilter describes constraints and filters for event data Regular Expressions are purposefully not a feature as they are overkill for our uses here See Rob Pike&#39;s Post: https://commandcenter.blogspot.com/2011/08/regular-expressions-in-lexing-and.html
 */
@ApiModel(description = "DataFilter describes constraints and filters for event data Regular Expressions are purposefully not a feature as they are overkill for our uses here See Rob Pike's Post: https://commandcenter.blogspot.com/2011/08/regular-expressions-in-lexing-and.html")

public class DataFilter {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<String> value = new ArrayList<String>();

  public static final String SERIALIZED_NAME_COMPARATOR = "comparator";
  @SerializedName(SERIALIZED_NAME_COMPARATOR)
  private String comparator;


  public DataFilter path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path is the JSONPath of the event&#39;s (JSON decoded) data key Path is a series of keys separated by a dot. A key may contain wildcard characters &#39;*&#39; and &#39;?&#39;. To access an array value use the index as the key. The dot and wildcard characters can be escaped with &#39;\\&#39;. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Path is the JSONPath of the event's (JSON decoded) data key Path is a series of keys separated by a dot. A key may contain wildcard characters '*' and '?'. To access an array value use the index as the key. The dot and wildcard characters can be escaped with '\\'. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public DataFilter type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type contains the JSON type of the data
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type contains the JSON type of the data")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public DataFilter value(List<String> value) {
    
    this.value = value;
    return this;
  }

  public DataFilter addValueItem(String valueItem) {
    this.value.add(valueItem);
    return this;
  }

   /**
   * Value is the allowed string values for this key Booleans are passed using strconv.ParseBool() Numbers are parsed using as float64 using strconv.ParseFloat() Strings are taken as is Nils this value is ignored
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value is the allowed string values for this key Booleans are passed using strconv.ParseBool() Numbers are parsed using as float64 using strconv.ParseFloat() Strings are taken as is Nils this value is ignored")

  public List<String> getValue() {
    return value;
  }


  public void setValue(List<String> value) {
    this.value = value;
  }


  public DataFilter comparator(String comparator) {
    
    this.comparator = comparator;
    return this;
  }

   /**
   * Comparator compares the event data with a user given value. Can be \&quot;&gt;&#x3D;\&quot;, \&quot;&gt;\&quot;, \&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;&lt;\&quot;, or \&quot;&lt;&#x3D;\&quot;. Is optional, and if left blank treated as equality \&quot;&#x3D;\&quot;.
   * @return comparator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comparator compares the event data with a user given value. Can be \">=\", \">\", \"=\", \"!=\", \"<\", or \"<=\". Is optional, and if left blank treated as equality \"=\".")

  public String getComparator() {
    return comparator;
  }


  public void setComparator(String comparator) {
    this.comparator = comparator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataFilter dataFilter = (DataFilter) o;
    return Objects.equals(this.path, dataFilter.path) &&
        Objects.equals(this.type, dataFilter.type) &&
        Objects.equals(this.value, dataFilter.value) &&
        Objects.equals(this.comparator, dataFilter.comparator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, type, value, comparator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFilter {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
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
