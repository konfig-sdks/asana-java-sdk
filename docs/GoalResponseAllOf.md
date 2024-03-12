

# GoalResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**likes** | [**List&lt;Like&gt;**](Like.md) | Array of likes for users who have liked this goal. |  [optional] [readonly] |
|**numLikes** | **Integer** | The number of users who have liked this goal. |  [optional] [readonly] |
|**team** | [**TeamCompact**](TeamCompact.md) |  |  [optional] |
|**workspace** | [**WorkspaceCompact**](WorkspaceCompact.md) |  |  [optional] |
|**followers** | [**List&lt;UserCompact&gt;**](UserCompact.md) | Array of users who are members of this goal. |  [optional] |
|**timePeriod** | [**TimePeriodCompact**](TimePeriodCompact.md) |  |  [optional] |
|**metric** | [**GoalMetricBase**](GoalMetricBase.md) |  |  [optional] |
|**owner** | [**UserCompact**](UserCompact.md) |  |  [optional] |
|**currentStatusUpdate** | [**StatusUpdateCompact**](StatusUpdateCompact.md) |  |  [optional] |
|**status** | **String** | The current status of this goal. When the goal is open, its status can be &#x60;green&#x60;, &#x60;yellow&#x60;, and &#x60;red&#x60; to reflect \&quot;On Track\&quot;, \&quot;At Risk\&quot;, and \&quot;Off Track\&quot;, respectively. When the goal is closed, the value can be &#x60;missed&#x60;, &#x60;achieved&#x60;, &#x60;partial&#x60;, or &#x60;dropped&#x60;. *Note* you can only write to this property if &#x60;metric&#x60; is set. |  [optional] [readonly] |



