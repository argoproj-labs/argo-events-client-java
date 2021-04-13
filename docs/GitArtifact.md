

# GitArtifact

GitArtifact contains information about an artifact stored in git
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**remote** | [**GitRemoteConfig**](GitRemoteConfig.md) |  |  [optional]
**filePath** | **String** | Path to file that contains trigger resource definition | 
**url** | **String** | Git URL | 
**sshKeyPath** | **String** | DeprecatedSSHKeyPath is path to your ssh key path. Use this if you don&#39;t want to provide username and password. ssh key path must be mounted in sensor pod. Deprecated: will be removed in v1.5, use SSHKeySecret instead. |  [optional]
**tag** | **String** | Tag to use to pull trigger resource |  [optional]
**sshKeySecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**cloneDirectory** | **String** | Directory to clone the repository. We clone complete directory because GitArtifact is not limited to any specific Git service providers. Hence we don&#39;t use any specific git provider client. | 
**branch** | **String** | Branch to use to pull trigger resource |  [optional]
**ref** | **String** | Ref to use to pull trigger resource. Will result in a shallow clone and fetch. |  [optional]
**creds** | [**GitCreds**](GitCreds.md) |  |  [optional]



