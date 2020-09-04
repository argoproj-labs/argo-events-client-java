

# CustomTrigger

CustomTrigger refers to the specification of the custom trigger.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serverNameOverride** | **String** | ServerNameOverride for the secure connection between sensor and custom trigger gRPC server. |  [optional]
**secure** | **Boolean** | Secure refers to type of the connection between sensor to custom trigger gRPC | 
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  |  [optional]
**spec** | **Map&lt;String, String&gt;** | Spec is the custom trigger resource specification that custom trigger gRPC server knows how to interpret. | 
**certFilePath** | **String** | DeprecatedCertFilePath is path to the cert file within sensor for secure connection between sensor and custom trigger gRPC server. DEPRECATED: use CertSecret instead |  [optional]
**serverURL** | **String** | ServerURL is the url of the gRPC server that executes custom trigger | 
**certSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  | 



