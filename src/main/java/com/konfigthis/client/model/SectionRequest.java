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
 * SectionRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SectionRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INSERT_BEFORE = "insert_before";
  @SerializedName(SERIALIZED_NAME_INSERT_BEFORE)
  private String insertBefore;

  public static final String SERIALIZED_NAME_INSERT_AFTER = "insert_after";
  @SerializedName(SERIALIZED_NAME_INSERT_AFTER)
  private String insertAfter;

  public SectionRequest() {
  }

  public SectionRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The text to be displayed as the section name. This cannot be an empty string.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Next Actions", required = true, value = "The text to be displayed as the section name. This cannot be an empty string.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public SectionRequest insertBefore(String insertBefore) {
    
    
    
    
    this.insertBefore = insertBefore;
    return this;
  }

   /**
   * An existing section within this project before which the added section should be inserted. Cannot be provided together with insert_after.
   * @return insertBefore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "86420", value = "An existing section within this project before which the added section should be inserted. Cannot be provided together with insert_after.")

  public String getInsertBefore() {
    return insertBefore;
  }


  public void setInsertBefore(String insertBefore) {
    
    
    
    this.insertBefore = insertBefore;
  }


  public SectionRequest insertAfter(String insertAfter) {
    
    
    
    
    this.insertAfter = insertAfter;
    return this;
  }

   /**
   * An existing section within this project after which the added section should be inserted. Cannot be provided together with insert_before.
   * @return insertAfter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "987654", value = "An existing section within this project after which the added section should be inserted. Cannot be provided together with insert_before.")

  public String getInsertAfter() {
    return insertAfter;
  }


  public void setInsertAfter(String insertAfter) {
    
    
    
    this.insertAfter = insertAfter;
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
   * @return the SectionRequest instance itself
   */
  public SectionRequest putAdditionalProperty(String key, Object value) {
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
    SectionRequest sectionRequest = (SectionRequest) o;
    return Objects.equals(this.name, sectionRequest.name) &&
        Objects.equals(this.insertBefore, sectionRequest.insertBefore) &&
        Objects.equals(this.insertAfter, sectionRequest.insertAfter)&&
        Objects.equals(this.additionalProperties, sectionRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, insertBefore, insertAfter, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
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
    openapiFields.add("insert_before");
    openapiFields.add("insert_after");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SectionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SectionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SectionRequest is not found in the empty JSON string", SectionRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SectionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("insert_before") != null && !jsonObj.get("insert_before").isJsonNull()) && !jsonObj.get("insert_before").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insert_before` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insert_before").toString()));
      }
      if ((jsonObj.get("insert_after") != null && !jsonObj.get("insert_after").isJsonNull()) && !jsonObj.get("insert_after").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insert_after` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insert_after").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SectionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SectionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SectionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SectionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SectionRequest>() {
           @Override
           public void write(JsonWriter out, SectionRequest value) throws IOException {
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
           public SectionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SectionRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SectionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SectionRequest
  * @throws IOException if the JSON string is invalid with respect to SectionRequest
  */
  public static SectionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SectionRequest.class);
  }

 /**
  * Convert an instance of SectionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

