

# ResourceFilter

ResourceFilter contains K8 ObjectMeta information to further filter resource event objects
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fields** | [**List&lt;Selector&gt;**](Selector.md) | Fields provide listing options to K8s API to watch resource/s. Refer https://kubernetes.io/docs/concepts/overview/working-with-objects/field-selectors/ for more info. |  [optional]
**prefix** | **String** | Prefix filter is applied on the resource name. |  [optional]
**labels** | [**List&lt;Selector&gt;**](Selector.md) | Labels provide listing options to K8s API to watch resource/s. Refer https://kubernetes.io/docs/concepts/overview/working-with-objects/label-selectors/ for more info. |  [optional]
**afterStart** | **Boolean** | If the resource is created after the start time then the event is treated as valid. |  [optional]
**createdBy** | [**org.joda.time.DateTime**](V1Time.md) |  |  [optional]



