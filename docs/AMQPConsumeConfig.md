

# AMQPConsumeConfig

AMQPConsumeConfig holds the configuration to immediately starts delivering queued messages
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exclusive** | **Boolean** | Exclusive when true, the server will ensure that this is the sole consumer from this queue |  [optional]
**consumerTag** | **String** | ConsumerTag is the identity of the consumer included in every delivery |  [optional]
**noWait** | **Boolean** | NowWait when true, do not wait for the server to confirm the request and immediately begin deliveries |  [optional]
**noLocal** | **Boolean** | NoLocal flag is not supported by RabbitMQ |  [optional]
**autoAck** | **Boolean** | AutoAck when true, the server will acknowledge deliveries to this consumer prior to writing the delivery to the network |  [optional]



