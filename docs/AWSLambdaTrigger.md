

# AWSLambdaTrigger

AWSLambdaTrigger refers to specification of the trigger to invoke an AWS Lambda function
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**functionName** | **String** | FunctionName refers to the name of the function to invoke. | 
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  |  [optional]
**region** | **String** | Region is AWS region | 
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  | 
**secretKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**accessKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]



