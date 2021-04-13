

# SensorSpec

SensorSpec represents desired sensor state
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template** | [**Template**](Template.md) |  |  [optional]
**replicas** | **Integer** | Replicas is the sensor deployment replicas |  [optional]
**eventBusName** | **String** | EventBusName references to a EventBus name. By default the value is \&quot;default\&quot; |  [optional]
**dependencies** | [**List&lt;EventDependency&gt;**](EventDependency.md) | Dependencies is a list of the events that this sensor is dependent on. | 
**circuit** | **String** | Circuit is a boolean expression of dependency groups Deprecated: will be removed in v1.5, use Switch in triggers instead. |  [optional]
**dependencyGroups** | [**List&lt;DependencyGroup&gt;**](DependencyGroup.md) | DependencyGroups is a list of the groups of events. |  [optional]
**errorOnFailedRound** | **Boolean** | ErrorOnFailedRound if set to true, marks sensor state as &#x60;error&#x60; if the previous trigger round fails. Once sensor state is set to &#x60;error&#x60;, no further triggers will be processed. |  [optional]
**triggers** | [**List&lt;Trigger&gt;**](Trigger.md) | Triggers is a list of the things that this sensor evokes. These are the outputs from this sensor. | 



