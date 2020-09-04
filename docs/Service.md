

# Service

Service holds the service information eventsource exposes
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterIP** | **String** | clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are \&quot;None\&quot;, empty string (\&quot;\&quot;), or a valid IP address. \&quot;None\&quot; can be specified for headless services when proxying is not required. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies |  [optional]
**ports** | [**List&lt;V1ServicePort&gt;**](V1ServicePort.md) | The list of ports that are exposed by this ClusterIP service. |  [optional]



