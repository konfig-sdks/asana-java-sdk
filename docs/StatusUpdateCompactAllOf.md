

# StatusUpdateCompactAllOf

A *status update* is an update on the progress of a particular project, portfolio, or goal, and is sent out to all of its parent's followers when created. These updates include both text describing the update and a `status_type` intended to represent the overall state of the project.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the status update. |  [optional] |
|**resourceSubtype** | [**ResourceSubtypeEnum**](#ResourceSubtypeEnum) | The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The &#x60;resource_subtype&#x60;s for &#x60;status&#x60; objects represent the type of their parent. |  [optional] [readonly] |



## Enum: ResourceSubtypeEnum

| Name | Value |
|---- | -----|
| PROJECT_STATUS_UPDATE | &quot;project_status_update&quot; |
| PORTFOLIO_STATUS_UPDATE | &quot;portfolio_status_update&quot; |
| GOAL_STATUS_UPDATE | &quot;goal_status_update&quot; |



