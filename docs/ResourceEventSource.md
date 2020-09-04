

# ResourceEventSource

ResourceEventSource refers to a event-source for K8s resource related events.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource** | **String** |  | 
**namespace** | **String** | Namespace where resource is deployed | 
**group** | **String** |  | 
**filter** | [**ResourceFilter**](ResourceFilter.md) |  |  [optional]
**version** | **String** |  | 
**eventTypes** | **List&lt;String&gt;** | EventTypes is the list of event type to watch. Possible values are - ADD, UPDATE and DELETE. | 
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



