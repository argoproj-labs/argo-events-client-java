

# PubSubEventSource

PubSubEventSource refers to event-source for GCP PubSub related events.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**topicProjectID** | **String** | TopicProjectID is GCP project ID for the topic. By default, it is same as ProjectID. |  [optional]
**projectID** | **String** | ProjectID is GCP project ID for the subscription. Required if you run Argo Events outside of GKE/GCE. (otherwise, the default value is its project) |  [optional]
**deleteSubscriptionOnFinish** | **Boolean** | DeleteSubscriptionOnFinish determines whether to delete the GCP PubSub subscription once the event source is stopped. |  [optional]
**topic** | **String** | Topic to which the subscription should belongs. Required if you want the eventsource to create a new subscription. If you specify this field along with an existing subscription, it will be verified whether it actually belongs to the specified topic. |  [optional]
**credentialSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**subscriptionID** | **String** | SubscriptionID is ID of subscription. Required if you use existing subscription. The default value will be auto generated hash based on this eventsource setting, so the subscription might be recreated every time you update the setting, which has a possibility of event loss. |  [optional]
**jsonBody** | **Boolean** | JSONBody specifies that all event body payload coming from this source will be JSON |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



