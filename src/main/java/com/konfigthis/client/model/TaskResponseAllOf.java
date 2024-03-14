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
import com.konfigthis.client.model.CustomFieldResponse;
import com.konfigthis.client.model.ProjectCompact;
import com.konfigthis.client.model.SectionCompact;
import com.konfigthis.client.model.TagCompact;
import com.konfigthis.client.model.TaskCompact;
import com.konfigthis.client.model.UserCompact;
import com.konfigthis.client.model.WorkspaceCompact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * TaskResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaskResponseAllOf {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<TagCompact> tags = null;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private UserCompact assignee;

  public static final String SERIALIZED_NAME_ASSIGNEE_SECTION = "assignee_section";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE_SECTION)
  private SectionCompact assigneeSection;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private List<CustomFieldResponse> customFields = null;

  public static final String SERIALIZED_NAME_FOLLOWERS = "followers";
  @SerializedName(SERIALIZED_NAME_FOLLOWERS)
  private List<UserCompact> followers = null;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private TaskCompact parent;

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<ProjectCompact> projects = null;

  public static final String SERIALIZED_NAME_WORKSPACE = "workspace";
  @SerializedName(SERIALIZED_NAME_WORKSPACE)
  private WorkspaceCompact workspace;

  public static final String SERIALIZED_NAME_PERMALINK_URL = "permalink_url";
  @SerializedName(SERIALIZED_NAME_PERMALINK_URL)
  private String permalinkUrl;

  public TaskResponseAllOf() {
  }

  
  public TaskResponseAllOf(
     List<TagCompact> tags, 
     List<CustomFieldResponse> customFields, 
     List<UserCompact> followers, 
     List<ProjectCompact> projects, 
     String permalinkUrl
  ) {
    this();
    this.tags = tags;
    this.customFields = customFields;
    this.followers = followers;
    this.projects = projects;
    this.permalinkUrl = permalinkUrl;
  }

   /**
   * Array of tags associated with this task. In order to change tags on an existing task use &#x60;addTag&#x60; and &#x60;removeTag&#x60;.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"gid\":\"59746\",\"name\":\"Grade A\"}]", value = "Array of tags associated with this task. In order to change tags on an existing task use `addTag` and `removeTag`.")

  public List<TagCompact> getTags() {
    return tags;
  }




  public TaskResponseAllOf assignee(UserCompact assignee) {
    
    
    
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserCompact getAssignee() {
    return assignee;
  }


  public void setAssignee(UserCompact assignee) {
    
    
    
    this.assignee = assignee;
  }


  public TaskResponseAllOf assigneeSection(SectionCompact assigneeSection) {
    
    
    
    
    this.assigneeSection = assigneeSection;
    return this;
  }

   /**
   * Get assigneeSection
   * @return assigneeSection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SectionCompact getAssigneeSection() {
    return assigneeSection;
  }


  public void setAssigneeSection(SectionCompact assigneeSection) {
    
    
    
    this.assigneeSection = assigneeSection;
  }


   /**
   * Array of custom field values applied to the task. These represent the custom field values recorded on this project for a particular custom field. For example, these custom field values will contain an &#x60;enum_value&#x60; property for custom fields of type &#x60;enum&#x60;, a &#x60;text_value&#x60; property for custom fields of type &#x60;text&#x60;, and so on. Please note that the &#x60;gid&#x60; returned on each custom field value *is identical* to the &#x60;gid&#x60; of the custom field, which allows referencing the custom field metadata through the &#x60;/custom_fields/custom_field-gid&#x60; endpoint.
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of custom field values applied to the task. These represent the custom field values recorded on this project for a particular custom field. For example, these custom field values will contain an `enum_value` property for custom fields of type `enum`, a `text_value` property for custom fields of type `text`, and so on. Please note that the `gid` returned on each custom field value *is identical* to the `gid` of the custom field, which allows referencing the custom field metadata through the `/custom_fields/custom_field-gid` endpoint.")

  public List<CustomFieldResponse> getCustomFields() {
    return customFields;
  }




   /**
   * Array of users following this task.
   * @return followers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of users following this task.")

  public List<UserCompact> getFollowers() {
    return followers;
  }




  public TaskResponseAllOf parent(TaskCompact parent) {
    
    
    
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskCompact getParent() {
    return parent;
  }


  public void setParent(TaskCompact parent) {
    
    
    
    this.parent = parent;
  }


   /**
   * *Create-only.* Array of projects this task is associated with. At task creation time, this array can be used to add the task to many projects at once. After task creation, these associations can be modified using the addProject and removeProject endpoints.
   * @return projects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*Create-only.* Array of projects this task is associated with. At task creation time, this array can be used to add the task to many projects at once. After task creation, these associations can be modified using the addProject and removeProject endpoints.")

  public List<ProjectCompact> getProjects() {
    return projects;
  }




  public TaskResponseAllOf workspace(WorkspaceCompact workspace) {
    
    
    
    
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
   * A url that points directly to the object within Asana.
   * @return permalinkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://app.asana.com/0/resource/123456789/list", value = "A url that points directly to the object within Asana.")

  public String getPermalinkUrl() {
    return permalinkUrl;
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
   * @return the TaskResponseAllOf instance itself
   */
  public TaskResponseAllOf putAdditionalProperty(String key, Object value) {
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
    TaskResponseAllOf taskResponseAllOf = (TaskResponseAllOf) o;
    return Objects.equals(this.tags, taskResponseAllOf.tags) &&
        Objects.equals(this.assignee, taskResponseAllOf.assignee) &&
        Objects.equals(this.assigneeSection, taskResponseAllOf.assigneeSection) &&
        Objects.equals(this.customFields, taskResponseAllOf.customFields) &&
        Objects.equals(this.followers, taskResponseAllOf.followers) &&
        Objects.equals(this.parent, taskResponseAllOf.parent) &&
        Objects.equals(this.projects, taskResponseAllOf.projects) &&
        Objects.equals(this.workspace, taskResponseAllOf.workspace) &&
        Objects.equals(this.permalinkUrl, taskResponseAllOf.permalinkUrl)&&
        Objects.equals(this.additionalProperties, taskResponseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, assignee, assigneeSection, customFields, followers, parent, projects, workspace, permalinkUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskResponseAllOf {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assigneeSection: ").append(toIndentedString(assigneeSection)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("assignee");
    openapiFields.add("assignee_section");
    openapiFields.add("custom_fields");
    openapiFields.add("followers");
    openapiFields.add("parent");
    openapiFields.add("projects");
    openapiFields.add("workspace");
    openapiFields.add("permalink_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaskResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaskResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskResponseAllOf is not found in the empty JSON string", TaskResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            TagCompact.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `assignee`
      if (jsonObj.get("assignee") != null && !jsonObj.get("assignee").isJsonNull()) {
        UserCompact.validateJsonObject(jsonObj.getAsJsonObject("assignee"));
      }
      // validate the optional field `assignee_section`
      if (jsonObj.get("assignee_section") != null && !jsonObj.get("assignee_section").isJsonNull()) {
        SectionCompact.validateJsonObject(jsonObj.getAsJsonObject("assignee_section"));
      }
      if (jsonObj.get("custom_fields") != null && !jsonObj.get("custom_fields").isJsonNull()) {
        JsonArray jsonArraycustomFields = jsonObj.getAsJsonArray("custom_fields");
        if (jsonArraycustomFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("custom_fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `custom_fields` to be an array in the JSON string but got `%s`", jsonObj.get("custom_fields").toString()));
          }

          // validate the optional field `custom_fields` (array)
          for (int i = 0; i < jsonArraycustomFields.size(); i++) {
            CustomFieldResponse.validateJsonObject(jsonArraycustomFields.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("followers") != null && !jsonObj.get("followers").isJsonNull()) {
        JsonArray jsonArrayfollowers = jsonObj.getAsJsonArray("followers");
        if (jsonArrayfollowers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("followers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `followers` to be an array in the JSON string but got `%s`", jsonObj.get("followers").toString()));
          }

          // validate the optional field `followers` (array)
          for (int i = 0; i < jsonArrayfollowers.size(); i++) {
            UserCompact.validateJsonObject(jsonArrayfollowers.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `parent`
      if (jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) {
        TaskCompact.validateJsonObject(jsonObj.getAsJsonObject("parent"));
      }
      if (jsonObj.get("projects") != null && !jsonObj.get("projects").isJsonNull()) {
        JsonArray jsonArrayprojects = jsonObj.getAsJsonArray("projects");
        if (jsonArrayprojects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("projects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `projects` to be an array in the JSON string but got `%s`", jsonObj.get("projects").toString()));
          }

          // validate the optional field `projects` (array)
          for (int i = 0; i < jsonArrayprojects.size(); i++) {
            ProjectCompact.validateJsonObject(jsonArrayprojects.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `workspace`
      if (jsonObj.get("workspace") != null && !jsonObj.get("workspace").isJsonNull()) {
        WorkspaceCompact.validateJsonObject(jsonObj.getAsJsonObject("workspace"));
      }
      if ((jsonObj.get("permalink_url") != null && !jsonObj.get("permalink_url").isJsonNull()) && !jsonObj.get("permalink_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permalink_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permalink_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskResponseAllOf>() {
           @Override
           public void write(JsonWriter out, TaskResponseAllOf value) throws IOException {
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
           public TaskResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaskResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaskResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to TaskResponseAllOf
  */
  public static TaskResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskResponseAllOf.class);
  }

 /**
  * Convert an instance of TaskResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

