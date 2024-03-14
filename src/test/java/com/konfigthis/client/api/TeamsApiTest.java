/*
 * Asana
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec](https://raw.githubusercontent.com/Asana/openapi/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.TeamAddUserRequest;
import com.konfigthis.client.model.TeamRemoveUserRequest;
import com.konfigthis.client.model.TeamRequest;
import com.konfigthis.client.model.TeamsAddUserToTeamRequest;
import com.konfigthis.client.model.TeamsAddUserToTeamResponse;
import com.konfigthis.client.model.TeamsCreateTeamRecordRequest;
import com.konfigthis.client.model.TeamsCreateTeamRecordResponse;
import com.konfigthis.client.model.TeamsGetTeamRecordResponse;
import com.konfigthis.client.model.TeamsGetUserTeamsResponse;
import com.konfigthis.client.model.TeamsListWorkspaceTeamsResponse;
import com.konfigthis.client.model.TeamsRemoveUserFromTeamRequest;
import com.konfigthis.client.model.TeamsRemoveUserFromTeamResponse;
import com.konfigthis.client.model.TeamsUpdateTeamRecordRequest;
import com.konfigthis.client.model.TeamsUpdateTeamRecordResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamsApi
 */
@Disabled
public class TeamsApiTest {

    private static TeamsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TeamsApi(apiClient);
    }

    /**
     * Add a user to a team
     *
     * The user making this call must be a member of the team in order to add others. The user being added must exist in the same organization as the team.  Returns the complete team membership record for the newly added user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addUserToTeamTest() throws ApiException {
        String teamGid = null;
        TeamAddUserRequest data = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        TeamsAddUserToTeamResponse response = api.addUserToTeam(teamGid)
                .data(data)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a team
     *
     * Creates a team within the current workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTeamRecordTest() throws ApiException {
        TeamRequest data = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        TeamsCreateTeamRecordResponse response = api.createTeamRecord()
                .data(data)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a team
     *
     * Returns the full record for a single team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTeamRecordTest() throws ApiException {
        String teamGid = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        TeamsGetTeamRecordResponse response = api.getTeamRecord(teamGid)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get teams for a user
     *
     * Returns the compact records for all teams to which the given user is assigned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserTeamsTest() throws ApiException {
        String userGid = null;
        String organization = null;
        Boolean optPretty = null;
        Integer limit = null;
        String offset = null;
        List<String> optFields = null;
        TeamsGetUserTeamsResponse response = api.getUserTeams(userGid, organization)
                .optPretty(optPretty)
                .limit(limit)
                .offset(offset)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get teams in a workspace
     *
     * Returns the compact records for all teams in the workspace visible to the authorized user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWorkspaceTeamsTest() throws ApiException {
        String workspaceGid = null;
        Boolean optPretty = null;
        Integer limit = null;
        String offset = null;
        List<String> optFields = null;
        TeamsListWorkspaceTeamsResponse response = api.listWorkspaceTeams(workspaceGid)
                .optPretty(optPretty)
                .limit(limit)
                .offset(offset)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove a user from a team
     *
     * The user making this call must be a member of the team in order to remove themselves or others.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeUserFromTeamTest() throws ApiException {
        String teamGid = null;
        TeamRemoveUserRequest data = null;
        Boolean optPretty = null;
        TeamsRemoveUserFromTeamResponse response = api.removeUserFromTeam(teamGid)
                .data(data)
                .optPretty(optPretty)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a team
     *
     * Updates a team within the current workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTeamRecordTest() throws ApiException {
        String teamGid = null;
        TeamRequest data = null;
        Boolean optPretty = null;
        List<String> optFields = null;
        TeamsUpdateTeamRecordResponse response = api.updateTeamRecord(teamGid)
                .data(data)
                .optPretty(optPretty)
                .optFields(optFields)
                .execute();
        // TODO: test validations
    }

}
