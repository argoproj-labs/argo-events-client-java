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
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PubSubEventSource refers to event-source for GCP PubSub related events.
 */
@ApiModel(description = "PubSubEventSource refers to event-source for GCP PubSub related events.")

public class PubSubEventSource {
  public static final String SERIALIZED_NAME_TOPIC_PROJECT_I_D = "topicProjectID";
  @SerializedName(SERIALIZED_NAME_TOPIC_PROJECT_I_D)
  private String topicProjectID;

  public static final String SERIALIZED_NAME_PROJECT_I_D = "projectID";
  @SerializedName(SERIALIZED_NAME_PROJECT_I_D)
  private String projectID;

  public static final String SERIALIZED_NAME_DELETE_SUBSCRIPTION_ON_FINISH = "deleteSubscriptionOnFinish";
  @SerializedName(SERIALIZED_NAME_DELETE_SUBSCRIPTION_ON_FINISH)
  private Boolean deleteSubscriptionOnFinish;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_CREDENTIAL_SECRET = "credentialSecret";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_SECRET)
  private V1SecretKeySelector credentialSecret = null;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_I_D = "subscriptionID";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_I_D)
  private String subscriptionID;

  public static final String SERIALIZED_NAME_JSON_BODY = "jsonBody";
  @SerializedName(SERIALIZED_NAME_JSON_BODY)
  private Boolean jsonBody;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public PubSubEventSource topicProjectID(String topicProjectID) {
    
    this.topicProjectID = topicProjectID;
    return this;
  }

   /**
   * TopicProjectID is GCP project ID for the topic. By default, it is same as ProjectID.
   * @return topicProjectID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TopicProjectID is GCP project ID for the topic. By default, it is same as ProjectID.")

  public String getTopicProjectID() {
    return topicProjectID;
  }


  public void setTopicProjectID(String topicProjectID) {
    this.topicProjectID = topicProjectID;
  }


  public PubSubEventSource projectID(String projectID) {
    
    this.projectID = projectID;
    return this;
  }

   /**
   * ProjectID is GCP project ID for the subscription. Required if you run Argo Events outside of GKE/GCE. (otherwise, the default value is its project)
   * @return projectID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ProjectID is GCP project ID for the subscription. Required if you run Argo Events outside of GKE/GCE. (otherwise, the default value is its project)")

  public String getProjectID() {
    return projectID;
  }


  public void setProjectID(String projectID) {
    this.projectID = projectID;
  }


  public PubSubEventSource deleteSubscriptionOnFinish(Boolean deleteSubscriptionOnFinish) {
    
    this.deleteSubscriptionOnFinish = deleteSubscriptionOnFinish;
    return this;
  }

   /**
   * DeleteSubscriptionOnFinish determines whether to delete the GCP PubSub subscription once the event source is stopped.
   * @return deleteSubscriptionOnFinish
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DeleteSubscriptionOnFinish determines whether to delete the GCP PubSub subscription once the event source is stopped.")

  public Boolean getDeleteSubscriptionOnFinish() {
    return deleteSubscriptionOnFinish;
  }


  public void setDeleteSubscriptionOnFinish(Boolean deleteSubscriptionOnFinish) {
    this.deleteSubscriptionOnFinish = deleteSubscriptionOnFinish;
  }


  public PubSubEventSource topic(String topic) {
    
    this.topic = topic;
    return this;
  }

   /**
   * Topic to which the subscription should belongs. Required if you want the eventsource to create a new subscription. If you specify this field along with an existing subscription, it will be verified whether it actually belongs to the specified topic.
   * @return topic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Topic to which the subscription should belongs. Required if you want the eventsource to create a new subscription. If you specify this field along with an existing subscription, it will be verified whether it actually belongs to the specified topic.")

  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    this.topic = topic;
  }


  public PubSubEventSource credentialSecret(V1SecretKeySelector credentialSecret) {
    
    this.credentialSecret = credentialSecret;
    return this;
  }

   /**
   * Get credentialSecret
   * @return credentialSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getCredentialSecret() {
    return credentialSecret;
  }


  public void setCredentialSecret(V1SecretKeySelector credentialSecret) {
    this.credentialSecret = credentialSecret;
  }


  public PubSubEventSource subscriptionID(String subscriptionID) {
    
    this.subscriptionID = subscriptionID;
    return this;
  }

   /**
   * SubscriptionID is ID of subscription. Required if you use existing subscription. The default value will be auto generated hash based on this eventsource setting, so the subscription might be recreated every time you update the setting, which has a possibility of event loss.
   * @return subscriptionID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SubscriptionID is ID of subscription. Required if you use existing subscription. The default value will be auto generated hash based on this eventsource setting, so the subscription might be recreated every time you update the setting, which has a possibility of event loss.")

  public String getSubscriptionID() {
    return subscriptionID;
  }


  public void setSubscriptionID(String subscriptionID) {
    this.subscriptionID = subscriptionID;
  }


  public PubSubEventSource jsonBody(Boolean jsonBody) {
    
    this.jsonBody = jsonBody;
    return this;
  }

   /**
   * JSONBody specifies that all event body payload coming from this source will be JSON
   * @return jsonBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JSONBody specifies that all event body payload coming from this source will be JSON")

  public Boolean getJsonBody() {
    return jsonBody;
  }


  public void setJsonBody(Boolean jsonBody) {
    this.jsonBody = jsonBody;
  }


  public PubSubEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public PubSubEventSource putMetadataItem(String key, String metadataItem) {
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
    PubSubEventSource pubSubEventSource = (PubSubEventSource) o;
    return Objects.equals(this.topicProjectID, pubSubEventSource.topicProjectID) &&
        Objects.equals(this.projectID, pubSubEventSource.projectID) &&
        Objects.equals(this.deleteSubscriptionOnFinish, pubSubEventSource.deleteSubscriptionOnFinish) &&
        Objects.equals(this.topic, pubSubEventSource.topic) &&
        Objects.equals(this.credentialSecret, pubSubEventSource.credentialSecret) &&
        Objects.equals(this.subscriptionID, pubSubEventSource.subscriptionID) &&
        Objects.equals(this.jsonBody, pubSubEventSource.jsonBody) &&
        Objects.equals(this.metadata, pubSubEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicProjectID, projectID, deleteSubscriptionOnFinish, topic, credentialSecret, subscriptionID, jsonBody, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PubSubEventSource {\n");
    sb.append("    topicProjectID: ").append(toIndentedString(topicProjectID)).append("\n");
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
    sb.append("    deleteSubscriptionOnFinish: ").append(toIndentedString(deleteSubscriptionOnFinish)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    credentialSecret: ").append(toIndentedString(credentialSecret)).append("\n");
    sb.append("    subscriptionID: ").append(toIndentedString(subscriptionID)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
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

