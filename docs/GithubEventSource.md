

# GithubEventSource

GithubEventSource refers to event-source for github related events
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**insecure** | **Boolean** | Insecure tls verification |  [optional]
**webhookSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**contentType** | **String** | ContentType of the event delivery |  [optional]
**repository** | **String** | Repository refers to GitHub repo name i.e. argo-events | 
**githubUploadURL** | **String** | GitHub upload URL (for GitHub Enterprise) |  [optional]
**id** | **Long** | Id is the webhook&#39;s id | 
**webhook** | [**WebhookContext**](WebhookContext.md) |  |  [optional]
**apiToken** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**owner** | **String** | Owner refers to GitHub owner name i.e. argoproj | 
**githubBaseURL** | **String** | GitHub base URL (for GitHub Enterprise) |  [optional]
**active** | **Boolean** | Active refers to status of the webhook for event deliveries. https://developer.github.com/webhooks/creating/#active |  [optional]
**deleteHookOnFinish** | **Boolean** | DeleteHookOnFinish determines whether to delete the GitHub hook for the repository once the event source is stopped. |  [optional]
**events** | **List&lt;String&gt;** |  | 
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



