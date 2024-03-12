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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * GoalRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GoalRequest {
  public static final String SERIALIZED_NAME_GID = "gid";
  @SerializedName(SERIALIZED_NAME_GID)
  private String gid;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HTML_NOTES = "html_notes";
  @SerializedName(SERIALIZED_NAME_HTML_NOTES)
  private String htmlNotes;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_DUE_ON = "due_on";
  @SerializedName(SERIALIZED_NAME_DUE_ON)
  private String dueOn;

  public static final String SERIALIZED_NAME_START_ON = "start_on";
  @SerializedName(SERIALIZED_NAME_START_ON)
  private String startOn;

  public static final String SERIALIZED_NAME_IS_WORKSPACE_LEVEL = "is_workspace_level";
  @SerializedName(SERIALIZED_NAME_IS_WORKSPACE_LEVEL)
  private Boolean isWorkspaceLevel;

  public static final String SERIALIZED_NAME_LIKED = "liked";
  @SerializedName(SERIALIZED_NAME_LIKED)
  private Boolean liked;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private String team;

  public static final String SERIALIZED_NAME_WORKSPACE = "workspace";
  @SerializedName(SERIALIZED_NAME_WORKSPACE)
  private String workspace;

  public static final String SERIALIZED_NAME_TIME_PERIOD = "time_period";
  @SerializedName(SERIALIZED_NAME_TIME_PERIOD)
  private String timePeriod;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_FOLLOWERS = "followers";
  @SerializedName(SERIALIZED_NAME_FOLLOWERS)
  private List<String> followers = null;

  public GoalRequest() {
  }

  
  public GoalRequest(
     String gid, 
     String resourceType
  ) {
    this();
    this.gid = gid;
    this.resourceType = resourceType;
  }

   /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "Globally unique identifier of the resource, as a string.")

  public String getGid() {
    return gid;
  }




   /**
   * The base type of this resource.
   * @return resourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "task", value = "The base type of this resource.")

  public String getResourceType() {
    return resourceType;
  }




  public GoalRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the goal.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Grow web traffic by 30%", value = "The name of the goal.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public GoalRequest htmlNotes(String htmlNotes) {
    
    
    
    
    this.htmlNotes = htmlNotes;
    return this;
  }

   /**
   * The notes of the goal with formatting as HTML.
   * @return htmlNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<body>Start building brand awareness.</body>", value = "The notes of the goal with formatting as HTML.")

  public String getHtmlNotes() {
    return htmlNotes;
  }


  public void setHtmlNotes(String htmlNotes) {
    
    
    
    this.htmlNotes = htmlNotes;
  }


  public GoalRequest notes(String notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Free-form textual information associated with the goal (i.e. its description).
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Start building brand awareness.", value = "Free-form textual information associated with the goal (i.e. its description).")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    
    this.notes = notes;
  }


  public GoalRequest dueOn(String dueOn) {
    
    
    
    
    this.dueOn = dueOn;
    return this;
  }

   /**
   * The localized day on which this goal is due. This takes a date with format &#x60;YYYY-MM-DD&#x60;.
   * @return dueOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-15", value = "The localized day on which this goal is due. This takes a date with format `YYYY-MM-DD`.")

  public String getDueOn() {
    return dueOn;
  }


  public void setDueOn(String dueOn) {
    
    
    
    this.dueOn = dueOn;
  }


  public GoalRequest startOn(String startOn) {
    
    
    
    
    this.startOn = startOn;
    return this;
  }

   /**
   * The day on which work for this goal begins, or null if the goal has no start date. This takes a date with &#x60;YYYY-MM-DD&#x60; format, and cannot be set unless there is an accompanying due date.
   * @return startOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-14", value = "The day on which work for this goal begins, or null if the goal has no start date. This takes a date with `YYYY-MM-DD` format, and cannot be set unless there is an accompanying due date.")

  public String getStartOn() {
    return startOn;
  }


  public void setStartOn(String startOn) {
    
    
    
    this.startOn = startOn;
  }


  public GoalRequest isWorkspaceLevel(Boolean isWorkspaceLevel) {
    
    
    
    
    this.isWorkspaceLevel = isWorkspaceLevel;
    return this;
  }

   /**
   * *Conditional*. This property is only present when the &#x60;workspace&#x60; provided is an organization. Whether the goal belongs to the &#x60;workspace&#x60; (and is listed as part of the workspace’s goals) or not. If it isn’t a workspace-level goal, it is a team-level goal, and is associated with the goal’s team.
   * @return isWorkspaceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "*Conditional*. This property is only present when the `workspace` provided is an organization. Whether the goal belongs to the `workspace` (and is listed as part of the workspace’s goals) or not. If it isn’t a workspace-level goal, it is a team-level goal, and is associated with the goal’s team.")

  public Boolean getIsWorkspaceLevel() {
    return isWorkspaceLevel;
  }


  public void setIsWorkspaceLevel(Boolean isWorkspaceLevel) {
    
    
    
    this.isWorkspaceLevel = isWorkspaceLevel;
  }


  public GoalRequest liked(Boolean liked) {
    
    
    
    
    this.liked = liked;
    return this;
  }

   /**
   * True if the goal is liked by the authorized user, false if not.
   * @return liked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True if the goal is liked by the authorized user, false if not.")

  public Boolean getLiked() {
    return liked;
  }


  public void setLiked(Boolean liked) {
    
    
    
    this.liked = liked;
  }


  public GoalRequest team(String team) {
    
    
    
    
    this.team = team;
    return this;
  }

   /**
   * *Conditional*. This property is only present when the &#x60;workspace&#x60; provided is an organization.
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "*Conditional*. This property is only present when the `workspace` provided is an organization.")

  public String getTeam() {
    return team;
  }


  public void setTeam(String team) {
    
    
    
    this.team = team;
  }


  public GoalRequest workspace(String workspace) {
    
    
    
    
    this.workspace = workspace;
    return this;
  }

   /**
   * The &#x60;gid&#x60; of a workspace.
   * @return workspace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "The `gid` of a workspace.")

  public String getWorkspace() {
    return workspace;
  }


  public void setWorkspace(String workspace) {
    
    
    
    this.workspace = workspace;
  }


  public GoalRequest timePeriod(String timePeriod) {
    
    
    
    
    this.timePeriod = timePeriod;
    return this;
  }

   /**
   * The &#x60;gid&#x60; of a time period.
   * @return timePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "The `gid` of a time period.")

  public String getTimePeriod() {
    return timePeriod;
  }


  public void setTimePeriod(String timePeriod) {
    
    
    
    this.timePeriod = timePeriod;
  }


  public GoalRequest owner(String owner) {
    
    
    
    
    this.owner = owner;
    return this;
  }

   /**
   * The &#x60;gid&#x60; of a user.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "The `gid` of a user.")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    
    
    
    this.owner = owner;
  }


  public GoalRequest followers(List<String> followers) {
    
    
    
    
    this.followers = followers;
    return this;
  }

  public GoalRequest addFollowersItem(String followersItem) {
    if (this.followers == null) {
      this.followers = new ArrayList<>();
    }
    this.followers.add(followersItem);
    return this;
  }

   /**
   * Get followers
   * @return followers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"12345\"]", value = "")

  public List<String> getFollowers() {
    return followers;
  }


  public void setFollowers(List<String> followers) {
    
    
    
    this.followers = followers;
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
   * @return the GoalRequest instance itself
   */
  public GoalRequest putAdditionalProperty(String key, Object value) {
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
    GoalRequest goalRequest = (GoalRequest) o;
    return Objects.equals(this.gid, goalRequest.gid) &&
        Objects.equals(this.resourceType, goalRequest.resourceType) &&
        Objects.equals(this.name, goalRequest.name) &&
        Objects.equals(this.htmlNotes, goalRequest.htmlNotes) &&
        Objects.equals(this.notes, goalRequest.notes) &&
        Objects.equals(this.dueOn, goalRequest.dueOn) &&
        Objects.equals(this.startOn, goalRequest.startOn) &&
        Objects.equals(this.isWorkspaceLevel, goalRequest.isWorkspaceLevel) &&
        Objects.equals(this.liked, goalRequest.liked) &&
        Objects.equals(this.team, goalRequest.team) &&
        Objects.equals(this.workspace, goalRequest.workspace) &&
        Objects.equals(this.timePeriod, goalRequest.timePeriod) &&
        Objects.equals(this.owner, goalRequest.owner) &&
        Objects.equals(this.followers, goalRequest.followers)&&
        Objects.equals(this.additionalProperties, goalRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, htmlNotes, notes, dueOn, startOn, isWorkspaceLevel, liked, team, workspace, timePeriod, owner, followers, additionalProperties);
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
    sb.append("class GoalRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    htmlNotes: ").append(toIndentedString(htmlNotes)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    isWorkspaceLevel: ").append(toIndentedString(isWorkspaceLevel)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
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
    openapiFields.add("resource_type");
    openapiFields.add("name");
    openapiFields.add("html_notes");
    openapiFields.add("notes");
    openapiFields.add("due_on");
    openapiFields.add("start_on");
    openapiFields.add("is_workspace_level");
    openapiFields.add("liked");
    openapiFields.add("team");
    openapiFields.add("workspace");
    openapiFields.add("time_period");
    openapiFields.add("owner");
    openapiFields.add("followers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoalRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GoalRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoalRequest is not found in the empty JSON string", GoalRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("gid") != null && !jsonObj.get("gid").isJsonNull()) && !jsonObj.get("gid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gid").toString()));
      }
      if ((jsonObj.get("resource_type") != null && !jsonObj.get("resource_type").isJsonNull()) && !jsonObj.get("resource_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_type").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("html_notes") != null && !jsonObj.get("html_notes").isJsonNull()) && !jsonObj.get("html_notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_notes").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if (!jsonObj.get("due_on").isJsonNull() && (jsonObj.get("due_on") != null && !jsonObj.get("due_on").isJsonNull()) && !jsonObj.get("due_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `due_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("due_on").toString()));
      }
      if (!jsonObj.get("start_on").isJsonNull() && (jsonObj.get("start_on") != null && !jsonObj.get("start_on").isJsonNull()) && !jsonObj.get("start_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_on").toString()));
      }
      if (!jsonObj.get("team").isJsonNull() && (jsonObj.get("team") != null && !jsonObj.get("team").isJsonNull()) && !jsonObj.get("team").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team").toString()));
      }
      if ((jsonObj.get("workspace") != null && !jsonObj.get("workspace").isJsonNull()) && !jsonObj.get("workspace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workspace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workspace").toString()));
      }
      if (!jsonObj.get("time_period").isJsonNull() && (jsonObj.get("time_period") != null && !jsonObj.get("time_period").isJsonNull()) && !jsonObj.get("time_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_period").toString()));
      }
      if (!jsonObj.get("owner").isJsonNull() && (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("followers") != null && !jsonObj.get("followers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `followers` to be an array in the JSON string but got `%s`", jsonObj.get("followers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoalRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoalRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoalRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoalRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GoalRequest>() {
           @Override
           public void write(JsonWriter out, GoalRequest value) throws IOException {
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
           public GoalRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GoalRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GoalRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoalRequest
  * @throws IOException if the JSON string is invalid with respect to GoalRequest
  */
  public static GoalRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoalRequest.class);
  }

 /**
  * Convert an instance of GoalRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

