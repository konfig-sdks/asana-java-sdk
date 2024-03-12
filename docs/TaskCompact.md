

# TaskCompact


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**name** | **String** | The name of the task. |  [optional] |
|**resourceSubtype** | [**ResourceSubtypeEnum**](#ResourceSubtypeEnum) | The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The resource_subtype &#x60;milestone&#x60; represent a single moment in time. This means tasks with this subtype cannot have a start_date. |  [optional] |
|**createdBy** | [**TaskCompactAllOfCreatedBy**](TaskCompactAllOfCreatedBy.md) |  |  [optional] |



## Enum: ResourceSubtypeEnum

| Name | Value |
|---- | -----|
| DEFAULT_TASK | &quot;default_task&quot; |
| MILESTONE | &quot;milestone&quot; |
| SECTION | &quot;section&quot; |
| APPROVAL | &quot;approval&quot; |



