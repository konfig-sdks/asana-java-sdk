

# ProjectTemplateBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**name** | **String** | Name of the project template. |  [optional] |
|**description** | **String** | Free-form textual information associated with the project template |  [optional] |
|**htmlDescription** | **String** | The description of the project template with formatting as HTML. |  [optional] |
|**_public** | **Boolean** | True if the project template is public to its team. |  [optional] |
|**owner** | [**UserCompact**](UserCompact.md) | The current owner of the project template, may be null. |  [optional] |
|**team** | [**TeamCompact**](TeamCompact.md) |  |  [optional] |
|**requestedDates** | [**List&lt;DateVariableCompact&gt;**](DateVariableCompact.md) | Array of date variables in this project template. Calendar dates must be provided for these variables when instantiating a project. |  [optional] [readonly] |
|**color** | [**ColorEnum**](#ColorEnum) | Color of the project template. |  [optional] |
|**requestedRoles** | [**List&lt;TemplateRole&gt;**](TemplateRole.md) | Array of template roles in this project template. User Ids can be provided for these variables when instantiating a project to assign template tasks to the user. |  [optional] |



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



