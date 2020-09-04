

# SlackEventSource

SlackEventSource refers to event-source for Slack related events
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**signingSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**token** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**webhook** | [**WebhookContext**](WebhookContext.md) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



