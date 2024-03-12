

# PortfolioResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**name** | **String** | The name of the portfolio. |  [optional] |
|**color** | [**ColorEnum**](#ColorEnum) | Color of the portfolio. |  [optional] |
|**createdAt** | **OffsetDateTime** | The time at which this resource was created. |  [optional] [readonly] |
|**createdBy** | [**UserCompact**](UserCompact.md) |  |  [optional] |
|**customFieldSettings** | [**List&lt;CustomFieldSettingResponse&gt;**](CustomFieldSettingResponse.md) | Array of custom field settings applied to the portfolio. |  [optional] |
|**currentStatusUpdate** | [**StatusUpdateCompact**](StatusUpdateCompact.md) |  |  [optional] |
|**dueOn** | **LocalDate** | The localized day on which this portfolio is due. This takes a date with format YYYY-MM-DD. |  [optional] |
|**customFields** | [**List&lt;CustomFieldCompact&gt;**](CustomFieldCompact.md) | Array of Custom Fields. |  [optional] |
|**members** | [**List&lt;UserCompact&gt;**](UserCompact.md) |  |  [optional] [readonly] |
|**owner** | [**UserCompact**](UserCompact.md) |  |  [optional] |
|**startOn** | **LocalDate** | The day on which work for this portfolio begins, or null if the portfolio has no start date. This takes a date with &#x60;YYYY-MM-DD&#x60; format. *Note: &#x60;due_on&#x60; must be present in the request when setting or unsetting the &#x60;start_on&#x60; parameter. Additionally, &#x60;start_on&#x60; and &#x60;due_on&#x60; cannot be the same date.* |  [optional] |
|**workspace** | [**WorkspaceCompact**](WorkspaceCompact.md) |  |  [optional] |
|**permalinkUrl** | **String** | A url that points directly to the object within Asana. |  [optional] [readonly] |
|**_public** | **Boolean** | True if the portfolio is public to its workspace members. |  [optional] |
|**projectTemplates** | [**List&lt;ProjectTemplateCompact&gt;**](ProjectTemplateCompact.md) | Array of project templates that are in the portfolio |  [optional] [readonly] |



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



