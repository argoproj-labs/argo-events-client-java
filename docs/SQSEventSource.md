

# SQSEventSource

SQSEventSource refers to event-source for AWS SQS related events
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**queue** | **String** | Queue is AWS SQS queue to listen to for messages | 
**endpoint** | **String** | Endpoint configures connection to a specific SQS endpoint instead of Amazons servers |  [optional]
**jsonBody** | **Boolean** | JSONBody specifies that all event body payload coming from this source will be JSON |  [optional]
**roleARN** | **String** | RoleARN is the Amazon Resource Name (ARN) of the role to assume. |  [optional]
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**dlq** | **Boolean** | DLQ specifies if a dead-letter queue is configured for messages that can&#39;t be processed successfully. If set to true, messages with invalid payload won&#39;t be acknowledged to allow to forward them farther to the dead-letter queue. The default value is false. |  [optional]
**queueAccountId** | **String** | QueueAccountID is the ID of the account that created the queue to monitor |  [optional]
**secretKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**waitTimeSeconds** | **Long** | WaitTimeSeconds is The duration (in seconds) for which the call waits for a message to arrive in the queue before returning. | 
**region** | **String** | Region is AWS region | 
**accessKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



