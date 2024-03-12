

# TaskTemplateRecipeAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the task that will be created from this template. |  [optional] |
|**htmlDescription** | **String** | HTML description of the task that will be created from this template. |  [optional] |
|**memberships** | [**List&lt;ProjectCompact&gt;**](ProjectCompact.md) | Array of projects that the task created from this template will be added to |  [optional] |
|**relativeStartOn** | **Integer** | The number of days after the task has been instantiated on which that the task will start |  [optional] |
|**relativeDueOn** | **Integer** | The number of days after the task has been instantiated on which that the task will be due |  [optional] |
|**dueTime** | **String** | The time of day that the task will be due |  [optional] |
|**dependencies** | [**List&lt;TaskTemplateRecipeCompact&gt;**](TaskTemplateRecipeCompact.md) | Array of task templates that the task created from this template will depend on |  [optional] |
|**dependents** | [**List&lt;TaskTemplateRecipeCompact&gt;**](TaskTemplateRecipeCompact.md) | Array of task templates that will depend on the task created from this template |  [optional] |
|**followers** | [**List&lt;UserCompact&gt;**](UserCompact.md) | Array of users that will be added as followers to the task created from this template |  [optional] |
|**attachments** | [**List&lt;AttachmentCompact&gt;**](AttachmentCompact.md) | Array of attachments that will be added to the task created from this template |  [optional] |
|**subtasks** | [**List&lt;TaskTemplateRecipeCompact&gt;**](TaskTemplateRecipeCompact.md) | Array of subtasks that will be added to the task created from this template |  [optional] |
|**customFields** | [**List&lt;CustomFieldCompact&gt;**](CustomFieldCompact.md) | Array of custom fields that will be added to the task created from this template |  [optional] |



