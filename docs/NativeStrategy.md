

# NativeStrategy

NativeStrategy indicates to install a native NATS service
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**raftCommitTimeout** | **String** | Specifies the time without an Apply() operation before sending an heartbeat to ensure timely commit, i.e. \&quot;72h\&quot;, “4h35m”. Defaults to 100ms |  [optional]
**maxSubs** | **Long** | Maximum number of subscriptions per channel, 0 means unlimited. Defaults to 1000 |  [optional]
**maxAge** | **String** | Max Age of existing messages, i.e. \&quot;72h\&quot;, “4h35m” |  [optional]
**containerTemplate** | [**ContainerTemplate**](ContainerTemplate.md) |  |  [optional]
**raftElectionTimeout** | **String** | Specifies the time in candidate state without a leader before attempting an election, i.e. \&quot;72h\&quot;, “4h35m”. Defaults to 2s |  [optional]
**priorityClassName** | **String** | If specified, indicates the EventSource pod&#39;s priority. \&quot;system-node-critical\&quot; and \&quot;system-cluster-critical\&quot; are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/ |  [optional]
**raftLeaseTimeout** | **String** | Specifies how long a leader waits without being able to contact a quorum of nodes before stepping down as leader, i.e. \&quot;72h\&quot;, “4h35m”. Defaults to 1s |  [optional]
**securityContext** | [**V1PodSecurityContext**](V1PodSecurityContext.md) |  |  [optional]
**metricsContainerTemplate** | [**ContainerTemplate**](ContainerTemplate.md) |  |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/ |  [optional]
**priority** | **Integer** | The priority value. Various system components use this field to find the priority of the EventSource pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. More info: https://kubernetes.io/docs/concepts/configuration/pod-priority-preemption/ |  [optional]
**affinity** | [**V1Affinity**](V1Affinity.md) |  |  [optional]
**tolerations** | [**List&lt;V1Toleration&gt;**](V1Toleration.md) | If specified, the pod&#39;s tolerations. |  [optional]
**persistence** | [**PersistenceStrategy**](PersistenceStrategy.md) |  |  [optional]
**metadata** | [**io.argoproj.events.models.common.Metadata**](io.argoproj.events.models.common.Metadata.md) |  |  [optional]
**serviceAccountName** | **String** | ServiceAccountName to apply to NATS StatefulSet |  [optional]
**replicas** | **Integer** | Size is the NATS StatefulSet size |  [optional]
**auth** | **String** |  |  [optional]
**maxBytes** | **String** | Total size of messages per channel, 0 means unlimited. Defaults to 1GB |  [optional]
**maxPayload** | **String** | Maximum number of bytes in a message payload, 0 means unlimited. Defaults to 1MB |  [optional]
**maxMsgs** | **Long** | Maximum number of messages per channel, 0 means unlimited. Defaults to 1000000 |  [optional]
**raftHeartbeatTimeout** | **String** | Specifies the time in follower state without a leader before attempting an election, i.e. \&quot;72h\&quot;, “4h35m”. Defaults to 2s |  [optional]
**imagePullSecrets** | [**List&lt;V1LocalObjectReference&gt;**](V1LocalObjectReference.md) | ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod |  [optional]



