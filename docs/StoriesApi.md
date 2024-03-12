# StoriesApi

All URIs are relative to *https://app.asana.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createComment**](StoriesApi.md#createComment) | **POST** /tasks/{task_gid}/stories | Create a story on a task |
| [**deleteStoryRecord**](StoriesApi.md#deleteStoryRecord) | **DELETE** /stories/{story_gid} | Delete a story |
| [**getFullRecord**](StoriesApi.md#getFullRecord) | **GET** /stories/{story_gid} | Get a story |
| [**getTaskStories**](StoriesApi.md#getTaskStories) | **GET** /tasks/{task_gid}/stories | Get stories from a task |
| [**updateFullRecord**](StoriesApi.md#updateFullRecord) | **PUT** /stories/{story_gid} | Update a story |


<a name="createComment"></a>
# **createComment**
> StoriesCreateCommentResponse createComment(taskGid, storiesCreateCommentRequest).optPretty(optPretty).optFields(optFields).execute();

Create a story on a task

Adds a story to a task. This endpoint currently only allows for comment stories to be created. The comment will be authored by the currently authenticated user, and timestamped when the server receives the request.  Returns the full record for the new story added to the task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StoriesApi;
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
    String taskGid = "321654"; // The task to operate on.
    StoryBase data = new StoryBase();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      StoriesCreateCommentResponse result = client
              .stories
              .createComment(taskGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling StoriesApi#createComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StoriesCreateCommentResponse> response = client
              .stories
              .createComment(taskGid)
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
      System.err.println("Exception when calling StoriesApi#createComment");
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
| **taskGid** | **String**| The task to operate on. | |
| **storiesCreateCommentRequest** | [**StoriesCreateCommentRequest**](StoriesCreateCommentRequest.md)| The story to create. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: assignee, assignee.name, created_at, created_by, created_by.name, custom_field, custom_field.date_value, custom_field.date_value.date, custom_field.date_value.date_time, custom_field.display_value, custom_field.enabled, custom_field.enum_options, custom_field.enum_options.color, custom_field.enum_options.enabled, custom_field.enum_options.name, custom_field.enum_value, custom_field.enum_value.color, custom_field.enum_value.enabled, custom_field.enum_value.name, custom_field.id_prefix, custom_field.is_formula_field, custom_field.multi_enum_values, custom_field.multi_enum_values.color, custom_field.multi_enum_values.enabled, custom_field.multi_enum_values.name, custom_field.name, custom_field.number_value, custom_field.representation_type, custom_field.resource_subtype, custom_field.text_value, custom_field.type, dependency, dependency.created_by, dependency.name, dependency.resource_subtype, duplicate_of, duplicate_of.created_by, duplicate_of.name, duplicate_of.resource_subtype, duplicated_from, duplicated_from.created_by, duplicated_from.name, duplicated_from.resource_subtype, follower, follower.name, hearted, hearts, hearts.user, hearts.user.name, html_text, is_editable, is_edited, is_pinned, liked, likes, likes.user, likes.user.name, new_approval_status, new_date_value, new_dates, new_dates.due_at, new_dates.due_on, new_dates.start_on, new_enum_value, new_enum_value.color, new_enum_value.enabled, new_enum_value.name, new_multi_enum_values, new_multi_enum_values.color, new_multi_enum_values.enabled, new_multi_enum_values.name, new_name, new_number_value, new_people_value, new_people_value.name, new_resource_subtype, new_section, new_section.name, new_text_value, num_hearts, num_likes, old_approval_status, old_date_value, old_dates, old_dates.due_at, old_dates.due_on, old_dates.start_on, old_enum_value, old_enum_value.color, old_enum_value.enabled, old_enum_value.name, old_multi_enum_values, old_multi_enum_values.color, old_multi_enum_values.enabled, old_multi_enum_values.name, old_name, old_number_value, old_people_value, old_people_value.name, old_resource_subtype, old_section, old_section.name, old_text_value, previews, previews.fallback, previews.footer, previews.header, previews.header_link, previews.html_text, previews.text, previews.title, previews.title_link, project, project.name, resource_subtype, source, sticker_name, story, story.created_at, story.created_by, story.created_by.name, story.resource_subtype, story.text, tag, tag.name, target, target.created_by, target.name, target.resource_subtype, task, task.created_by, task.name, task.resource_subtype, text, type] |

### Return type

[**StoriesCreateCommentResponse**](StoriesCreateCommentResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a new story. |  -  |

<a name="deleteStoryRecord"></a>
# **deleteStoryRecord**
> StoriesDeleteStoryRecordResponse deleteStoryRecord(storyGid).optPretty(optPretty).execute();

Delete a story

Deletes a story. A user can only delete stories they have created.  Returns an empty data record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StoriesApi;
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
    String storyGid = "35678"; // Globally unique identifier for the story.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      StoriesDeleteStoryRecordResponse result = client
              .stories
              .deleteStoryRecord(storyGid)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling StoriesApi#deleteStoryRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StoriesDeleteStoryRecordResponse> response = client
              .stories
              .deleteStoryRecord(storyGid)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StoriesApi#deleteStoryRecord");
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
| **storyGid** | **String**| Globally unique identifier for the story. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**StoriesDeleteStoryRecordResponse**](StoriesDeleteStoryRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the specified story. |  -  |

<a name="getFullRecord"></a>
# **getFullRecord**
> StoriesGetFullRecordResponse getFullRecord(storyGid).optPretty(optPretty).optFields(optFields).execute();

Get a story

Returns the full record for a single story.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StoriesApi;
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
    String storyGid = "35678"; // Globally unique identifier for the story.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      StoriesGetFullRecordResponse result = client
              .stories
              .getFullRecord(storyGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling StoriesApi#getFullRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StoriesGetFullRecordResponse> response = client
              .stories
              .getFullRecord(storyGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StoriesApi#getFullRecord");
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
| **storyGid** | **String**| Globally unique identifier for the story. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: assignee, assignee.name, created_at, created_by, created_by.name, custom_field, custom_field.date_value, custom_field.date_value.date, custom_field.date_value.date_time, custom_field.display_value, custom_field.enabled, custom_field.enum_options, custom_field.enum_options.color, custom_field.enum_options.enabled, custom_field.enum_options.name, custom_field.enum_value, custom_field.enum_value.color, custom_field.enum_value.enabled, custom_field.enum_value.name, custom_field.id_prefix, custom_field.is_formula_field, custom_field.multi_enum_values, custom_field.multi_enum_values.color, custom_field.multi_enum_values.enabled, custom_field.multi_enum_values.name, custom_field.name, custom_field.number_value, custom_field.representation_type, custom_field.resource_subtype, custom_field.text_value, custom_field.type, dependency, dependency.created_by, dependency.name, dependency.resource_subtype, duplicate_of, duplicate_of.created_by, duplicate_of.name, duplicate_of.resource_subtype, duplicated_from, duplicated_from.created_by, duplicated_from.name, duplicated_from.resource_subtype, follower, follower.name, hearted, hearts, hearts.user, hearts.user.name, html_text, is_editable, is_edited, is_pinned, liked, likes, likes.user, likes.user.name, new_approval_status, new_date_value, new_dates, new_dates.due_at, new_dates.due_on, new_dates.start_on, new_enum_value, new_enum_value.color, new_enum_value.enabled, new_enum_value.name, new_multi_enum_values, new_multi_enum_values.color, new_multi_enum_values.enabled, new_multi_enum_values.name, new_name, new_number_value, new_people_value, new_people_value.name, new_resource_subtype, new_section, new_section.name, new_text_value, num_hearts, num_likes, old_approval_status, old_date_value, old_dates, old_dates.due_at, old_dates.due_on, old_dates.start_on, old_enum_value, old_enum_value.color, old_enum_value.enabled, old_enum_value.name, old_multi_enum_values, old_multi_enum_values.color, old_multi_enum_values.enabled, old_multi_enum_values.name, old_name, old_number_value, old_people_value, old_people_value.name, old_resource_subtype, old_section, old_section.name, old_text_value, previews, previews.fallback, previews.footer, previews.header, previews.header_link, previews.html_text, previews.text, previews.title, previews.title_link, project, project.name, resource_subtype, source, sticker_name, story, story.created_at, story.created_by, story.created_by.name, story.resource_subtype, story.text, tag, tag.name, target, target.created_by, target.name, target.resource_subtype, task, task.created_by, task.name, task.resource_subtype, text, type] |

### Return type

[**StoriesGetFullRecordResponse**](StoriesGetFullRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the specified story. |  -  |

<a name="getTaskStories"></a>
# **getTaskStories**
> StoriesGetTaskStoriesResponse getTaskStories(taskGid).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get stories from a task

Returns the compact records for all stories on the task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StoriesApi;
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
    String taskGid = "321654"; // The task to operate on.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      StoriesGetTaskStoriesResponse result = client
              .stories
              .getTaskStories(taskGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling StoriesApi#getTaskStories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StoriesGetTaskStoriesResponse> response = client
              .stories
              .getTaskStories(taskGid)
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
      System.err.println("Exception when calling StoriesApi#getTaskStories");
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
| **taskGid** | **String**| The task to operate on. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: assignee, assignee.name, created_at, created_by, created_by.name, custom_field, custom_field.date_value, custom_field.date_value.date, custom_field.date_value.date_time, custom_field.display_value, custom_field.enabled, custom_field.enum_options, custom_field.enum_options.color, custom_field.enum_options.enabled, custom_field.enum_options.name, custom_field.enum_value, custom_field.enum_value.color, custom_field.enum_value.enabled, custom_field.enum_value.name, custom_field.id_prefix, custom_field.is_formula_field, custom_field.multi_enum_values, custom_field.multi_enum_values.color, custom_field.multi_enum_values.enabled, custom_field.multi_enum_values.name, custom_field.name, custom_field.number_value, custom_field.representation_type, custom_field.resource_subtype, custom_field.text_value, custom_field.type, dependency, dependency.created_by, dependency.name, dependency.resource_subtype, duplicate_of, duplicate_of.created_by, duplicate_of.name, duplicate_of.resource_subtype, duplicated_from, duplicated_from.created_by, duplicated_from.name, duplicated_from.resource_subtype, follower, follower.name, hearted, hearts, hearts.user, hearts.user.name, html_text, is_editable, is_edited, is_pinned, liked, likes, likes.user, likes.user.name, new_approval_status, new_date_value, new_dates, new_dates.due_at, new_dates.due_on, new_dates.start_on, new_enum_value, new_enum_value.color, new_enum_value.enabled, new_enum_value.name, new_multi_enum_values, new_multi_enum_values.color, new_multi_enum_values.enabled, new_multi_enum_values.name, new_name, new_number_value, new_people_value, new_people_value.name, new_resource_subtype, new_section, new_section.name, new_text_value, num_hearts, num_likes, offset, old_approval_status, old_date_value, old_dates, old_dates.due_at, old_dates.due_on, old_dates.start_on, old_enum_value, old_enum_value.color, old_enum_value.enabled, old_enum_value.name, old_multi_enum_values, old_multi_enum_values.color, old_multi_enum_values.enabled, old_multi_enum_values.name, old_name, old_number_value, old_people_value, old_people_value.name, old_resource_subtype, old_section, old_section.name, old_text_value, path, previews, previews.fallback, previews.footer, previews.header, previews.header_link, previews.html_text, previews.text, previews.title, previews.title_link, project, project.name, resource_subtype, source, sticker_name, story, story.created_at, story.created_by, story.created_by.name, story.resource_subtype, story.text, tag, tag.name, target, target.created_by, target.name, target.resource_subtype, task, task.created_by, task.name, task.resource_subtype, text, type, uri] |

### Return type

[**StoriesGetTaskStoriesResponse**](StoriesGetTaskStoriesResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the specified task&#39;s stories. |  -  |

<a name="updateFullRecord"></a>
# **updateFullRecord**
> StoriesUpdateFullRecordResponse updateFullRecord(storyGid, storiesUpdateFullRecordRequest).optPretty(optPretty).optFields(optFields).execute();

Update a story

Updates the story and returns the full record for the updated story. Only comment stories can have their text updated, and only comment stories and attachment stories can be pinned. Only one of &#x60;text&#x60; and &#x60;html_text&#x60; can be specified.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StoriesApi;
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
    String storyGid = "35678"; // Globally unique identifier for the story.
    StoryBase data = new StoryBase();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      StoriesUpdateFullRecordResponse result = client
              .stories
              .updateFullRecord(storyGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling StoriesApi#updateFullRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StoriesUpdateFullRecordResponse> response = client
              .stories
              .updateFullRecord(storyGid)
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
      System.err.println("Exception when calling StoriesApi#updateFullRecord");
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
| **storyGid** | **String**| Globally unique identifier for the story. | |
| **storiesUpdateFullRecordRequest** | [**StoriesUpdateFullRecordRequest**](StoriesUpdateFullRecordRequest.md)| The comment story to update. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: assignee, assignee.name, created_at, created_by, created_by.name, custom_field, custom_field.date_value, custom_field.date_value.date, custom_field.date_value.date_time, custom_field.display_value, custom_field.enabled, custom_field.enum_options, custom_field.enum_options.color, custom_field.enum_options.enabled, custom_field.enum_options.name, custom_field.enum_value, custom_field.enum_value.color, custom_field.enum_value.enabled, custom_field.enum_value.name, custom_field.id_prefix, custom_field.is_formula_field, custom_field.multi_enum_values, custom_field.multi_enum_values.color, custom_field.multi_enum_values.enabled, custom_field.multi_enum_values.name, custom_field.name, custom_field.number_value, custom_field.representation_type, custom_field.resource_subtype, custom_field.text_value, custom_field.type, dependency, dependency.created_by, dependency.name, dependency.resource_subtype, duplicate_of, duplicate_of.created_by, duplicate_of.name, duplicate_of.resource_subtype, duplicated_from, duplicated_from.created_by, duplicated_from.name, duplicated_from.resource_subtype, follower, follower.name, hearted, hearts, hearts.user, hearts.user.name, html_text, is_editable, is_edited, is_pinned, liked, likes, likes.user, likes.user.name, new_approval_status, new_date_value, new_dates, new_dates.due_at, new_dates.due_on, new_dates.start_on, new_enum_value, new_enum_value.color, new_enum_value.enabled, new_enum_value.name, new_multi_enum_values, new_multi_enum_values.color, new_multi_enum_values.enabled, new_multi_enum_values.name, new_name, new_number_value, new_people_value, new_people_value.name, new_resource_subtype, new_section, new_section.name, new_text_value, num_hearts, num_likes, old_approval_status, old_date_value, old_dates, old_dates.due_at, old_dates.due_on, old_dates.start_on, old_enum_value, old_enum_value.color, old_enum_value.enabled, old_enum_value.name, old_multi_enum_values, old_multi_enum_values.color, old_multi_enum_values.enabled, old_multi_enum_values.name, old_name, old_number_value, old_people_value, old_people_value.name, old_resource_subtype, old_section, old_section.name, old_text_value, previews, previews.fallback, previews.footer, previews.header, previews.header_link, previews.html_text, previews.text, previews.title, previews.title_link, project, project.name, resource_subtype, source, sticker_name, story, story.created_at, story.created_by, story.created_by.name, story.resource_subtype, story.text, tag, tag.name, target, target.created_by, target.name, target.resource_subtype, task, task.created_by, task.name, task.resource_subtype, text, type] |

### Return type

[**StoriesUpdateFullRecordResponse**](StoriesUpdateFullRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the specified story. |  -  |

