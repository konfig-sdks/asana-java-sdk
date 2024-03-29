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
 * GoalRequestBaseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GoalRequestBaseAllOf {
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

  public GoalRequestBaseAllOf() {
  }

  public GoalRequestBaseAllOf team(String team) {
    
    
    
    
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


  public GoalRequestBaseAllOf workspace(String workspace) {
    
    
    
    
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


  public GoalRequestBaseAllOf timePeriod(String timePeriod) {
    
    
    
    
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


  public GoalRequestBaseAllOf owner(String owner) {
    
    
    
    
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
   * @return the GoalRequestBaseAllOf instance itself
   */
  public GoalRequestBaseAllOf putAdditionalProperty(String key, Object value) {
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
    GoalRequestBaseAllOf goalRequestBaseAllOf = (GoalRequestBaseAllOf) o;
    return Objects.equals(this.team, goalRequestBaseAllOf.team) &&
        Objects.equals(this.workspace, goalRequestBaseAllOf.workspace) &&
        Objects.equals(this.timePeriod, goalRequestBaseAllOf.timePeriod) &&
        Objects.equals(this.owner, goalRequestBaseAllOf.owner)&&
        Objects.equals(this.additionalProperties, goalRequestBaseAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(team, workspace, timePeriod, owner, additionalProperties);
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
    sb.append("class GoalRequestBaseAllOf {\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
    openapiFields.add("team");
    openapiFields.add("workspace");
    openapiFields.add("time_period");
    openapiFields.add("owner");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoalRequestBaseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GoalRequestBaseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoalRequestBaseAllOf is not found in the empty JSON string", GoalRequestBaseAllOf.openapiRequiredFields.toString()));
        }
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoalRequestBaseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoalRequestBaseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoalRequestBaseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoalRequestBaseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GoalRequestBaseAllOf>() {
           @Override
           public void write(JsonWriter out, GoalRequestBaseAllOf value) throws IOException {
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
           public GoalRequestBaseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GoalRequestBaseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GoalRequestBaseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoalRequestBaseAllOf
  * @throws IOException if the JSON string is invalid with respect to GoalRequestBaseAllOf
  */
  public static GoalRequestBaseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoalRequestBaseAllOf.class);
  }

 /**
  * Convert an instance of GoalRequestBaseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

