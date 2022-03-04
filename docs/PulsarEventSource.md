

# PulsarEventSource

PulsarEventSource describes the event source for Apache Pulsar
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tls** | [**io.argoproj.events.models.common.TLSConfig**](io.argoproj.events.models.common.TLSConfig.md) |  |  [optional]
**connectionBackoff** | [**io.argoproj.events.models.common.Backoff**](io.argoproj.events.models.common.Backoff.md) |  |  [optional]
**tlsAllowInsecureConnection** | **Boolean** | Whether the Pulsar client accept untrusted TLS certificate from broker. |  [optional]
**url** | **String** | Configure the service URL for the Pulsar service. | 
**jsonBody** | **Boolean** | JSONBody specifies that all event body payload coming from this source will be JSON |  [optional]
**topics** | **List&lt;String&gt;** | Name of the topics to subscribe to. | 
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**tlsTrustCertsSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**authTokenSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**type** | **String** | Type of the subscription. Only \&quot;exclusive\&quot; and \&quot;shared\&quot; is supported. Defaults to exclusive. |  [optional]
**tlsValidateHostname** | **Boolean** | Whether the Pulsar client verify the validity of the host name from broker. |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



