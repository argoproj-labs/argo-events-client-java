

# MQTTEventSource

MQTTEventSource refers to event-source for MQTT related events
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tls** | [**io.argoproj.events.models.common.TLSConfig**](io.argoproj.events.models.common.TLSConfig.md) |  |  [optional]
**connectionBackoff** | [**io.argoproj.events.models.common.Backoff**](io.argoproj.events.models.common.Backoff.md) |  |  [optional]
**url** | **String** | URL to connect to broker | 
**jsonBody** | **Boolean** | JSONBody specifies that all event body payload coming from this source will be JSON |  [optional]
**clientId** | **String** | ClientID is the id of the client | 
**topic** | **String** | Topic name | 
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



