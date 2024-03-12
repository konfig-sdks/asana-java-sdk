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
 * ProjectSaveAsTemplateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectSaveAsTemplateRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private String team;

  public static final String SERIALIZED_NAME_WORKSPACE = "workspace";
  @SerializedName(SERIALIZED_NAME_WORKSPACE)
  private String workspace;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public ProjectSaveAsTemplateRequest() {
  }

  public ProjectSaveAsTemplateRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the new project template.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "New Project Template", required = true, value = "The name of the new project template.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ProjectSaveAsTemplateRequest team(String team) {
    
    
    
    
    this.team = team;
    return this;
  }

   /**
   * Sets the team of the new project template. If the project exists in an organization, specify team and not workspace.
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "Sets the team of the new project template. If the project exists in an organization, specify team and not workspace.")

  public String getTeam() {
    return team;
  }


  public void setTeam(String team) {
    
    
    
    this.team = team;
  }


  public ProjectSaveAsTemplateRequest workspace(String workspace) {
    
    
    
    
    this.workspace = workspace;
    return this;
  }

   /**
   * Sets the workspace of the new project template. Only specify workspace if the project exists in a workspace.
   * @return workspace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "Sets the workspace of the new project template. Only specify workspace if the project exists in a workspace.")

  public String getWorkspace() {
    return workspace;
  }


  public void setWorkspace(String workspace) {
    
    
    
    this.workspace = workspace;
  }


  public ProjectSaveAsTemplateRequest _public(Boolean _public) {
    
    
    
    
    this._public = _public;
    return this;
  }

   /**
   * Sets the project template to public to its team.
   * @return _public
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Sets the project template to public to its team.")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    
    
    
    this._public = _public;
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
   * @return the ProjectSaveAsTemplateRequest instance itself
   */
  public ProjectSaveAsTemplateRequest putAdditionalProperty(String key, Object value) {
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
    ProjectSaveAsTemplateRequest projectSaveAsTemplateRequest = (ProjectSaveAsTemplateRequest) o;
    return Objects.equals(this.name, projectSaveAsTemplateRequest.name) &&
        Objects.equals(this.team, projectSaveAsTemplateRequest.team) &&
        Objects.equals(this.workspace, projectSaveAsTemplateRequest.workspace) &&
        Objects.equals(this._public, projectSaveAsTemplateRequest._public)&&
        Objects.equals(this.additionalProperties, projectSaveAsTemplateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, team, workspace, _public, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSaveAsTemplateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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
    openapiFields.add("workspace");
    openapiFields.add("public");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("public");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectSaveAsTemplateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectSaveAsTemplateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectSaveAsTemplateRequest is not found in the empty JSON string", ProjectSaveAsTemplateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectSaveAsTemplateRequest.openapiRequiredFields) {
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
      if ((jsonObj.get("workspace") != null && !jsonObj.get("workspace").isJsonNull()) && !jsonObj.get("workspace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workspace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workspace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectSaveAsTemplateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectSaveAsTemplateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectSaveAsTemplateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectSaveAsTemplateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectSaveAsTemplateRequest>() {
           @Override
           public void write(JsonWriter out, ProjectSaveAsTemplateRequest value) throws IOException {
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
           public ProjectSaveAsTemplateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectSaveAsTemplateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectSaveAsTemplateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectSaveAsTemplateRequest
  * @throws IOException if the JSON string is invalid with respect to ProjectSaveAsTemplateRequest
  */
  public static ProjectSaveAsTemplateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectSaveAsTemplateRequest.class);
  }

 /**
  * Convert an instance of ProjectSaveAsTemplateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
