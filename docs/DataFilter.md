

# DataFilter

DataFilter describes constraints and filters for event data Regular Expressions are purposefully not a feature as they are overkill for our uses here See Rob Pike's Post: https://commandcenter.blogspot.com/2011/08/regular-expressions-in-lexing-and.html
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | **String** | Path is the JSONPath of the event&#39;s (JSON decoded) data key Path is a series of keys separated by a dot. A key may contain wildcard characters &#39;*&#39; and &#39;?&#39;. To access an array value use the index as the key. The dot and wildcard characters can be escaped with &#39;\\&#39;. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this. | 
**value** | **List&lt;String&gt;** | Value is the allowed string values for this key Booleans are passed using strconv.ParseBool() Numbers are parsed using as float64 using strconv.ParseFloat() Strings are taken as is Nils this value is ignored | 
**type** | **String** | Type contains the JSON type of the data | 
**template** | **String** | Template is a go-template for extracting a string from the event&#39;s data. A Template is evaluated with provided path, type and value. The templating follows the standard go-template syntax as well as sprig&#39;s extra functions. See https://pkg.go.dev/text/template and https://masterminds.github.io/sprig/ |  [optional]
**comparator** | **String** | Comparator compares the event data with a user given value. Can be \&quot;&gt;&#x3D;\&quot;, \&quot;&gt;\&quot;, \&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;&lt;\&quot;, or \&quot;&lt;&#x3D;\&quot;. Is optional, and if left blank treated as equality \&quot;&#x3D;\&quot;. |  [optional]



