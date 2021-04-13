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
import io.kubernetes.client.openapi.models.V1Affinity;
import io.kubernetes.client.openapi.models.V1Container;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import io.kubernetes.client.openapi.models.V1PodSecurityContext;
import io.kubernetes.client.openapi.models.V1Toleration;
import io.kubernetes.client.openapi.models.V1Volume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Template holds the information of a sensor deployment template
 */
@ApiModel(description = "Template holds the information of a sensor deployment template")

public class Template {
  public static final String SERIALIZED_NAME_PRIORITY_CLASS_NAME = "priorityClassName";
  @SerializedName(SERIALIZED_NAME_PRIORITY_CLASS_NAME)
  private String priorityClassName;

  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private V1Container container = null;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1Affinity affinity = null;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<V1Volume> volumes = null;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1Toleration> tolerations = null;

  public static final String SERIALIZED_NAME_SECURITY_CONTEXT = "securityContext";
  @SerializedName(SERIALIZED_NAME_SECURITY_CONTEXT)
  private V1PodSecurityContext securityContext = null;

  public static final String SERIALIZED_NAME_IMAGE_PULL_SECRETS = "imagePullSecrets";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_SECRETS)
  private List<V1LocalObjectReference> imagePullSecrets = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private io.argoproj.events.models.common.Metadata metadata = null;


  public Template priorityClassName(String priorityClassName) {
    
    this.priorityClassName = priorityClassName;
    return this;
  }

   /**
   * If specified, indicates the EventSource pod&#39;s priority. \&quot;system-node-critical\&quot; and \&quot;system-cluster-critical\&quot; are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/
   * @return priorityClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, indicates the EventSource pod's priority. \"system-node-critical\" and \"system-cluster-critical\" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/")

  public String getPriorityClassName() {
    return priorityClassName;
  }


  public void setPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }


  public Template container(V1Container container) {
    
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Container getContainer() {
    return container;
  }


  public void setContainer(V1Container container) {
    this.container = container;
  }


  public Template serviceAccountName(String serviceAccountName) {
    
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * ServiceAccountName is the name of the ServiceAccount to use to run sensor pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
   * @return serviceAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ServiceAccountName is the name of the ServiceAccount to use to run sensor pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/")

  public String getServiceAccountName() {
    return serviceAccountName;
  }


  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  public Template nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public Template putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")

  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public Template priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * The priority value. Various system components use this field to find the priority of the EventSource pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The priority value. Various system components use this field to find the priority of the EventSource pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public Template affinity(V1Affinity affinity) {
    
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Affinity getAffinity() {
    return affinity;
  }


  public void setAffinity(V1Affinity affinity) {
    this.affinity = affinity;
  }


  public Template volumes(List<V1Volume> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public Template addVolumesItem(V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<V1Volume>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Volumes is a list of volumes that can be mounted by containers in a workflow.
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volumes is a list of volumes that can be mounted by containers in a workflow.")

  public List<V1Volume> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<V1Volume> volumes) {
    this.volumes = volumes;
  }


  public Template tolerations(List<V1Toleration> tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

  public Template addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<V1Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * If specified, the pod&#39;s tolerations.
   * @return tolerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the pod's tolerations.")

  public List<V1Toleration> getTolerations() {
    return tolerations;
  }


  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }


  public Template securityContext(V1PodSecurityContext securityContext) {
    
    this.securityContext = securityContext;
    return this;
  }

   /**
   * Get securityContext
   * @return securityContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PodSecurityContext getSecurityContext() {
    return securityContext;
  }


  public void setSecurityContext(V1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
  }


  public Template imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public Template addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<V1LocalObjectReference>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

   /**
   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
   * @return imagePullSecrets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod")

  public List<V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }


  public void setImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }


  public Template metadata(io.argoproj.events.models.common.Metadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.argoproj.events.models.common.Metadata getMetadata() {
    return metadata;
  }


  public void setMetadata(io.argoproj.events.models.common.Metadata metadata) {
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
    Template template = (Template) o;
    return Objects.equals(this.priorityClassName, template.priorityClassName) &&
        Objects.equals(this.container, template.container) &&
        Objects.equals(this.serviceAccountName, template.serviceAccountName) &&
        Objects.equals(this.nodeSelector, template.nodeSelector) &&
        Objects.equals(this.priority, template.priority) &&
        Objects.equals(this.affinity, template.affinity) &&
        Objects.equals(this.volumes, template.volumes) &&
        Objects.equals(this.tolerations, template.tolerations) &&
        Objects.equals(this.securityContext, template.securityContext) &&
        Objects.equals(this.imagePullSecrets, template.imagePullSecrets) &&
        Objects.equals(this.metadata, template.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityClassName, container, serviceAccountName, nodeSelector, priority, affinity, volumes, tolerations, securityContext, imagePullSecrets, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
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

