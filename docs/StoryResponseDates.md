

# StoryResponseDates

*Conditional*

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startOn** | **LocalDate** | The day on which work for this goal begins, or null if the goal has no start date. This takes a date with &#x60;YYYY-MM-DD&#x60; format, and cannot be set unless there is an accompanying due date. |  [optional] |
|**dueAt** | **OffsetDateTime** | The UTC date and time on which this task is due, or null if the task has no due time. This takes an ISO 8601 date string in UTC and should not be used together with &#x60;due_on&#x60;. |  [optional] |
|**dueOn** | **LocalDate** | The localized day on which this goal is due. This takes a date with format &#x60;YYYY-MM-DD&#x60;. |  [optional] |



