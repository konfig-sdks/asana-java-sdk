

# StatusUpdateBaseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**text** | **String** | The text content of the status update. |  |
|**htmlText** | **String** | [Opt In](https://developers.asana.com/reference/rest-api-reference). The text content of the status update with formatting as HTML. |  [optional] |
|**statusType** | [**StatusTypeEnum**](#StatusTypeEnum) | The type associated with the status update. This represents the current state of the object this object is on. |  |



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



