

# NATSEventsSource

NATSEventsSource refers to event-source for NATS related events
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tls** | [**io.argoproj.events.models.common.TLSConfig**](io.argoproj.events.models.common.TLSConfig.md) |  |  [optional]
**connectionBackoff** | [**io.argoproj.events.models.common.Backoff**](io.argoproj.events.models.common.Backoff.md) |  |  [optional]
**url** | **String** | URL to connect to NATS cluster | 
**jsonBody** | **Boolean** | JSONBody specifies that all event body payload coming from this source will be JSON |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]
**subject** | **String** | Subject holds the name of the subject onto which messages are published | 



