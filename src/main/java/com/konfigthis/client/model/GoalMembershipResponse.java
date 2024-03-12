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
import com.konfigthis.client.model.GoalCompact;
import com.konfigthis.client.model.MemberCompact;
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
 * GoalMembershipResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GoalMembershipResponse {
  public static final String SERIALIZED_NAME_GID = "gid";
  @SerializedName(SERIALIZED_NAME_GID)
  private String gid;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_RESOURCE_SUBTYPE = "resource_subtype";
  @SerializedName(SERIALIZED_NAME_RESOURCE_SUBTYPE)
  private String resourceSubtype;

  public static final String SERIALIZED_NAME_MEMBER = "member";
  @SerializedName(SERIALIZED_NAME_MEMBER)
  private MemberCompact member;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private GoalCompact parent;

  /**
   * Describes if the member is a commenter or editor in goal.
   */
  @JsonAdapter(RoleEnum.Adapter.class)
 public enum RoleEnum {
    COMMENTER("commenter"),
    
    EDITOR("editor");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleEnum role;

  public static final String SERIALIZED_NAME_GOAL = "goal";
  @SerializedName(SERIALIZED_NAME_GOAL)
  private GoalCompact goal;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserCompact user;

  public static final String SERIALIZED_NAME_WORKSPACE = "workspace";
  @SerializedName(SERIALIZED_NAME_WORKSPACE)
  private WorkspaceCompact workspace;

  public GoalMembershipResponse() {
  }

  
  public GoalMembershipResponse(
     String gid, 
     String resourceSubtype
  ) {
    this();
    this.gid = gid;
    this.resourceSubtype = resourceSubtype;
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




  public GoalMembershipResponse resourceType(String resourceType) {
    
    
    
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * The base type of this resource.
   * @return resourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "membership", value = "The base type of this resource.")

  public String getResourceType() {
    return resourceType;
  }


  public void setResourceType(String resourceType) {
    
    
    
    this.resourceType = resourceType;
  }


   /**
   * The type of membership.
   * @return resourceSubtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "goal_membership", value = "The type of membership.")

  public String getResourceSubtype() {
    return resourceSubtype;
  }




  public GoalMembershipResponse member(MemberCompact member) {
    
    
    
    
    this.member = member;
    return this;
  }

   /**
   * Get member
   * @return member
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MemberCompact getMember() {
    return member;
  }


  public void setMember(MemberCompact member) {
    
    
    
    this.member = member;
  }


  public GoalMembershipResponse parent(GoalCompact parent) {
    
    
    
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GoalCompact getParent() {
    return parent;
  }


  public void setParent(GoalCompact parent) {
    
    
    
    this.parent = parent;
  }


  public GoalMembershipResponse role(RoleEnum role) {
    
    
    
    
    this.role = role;
    return this;
  }

   /**
   * Describes if the member is a commenter or editor in goal.
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EDITOR", value = "Describes if the member is a commenter or editor in goal.")

  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    
    
    
    this.role = role;
  }


  public GoalMembershipResponse goal(GoalCompact goal) {
    
    
    
    
    this.goal = goal;
    return this;
  }

   /**
   * Get goal
   * @return goal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GoalCompact getGoal() {
    return goal;
  }


  public void setGoal(GoalCompact goal) {
    
    
    
    this.goal = goal;
  }


  public GoalMembershipResponse user(UserCompact user) {
    
    
    
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserCompact getUser() {
    return user;
  }


  public void setUser(UserCompact user) {
    
    
    
    this.user = user;
  }


  public GoalMembershipResponse workspace(WorkspaceCompact workspace) {
    
    
    
    
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
   * @return the GoalMembershipResponse instance itself
   */
  public GoalMembershipResponse putAdditionalProperty(String key, Object value) {
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
    GoalMembershipResponse goalMembershipResponse = (GoalMembershipResponse) o;
    return Objects.equals(this.gid, goalMembershipResponse.gid) &&
        Objects.equals(this.resourceType, goalMembershipResponse.resourceType) &&
        Objects.equals(this.resourceSubtype, goalMembershipResponse.resourceSubtype) &&
        Objects.equals(this.member, goalMembershipResponse.member) &&
        Objects.equals(this.parent, goalMembershipResponse.parent) &&
        Objects.equals(this.role, goalMembershipResponse.role) &&
        Objects.equals(this.goal, goalMembershipResponse.goal) &&
        Objects.equals(this.user, goalMembershipResponse.user) &&
        Objects.equals(this.workspace, goalMembershipResponse.workspace)&&
        Objects.equals(this.additionalProperties, goalMembershipResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, resourceSubtype, member, parent, role, goal, user, workspace, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalMembershipResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("gid");
    openapiFields.add("resource_type");
    openapiFields.add("resource_subtype");
    openapiFields.add("member");
    openapiFields.add("parent");
    openapiFields.add("role");
    openapiFields.add("goal");
    openapiFields.add("user");
    openapiFields.add("workspace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoalMembershipResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GoalMembershipResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoalMembershipResponse is not found in the empty JSON string", GoalMembershipResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("gid") != null && !jsonObj.get("gid").isJsonNull()) && !jsonObj.get("gid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gid").toString()));
      }
      if ((jsonObj.get("resource_type") != null && !jsonObj.get("resource_type").isJsonNull()) && !jsonObj.get("resource_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_type").toString()));
      }
      if ((jsonObj.get("resource_subtype") != null && !jsonObj.get("resource_subtype").isJsonNull()) && !jsonObj.get("resource_subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_subtype").toString()));
      }
      // validate the optional field `member`
      if (jsonObj.get("member") != null && !jsonObj.get("member").isJsonNull()) {
        MemberCompact.validateJsonObject(jsonObj.getAsJsonObject("member"));
      }
      // validate the optional field `parent`
      if (jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) {
        GoalCompact.validateJsonObject(jsonObj.getAsJsonObject("parent"));
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      // validate the optional field `goal`
      if (jsonObj.get("goal") != null && !jsonObj.get("goal").isJsonNull()) {
        GoalCompact.validateJsonObject(jsonObj.getAsJsonObject("goal"));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        UserCompact.validateJsonObject(jsonObj.getAsJsonObject("user"));
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
       if (!GoalMembershipResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoalMembershipResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoalMembershipResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoalMembershipResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoalMembershipResponse>() {
           @Override
           public void write(JsonWriter out, GoalMembershipResponse value) throws IOException {
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
           public GoalMembershipResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GoalMembershipResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GoalMembershipResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoalMembershipResponse
  * @throws IOException if the JSON string is invalid with respect to GoalMembershipResponse
  */
  public static GoalMembershipResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoalMembershipResponse.class);
  }

 /**
  * Convert an instance of GoalMembershipResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
