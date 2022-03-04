

# AMQPQueueDeclareConfig

AMQPQueueDeclareConfig holds the configuration of a queue to hold messages and deliver to consumers. Declaring creates a queue if it doesn't already exist, or ensures that an existing queue matches the same parameters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exclusive** | **Boolean** | Exclusive sets the queues to be accessible only by the connection that declares them and will be deleted wgen the connection closes |  [optional]
**noWait** | **Boolean** | NowWait when true, the queue assumes to be declared on the server |  [optional]
**name** | **String** | Name of the queue. If empty the server auto-generates a unique name for this queue |  [optional]
**autoDelete** | **Boolean** | AutoDelete removes the queue when no consumers are active |  [optional]
**durable** | **Boolean** | Durable keeps the queue also after the server restarts |  [optional]
**arguments** | **String** | Arguments of a queue (also known as \&quot;x-arguments\&quot;) used for optional features and plugins |  [optional]



