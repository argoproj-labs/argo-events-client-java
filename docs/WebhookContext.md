

# WebhookContext

WebhookContext holds a general purpose REST API context
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint** | **String** | REST API endpoint | 
**authSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**serverKeySecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**method** | **String** | Method is HTTP request method that indicates the desired action to be performed for a given resource. See RFC7231 Hypertext Transfer Protocol (HTTP/1.1): Semantics and Content | 
**url** | **String** | URL is the url of the server. | 
**serverCertSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**port** | **String** | Port on which HTTP server is listening for incoming events. | 
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



