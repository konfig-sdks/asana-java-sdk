

# EventsGetResourceEventsResponse

The full record for all events that have occurred since the sync token was created.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**List&lt;EventResponse&gt;**](EventResponse.md) |  |  [optional] |
|**sync** | **String** | A sync token to be used with the next call to the /events endpoint. |  [optional] |
|**hasMore** | **Boolean** | Indicates whether there are more events to pull. |  [optional] |



