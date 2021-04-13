

# CalendarEventSource

CalendarEventSource describes a time based dependency. One of the fields (schedule, interval, or recurrence) must be passed. Schedule takes precedence over interval; interval takes precedence over recurrence
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schedule** | **String** | Schedule is a cron-like expression. For reference, see: https://en.wikipedia.org/wiki/Cron | 
**interval** | **String** | Interval is a string that describes an interval duration, e.g. 1s, 30m, 2h... | 
**timezone** | **String** | Timezone in which to run the schedule |  [optional]
**userPayload** | **byte[]** | UserPayload will be sent to sensor as extra data once the event is triggered Deprecated: will be removed in v1.5. Please use Metadata instead. |  [optional]
**exclusionDates** | **List&lt;String&gt;** |  |  [optional]
**persistence** | [**EventPersistence**](EventPersistence.md) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



