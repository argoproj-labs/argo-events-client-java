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
import io.argoproj.events.models.eventsource.BitbucketBasicAuth;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BitbucketAuth holds the different auth strategies for connecting to Bitbucket
 */
@ApiModel(description = "BitbucketAuth holds the different auth strategies for connecting to Bitbucket")

public class BitbucketAuth {
  public static final String SERIALIZED_NAME_OAUTH_TOKEN = "oauthToken";
  @SerializedName(SERIALIZED_NAME_OAUTH_TOKEN)
  private V1SecretKeySelector oauthToken = null;

  public static final String SERIALIZED_NAME_BASIC = "basic";
  @SerializedName(SERIALIZED_NAME_BASIC)
  private BitbucketBasicAuth basic;


  public BitbucketAuth oauthToken(V1SecretKeySelector oauthToken) {
    
    this.oauthToken = oauthToken;
    return this;
  }

   /**
   * Get oauthToken
   * @return oauthToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getOauthToken() {
    return oauthToken;
  }


  public void setOauthToken(V1SecretKeySelector oauthToken) {
    this.oauthToken = oauthToken;
  }


  public BitbucketAuth basic(BitbucketBasicAuth basic) {
    
    this.basic = basic;
    return this;
  }

   /**
   * Get basic
   * @return basic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BitbucketBasicAuth getBasic() {
    return basic;
  }


  public void setBasic(BitbucketBasicAuth basic) {
    this.basic = basic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BitbucketAuth bitbucketAuth = (BitbucketAuth) o;
    return Objects.equals(this.oauthToken, bitbucketAuth.oauthToken) &&
        Objects.equals(this.basic, bitbucketAuth.basic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthToken, basic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BitbucketAuth {\n");
    sb.append("    oauthToken: ").append(toIndentedString(oauthToken)).append("\n");
    sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
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

