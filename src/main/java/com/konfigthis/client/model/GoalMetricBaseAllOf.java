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
 * GoalMetricBaseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GoalMetricBaseAllOf {
  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   */
  @JsonAdapter(ResourceSubtypeEnum.Adapter.class)
 public enum ResourceSubtypeEnum {
    NUMBER("number");

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

  public static final String SERIALIZED_NAME_PRECISION = "precision";
  @SerializedName(SERIALIZED_NAME_PRECISION)
  private Integer precision;

  /**
   * A supported unit of measure for the goal metric, or none.
   */
  @JsonAdapter(UnitEnum.Adapter.class)
 public enum UnitEnum {
    NONE("none"),
    
    CURRENCY("currency"),
    
    PERCENTAGE("percentage");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UnitEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private UnitEnum unit;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_INITIAL_NUMBER_VALUE = "initial_number_value";
  @SerializedName(SERIALIZED_NAME_INITIAL_NUMBER_VALUE)
  private Double initialNumberValue;

  public static final String SERIALIZED_NAME_TARGET_NUMBER_VALUE = "target_number_value";
  @SerializedName(SERIALIZED_NAME_TARGET_NUMBER_VALUE)
  private Double targetNumberValue;

  public static final String SERIALIZED_NAME_CURRENT_NUMBER_VALUE = "current_number_value";
  @SerializedName(SERIALIZED_NAME_CURRENT_NUMBER_VALUE)
  private Double currentNumberValue;

  public static final String SERIALIZED_NAME_CURRENT_DISPLAY_VALUE = "current_display_value";
  @SerializedName(SERIALIZED_NAME_CURRENT_DISPLAY_VALUE)
  private String currentDisplayValue;

  /**
   * This field defines how the progress value of a goal metric is being calculated. A goal&#39;s progress can be provided manually by the user, calculated automatically from contributing subgoals, projects, or tasks, or managed by an integration with an external data source, such as Salesforce.
   */
  @JsonAdapter(ProgressSourceEnum.Adapter.class)
 public enum ProgressSourceEnum {
    MANUAL("manual"),
    
    SUBGOAL_PROGRESS("subgoal_progress"),
    
    PROJECT_TASK_COMPLETION("project_task_completion"),
    
    PROJECT_MILESTONE_COMPLETION("project_milestone_completion"),
    
    TASK_COMPLETION("task_completion"),
    
    EXTERNAL("external");

    private String value;

    ProgressSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProgressSourceEnum fromValue(String value) {
      for (ProgressSourceEnum b : ProgressSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProgressSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProgressSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProgressSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProgressSourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROGRESS_SOURCE = "progress_source";
  @SerializedName(SERIALIZED_NAME_PROGRESS_SOURCE)
  private ProgressSourceEnum progressSource;

  public GoalMetricBaseAllOf() {
  }

  
  public GoalMetricBaseAllOf(
     ResourceSubtypeEnum resourceSubtype, 
     String currentDisplayValue
  ) {
    this();
    this.resourceSubtype = resourceSubtype;
    this.currentDisplayValue = currentDisplayValue;
  }

   /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   * @return resourceSubtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NUMBER", value = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.")

  public ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }




  public GoalMetricBaseAllOf precision(Integer precision) {
    
    
    
    
    this.precision = precision;
    return this;
  }

   /**
   * *Conditional*. Only relevant for goal metrics of type ‘Number’. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%.
   * @return precision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "*Conditional*. Only relevant for goal metrics of type ‘Number’. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%.")

  public Integer getPrecision() {
    return precision;
  }


  public void setPrecision(Integer precision) {
    
    
    
    this.precision = precision;
  }


  public GoalMetricBaseAllOf unit(UnitEnum unit) {
    
    
    
    
    this.unit = unit;
    return this;
  }

   /**
   * A supported unit of measure for the goal metric, or none.
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A supported unit of measure for the goal metric, or none.")

  public UnitEnum getUnit() {
    return unit;
  }


  public void setUnit(UnitEnum unit) {
    
    
    
    this.unit = unit;
  }


  public GoalMetricBaseAllOf currencyCode(String currencyCode) {
    
    
    
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * ISO 4217 currency code to format this custom field. This will be null if the &#x60;unit&#x60; is not &#x60;currency&#x60;.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EUR", value = "ISO 4217 currency code to format this custom field. This will be null if the `unit` is not `currency`.")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    
    
    
    this.currencyCode = currencyCode;
  }


  public GoalMetricBaseAllOf initialNumberValue(Double initialNumberValue) {
    
    
    
    
    this.initialNumberValue = initialNumberValue;
    return this;
  }

  public GoalMetricBaseAllOf initialNumberValue(Integer initialNumberValue) {
    
    
    
    
    this.initialNumberValue = initialNumberValue.doubleValue();
    return this;
  }

   /**
   * This number is the start value of a goal metric of type number.
   * @return initialNumberValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.2", value = "This number is the start value of a goal metric of type number.")

  public Double getInitialNumberValue() {
    return initialNumberValue;
  }


  public void setInitialNumberValue(Double initialNumberValue) {
    
    
    
    this.initialNumberValue = initialNumberValue;
  }


  public GoalMetricBaseAllOf targetNumberValue(Double targetNumberValue) {
    
    
    
    
    this.targetNumberValue = targetNumberValue;
    return this;
  }

  public GoalMetricBaseAllOf targetNumberValue(Integer targetNumberValue) {
    
    
    
    
    this.targetNumberValue = targetNumberValue.doubleValue();
    return this;
  }

   /**
   * This number is the end value of a goal metric of type number. This number cannot equal &#x60;initial_number_value&#x60;.
   * @return targetNumberValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.2", value = "This number is the end value of a goal metric of type number. This number cannot equal `initial_number_value`.")

  public Double getTargetNumberValue() {
    return targetNumberValue;
  }


  public void setTargetNumberValue(Double targetNumberValue) {
    
    
    
    this.targetNumberValue = targetNumberValue;
  }


  public GoalMetricBaseAllOf currentNumberValue(Double currentNumberValue) {
    
    
    
    
    this.currentNumberValue = currentNumberValue;
    return this;
  }

  public GoalMetricBaseAllOf currentNumberValue(Integer currentNumberValue) {
    
    
    
    
    this.currentNumberValue = currentNumberValue.doubleValue();
    return this;
  }

   /**
   * This number is the current value of a goal metric of type number.
   * @return currentNumberValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.12", value = "This number is the current value of a goal metric of type number.")

  public Double getCurrentNumberValue() {
    return currentNumberValue;
  }


  public void setCurrentNumberValue(Double currentNumberValue) {
    
    
    
    this.currentNumberValue = currentNumberValue;
  }


   /**
   * This string is the current value of a goal metric of type string.
   * @return currentDisplayValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.12", value = "This string is the current value of a goal metric of type string.")

  public String getCurrentDisplayValue() {
    return currentDisplayValue;
  }




  public GoalMetricBaseAllOf progressSource(ProgressSourceEnum progressSource) {
    
    
    
    
    this.progressSource = progressSource;
    return this;
  }

   /**
   * This field defines how the progress value of a goal metric is being calculated. A goal&#39;s progress can be provided manually by the user, calculated automatically from contributing subgoals, projects, or tasks, or managed by an integration with an external data source, such as Salesforce.
   * @return progressSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MANUAL", value = "This field defines how the progress value of a goal metric is being calculated. A goal's progress can be provided manually by the user, calculated automatically from contributing subgoals, projects, or tasks, or managed by an integration with an external data source, such as Salesforce.")

  public ProgressSourceEnum getProgressSource() {
    return progressSource;
  }


  public void setProgressSource(ProgressSourceEnum progressSource) {
    
    
    
    this.progressSource = progressSource;
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
   * @return the GoalMetricBaseAllOf instance itself
   */
  public GoalMetricBaseAllOf putAdditionalProperty(String key, Object value) {
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
    GoalMetricBaseAllOf goalMetricBaseAllOf = (GoalMetricBaseAllOf) o;
    return Objects.equals(this.resourceSubtype, goalMetricBaseAllOf.resourceSubtype) &&
        Objects.equals(this.precision, goalMetricBaseAllOf.precision) &&
        Objects.equals(this.unit, goalMetricBaseAllOf.unit) &&
        Objects.equals(this.currencyCode, goalMetricBaseAllOf.currencyCode) &&
        Objects.equals(this.initialNumberValue, goalMetricBaseAllOf.initialNumberValue) &&
        Objects.equals(this.targetNumberValue, goalMetricBaseAllOf.targetNumberValue) &&
        Objects.equals(this.currentNumberValue, goalMetricBaseAllOf.currentNumberValue) &&
        Objects.equals(this.currentDisplayValue, goalMetricBaseAllOf.currentDisplayValue) &&
        Objects.equals(this.progressSource, goalMetricBaseAllOf.progressSource)&&
        Objects.equals(this.additionalProperties, goalMetricBaseAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceSubtype, precision, unit, currencyCode, initialNumberValue, targetNumberValue, currentNumberValue, currentDisplayValue, progressSource, additionalProperties);
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
    sb.append("class GoalMetricBaseAllOf {\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    initialNumberValue: ").append(toIndentedString(initialNumberValue)).append("\n");
    sb.append("    targetNumberValue: ").append(toIndentedString(targetNumberValue)).append("\n");
    sb.append("    currentNumberValue: ").append(toIndentedString(currentNumberValue)).append("\n");
    sb.append("    currentDisplayValue: ").append(toIndentedString(currentDisplayValue)).append("\n");
    sb.append("    progressSource: ").append(toIndentedString(progressSource)).append("\n");
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
    openapiFields.add("precision");
    openapiFields.add("unit");
    openapiFields.add("currency_code");
    openapiFields.add("initial_number_value");
    openapiFields.add("target_number_value");
    openapiFields.add("current_number_value");
    openapiFields.add("current_display_value");
    openapiFields.add("progress_source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoalMetricBaseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GoalMetricBaseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoalMetricBaseAllOf is not found in the empty JSON string", GoalMetricBaseAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("resource_subtype") != null && !jsonObj.get("resource_subtype").isJsonNull()) && !jsonObj.get("resource_subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_subtype").toString()));
      }
      if ((jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
      if (!jsonObj.get("currency_code").isJsonNull() && (jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if ((jsonObj.get("current_display_value") != null && !jsonObj.get("current_display_value").isJsonNull()) && !jsonObj.get("current_display_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_display_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_display_value").toString()));
      }
      if ((jsonObj.get("progress_source") != null && !jsonObj.get("progress_source").isJsonNull()) && !jsonObj.get("progress_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `progress_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("progress_source").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoalMetricBaseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoalMetricBaseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoalMetricBaseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoalMetricBaseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GoalMetricBaseAllOf>() {
           @Override
           public void write(JsonWriter out, GoalMetricBaseAllOf value) throws IOException {
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
           public GoalMetricBaseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GoalMetricBaseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GoalMetricBaseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoalMetricBaseAllOf
  * @throws IOException if the JSON string is invalid with respect to GoalMetricBaseAllOf
  */
  public static GoalMetricBaseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoalMetricBaseAllOf.class);
  }

 /**
  * Convert an instance of GoalMetricBaseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

