

# SASLConfig

SASLConfig refers to SASL configuration for a client
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**passwordSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**userSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**mechanism** | **String** | SASLMechanism is the name of the enabled SASL mechanism. Possible values: OAUTHBEARER, PLAIN (defaults to PLAIN). |  [optional]



