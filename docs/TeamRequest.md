

# TeamRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**name** | **String** | The name of the team. |  [optional] |
|**description** | **String** | The description of the team.  |  [optional] |
|**htmlDescription** | **String** | The description of the team with formatting as HTML.  |  [optional] |
|**organization** | **String** | The organization/workspace the team belongs to. This must be the same organization you are in and cannot be changed once set.  |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | The visibility of the team to users in the same organization  |  [optional] |
|**editTeamNameOrDescriptionAccessLevel** | [**EditTeamNameOrDescriptionAccessLevelEnum**](#EditTeamNameOrDescriptionAccessLevelEnum) | Controls who can edit team name and description  |  [optional] [readonly] |
|**editTeamVisibilityOrTrashTeamAccessLevel** | [**EditTeamVisibilityOrTrashTeamAccessLevelEnum**](#EditTeamVisibilityOrTrashTeamAccessLevelEnum) | Controls who can edit team visibility and trash teams  |  [optional] [readonly] |
|**memberInviteManagementAccessLevel** | [**MemberInviteManagementAccessLevelEnum**](#MemberInviteManagementAccessLevelEnum) | Controls who can accept or deny member invites for a given team  |  [optional] [readonly] |
|**guestInviteManagementAccessLevel** | [**GuestInviteManagementAccessLevelEnum**](#GuestInviteManagementAccessLevelEnum) | Controls who can accept or deny guest invites for a given team  |  [optional] [readonly] |
|**joinRequestManagementAccessLevel** | [**JoinRequestManagementAccessLevelEnum**](#JoinRequestManagementAccessLevelEnum) | Controls who can accept or deny join team requests for a Membership by Request team  |  [optional] [readonly] |
|**teamMemberRemovalAccessLevel** | [**TeamMemberRemovalAccessLevelEnum**](#TeamMemberRemovalAccessLevelEnum) | Controls who can remove team members  |  [optional] [readonly] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| SECRET | &quot;secret&quot; |
| REQUEST_TO_JOIN | &quot;request_to_join&quot; |
| PUBLIC | &quot;public&quot; |



## Enum: EditTeamNameOrDescriptionAccessLevelEnum

| Name | Value |
|---- | -----|
| ALL_TEAM_MEMBERS | &quot;all_team_members&quot; |
| ONLY_TEAM_ADMINS | &quot;only_team_admins&quot; |



## Enum: EditTeamVisibilityOrTrashTeamAccessLevelEnum

| Name | Value |
|---- | -----|
| ALL_TEAM_MEMBERS | &quot;all_team_members&quot; |
| ONLY_TEAM_ADMINS | &quot;only_team_admins&quot; |



## Enum: MemberInviteManagementAccessLevelEnum

| Name | Value |
|---- | -----|
| ALL_TEAM_MEMBERS | &quot;all_team_members&quot; |
| ONLY_TEAM_ADMINS | &quot;only_team_admins&quot; |



## Enum: GuestInviteManagementAccessLevelEnum

| Name | Value |
|---- | -----|
| ALL_TEAM_MEMBERS | &quot;all_team_members&quot; |
| ONLY_TEAM_ADMINS | &quot;only_team_admins&quot; |



## Enum: JoinRequestManagementAccessLevelEnum

| Name | Value |
|---- | -----|
| ALL_TEAM_MEMBERS | &quot;all_team_members&quot; |
| ONLY_TEAM_ADMINS | &quot;only_team_admins&quot; |



## Enum: TeamMemberRemovalAccessLevelEnum

| Name | Value |
|---- | -----|
| ALL_TEAM_MEMBERS | &quot;all_team_members&quot; |
| ONLY_TEAM_ADMINS | &quot;only_team_admins&quot; |



