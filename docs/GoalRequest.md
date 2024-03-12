

# GoalRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**name** | **String** | The name of the goal. |  [optional] |
|**htmlNotes** | **String** | The notes of the goal with formatting as HTML. |  [optional] |
|**notes** | **String** | Free-form textual information associated with the goal (i.e. its description). |  [optional] |
|**dueOn** | **String** | The localized day on which this goal is due. This takes a date with format &#x60;YYYY-MM-DD&#x60;. |  [optional] |
|**startOn** | **String** | The day on which work for this goal begins, or null if the goal has no start date. This takes a date with &#x60;YYYY-MM-DD&#x60; format, and cannot be set unless there is an accompanying due date. |  [optional] |
|**isWorkspaceLevel** | **Boolean** | *Conditional*. This property is only present when the &#x60;workspace&#x60; provided is an organization. Whether the goal belongs to the &#x60;workspace&#x60; (and is listed as part of the workspace’s goals) or not. If it isn’t a workspace-level goal, it is a team-level goal, and is associated with the goal’s team. |  [optional] |
|**liked** | **Boolean** | True if the goal is liked by the authorized user, false if not. |  [optional] |
|**team** | **String** | *Conditional*. This property is only present when the &#x60;workspace&#x60; provided is an organization. |  [optional] |
|**workspace** | **String** | The &#x60;gid&#x60; of a workspace. |  [optional] |
|**timePeriod** | **String** | The &#x60;gid&#x60; of a time period. |  [optional] |
|**owner** | **String** | The &#x60;gid&#x60; of a user. |  [optional] |
|**followers** | **List&lt;String&gt;** |  |  [optional] |



