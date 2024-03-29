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
import io.argoproj.events.models.eventsource.EventSourceFilter;
import io.argoproj.events.models.eventsource.WebhookContext;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GitlabEventSource refers to event-source related to Gitlab events
 */
@ApiModel(description = "GitlabEventSource refers to event-source related to Gitlab events")

public class GitlabEventSource {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "accessToken";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private V1SecretKeySelector accessToken = null;

  public static final String SERIALIZED_NAME_SECRET_TOKEN = "secretToken";
  @SerializedName(SERIALIZED_NAME_SECRET_TOKEN)
  private V1SecretKeySelector secretToken = null;

  public static final String SERIALIZED_NAME_ENABLE_S_S_L_VERIFICATION = "enableSSLVerification";
  @SerializedName(SERIALIZED_NAME_ENABLE_S_S_L_VERIFICATION)
  private Boolean enableSSLVerification;

  public static final String SERIALIZED_NAME_GITLAB_BASE_U_R_L = "gitlabBaseURL";
  @SerializedName(SERIALIZED_NAME_GITLAB_BASE_U_R_L)
  private String gitlabBaseURL;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private EventSourceFilter filter;

  public static final String SERIALIZED_NAME_PROJECT_I_D = "projectID";
  @SerializedName(SERIALIZED_NAME_PROJECT_I_D)
  private String projectID;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private WebhookContext webhook;

  public static final String SERIALIZED_NAME_DELETE_HOOK_ON_FINISH = "deleteHookOnFinish";
  @SerializedName(SERIALIZED_NAME_DELETE_HOOK_ON_FINISH)
  private Boolean deleteHookOnFinish;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = new ArrayList<String>();

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<String> projects = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public GitlabEventSource accessToken(V1SecretKeySelector accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(V1SecretKeySelector accessToken) {
    this.accessToken = accessToken;
  }


  public GitlabEventSource secretToken(V1SecretKeySelector secretToken) {
    
    this.secretToken = secretToken;
    return this;
  }

   /**
   * Get secretToken
   * @return secretToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getSecretToken() {
    return secretToken;
  }


  public void setSecretToken(V1SecretKeySelector secretToken) {
    this.secretToken = secretToken;
  }


  public GitlabEventSource enableSSLVerification(Boolean enableSSLVerification) {
    
    this.enableSSLVerification = enableSSLVerification;
    return this;
  }

   /**
   * EnableSSLVerification to enable ssl verification
   * @return enableSSLVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EnableSSLVerification to enable ssl verification")

  public Boolean getEnableSSLVerification() {
    return enableSSLVerification;
  }


  public void setEnableSSLVerification(Boolean enableSSLVerification) {
    this.enableSSLVerification = enableSSLVerification;
  }


  public GitlabEventSource gitlabBaseURL(String gitlabBaseURL) {
    
    this.gitlabBaseURL = gitlabBaseURL;
    return this;
  }

   /**
   * GitlabBaseURL is the base URL for API requests to a custom endpoint
   * @return gitlabBaseURL
  **/
  @ApiModelProperty(required = true, value = "GitlabBaseURL is the base URL for API requests to a custom endpoint")

  public String getGitlabBaseURL() {
    return gitlabBaseURL;
  }


  public void setGitlabBaseURL(String gitlabBaseURL) {
    this.gitlabBaseURL = gitlabBaseURL;
  }


  public GitlabEventSource filter(EventSourceFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventSourceFilter getFilter() {
    return filter;
  }


  public void setFilter(EventSourceFilter filter) {
    this.filter = filter;
  }


  public GitlabEventSource projectID(String projectID) {
    
    this.projectID = projectID;
    return this;
  }

   /**
   * DeprecatedProjectID is the id of project for which integration needs to setup Deprecated: use Projects instead. Will be unsupported in v 1.7
   * @return projectID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DeprecatedProjectID is the id of project for which integration needs to setup Deprecated: use Projects instead. Will be unsupported in v 1.7")

  public String getProjectID() {
    return projectID;
  }


  public void setProjectID(String projectID) {
    this.projectID = projectID;
  }


  public GitlabEventSource webhook(WebhookContext webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookContext getWebhook() {
    return webhook;
  }


  public void setWebhook(WebhookContext webhook) {
    this.webhook = webhook;
  }


  public GitlabEventSource deleteHookOnFinish(Boolean deleteHookOnFinish) {
    
    this.deleteHookOnFinish = deleteHookOnFinish;
    return this;
  }

   /**
   * DeleteHookOnFinish determines whether to delete the GitLab hook for the project once the event source is stopped.
   * @return deleteHookOnFinish
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DeleteHookOnFinish determines whether to delete the GitLab hook for the project once the event source is stopped.")

  public Boolean getDeleteHookOnFinish() {
    return deleteHookOnFinish;
  }


  public void setDeleteHookOnFinish(Boolean deleteHookOnFinish) {
    this.deleteHookOnFinish = deleteHookOnFinish;
  }


  public GitlabEventSource events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public GitlabEventSource addEventsItem(String eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Events are gitlab event to listen to. Refer https://github.com/xanzy/go-gitlab/blob/bf34eca5d13a9f4c3f501d8a97b8ac226d55e4d9/projects.go#L794.
   * @return events
  **/
  @ApiModelProperty(required = true, value = "Events are gitlab event to listen to. Refer https://github.com/xanzy/go-gitlab/blob/bf34eca5d13a9f4c3f501d8a97b8ac226d55e4d9/projects.go#L794.")

  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public GitlabEventSource projects(List<String> projects) {
    
    this.projects = projects;
    return this;
  }

  public GitlabEventSource addProjectsItem(String projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<String>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * List of project IDs or project namespace paths like \&quot;whynowy/test\&quot;
   * @return projects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of project IDs or project namespace paths like \"whynowy/test\"")

  public List<String> getProjects() {
    return projects;
  }


  public void setProjects(List<String> projects) {
    this.projects = projects;
  }


  public GitlabEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public GitlabEventSource putMetadataItem(String key, String metadataItem) {
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
    GitlabEventSource gitlabEventSource = (GitlabEventSource) o;
    return Objects.equals(this.accessToken, gitlabEventSource.accessToken) &&
        Objects.equals(this.secretToken, gitlabEventSource.secretToken) &&
        Objects.equals(this.enableSSLVerification, gitlabEventSource.enableSSLVerification) &&
        Objects.equals(this.gitlabBaseURL, gitlabEventSource.gitlabBaseURL) &&
        Objects.equals(this.filter, gitlabEventSource.filter) &&
        Objects.equals(this.projectID, gitlabEventSource.projectID) &&
        Objects.equals(this.webhook, gitlabEventSource.webhook) &&
        Objects.equals(this.deleteHookOnFinish, gitlabEventSource.deleteHookOnFinish) &&
        Objects.equals(this.events, gitlabEventSource.events) &&
        Objects.equals(this.projects, gitlabEventSource.projects) &&
        Objects.equals(this.metadata, gitlabEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, secretToken, enableSSLVerification, gitlabBaseURL, filter, projectID, webhook, deleteHookOnFinish, events, projects, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitlabEventSource {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    secretToken: ").append(toIndentedString(secretToken)).append("\n");
    sb.append("    enableSSLVerification: ").append(toIndentedString(enableSSLVerification)).append("\n");
    sb.append("    gitlabBaseURL: ").append(toIndentedString(gitlabBaseURL)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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

