

# GitlabEventSource

GitlabEventSource refers to event-source related to Gitlab events
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**secretToken** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**enableSSLVerification** | **Boolean** | EnableSSLVerification to enable ssl verification |  [optional]
**gitlabBaseURL** | **String** | GitlabBaseURL is the base URL for API requests to a custom endpoint | 
**webhook** | [**WebhookContext**](WebhookContext.md) |  |  [optional]
**projectID** | **String** | DeprecatedProjectID is the id of project for which integration needs to setup Deprecated: use Projects instead. Will be unsupported in v 1.7 | 
**deleteHookOnFinish** | **Boolean** | DeleteHookOnFinish determines whether to delete the GitLab hook for the project once the event source is stopped. |  [optional]
**events** | **List&lt;String&gt;** | Events are gitlab event to listen to. Refer https://github.com/xanzy/go-gitlab/blob/bf34eca5d13a9f4c3f501d8a97b8ac226d55e4d9/projects.go#L794. | 
**projects** | **List&lt;String&gt;** | List of project IDs or project namespace paths like \&quot;whynowy/test\&quot; |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



