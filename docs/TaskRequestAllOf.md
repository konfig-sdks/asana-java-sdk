

# TaskRequestAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | *Create-Only* Array of tag gids. In order to change tags on an existing task use &#x60;addTag&#x60; and &#x60;removeTag&#x60;. |  [optional] |
|**assignee** | **String** | Gid of a user. |  [optional] |
|**assigneeSection** | **String** | The *assignee section* is a subdivision of a project that groups tasks together in the assignee&#39;s \&quot;My Tasks\&quot; list. It can either be a header above a list of tasks in a list view or a column in a board view of \&quot;My Tasks.\&quot; The &#x60;assignee_section&#x60; property will be returned in the response only if the request was sent by the user who is the assignee of the task. Note that you can only write to &#x60;assignee_section&#x60; with the gid of an existing section visible in the user&#39;s \&quot;My Tasks\&quot; list. |  [optional] |
|**customFields** | **Map&lt;String, String&gt;** | An object where each key is the GID of a custom field and its corresponding value is either an enum GID, string, number, object, or array (depending on the custom field type). See the [custom fields guide](https://developers.asana.com/reference/rest-api-reference) for details on creating and updating custom field values. |  [optional] |
|**followers** | **List&lt;String&gt;** | *Create-Only* An array of strings identifying users. These can either be the string \&quot;me\&quot;, an email, or the gid of a user. In order to change followers on an existing task use &#x60;addFollowers&#x60; and &#x60;removeFollowers&#x60;. |  [optional] |
|**parent** | **String** | Gid of a task. |  [optional] |
|**projects** | **List&lt;String&gt;** | *Create-Only* Array of project gids. In order to change projects on an existing task use &#x60;addProject&#x60; and &#x60;removeProject&#x60;. |  [optional] |
|**workspace** | **String** | Gid of a workspace. |  [optional] |



