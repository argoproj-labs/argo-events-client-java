

# AWSLambdaTrigger

AWSLambdaTrigger refers to specification of the trigger to invoke an AWS Lambda function
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**functionName** | **String** | FunctionName refers to the name of the function to invoke. | 
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Parameters is the list of key-value extracted from event&#39;s payload that are applied to the trigger resource. |  [optional]
**region** | **String** | Region is AWS region | 
**roleARN** | **String** | RoleARN is the Amazon Resource Name (ARN) of the role to assume. |  [optional]
**invocationType** | **String** | Choose from the following options.     * RequestResponse (default) - Invoke the function synchronously. Keep    the connection open until the function returns a response or times out.    The API response includes the function response and additional data.     * Event - Invoke the function asynchronously. Send events that fail multiple    times to the function&#39;s dead-letter queue (if it&#39;s configured). The API    response only includes a status code.     * DryRun - Validate parameter values and verify that the user or role    has permission to invoke the function. |  [optional]
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Payload is the list of key-value extracted from an event payload to construct the request payload. | 
**secretKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**accessKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]



