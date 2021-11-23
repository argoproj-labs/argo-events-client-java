

# SensorSpec

SensorSpec represents desired sensor state
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventBusName** | **String** | EventBusName references to a EventBus name. By default the value is \&quot;default\&quot; |  [optional]
**triggers** | [**List&lt;Trigger&gt;**](Trigger.md) | Triggers is a list of the things that this sensor evokes. These are the outputs from this sensor. | 
**replicas** | **Integer** | Replicas is the sensor deployment replicas |  [optional]
**dependencies** | [**List&lt;EventDependency&gt;**](EventDependency.md) | Dependencies is a list of the events that this sensor is dependent on. | 
**template** | [**Template**](Template.md) |  |  [optional]
**errorOnFailedRound** | **Boolean** | ErrorOnFailedRound if set to true, marks sensor state as &#x60;error&#x60; if the previous trigger round fails. Once sensor state is set to &#x60;error&#x60;, no further triggers will be processed. |  [optional]



