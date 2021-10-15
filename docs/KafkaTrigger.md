

# KafkaTrigger

KafkaTrigger refers to the specification of the Kafka trigger.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tls** | [**io.argoproj.events.models.common.TLSConfig**](io.argoproj.events.models.common.TLSConfig.md) |  |  [optional]
**partitioningKey** | **String** | The partitioning key for the messages put on the Kafka topic. Defaults to broker url. |  [optional]
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Parameters is the list of parameters that is applied to resolved Kafka trigger object. |  [optional]
**url** | **String** | URL of the Kafka broker, multiple URLs separated by comma. | 
**partition** | **Integer** | Partition to write data to. | 
**compress** | **Boolean** | Compress determines whether to compress message or not. Defaults to false. If set to true, compresses message using snappy compression. |  [optional]
**topic** | **String** | Name of the topic. More info at https://kafka.apache.org/documentation/#intro_topics | 
**requiredAcks** | **Integer** | RequiredAcks used in producer to tell the broker how many replica acknowledgements Defaults to 1 (Only wait for the leader to ack). |  [optional]
**version** | **String** | Specify what kafka version is being connected to enables certain features in sarama, defaults to 1.0.0 |  [optional]
**flushFrequency** | **Integer** | FlushFrequency refers to the frequency in milliseconds to flush batches. Defaults to 500 milliseconds. |  [optional]
**sasl** | [**io.argoproj.events.models.common.SASLConfig**](io.argoproj.events.models.common.SASLConfig.md) |  |  [optional]
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Payload is the list of key-value extracted from an event payload to construct the request payload. | 



