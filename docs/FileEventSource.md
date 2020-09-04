

# FileEventSource

FileEventSource describes an event-source for file related events.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | Type of file operations to watch Refer https://github.com/fsnotify/fsnotify/blob/master/fsnotify.go for more information | 
**watchPathConfig** | [**WatchPathConfig**](WatchPathConfig.md) |  | 
**polling** | **Boolean** | Use polling instead of inotify |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



