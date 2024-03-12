

# ProjectMembershipCompact


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**parent** | [**ProjectCompact**](ProjectCompact.md) |  |  [optional] |
|**member** | [**MemberCompact**](MemberCompact.md) |  |  [optional] |
|**accessLevel** | [**AccessLevelEnum**](#AccessLevelEnum) | Whether the member has admin, editor, commenter, or viewer access to the project. |  [optional] [readonly] |



## Enum: AccessLevelEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| EDITOR | &quot;editor&quot; |
| COMMENTER | &quot;commenter&quot; |
| VIEWER | &quot;viewer&quot; |



