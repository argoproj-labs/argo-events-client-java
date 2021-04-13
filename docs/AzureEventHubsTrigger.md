

# AzureEventHubsTrigger

AzureEventHubsTrigger refers to specification of the Azure Event Hubs Trigger
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hubName** | **String** | HubName refers to the Azure Event Hub to send events to | 
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Parameters is the list of key-value extracted from event&#39;s payload that are applied to the trigger resource. |  [optional]
**fqdn** | **String** | FQDN refers to the namespace dns of Azure Event Hubs to be used i.e. &lt;namespace&gt;.servicebus.windows.net | 
**sharedAccessKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**sharedAccessKeyName** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  | 
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Payload is the list of key-value extracted from an event payload to construct the request payload. | 



