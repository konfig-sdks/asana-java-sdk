

# JobCompact


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**resourceSubtype** | **String** | The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of this job. The value is one of: &#x60;not_started&#x60;, &#x60;in_progress&#x60;, &#x60;succeeded&#x60;, or &#x60;failed&#x60;. |  [optional] [readonly] |
|**newProject** | [**ProjectCompact**](ProjectCompact.md) |  |  [optional] |
|**newTask** | [**TaskCompact**](TaskCompact.md) |  |  [optional] |
|**newProjectTemplate** | [**ProjectTemplateCompact**](ProjectTemplateCompact.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOT_STARTED | &quot;not_started&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| SUCCEEDED | &quot;succeeded&quot; |
| FAILED | &quot;failed&quot; |



