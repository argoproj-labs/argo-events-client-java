

# ArgoWorkflowTrigger

ArgoWorkflowTrigger is the trigger for the Argo Workflow
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | [**ArtifactLocation**](ArtifactLocation.md) |  |  [optional]
**operation** | **String** | Operation refers to the type of operation performed on the argo workflow resource. Default value is Submit. |  [optional]
**args** | **List&lt;String&gt;** | Args is the list of arguments to pass to the argo CLI |  [optional]
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Parameters is the list of parameters to pass to resolved Argo Workflow object |  [optional]



