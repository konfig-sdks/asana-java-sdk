/*
 * Asana
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/openapi/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.AsanaResource;
import com.konfigthis.client.model.CustomFieldResponse;
import com.konfigthis.client.model.Like;
import com.konfigthis.client.model.ProjectCompact;
import com.konfigthis.client.model.SectionCompact;
import com.konfigthis.client.model.TagCompact;
import com.konfigthis.client.model.TaskBaseAllOfExternal;
import com.konfigthis.client.model.TaskBaseAllOfMemberships;
import com.konfigthis.client.model.TaskCompact;
import com.konfigthis.client.model.TaskCompactAllOfCreatedBy;
import com.konfigthis.client.model.UserCompact;
import com.konfigthis.client.model.WorkspaceCompact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for TaskResponse
 */
public class TaskResponseTest {
    private final TaskResponse model = new TaskResponse();

    /**
     * Model tests for TaskResponse
     */
    @Test
    public void testTaskResponse() {
        // TODO: test TaskResponse
    }

    /**
     * Test the property 'gid'
     */
    @Test
    public void gidTest() {
        // TODO: test gid
    }

    /**
     * Test the property 'resourceType'
     */
    @Test
    public void resourceTypeTest() {
        // TODO: test resourceType
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'resourceSubtype'
     */
    @Test
    public void resourceSubtypeTest() {
        // TODO: test resourceSubtype
    }

    /**
     * Test the property 'createdBy'
     */
    @Test
    public void createdByTest() {
        // TODO: test createdBy
    }

    /**
     * Test the property 'approvalStatus'
     */
    @Test
    public void approvalStatusTest() {
        // TODO: test approvalStatus
    }

    /**
     * Test the property 'assigneeStatus'
     */
    @Test
    public void assigneeStatusTest() {
        // TODO: test assigneeStatus
    }

    /**
     * Test the property 'completed'
     */
    @Test
    public void completedTest() {
        // TODO: test completed
    }

    /**
     * Test the property 'completedAt'
     */
    @Test
    public void completedAtTest() {
        // TODO: test completedAt
    }

    /**
     * Test the property 'completedBy'
     */
    @Test
    public void completedByTest() {
        // TODO: test completedBy
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'dependencies'
     */
    @Test
    public void dependenciesTest() {
        // TODO: test dependencies
    }

    /**
     * Test the property 'dependents'
     */
    @Test
    public void dependentsTest() {
        // TODO: test dependents
    }

    /**
     * Test the property 'dueAt'
     */
    @Test
    public void dueAtTest() {
        // TODO: test dueAt
    }

    /**
     * Test the property 'dueOn'
     */
    @Test
    public void dueOnTest() {
        // TODO: test dueOn
    }

    /**
     * Test the property 'external'
     */
    @Test
    public void externalTest() {
        // TODO: test external
    }

    /**
     * Test the property 'htmlNotes'
     */
    @Test
    public void htmlNotesTest() {
        // TODO: test htmlNotes
    }

    /**
     * Test the property 'hearted'
     */
    @Test
    public void heartedTest() {
        // TODO: test hearted
    }

    /**
     * Test the property 'hearts'
     */
    @Test
    public void heartsTest() {
        // TODO: test hearts
    }

    /**
     * Test the property 'isRenderedAsSeparator'
     */
    @Test
    public void isRenderedAsSeparatorTest() {
        // TODO: test isRenderedAsSeparator
    }

    /**
     * Test the property 'liked'
     */
    @Test
    public void likedTest() {
        // TODO: test liked
    }

    /**
     * Test the property 'likes'
     */
    @Test
    public void likesTest() {
        // TODO: test likes
    }

    /**
     * Test the property 'memberships'
     */
    @Test
    public void membershipsTest() {
        // TODO: test memberships
    }

    /**
     * Test the property 'modifiedAt'
     */
    @Test
    public void modifiedAtTest() {
        // TODO: test modifiedAt
    }

    /**
     * Test the property 'notes'
     */
    @Test
    public void notesTest() {
        // TODO: test notes
    }

    /**
     * Test the property 'numHearts'
     */
    @Test
    public void numHeartsTest() {
        // TODO: test numHearts
    }

    /**
     * Test the property 'numLikes'
     */
    @Test
    public void numLikesTest() {
        // TODO: test numLikes
    }

    /**
     * Test the property 'numSubtasks'
     */
    @Test
    public void numSubtasksTest() {
        // TODO: test numSubtasks
    }

    /**
     * Test the property 'startAt'
     */
    @Test
    public void startAtTest() {
        // TODO: test startAt
    }

    /**
     * Test the property 'startOn'
     */
    @Test
    public void startOnTest() {
        // TODO: test startOn
    }

    /**
     * Test the property 'actualTimeMinutes'
     */
    @Test
    public void actualTimeMinutesTest() {
        // TODO: test actualTimeMinutes
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'assignee'
     */
    @Test
    public void assigneeTest() {
        // TODO: test assignee
    }

    /**
     * Test the property 'assigneeSection'
     */
    @Test
    public void assigneeSectionTest() {
        // TODO: test assigneeSection
    }

    /**
     * Test the property 'customFields'
     */
    @Test
    public void customFieldsTest() {
        // TODO: test customFields
    }

    /**
     * Test the property 'followers'
     */
    @Test
    public void followersTest() {
        // TODO: test followers
    }

    /**
     * Test the property 'parent'
     */
    @Test
    public void parentTest() {
        // TODO: test parent
    }

    /**
     * Test the property 'projects'
     */
    @Test
    public void projectsTest() {
        // TODO: test projects
    }

    /**
     * Test the property 'workspace'
     */
    @Test
    public void workspaceTest() {
        // TODO: test workspace
    }

    /**
     * Test the property 'permalinkUrl'
     */
    @Test
    public void permalinkUrlTest() {
        // TODO: test permalinkUrl
    }

}
