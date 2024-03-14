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
import com.konfigthis.client.model.UserCompact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * CustomFieldResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CustomFieldResponseAllOf {
  /**
   * This field tells the type of the custom field.
   */
  @JsonAdapter(RepresentationTypeEnum.Adapter.class)
 public enum RepresentationTypeEnum {
    TEXT("text"),
    
    ENUM("enum"),
    
    MULTI_ENUM("multi_enum"),
    
    NUMBER("number"),
    
    DATE("date"),
    
    PEOPLE("people"),
    
    FORMULA("formula"),
    
    CUSTOM_ID("custom_id");

    private String value;

    RepresentationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RepresentationTypeEnum fromValue(String value) {
      for (RepresentationTypeEnum b : RepresentationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RepresentationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RepresentationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RepresentationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RepresentationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REPRESENTATION_TYPE = "representation_type";
  @SerializedName(SERIALIZED_NAME_REPRESENTATION_TYPE)
  private RepresentationTypeEnum representationType;

  public static final String SERIALIZED_NAME_ID_PREFIX = "id_prefix";
  @SerializedName(SERIALIZED_NAME_ID_PREFIX)
  private String idPrefix;

  public static final String SERIALIZED_NAME_IS_FORMULA_FIELD = "is_formula_field";
  @SerializedName(SERIALIZED_NAME_IS_FORMULA_FIELD)
  private Boolean isFormulaField;

  public static final String SERIALIZED_NAME_IS_VALUE_READ_ONLY = "is_value_read_only";
  @SerializedName(SERIALIZED_NAME_IS_VALUE_READ_ONLY)
  private Boolean isValueReadOnly;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UserCompact createdBy;

  public static final String SERIALIZED_NAME_PEOPLE_VALUE = "people_value";
  @SerializedName(SERIALIZED_NAME_PEOPLE_VALUE)
  private List<UserCompact> peopleValue = null;

  public CustomFieldResponseAllOf() {
  }

  
  public CustomFieldResponseAllOf(
     RepresentationTypeEnum representationType
  ) {
    this();
    this.representationType = representationType;
  }

   /**
   * This field tells the type of the custom field.
   * @return representationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NUMBER", value = "This field tells the type of the custom field.")

  public RepresentationTypeEnum getRepresentationType() {
    return representationType;
  }




  public CustomFieldResponseAllOf idPrefix(String idPrefix) {
    
    
    
    
    this.idPrefix = idPrefix;
    return this;
  }

   /**
   * This field is the unique custom ID string for the custom field.
   * @return idPrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ID", value = "This field is the unique custom ID string for the custom field.")

  public String getIdPrefix() {
    return idPrefix;
  }


  public void setIdPrefix(String idPrefix) {
    
    
    
    this.idPrefix = idPrefix;
  }


  public CustomFieldResponseAllOf isFormulaField(Boolean isFormulaField) {
    
    
    
    
    this.isFormulaField = isFormulaField;
    return this;
  }

   /**
   * *Conditional*. This flag describes whether a custom field is a formula custom field.
   * @return isFormulaField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "*Conditional*. This flag describes whether a custom field is a formula custom field.")

  public Boolean getIsFormulaField() {
    return isFormulaField;
  }


  public void setIsFormulaField(Boolean isFormulaField) {
    
    
    
    this.isFormulaField = isFormulaField;
  }


  public CustomFieldResponseAllOf isValueReadOnly(Boolean isValueReadOnly) {
    
    
    
    
    this.isValueReadOnly = isValueReadOnly;
    return this;
  }

   /**
   * *Conditional*. This flag describes whether a custom field is read only.
   * @return isValueReadOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "*Conditional*. This flag describes whether a custom field is read only.")

  public Boolean getIsValueReadOnly() {
    return isValueReadOnly;
  }


  public void setIsValueReadOnly(Boolean isValueReadOnly) {
    
    
    
    this.isValueReadOnly = isValueReadOnly;
  }


  public CustomFieldResponseAllOf createdBy(UserCompact createdBy) {
    
    
    
    
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


  public CustomFieldResponseAllOf peopleValue(List<UserCompact> peopleValue) {
    
    
    
    
    this.peopleValue = peopleValue;
    return this;
  }

  public CustomFieldResponseAllOf addPeopleValueItem(UserCompact peopleValueItem) {
    if (this.peopleValue == null) {
      this.peopleValue = new ArrayList<>();
    }
    this.peopleValue.add(peopleValueItem);
    return this;
  }

   /**
   * *Conditional*. Only relevant for custom fields of type &#x60;people&#x60;. This array of [compact user](https://raw.githubusercontent.com) objects reflects the values of a &#x60;people&#x60; custom field.
   * @return peopleValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*Conditional*. Only relevant for custom fields of type `people`. This array of [compact user](https://raw.githubusercontent.com) objects reflects the values of a `people` custom field.")

  public List<UserCompact> getPeopleValue() {
    return peopleValue;
  }


  public void setPeopleValue(List<UserCompact> peopleValue) {
    
    
    
    this.peopleValue = peopleValue;
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
   * @return the CustomFieldResponseAllOf instance itself
   */
  public CustomFieldResponseAllOf putAdditionalProperty(String key, Object value) {
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
    CustomFieldResponseAllOf customFieldResponseAllOf = (CustomFieldResponseAllOf) o;
    return Objects.equals(this.representationType, customFieldResponseAllOf.representationType) &&
        Objects.equals(this.idPrefix, customFieldResponseAllOf.idPrefix) &&
        Objects.equals(this.isFormulaField, customFieldResponseAllOf.isFormulaField) &&
        Objects.equals(this.isValueReadOnly, customFieldResponseAllOf.isValueReadOnly) &&
        Objects.equals(this.createdBy, customFieldResponseAllOf.createdBy) &&
        Objects.equals(this.peopleValue, customFieldResponseAllOf.peopleValue)&&
        Objects.equals(this.additionalProperties, customFieldResponseAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(representationType, idPrefix, isFormulaField, isValueReadOnly, createdBy, peopleValue, additionalProperties);
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
    sb.append("class CustomFieldResponseAllOf {\n");
    sb.append("    representationType: ").append(toIndentedString(representationType)).append("\n");
    sb.append("    idPrefix: ").append(toIndentedString(idPrefix)).append("\n");
    sb.append("    isFormulaField: ").append(toIndentedString(isFormulaField)).append("\n");
    sb.append("    isValueReadOnly: ").append(toIndentedString(isValueReadOnly)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    peopleValue: ").append(toIndentedString(peopleValue)).append("\n");
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
    openapiFields.add("representation_type");
    openapiFields.add("id_prefix");
    openapiFields.add("is_formula_field");
    openapiFields.add("is_value_read_only");
    openapiFields.add("created_by");
    openapiFields.add("people_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomFieldResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomFieldResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldResponseAllOf is not found in the empty JSON string", CustomFieldResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("representation_type") != null && !jsonObj.get("representation_type").isJsonNull()) && !jsonObj.get("representation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `representation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("representation_type").toString()));
      }
      if (!jsonObj.get("id_prefix").isJsonNull() && (jsonObj.get("id_prefix") != null && !jsonObj.get("id_prefix").isJsonNull()) && !jsonObj.get("id_prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_prefix").toString()));
      }
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        UserCompact.validateJsonObject(jsonObj.getAsJsonObject("created_by"));
      }
      if (jsonObj.get("people_value") != null && !jsonObj.get("people_value").isJsonNull()) {
        JsonArray jsonArraypeopleValue = jsonObj.getAsJsonArray("people_value");
        if (jsonArraypeopleValue != null) {
          // ensure the json data is an array
          if (!jsonObj.get("people_value").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `people_value` to be an array in the JSON string but got `%s`", jsonObj.get("people_value").toString()));
          }

          // validate the optional field `people_value` (array)
          for (int i = 0; i < jsonArraypeopleValue.size(); i++) {
            UserCompact.validateJsonObject(jsonArraypeopleValue.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldResponseAllOf>() {
           @Override
           public void write(JsonWriter out, CustomFieldResponseAllOf value) throws IOException {
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
           public CustomFieldResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CustomFieldResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomFieldResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomFieldResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to CustomFieldResponseAllOf
  */
  public static CustomFieldResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldResponseAllOf.class);
  }

 /**
  * Convert an instance of CustomFieldResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

