

# OpenWhiskTrigger

OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authToken** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**actionName** | **String** | Name of the action/function. | 
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Parameters is the list of key-value extracted from event&#39;s payload that are applied to the trigger resource. |  [optional]
**namespace** | **String** | Namespace for the action. Defaults to \&quot;_\&quot;. |  [optional]
**host** | **String** | Host URL of the OpenWhisk. | 
**version** | **String** | Version for the API. Defaults to v1. |  [optional]
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Payload is the list of key-value extracted from an event payload to construct the request payload. | 



