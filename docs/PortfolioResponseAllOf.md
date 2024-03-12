

# PortfolioResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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



