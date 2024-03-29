/*
 * Asana
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec](https://raw.githubusercontent.com/Asana/openapi/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.AuditLogEventActor;
import com.konfigthis.client.model.AuditLogEventContext;
import com.konfigthis.client.model.AuditLogEventResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * An object representing a single event within an Asana domain.  Every audit log event is comprised of an &#x60;event_type&#x60;, &#x60;actor&#x60;, &#x60;resource&#x60;, and &#x60;context&#x60;. Some events will include additional metadata about the event under &#x60;details&#x60;. See our [currently supported list of events](/docs/audit-log-events#supported-audit-log-events) for more details.
 */
@ApiModel(description = "An object representing a single event within an Asana domain.  Every audit log event is comprised of an `event_type`, `actor`, `resource`, and `context`. Some events will include additional metadata about the event under `details`. See our [currently supported list of events](/docs/audit-log-events#supported-audit-log-events) for more details.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AuditLogEvent {
  public static final String SERIALIZED_NAME_GID = "gid";
  @SerializedName(SERIALIZED_NAME_GID)
  private String gid;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_EVENT_CATEGORY = "event_category";
  @SerializedName(SERIALIZED_NAME_EVENT_CATEGORY)
  private String eventCategory;

  public static final String SERIALIZED_NAME_ACTOR = "actor";
  @SerializedName(SERIALIZED_NAME_ACTOR)
  private AuditLogEventActor actor;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private AuditLogEventResource resource;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private Object details;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private AuditLogEventContext context;

  public AuditLogEvent() {
  }

  public AuditLogEvent gid(String gid) {
    
    
    
    
    this.gid = gid;
    return this;
  }

   /**
   * Globally unique identifier of the &#x60;AuditLogEvent&#x60;, as a string.
   * @return gid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "Globally unique identifier of the `AuditLogEvent`, as a string.")

  public String getGid() {
    return gid;
  }


  public void setGid(String gid) {
    
    
    
    this.gid = gid;
  }


  public AuditLogEvent createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time the event was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01T00:00Z", value = "The time the event was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public AuditLogEvent eventType(String eventType) {
    
    
    
    
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of the event.
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "task_deleted", value = "The type of the event.")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    
    
    
    this.eventType = eventType;
  }


  public AuditLogEvent eventCategory(String eventCategory) {
    
    
    
    
    this.eventCategory = eventCategory;
    return this;
  }

   /**
   * The category that this &#x60;event_type&#x60; belongs to.
   * @return eventCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "deletion", value = "The category that this `event_type` belongs to.")

  public String getEventCategory() {
    return eventCategory;
  }


  public void setEventCategory(String eventCategory) {
    
    
    
    this.eventCategory = eventCategory;
  }


  public AuditLogEvent actor(AuditLogEventActor actor) {
    
    
    
    
    this.actor = actor;
    return this;
  }

   /**
   * Get actor
   * @return actor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuditLogEventActor getActor() {
    return actor;
  }


  public void setActor(AuditLogEventActor actor) {
    
    
    
    this.actor = actor;
  }


  public AuditLogEvent resource(AuditLogEventResource resource) {
    
    
    
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuditLogEventResource getResource() {
    return resource;
  }


  public void setResource(AuditLogEventResource resource) {
    
    
    
    this.resource = resource;
  }


  public AuditLogEvent details(Object details) {
    
    
    
    
    this.details = details;
    return this;
  }

   /**
   * Event specific details. The schema will vary depending on the &#x60;event_type&#x60;.
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Event specific details. The schema will vary depending on the `event_type`.")

  public Object getDetails() {
    return details;
  }


  public void setDetails(Object details) {
    
    
    
    this.details = details;
  }


  public AuditLogEvent context(AuditLogEventContext context) {
    
    
    
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuditLogEventContext getContext() {
    return context;
  }


  public void setContext(AuditLogEventContext context) {
    
    
    
    this.context = context;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AuditLogEvent instance itself
   */
  public AuditLogEvent putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogEvent auditLogEvent = (AuditLogEvent) o;
    return Objects.equals(this.gid, auditLogEvent.gid) &&
        Objects.equals(this.createdAt, auditLogEvent.createdAt) &&
        Objects.equals(this.eventType, auditLogEvent.eventType) &&
        Objects.equals(this.eventCategory, auditLogEvent.eventCategory) &&
        Objects.equals(this.actor, auditLogEvent.actor) &&
        Objects.equals(this.resource, auditLogEvent.resource) &&
        Objects.equals(this.details, auditLogEvent.details) &&
        Objects.equals(this.context, auditLogEvent.context)&&
        Objects.equals(this.additionalProperties, auditLogEvent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, createdAt, eventType, eventCategory, actor, resource, details, context, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogEvent {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventCategory: ").append(toIndentedString(eventCategory)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("gid");
    openapiFields.add("created_at");
    openapiFields.add("event_type");
    openapiFields.add("event_category");
    openapiFields.add("actor");
    openapiFields.add("resource");
    openapiFields.add("details");
    openapiFields.add("context");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuditLogEvent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuditLogEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditLogEvent is not found in the empty JSON string", AuditLogEvent.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("gid") != null && !jsonObj.get("gid").isJsonNull()) && !jsonObj.get("gid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gid").toString()));
      }
      if ((jsonObj.get("event_type") != null && !jsonObj.get("event_type").isJsonNull()) && !jsonObj.get("event_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_type").toString()));
      }
      if ((jsonObj.get("event_category") != null && !jsonObj.get("event_category").isJsonNull()) && !jsonObj.get("event_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_category").toString()));
      }
      // validate the optional field `actor`
      if (jsonObj.get("actor") != null && !jsonObj.get("actor").isJsonNull()) {
        AuditLogEventActor.validateJsonObject(jsonObj.getAsJsonObject("actor"));
      }
      // validate the optional field `resource`
      if (jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) {
        AuditLogEventResource.validateJsonObject(jsonObj.getAsJsonObject("resource"));
      }
      // validate the optional field `context`
      if (jsonObj.get("context") != null && !jsonObj.get("context").isJsonNull()) {
        AuditLogEventContext.validateJsonObject(jsonObj.getAsJsonObject("context"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditLogEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditLogEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditLogEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditLogEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditLogEvent>() {
           @Override
           public void write(JsonWriter out, AuditLogEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AuditLogEvent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuditLogEvent instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuditLogEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuditLogEvent
  * @throws IOException if the JSON string is invalid with respect to AuditLogEvent
  */
  public static AuditLogEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditLogEvent.class);
  }

 /**
  * Convert an instance of AuditLogEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

