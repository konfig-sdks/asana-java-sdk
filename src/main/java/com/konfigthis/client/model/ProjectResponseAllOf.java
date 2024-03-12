/*
 * Asana
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/openapi/master/defs/asana_oas.yaml).
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
import com.konfigthis.client.model.CustomFieldCompact;
import com.konfigthis.client.model.ProjectBriefCompact;
import com.konfigthis.client.model.ProjectTemplateCompact;
import com.konfigthis.client.model.TeamCompact;
import com.konfigthis.client.model.UserCompact;
import com.konfigthis.client.model.WorkspaceCompact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * ProjectResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectResponseAllOf {
  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private List<CustomFieldCompact> customFields = null;

  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  private Boolean completed;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private OffsetDateTime completedAt;

  public static final String SERIALIZED_NAME_COMPLETED_BY = "completed_by";
  @SerializedName(SERIALIZED_NAME_COMPLETED_BY)
  private UserCompact completedBy;

  public static final String SERIALIZED_NAME_FOLLOWERS = "followers";
  @SerializedName(SERIALIZED_NAME_FOLLOWERS)
  private List<UserCompact> followers = null;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private UserCompact owner;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private TeamCompact team;

  /**
   * The icon for a project.
   */
  @JsonAdapter(IconEnum.Adapter.class)
 public enum IconEnum {
    LIST("list"),
    
    BOARD("board"),
    
    TIMELINE("timeline"),
    
    CALENDAR("calendar"),
    
    ROCKET("rocket"),
    
    PEOPLE("people"),
    
    GRAPH("graph"),
    
    STAR("star"),
    
    BUG("bug"),
    
    LIGHT_BULB("light_bulb"),
    
    GLOBE("globe"),
    
    GEAR("gear"),
    
    NOTEBOOK("notebook"),
    
    COMPUTER("computer"),
    
    CHECK("check"),
    
    TARGET("target"),
    
    HTML("html"),
    
    MEGAPHONE("megaphone"),
    
    CHAT_BUBBLES("chat_bubbles"),
    
    BRIEFCASE("briefcase"),
    
    PAGE_LAYOUT("page_layout"),
    
    MOUNTAIN_FLAG("mountain_flag"),
    
    PUZZLE("puzzle"),
    
    PRESENTATION("presentation"),
    
    LINE_AND_SYMBOLS("line_and_symbols"),
    
    SPEED_DIAL("speed_dial"),
    
    RIBBON("ribbon"),
    
    SHOE("shoe"),
    
    SHOPPING_BASKET("shopping_basket"),
    
    MAP("map"),
    
    TICKET("ticket"),
    
    COINS("coins");

    private String value;

    IconEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IconEnum fromValue(String value) {
      for (IconEnum b : IconEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IconEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IconEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IconEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IconEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private IconEnum icon;

  public static final String SERIALIZED_NAME_PERMALINK_URL = "permalink_url";
  @SerializedName(SERIALIZED_NAME_PERMALINK_URL)
  private String permalinkUrl;

  public static final String SERIALIZED_NAME_PROJECT_BRIEF = "project_brief";
  @SerializedName(SERIALIZED_NAME_PROJECT_BRIEF)
  private ProjectBriefCompact projectBrief;

  public static final String SERIALIZED_NAME_CREATED_FROM_TEMPLATE = "created_from_template";
  @SerializedName(SERIALIZED_NAME_CREATED_FROM_TEMPLATE)
  private ProjectTemplateCompact createdFromTemplate;

  public static final String SERIALIZED_NAME_WORKSPACE = "workspace";
  @SerializedName(SERIALIZED_NAME_WORKSPACE)
  private WorkspaceCompact workspace;

  public ProjectResponseAllOf() {
  }

  
  public ProjectResponseAllOf(
     List<CustomFieldCompact> customFields, 
     Boolean completed, 
     OffsetDateTime completedAt, 
     List<UserCompact> followers, 
     String permalinkUrl
  ) {
    this();
    this.customFields = customFields;
    this.completed = completed;
    this.completedAt = completedAt;
    this.followers = followers;
    this.permalinkUrl = permalinkUrl;
  }

   /**
   * Array of Custom Fields.
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of Custom Fields.")

  public List<CustomFieldCompact> getCustomFields() {
    return customFields;
  }




   /**
   * True if the project is currently marked complete, false if not.
   * @return completed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True if the project is currently marked complete, false if not.")

  public Boolean getCompleted() {
    return completed;
  }




   /**
   * The time at which this project was completed, or null if the project is not completed.
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-02-22T02:06:58.147Z", value = "The time at which this project was completed, or null if the project is not completed.")

  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }




  public ProjectResponseAllOf completedBy(UserCompact completedBy) {
    
    
    
    
    this.completedBy = completedBy;
    return this;
  }

   /**
   * Get completedBy
   * @return completedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserCompact getCompletedBy() {
    return completedBy;
  }


  public void setCompletedBy(UserCompact completedBy) {
    
    
    
    this.completedBy = completedBy;
  }


   /**
   * Array of users following this project. Followers are a subset of members who have opted in to receive \&quot;tasks added\&quot; notifications for a project.
   * @return followers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of users following this project. Followers are a subset of members who have opted in to receive \"tasks added\" notifications for a project.")

  public List<UserCompact> getFollowers() {
    return followers;
  }




  public ProjectResponseAllOf owner(UserCompact owner) {
    
    
    
    
    this.owner = owner;
    return this;
  }

   /**
   * The current owner of the project, may be null.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current owner of the project, may be null.")

  public UserCompact getOwner() {
    return owner;
  }


  public void setOwner(UserCompact owner) {
    
    
    
    this.owner = owner;
  }


  public ProjectResponseAllOf team(TeamCompact team) {
    
    
    
    
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TeamCompact getTeam() {
    return team;
  }


  public void setTeam(TeamCompact team) {
    
    
    
    this.team = team;
  }


  public ProjectResponseAllOf icon(IconEnum icon) {
    
    
    
    
    this.icon = icon;
    return this;
  }

   /**
   * The icon for a project.
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CHAT_BUBBLES", value = "The icon for a project.")

  public IconEnum getIcon() {
    return icon;
  }


  public void setIcon(IconEnum icon) {
    
    
    
    this.icon = icon;
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




  public ProjectResponseAllOf projectBrief(ProjectBriefCompact projectBrief) {
    
    
    
    
    this.projectBrief = projectBrief;
    return this;
  }

   /**
   * Get projectBrief
   * @return projectBrief
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectBriefCompact getProjectBrief() {
    return projectBrief;
  }


  public void setProjectBrief(ProjectBriefCompact projectBrief) {
    
    
    
    this.projectBrief = projectBrief;
  }


  public ProjectResponseAllOf createdFromTemplate(ProjectTemplateCompact createdFromTemplate) {
    
    
    
    
    this.createdFromTemplate = createdFromTemplate;
    return this;
  }

   /**
   * Get createdFromTemplate
   * @return createdFromTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectTemplateCompact getCreatedFromTemplate() {
    return createdFromTemplate;
  }


  public void setCreatedFromTemplate(ProjectTemplateCompact createdFromTemplate) {
    
    
    
    this.createdFromTemplate = createdFromTemplate;
  }


  public ProjectResponseAllOf workspace(WorkspaceCompact workspace) {
    
    
    
    
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
   * @return the ProjectResponseAllOf instance itself
   */
  public ProjectResponseAllOf putAdditionalProperty(String key, Object value) {
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
    ProjectResponseAllOf projectResponseAllOf = (ProjectResponseAllOf) o;
    return Objects.equals(this.customFields, projectResponseAllOf.customFields) &&
        Objects.equals(this.completed, projectResponseAllOf.completed) &&
        Objects.equals(this.completedAt, projectResponseAllOf.completedAt) &&
        Objects.equals(this.completedBy, projectResponseAllOf.completedBy) &&
        Objects.equals(this.followers, projectResponseAllOf.followers) &&
        Objects.equals(this.owner, projectResponseAllOf.owner) &&
        Objects.equals(this.team, projectResponseAllOf.team) &&
        Objects.equals(this.icon, projectResponseAllOf.icon) &&
        Objects.equals(this.permalinkUrl, projectResponseAllOf.permalinkUrl) &&
        Objects.equals(this.projectBrief, projectResponseAllOf.projectBrief) &&
        Objects.equals(this.createdFromTemplate, projectResponseAllOf.createdFromTemplate) &&
        Objects.equals(this.workspace, projectResponseAllOf.workspace)&&
        Objects.equals(this.additionalProperties, projectResponseAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFields, completed, completedAt, completedBy, followers, owner, team, icon, permalinkUrl, projectBrief, createdFromTemplate, workspace, additionalProperties);
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
    sb.append("class ProjectResponseAllOf {\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    completedBy: ").append(toIndentedString(completedBy)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
    sb.append("    projectBrief: ").append(toIndentedString(projectBrief)).append("\n");
    sb.append("    createdFromTemplate: ").append(toIndentedString(createdFromTemplate)).append("\n");
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
    openapiFields.add("custom_fields");
    openapiFields.add("completed");
    openapiFields.add("completed_at");
    openapiFields.add("completed_by");
    openapiFields.add("followers");
    openapiFields.add("owner");
    openapiFields.add("team");
    openapiFields.add("icon");
    openapiFields.add("permalink_url");
    openapiFields.add("project_brief");
    openapiFields.add("created_from_template");
    openapiFields.add("workspace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectResponseAllOf is not found in the empty JSON string", ProjectResponseAllOf.openapiRequiredFields.toString()));
        }
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
            CustomFieldCompact.validateJsonObject(jsonArraycustomFields.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `completed_by`
      if (jsonObj.get("completed_by") != null && !jsonObj.get("completed_by").isJsonNull()) {
        UserCompact.validateJsonObject(jsonObj.getAsJsonObject("completed_by"));
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
      // validate the optional field `owner`
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) {
        UserCompact.validateJsonObject(jsonObj.getAsJsonObject("owner"));
      }
      // validate the optional field `team`
      if (jsonObj.get("team") != null && !jsonObj.get("team").isJsonNull()) {
        TeamCompact.validateJsonObject(jsonObj.getAsJsonObject("team"));
      }
      if (!jsonObj.get("icon").isJsonNull() && (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if ((jsonObj.get("permalink_url") != null && !jsonObj.get("permalink_url").isJsonNull()) && !jsonObj.get("permalink_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permalink_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permalink_url").toString()));
      }
      // validate the optional field `project_brief`
      if (jsonObj.get("project_brief") != null && !jsonObj.get("project_brief").isJsonNull()) {
        ProjectBriefCompact.validateJsonObject(jsonObj.getAsJsonObject("project_brief"));
      }
      // validate the optional field `created_from_template`
      if (jsonObj.get("created_from_template") != null && !jsonObj.get("created_from_template").isJsonNull()) {
        ProjectTemplateCompact.validateJsonObject(jsonObj.getAsJsonObject("created_from_template"));
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
       if (!ProjectResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectResponseAllOf>() {
           @Override
           public void write(JsonWriter out, ProjectResponseAllOf value) throws IOException {
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
           public ProjectResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to ProjectResponseAllOf
  */
  public static ProjectResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectResponseAllOf.class);
  }

 /**
  * Convert an instance of ProjectResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

