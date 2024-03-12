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
import java.net.URI;
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
 * WorkspaceResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkspaceResponse {
  public static final String SERIALIZED_NAME_GID = "gid";
  @SerializedName(SERIALIZED_NAME_GID)
  private String gid;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL_DOMAINS = "email_domains";
  @SerializedName(SERIALIZED_NAME_EMAIL_DOMAINS)
  private List<URI> emailDomains = null;

  public static final String SERIALIZED_NAME_IS_ORGANIZATION = "is_organization";
  @SerializedName(SERIALIZED_NAME_IS_ORGANIZATION)
  private Boolean isOrganization;

  public WorkspaceResponse() {
  }

  
  public WorkspaceResponse(
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




  public WorkspaceResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the workspace.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Company Workspace", value = "The name of the workspace.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public WorkspaceResponse emailDomains(List<URI> emailDomains) {
    
    
    
    
    this.emailDomains = emailDomains;
    return this;
  }

  public WorkspaceResponse addEmailDomainsItem(URI emailDomainsItem) {
    if (this.emailDomains == null) {
      this.emailDomains = new ArrayList<>();
    }
    this.emailDomains.add(emailDomainsItem);
    return this;
  }

   /**
   * The email domains that are associated with this workspace.
   * @return emailDomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"asana.com\"]", value = "The email domains that are associated with this workspace.")

  public List<URI> getEmailDomains() {
    return emailDomains;
  }


  public void setEmailDomains(List<URI> emailDomains) {
    
    
    
    this.emailDomains = emailDomains;
  }


  public WorkspaceResponse isOrganization(Boolean isOrganization) {
    
    
    
    
    this.isOrganization = isOrganization;
    return this;
  }

   /**
   * Whether the workspace is an *organization*.
   * @return isOrganization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the workspace is an *organization*.")

  public Boolean getIsOrganization() {
    return isOrganization;
  }


  public void setIsOrganization(Boolean isOrganization) {
    
    
    
    this.isOrganization = isOrganization;
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
   * @return the WorkspaceResponse instance itself
   */
  public WorkspaceResponse putAdditionalProperty(String key, Object value) {
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
    WorkspaceResponse workspaceResponse = (WorkspaceResponse) o;
    return Objects.equals(this.gid, workspaceResponse.gid) &&
        Objects.equals(this.resourceType, workspaceResponse.resourceType) &&
        Objects.equals(this.name, workspaceResponse.name) &&
        Objects.equals(this.emailDomains, workspaceResponse.emailDomains) &&
        Objects.equals(this.isOrganization, workspaceResponse.isOrganization)&&
        Objects.equals(this.additionalProperties, workspaceResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, emailDomains, isOrganization, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailDomains: ").append(toIndentedString(emailDomains)).append("\n");
    sb.append("    isOrganization: ").append(toIndentedString(isOrganization)).append("\n");
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
    openapiFields.add("email_domains");
    openapiFields.add("is_organization");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkspaceResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkspaceResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkspaceResponse is not found in the empty JSON string", WorkspaceResponse.openapiRequiredFields.toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("email_domains") != null && !jsonObj.get("email_domains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_domains` to be an array in the JSON string but got `%s`", jsonObj.get("email_domains").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkspaceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkspaceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkspaceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkspaceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkspaceResponse>() {
           @Override
           public void write(JsonWriter out, WorkspaceResponse value) throws IOException {
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
           public WorkspaceResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkspaceResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkspaceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkspaceResponse
  * @throws IOException if the JSON string is invalid with respect to WorkspaceResponse
  */
  public static WorkspaceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkspaceResponse.class);
  }

 /**
  * Convert an instance of WorkspaceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

