

# OpenWhiskTrigger

OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authToken** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**actionName** | **String** | Name of the action/function. | 
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  |  [optional]
**namespace** | **String** | Namespace for the action. Defaults to \&quot;_\&quot;. |  [optional]
**host** | **String** | Host URL of the OpenWhisk. | 
**version** | **String** | Version for the API. Defaults to v1. |  [optional]
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  | 



