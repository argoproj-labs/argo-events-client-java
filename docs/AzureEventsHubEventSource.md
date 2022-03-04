

# AzureEventsHubEventSource

AzureEventsHubEventSource describes the event source for azure events hub More info at https://docs.microsoft.com/en-us/azure/event-hubs/
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hubName** | **String** | Event Hub path/name | 
**fqdn** | **String** | FQDN of the EventHubs namespace you created More info at https://docs.microsoft.com/en-us/azure/event-hubs/event-hubs-get-connection-string | 
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**sharedAccessKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**sharedAccessKeyName** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



