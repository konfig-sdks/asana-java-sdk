

# ProjectUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**name** | **String** | Name of the project. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer. |  [optional] |
|**archived** | **Boolean** | True if the project is archived, false if not. Archived projects do not show in the UI by default and may be treated differently for queries. |  [optional] |
|**color** | [**ColorEnum**](#ColorEnum) | Color of the project. |  [optional] |
|**createdAt** | **OffsetDateTime** | The time at which this resource was created. |  [optional] [readonly] |
|**currentStatus** | [**ProjectStatusResponse**](ProjectStatusResponse.md) |  |  [optional] |
|**currentStatusUpdate** | [**StatusUpdateCompact**](StatusUpdateCompact.md) |  |  [optional] |
|**customFieldSettings** | [**List&lt;CustomFieldSettingResponse&gt;**](CustomFieldSettingResponse.md) | Array of Custom Field Settings (in compact form). |  [optional] [readonly] |
|**defaultView** | [**DefaultViewEnum**](#DefaultViewEnum) | The default view (list, board, calendar, or timeline) of a project. |  [optional] |
|**dueDate** | **LocalDate** | *Deprecated: new integrations should prefer the &#x60;due_on&#x60; field.* |  [optional] |
|**dueOn** | **LocalDate** | The day on which this project is due. This takes a date with format YYYY-MM-DD. |  [optional] |
|**htmlNotes** | **String** | [Opt In](https://developers.asana.com/reference/rest-api-reference). The notes of the project with formatting as HTML. |  [optional] |
|**members** | [**List&lt;UserCompact&gt;**](UserCompact.md) | Array of users who are members of this project. |  [optional] [readonly] |
|**modifiedAt** | **OffsetDateTime** | The time at which this project was last modified. *Note: This does not currently reflect any changes in associations such as tasks or comments that may have been added or removed from the project.* |  [optional] [readonly] |
|**notes** | **String** | Free-form textual information associated with the project (ie., its description). |  [optional] |
|**_public** | **Boolean** | True if the project is public to its team. |  [optional] |
|**startOn** | **LocalDate** | The day on which work for this project begins, or null if the project has no start date. This takes a date with &#x60;YYYY-MM-DD&#x60; format. *Note: &#x60;due_on&#x60; or &#x60;due_at&#x60; must be present in the request when setting or unsetting the &#x60;start_on&#x60; parameter. Additionally, &#x60;start_on&#x60; and &#x60;due_on&#x60; cannot be the same date.* |  [optional] |
|**defaultAccessLevel** | [**DefaultAccessLevelEnum**](#DefaultAccessLevelEnum) | The default access for users or teams who join or are added as members to the project. |  [optional] |
|**minimumAccessLevelForCustomization** | [**MinimumAccessLevelForCustomizationEnum**](#MinimumAccessLevelForCustomizationEnum) | The minimum access level needed for project members to modify this project&#39;s workflow and appearance. |  [optional] |
|**minimumAccessLevelForSharing** | [**MinimumAccessLevelForSharingEnum**](#MinimumAccessLevelForSharingEnum) | The minimum access level needed for project members to share the project and manage project memberships. |  [optional] |
|**customFields** | **Map&lt;String, String&gt;** | An object where each key is the GID of a custom field and its corresponding value is either an enum GID, string, number, or object (depending on the custom field type). See the [custom fields guide](https://developers.asana.com/reference/rest-api-reference) for details on creating and updating custom field values. |  [optional] |
|**followers** | **String** | *Create-only*. Comma separated string of users. Followers are a subset of members who have opted in to receive \&quot;tasks added\&quot; notifications for a project. |  [optional] |
|**owner** | **String** | The current owner of the project, may be null. |  [optional] |
|**team** | **String** | The team that this project is shared with. |  [optional] |



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
| NONE | &quot;none&quot; |
| NULL | &quot;null&quot; |



## Enum: DefaultViewEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |
| BOARD | &quot;board&quot; |
| CALENDAR | &quot;calendar&quot; |
| TIMELINE | &quot;timeline&quot; |



## Enum: DefaultAccessLevelEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| EDITOR | &quot;editor&quot; |
| COMMENTER | &quot;commenter&quot; |
| VIEWER | &quot;viewer&quot; |



## Enum: MinimumAccessLevelForCustomizationEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| EDITOR | &quot;editor&quot; |



## Enum: MinimumAccessLevelForSharingEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| EDITOR | &quot;editor&quot; |



