

# NativeStrategy

NativeStrategy indicates to install a native NATS service
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**antiAffinity** | **Boolean** |  |  [optional]
**securityContext** | [**V1PodSecurityContext**](V1PodSecurityContext.md) |  |  [optional]
**replicas** | **Integer** | Size is the NATS StatefulSet size |  [optional]
**maxAge** | **String** | Max Age of existing messages, i.e. \&quot;72h\&quot;, “4h35m” |  [optional]
**metricsContainerTemplate** | [**ContainerTemplate**](ContainerTemplate.md) |  |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/ |  [optional]
**auth** | **String** |  |  [optional]
**containerTemplate** | [**ContainerTemplate**](ContainerTemplate.md) |  |  [optional]
**tolerations** | [**List&lt;V1Toleration&gt;**](V1Toleration.md) | If specified, the pod&#39;s tolerations. |  [optional]
**persistence** | [**PersistenceStrategy**](PersistenceStrategy.md) |  |  [optional]
**metadata** | [**io.argoproj.events.models.common.Metadata**](io.argoproj.events.models.common.Metadata.md) |  |  [optional]



