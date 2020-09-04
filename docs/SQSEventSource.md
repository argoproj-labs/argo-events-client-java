

# SQSEventSource

SQSEventSource refers to event-source for AWS SQS related events
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**secretKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**queueAccountId** | **String** | QueueAccountID is the ID of the account that created the queue to monitor |  [optional]
**region** | **String** | Region is AWS region | 
**roleARN** | **String** | RoleARN is the Amazon Resource Name (ARN) of the role to assume. |  [optional]
**queue** | **String** | Queue is AWS SQS queue to listen to for messages | 
**waitTimeSeconds** | **Long** | WaitTimeSeconds is The duration (in seconds) for which the call waits for a message to arrive in the queue before returning. | 
**jsonBody** | **Boolean** | JSONBody specifies that all event body payload coming from this source will be JSON |  [optional]
**accessKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



