

# HDFSEventSource

HDFSEventSource refers to event-source for HDFS related events
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**krbUsername** | **String** | KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used. |  [optional]
**addresses** | **List&lt;String&gt;** |  | 
**checkInterval** | **String** | CheckInterval is a string that describes an interval duration to check the directory state, e.g. 1s, 30m, 2h... (defaults to 1m) |  [optional]
**krbCCacheSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**krbRealm** | **String** | KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used. |  [optional]
**hdfsUser** | **String** | HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used. |  [optional]
**pathRegexp** | **String** | PathRegexp is regexp of relative path of object to watch with respect to the directory |  [optional]
**krbServicePrincipalName** | **String** | KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used. |  [optional]
**directory** | **String** | Directory to watch for events | 
**path** | **String** | Path is relative path of object to watch with respect to the directory |  [optional]
**krbKeytabSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**type** | **String** | Type of file operations to watch | 
**krbConfigConfigMap** | [**V1ConfigMapKeySelector**](V1ConfigMapKeySelector.md) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata holds the user defined metadata which will passed along the event payload. |  [optional]



