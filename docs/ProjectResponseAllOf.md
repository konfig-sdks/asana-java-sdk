

# ProjectResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customFields** | [**List&lt;CustomFieldCompact&gt;**](CustomFieldCompact.md) | Array of Custom Fields. |  [optional] [readonly] |
|**completed** | **Boolean** | True if the project is currently marked complete, false if not. |  [optional] [readonly] |
|**completedAt** | **OffsetDateTime** | The time at which this project was completed, or null if the project is not completed. |  [optional] [readonly] |
|**completedBy** | [**UserCompact**](UserCompact.md) |  |  [optional] |
|**followers** | [**List&lt;UserCompact&gt;**](UserCompact.md) | Array of users following this project. Followers are a subset of members who have opted in to receive \&quot;tasks added\&quot; notifications for a project. |  [optional] [readonly] |
|**owner** | [**UserCompact**](UserCompact.md) | The current owner of the project, may be null. |  [optional] |
|**team** | [**TeamCompact**](TeamCompact.md) |  |  [optional] |
|**icon** | [**IconEnum**](#IconEnum) | The icon for a project. |  [optional] |
|**permalinkUrl** | **String** | A url that points directly to the object within Asana. |  [optional] [readonly] |
|**projectBrief** | [**ProjectBriefCompact**](ProjectBriefCompact.md) |  |  [optional] |
|**createdFromTemplate** | [**ProjectTemplateCompact**](ProjectTemplateCompact.md) |  |  [optional] |
|**workspace** | [**WorkspaceCompact**](WorkspaceCompact.md) |  |  [optional] |



## Enum: IconEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |
| BOARD | &quot;board&quot; |
| TIMELINE | &quot;timeline&quot; |
| CALENDAR | &quot;calendar&quot; |
| ROCKET | &quot;rocket&quot; |
| PEOPLE | &quot;people&quot; |
| GRAPH | &quot;graph&quot; |
| STAR | &quot;star&quot; |
| BUG | &quot;bug&quot; |
| LIGHT_BULB | &quot;light_bulb&quot; |
| GLOBE | &quot;globe&quot; |
| GEAR | &quot;gear&quot; |
| NOTEBOOK | &quot;notebook&quot; |
| COMPUTER | &quot;computer&quot; |
| CHECK | &quot;check&quot; |
| TARGET | &quot;target&quot; |
| HTML | &quot;html&quot; |
| MEGAPHONE | &quot;megaphone&quot; |
| CHAT_BUBBLES | &quot;chat_bubbles&quot; |
| BRIEFCASE | &quot;briefcase&quot; |
| PAGE_LAYOUT | &quot;page_layout&quot; |
| MOUNTAIN_FLAG | &quot;mountain_flag&quot; |
| PUZZLE | &quot;puzzle&quot; |
| PRESENTATION | &quot;presentation&quot; |
| LINE_AND_SYMBOLS | &quot;line_and_symbols&quot; |
| SPEED_DIAL | &quot;speed_dial&quot; |
| RIBBON | &quot;ribbon&quot; |
| SHOE | &quot;shoe&quot; |
| SHOPPING_BASKET | &quot;shopping_basket&quot; |
| MAP | &quot;map&quot; |
| TICKET | &quot;ticket&quot; |
| COINS | &quot;coins&quot; |



