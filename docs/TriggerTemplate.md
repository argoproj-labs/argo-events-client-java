

# TriggerTemplate

TriggerTemplate is the template that describes trigger specification.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kafka** | [**KafkaTrigger**](KafkaTrigger.md) |  |  [optional]
**http** | [**HTTPTrigger**](HTTPTrigger.md) |  |  [optional]
**name** | **String** | Name is a unique name of the action to take. | 
**nats** | [**NATSTrigger**](NATSTrigger.md) |  |  [optional]
**custom** | [**CustomTrigger**](CustomTrigger.md) |  |  [optional]
**awsLambda** | [**AWSLambdaTrigger**](AWSLambdaTrigger.md) |  |  [optional]
**openWhisk** | [**OpenWhiskTrigger**](OpenWhiskTrigger.md) |  |  [optional]
**_switch** | [**TriggerSwitch**](TriggerSwitch.md) |  |  [optional]
**argoWorkflow** | [**ArgoWorkflowTrigger**](ArgoWorkflowTrigger.md) |  |  [optional]
**k8s** | [**StandardK8STrigger**](StandardK8STrigger.md) |  |  [optional]
**conditions** | **String** | Conditions is the conditions to execute the trigger. For example: \&quot;(dep01 || dep02) &amp;&amp; dep04\&quot; |  [optional]
**slack** | [**SlackTrigger**](SlackTrigger.md) |  |  [optional]



