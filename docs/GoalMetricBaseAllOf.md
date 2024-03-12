

# GoalMetricBaseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourceSubtype** | [**ResourceSubtypeEnum**](#ResourceSubtypeEnum) | The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. |  [optional] [readonly] |
|**precision** | **Integer** | *Conditional*. Only relevant for goal metrics of type ‘Number’. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%. |  [optional] |
|**unit** | [**UnitEnum**](#UnitEnum) | A supported unit of measure for the goal metric, or none. |  [optional] |
|**currencyCode** | **String** | ISO 4217 currency code to format this custom field. This will be null if the &#x60;unit&#x60; is not &#x60;currency&#x60;. |  [optional] |
|**initialNumberValue** | **Double** | This number is the start value of a goal metric of type number. |  [optional] |
|**targetNumberValue** | **Double** | This number is the end value of a goal metric of type number. This number cannot equal &#x60;initial_number_value&#x60;. |  [optional] |
|**currentNumberValue** | **Double** | This number is the current value of a goal metric of type number. |  [optional] |
|**currentDisplayValue** | **String** | This string is the current value of a goal metric of type string. |  [optional] [readonly] |
|**progressSource** | [**ProgressSourceEnum**](#ProgressSourceEnum) | This field defines how the progress value of a goal metric is being calculated. A goal&#39;s progress can be provided manually by the user, calculated automatically from contributing subgoals, projects, or tasks, or managed by an integration with an external data source, such as Salesforce. |  [optional] |



## Enum: ResourceSubtypeEnum

| Name | Value |
|---- | -----|
| NUMBER | &quot;number&quot; |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| CURRENCY | &quot;currency&quot; |
| PERCENTAGE | &quot;percentage&quot; |



## Enum: ProgressSourceEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;manual&quot; |
| SUBGOAL_PROGRESS | &quot;subgoal_progress&quot; |
| PROJECT_TASK_COMPLETION | &quot;project_task_completion&quot; |
| PROJECT_MILESTONE_COMPLETION | &quot;project_milestone_completion&quot; |
| TASK_COMPLETION | &quot;task_completion&quot; |
| EXTERNAL | &quot;external&quot; |



