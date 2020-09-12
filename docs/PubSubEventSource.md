

# PubSubEventSource

PubSubEventSource refers to event-source for GCP PubSub related events.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**topicProjectID** | **String** | TopicProjectID identifies the project where the topic should exist or be created (assumed to be the same as ProjectID by default) | 
**projectID** | **String** | ProjectID is the unique identifier for your project on GCP | 
**deleteSubscriptionOnFinish** | **Boolean** | DeleteSubscriptionOnFinish determines whether to delete the GCP PubSub subscription once the event source is stopped. |  [optional]
**topic** | **String** | Topic on which a subscription will be created |  [optional]
**credentialSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**subscriptionID** | **String** | SubscriptionID is given then use it instead of creating a new one |  [optional]
**credentialsFile** | **String** | CredentialsFile is the file that contains credentials to authenticate for GCP Deprecated, use CredentialSecret instead | 
**jsonBody** | **Boolean** | JSONBody specifies that all event body payload coming from this source will be JSON |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



