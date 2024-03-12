

# ProjectMembershipNormalResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**user** | [**UserCompact**](UserCompact.md) |  |  [optional] |
|**project** | [**ProjectCompact**](ProjectCompact.md) |  |  [optional] |
|**resourceType** | **String** | The base type of this resource. |  [optional] |
|**writeAccess** | [**WriteAccessEnum**](#WriteAccessEnum) | Whether the member has full access or comment-only access to the project. |  [optional] [readonly] |



## Enum: WriteAccessEnum

| Name | Value |
|---- | -----|
| FULL_WRITE | &quot;full_write&quot; |
| COMMENT_ONLY | &quot;comment_only&quot; |



