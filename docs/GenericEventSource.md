

# GenericEventSource

GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | URL of the gRPC server that implements the event source. | 
**insecure** | **Boolean** | Insecure determines the type of connection. |  [optional]
**config** | **String** | Config is the event source configuration | 
**jsonBody** | **Boolean** | JSONBody specifies that all event body payload coming from this source will be JSON |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



