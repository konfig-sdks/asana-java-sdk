

# EventResponseChange

Information about the type of change that has occurred. This field is only present when the value of the property `action`, describing the action taken on the **resource**, is `changed`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | **String** | The name of the field that has changed in the resource. |  [optional] [readonly] |
|**action** | **String** | The type of action taken on the **field** which has been changed.  This can be one of &#x60;changed&#x60;, &#x60;added&#x60;, or &#x60;removed&#x60; depending on the nature of the change. |  [optional] [readonly] |
|**newValue** | **Object** | *Conditional.* This property is only present when the value of the event&#39;s &#x60;change.action&#x60; is &#x60;changed&#x60; _and_ the &#x60;new_value&#x60; is an Asana resource. This will be only the &#x60;gid&#x60; and &#x60;resource_type&#x60; of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](https://raw.githubusercontent.com)) when using the [get events](https://raw.githubusercontent.com) endpoint. |  [optional] |
|**addedValue** | **Object** | *Conditional.* This property is only present when the value of the event&#39;s &#x60;change.action&#x60; is &#x60;added&#x60; _and_ the &#x60;added_value&#x60; is an Asana resource. This will be only the &#x60;gid&#x60; and &#x60;resource_type&#x60; of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](https://raw.githubusercontent.com)) when using the [get events](https://raw.githubusercontent.com) endpoint. |  [optional] |
|**removedValue** | **Object** | *Conditional.* This property is only present when the value of the event&#39;s &#x60;change.action&#x60; is &#x60;removed&#x60; _and_ the &#x60;removed_value&#x60; is an Asana resource. This will be only the &#x60;gid&#x60; and &#x60;resource_type&#x60; of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](https://raw.githubusercontent.com)) when using the [get events](https://raw.githubusercontent.com) endpoint. |  [optional] |



