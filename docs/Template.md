

# Template

Template holds the information of a sensor deployment template
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**priorityClassName** | **String** | If specified, indicates the EventSource pod&#39;s priority. \&quot;system-node-critical\&quot; and \&quot;system-cluster-critical\&quot; are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/ |  [optional]
**container** | [**V1Container**](V1Container.md) |  |  [optional]
**serviceAccountName** | **String** | ServiceAccountName is the name of the ServiceAccount to use to run sensor pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/ |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/ |  [optional]
**priority** | **Integer** | The priority value. Various system components use this field to find the priority of the EventSource pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/ |  [optional]
**affinity** | [**V1Affinity**](V1Affinity.md) |  |  [optional]
**volumes** | [**List&lt;V1Volume&gt;**](V1Volume.md) | Volumes is a list of volumes that can be mounted by containers in a workflow. |  [optional]
**tolerations** | [**List&lt;V1Toleration&gt;**](V1Toleration.md) | If specified, the pod&#39;s tolerations. |  [optional]
**securityContext** | [**V1PodSecurityContext**](V1PodSecurityContext.md) |  |  [optional]
**imagePullSecrets** | [**List&lt;V1LocalObjectReference&gt;**](V1LocalObjectReference.md) | ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod |  [optional]
**metadata** | [**io.argoproj.events.models.common.Metadata**](io.argoproj.events.models.common.Metadata.md) |  |  [optional]



