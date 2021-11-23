

# StandardK8STrigger

StandardK8STrigger is the standard Kubernetes resource trigger
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**patchStrategy** | **String** | PatchStrategy controls the K8s object patching strategy when the trigger operation is specified as patch. possible values: \&quot;application/json-patch+json\&quot; \&quot;application/merge-patch+json\&quot; \&quot;application/strategic-merge-patch+json\&quot; \&quot;application/apply-patch+yaml\&quot;. Defaults to \&quot;application/merge-patch+json\&quot; |  [optional]
**liveObject** | **Boolean** | LiveObject specifies whether the resource should be directly fetched from K8s instead of being marshaled from the resource artifact. If set to true, the resource artifact must contain the information required to uniquely identify the resource in the cluster, that is, you must specify \&quot;apiVersion\&quot;, \&quot;kind\&quot; as well as \&quot;name\&quot; and \&quot;namespace\&quot; meta data. Only valid for operation type &#x60;update&#x60; |  [optional]
**operation** | **String** | Operation refers to the type of operation performed on the k8s resource. Default value is Create. |  [optional]
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Parameters is the list of parameters that is applied to resolved K8s trigger object. |  [optional]
**source** | [**ArtifactLocation**](ArtifactLocation.md) |  |  [optional]



