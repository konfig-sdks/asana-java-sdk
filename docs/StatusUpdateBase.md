

# StatusUpdateBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**title** | **String** | The title of the status update. |  [optional] |
|**resourceSubtype** | [**ResourceSubtypeEnum**](#ResourceSubtypeEnum) | The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The &#x60;resource_subtype&#x60;s for &#x60;status&#x60; objects represent the type of their parent. |  [optional] [readonly] |
|**text** | **String** | The text content of the status update. |  |
|**htmlText** | **String** | [Opt In](https://developers.asana.com/reference/rest-api-reference). The text content of the status update with formatting as HTML. |  [optional] |
|**statusType** | [**StatusTypeEnum**](#StatusTypeEnum) | The type associated with the status update. This represents the current state of the object this object is on. |  |



## Enum: ResourceSubtypeEnum

| Name | Value |
|---- | -----|
| PROJECT_STATUS_UPDATE | &quot;project_status_update&quot; |
| PORTFOLIO_STATUS_UPDATE | &quot;portfolio_status_update&quot; |
| GOAL_STATUS_UPDATE | &quot;goal_status_update&quot; |



## Enum: StatusTypeEnum

| Name | Value |
|---- | -----|
| ON_TRACK | &quot;on_track&quot; |
| AT_RISK | &quot;at_risk&quot; |
| OFF_TRACK | &quot;off_track&quot; |
| ON_HOLD | &quot;on_hold&quot; |
| COMPLETE | &quot;complete&quot; |
| ACHIEVED | &quot;achieved&quot; |
| PARTIAL | &quot;partial&quot; |
| MISSED | &quot;missed&quot; |
| DROPPED | &quot;dropped&quot; |



