

# BatchRequestActionOptions

Pagination (`limit` and `offset`) and output options (`fields` or `expand`) for the action. “Pretty” JSON output is not an available option on individual actions; if you want pretty output, specify that option on the parent request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limit** | **Integer** | Pagination limit for the request. |  [optional] |
|**offset** | **Integer** | Pagination offset for the request. |  [optional] |
|**fields** | **List&lt;String&gt;** | The fields to retrieve in the request. |  [optional] |



