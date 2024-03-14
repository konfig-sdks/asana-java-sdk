

# WebhookCompactAllOf

Webhook objects represent the state of an active subscription for a server to be updated with information from Asana. This schema represents the subscription itself, not the objects that are sent to the server. For information on those please refer to the [event](https://raw.githubusercontent.com) schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | If true, the webhook will send events - if false it is considered inactive and will not generate events. |  [optional] [readonly] |
|**resource** | [**AsanaNamedResource**](AsanaNamedResource.md) |  |  [optional] |
|**target** | **URI** | The URL to receive the HTTP POST. |  [optional] [readonly] |



