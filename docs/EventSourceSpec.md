

# EventSourceSpec

EventSourceSpec refers to specification of event-source resource
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gitlab** | [**Map&lt;String, GitlabEventSource&gt;**](GitlabEventSource.md) | Gitlab event sources |  [optional]
**minio** | [**Map&lt;String, io.argoproj.events.models.common.S3Artifact&gt;**](io.argoproj.events.models.common.S3Artifact.md) | Minio event sources |  [optional]
**kafka** | [**Map&lt;String, KafkaEventSource&gt;**](KafkaEventSource.md) | Kafka event sources |  [optional]
**replica** | **Integer** | Replica is the gateway deployment replicas |  [optional]
**file** | [**Map&lt;String, FileEventSource&gt;**](FileEventSource.md) | File event sources |  [optional]
**nsq** | [**Map&lt;String, NSQEventSource&gt;**](NSQEventSource.md) | NSQ event source |  [optional]
**pulsar** | [**Map&lt;String, PulsarEventSource&gt;**](PulsarEventSource.md) | Pulsar event source |  [optional]
**calendar** | [**Map&lt;String, CalendarEventSource&gt;**](CalendarEventSource.md) | Calendar event sources |  [optional]
**hdfs** | [**Map&lt;String, HDFSEventSource&gt;**](HDFSEventSource.md) | HDFS event sources |  [optional]
**amqp** | [**Map&lt;String, AMQPEventSource&gt;**](AMQPEventSource.md) | AMQP event sources |  [optional]
**service** | [**Service**](Service.md) |  |  [optional]
**generic** | [**Map&lt;String, GenericEventSource&gt;**](GenericEventSource.md) | Generic event source |  [optional]
**redis** | [**Map&lt;String, RedisEventSource&gt;**](RedisEventSource.md) | Redis event source |  [optional]
**mqtt** | [**Map&lt;String, MQTTEventSource&gt;**](MQTTEventSource.md) | MQTT event sources |  [optional]
**template** | [**Template**](Template.md) |  |  [optional]
**sqs** | [**Map&lt;String, SQSEventSource&gt;**](SQSEventSource.md) | SQS event sources |  [optional]
**webhook** | [**Map&lt;String, WebhookContext&gt;**](WebhookContext.md) | Webhook event sources |  [optional]
**azureEventsHub** | [**Map&lt;String, AzureEventsHubEventSource&gt;**](AzureEventsHubEventSource.md) | AzureEventsHub event sources |  [optional]
**sns** | [**Map&lt;String, SNSEventSource&gt;**](SNSEventSource.md) | SNS event sources |  [optional]
**emitter** | [**Map&lt;String, EmitterEventSource&gt;**](EmitterEventSource.md) | Emitter event source |  [optional]
**pubSub** | [**Map&lt;String, PubSubEventSource&gt;**](PubSubEventSource.md) | PubSub eevnt sources |  [optional]
**github** | [**Map&lt;String, GithubEventSource&gt;**](GithubEventSource.md) | Github event sources |  [optional]
**resource** | [**Map&lt;String, ResourceEventSource&gt;**](ResourceEventSource.md) | Resource event sources |  [optional]
**slack** | [**Map&lt;String, SlackEventSource&gt;**](SlackEventSource.md) | Slack event sources |  [optional]
**eventBusName** | **String** | EventBusName references to a EventBus name. By default the value is \&quot;default\&quot; |  [optional]
**nats** | [**Map&lt;String, NATSEventsSource&gt;**](NATSEventsSource.md) | NATS event sources |  [optional]
**storageGrid** | [**Map&lt;String, StorageGridEventSource&gt;**](StorageGridEventSource.md) | StorageGrid event sources |  [optional]
**stripe** | [**Map&lt;String, StripeEventSource&gt;**](StripeEventSource.md) | Stripe event sources |  [optional]



