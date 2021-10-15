

# EventDependencyFilter

EventDependencyFilter defines filters and constraints for a event.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exprs** | [**List&lt;ExprFilter&gt;**](ExprFilter.md) | Exprs contains the list of expressions evaluated against the event payload. |  [optional]
**data** | [**List&lt;DataFilter&gt;**](DataFilter.md) | Data filter constraints with escalation |  [optional]
**context** | [**EventContext**](EventContext.md) |  |  [optional]
**time** | [**TimeFilter**](TimeFilter.md) |  |  [optional]



