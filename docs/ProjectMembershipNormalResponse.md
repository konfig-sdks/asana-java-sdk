

# ProjectMembershipNormalResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] |
|**parent** | [**ProjectCompact**](ProjectCompact.md) |  |  [optional] |
|**member** | [**MemberCompact**](MemberCompact.md) |  |  [optional] |
|**accessLevel** | [**AccessLevelEnum**](#AccessLevelEnum) | Whether the member has admin, editor, commenter, or viewer access to the project. |  [optional] [readonly] |
|**user** | [**UserCompact**](UserCompact.md) |  |  [optional] |
|**project** | [**ProjectCompact**](ProjectCompact.md) |  |  [optional] |
|**writeAccess** | [**WriteAccessEnum**](#WriteAccessEnum) | Whether the member has full access or comment-only access to the project. |  [optional] [readonly] |



## Enum: AccessLevelEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| EDITOR | &quot;editor&quot; |
| COMMENTER | &quot;commenter&quot; |
| VIEWER | &quot;viewer&quot; |



## Enum: WriteAccessEnum

| Name | Value |
|---- | -----|
| FULL_WRITE | &quot;full_write&quot; |
| COMMENT_ONLY | &quot;comment_only&quot; |



