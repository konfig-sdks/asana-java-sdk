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
 * CustomFieldSettingResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CustomFieldSettingResponse {
  public static final String SERIALIZED_NAME_GID = "gid";
  @SerializedName(SERIALIZED_NAME_GID)
  private String gid;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private ProjectCompact project;

  public static final String SERIALIZED_NAME_IS_IMPORTANT = "is_important";
  @SerializedName(SERIALIZED_NAME_IS_IMPORTANT)
  private Boolean isImportant;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private ProjectCompact parent;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD = "custom_field";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD)
  private CustomFieldResponse customField;

  public CustomFieldSettingResponse() {
  }

  
  public CustomFieldSettingResponse(
     String gid, 
     String resourceType, 
     Boolean isImportant
  ) {
    this();
    this.gid = gid;
    this.resourceType = resourceType;
    this.isImportant = isImportant;
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




  public CustomFieldSettingResponse project(ProjectCompact project) {
    
    
    
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectCompact getProject() {
    return project;
  }


  public void setProject(ProjectCompact project) {
    
    
    
    this.project = project;
  }


   /**
   * &#x60;is_important&#x60; is used in the Asana web application to determine if this custom field is displayed in the list/grid view of a project or portfolio.
   * @return isImportant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "`is_important` is used in the Asana web application to determine if this custom field is displayed in the list/grid view of a project or portfolio.")

  public Boolean getIsImportant() {
    return isImportant;
  }




  public CustomFieldSettingResponse parent(ProjectCompact parent) {
    
    
    
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectCompact getParent() {
    return parent;
  }


  public void setParent(ProjectCompact parent) {
    
    
    
    this.parent = parent;
  }


  public CustomFieldSettingResponse customField(CustomFieldResponse customField) {
    
    
    
    
    this.customField = customField;
    return this;
  }

   /**
   * Get customField
   * @return customField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomFieldResponse getCustomField() {
    return customField;
  }


  public void setCustomField(CustomFieldResponse customField) {
    
    
    
    this.customField = customField;
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
   * @return the CustomFieldSettingResponse instance itself
   */
  public CustomFieldSettingResponse putAdditionalProperty(String key, Object value) {
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
    CustomFieldSettingResponse customFieldSettingResponse = (CustomFieldSettingResponse) o;
    return Objects.equals(this.gid, customFieldSettingResponse.gid) &&
        Objects.equals(this.resourceType, customFieldSettingResponse.resourceType) &&
        Objects.equals(this.project, customFieldSettingResponse.project) &&
        Objects.equals(this.isImportant, customFieldSettingResponse.isImportant) &&
        Objects.equals(this.parent, customFieldSettingResponse.parent) &&
        Objects.equals(this.customField, customFieldSettingResponse.customField)&&
        Objects.equals(this.additionalProperties, customFieldSettingResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, project, isImportant, parent, customField, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldSettingResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    isImportant: ").append(toIndentedString(isImportant)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
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
    openapiFields.add("project");
    openapiFields.add("is_important");
    openapiFields.add("parent");
    openapiFields.add("custom_field");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomFieldSettingResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomFieldSettingResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldSettingResponse is not found in the empty JSON string", CustomFieldSettingResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("gid") != null && !jsonObj.get("gid").isJsonNull()) && !jsonObj.get("gid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gid").toString()));
      }
      if ((jsonObj.get("resource_type") != null && !jsonObj.get("resource_type").isJsonNull()) && !jsonObj.get("resource_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_type").toString()));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        ProjectCompact.validateJsonObject(jsonObj.getAsJsonObject("project"));
      }
      // validate the optional field `parent`
      if (jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) {
        ProjectCompact.validateJsonObject(jsonObj.getAsJsonObject("parent"));
      }
      // validate the optional field `custom_field`
      if (jsonObj.get("custom_field") != null && !jsonObj.get("custom_field").isJsonNull()) {
        CustomFieldResponse.validateJsonObject(jsonObj.getAsJsonObject("custom_field"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldSettingResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldSettingResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldSettingResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldSettingResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldSettingResponse>() {
           @Override
           public void write(JsonWriter out, CustomFieldSettingResponse value) throws IOException {
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
           public CustomFieldSettingResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CustomFieldSettingResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomFieldSettingResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomFieldSettingResponse
  * @throws IOException if the JSON string is invalid with respect to CustomFieldSettingResponse
  */
  public static CustomFieldSettingResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldSettingResponse.class);
  }

 /**
  * Convert an instance of CustomFieldSettingResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

