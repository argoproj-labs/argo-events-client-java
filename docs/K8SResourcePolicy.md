

# K8SResourcePolicy

K8SResourcePolicy refers to the policy used to check the state of K8s based triggers using labels
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labels** | **Map&lt;String, String&gt;** | Labels required to identify whether a resource is in success state |  [optional]
**errorOnBackoffTimeout** | **Boolean** | ErrorOnBackoffTimeout determines whether sensor should transition to error state if the trigger policy is unable to determine the state of the resource | 
**backoff** | [**io.argoproj.events.models.common.Backoff**](io.argoproj.events.models.common.Backoff.md) |  | 



