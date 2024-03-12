

# StoryBaseAllOf

A story represents an activity associated with an object in the Asana system.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | The time at which this resource was created. |  [optional] [readonly] |
|**resourceSubtype** | **String** | The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. |  [optional] [readonly] |
|**text** | **String** | The plain text of the comment to add. Cannot be used with html_text. |  [optional] |
|**htmlText** | **String** | [Opt In](https://raw.githubusercontent.com). HTML formatted text for a comment. This will not include the name of the creator. |  [optional] |
|**isPinned** | **Boolean** | *Conditional*. Whether the story should be pinned on the resource. |  [optional] |
|**stickerName** | [**StickerNameEnum**](#StickerNameEnum) | The name of the sticker in this story. &#x60;null&#x60; if there is no sticker. |  [optional] |



## Enum: StickerNameEnum

| Name | Value |
|---- | -----|
| GREEN_CHECKMARK | &quot;green_checkmark&quot; |
| PEOPLE_DANCING | &quot;people_dancing&quot; |
| DANCING_UNICORN | &quot;dancing_unicorn&quot; |
| HEART | &quot;heart&quot; |
| PARTY_POPPER | &quot;party_popper&quot; |
| PEOPLE_WAVING_FLAGS | &quot;people_waving_flags&quot; |
| SPLASHING_NARWHAL | &quot;splashing_narwhal&quot; |
| TROPHY | &quot;trophy&quot; |
| YETI_RIDING_UNICORN | &quot;yeti_riding_unicorn&quot; |
| CELEBRATING_PEOPLE | &quot;celebrating_people&quot; |
| DETERMINED_CLIMBERS | &quot;determined_climbers&quot; |
| PHOENIX_SPREADING_LOVE | &quot;phoenix_spreading_love&quot; |



