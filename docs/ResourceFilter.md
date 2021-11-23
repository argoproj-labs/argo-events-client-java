

# ResourceFilter

ResourceFilter contains K8s ObjectMeta information to further filter resource event objects
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fields** | [**List&lt;Selector&gt;**](Selector.md) | Fields provide field filters similar to K8s field selector (see https://kubernetes.io/docs/concepts/overview/working-with-objects/field-selectors/). Unlike K8s field selector, it supports arbitrary fileds like \&quot;spec.serviceAccountName\&quot;, and the value could be a string or a regex. Same as K8s field selector, operator \&quot;&#x3D;\&quot;, \&quot;&#x3D;&#x3D;\&quot; and \&quot;!&#x3D;\&quot; are supported. |  [optional]
**prefix** | **String** | Prefix filter is applied on the resource name. |  [optional]
**labels** | [**List&lt;Selector&gt;**](Selector.md) | Labels provide listing options to K8s API to watch resource/s. Refer https://kubernetes.io/docs/concepts/overview/working-with-objects/label-selectors/ for more info. |  [optional]
**afterStart** | **Boolean** | If the resource is created after the start time then the event is treated as valid. |  [optional]
**createdBy** | [**org.joda.time.DateTime**](V1Time.md) |  |  [optional]



