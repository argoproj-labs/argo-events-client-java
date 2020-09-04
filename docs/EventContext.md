

# EventContext

EventContext holds the context of the cloudevent received from an event source.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type - The type of the occurrence which has happened. | 
**source** | **String** | Source - A URI describing the event producer. | 
**time** | [**org.joda.time.DateTime**](V1Time.md) |  | 
**datacontenttype** | **String** | DataContentType - A MIME (RFC2046) string describing the media type of &#x60;data&#x60;. | 
**specversion** | **String** | SpecVersion - The version of the CloudEvents specification used by the event. | 
**id** | **String** | ID of the event; must be non-empty and unique within the scope of the producer. | 
**subject** | **String** | Subject - The subject of the event in the context of the event producer | 



