

# SNSEventSource

SNSEventSource refers to event-source for AWS SNS related events
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**webhook** | [**WebhookContext**](WebhookContext.md) |  |  [optional]
**secretKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**region** | **String** | Region is AWS region | 
**roleARN** | **String** | RoleARN is the Amazon Resource Name (ARN) of the role to assume. |  [optional]
**topicArn** | **String** | TopicArn | 
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



