

# TriggerTemplate

TriggerTemplate is the template that describes trigger specification.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**azureEventHubs** | [**AzureEventHubsTrigger**](AzureEventHubsTrigger.md) |  |  [optional]
**k8s** | [**StandardK8STrigger**](StandardK8STrigger.md) |  |  [optional]
**http** | [**HTTPTrigger**](HTTPTrigger.md) |  |  [optional]
**log** | [**LogTrigger**](LogTrigger.md) |  |  [optional]
**nats** | [**NATSTrigger**](NATSTrigger.md) |  |  [optional]
**custom** | [**CustomTrigger**](CustomTrigger.md) |  |  [optional]
**openWhisk** | [**OpenWhiskTrigger**](OpenWhiskTrigger.md) |  |  [optional]
**_switch** | [**TriggerSwitch**](TriggerSwitch.md) |  |  [optional]
**kafka** | [**KafkaTrigger**](KafkaTrigger.md) |  |  [optional]
**slack** | [**SlackTrigger**](SlackTrigger.md) |  |  [optional]
**argoWorkflow** | [**ArgoWorkflowTrigger**](ArgoWorkflowTrigger.md) |  |  [optional]
**awsLambda** | [**AWSLambdaTrigger**](AWSLambdaTrigger.md) |  |  [optional]
**conditions** | **String** | Conditions is the conditions to execute the trigger. For example: \&quot;(dep01 || dep02) &amp;&amp; dep04\&quot; |  [optional]
**name** | **String** | Name is a unique name of the action to take. | 



