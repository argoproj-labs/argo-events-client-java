

# BitbucketServerEventSource

BitbucketServerEventSource refers to event-source related to Bitbucket Server events
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**repositorySlug** | **String** | RepositorySlug is the slug of the repository for which integration needs to setup | 
**accessToken** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**webhookSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**webhook** | [**WebhookContext**](WebhookContext.md) |  |  [optional]
**bitbucketserverBaseURL** | **String** | BitbucketServerBaseURL is the base URL for API requests to a custom endpoint | 
**deleteHookOnFinish** | **Boolean** | DeleteHookOnFinish determines whether to delete the Bitbucket Server hook for the project once the event source is stopped. |  [optional]
**events** | **List&lt;String&gt;** | Events are bitbucket event to listen to. Refer https://confluence.atlassian.com/bitbucketserver/event-payload-938025882.html | 
**projectKey** | **String** | ProjectKey is the key of project for which integration needs to setup | 
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



