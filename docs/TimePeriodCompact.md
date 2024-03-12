

# TimePeriodCompact


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**endOn** | **String** | The localized end date of the time period in &#x60;YYYY-MM-DD&#x60; format. |  [optional] |
|**startOn** | **String** | The localized start date of the time period in &#x60;YYYY-MM-DD&#x60; format. |  [optional] |
|**period** | [**PeriodEnum**](#PeriodEnum) | The cadence and index of the time period. The value is one of: &#x60;FY&#x60;, &#x60;H1&#x60;, &#x60;H2&#x60;, &#x60;Q1&#x60;, &#x60;Q2&#x60;, &#x60;Q3&#x60;, or &#x60;Q4&#x60;. |  [optional] |
|**displayName** | **String** | A string representing the cadence code and the fiscal year. |  [optional] |



## Enum: PeriodEnum

| Name | Value |
|---- | -----|
| FY | &quot;FY&quot; |
| H1 | &quot;H1&quot; |
| H2 | &quot;H2&quot; |
| Q1 | &quot;Q1&quot; |
| Q2 | &quot;Q2&quot; |
| Q3 | &quot;Q3&quot; |
| Q4 | &quot;Q4&quot; |



