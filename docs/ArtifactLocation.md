

# ArtifactLocation

ArtifactLocation describes the source location for an external artifact
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configmap** | [**V1ConfigMapKeySelector**](V1ConfigMapKeySelector.md) |  |  [optional]
**git** | [**GitArtifact**](GitArtifact.md) |  |  [optional]
**resource** | [**java.lang.Object**](java.lang.Object.md) |  |  [optional]
**s3** | [**io.argoproj.events.models.common.S3Artifact**](io.argoproj.events.models.common.S3Artifact.md) |  |  [optional]
**url** | [**URLArtifact**](URLArtifact.md) |  |  [optional]
**file** | [**FileArtifact**](FileArtifact.md) |  |  [optional]
**inline** | **String** | Inline artifact is embedded in sensor spec as a string |  [optional]



