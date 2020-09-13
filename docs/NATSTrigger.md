

# NATSTrigger

NATSTrigger refers to the specification of the NATS trigger.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tls** | [**io.argoproj.events.models.common.TLSConfig**](io.argoproj.events.models.common.TLSConfig.md) |  |  [optional]
**url** | **String** | URL of the NATS cluster. | 
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  | 
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  |  [optional]
**subject** | **String** | Name of the subject to put message on. | 



