

# AuditLogEventContext

The context from which this event originated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of context. Can be one of &#x60;web&#x60;, &#x60;desktop&#x60;, &#x60;mobile&#x60;, &#x60;asana_support&#x60;, &#x60;asana&#x60;, &#x60;email&#x60;, or &#x60;api&#x60;. |  [optional] |
|**apiAuthenticationMethod** | [**ApiAuthenticationMethodEnum**](#ApiAuthenticationMethodEnum) | The authentication method used in the context of an API request. Only present if the &#x60;context_type&#x60; is &#x60;api&#x60;. Can be one of &#x60;cookie&#x60;, &#x60;oauth&#x60;, &#x60;personal_access_token&#x60;, or &#x60;service_account&#x60;. |  [optional] |
|**clientIpAddress** | **String** | The IP address of the client that initiated the event, if applicable. |  [optional] |
|**userAgent** | **String** | The user agent of the client that initiated the event, if applicable. |  [optional] |
|**oauthAppName** | **String** | The name of the OAuth App that initiated the event. Only present if the &#x60;api_authentication_method&#x60; is &#x60;oauth&#x60;. |  [optional] |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| WEB | &quot;web&quot; |
| DESKTOP | &quot;desktop&quot; |
| MOBILE | &quot;mobile&quot; |
| ASANA_SUPPORT | &quot;asana_support&quot; |
| ASANA | &quot;asana&quot; |
| EMAIL | &quot;email&quot; |
| API | &quot;api&quot; |



## Enum: ApiAuthenticationMethodEnum

| Name | Value |
|---- | -----|
| COOKIE | &quot;cookie&quot; |
| OAUTH | &quot;oauth&quot; |
| PERSONAL_ACCESS_TOKEN | &quot;personal_access_token&quot; |
| SERVICE_ACCOUNT | &quot;service_account&quot; |



