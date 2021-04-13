

# HTTPTrigger

HTTPTrigger is the trigger for the HTTP request
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tls** | [**io.argoproj.events.models.common.TLSConfig**](io.argoproj.events.models.common.TLSConfig.md) |  |  [optional]
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  |  [optional]
**url** | **String** | URL refers to the URL to send HTTP request to. | 
**basicAuth** | [**io.argoproj.events.models.common.BasicAuth**](io.argoproj.events.models.common.BasicAuth.md) |  |  [optional]
**method** | **String** | Method refers to the type of the HTTP request. Refer https://golang.org/src/net/http/method.go for more info. Default value is POST. |  [optional]
**headers** | **Map&lt;String, String&gt;** | Headers for the HTTP request. |  [optional]
**timeout** | **Long** | Timeout refers to the HTTP request timeout in seconds. Default value is 60 seconds. |  [optional]
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  | 



