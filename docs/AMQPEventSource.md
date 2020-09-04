

# AMQPEventSource

AMQPEventSource refers to an event-source for AMQP stream events
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tls** | [**io.argoproj.events.models.common.TLSConfig**](io.argoproj.events.models.common.TLSConfig.md) |  |  [optional]
**connectionBackoff** | [**io.argoproj.events.models.common.Backoff**](io.argoproj.events.models.common.Backoff.md) |  |  [optional]
**routingKey** | **String** | Routing key for bindings | 
**url** | **String** | URL for rabbitmq service | 
**jsonBody** | **Boolean** | JSONBody specifies that all event body payload coming from this source will be JSON |  [optional]
**exchangeName** | **String** | ExchangeName is the exchange name For more information, visit https://www.rabbitmq.com/tutorials/amqp-concepts.html | 
**exchangeType** | **String** | ExchangeType is rabbitmq exchange type | 
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



