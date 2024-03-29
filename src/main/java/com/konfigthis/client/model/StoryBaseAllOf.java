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
import java.time.OffsetDateTime;

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
 * A story represents an activity associated with an object in the Asana system.
 */
@ApiModel(description = "A story represents an activity associated with an object in the Asana system.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class StoryBaseAllOf {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_RESOURCE_SUBTYPE = "resource_subtype";
  @SerializedName(SERIALIZED_NAME_RESOURCE_SUBTYPE)
  private String resourceSubtype;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_HTML_TEXT = "html_text";
  @SerializedName(SERIALIZED_NAME_HTML_TEXT)
  private String htmlText;

  public static final String SERIALIZED_NAME_IS_PINNED = "is_pinned";
  @SerializedName(SERIALIZED_NAME_IS_PINNED)
  private Boolean isPinned;

  /**
   * The name of the sticker in this story. &#x60;null&#x60; if there is no sticker.
   */
  @JsonAdapter(StickerNameEnum.Adapter.class)
 public enum StickerNameEnum {
    GREEN_CHECKMARK("green_checkmark"),
    
    PEOPLE_DANCING("people_dancing"),
    
    DANCING_UNICORN("dancing_unicorn"),
    
    HEART("heart"),
    
    PARTY_POPPER("party_popper"),
    
    PEOPLE_WAVING_FLAGS("people_waving_flags"),
    
    SPLASHING_NARWHAL("splashing_narwhal"),
    
    TROPHY("trophy"),
    
    YETI_RIDING_UNICORN("yeti_riding_unicorn"),
    
    CELEBRATING_PEOPLE("celebrating_people"),
    
    DETERMINED_CLIMBERS("determined_climbers"),
    
    PHOENIX_SPREADING_LOVE("phoenix_spreading_love");

    private String value;

    StickerNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StickerNameEnum fromValue(String value) {
      for (StickerNameEnum b : StickerNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StickerNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StickerNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StickerNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StickerNameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STICKER_NAME = "sticker_name";
  @SerializedName(SERIALIZED_NAME_STICKER_NAME)
  private StickerNameEnum stickerName;

  public StoryBaseAllOf() {
  }

  
  public StoryBaseAllOf(
     OffsetDateTime createdAt, 
     String resourceSubtype
  ) {
    this();
    this.createdAt = createdAt;
    this.resourceSubtype = resourceSubtype;
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




   /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   * @return resourceSubtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "comment_added", value = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.")

  public String getResourceSubtype() {
    return resourceSubtype;
  }




  public StoryBaseAllOf text(String text) {
    
    
    
    
    this.text = text;
    return this;
  }

   /**
   * The plain text of the comment to add. Cannot be used with html_text.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a comment.", value = "The plain text of the comment to add. Cannot be used with html_text.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    
    
    
    this.text = text;
  }


  public StoryBaseAllOf htmlText(String htmlText) {
    
    
    
    
    this.htmlText = htmlText;
    return this;
  }

   /**
   * [Opt In](https://raw.githubusercontent.com). HTML formatted text for a comment. This will not include the name of the creator.
   * @return htmlText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<body>This is a comment.</body>", value = "[Opt In](https://raw.githubusercontent.com). HTML formatted text for a comment. This will not include the name of the creator.")

  public String getHtmlText() {
    return htmlText;
  }


  public void setHtmlText(String htmlText) {
    
    
    
    this.htmlText = htmlText;
  }


  public StoryBaseAllOf isPinned(Boolean isPinned) {
    
    
    
    
    this.isPinned = isPinned;
    return this;
  }

   /**
   * *Conditional*. Whether the story should be pinned on the resource.
   * @return isPinned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "*Conditional*. Whether the story should be pinned on the resource.")

  public Boolean getIsPinned() {
    return isPinned;
  }


  public void setIsPinned(Boolean isPinned) {
    
    
    
    this.isPinned = isPinned;
  }


  public StoryBaseAllOf stickerName(StickerNameEnum stickerName) {
    
    
    
    
    this.stickerName = stickerName;
    return this;
  }

   /**
   * The name of the sticker in this story. &#x60;null&#x60; if there is no sticker.
   * @return stickerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DANCING_UNICORN", value = "The name of the sticker in this story. `null` if there is no sticker.")

  public StickerNameEnum getStickerName() {
    return stickerName;
  }


  public void setStickerName(StickerNameEnum stickerName) {
    
    
    
    this.stickerName = stickerName;
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
   * @return the StoryBaseAllOf instance itself
   */
  public StoryBaseAllOf putAdditionalProperty(String key, Object value) {
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
    StoryBaseAllOf storyBaseAllOf = (StoryBaseAllOf) o;
    return Objects.equals(this.createdAt, storyBaseAllOf.createdAt) &&
        Objects.equals(this.resourceSubtype, storyBaseAllOf.resourceSubtype) &&
        Objects.equals(this.text, storyBaseAllOf.text) &&
        Objects.equals(this.htmlText, storyBaseAllOf.htmlText) &&
        Objects.equals(this.isPinned, storyBaseAllOf.isPinned) &&
        Objects.equals(this.stickerName, storyBaseAllOf.stickerName)&&
        Objects.equals(this.additionalProperties, storyBaseAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, resourceSubtype, text, htmlText, isPinned, stickerName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoryBaseAllOf {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
    sb.append("    stickerName: ").append(toIndentedString(stickerName)).append("\n");
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
    openapiFields.add("resource_subtype");
    openapiFields.add("text");
    openapiFields.add("html_text");
    openapiFields.add("is_pinned");
    openapiFields.add("sticker_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StoryBaseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StoryBaseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StoryBaseAllOf is not found in the empty JSON string", StoryBaseAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("resource_subtype") != null && !jsonObj.get("resource_subtype").isJsonNull()) && !jsonObj.get("resource_subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_subtype").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("html_text") != null && !jsonObj.get("html_text").isJsonNull()) && !jsonObj.get("html_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_text").toString()));
      }
      if ((jsonObj.get("sticker_name") != null && !jsonObj.get("sticker_name").isJsonNull()) && !jsonObj.get("sticker_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sticker_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sticker_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StoryBaseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StoryBaseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StoryBaseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StoryBaseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<StoryBaseAllOf>() {
           @Override
           public void write(JsonWriter out, StoryBaseAllOf value) throws IOException {
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
           public StoryBaseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StoryBaseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StoryBaseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StoryBaseAllOf
  * @throws IOException if the JSON string is invalid with respect to StoryBaseAllOf
  */
  public static StoryBaseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StoryBaseAllOf.class);
  }

 /**
  * Convert an instance of StoryBaseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

