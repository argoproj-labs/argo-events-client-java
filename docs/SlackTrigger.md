

# SlackTrigger

SlackTrigger refers to the specification of the slack notification trigger.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** | Message refers to the message to send to the Slack channel. |  [optional]
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Parameters is the list of key-value extracted from event&#39;s payload that are applied to the trigger resource. |  [optional]
**channel** | **String** | Channel refers to which Slack channel to send slack message. |  [optional]
**slackToken** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]



