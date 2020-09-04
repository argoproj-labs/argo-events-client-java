

# NativeStrategy

NativeStrategy indicates to install a native NATS service
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**antiAffinity** | **Boolean** |  |  [optional]
**replicas** | **Integer** | Size is the NATS StatefulSet size |  [optional]
**auth** | **String** |  |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/ |  [optional]
**metricsContainerTemplate** | [**ContainerTemplate**](ContainerTemplate.md) |  |  [optional]
**containerTemplate** | [**ContainerTemplate**](ContainerTemplate.md) |  |  [optional]
**tolerations** | [**List&lt;V1Toleration&gt;**](V1Toleration.md) | If specified, the pod&#39;s tolerations. |  [optional]
**persistence** | [**PersistenceStrategy**](PersistenceStrategy.md) |  |  [optional]



