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
import java.io.File;
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
 * AttachmentRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AttachmentRequest {
  /**
   * The type of the attachment. Must be one of the given values. If not specified, a file attachment of type &#x60;asana&#x60; will be assumed. Note that if the value of &#x60;resource_subtype&#x60; is &#x60;external&#x60;, a &#x60;parent&#x60;, &#x60;name&#x60;, and &#x60;url&#x60; must also be provided. 
   */
  @JsonAdapter(ResourceSubtypeEnum.Adapter.class)
 public enum ResourceSubtypeEnum {
    ASANA("asana"),
    
    DROPBOX("dropbox"),
    
    GDRIVE("gdrive"),
    
    ONEDRIVE("onedrive"),
    
    BOX("box"),
    
    VIMEO("vimeo"),
    
    EXTERNAL("external");

    private String value;

    ResourceSubtypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResourceSubtypeEnum fromValue(String value) {
      for (ResourceSubtypeEnum b : ResourceSubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResourceSubtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceSubtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResourceSubtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResourceSubtypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESOURCE_SUBTYPE = "resource_subtype";
  @SerializedName(SERIALIZED_NAME_RESOURCE_SUBTYPE)
  private ResourceSubtypeEnum resourceSubtype;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File _file;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private String parent;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONNECT_TO_APP = "connect_to_app";
  @SerializedName(SERIALIZED_NAME_CONNECT_TO_APP)
  private Boolean connectToApp;

  public AttachmentRequest() {
  }

  public AttachmentRequest resourceSubtype(ResourceSubtypeEnum resourceSubtype) {
    
    
    
    
    this.resourceSubtype = resourceSubtype;
    return this;
  }

   /**
   * The type of the attachment. Must be one of the given values. If not specified, a file attachment of type &#x60;asana&#x60; will be assumed. Note that if the value of &#x60;resource_subtype&#x60; is &#x60;external&#x60;, a &#x60;parent&#x60;, &#x60;name&#x60;, and &#x60;url&#x60; must also be provided. 
   * @return resourceSubtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EXTERNAL", value = "The type of the attachment. Must be one of the given values. If not specified, a file attachment of type `asana` will be assumed. Note that if the value of `resource_subtype` is `external`, a `parent`, `name`, and `url` must also be provided. ")

  public ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }


  public void setResourceSubtype(ResourceSubtypeEnum resourceSubtype) {
    
    
    
    this.resourceSubtype = resourceSubtype;
  }


  public AttachmentRequest _file(File _file) {
    
    
    
    
    this._file = _file;
    return this;
  }

   /**
   * Required for &#x60;asana&#x60; attachments. 
   * @return _file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required for `asana` attachments. ")

  public File getFile() {
    return _file;
  }


  public void setFile(File _file) {
    
    
    
    this._file = _file;
  }


  public AttachmentRequest parent(String parent) {
    
    
    
    
    this.parent = parent;
    return this;
  }

   /**
   * Required identifier of the parent task, project, or project_brief, as a string. 
   * @return parent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Required identifier of the parent task, project, or project_brief, as a string. ")

  public String getParent() {
    return parent;
  }


  public void setParent(String parent) {
    
    
    
    this.parent = parent;
  }


  public AttachmentRequest url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * The URL of the external resource being attached. Required for attachments of type &#x60;external&#x60;. 
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the external resource being attached. Required for attachments of type `external`. ")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public AttachmentRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the external resource being attached. Required for attachments of type &#x60;external&#x60;. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the external resource being attached. Required for attachments of type `external`. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public AttachmentRequest connectToApp(Boolean connectToApp) {
    
    
    
    
    this.connectToApp = connectToApp;
    return this;
  }

   /**
   * *Optional*. Only relevant for external attachments with a parent task. A boolean indicating whether the current app should be connected with the attachment for the purposes of showing an app components widget. Requires the app to have been added to a project the parent task is in. 
   * @return connectToApp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*Optional*. Only relevant for external attachments with a parent task. A boolean indicating whether the current app should be connected with the attachment for the purposes of showing an app components widget. Requires the app to have been added to a project the parent task is in. ")

  public Boolean getConnectToApp() {
    return connectToApp;
  }


  public void setConnectToApp(Boolean connectToApp) {
    
    
    
    this.connectToApp = connectToApp;
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
   * @return the AttachmentRequest instance itself
   */
  public AttachmentRequest putAdditionalProperty(String key, Object value) {
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
    AttachmentRequest attachmentRequest = (AttachmentRequest) o;
    return Objects.equals(this.resourceSubtype, attachmentRequest.resourceSubtype) &&
        Objects.equals(this._file, attachmentRequest._file) &&
        Objects.equals(this.parent, attachmentRequest.parent) &&
        Objects.equals(this.url, attachmentRequest.url) &&
        Objects.equals(this.name, attachmentRequest.name) &&
        Objects.equals(this.connectToApp, attachmentRequest.connectToApp)&&
        Objects.equals(this.additionalProperties, attachmentRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceSubtype, _file, parent, url, name, connectToApp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentRequest {\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectToApp: ").append(toIndentedString(connectToApp)).append("\n");
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
    openapiFields.add("resource_subtype");
    openapiFields.add("file");
    openapiFields.add("parent");
    openapiFields.add("url");
    openapiFields.add("name");
    openapiFields.add("connect_to_app");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("parent");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AttachmentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AttachmentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachmentRequest is not found in the empty JSON string", AttachmentRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AttachmentRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("resource_subtype") != null && !jsonObj.get("resource_subtype").isJsonNull()) && !jsonObj.get("resource_subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_subtype").toString()));
      }
      if (!jsonObj.get("parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachmentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachmentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachmentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachmentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachmentRequest>() {
           @Override
           public void write(JsonWriter out, AttachmentRequest value) throws IOException {
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
           public AttachmentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AttachmentRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AttachmentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttachmentRequest
  * @throws IOException if the JSON string is invalid with respect to AttachmentRequest
  */
  public static AttachmentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachmentRequest.class);
  }

 /**
  * Convert an instance of AttachmentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

