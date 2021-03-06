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
import io.argoproj.events.models.sensor.TriggerParameter;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AWSLambdaTrigger refers to specification of the trigger to invoke an AWS Lambda function
 */
@ApiModel(description = "AWSLambdaTrigger refers to specification of the trigger to invoke an AWS Lambda function")

public class AWSLambdaTrigger {
  public static final String SERIALIZED_NAME_FUNCTION_NAME = "functionName";
  @SerializedName(SERIALIZED_NAME_FUNCTION_NAME)
  private String functionName;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private List<TriggerParameter> payload = new ArrayList<TriggerParameter>();

  public static final String SERIALIZED_NAME_SECRET_KEY = "secretKey";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY)
  private V1SecretKeySelector secretKey = null;

  public static final String SERIALIZED_NAME_ACCESS_KEY = "accessKey";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  private V1SecretKeySelector accessKey = null;


  public AWSLambdaTrigger functionName(String functionName) {
    
    this.functionName = functionName;
    return this;
  }

   /**
   * FunctionName refers to the name of the function to invoke.
   * @return functionName
  **/
  @ApiModelProperty(required = true, value = "FunctionName refers to the name of the function to invoke.")

  public String getFunctionName() {
    return functionName;
  }


  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }


  public AWSLambdaTrigger parameters(List<TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public AWSLambdaTrigger addParametersItem(TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TriggerParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<TriggerParameter> parameters) {
    this.parameters = parameters;
  }


  public AWSLambdaTrigger region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region is AWS region
   * @return region
  **/
  @ApiModelProperty(required = true, value = "Region is AWS region")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public AWSLambdaTrigger payload(List<TriggerParameter> payload) {
    
    this.payload = payload;
    return this;
  }

  public AWSLambdaTrigger addPayloadItem(TriggerParameter payloadItem) {
    this.payload.add(payloadItem);
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(required = true, value = "")

  public List<TriggerParameter> getPayload() {
    return payload;
  }


  public void setPayload(List<TriggerParameter> payload) {
    this.payload = payload;
  }


  public AWSLambdaTrigger secretKey(V1SecretKeySelector secretKey) {
    
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getSecretKey() {
    return secretKey;
  }


  public void setSecretKey(V1SecretKeySelector secretKey) {
    this.secretKey = secretKey;
  }


  public AWSLambdaTrigger accessKey(V1SecretKeySelector accessKey) {
    
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getAccessKey() {
    return accessKey;
  }


  public void setAccessKey(V1SecretKeySelector accessKey) {
    this.accessKey = accessKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSLambdaTrigger awSLambdaTrigger = (AWSLambdaTrigger) o;
    return Objects.equals(this.functionName, awSLambdaTrigger.functionName) &&
        Objects.equals(this.parameters, awSLambdaTrigger.parameters) &&
        Objects.equals(this.region, awSLambdaTrigger.region) &&
        Objects.equals(this.payload, awSLambdaTrigger.payload) &&
        Objects.equals(this.secretKey, awSLambdaTrigger.secretKey) &&
        Objects.equals(this.accessKey, awSLambdaTrigger.accessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionName, parameters, region, payload, secretKey, accessKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSLambdaTrigger {\n");
    sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
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

