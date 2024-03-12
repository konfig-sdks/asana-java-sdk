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
 * The entity that triggered the event. Will typically be a user.
 */
@ApiModel(description = "The entity that triggered the event. Will typically be a user.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AuditLogEventActor {
  /**
   * The type of actor. Can be one of &#x60;user&#x60;, &#x60;asana&#x60;, &#x60;asana_support&#x60;, &#x60;anonymous&#x60;, or &#x60;external_administrator&#x60;.
   */
  @JsonAdapter(ActorTypeEnum.Adapter.class)
 public enum ActorTypeEnum {
    USER("user"),
    
    ASANA("asana"),
    
    ASANA_SUPPORT("asana_support"),
    
    ANONYMOUS("anonymous"),
    
    EXTERNAL_ADMINISTRATOR("external_administrator");

    private String value;

    ActorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActorTypeEnum fromValue(String value) {
      for (ActorTypeEnum b : ActorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActorTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTOR_TYPE = "actor_type";
  @SerializedName(SERIALIZED_NAME_ACTOR_TYPE)
  private ActorTypeEnum actorType;

  public static final String SERIALIZED_NAME_GID = "gid";
  @SerializedName(SERIALIZED_NAME_GID)
  private String gid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public AuditLogEventActor() {
  }

  public AuditLogEventActor actorType(ActorTypeEnum actorType) {
    
    
    
    
    this.actorType = actorType;
    return this;
  }

   /**
   * The type of actor. Can be one of &#x60;user&#x60;, &#x60;asana&#x60;, &#x60;asana_support&#x60;, &#x60;anonymous&#x60;, or &#x60;external_administrator&#x60;.
   * @return actorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USER", value = "The type of actor. Can be one of `user`, `asana`, `asana_support`, `anonymous`, or `external_administrator`.")

  public ActorTypeEnum getActorType() {
    return actorType;
  }


  public void setActorType(ActorTypeEnum actorType) {
    
    
    
    this.actorType = actorType;
  }


  public AuditLogEventActor gid(String gid) {
    
    
    
    
    this.gid = gid;
    return this;
  }

   /**
   * Globally unique identifier of the actor, if it is a user.
   * @return gid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1111", value = "Globally unique identifier of the actor, if it is a user.")

  public String getGid() {
    return gid;
  }


  public void setGid(String gid) {
    
    
    
    this.gid = gid;
  }


  public AuditLogEventActor name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the actor, if it is a user.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Greg Sanchez", value = "The name of the actor, if it is a user.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public AuditLogEventActor email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * The email of the actor, if it is a user.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gregsanchez@example.com", value = "The email of the actor, if it is a user.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
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
   * @return the AuditLogEventActor instance itself
   */
  public AuditLogEventActor putAdditionalProperty(String key, Object value) {
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
    AuditLogEventActor auditLogEventActor = (AuditLogEventActor) o;
    return Objects.equals(this.actorType, auditLogEventActor.actorType) &&
        Objects.equals(this.gid, auditLogEventActor.gid) &&
        Objects.equals(this.name, auditLogEventActor.name) &&
        Objects.equals(this.email, auditLogEventActor.email)&&
        Objects.equals(this.additionalProperties, auditLogEventActor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorType, gid, name, email, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogEventActor {\n");
    sb.append("    actorType: ").append(toIndentedString(actorType)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("actor_type");
    openapiFields.add("gid");
    openapiFields.add("name");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuditLogEventActor
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuditLogEventActor.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditLogEventActor is not found in the empty JSON string", AuditLogEventActor.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("actor_type") != null && !jsonObj.get("actor_type").isJsonNull()) && !jsonObj.get("actor_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actor_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actor_type").toString()));
      }
      if ((jsonObj.get("gid") != null && !jsonObj.get("gid").isJsonNull()) && !jsonObj.get("gid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditLogEventActor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditLogEventActor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditLogEventActor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditLogEventActor.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditLogEventActor>() {
           @Override
           public void write(JsonWriter out, AuditLogEventActor value) throws IOException {
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
           public AuditLogEventActor read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuditLogEventActor instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuditLogEventActor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuditLogEventActor
  * @throws IOException if the JSON string is invalid with respect to AuditLogEventActor
  */
  public static AuditLogEventActor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditLogEventActor.class);
  }

 /**
  * Convert an instance of AuditLogEventActor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
