# GoalsApi

All URIs are relative to *https://app.asana.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCollaboratorsToGoal**](GoalsApi.md#addCollaboratorsToGoal) | **POST** /goals/{goal_gid}/addFollowers | Add a collaborator to a goal |
| [**createMetric**](GoalsApi.md#createMetric) | **POST** /goals/{goal_gid}/setMetric | Create a goal metric |
| [**createNewGoalRecord**](GoalsApi.md#createNewGoalRecord) | **POST** /goals | Create a goal |
| [**deleteRecord**](GoalsApi.md#deleteRecord) | **DELETE** /goals/{goal_gid} | Delete a goal |
| [**getCompactRecords**](GoalsApi.md#getCompactRecords) | **GET** /goals | Get goals |
| [**getGoalRecord**](GoalsApi.md#getGoalRecord) | **GET** /goals/{goal_gid} | Get a goal |
| [**getParentGoals**](GoalsApi.md#getParentGoals) | **GET** /goals/{goal_gid}/parentGoals | Get parent goals from a goal |
| [**removeFollowersFromGoal**](GoalsApi.md#removeFollowersFromGoal) | **POST** /goals/{goal_gid}/removeFollowers | Remove a collaborator from a goal |
| [**updateGoalRecord**](GoalsApi.md#updateGoalRecord) | **PUT** /goals/{goal_gid} | Update a goal |
| [**updateMetricCurrentValue**](GoalsApi.md#updateMetricCurrentValue) | **POST** /goals/{goal_gid}/setMetricCurrentValue | Update a goal metric |


<a name="addCollaboratorsToGoal"></a>
# **addCollaboratorsToGoal**
> GoalsAddCollaboratorsToGoalResponse addCollaboratorsToGoal(goalGid, goalsAddCollaboratorsToGoalRequest).optPretty(optPretty).optFields(optFields).execute();

Add a collaborator to a goal

Adds followers to a goal. Returns the goal the followers were added to. Each goal can be associated with zero or more followers in the system. Requests to add/remove followers, if successful, will return the complete updated goal record, described above.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String goalGid = "12345"; // Globally unique identifier for the goal.
    TaskAddFollowersRequest data = new TaskAddFollowersRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      GoalsAddCollaboratorsToGoalResponse result = client
              .goals
              .addCollaboratorsToGoal(goalGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#addCollaboratorsToGoal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsAddCollaboratorsToGoalResponse> response = client
              .goals
              .addCollaboratorsToGoal(goalGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#addCollaboratorsToGoal");
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
| **goalGid** | **String**| Globally unique identifier for the goal. | |
| **goalsAddCollaboratorsToGoalRequest** | [**GoalsAddCollaboratorsToGoalRequest**](GoalsAddCollaboratorsToGoalRequest.md)| The followers to be added as collaborators | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: current_status_update, current_status_update.resource_subtype, current_status_update.title, due_on, followers, followers.name, html_notes, is_workspace_level, liked, likes, likes.user, likes.user.name, metric, metric.can_manage, metric.currency_code, metric.current_display_value, metric.current_number_value, metric.initial_number_value, metric.precision, metric.progress_source, metric.resource_subtype, metric.target_number_value, metric.unit, name, notes, num_likes, owner, owner.name, start_on, status, team, team.name, time_period, time_period.display_name, time_period.end_on, time_period.period, time_period.start_on, workspace, workspace.name] |

### Return type

[**GoalsAddCollaboratorsToGoalResponse**](GoalsAddCollaboratorsToGoalResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully added users as collaborators. |  -  |

<a name="createMetric"></a>
# **createMetric**
> GoalsCreateMetricResponse createMetric(goalGid, goalsCreateMetricRequest).optPretty(optPretty).optFields(optFields).execute();

Create a goal metric

Creates and adds a goal metric to a specified goal. Note that this replaces an existing goal metric if one already exists.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String goalGid = "12345"; // Globally unique identifier for the goal.
    GoalMetricBase data = new GoalMetricBase();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      GoalsCreateMetricResponse result = client
              .goals
              .createMetric(goalGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#createMetric");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsCreateMetricResponse> response = client
              .goals
              .createMetric(goalGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#createMetric");
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
| **goalGid** | **String**| Globally unique identifier for the goal. | |
| **goalsCreateMetricRequest** | [**GoalsCreateMetricRequest**](GoalsCreateMetricRequest.md)| The goal metric to create. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: current_status_update, current_status_update.resource_subtype, current_status_update.title, due_on, followers, followers.name, html_notes, is_workspace_level, liked, likes, likes.user, likes.user.name, metric, metric.can_manage, metric.currency_code, metric.current_display_value, metric.current_number_value, metric.initial_number_value, metric.precision, metric.progress_source, metric.resource_subtype, metric.target_number_value, metric.unit, name, notes, num_likes, owner, owner.name, start_on, status, team, team.name, time_period, time_period.display_name, time_period.end_on, time_period.period, time_period.start_on, workspace, workspace.name] |

### Return type

[**GoalsCreateMetricResponse**](GoalsCreateMetricResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a new goal metric. |  -  |

<a name="createNewGoalRecord"></a>
# **createNewGoalRecord**
> GoalsCreateNewGoalRecordResponse createNewGoalRecord(goalsCreateNewGoalRecordRequest).optPretty(optPretty).optFields(optFields).execute();

Create a goal

Creates a new goal in a workspace or team.  Returns the full record of the newly created goal.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    GoalRequest data = new GoalRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      GoalsCreateNewGoalRecordResponse result = client
              .goals
              .createNewGoalRecord()
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#createNewGoalRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsCreateNewGoalRecordResponse> response = client
              .goals
              .createNewGoalRecord()
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#createNewGoalRecord");
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
| **goalsCreateNewGoalRecordRequest** | [**GoalsCreateNewGoalRecordRequest**](GoalsCreateNewGoalRecordRequest.md)| The goal to create. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: current_status_update, current_status_update.resource_subtype, current_status_update.title, due_on, followers, followers.name, html_notes, is_workspace_level, liked, likes, likes.user, likes.user.name, metric, metric.can_manage, metric.currency_code, metric.current_display_value, metric.current_number_value, metric.initial_number_value, metric.precision, metric.progress_source, metric.resource_subtype, metric.target_number_value, metric.unit, name, notes, num_likes, owner, owner.name, start_on, status, team, team.name, time_period, time_period.display_name, time_period.end_on, time_period.period, time_period.start_on, workspace, workspace.name] |

### Return type

[**GoalsCreateNewGoalRecordResponse**](GoalsCreateNewGoalRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a new goal. |  -  |

<a name="deleteRecord"></a>
# **deleteRecord**
> GoalsDeleteRecordResponse deleteRecord(goalGid).optPretty(optPretty).execute();

Delete a goal

A specific, existing goal can be deleted by making a DELETE request on the URL for that goal.  Returns an empty data record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String goalGid = "12345"; // Globally unique identifier for the goal.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      GoalsDeleteRecordResponse result = client
              .goals
              .deleteRecord(goalGid)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#deleteRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsDeleteRecordResponse> response = client
              .goals
              .deleteRecord(goalGid)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#deleteRecord");
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
| **goalGid** | **String**| Globally unique identifier for the goal. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**GoalsDeleteRecordResponse**](GoalsDeleteRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the specified goal. |  -  |

<a name="getCompactRecords"></a>
# **getCompactRecords**
> GoalsGetCompactRecordsResponse getCompactRecords().optPretty(optPretty).portfolio(portfolio).project(project).task(task).isWorkspaceLevel(isWorkspaceLevel).team(team).workspace(workspace).timePeriods(timePeriods).limit(limit).offset(offset).optFields(optFields).execute();

Get goals

Returns compact goal records.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String portfolio = "159874"; // Globally unique identifier for supporting portfolio.
    String project = "512241"; // Globally unique identifier for supporting project.
    String task = "78424"; // Globally unique identifier for supporting task.
    Boolean isWorkspaceLevel = false; // Filter to goals with is_workspace_level set to query value. Must be used with the workspace parameter.
    String team = "31326"; // Globally unique identifier for the team.
    String workspace = "31326"; // Globally unique identifier for the workspace.
    List<String> timePeriods = Arrays.asList(); // Globally unique identifiers for the time periods.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      GoalsGetCompactRecordsResponse result = client
              .goals
              .getCompactRecords()
              .optPretty(optPretty)
              .portfolio(portfolio)
              .project(project)
              .task(task)
              .isWorkspaceLevel(isWorkspaceLevel)
              .team(team)
              .workspace(workspace)
              .timePeriods(timePeriods)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getCompactRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsGetCompactRecordsResponse> response = client
              .goals
              .getCompactRecords()
              .optPretty(optPretty)
              .portfolio(portfolio)
              .project(project)
              .task(task)
              .isWorkspaceLevel(isWorkspaceLevel)
              .team(team)
              .workspace(workspace)
              .timePeriods(timePeriods)
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
      System.err.println("Exception when calling GoalsApi#getCompactRecords");
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
| **portfolio** | **String**| Globally unique identifier for supporting portfolio. | [optional] |
| **project** | **String**| Globally unique identifier for supporting project. | [optional] |
| **task** | **String**| Globally unique identifier for supporting task. | [optional] |
| **isWorkspaceLevel** | **Boolean**| Filter to goals with is_workspace_level set to query value. Must be used with the workspace parameter. | [optional] |
| **team** | **String**| Globally unique identifier for the team. | [optional] |
| **workspace** | **String**| Globally unique identifier for the workspace. | [optional] |
| **timePeriods** | [**List&lt;String&gt;**](String.md)| Globally unique identifiers for the time periods. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: current_status_update, current_status_update.resource_subtype, current_status_update.title, due_on, followers, followers.name, html_notes, is_workspace_level, liked, likes, likes.user, likes.user.name, metric, metric.can_manage, metric.currency_code, metric.current_display_value, metric.current_number_value, metric.initial_number_value, metric.precision, metric.progress_source, metric.resource_subtype, metric.target_number_value, metric.unit, name, notes, num_likes, offset, owner, owner.name, path, start_on, status, team, team.name, time_period, time_period.display_name, time_period.end_on, time_period.period, time_period.start_on, uri, workspace, workspace.name] |

### Return type

[**GoalsGetCompactRecordsResponse**](GoalsGetCompactRecordsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the requested goals. |  -  |

<a name="getGoalRecord"></a>
# **getGoalRecord**
> GoalsGetGoalRecordResponse getGoalRecord(goalGid).optPretty(optPretty).optFields(optFields).execute();

Get a goal

Returns the complete goal record for a single goal.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String goalGid = "12345"; // Globally unique identifier for the goal.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      GoalsGetGoalRecordResponse result = client
              .goals
              .getGoalRecord(goalGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getGoalRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsGetGoalRecordResponse> response = client
              .goals
              .getGoalRecord(goalGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getGoalRecord");
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
| **goalGid** | **String**| Globally unique identifier for the goal. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: current_status_update, current_status_update.resource_subtype, current_status_update.title, due_on, followers, followers.name, html_notes, is_workspace_level, liked, likes, likes.user, likes.user.name, metric, metric.can_manage, metric.currency_code, metric.current_display_value, metric.current_number_value, metric.initial_number_value, metric.precision, metric.progress_source, metric.resource_subtype, metric.target_number_value, metric.unit, name, notes, num_likes, owner, owner.name, start_on, status, team, team.name, time_period, time_period.display_name, time_period.end_on, time_period.period, time_period.start_on, workspace, workspace.name] |

### Return type

[**GoalsGetGoalRecordResponse**](GoalsGetGoalRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the record for a single goal. |  -  |

<a name="getParentGoals"></a>
# **getParentGoals**
> GoalsGetParentGoalsResponse getParentGoals(goalGid).optPretty(optPretty).optFields(optFields).execute();

Get parent goals from a goal

Returns a compact representation of all of the parent goals of a goal.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String goalGid = "12345"; // Globally unique identifier for the goal.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      GoalsGetParentGoalsResponse result = client
              .goals
              .getParentGoals(goalGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getParentGoals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsGetParentGoalsResponse> response = client
              .goals
              .getParentGoals(goalGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getParentGoals");
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
| **goalGid** | **String**| Globally unique identifier for the goal. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: current_status_update, current_status_update.resource_subtype, current_status_update.title, due_on, followers, followers.name, html_notes, is_workspace_level, liked, likes, likes.user, likes.user.name, metric, metric.can_manage, metric.currency_code, metric.current_display_value, metric.current_number_value, metric.initial_number_value, metric.precision, metric.progress_source, metric.resource_subtype, metric.target_number_value, metric.unit, name, notes, num_likes, owner, owner.name, start_on, status, team, team.name, time_period, time_period.display_name, time_period.end_on, time_period.period, time_period.start_on, workspace, workspace.name] |

### Return type

[**GoalsGetParentGoalsResponse**](GoalsGetParentGoalsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the specified goal&#39;s parent goals. |  -  |

<a name="removeFollowersFromGoal"></a>
# **removeFollowersFromGoal**
> GoalsRemoveFollowersFromGoalResponse removeFollowersFromGoal(goalGid, goalsRemoveFollowersFromGoalRequest).optPretty(optPretty).optFields(optFields).execute();

Remove a collaborator from a goal

Removes followers from a goal. Returns the goal the followers were removed from. Each goal can be associated with zero or more followers in the system. Requests to add/remove followers, if successful, will return the complete updated goal record, described above.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String goalGid = "12345"; // Globally unique identifier for the goal.
    TaskAddFollowersRequest data = new TaskAddFollowersRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      GoalsRemoveFollowersFromGoalResponse result = client
              .goals
              .removeFollowersFromGoal(goalGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#removeFollowersFromGoal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsRemoveFollowersFromGoalResponse> response = client
              .goals
              .removeFollowersFromGoal(goalGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#removeFollowersFromGoal");
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
| **goalGid** | **String**| Globally unique identifier for the goal. | |
| **goalsRemoveFollowersFromGoalRequest** | [**GoalsRemoveFollowersFromGoalRequest**](GoalsRemoveFollowersFromGoalRequest.md)| The followers to be removed as collaborators | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: current_status_update, current_status_update.resource_subtype, current_status_update.title, due_on, followers, followers.name, html_notes, is_workspace_level, liked, likes, likes.user, likes.user.name, metric, metric.can_manage, metric.currency_code, metric.current_display_value, metric.current_number_value, metric.initial_number_value, metric.precision, metric.progress_source, metric.resource_subtype, metric.target_number_value, metric.unit, name, notes, num_likes, owner, owner.name, start_on, status, team, team.name, time_period, time_period.display_name, time_period.end_on, time_period.period, time_period.start_on, workspace, workspace.name] |

### Return type

[**GoalsRemoveFollowersFromGoalResponse**](GoalsRemoveFollowersFromGoalResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully removed users as collaborators. |  -  |

<a name="updateGoalRecord"></a>
# **updateGoalRecord**
> GoalsUpdateGoalRecordResponse updateGoalRecord(goalGid, goalsUpdateGoalRecordRequest).optPretty(optPretty).optFields(optFields).execute();

Update a goal

An existing goal can be updated by making a PUT request on the URL for that goal. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated goal record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String goalGid = "12345"; // Globally unique identifier for the goal.
    GoalUpdateRequest data = new GoalUpdateRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      GoalsUpdateGoalRecordResponse result = client
              .goals
              .updateGoalRecord(goalGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateGoalRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsUpdateGoalRecordResponse> response = client
              .goals
              .updateGoalRecord(goalGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateGoalRecord");
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
| **goalGid** | **String**| Globally unique identifier for the goal. | |
| **goalsUpdateGoalRecordRequest** | [**GoalsUpdateGoalRecordRequest**](GoalsUpdateGoalRecordRequest.md)| The updated fields for the goal. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: current_status_update, current_status_update.resource_subtype, current_status_update.title, due_on, followers, followers.name, html_notes, is_workspace_level, liked, likes, likes.user, likes.user.name, metric, metric.can_manage, metric.currency_code, metric.current_display_value, metric.current_number_value, metric.initial_number_value, metric.precision, metric.progress_source, metric.resource_subtype, metric.target_number_value, metric.unit, name, notes, num_likes, owner, owner.name, start_on, status, team, team.name, time_period, time_period.display_name, time_period.end_on, time_period.period, time_period.start_on, workspace, workspace.name] |

### Return type

[**GoalsUpdateGoalRecordResponse**](GoalsUpdateGoalRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the goal. |  -  |

<a name="updateMetricCurrentValue"></a>
# **updateMetricCurrentValue**
> GoalsUpdateMetricCurrentValueResponse updateMetricCurrentValue(goalGid, goalsUpdateMetricCurrentValueRequest).optPretty(optPretty).optFields(optFields).execute();

Update a goal metric

Updates a goal&#39;s existing metric&#39;s &#x60;current_number_value&#x60; if one exists, otherwise responds with a 400 status code.  Returns the complete updated goal metric record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String goalGid = "12345"; // Globally unique identifier for the goal.
    GoalMetricCurrentValueRequest data = new GoalMetricCurrentValueRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      GoalsUpdateMetricCurrentValueResponse result = client
              .goals
              .updateMetricCurrentValue(goalGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateMetricCurrentValue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsUpdateMetricCurrentValueResponse> response = client
              .goals
              .updateMetricCurrentValue(goalGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateMetricCurrentValue");
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
| **goalGid** | **String**| Globally unique identifier for the goal. | |
| **goalsUpdateMetricCurrentValueRequest** | [**GoalsUpdateMetricCurrentValueRequest**](GoalsUpdateMetricCurrentValueRequest.md)| The updated fields for the goal metric. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: current_status_update, current_status_update.resource_subtype, current_status_update.title, due_on, followers, followers.name, html_notes, is_workspace_level, liked, likes, likes.user, likes.user.name, metric, metric.can_manage, metric.currency_code, metric.current_display_value, metric.current_number_value, metric.initial_number_value, metric.precision, metric.progress_source, metric.resource_subtype, metric.target_number_value, metric.unit, name, notes, num_likes, owner, owner.name, start_on, status, team, team.name, time_period, time_period.display_name, time_period.end_on, time_period.period, time_period.start_on, workspace, workspace.name] |

### Return type

[**GoalsUpdateMetricCurrentValueResponse**](GoalsUpdateMetricCurrentValueResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the goal metric. |  -  |

