

# RedisEventSource

RedisEventSource describes an event source for the Redis PubSub. More info at https://godoc.org/github.com/go-redis/redis#example-PubSub
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tls** | [**io.argoproj.events.models.common.TLSConfig**](io.argoproj.events.models.common.TLSConfig.md) |  |  [optional]
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**db** | **Integer** | DB to use. If not specified, default DB 0 will be used. |  [optional]
**namespace** | **String** | Namespace to use to retrieve the password from. It should only be specified if password is declared |  [optional]
**channels** | **List&lt;String&gt;** |  | 
**hostAddress** | **String** | HostAddress refers to the address of the Redis host/server | 
**password** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



