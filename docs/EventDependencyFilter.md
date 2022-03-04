

# EventDependencyFilter

EventDependencyFilter defines filters and constraints for a event.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exprLogicalOperator** | **String** | ExprLogicalOperator defines how multiple Exprs filters (if defined) are evaluated together. Available values: and (&amp;&amp;), or (||) Is optional and if left blank treated as and (&amp;&amp;). |  [optional]
**dataLogicalOperator** | **String** | DataLogicalOperator defines how multiple Data filters (if defined) are evaluated together. Available values: and (&amp;&amp;), or (||) Is optional and if left blank treated as and (&amp;&amp;). |  [optional]
**exprs** | [**List&lt;ExprFilter&gt;**](ExprFilter.md) | Exprs contains the list of expressions evaluated against the event payload. |  [optional]
**context** | [**EventContext**](EventContext.md) |  |  [optional]
**time** | [**TimeFilter**](TimeFilter.md) |  |  [optional]
**data** | [**List&lt;DataFilter&gt;**](DataFilter.md) | Data filter constraints with escalation |  [optional]



