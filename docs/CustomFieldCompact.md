

# CustomFieldCompact


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



