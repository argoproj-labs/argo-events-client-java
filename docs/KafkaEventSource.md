

# KafkaEventSource

KafkaEventSource refers to event-source for Kafka related events
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tls** | [**io.argoproj.events.models.common.TLSConfig**](io.argoproj.events.models.common.TLSConfig.md) |  |  [optional]
**connectionBackoff** | [**io.argoproj.events.models.common.Backoff**](io.argoproj.events.models.common.Backoff.md) |  |  [optional]
**consumerGroup** | [**KafkaConsumerGroup**](KafkaConsumerGroup.md) |  |  [optional]
**jsonBody** | **Boolean** | JSONBody specifies that all event body payload coming from this source will be JSON |  [optional]
**partition** | **String** | Partition name | 
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**url** | **String** | URL to kafka cluster, multiple URLs separated by comma | 
**topic** | **String** | Topic name | 
**version** | **String** | Specify what kafka version is being connected to enables certain features in sarama, defaults to 1.0.0 |  [optional]
**sasl** | [**io.argoproj.events.models.common.SASLConfig**](io.argoproj.events.models.common.SASLConfig.md) |  |  [optional]
**limitEventsPerSecond** | **Long** | Sets a limit on how many events get read from kafka per second. |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



