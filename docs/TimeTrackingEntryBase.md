

# TimeTrackingEntryBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the resource, as a string. |  [optional] [readonly] |
|**resourceType** | **String** | The base type of this resource. |  [optional] [readonly] |
|**durationMinutes** | **Integer** | Time in minutes tracked by the entry. |  [optional] |
|**enteredOn** | **LocalDate** | The day that this entry is logged on. |  [optional] |
|**createdBy** | [**UserCompact**](UserCompact.md) |  |  [optional] |
|**task** | [**TaskCompact**](TaskCompact.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The time at which this resource was created. |  [optional] [readonly] |



