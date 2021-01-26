

# KafkaTrigger

KafkaTrigger refers to the specification of the Kafka trigger.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tls** | [**io.argoproj.events.models.common.TLSConfig**](io.argoproj.events.models.common.TLSConfig.md) |  |  [optional]
**partitioningKey** | **String** | The partitioning key for the messages put on the Kafka topic. Defaults to broker url. |  [optional]
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  |  [optional]
**url** | **String** | URL of the Kafka broker. | 
**partition** | **Integer** | Partition to write data to. | 
**compress** | **Boolean** | Compress determines whether to compress message or not. Defaults to false. If set to true, compresses message using snappy compression. |  [optional]
**topic** | **String** | Name of the topic. More info at https://kafka.apache.org/documentation/#intro_topics | 
**requiredAcks** | **Integer** | RequiredAcks used in producer to tell the broker how many replica acknowledgements Defaults to 1 (Only wait for the leader to ack). |  [optional]
**version** | **String** | Specify what kafka version is being connected to enables certain features in sarama, defaults to 1.0.0 |  [optional]
**flushFrequency** | **Integer** | FlushFrequency refers to the frequency in milliseconds to flush batches. Defaults to 500 milliseconds. |  [optional]
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  | 



