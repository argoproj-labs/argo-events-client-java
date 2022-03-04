

# NSQEventSource

NSQEventSource describes the event source for NSQ PubSub More info at https://godoc.org/github.com/nsqio/go-nsq
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tls** | [**io.argoproj.events.models.common.TLSConfig**](io.argoproj.events.models.common.TLSConfig.md) |  |  [optional]
**connectionBackoff** | [**io.argoproj.events.models.common.Backoff**](io.argoproj.events.models.common.Backoff.md) |  |  [optional]
**jsonBody** | **Boolean** | JSONBody specifies that all event body payload coming from this source will be JSON |  [optional]
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**topic** | **String** | Topic to subscribe to. | 
**hostAddress** | **String** | HostAddress is the address of the host for NSQ lookup | 
**channel** | **String** | Channel used for subscription | 
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



