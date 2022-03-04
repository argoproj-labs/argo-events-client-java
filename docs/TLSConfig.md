

# TLSConfig

TLSConfig refers to TLS configuration for a client.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caCertSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**clientCertSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**clientKeySecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**insecureSkipVerify** | **Boolean** | If true, skips creation of TLSConfig with certs and creates an empty TLSConfig. (Defaults to false) |  [optional]



