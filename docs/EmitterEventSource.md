

# EmitterEventSource

EmitterEventSource describes the event source for emitter More info at https://emitter.io/develop/getting-started/
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tls** | [**io.argoproj.events.models.common.TLSConfig**](io.argoproj.events.models.common.TLSConfig.md) |  |  [optional]
**connectionBackoff** | [**io.argoproj.events.models.common.Backoff**](io.argoproj.events.models.common.Backoff.md) |  |  [optional]
**password** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**jsonBody** | **Boolean** | JSONBody specifies that all event body payload coming from this source will be JSON |  [optional]
**broker** | **String** | Broker URI to connect to. | 
**username** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**channelName** | **String** | ChannelName refers to the channel name | 
**channelKey** | **String** | ChannelKey refers to the channel key | 
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



