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
import com.konfigthis.client.model.GoalCompact;
import com.konfigthis.client.model.ProjectCompact;
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
 * GoalRelationshipBase
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GoalRelationshipBase {
  public static final String SERIALIZED_NAME_GID = "gid";
  @SerializedName(SERIALIZED_NAME_GID)
  private String gid;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   */
  @JsonAdapter(ResourceSubtypeEnum.Adapter.class)
 public enum ResourceSubtypeEnum {
    SUBGOAL("subgoal"),
    
    SUPPORTING_WORK("supporting_work");

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

  public static final String SERIALIZED_NAME_SUPPORTING_RESOURCE = "supporting_resource";
  @SerializedName(SERIALIZED_NAME_SUPPORTING_RESOURCE)
  private ProjectCompact supportingResource;

  public static final String SERIALIZED_NAME_CONTRIBUTION_WEIGHT = "contribution_weight";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_WEIGHT)
  private Double contributionWeight;

  public static final String SERIALIZED_NAME_SUPPORTED_GOAL = "supported_goal";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_GOAL)
  private GoalCompact supportedGoal;

  public GoalRelationshipBase() {
  }

  
  public GoalRelationshipBase(
     String gid, 
     String resourceType, 
     ResourceSubtypeEnum resourceSubtype
  ) {
    this();
    this.gid = gid;
    this.resourceType = resourceType;
    this.resourceSubtype = resourceSubtype;
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




   /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   * @return resourceSubtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUBGOAL", value = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.")

  public ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }




  public GoalRelationshipBase supportingResource(ProjectCompact supportingResource) {
    
    
    
    
    this.supportingResource = supportingResource;
    return this;
  }

   /**
   * Get supportingResource
   * @return supportingResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectCompact getSupportingResource() {
    return supportingResource;
  }


  public void setSupportingResource(ProjectCompact supportingResource) {
    
    
    
    this.supportingResource = supportingResource;
  }


  public GoalRelationshipBase contributionWeight(Double contributionWeight) {
    
    
    
    
    this.contributionWeight = contributionWeight;
    return this;
  }

  public GoalRelationshipBase contributionWeight(Integer contributionWeight) {
    
    
    
    
    this.contributionWeight = contributionWeight.doubleValue();
    return this;
  }

   /**
   * The weight that the supporting resource&#39;s progress contributes to the supported goal&#39;s progress. This can only be 0 or 1.
   * @return contributionWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The weight that the supporting resource's progress contributes to the supported goal's progress. This can only be 0 or 1.")

  public Double getContributionWeight() {
    return contributionWeight;
  }


  public void setContributionWeight(Double contributionWeight) {
    
    
    
    this.contributionWeight = contributionWeight;
  }


  public GoalRelationshipBase supportedGoal(GoalCompact supportedGoal) {
    
    
    
    
    this.supportedGoal = supportedGoal;
    return this;
  }

   /**
   * Get supportedGoal
   * @return supportedGoal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GoalCompact getSupportedGoal() {
    return supportedGoal;
  }


  public void setSupportedGoal(GoalCompact supportedGoal) {
    
    
    
    this.supportedGoal = supportedGoal;
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
   * @return the GoalRelationshipBase instance itself
   */
  public GoalRelationshipBase putAdditionalProperty(String key, Object value) {
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
    GoalRelationshipBase goalRelationshipBase = (GoalRelationshipBase) o;
    return Objects.equals(this.gid, goalRelationshipBase.gid) &&
        Objects.equals(this.resourceType, goalRelationshipBase.resourceType) &&
        Objects.equals(this.resourceSubtype, goalRelationshipBase.resourceSubtype) &&
        Objects.equals(this.supportingResource, goalRelationshipBase.supportingResource) &&
        Objects.equals(this.contributionWeight, goalRelationshipBase.contributionWeight) &&
        Objects.equals(this.supportedGoal, goalRelationshipBase.supportedGoal)&&
        Objects.equals(this.additionalProperties, goalRelationshipBase.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, resourceSubtype, supportingResource, contributionWeight, supportedGoal, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalRelationshipBase {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    supportingResource: ").append(toIndentedString(supportingResource)).append("\n");
    sb.append("    contributionWeight: ").append(toIndentedString(contributionWeight)).append("\n");
    sb.append("    supportedGoal: ").append(toIndentedString(supportedGoal)).append("\n");
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
    openapiFields.add("resource_subtype");
    openapiFields.add("supporting_resource");
    openapiFields.add("contribution_weight");
    openapiFields.add("supported_goal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoalRelationshipBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GoalRelationshipBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoalRelationshipBase is not found in the empty JSON string", GoalRelationshipBase.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("gid") != null && !jsonObj.get("gid").isJsonNull()) && !jsonObj.get("gid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gid").toString()));
      }
      if ((jsonObj.get("resource_type") != null && !jsonObj.get("resource_type").isJsonNull()) && !jsonObj.get("resource_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_type").toString()));
      }
      if ((jsonObj.get("resource_subtype") != null && !jsonObj.get("resource_subtype").isJsonNull()) && !jsonObj.get("resource_subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_subtype").toString()));
      }
      // validate the optional field `supporting_resource`
      if (jsonObj.get("supporting_resource") != null && !jsonObj.get("supporting_resource").isJsonNull()) {
        ProjectCompact.validateJsonObject(jsonObj.getAsJsonObject("supporting_resource"));
      }
      // validate the optional field `supported_goal`
      if (jsonObj.get("supported_goal") != null && !jsonObj.get("supported_goal").isJsonNull()) {
        GoalCompact.validateJsonObject(jsonObj.getAsJsonObject("supported_goal"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoalRelationshipBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoalRelationshipBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoalRelationshipBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoalRelationshipBase.class));

       return (TypeAdapter<T>) new TypeAdapter<GoalRelationshipBase>() {
           @Override
           public void write(JsonWriter out, GoalRelationshipBase value) throws IOException {
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
           public GoalRelationshipBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GoalRelationshipBase instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GoalRelationshipBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoalRelationshipBase
  * @throws IOException if the JSON string is invalid with respect to GoalRelationshipBase
  */
  public static GoalRelationshipBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoalRelationshipBase.class);
  }

 /**
  * Convert an instance of GoalRelationshipBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

