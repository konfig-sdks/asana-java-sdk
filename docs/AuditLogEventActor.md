

# AuditLogEventActor

The entity that triggered the event. Will typically be a user.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actorType** | [**ActorTypeEnum**](#ActorTypeEnum) | The type of actor. Can be one of &#x60;user&#x60;, &#x60;asana&#x60;, &#x60;asana_support&#x60;, &#x60;anonymous&#x60;, or &#x60;external_administrator&#x60;. |  [optional] |
|**gid** | **String** | Globally unique identifier of the actor, if it is a user. |  [optional] |
|**name** | **String** | The name of the actor, if it is a user. |  [optional] |
|**email** | **String** | The email of the actor, if it is a user. |  [optional] |



## Enum: ActorTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| ASANA | &quot;asana&quot; |
| ASANA_SUPPORT | &quot;asana_support&quot; |
| ANONYMOUS | &quot;anonymous&quot; |
| EXTERNAL_ADMINISTRATOR | &quot;external_administrator&quot; |



