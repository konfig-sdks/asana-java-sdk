

# CustomFieldBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**name** | **String** | The name of the custom field. |  [optional] |
|**resourceSubtype** | [**ResourceSubtypeEnum**](#ResourceSubtypeEnum) | The type of the custom field. Must be one of the given values.  |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | *Deprecated: new integrations should prefer the resource_subtype field.* The type of the custom field. Must be one of the given values.  |  [optional] [readonly] |
|**enumOptions** | [**List&lt;EnumOption&gt;**](EnumOption.md) | *Conditional*. Only relevant for custom fields of type &#x60;enum&#x60;. This array specifies the possible values which an &#x60;enum&#x60; custom field can adopt. To modify the enum options, refer to [working with enum options](https://developers.asana.com/reference/rest-api-reference). |  [optional] |
|**enabled** | **Boolean** | *Conditional*. Determines if the custom field is enabled or not. |  [optional] [readonly] |
|**representationType** | [**RepresentationTypeEnum**](#RepresentationTypeEnum) | This field tells the type of the custom field. |  [optional] [readonly] |
|**idPrefix** | **String** | This field is the unique custom ID string for the custom field. |  [optional] |
|**isFormulaField** | **Boolean** | *Conditional*. This flag describes whether a custom field is a formula custom field. |  [optional] |
|**dateValue** | [**CustomFieldCompactAllOfDateValue**](CustomFieldCompactAllOfDateValue.md) |  |  [optional] |
|**enumValue** | [**EnumOption**](EnumOption.md) |  |  [optional] |
|**multiEnumValues** | [**List&lt;EnumOption&gt;**](EnumOption.md) | *Conditional*. Only relevant for custom fields of type &#x60;multi_enum&#x60;. This object is the chosen values of a &#x60;multi_enum&#x60; custom field. |  [optional] |
|**numberValue** | **Double** | *Conditional*. This number is the value of a &#x60;number&#x60; custom field. |  [optional] |
|**textValue** | **String** | *Conditional*. This string is the value of a &#x60;text&#x60; custom field. |  [optional] |
|**displayValue** | **String** | A string representation for the value of the custom field. Integrations that don&#39;t require the underlying type should use this field to read values. Using this field will future-proof an app against new custom field types. |  [optional] [readonly] |
|**description** | **String** | [Opt In](https://developers.asana.com/reference/rest-api-reference). The description of the custom field. |  [optional] |
|**precision** | **Integer** | Only relevant for custom fields of type ‘Number’. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%. The identifier format will always have a precision of 0. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | The format of this custom field. |  [optional] |
|**currencyCode** | **String** | ISO 4217 currency code to format this custom field. This will be null if the &#x60;format&#x60; is not &#x60;currency&#x60;. |  [optional] |
|**customLabel** | **String** | This is the string that appears next to the custom field value. This will be null if the &#x60;format&#x60; is not &#x60;custom&#x60;. |  [optional] |
|**customLabelPosition** | [**CustomLabelPositionEnum**](#CustomLabelPositionEnum) | Only relevant for custom fields with &#x60;custom&#x60; format. This depicts where to place the custom label. This will be null if the &#x60;format&#x60; is not &#x60;custom&#x60;. |  [optional] |
|**isGlobalToWorkspace** | **Boolean** | This flag describes whether this custom field is available to every container in the workspace. Before project-specific custom fields, this field was always true. |  [optional] [readonly] |
|**hasNotificationsEnabled** | **Boolean** | *Conditional*. This flag describes whether a follower of a task with this field should receive inbox notifications from changes to this field. |  [optional] |
|**asanaCreatedField** | [**AsanaCreatedFieldEnum**](#AsanaCreatedFieldEnum) | *Conditional*. A unique identifier to associate this field with the template source of truth. |  [optional] [readonly] |



## Enum: ResourceSubtypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| ENUM | &quot;enum&quot; |
| MULTI_ENUM | &quot;multi_enum&quot; |
| NUMBER | &quot;number&quot; |
| DATE | &quot;date&quot; |
| PEOPLE | &quot;people&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| ENUM | &quot;enum&quot; |
| MULTI_ENUM | &quot;multi_enum&quot; |
| NUMBER | &quot;number&quot; |
| DATE | &quot;date&quot; |
| PEOPLE | &quot;people&quot; |



## Enum: RepresentationTypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| ENUM | &quot;enum&quot; |
| MULTI_ENUM | &quot;multi_enum&quot; |
| NUMBER | &quot;number&quot; |
| DATE | &quot;date&quot; |
| PEOPLE | &quot;people&quot; |
| FORMULA | &quot;formula&quot; |
| CUSTOM_ID | &quot;custom_id&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| CURRENCY | &quot;currency&quot; |
| IDENTIFIER | &quot;identifier&quot; |
| PERCENTAGE | &quot;percentage&quot; |
| CUSTOM | &quot;custom&quot; |
| DURATION | &quot;duration&quot; |
| NONE | &quot;none&quot; |



## Enum: CustomLabelPositionEnum

| Name | Value |
|---- | -----|
| PREFIX | &quot;prefix&quot; |
| SUFFIX | &quot;suffix&quot; |
| NULL | &quot;null&quot; |



## Enum: AsanaCreatedFieldEnum

| Name | Value |
|---- | -----|
| A_V_REQUIREMENTS | &quot;a_v_requirements&quot; |
| ACCOUNT_NAME | &quot;account_name&quot; |
| ACTIONABLE | &quot;actionable&quot; |
| ALIGN_SHIPPING_LINK | &quot;align_shipping_link&quot; |
| ALIGN_STATUS | &quot;align_status&quot; |
| ALLOTTED_TIME | &quot;allotted_time&quot; |
| APPOINTMENT | &quot;appointment&quot; |
| APPROVAL_STAGE | &quot;approval_stage&quot; |
| APPROVED | &quot;approved&quot; |
| ARTICLE_SERIES | &quot;article_series&quot; |
| BOARD_COMMITTEE | &quot;board_committee&quot; |
| BROWSER | &quot;browser&quot; |
| CAMPAIGN_AUDIENCE | &quot;campaign_audience&quot; |
| CAMPAIGN_PROJECT_STATUS | &quot;campaign_project_status&quot; |
| CAMPAIGN_REGIONS | &quot;campaign_regions&quot; |
| CHANNEL_PRIMARY | &quot;channel_primary&quot; |
| CLIENT_TOPIC_TYPE | &quot;client_topic_type&quot; |
| COMPLETE_BY | &quot;complete_by&quot; |
| CONTACT | &quot;contact&quot; |
| CONTACT_EMAIL_ADDRESS | &quot;contact_email_address&quot; |
| CONTENT_CHANNELS | &quot;content_channels&quot; |
| CONTENT_CHANNELS_NEEDED | &quot;content_channels_needed&quot; |
| CONTENT_STAGE | &quot;content_stage&quot; |
| CONTENT_TYPE | &quot;content_type&quot; |
| CONTRACT | &quot;contract&quot; |
| CONTRACT_STATUS | &quot;contract_status&quot; |
| COST | &quot;cost&quot; |
| CREATION_STAGE | &quot;creation_stage&quot; |
| CREATIVE_CHANNEL | &quot;creative_channel&quot; |
| CREATIVE_NEEDED | &quot;creative_needed&quot; |
| CREATIVE_NEEDS | &quot;creative_needs&quot; |
| DATA_SENSITIVITY | &quot;data_sensitivity&quot; |
| DEAL_SIZE | &quot;deal_size&quot; |
| DELIVERY_APPT | &quot;delivery_appt&quot; |
| DELIVERY_APPT_DATE | &quot;delivery_appt_date&quot; |
| DEPARTMENT | &quot;department&quot; |
| DEPARTMENT_RESPONSIBLE | &quot;department_responsible&quot; |
| DESIGN_REQUEST_NEEDED | &quot;design_request_needed&quot; |
| DESIGN_REQUEST_TYPE | &quot;design_request_type&quot; |
| DISCUSSION_CATEGORY | &quot;discussion_category&quot; |
| DO_THIS_TASK | &quot;do_this_task&quot; |
| EDITORIAL_CONTENT_STATUS | &quot;editorial_content_status&quot; |
| EDITORIAL_CONTENT_TAG | &quot;editorial_content_tag&quot; |
| EDITORIAL_CONTENT_TYPE | &quot;editorial_content_type&quot; |
| EFFORT | &quot;effort&quot; |
| EFFORT_LEVEL | &quot;effort_level&quot; |
| EST_COMPLETION_DATE | &quot;est_completion_date&quot; |
| ESTIMATED_TIME | &quot;estimated_time&quot; |
| ESTIMATED_VALUE | &quot;estimated_value&quot; |
| EXPECTED_COST | &quot;expected_cost&quot; |
| EXTERNAL_STEPS_NEEDED | &quot;external_steps_needed&quot; |
| FAVORITE_IDEA | &quot;favorite_idea&quot; |
| FEEDBACK_TYPE | &quot;feedback_type&quot; |
| FINANCIAL | &quot;financial&quot; |
| FUNDING_AMOUNT | &quot;funding_amount&quot; |
| GRANT_APPLICATION_PROCESS | &quot;grant_application_process&quot; |
| HIRING_CANDIDATE_STATUS | &quot;hiring_candidate_status&quot; |
| IDEA_STATUS | &quot;idea_status&quot; |
| IDS_LINK | &quot;ids_link&quot; |
| IDS_PATIENT_LINK | &quot;ids_patient_link&quot; |
| IMPLEMENTATION_STAGE | &quot;implementation_stage&quot; |
| INSURANCE | &quot;insurance&quot; |
| INTERVIEW_AREA | &quot;interview_area&quot; |
| INTERVIEW_QUESTION_SCORE | &quot;interview_question_score&quot; |
| ITERO_SCAN_LINK | &quot;itero_scan_link&quot; |
| JOB_S_APPLIED_TO | &quot;job_s_applied_to&quot; |
| LAB | &quot;lab&quot; |
| LAUNCH_STATUS | &quot;launch_status&quot; |
| LEAD_STATUS | &quot;lead_status&quot; |
| LOCALIZATION_LANGUAGE | &quot;localization_language&quot; |
| LOCALIZATION_MARKET_TEAM | &quot;localization_market_team&quot; |
| LOCALIZATION_STATUS | &quot;localization_status&quot; |
| MEETING_MINUTES | &quot;meeting_minutes&quot; |
| MEETING_NEEDED | &quot;meeting_needed&quot; |
| MINUTES | &quot;minutes&quot; |
| MRR | &quot;mrr&quot; |
| MUST_LOCALIZE | &quot;must_localize&quot; |
| NAME_OF_FOUNDATION | &quot;name_of_foundation&quot; |
| NEED_TO_FOLLOW_UP | &quot;need_to_follow_up&quot; |
| NEXT_APPOINTMENT | &quot;next_appointment&quot; |
| NEXT_STEPS_SALES | &quot;next_steps_sales&quot; |
| NUM_PEOPLE | &quot;num_people&quot; |
| NUMBER_OF_USER_REPORTS | &quot;number_of_user_reports&quot; |
| OFFICE_LOCATION | &quot;office_location&quot; |
| ONBOARDING_ACTIVITY | &quot;onboarding_activity&quot; |
| OWNER | &quot;owner&quot; |
| PARTICIPANTS_NEEDED | &quot;participants_needed&quot; |
| PATIENT_DATE_OF_BIRTH | &quot;patient_date_of_birth&quot; |
| PATIENT_EMAIL | &quot;patient_email&quot; |
| PATIENT_PHONE | &quot;patient_phone&quot; |
| PATIENT_STATUS | &quot;patient_status&quot; |
| PHONE_NUMBER | &quot;phone_number&quot; |
| PLANNING_CATEGORY | &quot;planning_category&quot; |
| POINT_OF_CONTACT | &quot;point_of_contact&quot; |
| POSITION | &quot;position&quot; |
| POST_FORMAT | &quot;post_format&quot; |
| PRESCRIPTION | &quot;prescription&quot; |
| PRIORITY | &quot;priority&quot; |
| PRIORITY_LEVEL | &quot;priority_level&quot; |
| PRODUCT | &quot;product&quot; |
| PRODUCT_STAGE | &quot;product_stage&quot; |
| PROGRESS | &quot;progress&quot; |
| PROJECT_SIZE | &quot;project_size&quot; |
| PROJECT_STATUS | &quot;project_status&quot; |
| PROPOSED_BUDGET | &quot;proposed_budget&quot; |
| PUBLISH_STATUS | &quot;publish_status&quot; |
| REASON_FOR_SCAN | &quot;reason_for_scan&quot; |
| REFERRAL | &quot;referral&quot; |
| REQUEST_TYPE | &quot;request_type&quot; |
| RESEARCH_STATUS | &quot;research_status&quot; |
| RESPONSIBLE_DEPARTMENT | &quot;responsible_department&quot; |
| RESPONSIBLE_TEAM | &quot;responsible_team&quot; |
| RISK_ASSESSMENT_STATUS | &quot;risk_assessment_status&quot; |
| ROOM_NAME | &quot;room_name&quot; |
| SALES_COUNTERPART | &quot;sales_counterpart&quot; |
| SENTIMENT | &quot;sentiment&quot; |
| SHIPPING_LINK | &quot;shipping_link&quot; |
| SOCIAL_CHANNELS | &quot;social_channels&quot; |
| STAGE | &quot;stage&quot; |
| STATUS | &quot;status&quot; |
| STATUS_DESIGN | &quot;status_design&quot; |
| STATUS_OF_INITIATIVE | &quot;status_of_initiative&quot; |
| SYSTEM_SETUP | &quot;system_setup&quot; |
| TASK_PROGRESS | &quot;task_progress&quot; |
| TEAM | &quot;team&quot; |
| TEAM_MARKETING | &quot;team_marketing&quot; |
| TEAM_RESPONSIBLE | &quot;team_responsible&quot; |
| TIME_IT_TAKES_TO_COMPLETE_TASKS | &quot;time_it_takes_to_complete_tasks&quot; |
| TIMEFRAME | &quot;timeframe&quot; |
| TREATMENT_TYPE | &quot;treatment_type&quot; |
| TYPE_WORK_REQUESTS_IT | &quot;type_work_requests_it&quot; |
| USE_AGENCY | &quot;use_agency&quot; |
| USER_NAME | &quot;user_name&quot; |
| VENDOR_CATEGORY | &quot;vendor_category&quot; |
| VENDOR_TYPE | &quot;vendor_type&quot; |
| WORD_COUNT | &quot;word_count&quot; |
| NULL | &quot;null&quot; |



