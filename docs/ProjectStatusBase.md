

# ProjectStatusBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**title** | **String** | The title of the project status update. |  [optional] |
|**text** | **String** | The text content of the status update. |  [optional] |
|**htmlText** | **String** | [Opt In](https://developers.asana.com/reference/rest-api-reference). The text content of the status update with formatting as HTML. |  [optional] |
|**color** | [**ColorEnum**](#ColorEnum) | The color associated with the status update. |  [optional] |



## Enum: ColorEnum

| Name | Value |
|---- | -----|
| GREEN | &quot;green&quot; |
| YELLOW | &quot;yellow&quot; |
| RED | &quot;red&quot; |
| BLUE | &quot;blue&quot; |
| COMPLETE | &quot;complete&quot; |



