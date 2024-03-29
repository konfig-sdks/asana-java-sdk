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
import com.konfigthis.client.model.UserCompact;
import com.konfigthis.client.model.WorkspaceCompact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * A user task list represents the tasks assigned to a particular user. It provides API access to a user’s [My Tasks](https://asana.com/guide/help/fundamentals/my-tasks) view in Asana.
 */
@ApiModel(description = "A user task list represents the tasks assigned to a particular user. It provides API access to a user’s [My Tasks](https://asana.com/guide/help/fundamentals/my-tasks) view in Asana.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UserTaskListCompactAllOf {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private UserCompact owner;

  public static final String SERIALIZED_NAME_WORKSPACE = "workspace";
  @SerializedName(SERIALIZED_NAME_WORKSPACE)
  private WorkspaceCompact workspace;

  public UserTaskListCompactAllOf() {
  }

  public UserTaskListCompactAllOf name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the user task list.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Tasks in My Workspace", value = "The name of the user task list.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public UserTaskListCompactAllOf owner(UserCompact owner) {
    
    
    
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserCompact getOwner() {
    return owner;
  }


  public void setOwner(UserCompact owner) {
    
    
    
    this.owner = owner;
  }


  public UserTaskListCompactAllOf workspace(WorkspaceCompact workspace) {
    
    
    
    
    this.workspace = workspace;
    return this;
  }

   /**
   * Get workspace
   * @return workspace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkspaceCompact getWorkspace() {
    return workspace;
  }


  public void setWorkspace(WorkspaceCompact workspace) {
    
    
    
    this.workspace = workspace;
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
   * @return the UserTaskListCompactAllOf instance itself
   */
  public UserTaskListCompactAllOf putAdditionalProperty(String key, Object value) {
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
    UserTaskListCompactAllOf userTaskListCompactAllOf = (UserTaskListCompactAllOf) o;
    return Objects.equals(this.name, userTaskListCompactAllOf.name) &&
        Objects.equals(this.owner, userTaskListCompactAllOf.owner) &&
        Objects.equals(this.workspace, userTaskListCompactAllOf.workspace)&&
        Objects.equals(this.additionalProperties, userTaskListCompactAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, owner, workspace, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTaskListCompactAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("owner");
    openapiFields.add("workspace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserTaskListCompactAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserTaskListCompactAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserTaskListCompactAllOf is not found in the empty JSON string", UserTaskListCompactAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `owner`
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) {
        UserCompact.validateJsonObject(jsonObj.getAsJsonObject("owner"));
      }
      // validate the optional field `workspace`
      if (jsonObj.get("workspace") != null && !jsonObj.get("workspace").isJsonNull()) {
        WorkspaceCompact.validateJsonObject(jsonObj.getAsJsonObject("workspace"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserTaskListCompactAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserTaskListCompactAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserTaskListCompactAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserTaskListCompactAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<UserTaskListCompactAllOf>() {
           @Override
           public void write(JsonWriter out, UserTaskListCompactAllOf value) throws IOException {
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
           public UserTaskListCompactAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserTaskListCompactAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserTaskListCompactAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserTaskListCompactAllOf
  * @throws IOException if the JSON string is invalid with respect to UserTaskListCompactAllOf
  */
  public static UserTaskListCompactAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserTaskListCompactAllOf.class);
  }

 /**
  * Convert an instance of UserTaskListCompactAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

