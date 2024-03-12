

# GoalMembershipBaseAllOf

This object represents a user's connection to a goal.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourceType** | **String** | The base type of this resource. |  [optional] |
|**resourceSubtype** | **String** | The type of membership. |  [optional] [readonly] |
|**member** | [**MemberCompact**](MemberCompact.md) |  |  [optional] |
|**parent** | [**GoalCompact**](GoalCompact.md) |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | Describes if the member is a commenter or editor in goal. |  [optional] |
|**goal** | [**GoalCompact**](GoalCompact.md) |  |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| COMMENTER | &quot;commenter&quot; |
| EDITOR | &quot;editor&quot; |



