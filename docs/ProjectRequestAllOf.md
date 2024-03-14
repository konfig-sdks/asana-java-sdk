

# ProjectRequestAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customFields** | **Map&lt;String, String&gt;** | An object where each key is the GID of a custom field and its corresponding value is either an enum GID, string, number, or object (depending on the custom field type). See the [custom fields guide](https://developers.asana.com/reference/rest-api-reference) for details on creating and updating custom field values. |  [optional] |
|**followers** | **String** | *Create-only*. Comma separated string of users. Followers are a subset of members who have opted in to receive \&quot;tasks added\&quot; notifications for a project. |  [optional] |
|**owner** | **String** | The current owner of the project, may be null. |  [optional] |
|**team** | **String** | The team that this project is shared with. |  [optional] |
|**workspace** | **String** | The &#x60;gid&#x60; of a workspace. |  [optional] |



