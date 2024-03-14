<div align="left">

[![Visit Asana](./header.png)](https://asana.com)

# [Asana](https://asana.com)

This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec](https://raw.githubusercontent.com/Asana/openapi/master/defs/asana_oas.yaml).

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Asana&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>asana-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:asana-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/asana-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttachmentsApi;
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
    String attachmentGid = "12345"; // Globally unique identifier for the attachment.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      AttachmentsDeleteSpecificResponse result = client
              .attachments
              .deleteSpecific(attachmentGid)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#deleteSpecific");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttachmentsDeleteSpecificResponse> response = client
              .attachments
              .deleteSpecific(attachmentGid)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#deleteSpecific");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://app.asana.com/api/1.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AttachmentsApi* | [**deleteSpecific**](docs/AttachmentsApi.md#deleteSpecific) | **DELETE** /attachments/{attachment_gid} | Delete an attachment
*AttachmentsApi* | [**getAllForObject**](docs/AttachmentsApi.md#getAllForObject) | **GET** /attachments | Get attachments from an object
*AttachmentsApi* | [**getAttachmentRecord**](docs/AttachmentsApi.md#getAttachmentRecord) | **GET** /attachments/{attachment_gid} | Get an attachment
*AttachmentsApi* | [**uploadAttachment**](docs/AttachmentsApi.md#uploadAttachment) | **POST** /attachments | Upload an attachment
*AuditLogApiApi* | [**getAuditLogEvents**](docs/AuditLogApiApi.md#getAuditLogEvents) | **GET** /workspaces/{workspace_gid}/audit_log_events | Get audit log events
*BatchApiApi* | [**submitParallelRequests**](docs/BatchApiApi.md#submitParallelRequests) | **POST** /batch | Submit parallel requests
*CustomFieldSettingsApi* | [**getPortfolioCustomFieldSettings**](docs/CustomFieldSettingsApi.md#getPortfolioCustomFieldSettings) | **GET** /portfolios/{portfolio_gid}/custom_field_settings | Get a portfolio&#39;s custom fields
*CustomFieldSettingsApi* | [**getProjectCustomFieldSettings**](docs/CustomFieldSettingsApi.md#getProjectCustomFieldSettings) | **GET** /projects/{project_gid}/custom_field_settings | Get a project&#39;s custom fields
*CustomFieldsApi* | [**addEnumOption**](docs/CustomFieldsApi.md#addEnumOption) | **POST** /custom_fields/{custom_field_gid}/enum_options | Create an enum option
*CustomFieldsApi* | [**createNewFieldRecord**](docs/CustomFieldsApi.md#createNewFieldRecord) | **POST** /custom_fields | Create a custom field
*CustomFieldsApi* | [**deleteFieldRecord**](docs/CustomFieldsApi.md#deleteFieldRecord) | **DELETE** /custom_fields/{custom_field_gid} | Delete a custom field
*CustomFieldsApi* | [**getMetadata**](docs/CustomFieldsApi.md#getMetadata) | **GET** /custom_fields/{custom_field_gid} | Get a custom field
*CustomFieldsApi* | [**listWorkspaceCustomFields**](docs/CustomFieldsApi.md#listWorkspaceCustomFields) | **GET** /workspaces/{workspace_gid}/custom_fields | Get a workspace&#39;s custom fields
*CustomFieldsApi* | [**reorderEnumOption**](docs/CustomFieldsApi.md#reorderEnumOption) | **POST** /custom_fields/{custom_field_gid}/enum_options/insert | Reorder a custom field&#39;s enum
*CustomFieldsApi* | [**updateEnumOption**](docs/CustomFieldsApi.md#updateEnumOption) | **PUT** /enum_options/{enum_option_gid} | Update an enum option
*CustomFieldsApi* | [**updateFieldRecord**](docs/CustomFieldsApi.md#updateFieldRecord) | **PUT** /custom_fields/{custom_field_gid} | Update a custom field
*EventsApi* | [**getResourceEvents**](docs/EventsApi.md#getResourceEvents) | **GET** /events | Get events on a resource
*GoalRelationshipsApi* | [**createSupportingRelationship**](docs/GoalRelationshipsApi.md#createSupportingRelationship) | **POST** /goals/{goal_gid}/addSupportingRelationship | Add a supporting goal relationship
*GoalRelationshipsApi* | [**getCompactRecords**](docs/GoalRelationshipsApi.md#getCompactRecords) | **GET** /goal_relationships | Get goal relationships
*GoalRelationshipsApi* | [**getRecordById**](docs/GoalRelationshipsApi.md#getRecordById) | **GET** /goal_relationships/{goal_relationship_gid} | Get a goal relationship
*GoalRelationshipsApi* | [**removeSupportingRelationship**](docs/GoalRelationshipsApi.md#removeSupportingRelationship) | **POST** /goals/{goal_gid}/removeSupportingRelationship | Removes a supporting goal relationship
*GoalRelationshipsApi* | [**updateGoalRelationshipRecord**](docs/GoalRelationshipsApi.md#updateGoalRelationshipRecord) | **PUT** /goal_relationships/{goal_relationship_gid} | Update a goal relationship
*GoalsApi* | [**addCollaboratorsToGoal**](docs/GoalsApi.md#addCollaboratorsToGoal) | **POST** /goals/{goal_gid}/addFollowers | Add a collaborator to a goal
*GoalsApi* | [**createMetric**](docs/GoalsApi.md#createMetric) | **POST** /goals/{goal_gid}/setMetric | Create a goal metric
*GoalsApi* | [**createNewGoalRecord**](docs/GoalsApi.md#createNewGoalRecord) | **POST** /goals | Create a goal
*GoalsApi* | [**deleteRecord**](docs/GoalsApi.md#deleteRecord) | **DELETE** /goals/{goal_gid} | Delete a goal
*GoalsApi* | [**getCompactRecords**](docs/GoalsApi.md#getCompactRecords) | **GET** /goals | Get goals
*GoalsApi* | [**getGoalRecord**](docs/GoalsApi.md#getGoalRecord) | **GET** /goals/{goal_gid} | Get a goal
*GoalsApi* | [**getParentGoals**](docs/GoalsApi.md#getParentGoals) | **GET** /goals/{goal_gid}/parentGoals | Get parent goals from a goal
*GoalsApi* | [**removeFollowersFromGoal**](docs/GoalsApi.md#removeFollowersFromGoal) | **POST** /goals/{goal_gid}/removeFollowers | Remove a collaborator from a goal
*GoalsApi* | [**updateGoalRecord**](docs/GoalsApi.md#updateGoalRecord) | **PUT** /goals/{goal_gid} | Update a goal
*GoalsApi* | [**updateMetricCurrentValue**](docs/GoalsApi.md#updateMetricCurrentValue) | **POST** /goals/{goal_gid}/setMetricCurrentValue | Update a goal metric
*JobsApi* | [**getById**](docs/JobsApi.md#getById) | **GET** /jobs/{job_gid} | Get a job by id
*MembershipsApi* | [**createNewRecord**](docs/MembershipsApi.md#createNewRecord) | **POST** /memberships | Create a membership
*MembershipsApi* | [**deleteRecord**](docs/MembershipsApi.md#deleteRecord) | **DELETE** /memberships/{membership_gid} | Delete a membership
*MembershipsApi* | [**getMembershipRecord**](docs/MembershipsApi.md#getMembershipRecord) | **GET** /memberships/{membership_gid} | Get a membership
*MembershipsApi* | [**getMultiple**](docs/MembershipsApi.md#getMultiple) | **GET** /memberships | Get multiple memberships
*OrganizationExportsApi* | [**createExportRequest**](docs/OrganizationExportsApi.md#createExportRequest) | **POST** /organization_exports | Create an organization export request
*OrganizationExportsApi* | [**getExportDetails**](docs/OrganizationExportsApi.md#getExportDetails) | **GET** /organization_exports/{organization_export_gid} | Get details on an org export request
*PortfolioMembershipsApi* | [**getCompact**](docs/PortfolioMembershipsApi.md#getCompact) | **GET** /portfolios/{portfolio_gid}/portfolio_memberships | Get memberships from a portfolio
*PortfolioMembershipsApi* | [**getCompleteRecord**](docs/PortfolioMembershipsApi.md#getCompleteRecord) | **GET** /portfolio_memberships/{portfolio_membership_gid} | Get a portfolio membership
*PortfolioMembershipsApi* | [**listMultipleMemberships**](docs/PortfolioMembershipsApi.md#listMultipleMemberships) | **GET** /portfolio_memberships | Get multiple portfolio memberships
*PortfoliosApi* | [**addCustomFieldSetting**](docs/PortfoliosApi.md#addCustomFieldSetting) | **POST** /portfolios/{portfolio_gid}/addCustomFieldSetting | Add a custom field to a portfolio
*PortfoliosApi* | [**addMembersToPortfolio**](docs/PortfoliosApi.md#addMembersToPortfolio) | **POST** /portfolios/{portfolio_gid}/addMembers | Add users to a portfolio
*PortfoliosApi* | [**addPortfolioItem**](docs/PortfoliosApi.md#addPortfolioItem) | **POST** /portfolios/{portfolio_gid}/addItem | Add a portfolio item
*PortfoliosApi* | [**createNewPortfolioRecord**](docs/PortfoliosApi.md#createNewPortfolioRecord) | **POST** /portfolios | Create a portfolio
*PortfoliosApi* | [**deleteRecord**](docs/PortfoliosApi.md#deleteRecord) | **DELETE** /portfolios/{portfolio_gid} | Delete a portfolio
*PortfoliosApi* | [**getItems**](docs/PortfoliosApi.md#getItems) | **GET** /portfolios/{portfolio_gid}/items | Get portfolio items
*PortfoliosApi* | [**getRecord**](docs/PortfoliosApi.md#getRecord) | **GET** /portfolios/{portfolio_gid} | Get a portfolio
*PortfoliosApi* | [**listMultiplePortfolios**](docs/PortfoliosApi.md#listMultiplePortfolios) | **GET** /portfolios | Get multiple portfolios
*PortfoliosApi* | [**removeCustomFieldSetting**](docs/PortfoliosApi.md#removeCustomFieldSetting) | **POST** /portfolios/{portfolio_gid}/removeCustomFieldSetting | Remove a custom field from a portfolio
*PortfoliosApi* | [**removeItemFromPortfolio**](docs/PortfoliosApi.md#removeItemFromPortfolio) | **POST** /portfolios/{portfolio_gid}/removeItem | Remove a portfolio item
*PortfoliosApi* | [**removeMembersFromPortfolio**](docs/PortfoliosApi.md#removeMembersFromPortfolio) | **POST** /portfolios/{portfolio_gid}/removeMembers | Remove users from a portfolio
*PortfoliosApi* | [**updatePortfolioRecord**](docs/PortfoliosApi.md#updatePortfolioRecord) | **PUT** /portfolios/{portfolio_gid} | Update a portfolio
*ProjectBriefsApi* | [**createNewRecord**](docs/ProjectBriefsApi.md#createNewRecord) | **POST** /projects/{project_gid}/project_briefs | Create a project brief
*ProjectBriefsApi* | [**getFullRecord**](docs/ProjectBriefsApi.md#getFullRecord) | **GET** /project_briefs/{project_brief_gid} | Get a project brief
*ProjectBriefsApi* | [**removeBrief**](docs/ProjectBriefsApi.md#removeBrief) | **DELETE** /project_briefs/{project_brief_gid} | Delete a project brief
*ProjectBriefsApi* | [**updateBriefRecord**](docs/ProjectBriefsApi.md#updateBriefRecord) | **PUT** /project_briefs/{project_brief_gid} | Update a project brief
*ProjectMembershipsApi* | [**getCompactRecords**](docs/ProjectMembershipsApi.md#getCompactRecords) | **GET** /projects/{project_gid}/project_memberships | Get memberships from a project
*ProjectMembershipsApi* | [**getRecord**](docs/ProjectMembershipsApi.md#getRecord) | **GET** /project_memberships/{project_membership_gid} | Get a project membership
*ProjectStatusesApi* | [**createNewStatusUpdateRecord**](docs/ProjectStatusesApi.md#createNewStatusUpdateRecord) | **POST** /projects/{project_gid}/project_statuses | Create a project status
*ProjectStatusesApi* | [**deleteSpecificStatusUpdate**](docs/ProjectStatusesApi.md#deleteSpecificStatusUpdate) | **DELETE** /project_statuses/{project_status_gid} | Delete a project status
*ProjectStatusesApi* | [**getProjectUpdates**](docs/ProjectStatusesApi.md#getProjectUpdates) | **GET** /projects/{project_gid}/project_statuses | Get statuses from a project
*ProjectStatusesApi* | [**getStatusUpdateRecord**](docs/ProjectStatusesApi.md#getStatusUpdateRecord) | **GET** /project_statuses/{project_status_gid} | Get a project status
*ProjectTemplatesApi* | [**deleteTemplateRecord**](docs/ProjectTemplatesApi.md#deleteTemplateRecord) | **DELETE** /project_templates/{project_template_gid} | Delete a project template
*ProjectTemplatesApi* | [**getAllTemplateRecords**](docs/ProjectTemplatesApi.md#getAllTemplateRecords) | **GET** /teams/{team_gid}/project_templates | Get a team&#39;s project templates
*ProjectTemplatesApi* | [**getRecord**](docs/ProjectTemplatesApi.md#getRecord) | **GET** /project_templates/{project_template_gid} | Get a project template
*ProjectTemplatesApi* | [**instantiateProjectJob**](docs/ProjectTemplatesApi.md#instantiateProjectJob) | **POST** /project_templates/{project_template_gid}/instantiateProject | Instantiate a project from a project template
*ProjectTemplatesApi* | [**listMultiple**](docs/ProjectTemplatesApi.md#listMultiple) | **GET** /project_templates | Get multiple project templates
*ProjectsApi* | [**addCustomFieldSetting**](docs/ProjectsApi.md#addCustomFieldSetting) | **POST** /projects/{project_gid}/addCustomFieldSetting | Add a custom field to a project
*ProjectsApi* | [**addFollowersToProject**](docs/ProjectsApi.md#addFollowersToProject) | **POST** /projects/{project_gid}/addFollowers | Add followers to a project
*ProjectsApi* | [**addMembersToProject**](docs/ProjectsApi.md#addMembersToProject) | **POST** /projects/{project_gid}/addMembers | Add users to a project
*ProjectsApi* | [**createInWorkspace**](docs/ProjectsApi.md#createInWorkspace) | **POST** /workspaces/{workspace_gid}/projects | Create a project in a workspace
*ProjectsApi* | [**createNewProjectRecord**](docs/ProjectsApi.md#createNewProjectRecord) | **POST** /projects | Create a project
*ProjectsApi* | [**createProjectForTeam**](docs/ProjectsApi.md#createProjectForTeam) | **POST** /teams/{team_gid}/projects | Create a project in a team
*ProjectsApi* | [**createProjectTemplateJob**](docs/ProjectsApi.md#createProjectTemplateJob) | **POST** /projects/{project_gid}/saveAsTemplate | Create a project template from a project
*ProjectsApi* | [**deleteProjectById**](docs/ProjectsApi.md#deleteProjectById) | **DELETE** /projects/{project_gid} | Delete a project
*ProjectsApi* | [**duplicateProjectJob**](docs/ProjectsApi.md#duplicateProjectJob) | **POST** /projects/{project_gid}/duplicate | Duplicate a project
*ProjectsApi* | [**getAllInWorkspace**](docs/ProjectsApi.md#getAllInWorkspace) | **GET** /workspaces/{workspace_gid}/projects | Get all projects in a workspace
*ProjectsApi* | [**getProjectRecord**](docs/ProjectsApi.md#getProjectRecord) | **GET** /projects/{project_gid} | Get a project
*ProjectsApi* | [**getTaskCounts**](docs/ProjectsApi.md#getTaskCounts) | **GET** /projects/{project_gid}/task_counts | Get task count of a project
*ProjectsApi* | [**getTeamProjects**](docs/ProjectsApi.md#getTeamProjects) | **GET** /teams/{team_gid}/projects | Get a team&#39;s projects
*ProjectsApi* | [**listMultiple**](docs/ProjectsApi.md#listMultiple) | **GET** /projects | Get multiple projects
*ProjectsApi* | [**removeCustomField**](docs/ProjectsApi.md#removeCustomField) | **POST** /projects/{project_gid}/removeCustomFieldSetting | Remove a custom field from a project
*ProjectsApi* | [**removeMembersFromProject**](docs/ProjectsApi.md#removeMembersFromProject) | **POST** /projects/{project_gid}/removeMembers | Remove users from a project
*ProjectsApi* | [**removeProjectFollowers**](docs/ProjectsApi.md#removeProjectFollowers) | **POST** /projects/{project_gid}/removeFollowers | Remove followers from a project
*ProjectsApi* | [**taskProjectsList**](docs/ProjectsApi.md#taskProjectsList) | **GET** /tasks/{task_gid}/projects | Get projects a task is in
*ProjectsApi* | [**updateProjectRecord**](docs/ProjectsApi.md#updateProjectRecord) | **PUT** /projects/{project_gid} | Update a project
*RulesApi* | [**triggerRuleRequest**](docs/RulesApi.md#triggerRuleRequest) | **POST** /rule_triggers/{rule_trigger_gid}/run | Trigger a rule
*SectionsApi* | [**addTaskToSection**](docs/SectionsApi.md#addTaskToSection) | **POST** /sections/{section_gid}/addTask | Add task to section
*SectionsApi* | [**createNewSection**](docs/SectionsApi.md#createNewSection) | **POST** /projects/{project_gid}/sections | Create a section in a project
*SectionsApi* | [**deleteSection**](docs/SectionsApi.md#deleteSection) | **DELETE** /sections/{section_gid} | Delete a section
*SectionsApi* | [**getRecord**](docs/SectionsApi.md#getRecord) | **GET** /sections/{section_gid} | Get a section
*SectionsApi* | [**listProjectSections**](docs/SectionsApi.md#listProjectSections) | **GET** /projects/{project_gid}/sections | Get sections in a project
*SectionsApi* | [**moveOrInsert**](docs/SectionsApi.md#moveOrInsert) | **POST** /projects/{project_gid}/sections/insert | Move or Insert sections
*SectionsApi* | [**updateSectionRecord**](docs/SectionsApi.md#updateSectionRecord) | **PUT** /sections/{section_gid} | Update a section
*StatusUpdatesApi* | [**createNewStatusUpdateRecord**](docs/StatusUpdatesApi.md#createNewStatusUpdateRecord) | **POST** /status_updates | Create a status update
*StatusUpdatesApi* | [**deleteSpecificStatusUpdate**](docs/StatusUpdatesApi.md#deleteSpecificStatusUpdate) | **DELETE** /status_updates/{status_update_gid} | Delete a status update
*StatusUpdatesApi* | [**getCompactRecords**](docs/StatusUpdatesApi.md#getCompactRecords) | **GET** /status_updates | Get status updates from an object
*StatusUpdatesApi* | [**getRecordById**](docs/StatusUpdatesApi.md#getRecordById) | **GET** /status_updates/{status_update_gid} | Get a status update
*StoriesApi* | [**createComment**](docs/StoriesApi.md#createComment) | **POST** /tasks/{task_gid}/stories | Create a story on a task
*StoriesApi* | [**deleteStoryRecord**](docs/StoriesApi.md#deleteStoryRecord) | **DELETE** /stories/{story_gid} | Delete a story
*StoriesApi* | [**getFullRecord**](docs/StoriesApi.md#getFullRecord) | **GET** /stories/{story_gid} | Get a story
*StoriesApi* | [**getTaskStories**](docs/StoriesApi.md#getTaskStories) | **GET** /tasks/{task_gid}/stories | Get stories from a task
*StoriesApi* | [**updateFullRecord**](docs/StoriesApi.md#updateFullRecord) | **PUT** /stories/{story_gid} | Update a story
*TagsApi* | [**createNewTagRecord**](docs/TagsApi.md#createNewTagRecord) | **POST** /tags | Create a tag
*TagsApi* | [**createTagInWorkspace**](docs/TagsApi.md#createTagInWorkspace) | **POST** /workspaces/{workspace_gid}/tags | Create a tag in a workspace
*TagsApi* | [**getFilteredTags**](docs/TagsApi.md#getFilteredTags) | **GET** /workspaces/{workspace_gid}/tags | Get tags in a workspace
*TagsApi* | [**getRecord**](docs/TagsApi.md#getRecord) | **GET** /tags/{tag_gid} | Get a tag
*TagsApi* | [**getTaskTags**](docs/TagsApi.md#getTaskTags) | **GET** /tasks/{task_gid}/tags | Get a task&#39;s tags
*TagsApi* | [**listFilteredTags**](docs/TagsApi.md#listFilteredTags) | **GET** /tags | Get multiple tags
*TagsApi* | [**removeTag**](docs/TagsApi.md#removeTag) | **DELETE** /tags/{tag_gid} | Delete a tag
*TagsApi* | [**updateTagRecord**](docs/TagsApi.md#updateTagRecord) | **PUT** /tags/{tag_gid} | Update a tag
*TaskTemplatesApi* | [**deleteTaskTemplate**](docs/TaskTemplatesApi.md#deleteTaskTemplate) | **DELETE** /task_templates/{task_template_gid} | Delete a task template
*TaskTemplatesApi* | [**getSingleTemplate**](docs/TaskTemplatesApi.md#getSingleTemplate) | **GET** /task_templates/{task_template_gid} | Get a task template
*TaskTemplatesApi* | [**instantiateTaskJob**](docs/TaskTemplatesApi.md#instantiateTaskJob) | **POST** /task_templates/{task_template_gid}/instantiateTask | Instantiate a task from a task template
*TaskTemplatesApi* | [**listMultiple**](docs/TaskTemplatesApi.md#listMultiple) | **GET** /task_templates | Get multiple task templates
*TasksApi* | [**addFollowersToTask**](docs/TasksApi.md#addFollowersToTask) | **POST** /tasks/{task_gid}/addFollowers | Add followers to a task
*TasksApi* | [**addProjectToTask**](docs/TasksApi.md#addProjectToTask) | **POST** /tasks/{task_gid}/addProject | Add a project to a task
*TasksApi* | [**addTagToTask**](docs/TasksApi.md#addTagToTask) | **POST** /tasks/{task_gid}/addTag | Add a tag to a task
*TasksApi* | [**createNewTask**](docs/TasksApi.md#createNewTask) | **POST** /tasks | Create a task
*TasksApi* | [**createSubtaskRecord**](docs/TasksApi.md#createSubtaskRecord) | **POST** /tasks/{task_gid}/subtasks | Create a subtask
*TasksApi* | [**deleteTask**](docs/TasksApi.md#deleteTask) | **DELETE** /tasks/{task_gid} | Delete a task
*TasksApi* | [**duplicateTaskJob**](docs/TasksApi.md#duplicateTaskJob) | **POST** /tasks/{task_gid}/duplicate | Duplicate a task
*TasksApi* | [**getAllDependencies**](docs/TasksApi.md#getAllDependencies) | **GET** /tasks/{task_gid}/dependencies | Get dependencies from a task
*TasksApi* | [**getByCustomId**](docs/TasksApi.md#getByCustomId) | **GET** /workspaces/{workspace_gid}/tasks/custom_id/{custom_id} | Get a task for a given custom ID
*TasksApi* | [**getDependents**](docs/TasksApi.md#getDependents) | **GET** /tasks/{task_gid}/dependents | Get dependents from a task
*TasksApi* | [**getMultiple**](docs/TasksApi.md#getMultiple) | **GET** /tasks | Get multiple tasks
*TasksApi* | [**getMultipleWithTag**](docs/TasksApi.md#getMultipleWithTag) | **GET** /tags/{tag_gid}/tasks | Get tasks from a tag
*TasksApi* | [**getSectionTasks**](docs/TasksApi.md#getSectionTasks) | **GET** /sections/{section_gid}/tasks | Get tasks from a section
*TasksApi* | [**getSubtaskList**](docs/TasksApi.md#getSubtaskList) | **GET** /tasks/{task_gid}/subtasks | Get subtasks from a task
*TasksApi* | [**getTaskRecord**](docs/TasksApi.md#getTaskRecord) | **GET** /tasks/{task_gid} | Get a task
*TasksApi* | [**getTasksByProject**](docs/TasksApi.md#getTasksByProject) | **GET** /projects/{project_gid}/tasks | Get tasks from a project
*TasksApi* | [**getUserTaskListTasks**](docs/TasksApi.md#getUserTaskListTasks) | **GET** /user_task_lists/{user_task_list_gid}/tasks | Get tasks from a user task list
*TasksApi* | [**removeFollowersFromTask**](docs/TasksApi.md#removeFollowersFromTask) | **POST** /tasks/{task_gid}/removeFollowers | Remove followers from a task
*TasksApi* | [**removeProjectFromTask**](docs/TasksApi.md#removeProjectFromTask) | **POST** /tasks/{task_gid}/removeProject | Remove a project from a task
*TasksApi* | [**removeTagFromTask**](docs/TasksApi.md#removeTagFromTask) | **POST** /tasks/{task_gid}/removeTag | Remove a tag from a task
*TasksApi* | [**searchInWorkspace**](docs/TasksApi.md#searchInWorkspace) | **GET** /workspaces/{workspace_gid}/tasks/search | Search tasks in a workspace
*TasksApi* | [**setDependenciesForTask**](docs/TasksApi.md#setDependenciesForTask) | **POST** /tasks/{task_gid}/addDependencies | Set dependencies for a task
*TasksApi* | [**setParentTask**](docs/TasksApi.md#setParentTask) | **POST** /tasks/{task_gid}/setParent | Set the parent of a task
*TasksApi* | [**setTaskDependents**](docs/TasksApi.md#setTaskDependents) | **POST** /tasks/{task_gid}/addDependents | Set dependents for a task
*TasksApi* | [**unlinkDependenciesFromTask**](docs/TasksApi.md#unlinkDependenciesFromTask) | **POST** /tasks/{task_gid}/removeDependencies | Unlink dependencies from a task
*TasksApi* | [**unlinkDependents**](docs/TasksApi.md#unlinkDependents) | **POST** /tasks/{task_gid}/removeDependents | Unlink dependents from a task
*TasksApi* | [**updateTaskRecord**](docs/TasksApi.md#updateTaskRecord) | **PUT** /tasks/{task_gid} | Update a task
*TeamMembershipsApi* | [**getCompact**](docs/TeamMembershipsApi.md#getCompact) | **GET** /teams/{team_gid}/team_memberships | Get memberships from a team
*TeamMembershipsApi* | [**getCompactRecords**](docs/TeamMembershipsApi.md#getCompactRecords) | **GET** /team_memberships | Get team memberships
*TeamMembershipsApi* | [**getRecordById**](docs/TeamMembershipsApi.md#getRecordById) | **GET** /team_memberships/{team_membership_gid} | Get a team membership
*TeamMembershipsApi* | [**getUserCompact**](docs/TeamMembershipsApi.md#getUserCompact) | **GET** /users/{user_gid}/team_memberships | Get memberships from a user
*TeamsApi* | [**addUserToTeam**](docs/TeamsApi.md#addUserToTeam) | **POST** /teams/{team_gid}/addUser | Add a user to a team
*TeamsApi* | [**createTeamRecord**](docs/TeamsApi.md#createTeamRecord) | **POST** /teams | Create a team
*TeamsApi* | [**getTeamRecord**](docs/TeamsApi.md#getTeamRecord) | **GET** /teams/{team_gid} | Get a team
*TeamsApi* | [**getUserTeams**](docs/TeamsApi.md#getUserTeams) | **GET** /users/{user_gid}/teams | Get teams for a user
*TeamsApi* | [**listWorkspaceTeams**](docs/TeamsApi.md#listWorkspaceTeams) | **GET** /workspaces/{workspace_gid}/teams | Get teams in a workspace
*TeamsApi* | [**removeUserFromTeam**](docs/TeamsApi.md#removeUserFromTeam) | **POST** /teams/{team_gid}/removeUser | Remove a user from a team
*TeamsApi* | [**updateTeamRecord**](docs/TeamsApi.md#updateTeamRecord) | **PUT** /teams/{team_gid} | Update a team
*TimePeriodsApi* | [**getCompactTimePeriods**](docs/TimePeriodsApi.md#getCompactTimePeriods) | **GET** /time_periods | Get time periods
*TimePeriodsApi* | [**getFullRecord**](docs/TimePeriodsApi.md#getFullRecord) | **GET** /time_periods/{time_period_gid} | Get a time period
*TimeTrackingEntriesApi* | [**createNewTimeEntryRecord**](docs/TimeTrackingEntriesApi.md#createNewTimeEntryRecord) | **POST** /tasks/{task_gid}/time_tracking_entries | Create a time tracking entry
*TimeTrackingEntriesApi* | [**deleteTimeEntry**](docs/TimeTrackingEntriesApi.md#deleteTimeEntry) | **DELETE** /time_tracking_entries/{time_tracking_entry_gid} | Delete a time tracking entry
*TimeTrackingEntriesApi* | [**getForTask**](docs/TimeTrackingEntriesApi.md#getForTask) | **GET** /tasks/{task_gid}/time_tracking_entries | Get time tracking entries for a task
*TimeTrackingEntriesApi* | [**getRecord**](docs/TimeTrackingEntriesApi.md#getRecord) | **GET** /time_tracking_entries/{time_tracking_entry_gid} | Get a time tracking entry
*TimeTrackingEntriesApi* | [**updateTimeTrackingEntry**](docs/TimeTrackingEntriesApi.md#updateTimeTrackingEntry) | **PUT** /time_tracking_entries/{time_tracking_entry_gid} | Update a time tracking entry
*TypeaheadApi* | [**getResults**](docs/TypeaheadApi.md#getResults) | **GET** /workspaces/{workspace_gid}/typeahead | Get objects via typeahead
*UserTaskListsApi* | [**getRecord**](docs/UserTaskListsApi.md#getRecord) | **GET** /user_task_lists/{user_task_list_gid} | Get a user task list
*UserTaskListsApi* | [**getUserTaskList**](docs/UserTaskListsApi.md#getUserTaskList) | **GET** /users/{user_gid}/user_task_list | Get a user&#39;s task list
*UsersApi* | [**getFavoritesForUser**](docs/UsersApi.md#getFavoritesForUser) | **GET** /users/{user_gid}/favorites | Get a user&#39;s favorites
*UsersApi* | [**getUserRecord**](docs/UsersApi.md#getUserRecord) | **GET** /users/{user_gid} | Get a user
*UsersApi* | [**listMultipleUsers**](docs/UsersApi.md#listMultipleUsers) | **GET** /users | Get multiple users
*UsersApi* | [**listTeamUsers**](docs/UsersApi.md#listTeamUsers) | **GET** /teams/{team_gid}/users | Get users in a team
*UsersApi* | [**listWorkspaceUsers**](docs/UsersApi.md#listWorkspaceUsers) | **GET** /workspaces/{workspace_gid}/users | Get users in a workspace or organization
*WebhooksApi* | [**establishWebhook**](docs/WebhooksApi.md#establishWebhook) | **POST** /webhooks | Establish a webhook
*WebhooksApi* | [**getWebhookRecord**](docs/WebhooksApi.md#getWebhookRecord) | **GET** /webhooks/{webhook_gid} | Get a webhook
*WebhooksApi* | [**listMultipleWebhooks**](docs/WebhooksApi.md#listMultipleWebhooks) | **GET** /webhooks | Get multiple webhooks
*WebhooksApi* | [**removeWebhook**](docs/WebhooksApi.md#removeWebhook) | **DELETE** /webhooks/{webhook_gid} | Delete a webhook
*WebhooksApi* | [**updateWebhookFilters**](docs/WebhooksApi.md#updateWebhookFilters) | **PUT** /webhooks/{webhook_gid} | Update a webhook
*WorkspaceMembershipsApi* | [**getRecordById**](docs/WorkspaceMembershipsApi.md#getRecordById) | **GET** /workspace_memberships/{workspace_membership_gid} | Get a workspace membership
*WorkspaceMembershipsApi* | [**getUserMemberships**](docs/WorkspaceMembershipsApi.md#getUserMemberships) | **GET** /users/{user_gid}/workspace_memberships | Get workspace memberships for a user
*WorkspaceMembershipsApi* | [**listForWorkspace**](docs/WorkspaceMembershipsApi.md#listForWorkspace) | **GET** /workspaces/{workspace_gid}/workspace_memberships | Get the workspace memberships for a workspace
*WorkspacesApi* | [**addUserToWorkspace**](docs/WorkspacesApi.md#addUserToWorkspace) | **POST** /workspaces/{workspace_gid}/addUser | Add a user to a workspace or organization
*WorkspacesApi* | [**getWorkspaceRecord**](docs/WorkspacesApi.md#getWorkspaceRecord) | **GET** /workspaces/{workspace_gid} | Get a workspace
*WorkspacesApi* | [**listMultiple**](docs/WorkspacesApi.md#listMultiple) | **GET** /workspaces | Get multiple workspaces
*WorkspacesApi* | [**removeUserFromWorkspace**](docs/WorkspacesApi.md#removeUserFromWorkspace) | **POST** /workspaces/{workspace_gid}/removeUser | Remove a user from a workspace or organization
*WorkspacesApi* | [**updateWorkspaceRecord**](docs/WorkspacesApi.md#updateWorkspaceRecord) | **PUT** /workspaces/{workspace_gid} | Update a workspace


## Documentation for Models

 - [AddCustomFieldSettingRequest](docs/AddCustomFieldSettingRequest.md)
 - [AddFollowersRequest](docs/AddFollowersRequest.md)
 - [AddMembersRequest](docs/AddMembersRequest.md)
 - [AsanaNamedResource](docs/AsanaNamedResource.md)
 - [AsanaNamedResourceAllOf](docs/AsanaNamedResourceAllOf.md)
 - [AsanaResource](docs/AsanaResource.md)
 - [AttachmentCompact](docs/AttachmentCompact.md)
 - [AttachmentCompactAllOf](docs/AttachmentCompactAllOf.md)
 - [AttachmentRequest](docs/AttachmentRequest.md)
 - [AttachmentResponse](docs/AttachmentResponse.md)
 - [AttachmentResponseAllOf](docs/AttachmentResponseAllOf.md)
 - [AttachmentsDeleteSpecificResponse](docs/AttachmentsDeleteSpecificResponse.md)
 - [AttachmentsGetAllForObjectResponse](docs/AttachmentsGetAllForObjectResponse.md)
 - [AttachmentsGetAttachmentRecordResponse](docs/AttachmentsGetAttachmentRecordResponse.md)
 - [AttachmentsUploadAttachmentResponse](docs/AttachmentsUploadAttachmentResponse.md)
 - [AuditLogApiGetAuditLogEventsResponse](docs/AuditLogApiGetAuditLogEventsResponse.md)
 - [AuditLogEvent](docs/AuditLogEvent.md)
 - [AuditLogEventActor](docs/AuditLogEventActor.md)
 - [AuditLogEventContext](docs/AuditLogEventContext.md)
 - [AuditLogEventResource](docs/AuditLogEventResource.md)
 - [BatchApiSubmitParallelRequestsRequest](docs/BatchApiSubmitParallelRequestsRequest.md)
 - [BatchApiSubmitParallelRequestsResponse](docs/BatchApiSubmitParallelRequestsResponse.md)
 - [BatchRequest](docs/BatchRequest.md)
 - [BatchRequestAction](docs/BatchRequestAction.md)
 - [BatchRequestActionOptions](docs/BatchRequestActionOptions.md)
 - [BatchResponse](docs/BatchResponse.md)
 - [CreateMembershipRequest](docs/CreateMembershipRequest.md)
 - [CreateMembershipRequestAllOf](docs/CreateMembershipRequestAllOf.md)
 - [CreateTimeTrackingEntryRequest](docs/CreateTimeTrackingEntryRequest.md)
 - [CustomFieldBase](docs/CustomFieldBase.md)
 - [CustomFieldBaseAllOf](docs/CustomFieldBaseAllOf.md)
 - [CustomFieldCompact](docs/CustomFieldCompact.md)
 - [CustomFieldCompactAllOf](docs/CustomFieldCompactAllOf.md)
 - [CustomFieldCompactAllOfDateValue](docs/CustomFieldCompactAllOfDateValue.md)
 - [CustomFieldRequest](docs/CustomFieldRequest.md)
 - [CustomFieldRequestAllOf](docs/CustomFieldRequestAllOf.md)
 - [CustomFieldResponse](docs/CustomFieldResponse.md)
 - [CustomFieldResponseAllOf](docs/CustomFieldResponseAllOf.md)
 - [CustomFieldSettingCompact](docs/CustomFieldSettingCompact.md)
 - [CustomFieldSettingResponse](docs/CustomFieldSettingResponse.md)
 - [CustomFieldSettingResponseAllOf](docs/CustomFieldSettingResponseAllOf.md)
 - [CustomFieldSettingsGetPortfolioCustomFieldSettingsResponse](docs/CustomFieldSettingsGetPortfolioCustomFieldSettingsResponse.md)
 - [CustomFieldSettingsGetProjectCustomFieldSettingsResponse](docs/CustomFieldSettingsGetProjectCustomFieldSettingsResponse.md)
 - [CustomFieldsAddEnumOptionRequest](docs/CustomFieldsAddEnumOptionRequest.md)
 - [CustomFieldsAddEnumOptionResponse](docs/CustomFieldsAddEnumOptionResponse.md)
 - [CustomFieldsCreateNewFieldRecordRequest](docs/CustomFieldsCreateNewFieldRecordRequest.md)
 - [CustomFieldsCreateNewFieldRecordResponse](docs/CustomFieldsCreateNewFieldRecordResponse.md)
 - [CustomFieldsDeleteFieldRecordResponse](docs/CustomFieldsDeleteFieldRecordResponse.md)
 - [CustomFieldsGetMetadataResponse](docs/CustomFieldsGetMetadataResponse.md)
 - [CustomFieldsListWorkspaceCustomFieldsResponse](docs/CustomFieldsListWorkspaceCustomFieldsResponse.md)
 - [CustomFieldsReorderEnumOptionRequest](docs/CustomFieldsReorderEnumOptionRequest.md)
 - [CustomFieldsReorderEnumOptionResponse](docs/CustomFieldsReorderEnumOptionResponse.md)
 - [CustomFieldsUpdateEnumOptionRequest](docs/CustomFieldsUpdateEnumOptionRequest.md)
 - [CustomFieldsUpdateEnumOptionResponse](docs/CustomFieldsUpdateEnumOptionResponse.md)
 - [CustomFieldsUpdateFieldRecordRequest](docs/CustomFieldsUpdateFieldRecordRequest.md)
 - [CustomFieldsUpdateFieldRecordResponse](docs/CustomFieldsUpdateFieldRecordResponse.md)
 - [DateVariableCompact](docs/DateVariableCompact.md)
 - [DateVariableRequest](docs/DateVariableRequest.md)
 - [EnumOption](docs/EnumOption.md)
 - [EnumOptionAllOf](docs/EnumOptionAllOf.md)
 - [EnumOptionInsertRequest](docs/EnumOptionInsertRequest.md)
 - [EnumOptionRequest](docs/EnumOptionRequest.md)
 - [EnumOptionRequestAllOf](docs/EnumOptionRequestAllOf.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [EventResponse](docs/EventResponse.md)
 - [EventResponseChange](docs/EventResponseChange.md)
 - [EventResponseParent](docs/EventResponseParent.md)
 - [EventResponseResource](docs/EventResponseResource.md)
 - [EventResponseUser](docs/EventResponseUser.md)
 - [EventsGetResourceEventsResponse](docs/EventsGetResourceEventsResponse.md)
 - [GoalAddSubgoalRequest](docs/GoalAddSubgoalRequest.md)
 - [GoalAddSupportingRelationshipRequest](docs/GoalAddSupportingRelationshipRequest.md)
 - [GoalAddSupportingWorkRequest](docs/GoalAddSupportingWorkRequest.md)
 - [GoalBase](docs/GoalBase.md)
 - [GoalBaseAllOf](docs/GoalBaseAllOf.md)
 - [GoalCompact](docs/GoalCompact.md)
 - [GoalCompactAllOf](docs/GoalCompactAllOf.md)
 - [GoalMembershipBase](docs/GoalMembershipBase.md)
 - [GoalMembershipBaseAllOf](docs/GoalMembershipBaseAllOf.md)
 - [GoalMembershipCompact](docs/GoalMembershipCompact.md)
 - [GoalMembershipCompactAllOf](docs/GoalMembershipCompactAllOf.md)
 - [GoalMembershipResponse](docs/GoalMembershipResponse.md)
 - [GoalMembershipResponseAllOf](docs/GoalMembershipResponseAllOf.md)
 - [GoalMetricBase](docs/GoalMetricBase.md)
 - [GoalMetricBaseAllOf](docs/GoalMetricBaseAllOf.md)
 - [GoalMetricCurrentValueRequest](docs/GoalMetricCurrentValueRequest.md)
 - [GoalMetricCurrentValueRequestAllOf](docs/GoalMetricCurrentValueRequestAllOf.md)
 - [GoalRelationshipBase](docs/GoalRelationshipBase.md)
 - [GoalRelationshipBaseAllOf](docs/GoalRelationshipBaseAllOf.md)
 - [GoalRelationshipCompact](docs/GoalRelationshipCompact.md)
 - [GoalRelationshipCompactAllOf](docs/GoalRelationshipCompactAllOf.md)
 - [GoalRelationshipRequest](docs/GoalRelationshipRequest.md)
 - [GoalRelationshipResponse](docs/GoalRelationshipResponse.md)
 - [GoalRelationshipsCreateSupportingRelationshipRequest](docs/GoalRelationshipsCreateSupportingRelationshipRequest.md)
 - [GoalRelationshipsCreateSupportingRelationshipResponse](docs/GoalRelationshipsCreateSupportingRelationshipResponse.md)
 - [GoalRelationshipsGetCompactRecordsResponse](docs/GoalRelationshipsGetCompactRecordsResponse.md)
 - [GoalRelationshipsGetRecordByIdResponse](docs/GoalRelationshipsGetRecordByIdResponse.md)
 - [GoalRelationshipsRemoveSupportingRelationshipRequest](docs/GoalRelationshipsRemoveSupportingRelationshipRequest.md)
 - [GoalRelationshipsRemoveSupportingRelationshipResponse](docs/GoalRelationshipsRemoveSupportingRelationshipResponse.md)
 - [GoalRelationshipsUpdateGoalRelationshipRecordRequest](docs/GoalRelationshipsUpdateGoalRelationshipRecordRequest.md)
 - [GoalRelationshipsUpdateGoalRelationshipRecordResponse](docs/GoalRelationshipsUpdateGoalRelationshipRecordResponse.md)
 - [GoalRemoveSubgoalRequest](docs/GoalRemoveSubgoalRequest.md)
 - [GoalRemoveSupportingRelationshipRequest](docs/GoalRemoveSupportingRelationshipRequest.md)
 - [GoalRequest](docs/GoalRequest.md)
 - [GoalRequestAllOf](docs/GoalRequestAllOf.md)
 - [GoalRequestBase](docs/GoalRequestBase.md)
 - [GoalRequestBaseAllOf](docs/GoalRequestBaseAllOf.md)
 - [GoalResponse](docs/GoalResponse.md)
 - [GoalResponseAllOf](docs/GoalResponseAllOf.md)
 - [GoalUpdateRequest](docs/GoalUpdateRequest.md)
 - [GoalUpdateRequestAllOf](docs/GoalUpdateRequestAllOf.md)
 - [GoalsAddCollaboratorsToGoalRequest](docs/GoalsAddCollaboratorsToGoalRequest.md)
 - [GoalsAddCollaboratorsToGoalResponse](docs/GoalsAddCollaboratorsToGoalResponse.md)
 - [GoalsCreateMetricRequest](docs/GoalsCreateMetricRequest.md)
 - [GoalsCreateMetricResponse](docs/GoalsCreateMetricResponse.md)
 - [GoalsCreateNewGoalRecordRequest](docs/GoalsCreateNewGoalRecordRequest.md)
 - [GoalsCreateNewGoalRecordResponse](docs/GoalsCreateNewGoalRecordResponse.md)
 - [GoalsDeleteRecordResponse](docs/GoalsDeleteRecordResponse.md)
 - [GoalsGetCompactRecordsResponse](docs/GoalsGetCompactRecordsResponse.md)
 - [GoalsGetGoalRecordResponse](docs/GoalsGetGoalRecordResponse.md)
 - [GoalsGetParentGoalsResponse](docs/GoalsGetParentGoalsResponse.md)
 - [GoalsRemoveFollowersFromGoalRequest](docs/GoalsRemoveFollowersFromGoalRequest.md)
 - [GoalsRemoveFollowersFromGoalResponse](docs/GoalsRemoveFollowersFromGoalResponse.md)
 - [GoalsUpdateGoalRecordRequest](docs/GoalsUpdateGoalRecordRequest.md)
 - [GoalsUpdateGoalRecordResponse](docs/GoalsUpdateGoalRecordResponse.md)
 - [GoalsUpdateMetricCurrentValueRequest](docs/GoalsUpdateMetricCurrentValueRequest.md)
 - [GoalsUpdateMetricCurrentValueResponse](docs/GoalsUpdateMetricCurrentValueResponse.md)
 - [JobCompact](docs/JobCompact.md)
 - [JobCompactAllOf](docs/JobCompactAllOf.md)
 - [JobsGetByIdResponse](docs/JobsGetByIdResponse.md)
 - [Like](docs/Like.md)
 - [MemberCompact](docs/MemberCompact.md)
 - [MemberCompactAllOf](docs/MemberCompactAllOf.md)
 - [MembershipRequest](docs/MembershipRequest.md)
 - [MembershipUpdateRequest](docs/MembershipUpdateRequest.md)
 - [MembershipsCreateNewRecordRequest](docs/MembershipsCreateNewRecordRequest.md)
 - [MembershipsCreateNewRecordResponse](docs/MembershipsCreateNewRecordResponse.md)
 - [MembershipsDeleteRecordResponse](docs/MembershipsDeleteRecordResponse.md)
 - [MembershipsGetMembershipRecordResponse](docs/MembershipsGetMembershipRecordResponse.md)
 - [MembershipsGetMultipleResponse](docs/MembershipsGetMultipleResponse.md)
 - [ModifyDependenciesRequest](docs/ModifyDependenciesRequest.md)
 - [ModifyDependentsRequest](docs/ModifyDependentsRequest.md)
 - [NextPage](docs/NextPage.md)
 - [OrganizationExportCompact](docs/OrganizationExportCompact.md)
 - [OrganizationExportCompactAllOf](docs/OrganizationExportCompactAllOf.md)
 - [OrganizationExportRequest](docs/OrganizationExportRequest.md)
 - [OrganizationExportsCreateExportRequestRequest](docs/OrganizationExportsCreateExportRequestRequest.md)
 - [OrganizationExportsCreateExportRequestResponse](docs/OrganizationExportsCreateExportRequestResponse.md)
 - [OrganizationExportsGetExportDetailsResponse](docs/OrganizationExportsGetExportDetailsResponse.md)
 - [PortfolioAddItemRequest](docs/PortfolioAddItemRequest.md)
 - [PortfolioBase](docs/PortfolioBase.md)
 - [PortfolioBaseAllOf](docs/PortfolioBaseAllOf.md)
 - [PortfolioCompact](docs/PortfolioCompact.md)
 - [PortfolioCompactAllOf](docs/PortfolioCompactAllOf.md)
 - [PortfolioMembershipCompact](docs/PortfolioMembershipCompact.md)
 - [PortfolioMembershipCompactAllOf](docs/PortfolioMembershipCompactAllOf.md)
 - [PortfolioMembershipsGetCompactResponse](docs/PortfolioMembershipsGetCompactResponse.md)
 - [PortfolioMembershipsGetCompleteRecordResponse](docs/PortfolioMembershipsGetCompleteRecordResponse.md)
 - [PortfolioMembershipsListMultipleMembershipsResponse](docs/PortfolioMembershipsListMultipleMembershipsResponse.md)
 - [PortfolioRemoveItemRequest](docs/PortfolioRemoveItemRequest.md)
 - [PortfolioRequest](docs/PortfolioRequest.md)
 - [PortfolioRequestAllOf](docs/PortfolioRequestAllOf.md)
 - [PortfolioResponse](docs/PortfolioResponse.md)
 - [PortfolioResponseAllOf](docs/PortfolioResponseAllOf.md)
 - [PortfoliosAddCustomFieldSettingRequest](docs/PortfoliosAddCustomFieldSettingRequest.md)
 - [PortfoliosAddCustomFieldSettingResponse](docs/PortfoliosAddCustomFieldSettingResponse.md)
 - [PortfoliosAddMembersToPortfolioRequest](docs/PortfoliosAddMembersToPortfolioRequest.md)
 - [PortfoliosAddMembersToPortfolioResponse](docs/PortfoliosAddMembersToPortfolioResponse.md)
 - [PortfoliosAddPortfolioItemRequest](docs/PortfoliosAddPortfolioItemRequest.md)
 - [PortfoliosAddPortfolioItemResponse](docs/PortfoliosAddPortfolioItemResponse.md)
 - [PortfoliosCreateNewPortfolioRecordRequest](docs/PortfoliosCreateNewPortfolioRecordRequest.md)
 - [PortfoliosCreateNewPortfolioRecordResponse](docs/PortfoliosCreateNewPortfolioRecordResponse.md)
 - [PortfoliosDeleteRecordResponse](docs/PortfoliosDeleteRecordResponse.md)
 - [PortfoliosGetItemsResponse](docs/PortfoliosGetItemsResponse.md)
 - [PortfoliosGetRecordResponse](docs/PortfoliosGetRecordResponse.md)
 - [PortfoliosListMultiplePortfoliosResponse](docs/PortfoliosListMultiplePortfoliosResponse.md)
 - [PortfoliosRemoveCustomFieldSettingRequest](docs/PortfoliosRemoveCustomFieldSettingRequest.md)
 - [PortfoliosRemoveCustomFieldSettingResponse](docs/PortfoliosRemoveCustomFieldSettingResponse.md)
 - [PortfoliosRemoveItemFromPortfolioRequest](docs/PortfoliosRemoveItemFromPortfolioRequest.md)
 - [PortfoliosRemoveItemFromPortfolioResponse](docs/PortfoliosRemoveItemFromPortfolioResponse.md)
 - [PortfoliosRemoveMembersFromPortfolioRequest](docs/PortfoliosRemoveMembersFromPortfolioRequest.md)
 - [PortfoliosRemoveMembersFromPortfolioResponse](docs/PortfoliosRemoveMembersFromPortfolioResponse.md)
 - [PortfoliosUpdatePortfolioRecordRequest](docs/PortfoliosUpdatePortfolioRecordRequest.md)
 - [PortfoliosUpdatePortfolioRecordResponse](docs/PortfoliosUpdatePortfolioRecordResponse.md)
 - [Preview](docs/Preview.md)
 - [ProjectBase](docs/ProjectBase.md)
 - [ProjectBaseAllOf](docs/ProjectBaseAllOf.md)
 - [ProjectBriefBase](docs/ProjectBriefBase.md)
 - [ProjectBriefBaseAllOf](docs/ProjectBriefBaseAllOf.md)
 - [ProjectBriefCompact](docs/ProjectBriefCompact.md)
 - [ProjectBriefRequest](docs/ProjectBriefRequest.md)
 - [ProjectBriefRequestAllOf](docs/ProjectBriefRequestAllOf.md)
 - [ProjectBriefResponse](docs/ProjectBriefResponse.md)
 - [ProjectBriefResponseAllOf](docs/ProjectBriefResponseAllOf.md)
 - [ProjectBriefsCreateNewRecordRequest](docs/ProjectBriefsCreateNewRecordRequest.md)
 - [ProjectBriefsCreateNewRecordResponse](docs/ProjectBriefsCreateNewRecordResponse.md)
 - [ProjectBriefsGetFullRecordResponse](docs/ProjectBriefsGetFullRecordResponse.md)
 - [ProjectBriefsRemoveBriefResponse](docs/ProjectBriefsRemoveBriefResponse.md)
 - [ProjectBriefsUpdateBriefRecordRequest](docs/ProjectBriefsUpdateBriefRecordRequest.md)
 - [ProjectBriefsUpdateBriefRecordResponse](docs/ProjectBriefsUpdateBriefRecordResponse.md)
 - [ProjectCompact](docs/ProjectCompact.md)
 - [ProjectCompactAllOf](docs/ProjectCompactAllOf.md)
 - [ProjectDuplicateRequest](docs/ProjectDuplicateRequest.md)
 - [ProjectDuplicateRequestScheduleDates](docs/ProjectDuplicateRequestScheduleDates.md)
 - [ProjectMembershipCompact](docs/ProjectMembershipCompact.md)
 - [ProjectMembershipCompactAllOf](docs/ProjectMembershipCompactAllOf.md)
 - [ProjectMembershipCompactResponse](docs/ProjectMembershipCompactResponse.md)
 - [ProjectMembershipCompactResponseAllOf](docs/ProjectMembershipCompactResponseAllOf.md)
 - [ProjectMembershipNormalResponse](docs/ProjectMembershipNormalResponse.md)
 - [ProjectMembershipNormalResponseAllOf](docs/ProjectMembershipNormalResponseAllOf.md)
 - [ProjectMembershipsGetCompactRecordsResponse](docs/ProjectMembershipsGetCompactRecordsResponse.md)
 - [ProjectMembershipsGetRecordResponse](docs/ProjectMembershipsGetRecordResponse.md)
 - [ProjectRequest](docs/ProjectRequest.md)
 - [ProjectRequestAllOf](docs/ProjectRequestAllOf.md)
 - [ProjectResponse](docs/ProjectResponse.md)
 - [ProjectResponseAllOf](docs/ProjectResponseAllOf.md)
 - [ProjectSaveAsTemplateRequest](docs/ProjectSaveAsTemplateRequest.md)
 - [ProjectSectionInsertRequest](docs/ProjectSectionInsertRequest.md)
 - [ProjectStatusBase](docs/ProjectStatusBase.md)
 - [ProjectStatusBaseAllOf](docs/ProjectStatusBaseAllOf.md)
 - [ProjectStatusCompact](docs/ProjectStatusCompact.md)
 - [ProjectStatusCompactAllOf](docs/ProjectStatusCompactAllOf.md)
 - [ProjectStatusResponse](docs/ProjectStatusResponse.md)
 - [ProjectStatusResponseAllOf](docs/ProjectStatusResponseAllOf.md)
 - [ProjectStatusesCreateNewStatusUpdateRecordRequest](docs/ProjectStatusesCreateNewStatusUpdateRecordRequest.md)
 - [ProjectStatusesCreateNewStatusUpdateRecordResponse](docs/ProjectStatusesCreateNewStatusUpdateRecordResponse.md)
 - [ProjectStatusesDeleteSpecificStatusUpdateResponse](docs/ProjectStatusesDeleteSpecificStatusUpdateResponse.md)
 - [ProjectStatusesGetProjectUpdatesResponse](docs/ProjectStatusesGetProjectUpdatesResponse.md)
 - [ProjectStatusesGetStatusUpdateRecordResponse](docs/ProjectStatusesGetStatusUpdateRecordResponse.md)
 - [ProjectTemplateBase](docs/ProjectTemplateBase.md)
 - [ProjectTemplateBaseAllOf](docs/ProjectTemplateBaseAllOf.md)
 - [ProjectTemplateCompact](docs/ProjectTemplateCompact.md)
 - [ProjectTemplateCompactAllOf](docs/ProjectTemplateCompactAllOf.md)
 - [ProjectTemplateInstantiateProjectRequest](docs/ProjectTemplateInstantiateProjectRequest.md)
 - [ProjectTemplatesDeleteTemplateRecordResponse](docs/ProjectTemplatesDeleteTemplateRecordResponse.md)
 - [ProjectTemplatesGetAllTemplateRecordsResponse](docs/ProjectTemplatesGetAllTemplateRecordsResponse.md)
 - [ProjectTemplatesGetRecordResponse](docs/ProjectTemplatesGetRecordResponse.md)
 - [ProjectTemplatesInstantiateProjectJobRequest](docs/ProjectTemplatesInstantiateProjectJobRequest.md)
 - [ProjectTemplatesInstantiateProjectJobResponse](docs/ProjectTemplatesInstantiateProjectJobResponse.md)
 - [ProjectTemplatesListMultipleResponse](docs/ProjectTemplatesListMultipleResponse.md)
 - [ProjectUpdateRequest](docs/ProjectUpdateRequest.md)
 - [ProjectUpdateRequestAllOf](docs/ProjectUpdateRequestAllOf.md)
 - [ProjectsAddCustomFieldSettingRequest](docs/ProjectsAddCustomFieldSettingRequest.md)
 - [ProjectsAddCustomFieldSettingResponse](docs/ProjectsAddCustomFieldSettingResponse.md)
 - [ProjectsAddFollowersToProjectRequest](docs/ProjectsAddFollowersToProjectRequest.md)
 - [ProjectsAddFollowersToProjectResponse](docs/ProjectsAddFollowersToProjectResponse.md)
 - [ProjectsAddMembersToProjectRequest](docs/ProjectsAddMembersToProjectRequest.md)
 - [ProjectsAddMembersToProjectResponse](docs/ProjectsAddMembersToProjectResponse.md)
 - [ProjectsCreateInWorkspaceRequest](docs/ProjectsCreateInWorkspaceRequest.md)
 - [ProjectsCreateInWorkspaceResponse](docs/ProjectsCreateInWorkspaceResponse.md)
 - [ProjectsCreateNewProjectRecordRequest](docs/ProjectsCreateNewProjectRecordRequest.md)
 - [ProjectsCreateNewProjectRecordResponse](docs/ProjectsCreateNewProjectRecordResponse.md)
 - [ProjectsCreateProjectForTeamRequest](docs/ProjectsCreateProjectForTeamRequest.md)
 - [ProjectsCreateProjectForTeamResponse](docs/ProjectsCreateProjectForTeamResponse.md)
 - [ProjectsCreateProjectTemplateJobRequest](docs/ProjectsCreateProjectTemplateJobRequest.md)
 - [ProjectsCreateProjectTemplateJobResponse](docs/ProjectsCreateProjectTemplateJobResponse.md)
 - [ProjectsDeleteProjectByIdResponse](docs/ProjectsDeleteProjectByIdResponse.md)
 - [ProjectsDuplicateProjectJobRequest](docs/ProjectsDuplicateProjectJobRequest.md)
 - [ProjectsDuplicateProjectJobResponse](docs/ProjectsDuplicateProjectJobResponse.md)
 - [ProjectsGetAllInWorkspaceResponse](docs/ProjectsGetAllInWorkspaceResponse.md)
 - [ProjectsGetProjectRecordResponse](docs/ProjectsGetProjectRecordResponse.md)
 - [ProjectsGetTaskCountsResponse](docs/ProjectsGetTaskCountsResponse.md)
 - [ProjectsGetTeamProjectsResponse](docs/ProjectsGetTeamProjectsResponse.md)
 - [ProjectsListMultipleResponse](docs/ProjectsListMultipleResponse.md)
 - [ProjectsRemoveCustomFieldRequest](docs/ProjectsRemoveCustomFieldRequest.md)
 - [ProjectsRemoveCustomFieldResponse](docs/ProjectsRemoveCustomFieldResponse.md)
 - [ProjectsRemoveMembersFromProjectRequest](docs/ProjectsRemoveMembersFromProjectRequest.md)
 - [ProjectsRemoveMembersFromProjectResponse](docs/ProjectsRemoveMembersFromProjectResponse.md)
 - [ProjectsRemoveProjectFollowersRequest](docs/ProjectsRemoveProjectFollowersRequest.md)
 - [ProjectsRemoveProjectFollowersResponse](docs/ProjectsRemoveProjectFollowersResponse.md)
 - [ProjectsTaskProjectsListResponse](docs/ProjectsTaskProjectsListResponse.md)
 - [ProjectsUpdateProjectRecordRequest](docs/ProjectsUpdateProjectRecordRequest.md)
 - [ProjectsUpdateProjectRecordResponse](docs/ProjectsUpdateProjectRecordResponse.md)
 - [RemoveCustomFieldSettingRequest](docs/RemoveCustomFieldSettingRequest.md)
 - [RemoveFollowersRequest](docs/RemoveFollowersRequest.md)
 - [RemoveMembersRequest](docs/RemoveMembersRequest.md)
 - [RequestedRoleRequest](docs/RequestedRoleRequest.md)
 - [RuleTriggerRequest](docs/RuleTriggerRequest.md)
 - [RuleTriggerResponse](docs/RuleTriggerResponse.md)
 - [RulesTriggerRuleRequestRequest](docs/RulesTriggerRuleRequestRequest.md)
 - [RulesTriggerRuleRequestResponse](docs/RulesTriggerRuleRequestResponse.md)
 - [SectionCompact](docs/SectionCompact.md)
 - [SectionCompactAllOf](docs/SectionCompactAllOf.md)
 - [SectionRequest](docs/SectionRequest.md)
 - [SectionResponse](docs/SectionResponse.md)
 - [SectionResponseAllOf](docs/SectionResponseAllOf.md)
 - [SectionTaskInsertRequest](docs/SectionTaskInsertRequest.md)
 - [SectionsAddTaskToSectionRequest](docs/SectionsAddTaskToSectionRequest.md)
 - [SectionsAddTaskToSectionResponse](docs/SectionsAddTaskToSectionResponse.md)
 - [SectionsCreateNewSectionRequest](docs/SectionsCreateNewSectionRequest.md)
 - [SectionsCreateNewSectionResponse](docs/SectionsCreateNewSectionResponse.md)
 - [SectionsDeleteSectionResponse](docs/SectionsDeleteSectionResponse.md)
 - [SectionsGetRecordResponse](docs/SectionsGetRecordResponse.md)
 - [SectionsListProjectSectionsResponse](docs/SectionsListProjectSectionsResponse.md)
 - [SectionsMoveOrInsertRequest](docs/SectionsMoveOrInsertRequest.md)
 - [SectionsMoveOrInsertResponse](docs/SectionsMoveOrInsertResponse.md)
 - [SectionsUpdateSectionRecordRequest](docs/SectionsUpdateSectionRecordRequest.md)
 - [SectionsUpdateSectionRecordResponse](docs/SectionsUpdateSectionRecordResponse.md)
 - [StatusUpdateBase](docs/StatusUpdateBase.md)
 - [StatusUpdateBaseAllOf](docs/StatusUpdateBaseAllOf.md)
 - [StatusUpdateCompact](docs/StatusUpdateCompact.md)
 - [StatusUpdateCompactAllOf](docs/StatusUpdateCompactAllOf.md)
 - [StatusUpdateRequest](docs/StatusUpdateRequest.md)
 - [StatusUpdateRequestAllOf](docs/StatusUpdateRequestAllOf.md)
 - [StatusUpdateResponse](docs/StatusUpdateResponse.md)
 - [StatusUpdateResponseAllOf](docs/StatusUpdateResponseAllOf.md)
 - [StatusUpdatesCreateNewStatusUpdateRecordRequest](docs/StatusUpdatesCreateNewStatusUpdateRecordRequest.md)
 - [StatusUpdatesCreateNewStatusUpdateRecordResponse](docs/StatusUpdatesCreateNewStatusUpdateRecordResponse.md)
 - [StatusUpdatesDeleteSpecificStatusUpdateResponse](docs/StatusUpdatesDeleteSpecificStatusUpdateResponse.md)
 - [StatusUpdatesGetCompactRecordsResponse](docs/StatusUpdatesGetCompactRecordsResponse.md)
 - [StatusUpdatesGetRecordByIdResponse](docs/StatusUpdatesGetRecordByIdResponse.md)
 - [StoriesCreateCommentRequest](docs/StoriesCreateCommentRequest.md)
 - [StoriesCreateCommentResponse](docs/StoriesCreateCommentResponse.md)
 - [StoriesDeleteStoryRecordResponse](docs/StoriesDeleteStoryRecordResponse.md)
 - [StoriesGetFullRecordResponse](docs/StoriesGetFullRecordResponse.md)
 - [StoriesGetTaskStoriesResponse](docs/StoriesGetTaskStoriesResponse.md)
 - [StoriesUpdateFullRecordRequest](docs/StoriesUpdateFullRecordRequest.md)
 - [StoriesUpdateFullRecordResponse](docs/StoriesUpdateFullRecordResponse.md)
 - [StoryBase](docs/StoryBase.md)
 - [StoryBaseAllOf](docs/StoryBaseAllOf.md)
 - [StoryCompact](docs/StoryCompact.md)
 - [StoryCompactAllOf](docs/StoryCompactAllOf.md)
 - [StoryResponse](docs/StoryResponse.md)
 - [StoryResponseAllOf](docs/StoryResponseAllOf.md)
 - [StoryResponseDates](docs/StoryResponseDates.md)
 - [TagBase](docs/TagBase.md)
 - [TagBaseAllOf](docs/TagBaseAllOf.md)
 - [TagCompact](docs/TagCompact.md)
 - [TagCompactAllOf](docs/TagCompactAllOf.md)
 - [TagCreateTagForWorkspaceRequest](docs/TagCreateTagForWorkspaceRequest.md)
 - [TagCreateTagForWorkspaceRequestAllOf](docs/TagCreateTagForWorkspaceRequestAllOf.md)
 - [TagRequest](docs/TagRequest.md)
 - [TagRequestAllOf](docs/TagRequestAllOf.md)
 - [TagResponse](docs/TagResponse.md)
 - [TagResponseAllOf](docs/TagResponseAllOf.md)
 - [TagsCreateNewTagRecordRequest](docs/TagsCreateNewTagRecordRequest.md)
 - [TagsCreateNewTagRecordResponse](docs/TagsCreateNewTagRecordResponse.md)
 - [TagsCreateTagInWorkspaceRequest](docs/TagsCreateTagInWorkspaceRequest.md)
 - [TagsCreateTagInWorkspaceResponse](docs/TagsCreateTagInWorkspaceResponse.md)
 - [TagsGetFilteredTagsResponse](docs/TagsGetFilteredTagsResponse.md)
 - [TagsGetRecordResponse](docs/TagsGetRecordResponse.md)
 - [TagsGetTaskTagsResponse](docs/TagsGetTaskTagsResponse.md)
 - [TagsListFilteredTagsResponse](docs/TagsListFilteredTagsResponse.md)
 - [TagsRemoveTagResponse](docs/TagsRemoveTagResponse.md)
 - [TagsUpdateTagRecordResponse](docs/TagsUpdateTagRecordResponse.md)
 - [TaskAddFollowersRequest](docs/TaskAddFollowersRequest.md)
 - [TaskAddProjectRequest](docs/TaskAddProjectRequest.md)
 - [TaskAddTagRequest](docs/TaskAddTagRequest.md)
 - [TaskBase](docs/TaskBase.md)
 - [TaskBaseAllOf](docs/TaskBaseAllOf.md)
 - [TaskBaseAllOfExternal](docs/TaskBaseAllOfExternal.md)
 - [TaskBaseAllOfMemberships](docs/TaskBaseAllOfMemberships.md)
 - [TaskCompact](docs/TaskCompact.md)
 - [TaskCompactAllOf](docs/TaskCompactAllOf.md)
 - [TaskCompactAllOfCreatedBy](docs/TaskCompactAllOfCreatedBy.md)
 - [TaskCountResponse](docs/TaskCountResponse.md)
 - [TaskDuplicateRequest](docs/TaskDuplicateRequest.md)
 - [TaskRemoveFollowersRequest](docs/TaskRemoveFollowersRequest.md)
 - [TaskRemoveProjectRequest](docs/TaskRemoveProjectRequest.md)
 - [TaskRemoveTagRequest](docs/TaskRemoveTagRequest.md)
 - [TaskRequest](docs/TaskRequest.md)
 - [TaskRequestAllOf](docs/TaskRequestAllOf.md)
 - [TaskResponse](docs/TaskResponse.md)
 - [TaskResponseAllOf](docs/TaskResponseAllOf.md)
 - [TaskSetParentRequest](docs/TaskSetParentRequest.md)
 - [TaskTemplateCompact](docs/TaskTemplateCompact.md)
 - [TaskTemplateCompactAllOf](docs/TaskTemplateCompactAllOf.md)
 - [TaskTemplateInstantiateTaskRequest](docs/TaskTemplateInstantiateTaskRequest.md)
 - [TaskTemplateRecipe](docs/TaskTemplateRecipe.md)
 - [TaskTemplateRecipeAllOf](docs/TaskTemplateRecipeAllOf.md)
 - [TaskTemplateRecipeCompact](docs/TaskTemplateRecipeCompact.md)
 - [TaskTemplateRecipeCompactAllOf](docs/TaskTemplateRecipeCompactAllOf.md)
 - [TaskTemplateResponse](docs/TaskTemplateResponse.md)
 - [TaskTemplateResponseAllOf](docs/TaskTemplateResponseAllOf.md)
 - [TaskTemplatesDeleteTaskTemplateResponse](docs/TaskTemplatesDeleteTaskTemplateResponse.md)
 - [TaskTemplatesGetSingleTemplateResponse](docs/TaskTemplatesGetSingleTemplateResponse.md)
 - [TaskTemplatesInstantiateTaskJobRequest](docs/TaskTemplatesInstantiateTaskJobRequest.md)
 - [TaskTemplatesInstantiateTaskJobResponse](docs/TaskTemplatesInstantiateTaskJobResponse.md)
 - [TaskTemplatesListMultipleResponse](docs/TaskTemplatesListMultipleResponse.md)
 - [TasksAddFollowersToTaskRequest](docs/TasksAddFollowersToTaskRequest.md)
 - [TasksAddFollowersToTaskResponse](docs/TasksAddFollowersToTaskResponse.md)
 - [TasksAddProjectToTaskRequest](docs/TasksAddProjectToTaskRequest.md)
 - [TasksAddProjectToTaskResponse](docs/TasksAddProjectToTaskResponse.md)
 - [TasksAddTagToTaskRequest](docs/TasksAddTagToTaskRequest.md)
 - [TasksAddTagToTaskResponse](docs/TasksAddTagToTaskResponse.md)
 - [TasksCreateNewTaskRequest](docs/TasksCreateNewTaskRequest.md)
 - [TasksCreateNewTaskResponse](docs/TasksCreateNewTaskResponse.md)
 - [TasksCreateSubtaskRecordRequest](docs/TasksCreateSubtaskRecordRequest.md)
 - [TasksCreateSubtaskRecordResponse](docs/TasksCreateSubtaskRecordResponse.md)
 - [TasksDeleteTaskResponse](docs/TasksDeleteTaskResponse.md)
 - [TasksDuplicateTaskJobRequest](docs/TasksDuplicateTaskJobRequest.md)
 - [TasksDuplicateTaskJobResponse](docs/TasksDuplicateTaskJobResponse.md)
 - [TasksGetAllDependenciesResponse](docs/TasksGetAllDependenciesResponse.md)
 - [TasksGetByCustomIdResponse](docs/TasksGetByCustomIdResponse.md)
 - [TasksGetDependentsResponse](docs/TasksGetDependentsResponse.md)
 - [TasksGetMultipleResponse](docs/TasksGetMultipleResponse.md)
 - [TasksGetMultipleWithTagResponse](docs/TasksGetMultipleWithTagResponse.md)
 - [TasksGetSectionTasksResponse](docs/TasksGetSectionTasksResponse.md)
 - [TasksGetSubtaskListResponse](docs/TasksGetSubtaskListResponse.md)
 - [TasksGetTaskRecordResponse](docs/TasksGetTaskRecordResponse.md)
 - [TasksGetTasksByProjectResponse](docs/TasksGetTasksByProjectResponse.md)
 - [TasksGetUserTaskListTasksResponse](docs/TasksGetUserTaskListTasksResponse.md)
 - [TasksRemoveFollowersFromTaskRequest](docs/TasksRemoveFollowersFromTaskRequest.md)
 - [TasksRemoveFollowersFromTaskResponse](docs/TasksRemoveFollowersFromTaskResponse.md)
 - [TasksRemoveProjectFromTaskRequest](docs/TasksRemoveProjectFromTaskRequest.md)
 - [TasksRemoveProjectFromTaskResponse](docs/TasksRemoveProjectFromTaskResponse.md)
 - [TasksRemoveTagFromTaskRequest](docs/TasksRemoveTagFromTaskRequest.md)
 - [TasksRemoveTagFromTaskResponse](docs/TasksRemoveTagFromTaskResponse.md)
 - [TasksSearchInWorkspaceResponse](docs/TasksSearchInWorkspaceResponse.md)
 - [TasksSetDependenciesForTaskRequest](docs/TasksSetDependenciesForTaskRequest.md)
 - [TasksSetDependenciesForTaskResponse](docs/TasksSetDependenciesForTaskResponse.md)
 - [TasksSetParentTaskRequest](docs/TasksSetParentTaskRequest.md)
 - [TasksSetParentTaskResponse](docs/TasksSetParentTaskResponse.md)
 - [TasksSetTaskDependentsRequest](docs/TasksSetTaskDependentsRequest.md)
 - [TasksSetTaskDependentsResponse](docs/TasksSetTaskDependentsResponse.md)
 - [TasksUnlinkDependenciesFromTaskRequest](docs/TasksUnlinkDependenciesFromTaskRequest.md)
 - [TasksUnlinkDependenciesFromTaskResponse](docs/TasksUnlinkDependenciesFromTaskResponse.md)
 - [TasksUnlinkDependentsRequest](docs/TasksUnlinkDependentsRequest.md)
 - [TasksUnlinkDependentsResponse](docs/TasksUnlinkDependentsResponse.md)
 - [TasksUpdateTaskRecordRequest](docs/TasksUpdateTaskRecordRequest.md)
 - [TasksUpdateTaskRecordResponse](docs/TasksUpdateTaskRecordResponse.md)
 - [TeamAddUserRequest](docs/TeamAddUserRequest.md)
 - [TeamCompact](docs/TeamCompact.md)
 - [TeamCompactAllOf](docs/TeamCompactAllOf.md)
 - [TeamMembershipCompact](docs/TeamMembershipCompact.md)
 - [TeamMembershipCompactAllOf](docs/TeamMembershipCompactAllOf.md)
 - [TeamMembershipsGetCompactRecordsResponse](docs/TeamMembershipsGetCompactRecordsResponse.md)
 - [TeamMembershipsGetCompactResponse](docs/TeamMembershipsGetCompactResponse.md)
 - [TeamMembershipsGetRecordByIdResponse](docs/TeamMembershipsGetRecordByIdResponse.md)
 - [TeamMembershipsGetUserCompactResponse](docs/TeamMembershipsGetUserCompactResponse.md)
 - [TeamRemoveUserRequest](docs/TeamRemoveUserRequest.md)
 - [TeamRequest](docs/TeamRequest.md)
 - [TeamRequestAllOf](docs/TeamRequestAllOf.md)
 - [TeamResponse](docs/TeamResponse.md)
 - [TeamResponseAllOf](docs/TeamResponseAllOf.md)
 - [TeamsAddUserToTeamRequest](docs/TeamsAddUserToTeamRequest.md)
 - [TeamsAddUserToTeamResponse](docs/TeamsAddUserToTeamResponse.md)
 - [TeamsCreateTeamRecordRequest](docs/TeamsCreateTeamRecordRequest.md)
 - [TeamsCreateTeamRecordResponse](docs/TeamsCreateTeamRecordResponse.md)
 - [TeamsGetTeamRecordResponse](docs/TeamsGetTeamRecordResponse.md)
 - [TeamsGetUserTeamsResponse](docs/TeamsGetUserTeamsResponse.md)
 - [TeamsListWorkspaceTeamsResponse](docs/TeamsListWorkspaceTeamsResponse.md)
 - [TeamsRemoveUserFromTeamRequest](docs/TeamsRemoveUserFromTeamRequest.md)
 - [TeamsRemoveUserFromTeamResponse](docs/TeamsRemoveUserFromTeamResponse.md)
 - [TeamsUpdateTeamRecordRequest](docs/TeamsUpdateTeamRecordRequest.md)
 - [TeamsUpdateTeamRecordResponse](docs/TeamsUpdateTeamRecordResponse.md)
 - [TemplateRole](docs/TemplateRole.md)
 - [TemplateRoleAllOf](docs/TemplateRoleAllOf.md)
 - [TimePeriodBase](docs/TimePeriodBase.md)
 - [TimePeriodBaseAllOf](docs/TimePeriodBaseAllOf.md)
 - [TimePeriodCompact](docs/TimePeriodCompact.md)
 - [TimePeriodCompactAllOf](docs/TimePeriodCompactAllOf.md)
 - [TimePeriodsGetCompactTimePeriodsResponse](docs/TimePeriodsGetCompactTimePeriodsResponse.md)
 - [TimePeriodsGetFullRecordResponse](docs/TimePeriodsGetFullRecordResponse.md)
 - [TimeTrackingEntriesCreateNewTimeEntryRecordRequest](docs/TimeTrackingEntriesCreateNewTimeEntryRecordRequest.md)
 - [TimeTrackingEntriesCreateNewTimeEntryRecordResponse](docs/TimeTrackingEntriesCreateNewTimeEntryRecordResponse.md)
 - [TimeTrackingEntriesDeleteTimeEntryResponse](docs/TimeTrackingEntriesDeleteTimeEntryResponse.md)
 - [TimeTrackingEntriesGetForTaskResponse](docs/TimeTrackingEntriesGetForTaskResponse.md)
 - [TimeTrackingEntriesGetRecordResponse](docs/TimeTrackingEntriesGetRecordResponse.md)
 - [TimeTrackingEntriesUpdateTimeTrackingEntryRequest](docs/TimeTrackingEntriesUpdateTimeTrackingEntryRequest.md)
 - [TimeTrackingEntriesUpdateTimeTrackingEntryResponse](docs/TimeTrackingEntriesUpdateTimeTrackingEntryResponse.md)
 - [TimeTrackingEntryBase](docs/TimeTrackingEntryBase.md)
 - [TimeTrackingEntryBaseAllOf](docs/TimeTrackingEntryBaseAllOf.md)
 - [TimeTrackingEntryCompact](docs/TimeTrackingEntryCompact.md)
 - [TimeTrackingEntryCompactAllOf](docs/TimeTrackingEntryCompactAllOf.md)
 - [TypeaheadGetResultsResponse](docs/TypeaheadGetResultsResponse.md)
 - [UpdateTimeTrackingEntryRequest](docs/UpdateTimeTrackingEntryRequest.md)
 - [UserBaseResponse](docs/UserBaseResponse.md)
 - [UserBaseResponseAllOf](docs/UserBaseResponseAllOf.md)
 - [UserBaseResponseAllOfPhoto](docs/UserBaseResponseAllOfPhoto.md)
 - [UserCompact](docs/UserCompact.md)
 - [UserCompactAllOf](docs/UserCompactAllOf.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserResponseAllOf](docs/UserResponseAllOf.md)
 - [UserTaskListCompact](docs/UserTaskListCompact.md)
 - [UserTaskListCompactAllOf](docs/UserTaskListCompactAllOf.md)
 - [UserTaskListsGetRecordResponse](docs/UserTaskListsGetRecordResponse.md)
 - [UserTaskListsGetUserTaskListResponse](docs/UserTaskListsGetUserTaskListResponse.md)
 - [UsersGetFavoritesForUserResponse](docs/UsersGetFavoritesForUserResponse.md)
 - [UsersGetUserRecordResponse](docs/UsersGetUserRecordResponse.md)
 - [UsersListTeamUsersResponse](docs/UsersListTeamUsersResponse.md)
 - [UsersListWorkspaceUsersResponse](docs/UsersListWorkspaceUsersResponse.md)
 - [WebhookCompact](docs/WebhookCompact.md)
 - [WebhookCompactAllOf](docs/WebhookCompactAllOf.md)
 - [WebhookFilter](docs/WebhookFilter.md)
 - [WebhookRequest](docs/WebhookRequest.md)
 - [WebhookRequestFiltersInner](docs/WebhookRequestFiltersInner.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WebhookResponseAllOf](docs/WebhookResponseAllOf.md)
 - [WebhookUpdateRequest](docs/WebhookUpdateRequest.md)
 - [WebhooksEstablishWebhookRequest](docs/WebhooksEstablishWebhookRequest.md)
 - [WebhooksEstablishWebhookResponse](docs/WebhooksEstablishWebhookResponse.md)
 - [WebhooksGetWebhookRecordResponse](docs/WebhooksGetWebhookRecordResponse.md)
 - [WebhooksListMultipleWebhooksResponse](docs/WebhooksListMultipleWebhooksResponse.md)
 - [WebhooksRemoveWebhookResponse](docs/WebhooksRemoveWebhookResponse.md)
 - [WebhooksUpdateWebhookFiltersRequest](docs/WebhooksUpdateWebhookFiltersRequest.md)
 - [WebhooksUpdateWebhookFiltersResponse](docs/WebhooksUpdateWebhookFiltersResponse.md)
 - [WorkspaceAddUserRequest](docs/WorkspaceAddUserRequest.md)
 - [WorkspaceCompact](docs/WorkspaceCompact.md)
 - [WorkspaceCompactAllOf](docs/WorkspaceCompactAllOf.md)
 - [WorkspaceMembershipCompact](docs/WorkspaceMembershipCompact.md)
 - [WorkspaceMembershipCompactAllOf](docs/WorkspaceMembershipCompactAllOf.md)
 - [WorkspaceMembershipResponse](docs/WorkspaceMembershipResponse.md)
 - [WorkspaceMembershipResponseAllOf](docs/WorkspaceMembershipResponseAllOf.md)
 - [WorkspaceMembershipResponseAllOfVacationDates](docs/WorkspaceMembershipResponseAllOfVacationDates.md)
 - [WorkspaceMembershipsGetRecordByIdResponse](docs/WorkspaceMembershipsGetRecordByIdResponse.md)
 - [WorkspaceMembershipsGetUserMembershipsResponse](docs/WorkspaceMembershipsGetUserMembershipsResponse.md)
 - [WorkspaceMembershipsListForWorkspaceResponse](docs/WorkspaceMembershipsListForWorkspaceResponse.md)
 - [WorkspaceRemoveUserRequest](docs/WorkspaceRemoveUserRequest.md)
 - [WorkspaceResponse](docs/WorkspaceResponse.md)
 - [WorkspaceResponseAllOf](docs/WorkspaceResponseAllOf.md)
 - [WorkspacesAddUserToWorkspaceRequest](docs/WorkspacesAddUserToWorkspaceRequest.md)
 - [WorkspacesAddUserToWorkspaceResponse](docs/WorkspacesAddUserToWorkspaceResponse.md)
 - [WorkspacesGetWorkspaceRecordResponse](docs/WorkspacesGetWorkspaceRecordResponse.md)
 - [WorkspacesListMultipleResponse](docs/WorkspacesListMultipleResponse.md)
 - [WorkspacesRemoveUserFromWorkspaceRequest](docs/WorkspacesRemoveUserFromWorkspaceRequest.md)
 - [WorkspacesRemoveUserFromWorkspaceResponse](docs/WorkspacesRemoveUserFromWorkspaceResponse.md)
 - [WorkspacesUpdateWorkspaceRecordRequest](docs/WorkspacesUpdateWorkspaceRecordRequest.md)
 - [WorkspacesUpdateWorkspaceRecordResponse](docs/WorkspacesUpdateWorkspaceRecordResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
