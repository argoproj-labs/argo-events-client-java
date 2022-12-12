

# BitbucketEventSource

BitbucketEventSource describes the event source for Bitbucket
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**repositorySlug** | **String** | RepositorySlug is a URL-friendly version of a repository name, automatically generated by Bitbucket for use in the URL. | 
**webhook** | [**WebhookContext**](WebhookContext.md) |  | 
**auth** | [**BitbucketAuth**](BitbucketAuth.md) |  | 
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**owner** | **String** | Owner of the repository. | 
**deleteHookOnFinish** | **Boolean** | DeleteHookOnFinish determines whether to delete the defined Bitbucket hook once the event source is stopped. |  [optional]
**events** | **List&lt;String&gt;** | Events this webhook is subscribed to. | 
**projectKey** | **String** | ProjectKey is the key of the project for which integration needs to setup | 
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will be passed along the event payload. |  [optional]


