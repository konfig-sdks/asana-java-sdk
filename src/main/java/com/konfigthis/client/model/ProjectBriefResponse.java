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
 * ProjectBriefResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectBriefResponse {
  public static final String SERIALIZED_NAME_GID = "gid";
  @SerializedName(SERIALIZED_NAME_GID)
  private String gid;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_HTML_TEXT = "html_text";
  @SerializedName(SERIALIZED_NAME_HTML_TEXT)
  private String htmlText;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_PERMALINK_URL = "permalink_url";
  @SerializedName(SERIALIZED_NAME_PERMALINK_URL)
  private String permalinkUrl;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private ProjectCompact project;

  public ProjectBriefResponse() {
  }

  
  public ProjectBriefResponse(
     String gid, 
     String resourceType, 
     String permalinkUrl
  ) {
    this();
    this.gid = gid;
    this.resourceType = resourceType;
    this.permalinkUrl = permalinkUrl;
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




  public ProjectBriefResponse title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of the project brief.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Stuff to buy — Project Brief", value = "The title of the project brief.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public ProjectBriefResponse htmlText(String htmlText) {
    
    
    
    
    this.htmlText = htmlText;
    return this;
  }

   /**
   * HTML formatted text for the project brief.
   * @return htmlText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<body>This is a <strong>project brief</strong>.</body>", value = "HTML formatted text for the project brief.")

  public String getHtmlText() {
    return htmlText;
  }


  public void setHtmlText(String htmlText) {
    
    
    
    this.htmlText = htmlText;
  }


  public ProjectBriefResponse text(String text) {
    
    
    
    
    this.text = text;
    return this;
  }

   /**
   * [Opt In](https://raw.githubusercontent.com). The plain text of the project brief.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a project brief.", value = "[Opt In](https://raw.githubusercontent.com). The plain text of the project brief.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    
    
    
    this.text = text;
  }


   /**
   * A url that points directly to the object within Asana.
   * @return permalinkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://app.asana.com/0/11111111/22222222", value = "A url that points directly to the object within Asana.")

  public String getPermalinkUrl() {
    return permalinkUrl;
  }




  public ProjectBriefResponse project(ProjectCompact project) {
    
    
    
    
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
   * @return the ProjectBriefResponse instance itself
   */
  public ProjectBriefResponse putAdditionalProperty(String key, Object value) {
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
    ProjectBriefResponse projectBriefResponse = (ProjectBriefResponse) o;
    return Objects.equals(this.gid, projectBriefResponse.gid) &&
        Objects.equals(this.resourceType, projectBriefResponse.resourceType) &&
        Objects.equals(this.title, projectBriefResponse.title) &&
        Objects.equals(this.htmlText, projectBriefResponse.htmlText) &&
        Objects.equals(this.text, projectBriefResponse.text) &&
        Objects.equals(this.permalinkUrl, projectBriefResponse.permalinkUrl) &&
        Objects.equals(this.project, projectBriefResponse.project)&&
        Objects.equals(this.additionalProperties, projectBriefResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, title, htmlText, text, permalinkUrl, project, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectBriefResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("html_text");
    openapiFields.add("text");
    openapiFields.add("permalink_url");
    openapiFields.add("project");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectBriefResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectBriefResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectBriefResponse is not found in the empty JSON string", ProjectBriefResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("gid") != null && !jsonObj.get("gid").isJsonNull()) && !jsonObj.get("gid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gid").toString()));
      }
      if ((jsonObj.get("resource_type") != null && !jsonObj.get("resource_type").isJsonNull()) && !jsonObj.get("resource_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_type").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("html_text") != null && !jsonObj.get("html_text").isJsonNull()) && !jsonObj.get("html_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_text").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("permalink_url") != null && !jsonObj.get("permalink_url").isJsonNull()) && !jsonObj.get("permalink_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permalink_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permalink_url").toString()));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        ProjectCompact.validateJsonObject(jsonObj.getAsJsonObject("project"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectBriefResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectBriefResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectBriefResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectBriefResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectBriefResponse>() {
           @Override
           public void write(JsonWriter out, ProjectBriefResponse value) throws IOException {
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
           public ProjectBriefResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectBriefResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectBriefResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectBriefResponse
  * @throws IOException if the JSON string is invalid with respect to ProjectBriefResponse
  */
  public static ProjectBriefResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectBriefResponse.class);
  }

 /**
  * Convert an instance of ProjectBriefResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

