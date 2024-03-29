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

/**
 * TriggerParameterSource defines the source for a parameter from a event event
 */
@ApiModel(description = "TriggerParameterSource defines the source for a parameter from a event event")

public class TriggerParameterSource {
  public static final String SERIALIZED_NAME_DEPENDENCY_NAME = "dependencyName";
  @SerializedName(SERIALIZED_NAME_DEPENDENCY_NAME)
  private String dependencyName;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_CONTEXT_TEMPLATE = "contextTemplate";
  @SerializedName(SERIALIZED_NAME_CONTEXT_TEMPLATE)
  private String contextTemplate;

  public static final String SERIALIZED_NAME_CONTEXT_KEY = "contextKey";
  @SerializedName(SERIALIZED_NAME_CONTEXT_KEY)
  private String contextKey;

  public static final String SERIALIZED_NAME_DATA_KEY = "dataKey";
  @SerializedName(SERIALIZED_NAME_DATA_KEY)
  private String dataKey;

  public static final String SERIALIZED_NAME_DATA_TEMPLATE = "dataTemplate";
  @SerializedName(SERIALIZED_NAME_DATA_TEMPLATE)
  private String dataTemplate;


  public TriggerParameterSource dependencyName(String dependencyName) {
    
    this.dependencyName = dependencyName;
    return this;
  }

   /**
   * DependencyName refers to the name of the dependency. The event which is stored for this dependency is used as payload for the parameterization. Make sure to refer to one of the dependencies you have defined under Dependencies list.
   * @return dependencyName
  **/
  @ApiModelProperty(required = true, value = "DependencyName refers to the name of the dependency. The event which is stored for this dependency is used as payload for the parameterization. Make sure to refer to one of the dependencies you have defined under Dependencies list.")

  public String getDependencyName() {
    return dependencyName;
  }


  public void setDependencyName(String dependencyName) {
    this.dependencyName = dependencyName;
  }


  public TriggerParameterSource value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value is the default literal value to use for this parameter source This is only used if the DataKey is invalid. If the DataKey is invalid and this is not defined, this param source will produce an error.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value is the default literal value to use for this parameter source This is only used if the DataKey is invalid. If the DataKey is invalid and this is not defined, this param source will produce an error.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public TriggerParameterSource contextTemplate(String contextTemplate) {
    
    this.contextTemplate = contextTemplate;
    return this;
  }

   /**
   * ContextTemplate is a go-template for extracting a string from the event&#39;s context. If a ContextTemplate is provided with a ContextKey, the template will be evaluated first and fallback to the ContextKey. The templating follows the standard go-template syntax as well as sprig&#39;s extra functions. See https://pkg.go.dev/text/template and https://masterminds.github.io/sprig/
   * @return contextTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ContextTemplate is a go-template for extracting a string from the event's context. If a ContextTemplate is provided with a ContextKey, the template will be evaluated first and fallback to the ContextKey. The templating follows the standard go-template syntax as well as sprig's extra functions. See https://pkg.go.dev/text/template and https://masterminds.github.io/sprig/")

  public String getContextTemplate() {
    return contextTemplate;
  }


  public void setContextTemplate(String contextTemplate) {
    this.contextTemplate = contextTemplate;
  }


  public TriggerParameterSource contextKey(String contextKey) {
    
    this.contextKey = contextKey;
    return this;
  }

   /**
   * ContextKey is the JSONPath of the event&#39;s (JSON decoded) context key ContextKey is a series of keys separated by a dot. A key may contain wildcard characters &#39;*&#39; and &#39;?&#39;. To access an array value use the index as the key. The dot and wildcard characters can be escaped with &#39;\\&#39;. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.
   * @return contextKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ContextKey is the JSONPath of the event's (JSON decoded) context key ContextKey is a series of keys separated by a dot. A key may contain wildcard characters '*' and '?'. To access an array value use the index as the key. The dot and wildcard characters can be escaped with '\\'. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.")

  public String getContextKey() {
    return contextKey;
  }


  public void setContextKey(String contextKey) {
    this.contextKey = contextKey;
  }


  public TriggerParameterSource dataKey(String dataKey) {
    
    this.dataKey = dataKey;
    return this;
  }

   /**
   * DataKey is the JSONPath of the event&#39;s (JSON decoded) data key DataKey is a series of keys separated by a dot. A key may contain wildcard characters &#39;*&#39; and &#39;?&#39;. To access an array value use the index as the key. The dot and wildcard characters can be escaped with &#39;\\&#39;. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.
   * @return dataKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DataKey is the JSONPath of the event's (JSON decoded) data key DataKey is a series of keys separated by a dot. A key may contain wildcard characters '*' and '?'. To access an array value use the index as the key. The dot and wildcard characters can be escaped with '\\'. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.")

  public String getDataKey() {
    return dataKey;
  }


  public void setDataKey(String dataKey) {
    this.dataKey = dataKey;
  }


  public TriggerParameterSource dataTemplate(String dataTemplate) {
    
    this.dataTemplate = dataTemplate;
    return this;
  }

   /**
   * DataTemplate is a go-template for extracting a string from the event&#39;s data. If a DataTemplate is provided with a DataKey, the template will be evaluated first and fallback to the DataKey. The templating follows the standard go-template syntax as well as sprig&#39;s extra functions. See https://pkg.go.dev/text/template and https://masterminds.github.io/sprig/
   * @return dataTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DataTemplate is a go-template for extracting a string from the event's data. If a DataTemplate is provided with a DataKey, the template will be evaluated first and fallback to the DataKey. The templating follows the standard go-template syntax as well as sprig's extra functions. See https://pkg.go.dev/text/template and https://masterminds.github.io/sprig/")

  public String getDataTemplate() {
    return dataTemplate;
  }


  public void setDataTemplate(String dataTemplate) {
    this.dataTemplate = dataTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerParameterSource triggerParameterSource = (TriggerParameterSource) o;
    return Objects.equals(this.dependencyName, triggerParameterSource.dependencyName) &&
        Objects.equals(this.value, triggerParameterSource.value) &&
        Objects.equals(this.contextTemplate, triggerParameterSource.contextTemplate) &&
        Objects.equals(this.contextKey, triggerParameterSource.contextKey) &&
        Objects.equals(this.dataKey, triggerParameterSource.dataKey) &&
        Objects.equals(this.dataTemplate, triggerParameterSource.dataTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencyName, value, contextTemplate, contextKey, dataKey, dataTemplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerParameterSource {\n");
    sb.append("    dependencyName: ").append(toIndentedString(dependencyName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    contextTemplate: ").append(toIndentedString(contextTemplate)).append("\n");
    sb.append("    contextKey: ").append(toIndentedString(contextKey)).append("\n");
    sb.append("    dataKey: ").append(toIndentedString(dataKey)).append("\n");
    sb.append("    dataTemplate: ").append(toIndentedString(dataTemplate)).append("\n");
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

