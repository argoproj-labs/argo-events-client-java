

# AMQPExchangeDeclareConfig

AMQPExchangeDeclareConfig holds the configuration for the exchange on the server
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**durable** | **Boolean** | Durable keeps the exchange also after the server restarts |  [optional]
**internal** | **Boolean** | Internal when true does not accept publishings |  [optional]
**noWait** | **Boolean** | NowWait when true does not wait for a confirmation from the server |  [optional]
**autoDelete** | **Boolean** | AutoDelete removes the exchange when no bindings are active |  [optional]



