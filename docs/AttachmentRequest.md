

# AttachmentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourceSubtype** | [**ResourceSubtypeEnum**](#ResourceSubtypeEnum) | The type of the attachment. Must be one of the given values. If not specified, a file attachment of type &#x60;asana&#x60; will be assumed. Note that if the value of &#x60;resource_subtype&#x60; is &#x60;external&#x60;, a &#x60;parent&#x60;, &#x60;name&#x60;, and &#x60;url&#x60; must also be provided.  |  [optional] |
|**_file** | **File** | Required for &#x60;asana&#x60; attachments.  |  [optional] |
|**parent** | **String** | Required identifier of the parent task, project, or project_brief, as a string.  |  |
|**url** | **String** | The URL of the external resource being attached. Required for attachments of type &#x60;external&#x60;.  |  [optional] |
|**name** | **String** | The name of the external resource being attached. Required for attachments of type &#x60;external&#x60;.  |  [optional] |
|**connectToApp** | **Boolean** | *Optional*. Only relevant for external attachments with a parent task. A boolean indicating whether the current app should be connected with the attachment for the purposes of showing an app components widget. Requires the app to have been added to a project the parent task is in.  |  [optional] |



## Enum: ResourceSubtypeEnum

| Name | Value |
|---- | -----|
| ASANA | &quot;asana&quot; |
| DROPBOX | &quot;dropbox&quot; |
| GDRIVE | &quot;gdrive&quot; |
| ONEDRIVE | &quot;onedrive&quot; |
| BOX | &quot;box&quot; |
| VIMEO | &quot;vimeo&quot; |
| EXTERNAL | &quot;external&quot; |



