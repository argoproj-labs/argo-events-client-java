

# PulsarTrigger

PulsarTrigger refers to the specification of the Pulsar trigger.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tls** | [**io.argoproj.events.models.common.TLSConfig**](io.argoproj.events.models.common.TLSConfig.md) |  |  [optional]
**connectionBackoff** | [**io.argoproj.events.models.common.Backoff**](io.argoproj.events.models.common.Backoff.md) |  |  [optional]
**authTokenSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Parameters is the list of parameters that is applied to resolved Kafka trigger object. |  [optional]
**url** | **String** | Configure the service URL for the Pulsar service. | 
**tlsValidateHostname** | **Boolean** | Whether the Pulsar client verify the validity of the host name from broker. |  [optional]
**topic** | **String** | Name of the topic. See https://pulsar.apache.org/docs/en/concepts-messaging/ | 
**tlsTrustCertsSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**tlsAllowInsecureConnection** | **Boolean** | Whether the Pulsar client accept untrusted TLS certificate from broker. |  [optional]
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Payload is the list of key-value extracted from an event payload to construct the request payload. | 



