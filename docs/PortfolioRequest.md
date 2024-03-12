

# PortfolioRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**name** | **String** | The name of the portfolio. |  [optional] |
|**color** | [**ColorEnum**](#ColorEnum) | Color of the portfolio. |  [optional] |
|**members** | **List&lt;String&gt;** | An array of strings identifying users. These can either be the string \&quot;me\&quot;, an email, or the gid of a user. |  [optional] [readonly] |
|**workspace** | **String** | Gid of an object. |  [optional] |
|**_public** | **Boolean** | True if the portfolio is public to its workspace members. |  [optional] |



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



