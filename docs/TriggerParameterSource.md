

# TriggerParameterSource

TriggerParameterSource defines the source for a parameter from a event event
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencyName** | **String** | DependencyName refers to the name of the dependency. The event which is stored for this dependency is used as payload for the parameterization. Make sure to refer to one of the dependencies you have defined under Dependencies list. | 
**value** | **String** | Value is the default literal value to use for this parameter source This is only used if the DataKey is invalid. If the DataKey is invalid and this is not defined, this param source will produce an error. |  [optional]
**contextTemplate** | **String** | ContextTemplate is a go-template for extracting a string from the event&#39;s context. If a ContextTemplate is provided with a ContextKey, the template will be evaluated first and fallback to the ContextKey. The templating follows the standard go-template syntax as well as sprig&#39;s extra functions. See https://pkg.go.dev/text/template and https://masterminds.github.io/sprig/ |  [optional]
**contextKey** | **String** | ContextKey is the JSONPath of the event&#39;s (JSON decoded) context key ContextKey is a series of keys separated by a dot. A key may contain wildcard characters &#39;*&#39; and &#39;?&#39;. To access an array value use the index as the key. The dot and wildcard characters can be escaped with &#39;\\&#39;. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this. |  [optional]
**dataKey** | **String** | DataKey is the JSONPath of the event&#39;s (JSON decoded) data key DataKey is a series of keys separated by a dot. A key may contain wildcard characters &#39;*&#39; and &#39;?&#39;. To access an array value use the index as the key. The dot and wildcard characters can be escaped with &#39;\\&#39;. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this. |  [optional]
**dataTemplate** | **String** | DataTemplate is a go-template for extracting a string from the event&#39;s data. If a DataTemplate is provided with a DataKey, the template will be evaluated first and fallback to the DataKey. The templating follows the standard go-template syntax as well as sprig&#39;s extra functions. See https://pkg.go.dev/text/template and https://masterminds.github.io/sprig/ |  [optional]



