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
import com.konfigthis.client.model.ProjectDuplicateRequestScheduleDates;
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
 * ProjectDuplicateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectDuplicateRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private String team;

  public static final String SERIALIZED_NAME_INCLUDE = "include";
  @SerializedName(SERIALIZED_NAME_INCLUDE)
  private String include;

  public static final String SERIALIZED_NAME_SCHEDULE_DATES = "schedule_dates";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_DATES)
  private ProjectDuplicateRequestScheduleDates scheduleDates;

  public ProjectDuplicateRequest() {
  }

  public ProjectDuplicateRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the new project.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "New Project Name", required = true, value = "The name of the new project.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ProjectDuplicateRequest team(String team) {
    
    
    
    
    this.team = team;
    return this;
  }

   /**
   * Sets the team of the new project. If team is not defined, the new project will be in the same team as the the original project.
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "Sets the team of the new project. If team is not defined, the new project will be in the same team as the the original project.")

  public String getTeam() {
    return team;
  }


  public void setTeam(String team) {
    
    
    
    this.team = team;
  }


  public ProjectDuplicateRequest include(String include) {
    
    
    
    
    this.include = include;
    return this;
  }

   /**
   * A comma-separated list of elements that will be duplicated to the new project. Tasks are always included. ##### Fields - allocations - forms - members - notes - task_assignee - task_attachments - task_dates - task_dependencies - task_followers - task_notes - task_projects - task_subtasks - task_tags
   * @return include
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"allocations,members,notes,forms,task_notes,task_assignee,task_subtasks,task_attachments,task_dates,task_dependencies,task_followers,task_tags,task_projects\"]", value = "A comma-separated list of elements that will be duplicated to the new project. Tasks are always included. ##### Fields - allocations - forms - members - notes - task_assignee - task_attachments - task_dates - task_dependencies - task_followers - task_notes - task_projects - task_subtasks - task_tags")

  public String getInclude() {
    return include;
  }


  public void setInclude(String include) {
    
    
    
    this.include = include;
  }


  public ProjectDuplicateRequest scheduleDates(ProjectDuplicateRequestScheduleDates scheduleDates) {
    
    
    
    
    this.scheduleDates = scheduleDates;
    return this;
  }

   /**
   * Get scheduleDates
   * @return scheduleDates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectDuplicateRequestScheduleDates getScheduleDates() {
    return scheduleDates;
  }


  public void setScheduleDates(ProjectDuplicateRequestScheduleDates scheduleDates) {
    
    
    
    this.scheduleDates = scheduleDates;
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
   * @return the ProjectDuplicateRequest instance itself
   */
  public ProjectDuplicateRequest putAdditionalProperty(String key, Object value) {
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
    ProjectDuplicateRequest projectDuplicateRequest = (ProjectDuplicateRequest) o;
    return Objects.equals(this.name, projectDuplicateRequest.name) &&
        Objects.equals(this.team, projectDuplicateRequest.team) &&
        Objects.equals(this.include, projectDuplicateRequest.include) &&
        Objects.equals(this.scheduleDates, projectDuplicateRequest.scheduleDates)&&
        Objects.equals(this.additionalProperties, projectDuplicateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, team, include, scheduleDates, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDuplicateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    scheduleDates: ").append(toIndentedString(scheduleDates)).append("\n");
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
    openapiFields.add("team");
    openapiFields.add("include");
    openapiFields.add("schedule_dates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectDuplicateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectDuplicateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectDuplicateRequest is not found in the empty JSON string", ProjectDuplicateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectDuplicateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("team") != null && !jsonObj.get("team").isJsonNull()) && !jsonObj.get("team").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team").toString()));
      }
      if ((jsonObj.get("include") != null && !jsonObj.get("include").isJsonNull()) && !jsonObj.get("include").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `include` to be a primitive type in the JSON string but got `%s`", jsonObj.get("include").toString()));
      }
      // validate the optional field `schedule_dates`
      if (jsonObj.get("schedule_dates") != null && !jsonObj.get("schedule_dates").isJsonNull()) {
        ProjectDuplicateRequestScheduleDates.validateJsonObject(jsonObj.getAsJsonObject("schedule_dates"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectDuplicateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectDuplicateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectDuplicateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectDuplicateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectDuplicateRequest>() {
           @Override
           public void write(JsonWriter out, ProjectDuplicateRequest value) throws IOException {
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
           public ProjectDuplicateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectDuplicateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectDuplicateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectDuplicateRequest
  * @throws IOException if the JSON string is invalid with respect to ProjectDuplicateRequest
  */
  public static ProjectDuplicateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectDuplicateRequest.class);
  }

 /**
  * Convert an instance of ProjectDuplicateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

