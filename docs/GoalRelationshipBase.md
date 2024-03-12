

# GoalRelationshipBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**resourceSubtype** | [**ResourceSubtypeEnum**](#ResourceSubtypeEnum) | The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. |  [optional] [readonly] |
|**supportingResource** | [**ProjectCompact**](ProjectCompact.md) |  |  [optional] |
|**contributionWeight** | **Double** | The weight that the supporting resource&#39;s progress contributes to the supported goal&#39;s progress. This can only be 0 or 1. |  [optional] |
|**supportedGoal** | [**GoalCompact**](GoalCompact.md) |  |  [optional] |



## Enum: ResourceSubtypeEnum

| Name | Value |
|---- | -----|
| SUBGOAL | &quot;subgoal&quot; |
| SUPPORTING_WORK | &quot;supporting_work&quot; |



