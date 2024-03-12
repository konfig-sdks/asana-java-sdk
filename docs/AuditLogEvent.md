

# AuditLogEvent

An object representing a single event within an Asana domain.  Every audit log event is comprised of an `event_type`, `actor`, `resource`, and `context`. Some events will include additional metadata about the event under `details`. See our [currently supported list of events](/docs/audit-log-events#supported-audit-log-events) for more details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gid** | **String** | Globally unique identifier of the &#x60;AuditLogEvent&#x60;, as a string. |  [optional] |
|**createdAt** | **OffsetDateTime** | The time the event was created. |  [optional] |
|**eventType** | **String** | The type of the event. |  [optional] |
|**eventCategory** | **String** | The category that this &#x60;event_type&#x60; belongs to. |  [optional] |
|**actor** | [**AuditLogEventActor**](AuditLogEventActor.md) |  |  [optional] |
|**resource** | [**AuditLogEventResource**](AuditLogEventResource.md) |  |  [optional] |
|**details** | **Object** | Event specific details. The schema will vary depending on the &#x60;event_type&#x60;. |  [optional] |
|**context** | [**AuditLogEventContext**](AuditLogEventContext.md) |  |  [optional] |



