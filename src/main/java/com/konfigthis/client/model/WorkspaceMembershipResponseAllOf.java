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
import com.konfigthis.client.model.UserTaskListCompact;
import com.konfigthis.client.model.WorkspaceMembershipResponseAllOfVacationDates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * WorkspaceMembershipResponseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkspaceMembershipResponseAllOf {
  public static final String SERIALIZED_NAME_USER_TASK_LIST = "user_task_list";
  @SerializedName(SERIALIZED_NAME_USER_TASK_LIST)
  private UserTaskListCompact userTaskList;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_ADMIN = "is_admin";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN)
  private Boolean isAdmin;

  public static final String SERIALIZED_NAME_IS_GUEST = "is_guest";
  @SerializedName(SERIALIZED_NAME_IS_GUEST)
  private Boolean isGuest;

  public static final String SERIALIZED_NAME_VACATION_DATES = "vacation_dates";
  @SerializedName(SERIALIZED_NAME_VACATION_DATES)
  private WorkspaceMembershipResponseAllOfVacationDates vacationDates;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public WorkspaceMembershipResponseAllOf() {
  }

  
  public WorkspaceMembershipResponseAllOf(
     Boolean isActive, 
     Boolean isAdmin, 
     Boolean isGuest, 
     OffsetDateTime createdAt
  ) {
    this();
    this.isActive = isActive;
    this.isAdmin = isAdmin;
    this.isGuest = isGuest;
    this.createdAt = createdAt;
  }

  public WorkspaceMembershipResponseAllOf userTaskList(UserTaskListCompact userTaskList) {
    
    
    
    
    this.userTaskList = userTaskList;
    return this;
  }

   /**
   * Get userTaskList
   * @return userTaskList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserTaskListCompact getUserTaskList() {
    return userTaskList;
  }


  public void setUserTaskList(UserTaskListCompact userTaskList) {
    
    
    
    this.userTaskList = userTaskList;
  }


   /**
   * Reflects if this user still a member of the workspace.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reflects if this user still a member of the workspace.")

  public Boolean getIsActive() {
    return isActive;
  }




   /**
   * Reflects if this user is an admin of the workspace.
   * @return isAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reflects if this user is an admin of the workspace.")

  public Boolean getIsAdmin() {
    return isAdmin;
  }




   /**
   * Reflects if this user is a guest of the workspace.
   * @return isGuest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reflects if this user is a guest of the workspace.")

  public Boolean getIsGuest() {
    return isGuest;
  }




  public WorkspaceMembershipResponseAllOf vacationDates(WorkspaceMembershipResponseAllOfVacationDates vacationDates) {
    
    
    
    
    this.vacationDates = vacationDates;
    return this;
  }

   /**
   * Get vacationDates
   * @return vacationDates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkspaceMembershipResponseAllOfVacationDates getVacationDates() {
    return vacationDates;
  }


  public void setVacationDates(WorkspaceMembershipResponseAllOfVacationDates vacationDates) {
    
    
    
    this.vacationDates = vacationDates;
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
   * @return the WorkspaceMembershipResponseAllOf instance itself
   */
  public WorkspaceMembershipResponseAllOf putAdditionalProperty(String key, Object value) {
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
    WorkspaceMembershipResponseAllOf workspaceMembershipResponseAllOf = (WorkspaceMembershipResponseAllOf) o;
    return Objects.equals(this.userTaskList, workspaceMembershipResponseAllOf.userTaskList) &&
        Objects.equals(this.isActive, workspaceMembershipResponseAllOf.isActive) &&
        Objects.equals(this.isAdmin, workspaceMembershipResponseAllOf.isAdmin) &&
        Objects.equals(this.isGuest, workspaceMembershipResponseAllOf.isGuest) &&
        Objects.equals(this.vacationDates, workspaceMembershipResponseAllOf.vacationDates) &&
        Objects.equals(this.createdAt, workspaceMembershipResponseAllOf.createdAt)&&
        Objects.equals(this.additionalProperties, workspaceMembershipResponseAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userTaskList, isActive, isAdmin, isGuest, vacationDates, createdAt, additionalProperties);
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
    sb.append("class WorkspaceMembershipResponseAllOf {\n");
    sb.append("    userTaskList: ").append(toIndentedString(userTaskList)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isGuest: ").append(toIndentedString(isGuest)).append("\n");
    sb.append("    vacationDates: ").append(toIndentedString(vacationDates)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("user_task_list");
    openapiFields.add("is_active");
    openapiFields.add("is_admin");
    openapiFields.add("is_guest");
    openapiFields.add("vacation_dates");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkspaceMembershipResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkspaceMembershipResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkspaceMembershipResponseAllOf is not found in the empty JSON string", WorkspaceMembershipResponseAllOf.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `user_task_list`
      if (jsonObj.get("user_task_list") != null && !jsonObj.get("user_task_list").isJsonNull()) {
        UserTaskListCompact.validateJsonObject(jsonObj.getAsJsonObject("user_task_list"));
      }
      // validate the optional field `vacation_dates`
      if (jsonObj.get("vacation_dates") != null && !jsonObj.get("vacation_dates").isJsonNull()) {
        WorkspaceMembershipResponseAllOfVacationDates.validateJsonObject(jsonObj.getAsJsonObject("vacation_dates"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkspaceMembershipResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkspaceMembershipResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkspaceMembershipResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkspaceMembershipResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkspaceMembershipResponseAllOf>() {
           @Override
           public void write(JsonWriter out, WorkspaceMembershipResponseAllOf value) throws IOException {
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
           public WorkspaceMembershipResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkspaceMembershipResponseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkspaceMembershipResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkspaceMembershipResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to WorkspaceMembershipResponseAllOf
  */
  public static WorkspaceMembershipResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkspaceMembershipResponseAllOf.class);
  }

 /**
  * Convert an instance of WorkspaceMembershipResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

