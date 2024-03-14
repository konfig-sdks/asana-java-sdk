

# CustomFieldResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**representationType** | [**RepresentationTypeEnum**](#RepresentationTypeEnum) | This field tells the type of the custom field. |  [optional] [readonly] |
|**idPrefix** | **String** | This field is the unique custom ID string for the custom field. |  [optional] |
|**isFormulaField** | **Boolean** | *Conditional*. This flag describes whether a custom field is a formula custom field. |  [optional] |
|**isValueReadOnly** | **Boolean** | *Conditional*. This flag describes whether a custom field is read only. |  [optional] |
|**createdBy** | [**UserCompact**](UserCompact.md) |  |  [optional] |
|**peopleValue** | [**List&lt;UserCompact&gt;**](UserCompact.md) | *Conditional*. Only relevant for custom fields of type &#x60;people&#x60;. This array of [compact user](https://developers.asana.com/reference/rest-api-reference) objects reflects the values of a &#x60;people&#x60; custom field. |  [optional] |



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



