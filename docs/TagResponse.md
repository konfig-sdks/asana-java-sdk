

# TagResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**name** | **String** | Name of the tag. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer. |  [optional] |
|**color** | [**ColorEnum**](#ColorEnum) | Color of the tag. |  [optional] |
|**notes** | **String** | Free-form textual information associated with the tag (i.e. its description). |  [optional] |
|**createdAt** | **OffsetDateTime** | The time at which this resource was created. |  [optional] [readonly] |
|**followers** | [**List&lt;UserCompact&gt;**](UserCompact.md) | Array of users following this tag. |  [optional] [readonly] |
|**workspace** | [**WorkspaceCompact**](WorkspaceCompact.md) |  |  [optional] |
|**permalinkUrl** | **String** | A url that points directly to the object within Asana. |  [optional] [readonly] |



## Enum: ColorEnum

| Name | Value |
|---- | -----|
| DARK_PINK | &quot;dark-pink&quot; |
| DARK_GREEN | &quot;dark-green&quot; |
| DARK_BLUE | &quot;dark-blue&quot; |
| DARK_RED | &quot;dark-red&quot; |
| DARK_TEAL | &quot;dark-teal&quot; |
| DARK_BROWN | &quot;dark-brown&quot; |
| DARK_ORANGE | &quot;dark-orange&quot; |
| DARK_PURPLE | &quot;dark-purple&quot; |
| DARK_WARM_GRAY | &quot;dark-warm-gray&quot; |
| LIGHT_PINK | &quot;light-pink&quot; |
| LIGHT_GREEN | &quot;light-green&quot; |
| LIGHT_BLUE | &quot;light-blue&quot; |
| LIGHT_RED | &quot;light-red&quot; |
| LIGHT_TEAL | &quot;light-teal&quot; |
| LIGHT_BROWN | &quot;light-brown&quot; |
| LIGHT_ORANGE | &quot;light-orange&quot; |
| LIGHT_PURPLE | &quot;light-purple&quot; |
| LIGHT_WARM_GRAY | &quot;light-warm-gray&quot; |
| NULL | &quot;null&quot; |



