# TeamMembershipsApi

All URIs are relative to *https://app.asana.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCompact**](TeamMembershipsApi.md#getCompact) | **GET** /teams/{team_gid}/team_memberships | Get memberships from a team |
| [**getCompactRecords**](TeamMembershipsApi.md#getCompactRecords) | **GET** /team_memberships | Get team memberships |
| [**getRecordById**](TeamMembershipsApi.md#getRecordById) | **GET** /team_memberships/{team_membership_gid} | Get a team membership |
| [**getUserCompact**](TeamMembershipsApi.md#getUserCompact) | **GET** /users/{user_gid}/team_memberships | Get memberships from a user |


<a name="getCompact"></a>
# **getCompact**
> TeamMembershipsGetCompactResponse getCompact(teamGid).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get memberships from a team

Returns the compact team memberships for the team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamMembershipsApi;
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
    String teamGid = "159874"; // Globally unique identifier for the team.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TeamMembershipsGetCompactResponse result = client
              .teamMemberships
              .getCompact(teamGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamMembershipsApi#getCompact");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TeamMembershipsGetCompactResponse> response = client
              .teamMemberships
              .getCompact(teamGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamMembershipsApi#getCompact");
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
| **teamGid** | **String**| Globally unique identifier for the team. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: is_admin, is_guest, is_limited_access, offset, path, team, team.name, uri, user, user.name] |

### Return type

[**TeamMembershipsGetCompactResponse**](TeamMembershipsGetCompactResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the requested team&#39;s memberships. |  -  |

<a name="getCompactRecords"></a>
# **getCompactRecords**
> TeamMembershipsGetCompactRecordsResponse getCompactRecords().optPretty(optPretty).limit(limit).offset(offset).team(team).user(user).workspace(workspace).optFields(optFields).execute();

Get team memberships

Returns compact team membership records.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamMembershipsApi;
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
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    String team = "159874"; // Globally unique identifier for the team.
    String user = "512241"; // A string identifying a user. This can either be the string \"me\", an email, or the gid of a user. This parameter must be used with the workspace parameter.
    String workspace = "31326"; // Globally unique identifier for the workspace. This parameter must be used with the user parameter.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TeamMembershipsGetCompactRecordsResponse result = client
              .teamMemberships
              .getCompactRecords()
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .team(team)
              .user(user)
              .workspace(workspace)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamMembershipsApi#getCompactRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TeamMembershipsGetCompactRecordsResponse> response = client
              .teamMemberships
              .getCompactRecords()
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .team(team)
              .user(user)
              .workspace(workspace)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamMembershipsApi#getCompactRecords");
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
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **team** | **String**| Globally unique identifier for the team. | [optional] |
| **user** | **String**| A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user. This parameter must be used with the workspace parameter. | [optional] |
| **workspace** | **String**| Globally unique identifier for the workspace. This parameter must be used with the user parameter. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: is_admin, is_guest, is_limited_access, offset, path, team, team.name, uri, user, user.name] |

### Return type

[**TeamMembershipsGetCompactRecordsResponse**](TeamMembershipsGetCompactRecordsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the requested team memberships. |  -  |

<a name="getRecordById"></a>
# **getRecordById**
> TeamMembershipsGetRecordByIdResponse getRecordById(teamMembershipGid).optPretty(optPretty).optFields(optFields).execute();

Get a team membership

Returns the complete team membership record for a single team membership.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamMembershipsApi;
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
    String teamMembershipGid = "724362";
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TeamMembershipsGetRecordByIdResponse result = client
              .teamMemberships
              .getRecordById(teamMembershipGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamMembershipsApi#getRecordById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TeamMembershipsGetRecordByIdResponse> response = client
              .teamMemberships
              .getRecordById(teamMembershipGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamMembershipsApi#getRecordById");
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
| **teamMembershipGid** | **String**|  | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: is_admin, is_guest, is_limited_access, team, team.name, user, user.name] |

### Return type

[**TeamMembershipsGetRecordByIdResponse**](TeamMembershipsGetRecordByIdResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the requested team membership. |  -  |

<a name="getUserCompact"></a>
# **getUserCompact**
> TeamMembershipsGetUserCompactResponse getUserCompact(userGid, workspace).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get memberships from a user

Returns the compact team membership records for the user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamMembershipsApi;
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
    String userGid = "me"; // A string identifying a user. This can either be the string \"me\", an email, or the gid of a user.
    String workspace = "31326"; // Globally unique identifier for the workspace.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TeamMembershipsGetUserCompactResponse result = client
              .teamMemberships
              .getUserCompact(userGid, workspace)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamMembershipsApi#getUserCompact");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TeamMembershipsGetUserCompactResponse> response = client
              .teamMemberships
              .getUserCompact(userGid, workspace)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamMembershipsApi#getUserCompact");
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
| **userGid** | **String**| A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user. | |
| **workspace** | **String**| Globally unique identifier for the workspace. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: is_admin, is_guest, is_limited_access, offset, path, team, team.name, uri, user, user.name] |

### Return type

[**TeamMembershipsGetUserCompactResponse**](TeamMembershipsGetUserCompactResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the requested users&#39;s memberships. |  -  |

