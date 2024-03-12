# TasksApi

All URIs are relative to *https://app.asana.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFollowersToTask**](TasksApi.md#addFollowersToTask) | **POST** /tasks/{task_gid}/addFollowers | Add followers to a task |
| [**addProjectToTask**](TasksApi.md#addProjectToTask) | **POST** /tasks/{task_gid}/addProject | Add a project to a task |
| [**addTagToTask**](TasksApi.md#addTagToTask) | **POST** /tasks/{task_gid}/addTag | Add a tag to a task |
| [**createNewTask**](TasksApi.md#createNewTask) | **POST** /tasks | Create a task |
| [**createSubtaskRecord**](TasksApi.md#createSubtaskRecord) | **POST** /tasks/{task_gid}/subtasks | Create a subtask |
| [**deleteTask**](TasksApi.md#deleteTask) | **DELETE** /tasks/{task_gid} | Delete a task |
| [**duplicateTaskJob**](TasksApi.md#duplicateTaskJob) | **POST** /tasks/{task_gid}/duplicate | Duplicate a task |
| [**getAllDependencies**](TasksApi.md#getAllDependencies) | **GET** /tasks/{task_gid}/dependencies | Get dependencies from a task |
| [**getByCustomId**](TasksApi.md#getByCustomId) | **GET** /workspaces/{workspace_gid}/tasks/custom_id/{custom_id} | Get a task for a given custom ID |
| [**getDependents**](TasksApi.md#getDependents) | **GET** /tasks/{task_gid}/dependents | Get dependents from a task |
| [**getMultiple**](TasksApi.md#getMultiple) | **GET** /tasks | Get multiple tasks |
| [**getMultipleWithTag**](TasksApi.md#getMultipleWithTag) | **GET** /tags/{tag_gid}/tasks | Get tasks from a tag |
| [**getSectionTasks**](TasksApi.md#getSectionTasks) | **GET** /sections/{section_gid}/tasks | Get tasks from a section |
| [**getSubtaskList**](TasksApi.md#getSubtaskList) | **GET** /tasks/{task_gid}/subtasks | Get subtasks from a task |
| [**getTaskRecord**](TasksApi.md#getTaskRecord) | **GET** /tasks/{task_gid} | Get a task |
| [**getTasksByProject**](TasksApi.md#getTasksByProject) | **GET** /projects/{project_gid}/tasks | Get tasks from a project |
| [**getUserTaskListTasks**](TasksApi.md#getUserTaskListTasks) | **GET** /user_task_lists/{user_task_list_gid}/tasks | Get tasks from a user task list |
| [**removeFollowersFromTask**](TasksApi.md#removeFollowersFromTask) | **POST** /tasks/{task_gid}/removeFollowers | Remove followers from a task |
| [**removeProjectFromTask**](TasksApi.md#removeProjectFromTask) | **POST** /tasks/{task_gid}/removeProject | Remove a project from a task |
| [**removeTagFromTask**](TasksApi.md#removeTagFromTask) | **POST** /tasks/{task_gid}/removeTag | Remove a tag from a task |
| [**searchInWorkspace**](TasksApi.md#searchInWorkspace) | **GET** /workspaces/{workspace_gid}/tasks/search | Search tasks in a workspace |
| [**setDependenciesForTask**](TasksApi.md#setDependenciesForTask) | **POST** /tasks/{task_gid}/addDependencies | Set dependencies for a task |
| [**setParentTask**](TasksApi.md#setParentTask) | **POST** /tasks/{task_gid}/setParent | Set the parent of a task |
| [**setTaskDependents**](TasksApi.md#setTaskDependents) | **POST** /tasks/{task_gid}/addDependents | Set dependents for a task |
| [**unlinkDependenciesFromTask**](TasksApi.md#unlinkDependenciesFromTask) | **POST** /tasks/{task_gid}/removeDependencies | Unlink dependencies from a task |
| [**unlinkDependents**](TasksApi.md#unlinkDependents) | **POST** /tasks/{task_gid}/removeDependents | Unlink dependents from a task |
| [**updateTaskRecord**](TasksApi.md#updateTaskRecord) | **PUT** /tasks/{task_gid} | Update a task |


<a name="addFollowersToTask"></a>
# **addFollowersToTask**
> TasksAddFollowersToTaskResponse addFollowersToTask(taskGid, tasksAddFollowersToTaskRequest).optPretty(optPretty).optFields(optFields).execute();

Add followers to a task

Adds followers to a task. Returns an empty data block. Each task can be associated with zero or more followers in the system. Requests to add/remove followers, if successful, will return the complete updated task record, described above.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    TaskAddFollowersRequest data = new TaskAddFollowersRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksAddFollowersToTaskResponse result = client
              .tasks
              .addFollowersToTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#addFollowersToTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksAddFollowersToTaskResponse> response = client
              .tasks
              .addFollowersToTask(taskGid)
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
      System.err.println("Exception when calling TasksApi#addFollowersToTask");
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
| **tasksAddFollowersToTaskRequest** | [**TasksAddFollowersToTaskRequest**](TasksAddFollowersToTaskRequest.md)| The followers to add to the task. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, parent, parent.created_by, parent.name, parent.resource_subtype, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, workspace, workspace.name] |

### Return type

[**TasksAddFollowersToTaskResponse**](TasksAddFollowersToTaskResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully added the specified followers to the task. |  -  |

<a name="addProjectToTask"></a>
# **addProjectToTask**
> TasksAddProjectToTaskResponse addProjectToTask(taskGid, tasksAddProjectToTaskRequest).optPretty(optPretty).execute();

Add a project to a task

Adds the task to the specified project, in the optional location specified. If no location arguments are given, the task will be added to the end of the project.  &#x60;addProject&#x60; can also be used to reorder a task within a project or section that already contains it.  At most one of &#x60;insert_before&#x60;, &#x60;insert_after&#x60;, or &#x60;section&#x60; should be specified. Inserting into a section in an non-order-dependent way can be done by specifying section, otherwise, to insert within a section in a particular place, specify &#x60;insert_before&#x60; or &#x60;insert_after&#x60; and a task within the section to anchor the position of this task.  Returns an empty data block.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    TaskAddProjectRequest data = new TaskAddProjectRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      TasksAddProjectToTaskResponse result = client
              .tasks
              .addProjectToTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#addProjectToTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksAddProjectToTaskResponse> response = client
              .tasks
              .addProjectToTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#addProjectToTask");
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
| **tasksAddProjectToTaskRequest** | [**TasksAddProjectToTaskRequest**](TasksAddProjectToTaskRequest.md)| The project to add the task to. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**TasksAddProjectToTaskResponse**](TasksAddProjectToTaskResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully added the specified project to the task. |  -  |

<a name="addTagToTask"></a>
# **addTagToTask**
> TasksAddTagToTaskResponse addTagToTask(taskGid, tasksAddTagToTaskRequest).optPretty(optPretty).execute();

Add a tag to a task

Adds a tag to a task. Returns an empty data block.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    TaskAddTagRequest data = new TaskAddTagRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      TasksAddTagToTaskResponse result = client
              .tasks
              .addTagToTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#addTagToTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksAddTagToTaskResponse> response = client
              .tasks
              .addTagToTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#addTagToTask");
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
| **tasksAddTagToTaskRequest** | [**TasksAddTagToTaskRequest**](TasksAddTagToTaskRequest.md)| The tag to add to the task. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**TasksAddTagToTaskResponse**](TasksAddTagToTaskResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully added the specified tag to the task. |  -  |

<a name="createNewTask"></a>
# **createNewTask**
> TasksCreateNewTaskResponse createNewTask(tasksCreateNewTaskRequest).optPretty(optPretty).optFields(optFields).execute();

Create a task

Creating a new task is as easy as POSTing to the &#x60;/tasks&#x60; endpoint with a data block containing the fields you’d like to set on the task. Any unspecified fields will take on default values.  Every task is required to be created in a specific workspace, and this workspace cannot be changed once set. The workspace need not be set explicitly if you specify &#x60;projects&#x60; or a &#x60;parent&#x60; task instead.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    TaskRequest data = new TaskRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksCreateNewTaskResponse result = client
              .tasks
              .createNewTask()
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#createNewTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksCreateNewTaskResponse> response = client
              .tasks
              .createNewTask()
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
      System.err.println("Exception when calling TasksApi#createNewTask");
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
| **tasksCreateNewTaskRequest** | [**TasksCreateNewTaskRequest**](TasksCreateNewTaskRequest.md)| The task to create. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, parent, parent.created_by, parent.name, parent.resource_subtype, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, workspace, workspace.name] |

### Return type

[**TasksCreateNewTaskResponse**](TasksCreateNewTaskResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a new task. |  -  |

<a name="createSubtaskRecord"></a>
# **createSubtaskRecord**
> TasksCreateSubtaskRecordResponse createSubtaskRecord(taskGid, tasksCreateSubtaskRecordRequest).optPretty(optPretty).optFields(optFields).execute();

Create a subtask

Creates a new subtask and adds it to the parent task. Returns the full record for the newly created subtask.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    TaskRequest data = new TaskRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksCreateSubtaskRecordResponse result = client
              .tasks
              .createSubtaskRecord(taskGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#createSubtaskRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksCreateSubtaskRecordResponse> response = client
              .tasks
              .createSubtaskRecord(taskGid)
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
      System.err.println("Exception when calling TasksApi#createSubtaskRecord");
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
| **tasksCreateSubtaskRecordRequest** | [**TasksCreateSubtaskRecordRequest**](TasksCreateSubtaskRecordRequest.md)| The new subtask to create. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, parent, parent.created_by, parent.name, parent.resource_subtype, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, workspace, workspace.name] |

### Return type

[**TasksCreateSubtaskRecordResponse**](TasksCreateSubtaskRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created the specified subtask. |  -  |

<a name="deleteTask"></a>
# **deleteTask**
> TasksDeleteTaskResponse deleteTask(taskGid).optPretty(optPretty).execute();

Delete a task

A specific, existing task can be deleted by making a DELETE request on the URL for that task. Deleted tasks go into the “trash” of the user making the delete request. Tasks can be recovered from the trash within a period of 30 days; afterward they are completely removed from the system.  Returns an empty data record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    try {
      TasksDeleteTaskResponse result = client
              .tasks
              .deleteTask(taskGid)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#deleteTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksDeleteTaskResponse> response = client
              .tasks
              .deleteTask(taskGid)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#deleteTask");
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

### Return type

[**TasksDeleteTaskResponse**](TasksDeleteTaskResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the specified task. |  -  |

<a name="duplicateTaskJob"></a>
# **duplicateTaskJob**
> TasksDuplicateTaskJobResponse duplicateTaskJob(taskGid, tasksDuplicateTaskJobRequest).optPretty(optPretty).optFields(optFields).execute();

Duplicate a task

Creates and returns a job that will asynchronously handle the duplication.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    TaskDuplicateRequest data = new TaskDuplicateRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksDuplicateTaskJobResponse result = client
              .tasks
              .duplicateTaskJob(taskGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#duplicateTaskJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksDuplicateTaskJobResponse> response = client
              .tasks
              .duplicateTaskJob(taskGid)
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
      System.err.println("Exception when calling TasksApi#duplicateTaskJob");
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
| **tasksDuplicateTaskJobRequest** | [**TasksDuplicateTaskJobRequest**](TasksDuplicateTaskJobRequest.md)| Describes the duplicate&#39;s name and the fields that will be duplicated. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: new_project, new_project.name, new_project_template, new_project_template.name, new_task, new_task.created_by, new_task.name, new_task.resource_subtype, new_task_template, new_task_template.name, resource_subtype, status] |

### Return type

[**TasksDuplicateTaskJobResponse**](TasksDuplicateTaskJobResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created the job to handle duplication. |  -  |

<a name="getAllDependencies"></a>
# **getAllDependencies**
> TasksGetAllDependenciesResponse getAllDependencies(taskGid).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get dependencies from a task

Returns the compact representations of all of the dependencies of a task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
      TasksGetAllDependenciesResponse result = client
              .tasks
              .getAllDependencies(taskGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getAllDependencies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksGetAllDependenciesResponse> response = client
              .tasks
              .getAllDependencies(taskGid)
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
      System.err.println("Exception when calling TasksApi#getAllDependencies");
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
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, offset, parent, parent.created_by, parent.name, parent.resource_subtype, path, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, uri, workspace, workspace.name] |

### Return type

[**TasksGetAllDependenciesResponse**](TasksGetAllDependenciesResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the specified task&#39;s dependencies. |  -  |

<a name="getByCustomId"></a>
# **getByCustomId**
> TasksGetByCustomIdResponse getByCustomId(workspaceGid, customId).execute();

Get a task for a given custom ID

Returns a task given a custom ID shortcode.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String customId = "EX-1"; // Generated custom ID for a task.
    try {
      TasksGetByCustomIdResponse result = client
              .tasks
              .getByCustomId(workspaceGid, customId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getByCustomId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksGetByCustomIdResponse> response = client
              .tasks
              .getByCustomId(workspaceGid, customId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getByCustomId");
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
| **customId** | **String**| Generated custom ID for a task. | |

### Return type

[**TasksGetByCustomIdResponse**](TasksGetByCustomIdResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved task for given custom ID. |  -  |

<a name="getDependents"></a>
# **getDependents**
> TasksGetDependentsResponse getDependents(taskGid).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get dependents from a task

Returns the compact representations of all of the dependents of a task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
      TasksGetDependentsResponse result = client
              .tasks
              .getDependents(taskGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getDependents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksGetDependentsResponse> response = client
              .tasks
              .getDependents(taskGid)
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
      System.err.println("Exception when calling TasksApi#getDependents");
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
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, offset, parent, parent.created_by, parent.name, parent.resource_subtype, path, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, uri, workspace, workspace.name] |

### Return type

[**TasksGetDependentsResponse**](TasksGetDependentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the specified dependents of the task. |  -  |

<a name="getMultiple"></a>
# **getMultiple**
> TasksGetMultipleResponse getMultiple().optPretty(optPretty).limit(limit).offset(offset).assignee(assignee).project(project).section(section).workspace(workspace).completedSince(completedSince).modifiedSince(modifiedSince).optFields(optFields).execute();

Get multiple tasks

Returns the compact task records for some filtered set of tasks. Use one or more of the parameters provided to filter the tasks returned. You must specify a &#x60;project&#x60; or &#x60;tag&#x60; if you do not specify &#x60;assignee&#x60; and &#x60;workspace&#x60;.  For more complex task retrieval, use [workspaces/{workspace_gid}/tasks/search](https://raw.githubusercontent.com).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String assignee = "14641"; // The assignee to filter tasks on. If searching for unassigned tasks, assignee.any = null can be specified. *Note: If you specify `assignee`, you must also specify the `workspace` to filter on.*
    String project = "321654"; // The project to filter tasks on.
    String section = "321654"; // The section to filter tasks on.
    String workspace = "321654"; // The workspace to filter tasks on. *Note: If you specify `workspace`, you must also specify the `assignee` to filter on.*
    OffsetDateTime completedSince = OffsetDateTime.parse("2012-02-22T02:06:58.158Z"); // Only return tasks that are either incomplete or that have been completed since this time.
    OffsetDateTime modifiedSince = OffsetDateTime.parse("2012-02-22T02:06:58.158Z"); // Only return tasks that have been modified since the given time.  *Note: A task is considered “modified” if any of its properties change, or associations between it and other objects are modified (e.g.  a task being added to a project). A task is not considered modified just because another object it is associated with (e.g. a subtask) is modified. Actions that count as modifying the task include assigning, renaming, completing, and adding stories.*
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksGetMultipleResponse result = client
              .tasks
              .getMultiple()
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .assignee(assignee)
              .project(project)
              .section(section)
              .workspace(workspace)
              .completedSince(completedSince)
              .modifiedSince(modifiedSince)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getMultiple");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksGetMultipleResponse> response = client
              .tasks
              .getMultiple()
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .assignee(assignee)
              .project(project)
              .section(section)
              .workspace(workspace)
              .completedSince(completedSince)
              .modifiedSince(modifiedSince)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getMultiple");
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
| **assignee** | **String**| The assignee to filter tasks on. If searching for unassigned tasks, assignee.any &#x3D; null can be specified. *Note: If you specify &#x60;assignee&#x60;, you must also specify the &#x60;workspace&#x60; to filter on.* | [optional] |
| **project** | **String**| The project to filter tasks on. | [optional] |
| **section** | **String**| The section to filter tasks on. | [optional] |
| **workspace** | **String**| The workspace to filter tasks on. *Note: If you specify &#x60;workspace&#x60;, you must also specify the &#x60;assignee&#x60; to filter on.* | [optional] |
| **completedSince** | **OffsetDateTime**| Only return tasks that are either incomplete or that have been completed since this time. | [optional] |
| **modifiedSince** | **OffsetDateTime**| Only return tasks that have been modified since the given time.  *Note: A task is considered “modified” if any of its properties change, or associations between it and other objects are modified (e.g.  a task being added to a project). A task is not considered modified just because another object it is associated with (e.g. a subtask) is modified. Actions that count as modifying the task include assigning, renaming, completing, and adding stories.* | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, offset, parent, parent.created_by, parent.name, parent.resource_subtype, path, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, uri, workspace, workspace.name] |

### Return type

[**TasksGetMultipleResponse**](TasksGetMultipleResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved requested tasks. |  -  |

<a name="getMultipleWithTag"></a>
# **getMultipleWithTag**
> TasksGetMultipleWithTagResponse getMultipleWithTag(tagGid).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get tasks from a tag

Returns the compact task records for all tasks with the given tag. Tasks can have more than one tag at a time.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String tagGid = "11235"; // Globally unique identifier for the tag.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksGetMultipleWithTagResponse result = client
              .tasks
              .getMultipleWithTag(tagGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getMultipleWithTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksGetMultipleWithTagResponse> response = client
              .tasks
              .getMultipleWithTag(tagGid)
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
      System.err.println("Exception when calling TasksApi#getMultipleWithTag");
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
| **tagGid** | **String**| Globally unique identifier for the tag. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, offset, parent, parent.created_by, parent.name, parent.resource_subtype, path, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, uri, workspace, workspace.name] |

### Return type

[**TasksGetMultipleWithTagResponse**](TasksGetMultipleWithTagResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the tasks associated with the specified tag. |  -  |

<a name="getSectionTasks"></a>
# **getSectionTasks**
> TasksGetSectionTasksResponse getSectionTasks(sectionGid).optPretty(optPretty).limit(limit).offset(offset).completedSince(completedSince).optFields(optFields).execute();

Get tasks from a section

*Board view only*: Returns the compact section records for all tasks within the given section.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String sectionGid = "321654"; // The globally unique identifier for the section.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    String completedSince = "2012-02-22T02:06:58.158Z"; // Only return tasks that are either incomplete or that have been completed since this time. Accepts a date-time string or the keyword *now*. 
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksGetSectionTasksResponse result = client
              .tasks
              .getSectionTasks(sectionGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .completedSince(completedSince)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getSectionTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksGetSectionTasksResponse> response = client
              .tasks
              .getSectionTasks(sectionGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .completedSince(completedSince)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getSectionTasks");
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
| **sectionGid** | **String**| The globally unique identifier for the section. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **completedSince** | **String**| Only return tasks that are either incomplete or that have been completed since this time. Accepts a date-time string or the keyword *now*.  | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, offset, parent, parent.created_by, parent.name, parent.resource_subtype, path, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, uri, workspace, workspace.name] |

### Return type

[**TasksGetSectionTasksResponse**](TasksGetSectionTasksResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the section&#39;s tasks. |  -  |

<a name="getSubtaskList"></a>
# **getSubtaskList**
> TasksGetSubtaskListResponse getSubtaskList(taskGid).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get subtasks from a task

Returns a compact representation of all of the subtasks of a task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
      TasksGetSubtaskListResponse result = client
              .tasks
              .getSubtaskList(taskGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getSubtaskList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksGetSubtaskListResponse> response = client
              .tasks
              .getSubtaskList(taskGid)
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
      System.err.println("Exception when calling TasksApi#getSubtaskList");
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
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, offset, parent, parent.created_by, parent.name, parent.resource_subtype, path, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, uri, workspace, workspace.name] |

### Return type

[**TasksGetSubtaskListResponse**](TasksGetSubtaskListResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the specified task&#39;s subtasks. |  -  |

<a name="getTaskRecord"></a>
# **getTaskRecord**
> TasksGetTaskRecordResponse getTaskRecord(taskGid).optPretty(optPretty).optFields(optFields).execute();

Get a task

Returns the complete task record for a single task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksGetTaskRecordResponse result = client
              .tasks
              .getTaskRecord(taskGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getTaskRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksGetTaskRecordResponse> response = client
              .tasks
              .getTaskRecord(taskGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getTaskRecord");
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
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, parent, parent.created_by, parent.name, parent.resource_subtype, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, workspace, workspace.name] |

### Return type

[**TasksGetTaskRecordResponse**](TasksGetTaskRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the specified task. |  -  |

<a name="getTasksByProject"></a>
# **getTasksByProject**
> TasksGetTasksByProjectResponse getTasksByProject(projectGid).completedSince(completedSince).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get tasks from a project

Returns the compact task records for all tasks within the given project, ordered by their priority within the project. Tasks can exist in more than one project at a time.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String projectGid = "1331"; // Globally unique identifier for the project.
    String completedSince = "2012-02-22T02:06:58.158Z"; // Only return tasks that are either incomplete or that have been completed since this time. Accepts a date-time string or the keyword *now*. 
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksGetTasksByProjectResponse result = client
              .tasks
              .getTasksByProject(projectGid)
              .completedSince(completedSince)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getTasksByProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksGetTasksByProjectResponse> response = client
              .tasks
              .getTasksByProject(projectGid)
              .completedSince(completedSince)
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
      System.err.println("Exception when calling TasksApi#getTasksByProject");
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
| **projectGid** | **String**| Globally unique identifier for the project. | |
| **completedSince** | **String**| Only return tasks that are either incomplete or that have been completed since this time. Accepts a date-time string or the keyword *now*.  | [optional] |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, offset, parent, parent.created_by, parent.name, parent.resource_subtype, path, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, uri, workspace, workspace.name] |

### Return type

[**TasksGetTasksByProjectResponse**](TasksGetTasksByProjectResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the requested project&#39;s tasks. |  -  |

<a name="getUserTaskListTasks"></a>
# **getUserTaskListTasks**
> TasksGetUserTaskListTasksResponse getUserTaskListTasks(userTaskListGid).completedSince(completedSince).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get tasks from a user task list

Returns the compact list of tasks in a user’s My Tasks list. *Note: Access control is enforced for this endpoint as with all Asana API endpoints, meaning a user’s private tasks will be filtered out if the API-authenticated user does not have access to them.* *Note: Both complete and incomplete tasks are returned by default unless they are filtered out (for example, setting &#x60;completed_since&#x3D;now&#x60; will return only incomplete tasks, which is the default view for “My Tasks” in Asana.)*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    String userTaskListGid = "12345"; // Globally unique identifier for the user task list.
    String completedSince = "2012-02-22T02:06:58.158Z"; // Only return tasks that are either incomplete or that have been completed since this time. Accepts a date-time string or the keyword *now*. 
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksGetUserTaskListTasksResponse result = client
              .tasks
              .getUserTaskListTasks(userTaskListGid)
              .completedSince(completedSince)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getUserTaskListTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksGetUserTaskListTasksResponse> response = client
              .tasks
              .getUserTaskListTasks(userTaskListGid)
              .completedSince(completedSince)
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
      System.err.println("Exception when calling TasksApi#getUserTaskListTasks");
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
| **userTaskListGid** | **String**| Globally unique identifier for the user task list. | |
| **completedSince** | **String**| Only return tasks that are either incomplete or that have been completed since this time. Accepts a date-time string or the keyword *now*.  | [optional] |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, offset, parent, parent.created_by, parent.name, parent.resource_subtype, path, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, uri, workspace, workspace.name] |

### Return type

[**TasksGetUserTaskListTasksResponse**](TasksGetUserTaskListTasksResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the user task list&#39;s tasks. |  -  |

<a name="removeFollowersFromTask"></a>
# **removeFollowersFromTask**
> TasksRemoveFollowersFromTaskResponse removeFollowersFromTask(taskGid, tasksRemoveFollowersFromTaskRequest).optPretty(optPretty).optFields(optFields).execute();

Remove followers from a task

Removes each of the specified followers from the task if they are following. Returns the complete, updated record for the affected task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    TaskRemoveFollowersRequest data = new TaskRemoveFollowersRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksRemoveFollowersFromTaskResponse result = client
              .tasks
              .removeFollowersFromTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#removeFollowersFromTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksRemoveFollowersFromTaskResponse> response = client
              .tasks
              .removeFollowersFromTask(taskGid)
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
      System.err.println("Exception when calling TasksApi#removeFollowersFromTask");
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
| **tasksRemoveFollowersFromTaskRequest** | [**TasksRemoveFollowersFromTaskRequest**](TasksRemoveFollowersFromTaskRequest.md)| The followers to remove from the task. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, parent, parent.created_by, parent.name, parent.resource_subtype, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, workspace, workspace.name] |

### Return type

[**TasksRemoveFollowersFromTaskResponse**](TasksRemoveFollowersFromTaskResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully removed the specified followers from the task. |  -  |

<a name="removeProjectFromTask"></a>
# **removeProjectFromTask**
> TasksRemoveProjectFromTaskResponse removeProjectFromTask(taskGid, tasksRemoveProjectFromTaskRequest).optPretty(optPretty).execute();

Remove a project from a task

Removes the task from the specified project. The task will still exist in the system, but it will not be in the project anymore.  Returns an empty data block.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    TaskRemoveProjectRequest data = new TaskRemoveProjectRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      TasksRemoveProjectFromTaskResponse result = client
              .tasks
              .removeProjectFromTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#removeProjectFromTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksRemoveProjectFromTaskResponse> response = client
              .tasks
              .removeProjectFromTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#removeProjectFromTask");
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
| **tasksRemoveProjectFromTaskRequest** | [**TasksRemoveProjectFromTaskRequest**](TasksRemoveProjectFromTaskRequest.md)| The project to remove the task from. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**TasksRemoveProjectFromTaskResponse**](TasksRemoveProjectFromTaskResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully removed the specified project from the task. |  -  |

<a name="removeTagFromTask"></a>
# **removeTagFromTask**
> TasksRemoveTagFromTaskResponse removeTagFromTask(taskGid, tasksRemoveTagFromTaskRequest).optPretty(optPretty).execute();

Remove a tag from a task

Removes a tag from a task. Returns an empty data block.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    TaskRemoveTagRequest data = new TaskRemoveTagRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      TasksRemoveTagFromTaskResponse result = client
              .tasks
              .removeTagFromTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#removeTagFromTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksRemoveTagFromTaskResponse> response = client
              .tasks
              .removeTagFromTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#removeTagFromTask");
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
| **tasksRemoveTagFromTaskRequest** | [**TasksRemoveTagFromTaskRequest**](TasksRemoveTagFromTaskRequest.md)| The tag to remove from the task. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**TasksRemoveTagFromTaskResponse**](TasksRemoveTagFromTaskResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully removed the specified tag from the task. |  -  |

<a name="searchInWorkspace"></a>
# **searchInWorkspace**
> TasksSearchInWorkspaceResponse searchInWorkspace(workspaceGid).optPretty(optPretty).text(text).resourceSubtype(resourceSubtype).assigneeAny(assigneeAny).assigneeNot(assigneeNot).portfoliosAny(portfoliosAny).projectsAny(projectsAny).projectsNot(projectsNot).projectsAll(projectsAll).sectionsAny(sectionsAny).sectionsNot(sectionsNot).sectionsAll(sectionsAll).tagsAny(tagsAny).tagsNot(tagsNot).tagsAll(tagsAll).teamsAny(teamsAny).followersNot(followersNot).createdByAny(createdByAny).createdByNot(createdByNot).assignedByAny(assignedByAny).assignedByNot(assignedByNot).likedByNot(likedByNot).commentedOnByNot(commentedOnByNot).dueOnBefore(dueOnBefore).dueOnAfter(dueOnAfter).dueOn(dueOn).dueAtBefore(dueAtBefore).dueAtAfter(dueAtAfter).startOnBefore(startOnBefore).startOnAfter(startOnAfter).startOn(startOn).createdOnBefore(createdOnBefore).createdOnAfter(createdOnAfter).createdOn(createdOn).createdAtBefore(createdAtBefore).createdAtAfter(createdAtAfter).completedOnBefore(completedOnBefore).completedOnAfter(completedOnAfter).completedOn(completedOn).completedAtBefore(completedAtBefore).completedAtAfter(completedAtAfter).modifiedOnBefore(modifiedOnBefore).modifiedOnAfter(modifiedOnAfter).modifiedOn(modifiedOn).modifiedAtBefore(modifiedAtBefore).modifiedAtAfter(modifiedAtAfter).isBlocking(isBlocking).isBlocked(isBlocked).hasAttachment(hasAttachment).completed(completed).isSubtask(isSubtask).sortBy(sortBy).sortAscending(sortAscending).optFields(optFields).execute();

Search tasks in a workspace

To mirror the functionality of the Asana web app&#39;s advanced search feature, the Asana API has a task search endpoint that allows you to build complex filters to find and retrieve the exact data you need. #### Premium access Like the Asana web product&#39;s advance search feature, this search endpoint will only be available to premium Asana users. A user is premium if any of the following is true:  - The workspace in which the search is being performed is a premium workspace - The user is a member of a premium team inside the workspace  Even if a user is only a member of a premium team inside a non-premium workspace, search will allow them to find data anywhere in the workspace, not just inside the premium team. Making a search request using credentials of a non-premium user will result in a &#x60;402 Payment Required&#x60; error. #### Pagination Search results are not stable; repeating the same query multiple times may return the data in a different order, even if the data do not change. Because of this, the traditional [pagination](https://developers.asana.com/docs/#pagination) available elsewhere in the Asana API is not available here. However, you can paginate manually by sorting the search results by their creation time and then modifying each subsequent query to exclude data you have already seen. Page sizes are limited to a maximum of 100 items, and can be specified by the &#x60;limit&#x60; query parameter. #### Eventual consistency Changes in Asana (regardless of whether they’re made though the web product or the API) are forwarded to our search infrastructure to be indexed. This process can take between 10 and 60 seconds to complete under normal operation, and longer during some production incidents. Making a change to a task that would alter its presence in a particular search query will not be reflected immediately. This is also true of the advanced search feature in the web product. #### Rate limits You may receive a &#x60;429 Too Many Requests&#x60; response if you hit any of our [rate limits](https://developers.asana.com/docs/#rate-limits). #### Custom field parameters | Parameter name | Custom field type | Accepted type | |---|---|---| | custom_fields.{gid}.is_set | All | Boolean | | custom_fields.{gid}.value | Text | String | | custom_fields.{gid}.value | Number | Number | | custom_fields.{gid}.value | Enum | Enum option ID | | custom_fields.{gid}.starts_with | Text only | String | | custom_fields.{gid}.ends_with | Text only | String | | custom_fields.{gid}.contains | Text only | String | | custom_fields.{gid}.less_than | Number only | Number | | custom_fields.{gid}.greater_than | Number only | Number |   For example, if the gid of the custom field is 12345, these query parameter to find tasks where it is set would be &#x60;custom_fields.12345.is_set&#x3D;true&#x60;. To match an exact value for an enum custom field, use the gid of the desired enum option and not the name of the enum option: &#x60;custom_fields.12345.value&#x3D;67890&#x60;.  **Not Supported**: searching for multiple exact matches of a custom field, searching for multi-enum custom field  *Note: If you specify &#x60;projects.any&#x60; and &#x60;sections.any&#x60;, you will receive tasks for the project **and** tasks for the section. If you&#39;re looking for only tasks in a section, omit the &#x60;projects.any&#x60; from the request.*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    String text = "Bug"; // Performs full-text search on both task name and description
    String resourceSubtype = "default_task"; // Filters results by the task's resource_subtype
    String assigneeAny = "12345,23456,34567"; // Comma-separated list of user identifiers
    String assigneeNot = "12345,23456,34567"; // Comma-separated list of user identifiers
    String portfoliosAny = "12345,23456,34567"; // Comma-separated list of portfolio IDs
    String projectsAny = "12345,23456,34567"; // Comma-separated list of project IDs
    String projectsNot = "12345,23456,34567"; // Comma-separated list of project IDs
    String projectsAll = "12345,23456,34567"; // Comma-separated list of project IDs
    String sectionsAny = "12345,23456,34567"; // Comma-separated list of section or column IDs
    String sectionsNot = "12345,23456,34567"; // Comma-separated list of section or column IDs
    String sectionsAll = "12345,23456,34567"; // Comma-separated list of section or column IDs
    String tagsAny = "12345,23456,34567"; // Comma-separated list of tag IDs
    String tagsNot = "12345,23456,34567"; // Comma-separated list of tag IDs
    String tagsAll = "12345,23456,34567"; // Comma-separated list of tag IDs
    String teamsAny = "12345,23456,34567"; // Comma-separated list of team IDs
    String followersNot = "12345,23456,34567"; // Comma-separated list of user identifiers
    String createdByAny = "12345,23456,34567"; // Comma-separated list of user identifiers
    String createdByNot = "12345,23456,34567"; // Comma-separated list of user identifiers
    String assignedByAny = "12345,23456,34567"; // Comma-separated list of user identifiers
    String assignedByNot = "12345,23456,34567"; // Comma-separated list of user identifiers
    String likedByNot = "12345,23456,34567"; // Comma-separated list of user identifiers
    String commentedOnByNot = "12345,23456,34567"; // Comma-separated list of user identifiers
    LocalDate dueOnBefore = LocalDate.parse("2019-09-15"); // ISO 8601 date string
    LocalDate dueOnAfter = LocalDate.parse("2019-09-15"); // ISO 8601 date string
    LocalDate dueOn = LocalDate.parse("2019-09-15"); // ISO 8601 date string or `null`
    OffsetDateTime dueAtBefore = OffsetDateTime.parse("2019-04-15T01:01:46.055Z"); // ISO 8601 datetime string
    OffsetDateTime dueAtAfter = OffsetDateTime.parse("2019-04-15T01:01:46.055Z"); // ISO 8601 datetime string
    LocalDate startOnBefore = LocalDate.parse("2019-09-15"); // ISO 8601 date string
    LocalDate startOnAfter = LocalDate.parse("2019-09-15"); // ISO 8601 date string
    LocalDate startOn = LocalDate.parse("2019-09-15"); // ISO 8601 date string or `null`
    LocalDate createdOnBefore = LocalDate.parse("2019-09-15"); // ISO 8601 date string
    LocalDate createdOnAfter = LocalDate.parse("2019-09-15"); // ISO 8601 date string
    LocalDate createdOn = LocalDate.parse("2019-09-15"); // ISO 8601 date string or `null`
    OffsetDateTime createdAtBefore = OffsetDateTime.parse("2019-04-15T01:01:46.055Z"); // ISO 8601 datetime string
    OffsetDateTime createdAtAfter = OffsetDateTime.parse("2019-04-15T01:01:46.055Z"); // ISO 8601 datetime string
    LocalDate completedOnBefore = LocalDate.parse("2019-09-15"); // ISO 8601 date string
    LocalDate completedOnAfter = LocalDate.parse("2019-09-15"); // ISO 8601 date string
    LocalDate completedOn = LocalDate.parse("2019-09-15"); // ISO 8601 date string or `null`
    OffsetDateTime completedAtBefore = OffsetDateTime.parse("2019-04-15T01:01:46.055Z"); // ISO 8601 datetime string
    OffsetDateTime completedAtAfter = OffsetDateTime.parse("2019-04-15T01:01:46.055Z"); // ISO 8601 datetime string
    LocalDate modifiedOnBefore = LocalDate.parse("2019-09-15"); // ISO 8601 date string
    LocalDate modifiedOnAfter = LocalDate.parse("2019-09-15"); // ISO 8601 date string
    LocalDate modifiedOn = LocalDate.parse("2019-09-15"); // ISO 8601 date string or `null`
    OffsetDateTime modifiedAtBefore = OffsetDateTime.parse("2019-04-15T01:01:46.055Z"); // ISO 8601 datetime string
    OffsetDateTime modifiedAtAfter = OffsetDateTime.parse("2019-04-15T01:01:46.055Z"); // ISO 8601 datetime string
    Boolean isBlocking = false; // Filter to incomplete tasks with dependents
    Boolean isBlocked = false; // Filter to tasks with incomplete dependencies
    Boolean hasAttachment = false; // Filter to tasks with attachments
    Boolean completed = false; // Filter to completed tasks
    Boolean isSubtask = false; // Filter to subtasks
    String sortBy = "due_date"; // One of `due_date`, `created_at`, `completed_at`, `likes`, or `modified_at`, defaults to `modified_at`
    Boolean sortAscending = false; // Default `false`
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksSearchInWorkspaceResponse result = client
              .tasks
              .searchInWorkspace(workspaceGid)
              .optPretty(optPretty)
              .text(text)
              .resourceSubtype(resourceSubtype)
              .assigneeAny(assigneeAny)
              .assigneeNot(assigneeNot)
              .portfoliosAny(portfoliosAny)
              .projectsAny(projectsAny)
              .projectsNot(projectsNot)
              .projectsAll(projectsAll)
              .sectionsAny(sectionsAny)
              .sectionsNot(sectionsNot)
              .sectionsAll(sectionsAll)
              .tagsAny(tagsAny)
              .tagsNot(tagsNot)
              .tagsAll(tagsAll)
              .teamsAny(teamsAny)
              .followersNot(followersNot)
              .createdByAny(createdByAny)
              .createdByNot(createdByNot)
              .assignedByAny(assignedByAny)
              .assignedByNot(assignedByNot)
              .likedByNot(likedByNot)
              .commentedOnByNot(commentedOnByNot)
              .dueOnBefore(dueOnBefore)
              .dueOnAfter(dueOnAfter)
              .dueOn(dueOn)
              .dueAtBefore(dueAtBefore)
              .dueAtAfter(dueAtAfter)
              .startOnBefore(startOnBefore)
              .startOnAfter(startOnAfter)
              .startOn(startOn)
              .createdOnBefore(createdOnBefore)
              .createdOnAfter(createdOnAfter)
              .createdOn(createdOn)
              .createdAtBefore(createdAtBefore)
              .createdAtAfter(createdAtAfter)
              .completedOnBefore(completedOnBefore)
              .completedOnAfter(completedOnAfter)
              .completedOn(completedOn)
              .completedAtBefore(completedAtBefore)
              .completedAtAfter(completedAtAfter)
              .modifiedOnBefore(modifiedOnBefore)
              .modifiedOnAfter(modifiedOnAfter)
              .modifiedOn(modifiedOn)
              .modifiedAtBefore(modifiedAtBefore)
              .modifiedAtAfter(modifiedAtAfter)
              .isBlocking(isBlocking)
              .isBlocked(isBlocked)
              .hasAttachment(hasAttachment)
              .completed(completed)
              .isSubtask(isSubtask)
              .sortBy(sortBy)
              .sortAscending(sortAscending)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#searchInWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksSearchInWorkspaceResponse> response = client
              .tasks
              .searchInWorkspace(workspaceGid)
              .optPretty(optPretty)
              .text(text)
              .resourceSubtype(resourceSubtype)
              .assigneeAny(assigneeAny)
              .assigneeNot(assigneeNot)
              .portfoliosAny(portfoliosAny)
              .projectsAny(projectsAny)
              .projectsNot(projectsNot)
              .projectsAll(projectsAll)
              .sectionsAny(sectionsAny)
              .sectionsNot(sectionsNot)
              .sectionsAll(sectionsAll)
              .tagsAny(tagsAny)
              .tagsNot(tagsNot)
              .tagsAll(tagsAll)
              .teamsAny(teamsAny)
              .followersNot(followersNot)
              .createdByAny(createdByAny)
              .createdByNot(createdByNot)
              .assignedByAny(assignedByAny)
              .assignedByNot(assignedByNot)
              .likedByNot(likedByNot)
              .commentedOnByNot(commentedOnByNot)
              .dueOnBefore(dueOnBefore)
              .dueOnAfter(dueOnAfter)
              .dueOn(dueOn)
              .dueAtBefore(dueAtBefore)
              .dueAtAfter(dueAtAfter)
              .startOnBefore(startOnBefore)
              .startOnAfter(startOnAfter)
              .startOn(startOn)
              .createdOnBefore(createdOnBefore)
              .createdOnAfter(createdOnAfter)
              .createdOn(createdOn)
              .createdAtBefore(createdAtBefore)
              .createdAtAfter(createdAtAfter)
              .completedOnBefore(completedOnBefore)
              .completedOnAfter(completedOnAfter)
              .completedOn(completedOn)
              .completedAtBefore(completedAtBefore)
              .completedAtAfter(completedAtAfter)
              .modifiedOnBefore(modifiedOnBefore)
              .modifiedOnAfter(modifiedOnAfter)
              .modifiedOn(modifiedOn)
              .modifiedAtBefore(modifiedAtBefore)
              .modifiedAtAfter(modifiedAtAfter)
              .isBlocking(isBlocking)
              .isBlocked(isBlocked)
              .hasAttachment(hasAttachment)
              .completed(completed)
              .isSubtask(isSubtask)
              .sortBy(sortBy)
              .sortAscending(sortAscending)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#searchInWorkspace");
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
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **text** | **String**| Performs full-text search on both task name and description | [optional] |
| **resourceSubtype** | **String**| Filters results by the task&#39;s resource_subtype | [optional] [default to milestone] [enum: default_task, milestone] |
| **assigneeAny** | **String**| Comma-separated list of user identifiers | [optional] |
| **assigneeNot** | **String**| Comma-separated list of user identifiers | [optional] |
| **portfoliosAny** | **String**| Comma-separated list of portfolio IDs | [optional] |
| **projectsAny** | **String**| Comma-separated list of project IDs | [optional] |
| **projectsNot** | **String**| Comma-separated list of project IDs | [optional] |
| **projectsAll** | **String**| Comma-separated list of project IDs | [optional] |
| **sectionsAny** | **String**| Comma-separated list of section or column IDs | [optional] |
| **sectionsNot** | **String**| Comma-separated list of section or column IDs | [optional] |
| **sectionsAll** | **String**| Comma-separated list of section or column IDs | [optional] |
| **tagsAny** | **String**| Comma-separated list of tag IDs | [optional] |
| **tagsNot** | **String**| Comma-separated list of tag IDs | [optional] |
| **tagsAll** | **String**| Comma-separated list of tag IDs | [optional] |
| **teamsAny** | **String**| Comma-separated list of team IDs | [optional] |
| **followersNot** | **String**| Comma-separated list of user identifiers | [optional] |
| **createdByAny** | **String**| Comma-separated list of user identifiers | [optional] |
| **createdByNot** | **String**| Comma-separated list of user identifiers | [optional] |
| **assignedByAny** | **String**| Comma-separated list of user identifiers | [optional] |
| **assignedByNot** | **String**| Comma-separated list of user identifiers | [optional] |
| **likedByNot** | **String**| Comma-separated list of user identifiers | [optional] |
| **commentedOnByNot** | **String**| Comma-separated list of user identifiers | [optional] |
| **dueOnBefore** | **LocalDate**| ISO 8601 date string | [optional] |
| **dueOnAfter** | **LocalDate**| ISO 8601 date string | [optional] |
| **dueOn** | **LocalDate**| ISO 8601 date string or &#x60;null&#x60; | [optional] |
| **dueAtBefore** | **OffsetDateTime**| ISO 8601 datetime string | [optional] |
| **dueAtAfter** | **OffsetDateTime**| ISO 8601 datetime string | [optional] |
| **startOnBefore** | **LocalDate**| ISO 8601 date string | [optional] |
| **startOnAfter** | **LocalDate**| ISO 8601 date string | [optional] |
| **startOn** | **LocalDate**| ISO 8601 date string or &#x60;null&#x60; | [optional] |
| **createdOnBefore** | **LocalDate**| ISO 8601 date string | [optional] |
| **createdOnAfter** | **LocalDate**| ISO 8601 date string | [optional] |
| **createdOn** | **LocalDate**| ISO 8601 date string or &#x60;null&#x60; | [optional] |
| **createdAtBefore** | **OffsetDateTime**| ISO 8601 datetime string | [optional] |
| **createdAtAfter** | **OffsetDateTime**| ISO 8601 datetime string | [optional] |
| **completedOnBefore** | **LocalDate**| ISO 8601 date string | [optional] |
| **completedOnAfter** | **LocalDate**| ISO 8601 date string | [optional] |
| **completedOn** | **LocalDate**| ISO 8601 date string or &#x60;null&#x60; | [optional] |
| **completedAtBefore** | **OffsetDateTime**| ISO 8601 datetime string | [optional] |
| **completedAtAfter** | **OffsetDateTime**| ISO 8601 datetime string | [optional] |
| **modifiedOnBefore** | **LocalDate**| ISO 8601 date string | [optional] |
| **modifiedOnAfter** | **LocalDate**| ISO 8601 date string | [optional] |
| **modifiedOn** | **LocalDate**| ISO 8601 date string or &#x60;null&#x60; | [optional] |
| **modifiedAtBefore** | **OffsetDateTime**| ISO 8601 datetime string | [optional] |
| **modifiedAtAfter** | **OffsetDateTime**| ISO 8601 datetime string | [optional] |
| **isBlocking** | **Boolean**| Filter to incomplete tasks with dependents | [optional] |
| **isBlocked** | **Boolean**| Filter to tasks with incomplete dependencies | [optional] |
| **hasAttachment** | **Boolean**| Filter to tasks with attachments | [optional] |
| **completed** | **Boolean**| Filter to completed tasks | [optional] |
| **isSubtask** | **Boolean**| Filter to subtasks | [optional] |
| **sortBy** | **String**| One of &#x60;due_date&#x60;, &#x60;created_at&#x60;, &#x60;completed_at&#x60;, &#x60;likes&#x60;, or &#x60;modified_at&#x60;, defaults to &#x60;modified_at&#x60; | [optional] [default to modified_at] [enum: due_date, created_at, completed_at, likes, modified_at] |
| **sortAscending** | **Boolean**| Default &#x60;false&#x60; | [optional] [default to false] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, parent, parent.created_by, parent.name, parent.resource_subtype, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, workspace, workspace.name] |

### Return type

[**TasksSearchInWorkspaceResponse**](TasksSearchInWorkspaceResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the section&#39;s tasks. |  -  |

<a name="setDependenciesForTask"></a>
# **setDependenciesForTask**
> TasksSetDependenciesForTaskResponse setDependenciesForTask(taskGid, tasksSetDependenciesForTaskRequest).optPretty(optPretty).execute();

Set dependencies for a task

Marks a set of tasks as dependencies of this task, if they are not already dependencies. *A task can have at most 30 dependents and dependencies combined*.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    ModifyDependenciesRequest data = new ModifyDependenciesRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      TasksSetDependenciesForTaskResponse result = client
              .tasks
              .setDependenciesForTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#setDependenciesForTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksSetDependenciesForTaskResponse> response = client
              .tasks
              .setDependenciesForTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#setDependenciesForTask");
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
| **tasksSetDependenciesForTaskRequest** | [**TasksSetDependenciesForTaskRequest**](TasksSetDependenciesForTaskRequest.md)| The list of tasks to set as dependencies. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**TasksSetDependenciesForTaskResponse**](TasksSetDependenciesForTaskResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully set the specified dependencies on the task. |  -  |

<a name="setParentTask"></a>
# **setParentTask**
> TasksSetParentTaskResponse setParentTask(taskGid, tasksSetParentTaskRequest).optPretty(optPretty).optFields(optFields).execute();

Set the parent of a task

parent, or no parent task at all. Returns an empty data block. When using &#x60;insert_before&#x60; and &#x60;insert_after&#x60;, at most one of those two options can be specified, and they must already be subtasks of the parent.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    TaskSetParentRequest data = new TaskSetParentRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksSetParentTaskResponse result = client
              .tasks
              .setParentTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#setParentTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksSetParentTaskResponse> response = client
              .tasks
              .setParentTask(taskGid)
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
      System.err.println("Exception when calling TasksApi#setParentTask");
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
| **tasksSetParentTaskRequest** | [**TasksSetParentTaskRequest**](TasksSetParentTaskRequest.md)| The new parent of the subtask. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, parent, parent.created_by, parent.name, parent.resource_subtype, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, workspace, workspace.name] |

### Return type

[**TasksSetParentTaskResponse**](TasksSetParentTaskResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully changed the parent of the specified subtask. |  -  |

<a name="setTaskDependents"></a>
# **setTaskDependents**
> TasksSetTaskDependentsResponse setTaskDependents(taskGid, tasksSetTaskDependentsRequest).optPretty(optPretty).execute();

Set dependents for a task

Marks a set of tasks as dependents of this task, if they are not already dependents. *A task can have at most 30 dependents and dependencies combined*.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    ModifyDependentsRequest data = new ModifyDependentsRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      TasksSetTaskDependentsResponse result = client
              .tasks
              .setTaskDependents(taskGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#setTaskDependents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksSetTaskDependentsResponse> response = client
              .tasks
              .setTaskDependents(taskGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#setTaskDependents");
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
| **tasksSetTaskDependentsRequest** | [**TasksSetTaskDependentsRequest**](TasksSetTaskDependentsRequest.md)| The list of tasks to add as dependents. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**TasksSetTaskDependentsResponse**](TasksSetTaskDependentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully set the specified dependents on the given task. |  -  |

<a name="unlinkDependenciesFromTask"></a>
# **unlinkDependenciesFromTask**
> TasksUnlinkDependenciesFromTaskResponse unlinkDependenciesFromTask(taskGid, tasksUnlinkDependenciesFromTaskRequest).optPretty(optPretty).execute();

Unlink dependencies from a task

Unlinks a set of dependencies from this task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    ModifyDependenciesRequest data = new ModifyDependenciesRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      TasksUnlinkDependenciesFromTaskResponse result = client
              .tasks
              .unlinkDependenciesFromTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#unlinkDependenciesFromTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksUnlinkDependenciesFromTaskResponse> response = client
              .tasks
              .unlinkDependenciesFromTask(taskGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#unlinkDependenciesFromTask");
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
| **tasksUnlinkDependenciesFromTaskRequest** | [**TasksUnlinkDependenciesFromTaskRequest**](TasksUnlinkDependenciesFromTaskRequest.md)| The list of tasks to unlink as dependencies. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**TasksUnlinkDependenciesFromTaskResponse**](TasksUnlinkDependenciesFromTaskResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully unlinked the dependencies from the specified task. |  -  |

<a name="unlinkDependents"></a>
# **unlinkDependents**
> TasksUnlinkDependentsResponse unlinkDependents(taskGid, tasksUnlinkDependentsRequest).optPretty(optPretty).execute();

Unlink dependents from a task

Unlinks a set of dependents from this task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    ModifyDependentsRequest data = new ModifyDependentsRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      TasksUnlinkDependentsResponse result = client
              .tasks
              .unlinkDependents(taskGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#unlinkDependents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksUnlinkDependentsResponse> response = client
              .tasks
              .unlinkDependents(taskGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#unlinkDependents");
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
| **tasksUnlinkDependentsRequest** | [**TasksUnlinkDependentsRequest**](TasksUnlinkDependentsRequest.md)| The list of tasks to remove as dependents. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**TasksUnlinkDependentsResponse**](TasksUnlinkDependentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully unlinked the specified tasks as dependents. |  -  |

<a name="updateTaskRecord"></a>
# **updateTaskRecord**
> TasksUpdateTaskRecordResponse updateTaskRecord(taskGid, tasksUpdateTaskRecordRequest).optPretty(optPretty).optFields(optFields).execute();

Update a task

A specific, existing task can be updated by making a PUT request on the URL for that task. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the task.  Returns the complete updated task record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TasksApi;
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
    TaskRequest data = new TaskRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      TasksUpdateTaskRecordResponse result = client
              .tasks
              .updateTaskRecord(taskGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#updateTaskRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TasksUpdateTaskRecordResponse> response = client
              .tasks
              .updateTaskRecord(taskGid)
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
      System.err.println("Exception when calling TasksApi#updateTaskRecord");
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
| **tasksUpdateTaskRecordRequest** | [**TasksUpdateTaskRecordRequest**](TasksUpdateTaskRecordRequest.md)| The task to update. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: actual_time_minutes, approval_status, assignee, assignee.name, assignee_section, assignee_section.name, assignee_status, completed, completed_at, completed_by, completed_by.name, created_at, created_by, custom_fields, custom_fields.asana_created_field, custom_fields.created_by, custom_fields.created_by.name, custom_fields.currency_code, custom_fields.custom_label, custom_fields.custom_label_position, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.description, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.format, custom_fields.has_notifications_enabled, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.is_global_to_workspace, custom_fields.is_value_read_only, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.people_value, custom_fields.people_value.name, custom_fields.precision, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, dependencies, dependents, due_at, due_on, external, external.data, followers, followers.name, hearted, hearts, hearts.user, hearts.user.name, html_notes, is_rendered_as_separator, liked, likes, likes.user, likes.user.name, memberships, memberships.project, memberships.project.name, memberships.section, memberships.section.name, modified_at, name, notes, num_hearts, num_likes, num_subtasks, parent, parent.created_by, parent.name, parent.resource_subtype, permalink_url, projects, projects.name, resource_subtype, start_at, start_on, tags, tags.name, workspace, workspace.name] |

### Return type

[**TasksUpdateTaskRecordResponse**](TasksUpdateTaskRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the specified task. |  -  |

