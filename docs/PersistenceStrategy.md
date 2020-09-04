

# PersistenceStrategy

PersistenceStrategy defines the strategy of persistence
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storageClassName** | **String** | Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1 |  [optional]
**accessMode** | **String** | Available access modes such as ReadWriteOnce, ReadWriteMany https://kubernetes.io/docs/concepts/storage/persistent-volumes/#access-modes |  [optional]
**volumeSize** | [**io.kubernetes.client.custom.Quantity**](ResourceQuantity.md) |  |  [optional]



