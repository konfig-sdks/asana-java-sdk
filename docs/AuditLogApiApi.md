# AuditLogApiApi

All URIs are relative to *https://app.asana.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuditLogEvents**](AuditLogApiApi.md#getAuditLogEvents) | **GET** /workspaces/{workspace_gid}/audit_log_events | Get audit log events |


<a name="getAuditLogEvents"></a>
# **getAuditLogEvents**
> AuditLogApiGetAuditLogEventsResponse getAuditLogEvents(workspaceGid).startAt(startAt).endAt(endAt).eventType(eventType).actorType(actorType).actorGid(actorGid).resourceGid(resourceGid).limit(limit).offset(offset).execute();

Get audit log events

Retrieve the audit log events that have been captured in your domain.  This endpoint will return a list of [AuditLogEvent](https://developers.asana.com/reference/rest-api-reference) objects, sorted by creation time in ascending order. Note that the Audit Log API captures events from October 8th, 2021 and later. Queries for events before this date will not return results.  There are a number of query parameters (below) that can be used to filter the set of [AuditLogEvent](https://developers.asana.com/reference/rest-api-reference) objects that are returned in the response. Any combination of query parameters is valid. When no filters are provided, all of the events that have been captured in your domain will match.  The list of events will always be [paginated](https://developers.asana.com/reference/rest-api-reference). The default limit is 1000 events. The next set of events can be retrieved using the &#x60;offset&#x60; from the previous response. If there are no events that match the provided filters in your domain, the endpoint will return &#x60;null&#x60; for the &#x60;next_page&#x60; field. Querying again with the same filters may return new events if they were captured after the last request. Once a response includes a &#x60;next_page&#x60; with an &#x60;offset&#x60;, subsequent requests can be made with the latest &#x60;offset&#x60; to poll for new events that match the provided filters.  *Note: If the filters you provided match events in your domain and &#x60;next_page&#x60; is present in the response, we will continue to send &#x60;next_page&#x60; on subsequent requests even when there are no more events that match the filters. This was put in place so that you can implement an audit log stream that will return future events that match these filters. If you are not interested in future events that match the filters you have defined, you can rely on checking empty &#x60;data&#x60; response for the end of current events that match your filters.*  When no &#x60;offset&#x60; is provided, the response will begin with the oldest events that match the provided filters. It is important to note that [AuditLogEvent](https://developers.asana.com/reference/rest-api-reference) objects will be permanently deleted from our systems after 90 days. If you wish to keep a permanent record of these events, we recommend using a SIEM tool to ingest and store these logs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuditLogApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    String workspaceGid = "12345"; // Globally unique identifier for the workspace or organization.
    OffsetDateTime startAt = OffsetDateTime.now(); // Filter to events created after this time (inclusive).
    OffsetDateTime endAt = OffsetDateTime.now(); // Filter to events created before this time (exclusive).
    String eventType = "eventType_example"; // Filter to events of this type. Refer to the [supported audit log events](/docs/audit-log-events#supported-audit-log-events) for a full list of values.
    String actorType = "user"; // Filter to events with an actor of this type. This only needs to be included if querying for actor types without an ID. If `actor_gid` is included, this should be excluded.
    String actorGid = "actorGid_example"; // Filter to events triggered by the actor with this ID.
    String resourceGid = "resourceGid_example"; // Filter to events with this resource ID.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    try {
      AuditLogApiGetAuditLogEventsResponse result = client
              .auditLogApi
              .getAuditLogEvents(workspaceGid)
              .startAt(startAt)
              .endAt(endAt)
              .eventType(eventType)
              .actorType(actorType)
              .actorGid(actorGid)
              .resourceGid(resourceGid)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditLogApiApi#getAuditLogEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuditLogApiGetAuditLogEventsResponse> response = client
              .auditLogApi
              .getAuditLogEvents(workspaceGid)
              .startAt(startAt)
              .endAt(endAt)
              .eventType(eventType)
              .actorType(actorType)
              .actorGid(actorGid)
              .resourceGid(resourceGid)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditLogApiApi#getAuditLogEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workspaceGid** | **String**| Globally unique identifier for the workspace or organization. | |
| **startAt** | **OffsetDateTime**| Filter to events created after this time (inclusive). | [optional] |
| **endAt** | **OffsetDateTime**| Filter to events created before this time (exclusive). | [optional] |
| **eventType** | **String**| Filter to events of this type. Refer to the [supported audit log events](/docs/audit-log-events#supported-audit-log-events) for a full list of values. | [optional] |
| **actorType** | **String**| Filter to events with an actor of this type. This only needs to be included if querying for actor types without an ID. If &#x60;actor_gid&#x60; is included, this should be excluded. | [optional] [enum: user, asana, asana_support, anonymous, external_administrator] |
| **actorGid** | **String**| Filter to events triggered by the actor with this ID. | [optional] |
| **resourceGid** | **String**| Filter to events with this resource ID. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |

### Return type

[**AuditLogApiGetAuditLogEventsResponse**](AuditLogApiGetAuditLogEventsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | AuditLogEvents were successfully retrieved. |  -  |

