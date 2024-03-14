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
 * The context from which this event originated.
 */
@ApiModel(description = "The context from which this event originated.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AuditLogEventContext {
  /**
   * The type of context. Can be one of &#x60;web&#x60;, &#x60;desktop&#x60;, &#x60;mobile&#x60;, &#x60;asana_support&#x60;, &#x60;asana&#x60;, &#x60;email&#x60;, or &#x60;api&#x60;.
   */
  @JsonAdapter(ContextTypeEnum.Adapter.class)
 public enum ContextTypeEnum {
    WEB("web"),
    
    DESKTOP("desktop"),
    
    MOBILE("mobile"),
    
    ASANA_SUPPORT("asana_support"),
    
    ASANA("asana"),
    
    EMAIL("email"),
    
    API("api");

    private String value;

    ContextTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContextTypeEnum fromValue(String value) {
      for (ContextTypeEnum b : ContextTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContextTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContextTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContextTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContextTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONTEXT_TYPE = "context_type";
  @SerializedName(SERIALIZED_NAME_CONTEXT_TYPE)
  private ContextTypeEnum contextType;

  /**
   * The authentication method used in the context of an API request. Only present if the &#x60;context_type&#x60; is &#x60;api&#x60;. Can be one of &#x60;cookie&#x60;, &#x60;oauth&#x60;, &#x60;personal_access_token&#x60;, or &#x60;service_account&#x60;.
   */
  @JsonAdapter(ApiAuthenticationMethodEnum.Adapter.class)
 public enum ApiAuthenticationMethodEnum {
    COOKIE("cookie"),
    
    OAUTH("oauth"),
    
    PERSONAL_ACCESS_TOKEN("personal_access_token"),
    
    SERVICE_ACCOUNT("service_account");

    private String value;

    ApiAuthenticationMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApiAuthenticationMethodEnum fromValue(String value) {
      for (ApiAuthenticationMethodEnum b : ApiAuthenticationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ApiAuthenticationMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApiAuthenticationMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApiAuthenticationMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApiAuthenticationMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_API_AUTHENTICATION_METHOD = "api_authentication_method";
  @SerializedName(SERIALIZED_NAME_API_AUTHENTICATION_METHOD)
  private ApiAuthenticationMethodEnum apiAuthenticationMethod;

  public static final String SERIALIZED_NAME_CLIENT_IP_ADDRESS = "client_ip_address";
  @SerializedName(SERIALIZED_NAME_CLIENT_IP_ADDRESS)
  private String clientIpAddress;

  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public static final String SERIALIZED_NAME_OAUTH_APP_NAME = "oauth_app_name";
  @SerializedName(SERIALIZED_NAME_OAUTH_APP_NAME)
  private String oauthAppName;

  public AuditLogEventContext() {
  }

  public AuditLogEventContext contextType(ContextTypeEnum contextType) {
    
    
    
    
    this.contextType = contextType;
    return this;
  }

   /**
   * The type of context. Can be one of &#x60;web&#x60;, &#x60;desktop&#x60;, &#x60;mobile&#x60;, &#x60;asana_support&#x60;, &#x60;asana&#x60;, &#x60;email&#x60;, or &#x60;api&#x60;.
   * @return contextType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WEB", value = "The type of context. Can be one of `web`, `desktop`, `mobile`, `asana_support`, `asana`, `email`, or `api`.")

  public ContextTypeEnum getContextType() {
    return contextType;
  }


  public void setContextType(ContextTypeEnum contextType) {
    
    
    
    this.contextType = contextType;
  }


  public AuditLogEventContext apiAuthenticationMethod(ApiAuthenticationMethodEnum apiAuthenticationMethod) {
    
    
    
    
    this.apiAuthenticationMethod = apiAuthenticationMethod;
    return this;
  }

   /**
   * The authentication method used in the context of an API request. Only present if the &#x60;context_type&#x60; is &#x60;api&#x60;. Can be one of &#x60;cookie&#x60;, &#x60;oauth&#x60;, &#x60;personal_access_token&#x60;, or &#x60;service_account&#x60;.
   * @return apiAuthenticationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The authentication method used in the context of an API request. Only present if the `context_type` is `api`. Can be one of `cookie`, `oauth`, `personal_access_token`, or `service_account`.")

  public ApiAuthenticationMethodEnum getApiAuthenticationMethod() {
    return apiAuthenticationMethod;
  }


  public void setApiAuthenticationMethod(ApiAuthenticationMethodEnum apiAuthenticationMethod) {
    
    
    
    this.apiAuthenticationMethod = apiAuthenticationMethod;
  }


  public AuditLogEventContext clientIpAddress(String clientIpAddress) {
    
    
    
    
    this.clientIpAddress = clientIpAddress;
    return this;
  }

   /**
   * The IP address of the client that initiated the event, if applicable.
   * @return clientIpAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.1.1.1", value = "The IP address of the client that initiated the event, if applicable.")

  public String getClientIpAddress() {
    return clientIpAddress;
  }


  public void setClientIpAddress(String clientIpAddress) {
    
    
    
    this.clientIpAddress = clientIpAddress;
  }


  public AuditLogEventContext userAgent(String userAgent) {
    
    
    
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * The user agent of the client that initiated the event, if applicable.
   * @return userAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36", value = "The user agent of the client that initiated the event, if applicable.")

  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    
    
    
    this.userAgent = userAgent;
  }


  public AuditLogEventContext oauthAppName(String oauthAppName) {
    
    
    
    
    this.oauthAppName = oauthAppName;
    return this;
  }

   /**
   * The name of the OAuth App that initiated the event. Only present if the &#x60;api_authentication_method&#x60; is &#x60;oauth&#x60;.
   * @return oauthAppName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the OAuth App that initiated the event. Only present if the `api_authentication_method` is `oauth`.")

  public String getOauthAppName() {
    return oauthAppName;
  }


  public void setOauthAppName(String oauthAppName) {
    
    
    
    this.oauthAppName = oauthAppName;
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
   * @return the AuditLogEventContext instance itself
   */
  public AuditLogEventContext putAdditionalProperty(String key, Object value) {
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
    AuditLogEventContext auditLogEventContext = (AuditLogEventContext) o;
    return Objects.equals(this.contextType, auditLogEventContext.contextType) &&
        Objects.equals(this.apiAuthenticationMethod, auditLogEventContext.apiAuthenticationMethod) &&
        Objects.equals(this.clientIpAddress, auditLogEventContext.clientIpAddress) &&
        Objects.equals(this.userAgent, auditLogEventContext.userAgent) &&
        Objects.equals(this.oauthAppName, auditLogEventContext.oauthAppName)&&
        Objects.equals(this.additionalProperties, auditLogEventContext.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextType, apiAuthenticationMethod, clientIpAddress, userAgent, oauthAppName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogEventContext {\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    apiAuthenticationMethod: ").append(toIndentedString(apiAuthenticationMethod)).append("\n");
    sb.append("    clientIpAddress: ").append(toIndentedString(clientIpAddress)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    oauthAppName: ").append(toIndentedString(oauthAppName)).append("\n");
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
    openapiFields.add("context_type");
    openapiFields.add("api_authentication_method");
    openapiFields.add("client_ip_address");
    openapiFields.add("user_agent");
    openapiFields.add("oauth_app_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuditLogEventContext
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuditLogEventContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditLogEventContext is not found in the empty JSON string", AuditLogEventContext.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("context_type") != null && !jsonObj.get("context_type").isJsonNull()) && !jsonObj.get("context_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context_type").toString()));
      }
      if ((jsonObj.get("api_authentication_method") != null && !jsonObj.get("api_authentication_method").isJsonNull()) && !jsonObj.get("api_authentication_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_authentication_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_authentication_method").toString()));
      }
      if ((jsonObj.get("client_ip_address") != null && !jsonObj.get("client_ip_address").isJsonNull()) && !jsonObj.get("client_ip_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_ip_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_ip_address").toString()));
      }
      if ((jsonObj.get("user_agent") != null && !jsonObj.get("user_agent").isJsonNull()) && !jsonObj.get("user_agent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_agent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_agent").toString()));
      }
      if ((jsonObj.get("oauth_app_name") != null && !jsonObj.get("oauth_app_name").isJsonNull()) && !jsonObj.get("oauth_app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oauth_app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oauth_app_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditLogEventContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditLogEventContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditLogEventContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditLogEventContext.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditLogEventContext>() {
           @Override
           public void write(JsonWriter out, AuditLogEventContext value) throws IOException {
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
           public AuditLogEventContext read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuditLogEventContext instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuditLogEventContext given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuditLogEventContext
  * @throws IOException if the JSON string is invalid with respect to AuditLogEventContext
  */
  public static AuditLogEventContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditLogEventContext.class);
  }

 /**
  * Convert an instance of AuditLogEventContext to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

