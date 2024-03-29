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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Backoff for an operation
 */
@ApiModel(description = "Backoff for an operation")

public class Backoff {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private Integer steps;

  public static final String SERIALIZED_NAME_JITTER = "jitter";
  @SerializedName(SERIALIZED_NAME_JITTER)
  private BigDecimal jitter;

  public static final String SERIALIZED_NAME_FACTOR = "factor";
  @SerializedName(SERIALIZED_NAME_FACTOR)
  private BigDecimal factor;


  public Backoff duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public Backoff steps(Integer steps) {
    
    this.steps = steps;
    return this;
  }

   /**
   * Exit with error after this many steps
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exit with error after this many steps")

  public Integer getSteps() {
    return steps;
  }


  public void setSteps(Integer steps) {
    this.steps = steps;
  }


  public Backoff jitter(BigDecimal jitter) {
    
    this.jitter = jitter;
    return this;
  }

   /**
   * Amount represent a numeric amount.
   * @return jitter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount represent a numeric amount.")

  public BigDecimal getJitter() {
    return jitter;
  }


  public void setJitter(BigDecimal jitter) {
    this.jitter = jitter;
  }


  public Backoff factor(BigDecimal factor) {
    
    this.factor = factor;
    return this;
  }

   /**
   * Amount represent a numeric amount.
   * @return factor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount represent a numeric amount.")

  public BigDecimal getFactor() {
    return factor;
  }


  public void setFactor(BigDecimal factor) {
    this.factor = factor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Backoff backoff = (Backoff) o;
    return Objects.equals(this.duration, backoff.duration) &&
        Objects.equals(this.steps, backoff.steps) &&
        Objects.equals(this.jitter, backoff.jitter) &&
        Objects.equals(this.factor, backoff.factor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, steps, jitter, factor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Backoff {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    jitter: ").append(toIndentedString(jitter)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
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

