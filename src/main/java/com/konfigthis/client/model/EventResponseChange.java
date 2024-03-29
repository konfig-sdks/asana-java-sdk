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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Information about the type of change that has occurred. This field is only present when the value of the property &#x60;action&#x60;, describing the action taken on the **resource**, is &#x60;changed&#x60;.
 */
@ApiModel(description = "Information about the type of change that has occurred. This field is only present when the value of the property `action`, describing the action taken on the **resource**, is `changed`.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EventResponseChange {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_NEW_VALUE = "new_value";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE)
  private Object newValue = null;

  public static final String SERIALIZED_NAME_ADDED_VALUE = "added_value";
  @SerializedName(SERIALIZED_NAME_ADDED_VALUE)
  private Object addedValue = null;

  public static final String SERIALIZED_NAME_REMOVED_VALUE = "removed_value";
  @SerializedName(SERIALIZED_NAME_REMOVED_VALUE)
  private Object removedValue = null;

  public EventResponseChange() {
  }

  
  public EventResponseChange(
     String field, 
     String action
  ) {
    this();
    this.field = field;
    this.action = action;
  }

   /**
   * The name of the field that has changed in the resource.
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "assignee", value = "The name of the field that has changed in the resource.")

  public String getField() {
    return field;
  }




   /**
   * The type of action taken on the **field** which has been changed.  This can be one of &#x60;changed&#x60;, &#x60;added&#x60;, or &#x60;removed&#x60; depending on the nature of the change.
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "changed", value = "The type of action taken on the **field** which has been changed.  This can be one of `changed`, `added`, or `removed` depending on the nature of the change.")

  public String getAction() {
    return action;
  }




  public EventResponseChange newValue(Object newValue) {
    
    
    
    
    this.newValue = newValue;
    return this;
  }

   /**
   * *Conditional.* This property is only present when the value of the event&#39;s &#x60;change.action&#x60; is &#x60;changed&#x60; _and_ the &#x60;new_value&#x60; is an Asana resource. This will be only the &#x60;gid&#x60; and &#x60;resource_type&#x60; of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](https://raw.githubusercontent.com)) when using the [get events](https://raw.githubusercontent.com) endpoint.
   * @return newValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"gid\":\"12345\",\"resource_type\":\"user\"}", value = "*Conditional.* This property is only present when the value of the event's `change.action` is `changed` _and_ the `new_value` is an Asana resource. This will be only the `gid` and `resource_type` of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](https://raw.githubusercontent.com)) when using the [get events](https://raw.githubusercontent.com) endpoint.")

  public Object getNewValue() {
    return newValue;
  }


  public void setNewValue(Object newValue) {
    
    
    
    this.newValue = newValue;
  }


  public EventResponseChange addedValue(Object addedValue) {
    
    
    
    
    this.addedValue = addedValue;
    return this;
  }

   /**
   * *Conditional.* This property is only present when the value of the event&#39;s &#x60;change.action&#x60; is &#x60;added&#x60; _and_ the &#x60;added_value&#x60; is an Asana resource. This will be only the &#x60;gid&#x60; and &#x60;resource_type&#x60; of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](https://raw.githubusercontent.com)) when using the [get events](https://raw.githubusercontent.com) endpoint.
   * @return addedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"gid\":\"12345\",\"resource_type\":\"user\"}", value = "*Conditional.* This property is only present when the value of the event's `change.action` is `added` _and_ the `added_value` is an Asana resource. This will be only the `gid` and `resource_type` of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](https://raw.githubusercontent.com)) when using the [get events](https://raw.githubusercontent.com) endpoint.")

  public Object getAddedValue() {
    return addedValue;
  }


  public void setAddedValue(Object addedValue) {
    
    
    
    this.addedValue = addedValue;
  }


  public EventResponseChange removedValue(Object removedValue) {
    
    
    
    
    this.removedValue = removedValue;
    return this;
  }

   /**
   * *Conditional.* This property is only present when the value of the event&#39;s &#x60;change.action&#x60; is &#x60;removed&#x60; _and_ the &#x60;removed_value&#x60; is an Asana resource. This will be only the &#x60;gid&#x60; and &#x60;resource_type&#x60; of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](https://raw.githubusercontent.com)) when using the [get events](https://raw.githubusercontent.com) endpoint.
   * @return removedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"gid\":\"12345\",\"resource_type\":\"user\"}", value = "*Conditional.* This property is only present when the value of the event's `change.action` is `removed` _and_ the `removed_value` is an Asana resource. This will be only the `gid` and `resource_type` of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](https://raw.githubusercontent.com)) when using the [get events](https://raw.githubusercontent.com) endpoint.")

  public Object getRemovedValue() {
    return removedValue;
  }


  public void setRemovedValue(Object removedValue) {
    
    
    
    this.removedValue = removedValue;
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
   * @return the EventResponseChange instance itself
   */
  public EventResponseChange putAdditionalProperty(String key, Object value) {
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
    EventResponseChange eventResponseChange = (EventResponseChange) o;
    return Objects.equals(this.field, eventResponseChange.field) &&
        Objects.equals(this.action, eventResponseChange.action) &&
        Objects.equals(this.newValue, eventResponseChange.newValue) &&
        Objects.equals(this.addedValue, eventResponseChange.addedValue) &&
        Objects.equals(this.removedValue, eventResponseChange.removedValue)&&
        Objects.equals(this.additionalProperties, eventResponseChange.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, action, newValue, addedValue, removedValue, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResponseChange {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    addedValue: ").append(toIndentedString(addedValue)).append("\n");
    sb.append("    removedValue: ").append(toIndentedString(removedValue)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("action");
    openapiFields.add("new_value");
    openapiFields.add("added_value");
    openapiFields.add("removed_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventResponseChange
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EventResponseChange.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventResponseChange is not found in the empty JSON string", EventResponseChange.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("field") != null && !jsonObj.get("field").isJsonNull()) && !jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventResponseChange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventResponseChange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventResponseChange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventResponseChange.class));

       return (TypeAdapter<T>) new TypeAdapter<EventResponseChange>() {
           @Override
           public void write(JsonWriter out, EventResponseChange value) throws IOException {
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
           public EventResponseChange read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EventResponseChange instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EventResponseChange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventResponseChange
  * @throws IOException if the JSON string is invalid with respect to EventResponseChange
  */
  public static EventResponseChange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventResponseChange.class);
  }

 /**
  * Convert an instance of EventResponseChange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

