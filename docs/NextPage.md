

# NextPage

*Conditional*. This property is only present when a limit query parameter is provided in the request. When making a paginated request, the API will return a number of results as specified by the limit parameter. If more results exist, then the response will contain a next_page attribute, which will include an offset, a relative path attribute, and a full uri attribute. If there are no more pages available, next_page will be null and no offset will be provided. Note that an offset token will expire after some time, as data may have changed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**offset** | **String** | Pagination offset for the request. |  [optional] [readonly] |
|**path** | **String** | A relative path containing the query parameters to fetch for next_page |  [optional] [readonly] |
|**uri** | **URI** | A full uri containing the query parameters to fetch for next_page |  [optional] [readonly] |



