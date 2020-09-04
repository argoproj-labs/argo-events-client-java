

# S3Artifact

S3Artifact contains information about an S3 connection and bucket
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**secretKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  | 
**endpoint** | **String** |  | 
**insecure** | **Boolean** |  |  [optional]
**bucket** | [**S3Bucket**](S3Bucket.md) |  | 
**events** | **List&lt;String&gt;** |  |  [optional]
**filter** | [**S3Filter**](S3Filter.md) |  |  [optional]
**region** | **String** |  |  [optional]
**accessKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  | 
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]



