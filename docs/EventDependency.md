

# EventDependency

EventDependency describes a dependency
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventSourceName** | **String** | EventSourceName is the name of EventSource that Sensor depends on | 
**transform** | [**EventDependencyTransformer**](EventDependencyTransformer.md) |  |  [optional]
**eventName** | **String** | EventName is the name of the event | 
**filters** | [**EventDependencyFilter**](EventDependencyFilter.md) |  |  [optional]
**filtersLogicalOperator** | **String** | FiltersLogicalOperator defines how different filters are evaluated together. Available values: and (&amp;&amp;), or (||) Is optional and if left blank treated as and (&amp;&amp;). |  [optional]
**name** | **String** | Name is a unique name of this dependency | 



