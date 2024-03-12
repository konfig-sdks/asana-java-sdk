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
 * A response object returned from the task count endpoint.
 */
@ApiModel(description = "A response object returned from the task count endpoint.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaskCountResponse {
  public static final String SERIALIZED_NAME_NUM_TASKS = "num_tasks";
  @SerializedName(SERIALIZED_NAME_NUM_TASKS)
  private Integer numTasks;

  public static final String SERIALIZED_NAME_NUM_INCOMPLETE_TASKS = "num_incomplete_tasks";
  @SerializedName(SERIALIZED_NAME_NUM_INCOMPLETE_TASKS)
  private Integer numIncompleteTasks;

  public static final String SERIALIZED_NAME_NUM_COMPLETED_TASKS = "num_completed_tasks";
  @SerializedName(SERIALIZED_NAME_NUM_COMPLETED_TASKS)
  private Integer numCompletedTasks;

  public static final String SERIALIZED_NAME_NUM_MILESTONES = "num_milestones";
  @SerializedName(SERIALIZED_NAME_NUM_MILESTONES)
  private Integer numMilestones;

  public static final String SERIALIZED_NAME_NUM_INCOMPLETE_MILESTONES = "num_incomplete_milestones";
  @SerializedName(SERIALIZED_NAME_NUM_INCOMPLETE_MILESTONES)
  private Integer numIncompleteMilestones;

  public static final String SERIALIZED_NAME_NUM_COMPLETED_MILESTONES = "num_completed_milestones";
  @SerializedName(SERIALIZED_NAME_NUM_COMPLETED_MILESTONES)
  private Integer numCompletedMilestones;

  public TaskCountResponse() {
  }

  public TaskCountResponse numTasks(Integer numTasks) {
    
    
    
    
    this.numTasks = numTasks;
    return this;
  }

   /**
   * The number of tasks in a project.
   * @return numTasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "The number of tasks in a project.")

  public Integer getNumTasks() {
    return numTasks;
  }


  public void setNumTasks(Integer numTasks) {
    
    
    
    this.numTasks = numTasks;
  }


  public TaskCountResponse numIncompleteTasks(Integer numIncompleteTasks) {
    
    
    
    
    this.numIncompleteTasks = numIncompleteTasks;
    return this;
  }

   /**
   * The number of incomplete tasks in a project.
   * @return numIncompleteTasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "The number of incomplete tasks in a project.")

  public Integer getNumIncompleteTasks() {
    return numIncompleteTasks;
  }


  public void setNumIncompleteTasks(Integer numIncompleteTasks) {
    
    
    
    this.numIncompleteTasks = numIncompleteTasks;
  }


  public TaskCountResponse numCompletedTasks(Integer numCompletedTasks) {
    
    
    
    
    this.numCompletedTasks = numCompletedTasks;
    return this;
  }

   /**
   * The number of completed tasks in a project.
   * @return numCompletedTasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "150", value = "The number of completed tasks in a project.")

  public Integer getNumCompletedTasks() {
    return numCompletedTasks;
  }


  public void setNumCompletedTasks(Integer numCompletedTasks) {
    
    
    
    this.numCompletedTasks = numCompletedTasks;
  }


  public TaskCountResponse numMilestones(Integer numMilestones) {
    
    
    
    
    this.numMilestones = numMilestones;
    return this;
  }

   /**
   * The number of milestones in a project.
   * @return numMilestones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "The number of milestones in a project.")

  public Integer getNumMilestones() {
    return numMilestones;
  }


  public void setNumMilestones(Integer numMilestones) {
    
    
    
    this.numMilestones = numMilestones;
  }


  public TaskCountResponse numIncompleteMilestones(Integer numIncompleteMilestones) {
    
    
    
    
    this.numIncompleteMilestones = numIncompleteMilestones;
    return this;
  }

   /**
   * The number of incomplete milestones in a project.
   * @return numIncompleteMilestones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "The number of incomplete milestones in a project.")

  public Integer getNumIncompleteMilestones() {
    return numIncompleteMilestones;
  }


  public void setNumIncompleteMilestones(Integer numIncompleteMilestones) {
    
    
    
    this.numIncompleteMilestones = numIncompleteMilestones;
  }


  public TaskCountResponse numCompletedMilestones(Integer numCompletedMilestones) {
    
    
    
    
    this.numCompletedMilestones = numCompletedMilestones;
    return this;
  }

   /**
   * The number of completed milestones in a project.
   * @return numCompletedMilestones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The number of completed milestones in a project.")

  public Integer getNumCompletedMilestones() {
    return numCompletedMilestones;
  }


  public void setNumCompletedMilestones(Integer numCompletedMilestones) {
    
    
    
    this.numCompletedMilestones = numCompletedMilestones;
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
   * @return the TaskCountResponse instance itself
   */
  public TaskCountResponse putAdditionalProperty(String key, Object value) {
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
    TaskCountResponse taskCountResponse = (TaskCountResponse) o;
    return Objects.equals(this.numTasks, taskCountResponse.numTasks) &&
        Objects.equals(this.numIncompleteTasks, taskCountResponse.numIncompleteTasks) &&
        Objects.equals(this.numCompletedTasks, taskCountResponse.numCompletedTasks) &&
        Objects.equals(this.numMilestones, taskCountResponse.numMilestones) &&
        Objects.equals(this.numIncompleteMilestones, taskCountResponse.numIncompleteMilestones) &&
        Objects.equals(this.numCompletedMilestones, taskCountResponse.numCompletedMilestones)&&
        Objects.equals(this.additionalProperties, taskCountResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numTasks, numIncompleteTasks, numCompletedTasks, numMilestones, numIncompleteMilestones, numCompletedMilestones, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCountResponse {\n");
    sb.append("    numTasks: ").append(toIndentedString(numTasks)).append("\n");
    sb.append("    numIncompleteTasks: ").append(toIndentedString(numIncompleteTasks)).append("\n");
    sb.append("    numCompletedTasks: ").append(toIndentedString(numCompletedTasks)).append("\n");
    sb.append("    numMilestones: ").append(toIndentedString(numMilestones)).append("\n");
    sb.append("    numIncompleteMilestones: ").append(toIndentedString(numIncompleteMilestones)).append("\n");
    sb.append("    numCompletedMilestones: ").append(toIndentedString(numCompletedMilestones)).append("\n");
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
    openapiFields.add("num_tasks");
    openapiFields.add("num_incomplete_tasks");
    openapiFields.add("num_completed_tasks");
    openapiFields.add("num_milestones");
    openapiFields.add("num_incomplete_milestones");
    openapiFields.add("num_completed_milestones");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaskCountResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaskCountResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskCountResponse is not found in the empty JSON string", TaskCountResponse.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskCountResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskCountResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskCountResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskCountResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskCountResponse>() {
           @Override
           public void write(JsonWriter out, TaskCountResponse value) throws IOException {
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
           public TaskCountResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaskCountResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaskCountResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskCountResponse
  * @throws IOException if the JSON string is invalid with respect to TaskCountResponse
  */
  public static TaskCountResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskCountResponse.class);
  }

 /**
  * Convert an instance of TaskCountResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

