

# NATSConfig

NATSConfig holds the config of NATS
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | NATS host url |  [optional]
**accessSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**clusterID** | **String** | Cluster ID for nats streaming, if it&#39;s missing, treat it as NATS server |  [optional]
**auth** | **String** | Auth strategy, default to AuthStrategyNone |  [optional]



