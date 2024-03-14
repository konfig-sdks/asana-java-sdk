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
import com.konfigthis.client.model.DateVariableRequest;
import com.konfigthis.client.model.RequestedRoleRequest;
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
 * ProjectTemplateInstantiateProjectRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectTemplateInstantiateProjectRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private String team;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_IS_STRICT = "is_strict";
  @SerializedName(SERIALIZED_NAME_IS_STRICT)
  private Boolean isStrict;

  public static final String SERIALIZED_NAME_REQUESTED_DATES = "requested_dates";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DATES)
  private List<DateVariableRequest> requestedDates = null;

  public static final String SERIALIZED_NAME_REQUESTED_ROLES = "requested_roles";
  @SerializedName(SERIALIZED_NAME_REQUESTED_ROLES)
  private List<RequestedRoleRequest> requestedRoles = null;

  public ProjectTemplateInstantiateProjectRequest() {
  }

  public ProjectTemplateInstantiateProjectRequest name(String name) {
    
    
    
    
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


  public ProjectTemplateInstantiateProjectRequest team(String team) {
    
    
    
    
    this.team = team;
    return this;
  }

   /**
   * *Optional*. Sets the team of the new project. If the project template exists in an _organization_, you may specify a value for &#x60;team&#x60;. If no value is provided then it defaults to the same team as the project template.
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "*Optional*. Sets the team of the new project. If the project template exists in an _organization_, you may specify a value for `team`. If no value is provided then it defaults to the same team as the project template.")

  public String getTeam() {
    return team;
  }


  public void setTeam(String team) {
    
    
    
    this.team = team;
  }


  public ProjectTemplateInstantiateProjectRequest _public(Boolean _public) {
    
    
    
    
    this._public = _public;
    return this;
  }

   /**
   * Sets the project to public to its team.
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Sets the project to public to its team.")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    
    
    
    this._public = _public;
  }


  public ProjectTemplateInstantiateProjectRequest isStrict(Boolean isStrict) {
    
    
    
    
    this.isStrict = isStrict;
    return this;
  }

   /**
   * *Optional*. If set to &#x60;true&#x60;, the endpoint returns an \&quot;Unprocessable Entity\&quot; error if you fail to provide a calendar date value for any date variable. If set to &#x60;false&#x60;, a default date is used for each unfulfilled date variable (e.g., the current date is used as the Start Date of a project).
   * @return isStrict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "*Optional*. If set to `true`, the endpoint returns an \"Unprocessable Entity\" error if you fail to provide a calendar date value for any date variable. If set to `false`, a default date is used for each unfulfilled date variable (e.g., the current date is used as the Start Date of a project).")

  public Boolean getIsStrict() {
    return isStrict;
  }


  public void setIsStrict(Boolean isStrict) {
    
    
    
    this.isStrict = isStrict;
  }


  public ProjectTemplateInstantiateProjectRequest requestedDates(List<DateVariableRequest> requestedDates) {
    
    
    
    
    this.requestedDates = requestedDates;
    return this;
  }

  public ProjectTemplateInstantiateProjectRequest addRequestedDatesItem(DateVariableRequest requestedDatesItem) {
    if (this.requestedDates == null) {
      this.requestedDates = new ArrayList<>();
    }
    this.requestedDates.add(requestedDatesItem);
    return this;
  }

   /**
   * Array of mappings of date variables to calendar dates.
   * @return requestedDates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of mappings of date variables to calendar dates.")

  public List<DateVariableRequest> getRequestedDates() {
    return requestedDates;
  }


  public void setRequestedDates(List<DateVariableRequest> requestedDates) {
    
    
    
    this.requestedDates = requestedDates;
  }


  public ProjectTemplateInstantiateProjectRequest requestedRoles(List<RequestedRoleRequest> requestedRoles) {
    
    
    
    
    this.requestedRoles = requestedRoles;
    return this;
  }

  public ProjectTemplateInstantiateProjectRequest addRequestedRolesItem(RequestedRoleRequest requestedRolesItem) {
    if (this.requestedRoles == null) {
      this.requestedRoles = new ArrayList<>();
    }
    this.requestedRoles.add(requestedRolesItem);
    return this;
  }

   /**
   * Array of mappings of template roles to user ids
   * @return requestedRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of mappings of template roles to user ids")

  public List<RequestedRoleRequest> getRequestedRoles() {
    return requestedRoles;
  }


  public void setRequestedRoles(List<RequestedRoleRequest> requestedRoles) {
    
    
    
    this.requestedRoles = requestedRoles;
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
   * @return the ProjectTemplateInstantiateProjectRequest instance itself
   */
  public ProjectTemplateInstantiateProjectRequest putAdditionalProperty(String key, Object value) {
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
    ProjectTemplateInstantiateProjectRequest projectTemplateInstantiateProjectRequest = (ProjectTemplateInstantiateProjectRequest) o;
    return Objects.equals(this.name, projectTemplateInstantiateProjectRequest.name) &&
        Objects.equals(this.team, projectTemplateInstantiateProjectRequest.team) &&
        Objects.equals(this._public, projectTemplateInstantiateProjectRequest._public) &&
        Objects.equals(this.isStrict, projectTemplateInstantiateProjectRequest.isStrict) &&
        Objects.equals(this.requestedDates, projectTemplateInstantiateProjectRequest.requestedDates) &&
        Objects.equals(this.requestedRoles, projectTemplateInstantiateProjectRequest.requestedRoles)&&
        Objects.equals(this.additionalProperties, projectTemplateInstantiateProjectRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, team, _public, isStrict, requestedDates, requestedRoles, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectTemplateInstantiateProjectRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    isStrict: ").append(toIndentedString(isStrict)).append("\n");
    sb.append("    requestedDates: ").append(toIndentedString(requestedDates)).append("\n");
    sb.append("    requestedRoles: ").append(toIndentedString(requestedRoles)).append("\n");
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
    openapiFields.add("public");
    openapiFields.add("is_strict");
    openapiFields.add("requested_dates");
    openapiFields.add("requested_roles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectTemplateInstantiateProjectRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectTemplateInstantiateProjectRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectTemplateInstantiateProjectRequest is not found in the empty JSON string", ProjectTemplateInstantiateProjectRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectTemplateInstantiateProjectRequest.openapiRequiredFields) {
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
      if (jsonObj.get("requested_dates") != null && !jsonObj.get("requested_dates").isJsonNull()) {
        JsonArray jsonArrayrequestedDates = jsonObj.getAsJsonArray("requested_dates");
        if (jsonArrayrequestedDates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requested_dates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requested_dates` to be an array in the JSON string but got `%s`", jsonObj.get("requested_dates").toString()));
          }

          // validate the optional field `requested_dates` (array)
          for (int i = 0; i < jsonArrayrequestedDates.size(); i++) {
            DateVariableRequest.validateJsonObject(jsonArrayrequestedDates.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("requested_roles") != null && !jsonObj.get("requested_roles").isJsonNull()) {
        JsonArray jsonArrayrequestedRoles = jsonObj.getAsJsonArray("requested_roles");
        if (jsonArrayrequestedRoles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requested_roles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requested_roles` to be an array in the JSON string but got `%s`", jsonObj.get("requested_roles").toString()));
          }

          // validate the optional field `requested_roles` (array)
          for (int i = 0; i < jsonArrayrequestedRoles.size(); i++) {
            RequestedRoleRequest.validateJsonObject(jsonArrayrequestedRoles.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectTemplateInstantiateProjectRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectTemplateInstantiateProjectRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectTemplateInstantiateProjectRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectTemplateInstantiateProjectRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectTemplateInstantiateProjectRequest>() {
           @Override
           public void write(JsonWriter out, ProjectTemplateInstantiateProjectRequest value) throws IOException {
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
           public ProjectTemplateInstantiateProjectRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectTemplateInstantiateProjectRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectTemplateInstantiateProjectRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectTemplateInstantiateProjectRequest
  * @throws IOException if the JSON string is invalid with respect to ProjectTemplateInstantiateProjectRequest
  */
  public static ProjectTemplateInstantiateProjectRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectTemplateInstantiateProjectRequest.class);
  }

 /**
  * Convert an instance of ProjectTemplateInstantiateProjectRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

