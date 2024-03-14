# ProjectsApi

All URIs are relative to *https://app.asana.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCustomFieldSetting**](ProjectsApi.md#addCustomFieldSetting) | **POST** /projects/{project_gid}/addCustomFieldSetting | Add a custom field to a project |
| [**addFollowersToProject**](ProjectsApi.md#addFollowersToProject) | **POST** /projects/{project_gid}/addFollowers | Add followers to a project |
| [**addMembersToProject**](ProjectsApi.md#addMembersToProject) | **POST** /projects/{project_gid}/addMembers | Add users to a project |
| [**createInWorkspace**](ProjectsApi.md#createInWorkspace) | **POST** /workspaces/{workspace_gid}/projects | Create a project in a workspace |
| [**createNewProjectRecord**](ProjectsApi.md#createNewProjectRecord) | **POST** /projects | Create a project |
| [**createProjectForTeam**](ProjectsApi.md#createProjectForTeam) | **POST** /teams/{team_gid}/projects | Create a project in a team |
| [**createProjectTemplateJob**](ProjectsApi.md#createProjectTemplateJob) | **POST** /projects/{project_gid}/saveAsTemplate | Create a project template from a project |
| [**deleteProjectById**](ProjectsApi.md#deleteProjectById) | **DELETE** /projects/{project_gid} | Delete a project |
| [**duplicateProjectJob**](ProjectsApi.md#duplicateProjectJob) | **POST** /projects/{project_gid}/duplicate | Duplicate a project |
| [**getAllInWorkspace**](ProjectsApi.md#getAllInWorkspace) | **GET** /workspaces/{workspace_gid}/projects | Get all projects in a workspace |
| [**getProjectRecord**](ProjectsApi.md#getProjectRecord) | **GET** /projects/{project_gid} | Get a project |
| [**getTaskCounts**](ProjectsApi.md#getTaskCounts) | **GET** /projects/{project_gid}/task_counts | Get task count of a project |
| [**getTeamProjects**](ProjectsApi.md#getTeamProjects) | **GET** /teams/{team_gid}/projects | Get a team&#39;s projects |
| [**listMultiple**](ProjectsApi.md#listMultiple) | **GET** /projects | Get multiple projects |
| [**removeCustomField**](ProjectsApi.md#removeCustomField) | **POST** /projects/{project_gid}/removeCustomFieldSetting | Remove a custom field from a project |
| [**removeMembersFromProject**](ProjectsApi.md#removeMembersFromProject) | **POST** /projects/{project_gid}/removeMembers | Remove users from a project |
| [**removeProjectFollowers**](ProjectsApi.md#removeProjectFollowers) | **POST** /projects/{project_gid}/removeFollowers | Remove followers from a project |
| [**taskProjectsList**](ProjectsApi.md#taskProjectsList) | **GET** /tasks/{task_gid}/projects | Get projects a task is in |
| [**updateProjectRecord**](ProjectsApi.md#updateProjectRecord) | **PUT** /projects/{project_gid} | Update a project |


<a name="addCustomFieldSetting"></a>
# **addCustomFieldSetting**
> ProjectsAddCustomFieldSettingResponse addCustomFieldSetting(projectGid, projectsAddCustomFieldSettingRequest).optPretty(optPretty).optFields(optFields).execute();

Add a custom field to a project

Custom fields are associated with projects by way of custom field settings.  This method creates a setting for the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    AddCustomFieldSettingRequest data = new AddCustomFieldSettingRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsAddCustomFieldSettingResponse result = client
              .projects
              .addCustomFieldSetting(projectGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#addCustomFieldSetting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsAddCustomFieldSettingResponse> response = client
              .projects
              .addCustomFieldSetting(projectGid)
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
      System.err.println("Exception when calling ProjectsApi#addCustomFieldSetting");
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
| **projectsAddCustomFieldSettingRequest** | [**ProjectsAddCustomFieldSettingRequest**](ProjectsAddCustomFieldSettingRequest.md)| Information about the custom field setting. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: custom_field, custom_field.asana_created_field, custom_field.created_by, custom_field.created_by.name, custom_field.currency_code, custom_field.custom_label, custom_field.custom_label_position, custom_field.date_value, custom_field.date_value.date, custom_field.date_value.date_time, custom_field.description, custom_field.display_value, custom_field.enabled, custom_field.enum_options, custom_field.enum_options.color, custom_field.enum_options.enabled, custom_field.enum_options.name, custom_field.enum_value, custom_field.enum_value.color, custom_field.enum_value.enabled, custom_field.enum_value.name, custom_field.format, custom_field.has_notifications_enabled, custom_field.id_prefix, custom_field.is_formula_field, custom_field.is_global_to_workspace, custom_field.is_value_read_only, custom_field.multi_enum_values, custom_field.multi_enum_values.color, custom_field.multi_enum_values.enabled, custom_field.multi_enum_values.name, custom_field.name, custom_field.number_value, custom_field.people_value, custom_field.people_value.name, custom_field.precision, custom_field.representation_type, custom_field.resource_subtype, custom_field.text_value, custom_field.type, is_important, parent, parent.name, project, project.name] |

### Return type

[**ProjectsAddCustomFieldSettingResponse**](ProjectsAddCustomFieldSettingResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully added the custom field to the project. |  -  |

<a name="addFollowersToProject"></a>
# **addFollowersToProject**
> ProjectsAddFollowersToProjectResponse addFollowersToProject(projectGid, projectsAddFollowersToProjectRequest).optPretty(optPretty).optFields(optFields).execute();

Add followers to a project

Adds the specified list of users as followers to the project. Followers are a subset of members who have opted in to receive \&quot;tasks added\&quot; notifications for a project. Therefore, if the users are not already members of the project, they will also become members as a result of this operation. Returns the updated project record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    AddFollowersRequest data = new AddFollowersRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsAddFollowersToProjectResponse result = client
              .projects
              .addFollowersToProject(projectGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#addFollowersToProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsAddFollowersToProjectResponse> response = client
              .projects
              .addFollowersToProject(projectGid)
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
      System.err.println("Exception when calling ProjectsApi#addFollowersToProject");
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
| **projectsAddFollowersToProjectRequest** | [**ProjectsAddFollowersToProjectRequest**](ProjectsAddFollowersToProjectRequest.md)| Information about the followers being added. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, owner, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, workspace, workspace.name] |

### Return type

[**ProjectsAddFollowersToProjectResponse**](ProjectsAddFollowersToProjectResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully added followers to the project. |  -  |

<a name="addMembersToProject"></a>
# **addMembersToProject**
> ProjectsAddMembersToProjectResponse addMembersToProject(projectGid, projectsAddMembersToProjectRequest).optPretty(optPretty).optFields(optFields).execute();

Add users to a project

Adds the specified list of users as members of the project. Note that a user being added as a member may also be added as a *follower* as a result of this operation. This is because the user&#39;s default notification settings (i.e., in the \&quot;Notifcations\&quot; tab of \&quot;My Profile Settings\&quot;) will override this endpoint&#39;s default behavior of setting \&quot;Tasks added\&quot; notifications to &#x60;false&#x60;. Returns the updated project record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    AddMembersRequest data = new AddMembersRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsAddMembersToProjectResponse result = client
              .projects
              .addMembersToProject(projectGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#addMembersToProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsAddMembersToProjectResponse> response = client
              .projects
              .addMembersToProject(projectGid)
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
      System.err.println("Exception when calling ProjectsApi#addMembersToProject");
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
| **projectsAddMembersToProjectRequest** | [**ProjectsAddMembersToProjectRequest**](ProjectsAddMembersToProjectRequest.md)| Information about the members being added. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, owner, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, workspace, workspace.name] |

### Return type

[**ProjectsAddMembersToProjectResponse**](ProjectsAddMembersToProjectResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully added members to the project. |  -  |

<a name="createInWorkspace"></a>
# **createInWorkspace**
> ProjectsCreateInWorkspaceResponse createInWorkspace(workspaceGid, projectsCreateInWorkspaceRequest).optPretty(optPretty).optFields(optFields).execute();

Create a project in a workspace

Creates a project in the workspace.  If the workspace for your project is an organization, you must also supply a team to share the project with.  Returns the full record of the newly created project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    ProjectRequest data = new ProjectRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsCreateInWorkspaceResponse result = client
              .projects
              .createInWorkspace(workspaceGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createInWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsCreateInWorkspaceResponse> response = client
              .projects
              .createInWorkspace(workspaceGid)
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
      System.err.println("Exception when calling ProjectsApi#createInWorkspace");
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
| **projectsCreateInWorkspaceRequest** | [**ProjectsCreateInWorkspaceRequest**](ProjectsCreateInWorkspaceRequest.md)| The new project to create. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, owner, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, workspace, workspace.name] |

### Return type

[**ProjectsCreateInWorkspaceResponse**](ProjectsCreateInWorkspaceResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a new project in the specified workspace. |  -  |

<a name="createNewProjectRecord"></a>
# **createNewProjectRecord**
> ProjectsCreateNewProjectRecordResponse createNewProjectRecord(projectsCreateNewProjectRecordRequest).optPretty(optPretty).optFields(optFields).execute();

Create a project

Create a new project in a workspace or team.  Every project is required to be created in a specific workspace or organization, and this cannot be changed once set. Note that you can use the &#x60;workspace&#x60; parameter regardless of whether or not it is an organization.  If the workspace for your project is an organization, you must also supply a &#x60;team&#x60; to share the project with.  Returns the full record of the newly created project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    ProjectRequest data = new ProjectRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsCreateNewProjectRecordResponse result = client
              .projects
              .createNewProjectRecord()
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createNewProjectRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsCreateNewProjectRecordResponse> response = client
              .projects
              .createNewProjectRecord()
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
      System.err.println("Exception when calling ProjectsApi#createNewProjectRecord");
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
| **projectsCreateNewProjectRecordRequest** | [**ProjectsCreateNewProjectRecordRequest**](ProjectsCreateNewProjectRecordRequest.md)| The project to create. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, owner, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, workspace, workspace.name] |

### Return type

[**ProjectsCreateNewProjectRecordResponse**](ProjectsCreateNewProjectRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully retrieved projects. |  -  |

<a name="createProjectForTeam"></a>
# **createProjectForTeam**
> ProjectsCreateProjectForTeamResponse createProjectForTeam(teamGid, projectsCreateProjectForTeamRequest).optPretty(optPretty).optFields(optFields).execute();

Create a project in a team

Creates a project shared with the given team.  Returns the full record of the newly created project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    ProjectRequest data = new ProjectRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsCreateProjectForTeamResponse result = client
              .projects
              .createProjectForTeam(teamGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProjectForTeam");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsCreateProjectForTeamResponse> response = client
              .projects
              .createProjectForTeam(teamGid)
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
      System.err.println("Exception when calling ProjectsApi#createProjectForTeam");
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
| **projectsCreateProjectForTeamRequest** | [**ProjectsCreateProjectForTeamRequest**](ProjectsCreateProjectForTeamRequest.md)| The new project to create. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, owner, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, workspace, workspace.name] |

### Return type

[**ProjectsCreateProjectForTeamResponse**](ProjectsCreateProjectForTeamResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created the specified project. |  -  |

<a name="createProjectTemplateJob"></a>
# **createProjectTemplateJob**
> ProjectsCreateProjectTemplateJobResponse createProjectTemplateJob(projectGid, projectsCreateProjectTemplateJobRequest).optPretty(optPretty).optFields(optFields).execute();

Create a project template from a project

Creates and returns a job that will asynchronously handle the project template creation. Note that while the resulting project template can be accessed with the API, it won&#39;t be visible in the Asana UI until Project Templates 2.0 is launched in the app. See more in [this forum post](https://forum.asana.com/t/a-new-api-for-project-templates/156432).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    ProjectSaveAsTemplateRequest data = new ProjectSaveAsTemplateRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsCreateProjectTemplateJobResponse result = client
              .projects
              .createProjectTemplateJob(projectGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProjectTemplateJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsCreateProjectTemplateJobResponse> response = client
              .projects
              .createProjectTemplateJob(projectGid)
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
      System.err.println("Exception when calling ProjectsApi#createProjectTemplateJob");
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
| **projectsCreateProjectTemplateJobRequest** | [**ProjectsCreateProjectTemplateJobRequest**](ProjectsCreateProjectTemplateJobRequest.md)| Describes the inputs used for creating a project template, such as the resulting project template&#39;s name, which team it should be created in. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: new_project, new_project.name, new_project_template, new_project_template.name, new_task, new_task.created_by, new_task.name, new_task.resource_subtype, new_task_template, new_task_template.name, resource_subtype, status] |

### Return type

[**ProjectsCreateProjectTemplateJobResponse**](ProjectsCreateProjectTemplateJobResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created the job to handle project template creation. |  -  |

<a name="deleteProjectById"></a>
# **deleteProjectById**
> ProjectsDeleteProjectByIdResponse deleteProjectById(projectGid).optPretty(optPretty).execute();

Delete a project

A specific, existing project can be deleted by making a DELETE request on the URL for that project.  Returns an empty data record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      ProjectsDeleteProjectByIdResponse result = client
              .projects
              .deleteProjectById(projectGid)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProjectById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsDeleteProjectByIdResponse> response = client
              .projects
              .deleteProjectById(projectGid)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProjectById");
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
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**ProjectsDeleteProjectByIdResponse**](ProjectsDeleteProjectByIdResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the specified project. |  -  |

<a name="duplicateProjectJob"></a>
# **duplicateProjectJob**
> ProjectsDuplicateProjectJobResponse duplicateProjectJob(projectGid).optPretty(optPretty).optFields(optFields).projectsDuplicateProjectJobRequest(projectsDuplicateProjectJobRequest).execute();

Duplicate a project

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
import com.konfigthis.client.api.ProjectsApi;
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
    ProjectDuplicateRequest data = new ProjectDuplicateRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsDuplicateProjectJobResponse result = client
              .projects
              .duplicateProjectJob(projectGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#duplicateProjectJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsDuplicateProjectJobResponse> response = client
              .projects
              .duplicateProjectJob(projectGid)
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
      System.err.println("Exception when calling ProjectsApi#duplicateProjectJob");
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
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: new_project, new_project.name, new_project_template, new_project_template.name, new_task, new_task.created_by, new_task.name, new_task.resource_subtype, new_task_template, new_task_template.name, resource_subtype, status] |
| **projectsDuplicateProjectJobRequest** | [**ProjectsDuplicateProjectJobRequest**](ProjectsDuplicateProjectJobRequest.md)| Describes the duplicate&#39;s name and the elements that will be duplicated. | [optional] |

### Return type

[**ProjectsDuplicateProjectJobResponse**](ProjectsDuplicateProjectJobResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created the job to handle duplication. |  -  |

<a name="getAllInWorkspace"></a>
# **getAllInWorkspace**
> ProjectsGetAllInWorkspaceResponse getAllInWorkspace(workspaceGid).optPretty(optPretty).limit(limit).offset(offset).archived(archived).optFields(optFields).execute();

Get all projects in a workspace

Returns the compact project records for all projects in the workspace. *Note: This endpoint may timeout for large domains. Prefer the &#x60;/teams/{team_gid}/projects&#x60; endpoint.*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    Boolean archived = false; // Only return projects whose `archived` field takes on the value of this parameter.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsGetAllInWorkspaceResponse result = client
              .projects
              .getAllInWorkspace(workspaceGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .archived(archived)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getAllInWorkspace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsGetAllInWorkspaceResponse> response = client
              .projects
              .getAllInWorkspace(workspaceGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .archived(archived)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getAllInWorkspace");
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
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **archived** | **Boolean**| Only return projects whose &#x60;archived&#x60; field takes on the value of this parameter. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, offset, owner, path, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, uri, workspace, workspace.name] |

### Return type

[**ProjectsGetAllInWorkspaceResponse**](ProjectsGetAllInWorkspaceResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the requested workspace&#39;s projects. |  -  |

<a name="getProjectRecord"></a>
# **getProjectRecord**
> ProjectsGetProjectRecordResponse getProjectRecord(projectGid).optPretty(optPretty).optFields(optFields).execute();

Get a project

Returns the complete project record for a single project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsGetProjectRecordResponse result = client
              .projects
              .getProjectRecord(projectGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsGetProjectRecordResponse> response = client
              .projects
              .getProjectRecord(projectGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectRecord");
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
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, owner, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, workspace, workspace.name] |

### Return type

[**ProjectsGetProjectRecordResponse**](ProjectsGetProjectRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the requested project. |  -  |

<a name="getTaskCounts"></a>
# **getTaskCounts**
> ProjectsGetTaskCountsResponse getTaskCounts(projectGid).optPretty(optPretty).optFields(optFields).execute();

Get task count of a project

Get an object that holds task count fields. **All fields are excluded by default**. You must [opt in](https://developers.asana.com/reference/rest-api-reference) using &#x60;opt_fields&#x60; to get any information from this endpoint.  This endpoint has an additional [rate limit](https://developers.asana.com/reference/rest-api-reference) and each field counts especially high against our [cost limits](/docs/rate-limits#cost-limits).  Milestones are just tasks, so they are included in the &#x60;num_tasks&#x60;, &#x60;num_incomplete_tasks&#x60;, and &#x60;num_completed_tasks&#x60; counts.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsGetTaskCountsResponse result = client
              .projects
              .getTaskCounts(projectGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getTaskCounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsGetTaskCountsResponse> response = client
              .projects
              .getTaskCounts(projectGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getTaskCounts");
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
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: num_completed_milestones, num_completed_tasks, num_incomplete_milestones, num_incomplete_tasks, num_milestones, num_tasks] |

### Return type

[**ProjectsGetTaskCountsResponse**](ProjectsGetTaskCountsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the requested project&#39;s task counts. |  -  |

<a name="getTeamProjects"></a>
# **getTeamProjects**
> ProjectsGetTeamProjectsResponse getTeamProjects(teamGid).optPretty(optPretty).limit(limit).offset(offset).archived(archived).optFields(optFields).execute();

Get a team&#39;s projects

Returns the compact project records for all projects in the team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    Boolean archived = false; // Only return projects whose `archived` field takes on the value of this parameter.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsGetTeamProjectsResponse result = client
              .projects
              .getTeamProjects(teamGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .archived(archived)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getTeamProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsGetTeamProjectsResponse> response = client
              .projects
              .getTeamProjects(teamGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .archived(archived)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getTeamProjects");
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
| **archived** | **Boolean**| Only return projects whose &#x60;archived&#x60; field takes on the value of this parameter. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, offset, owner, path, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, uri, workspace, workspace.name] |

### Return type

[**ProjectsGetTeamProjectsResponse**](ProjectsGetTeamProjectsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the requested team&#39;s projects. |  -  |

<a name="listMultiple"></a>
# **listMultiple**
> ProjectsListMultipleResponse listMultiple().optPretty(optPretty).limit(limit).offset(offset).workspace(workspace).team(team).archived(archived).optFields(optFields).execute();

Get multiple projects

Returns the compact project records for some filtered set of projects. Use one or more of the parameters provided to filter the projects returned. *Note: This endpoint may timeout for large domains. Try filtering by team!*

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    String workspace = "1331"; // The workspace or organization to filter projects on.
    String team = "14916"; // The team to filter projects on.
    Boolean archived = false; // Only return projects whose `archived` field takes on the value of this parameter.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsListMultipleResponse result = client
              .projects
              .listMultiple()
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .workspace(workspace)
              .team(team)
              .archived(archived)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listMultiple");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsListMultipleResponse> response = client
              .projects
              .listMultiple()
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .workspace(workspace)
              .team(team)
              .archived(archived)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listMultiple");
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
| **workspace** | **String**| The workspace or organization to filter projects on. | [optional] |
| **team** | **String**| The team to filter projects on. | [optional] |
| **archived** | **Boolean**| Only return projects whose &#x60;archived&#x60; field takes on the value of this parameter. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, offset, owner, path, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, uri, workspace, workspace.name] |

### Return type

[**ProjectsListMultipleResponse**](ProjectsListMultipleResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved projects. |  -  |

<a name="removeCustomField"></a>
# **removeCustomField**
> ProjectsRemoveCustomFieldResponse removeCustomField(projectGid, projectsRemoveCustomFieldRequest).optPretty(optPretty).execute();

Remove a custom field from a project

Removes a custom field setting from a project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    RemoveCustomFieldSettingRequest data = new RemoveCustomFieldSettingRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      ProjectsRemoveCustomFieldResponse result = client
              .projects
              .removeCustomField(projectGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#removeCustomField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsRemoveCustomFieldResponse> response = client
              .projects
              .removeCustomField(projectGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#removeCustomField");
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
| **projectsRemoveCustomFieldRequest** | [**ProjectsRemoveCustomFieldRequest**](ProjectsRemoveCustomFieldRequest.md)| Information about the custom field setting being removed. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**ProjectsRemoveCustomFieldResponse**](ProjectsRemoveCustomFieldResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully removed the custom field from the project. |  -  |

<a name="removeMembersFromProject"></a>
# **removeMembersFromProject**
> ProjectsRemoveMembersFromProjectResponse removeMembersFromProject(projectGid, projectsRemoveMembersFromProjectRequest).optPretty(optPretty).optFields(optFields).execute();

Remove users from a project

Removes the specified list of users from members of the project. Returns the updated project record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    RemoveMembersRequest data = new RemoveMembersRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsRemoveMembersFromProjectResponse result = client
              .projects
              .removeMembersFromProject(projectGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#removeMembersFromProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsRemoveMembersFromProjectResponse> response = client
              .projects
              .removeMembersFromProject(projectGid)
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
      System.err.println("Exception when calling ProjectsApi#removeMembersFromProject");
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
| **projectsRemoveMembersFromProjectRequest** | [**ProjectsRemoveMembersFromProjectRequest**](ProjectsRemoveMembersFromProjectRequest.md)| Information about the members being removed. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, owner, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, workspace, workspace.name] |

### Return type

[**ProjectsRemoveMembersFromProjectResponse**](ProjectsRemoveMembersFromProjectResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully removed the members from the project. |  -  |

<a name="removeProjectFollowers"></a>
# **removeProjectFollowers**
> ProjectsRemoveProjectFollowersResponse removeProjectFollowers(projectGid, projectsRemoveProjectFollowersRequest).optPretty(optPretty).optFields(optFields).execute();

Remove followers from a project

Removes the specified list of users from following the project, this will not affect project membership status. Returns the updated project record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    RemoveFollowersRequest data = new RemoveFollowersRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsRemoveProjectFollowersResponse result = client
              .projects
              .removeProjectFollowers(projectGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#removeProjectFollowers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsRemoveProjectFollowersResponse> response = client
              .projects
              .removeProjectFollowers(projectGid)
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
      System.err.println("Exception when calling ProjectsApi#removeProjectFollowers");
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
| **projectsRemoveProjectFollowersRequest** | [**ProjectsRemoveProjectFollowersRequest**](ProjectsRemoveProjectFollowersRequest.md)| Information about the followers being removed. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, owner, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, workspace, workspace.name] |

### Return type

[**ProjectsRemoveProjectFollowersResponse**](ProjectsRemoveProjectFollowersResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully removed followers from the project. |  -  |

<a name="taskProjectsList"></a>
# **taskProjectsList**
> ProjectsTaskProjectsListResponse taskProjectsList(taskGid).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get projects a task is in

Returns a compact representation of all of the projects the task is in.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
      ProjectsTaskProjectsListResponse result = client
              .projects
              .taskProjectsList(taskGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#taskProjectsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsTaskProjectsListResponse> response = client
              .projects
              .taskProjectsList(taskGid)
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
      System.err.println("Exception when calling ProjectsApi#taskProjectsList");
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
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, offset, owner, path, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, uri, workspace, workspace.name] |

### Return type

[**ProjectsTaskProjectsListResponse**](ProjectsTaskProjectsListResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the projects for the given task. |  -  |

<a name="updateProjectRecord"></a>
# **updateProjectRecord**
> ProjectsUpdateProjectRecordResponse updateProjectRecord(projectGid, projectsUpdateProjectRecordRequest).optPretty(optPretty).optFields(optFields).execute();

Update a project

A specific, existing project can be updated by making a PUT request on the URL for that project. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the task.  Returns the complete updated project record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    ProjectUpdateRequest data = new ProjectUpdateRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      ProjectsUpdateProjectRecordResponse result = client
              .projects
              .updateProjectRecord(projectGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateProjectRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsUpdateProjectRecordResponse> response = client
              .projects
              .updateProjectRecord(projectGid)
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
      System.err.println("Exception when calling ProjectsApi#updateProjectRecord");
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
| **projectsUpdateProjectRecordRequest** | [**ProjectsUpdateProjectRecordRequest**](ProjectsUpdateProjectRecordRequest.md)| The updated fields for the project. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, owner, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, workspace, workspace.name] |

### Return type

[**ProjectsUpdateProjectRecordResponse**](ProjectsUpdateProjectRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the project. |  -  |

