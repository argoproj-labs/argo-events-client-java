

# GithubEventSource

GithubEventSource refers to event-source for github related events
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**insecure** | **Boolean** | Insecure tls verification |  [optional]
**organizations** | **List&lt;String&gt;** | Organizations holds the names of organizations (used for organization level webhooks). Not required if Repositories is set. |  [optional]
**contentType** | **String** | ContentType of the event delivery |  [optional]
**repository** | **String** | DeprecatedRepository refers to GitHub repo name i.e. argo-events Deprecated: use Repositories instead. Will be unsupported in v 1.6 |  [optional]
**githubUploadURL** | **String** | GitHub upload URL (for GitHub Enterprise) |  [optional]
**webhook** | [**WebhookContext**](WebhookContext.md) |  |  [optional]
**id** | **Long** | Id is the webhook&#39;s id Deprecated: This is not used at all, will be removed in v1.6 |  [optional]
**repositories** | [**List&lt;OwnedRepositories&gt;**](OwnedRepositories.md) | Repositories holds the information of repositories, which uses repo owner as the key, and list of repo names as the value. Not required if Organizations is set. |  [optional]
**apiToken** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**owner** | **String** | DeprecatedOwner refers to GitHub owner name i.e. argoproj Deprecated: use Repositories instead. Will be unsupported in v 1.6 |  [optional]
**githubBaseURL** | **String** | GitHub base URL (for GitHub Enterprise) |  [optional]
**githubApp** | [**GithubAppCreds**](GithubAppCreds.md) |  |  [optional]
**active** | **Boolean** | Active refers to status of the webhook for event deliveries. https://developer.github.com/webhooks/creating/#active |  [optional]
**deleteHookOnFinish** | **Boolean** | DeleteHookOnFinish determines whether to delete the GitHub hook for the repository once the event source is stopped. |  [optional]
**events** | **List&lt;String&gt;** | Events refer to Github events to which the event source will subscribe | 
**webhookSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



