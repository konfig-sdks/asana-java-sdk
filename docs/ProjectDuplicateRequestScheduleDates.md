

# ProjectDuplicateRequestScheduleDates

A dictionary of options to auto-shift dates. `task_dates` must be included to use this option. Requires either `start_on` or `due_on`, but not both.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**shouldSkipWeekends** | **Boolean** | Determines if the auto-shifted dates should skip weekends. |  |
|**dueOn** | **String** | Sets the last due date in the duplicated project to the given date. The rest of the due dates will be offset by the same amount as the due dates in the original project. |  [optional] |
|**startOn** | **String** | Sets the first start date in the duplicated project to the given date. The rest of the start dates will be offset by the same amount as the start dates in the original project. |  [optional] |



