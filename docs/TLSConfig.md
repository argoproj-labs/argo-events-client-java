

# TLSConfig

TLSConfig refers to TLS configuration for a client.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientKeyPath** | **String** | DeprecatedClientKeyPath refers the file path that contains client key. Deprecated: will be removed in v1.5, use ClientKeySecret instead |  [optional]
**clientKeySecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**clientCertPath** | **String** | DeprecatedClientCertPath refers the file path that contains client cert. Deprecated: will be removed in v1.5, use ClientCertSecret instead |  [optional]
**caCertSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**caCertPath** | **String** | DeprecatedCACertPath refers the file path that contains the CA cert. Deprecated: will be removed in v1.5, use CACertSecret instead |  [optional]
**clientCertSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]



