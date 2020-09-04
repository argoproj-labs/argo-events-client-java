

# StripeEventSource

StripeEventSource describes the event source for stripe webhook notifications More info at https://stripe.com/docs/webhooks
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createWebhook** | **Boolean** | CreateWebhook if specified creates a new webhook programmatically. |  [optional]
**apiKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**webhook** | [**WebhookContext**](WebhookContext.md) |  |  [optional]
**eventFilter** | **List&lt;String&gt;** | EventFilter describes the type of events to listen to. If not specified, all types of events will be processed. More info at https://stripe.com/docs/api/events/list |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



