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
import com.konfigthis.client.model.CustomFieldCompact;
import com.konfigthis.client.model.CustomFieldSettingResponse;
import com.konfigthis.client.model.ProjectTemplateCompact;
import com.konfigthis.client.model.StatusUpdateCompact;
import com.konfigthis.client.model.UserCompact;
import com.konfigthis.client.model.WorkspaceCompact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * PortfolioResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PortfolioResponseAllOf {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UserCompact createdBy;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD_SETTINGS = "custom_field_settings";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_SETTINGS)
  private List<CustomFieldSettingResponse> customFieldSettings = null;

  public static final String SERIALIZED_NAME_CURRENT_STATUS_UPDATE = "current_status_update";
  @SerializedName(SERIALIZED_NAME_CURRENT_STATUS_UPDATE)
  private StatusUpdateCompact currentStatusUpdate;

  public static final String SERIALIZED_NAME_DUE_ON = "due_on";
  @SerializedName(SERIALIZED_NAME_DUE_ON)
  private LocalDate dueOn;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private List<CustomFieldCompact> customFields = null;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<UserCompact> members = null;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private UserCompact owner;

  public static final String SERIALIZED_NAME_START_ON = "start_on";
  @SerializedName(SERIALIZED_NAME_START_ON)
  private LocalDate startOn;

  public static final String SERIALIZED_NAME_WORKSPACE = "workspace";
  @SerializedName(SERIALIZED_NAME_WORKSPACE)
  private WorkspaceCompact workspace;

  public static final String SERIALIZED_NAME_PERMALINK_URL = "permalink_url";
  @SerializedName(SERIALIZED_NAME_PERMALINK_URL)
  private String permalinkUrl;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_PROJECT_TEMPLATES = "project_templates";
  @SerializedName(SERIALIZED_NAME_PROJECT_TEMPLATES)
  private List<ProjectTemplateCompact> projectTemplates = null;

  public PortfolioResponseAllOf() {
  }

  
  public PortfolioResponseAllOf(
     OffsetDateTime createdAt, 
     List<UserCompact> members, 
     String permalinkUrl, 
     List<ProjectTemplateCompact> projectTemplates
  ) {
    this();
    this.createdAt = createdAt;
    this.members = members;
    this.permalinkUrl = permalinkUrl;
    this.projectTemplates = projectTemplates;
  }

   /**
   * The time at which this resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-02-22T02:06:58.147Z", value = "The time at which this resource was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  public PortfolioResponseAllOf createdBy(UserCompact createdBy) {
    
    
    
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserCompact getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(UserCompact createdBy) {
    
    
    
    this.createdBy = createdBy;
  }


  public PortfolioResponseAllOf customFieldSettings(List<CustomFieldSettingResponse> customFieldSettings) {
    
    
    
    
    this.customFieldSettings = customFieldSettings;
    return this;
  }

  public PortfolioResponseAllOf addCustomFieldSettingsItem(CustomFieldSettingResponse customFieldSettingsItem) {
    if (this.customFieldSettings == null) {
      this.customFieldSettings = new ArrayList<>();
    }
    this.customFieldSettings.add(customFieldSettingsItem);
    return this;
  }

   /**
   * Array of custom field settings applied to the portfolio.
   * @return customFieldSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of custom field settings applied to the portfolio.")

  public List<CustomFieldSettingResponse> getCustomFieldSettings() {
    return customFieldSettings;
  }


  public void setCustomFieldSettings(List<CustomFieldSettingResponse> customFieldSettings) {
    
    
    
    this.customFieldSettings = customFieldSettings;
  }


  public PortfolioResponseAllOf currentStatusUpdate(StatusUpdateCompact currentStatusUpdate) {
    
    
    
    
    this.currentStatusUpdate = currentStatusUpdate;
    return this;
  }

   /**
   * Get currentStatusUpdate
   * @return currentStatusUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusUpdateCompact getCurrentStatusUpdate() {
    return currentStatusUpdate;
  }


  public void setCurrentStatusUpdate(StatusUpdateCompact currentStatusUpdate) {
    
    
    
    this.currentStatusUpdate = currentStatusUpdate;
  }


  public PortfolioResponseAllOf dueOn(LocalDate dueOn) {
    
    
    
    
    this.dueOn = dueOn;
    return this;
  }

   /**
   * The localized day on which this portfolio is due. This takes a date with format YYYY-MM-DD.
   * @return dueOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Sep 14 17:00:00 PDT 2019", value = "The localized day on which this portfolio is due. This takes a date with format YYYY-MM-DD.")

  public LocalDate getDueOn() {
    return dueOn;
  }


  public void setDueOn(LocalDate dueOn) {
    
    
    
    this.dueOn = dueOn;
  }


  public PortfolioResponseAllOf customFields(List<CustomFieldCompact> customFields) {
    
    
    
    
    this.customFields = customFields;
    return this;
  }

  public PortfolioResponseAllOf addCustomFieldsItem(CustomFieldCompact customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
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


  public void setCustomFields(List<CustomFieldCompact> customFields) {
    
    
    
    this.customFields = customFields;
  }


   /**
   * Get members
   * @return members
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserCompact> getMembers() {
    return members;
  }




  public PortfolioResponseAllOf owner(UserCompact owner) {
    
    
    
    
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


  public PortfolioResponseAllOf startOn(LocalDate startOn) {
    
    
    
    
    this.startOn = startOn;
    return this;
  }

   /**
   * The day on which work for this portfolio begins, or null if the portfolio has no start date. This takes a date with &#x60;YYYY-MM-DD&#x60; format. *Note: &#x60;due_on&#x60; must be present in the request when setting or unsetting the &#x60;start_on&#x60; parameter. Additionally, &#x60;start_on&#x60; and &#x60;due_on&#x60; cannot be the same date.*
   * @return startOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Sep 13 17:00:00 PDT 2019", value = "The day on which work for this portfolio begins, or null if the portfolio has no start date. This takes a date with `YYYY-MM-DD` format. *Note: `due_on` must be present in the request when setting or unsetting the `start_on` parameter. Additionally, `start_on` and `due_on` cannot be the same date.*")

  public LocalDate getStartOn() {
    return startOn;
  }


  public void setStartOn(LocalDate startOn) {
    
    
    
    this.startOn = startOn;
  }


  public PortfolioResponseAllOf workspace(WorkspaceCompact workspace) {
    
    
    
    
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




  public PortfolioResponseAllOf _public(Boolean _public) {
    
    
    
    
    this._public = _public;
    return this;
  }

   /**
   * True if the portfolio is public to its workspace members.
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True if the portfolio is public to its workspace members.")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    
    
    
    this._public = _public;
  }


   /**
   * Array of project templates that are in the portfolio
   * @return projectTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of project templates that are in the portfolio")

  public List<ProjectTemplateCompact> getProjectTemplates() {
    return projectTemplates;
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
   * @return the PortfolioResponseAllOf instance itself
   */
  public PortfolioResponseAllOf putAdditionalProperty(String key, Object value) {
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
    PortfolioResponseAllOf portfolioResponseAllOf = (PortfolioResponseAllOf) o;
    return Objects.equals(this.createdAt, portfolioResponseAllOf.createdAt) &&
        Objects.equals(this.createdBy, portfolioResponseAllOf.createdBy) &&
        Objects.equals(this.customFieldSettings, portfolioResponseAllOf.customFieldSettings) &&
        Objects.equals(this.currentStatusUpdate, portfolioResponseAllOf.currentStatusUpdate) &&
        Objects.equals(this.dueOn, portfolioResponseAllOf.dueOn) &&
        Objects.equals(this.customFields, portfolioResponseAllOf.customFields) &&
        Objects.equals(this.members, portfolioResponseAllOf.members) &&
        Objects.equals(this.owner, portfolioResponseAllOf.owner) &&
        Objects.equals(this.startOn, portfolioResponseAllOf.startOn) &&
        Objects.equals(this.workspace, portfolioResponseAllOf.workspace) &&
        Objects.equals(this.permalinkUrl, portfolioResponseAllOf.permalinkUrl) &&
        Objects.equals(this._public, portfolioResponseAllOf._public) &&
        Objects.equals(this.projectTemplates, portfolioResponseAllOf.projectTemplates)&&
        Objects.equals(this.additionalProperties, portfolioResponseAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, customFieldSettings, currentStatusUpdate, dueOn, customFields, members, owner, startOn, workspace, permalinkUrl, _public, projectTemplates, additionalProperties);
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
    sb.append("class PortfolioResponseAllOf {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    customFieldSettings: ").append(toIndentedString(customFieldSettings)).append("\n");
    sb.append("    currentStatusUpdate: ").append(toIndentedString(currentStatusUpdate)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    projectTemplates: ").append(toIndentedString(projectTemplates)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("created_by");
    openapiFields.add("custom_field_settings");
    openapiFields.add("current_status_update");
    openapiFields.add("due_on");
    openapiFields.add("custom_fields");
    openapiFields.add("members");
    openapiFields.add("owner");
    openapiFields.add("start_on");
    openapiFields.add("workspace");
    openapiFields.add("permalink_url");
    openapiFields.add("public");
    openapiFields.add("project_templates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PortfolioResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PortfolioResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortfolioResponseAllOf is not found in the empty JSON string", PortfolioResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        UserCompact.validateJsonObject(jsonObj.getAsJsonObject("created_by"));
      }
      if (jsonObj.get("custom_field_settings") != null && !jsonObj.get("custom_field_settings").isJsonNull()) {
        JsonArray jsonArraycustomFieldSettings = jsonObj.getAsJsonArray("custom_field_settings");
        if (jsonArraycustomFieldSettings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("custom_field_settings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `custom_field_settings` to be an array in the JSON string but got `%s`", jsonObj.get("custom_field_settings").toString()));
          }

          // validate the optional field `custom_field_settings` (array)
          for (int i = 0; i < jsonArraycustomFieldSettings.size(); i++) {
            CustomFieldSettingResponse.validateJsonObject(jsonArraycustomFieldSettings.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `current_status_update`
      if (jsonObj.get("current_status_update") != null && !jsonObj.get("current_status_update").isJsonNull()) {
        StatusUpdateCompact.validateJsonObject(jsonObj.getAsJsonObject("current_status_update"));
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
      if (jsonObj.get("members") != null && !jsonObj.get("members").isJsonNull()) {
        JsonArray jsonArraymembers = jsonObj.getAsJsonArray("members");
        if (jsonArraymembers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("members").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
          }

          // validate the optional field `members` (array)
          for (int i = 0; i < jsonArraymembers.size(); i++) {
            UserCompact.validateJsonObject(jsonArraymembers.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `owner`
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) {
        UserCompact.validateJsonObject(jsonObj.getAsJsonObject("owner"));
      }
      // validate the optional field `workspace`
      if (jsonObj.get("workspace") != null && !jsonObj.get("workspace").isJsonNull()) {
        WorkspaceCompact.validateJsonObject(jsonObj.getAsJsonObject("workspace"));
      }
      if ((jsonObj.get("permalink_url") != null && !jsonObj.get("permalink_url").isJsonNull()) && !jsonObj.get("permalink_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permalink_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permalink_url").toString()));
      }
      if (jsonObj.get("project_templates") != null && !jsonObj.get("project_templates").isJsonNull()) {
        JsonArray jsonArrayprojectTemplates = jsonObj.getAsJsonArray("project_templates");
        if (jsonArrayprojectTemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("project_templates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `project_templates` to be an array in the JSON string but got `%s`", jsonObj.get("project_templates").toString()));
          }

          // validate the optional field `project_templates` (array)
          for (int i = 0; i < jsonArrayprojectTemplates.size(); i++) {
            ProjectTemplateCompact.validateJsonObject(jsonArrayprojectTemplates.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortfolioResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortfolioResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortfolioResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortfolioResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PortfolioResponseAllOf>() {
           @Override
           public void write(JsonWriter out, PortfolioResponseAllOf value) throws IOException {
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
           public PortfolioResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PortfolioResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PortfolioResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PortfolioResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to PortfolioResponseAllOf
  */
  public static PortfolioResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortfolioResponseAllOf.class);
  }

 /**
  * Convert an instance of PortfolioResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

