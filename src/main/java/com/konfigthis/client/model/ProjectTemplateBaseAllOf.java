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
import com.konfigthis.client.model.DateVariableCompact;
import com.konfigthis.client.model.TeamCompact;
import com.konfigthis.client.model.TemplateRole;
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
 * ProjectTemplateBaseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectTemplateBaseAllOf {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HTML_DESCRIPTION = "html_description";
  @SerializedName(SERIALIZED_NAME_HTML_DESCRIPTION)
  private String htmlDescription;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private UserCompact owner;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private TeamCompact team;

  public static final String SERIALIZED_NAME_REQUESTED_DATES = "requested_dates";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DATES)
  private List<DateVariableCompact> requestedDates = null;

  /**
   * Color of the project template.
   */
  @JsonAdapter(ColorEnum.Adapter.class)
 public enum ColorEnum {
    DARK_PINK("dark-pink"),
    
    DARK_GREEN("dark-green"),
    
    DARK_BLUE("dark-blue"),
    
    DARK_RED("dark-red"),
    
    DARK_TEAL("dark-teal"),
    
    DARK_BROWN("dark-brown"),
    
    DARK_ORANGE("dark-orange"),
    
    DARK_PURPLE("dark-purple"),
    
    DARK_WARM_GRAY("dark-warm-gray"),
    
    LIGHT_PINK("light-pink"),
    
    LIGHT_GREEN("light-green"),
    
    LIGHT_BLUE("light-blue"),
    
    LIGHT_RED("light-red"),
    
    LIGHT_TEAL("light-teal"),
    
    LIGHT_BROWN("light-brown"),
    
    LIGHT_ORANGE("light-orange"),
    
    LIGHT_PURPLE("light-purple"),
    
    LIGHT_WARM_GRAY("light-warm-gray"),
    
    NULL("null");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ColorEnum fromValue(String value) {
      for (ColorEnum b : ColorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ColorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ColorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private ColorEnum color;

  public static final String SERIALIZED_NAME_REQUESTED_ROLES = "requested_roles";
  @SerializedName(SERIALIZED_NAME_REQUESTED_ROLES)
  private List<TemplateRole> requestedRoles = null;

  public ProjectTemplateBaseAllOf() {
  }

  
  public ProjectTemplateBaseAllOf(
     List<DateVariableCompact> requestedDates
  ) {
    this();
    this.requestedDates = requestedDates;
  }

  public ProjectTemplateBaseAllOf description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Free-form textual information associated with the project template
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "These are things we need to pack for a trip.", value = "Free-form textual information associated with the project template")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ProjectTemplateBaseAllOf htmlDescription(String htmlDescription) {
    
    
    
    
    this.htmlDescription = htmlDescription;
    return this;
  }

   /**
   * The description of the project template with formatting as HTML.
   * @return htmlDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<body>These are things we need to pack for a trip.</body>", value = "The description of the project template with formatting as HTML.")

  public String getHtmlDescription() {
    return htmlDescription;
  }


  public void setHtmlDescription(String htmlDescription) {
    
    
    
    this.htmlDescription = htmlDescription;
  }


  public ProjectTemplateBaseAllOf _public(Boolean _public) {
    
    
    
    
    this._public = _public;
    return this;
  }

   /**
   * True if the project template is public to its team.
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True if the project template is public to its team.")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    
    
    
    this._public = _public;
  }


  public ProjectTemplateBaseAllOf owner(UserCompact owner) {
    
    
    
    
    this.owner = owner;
    return this;
  }

   /**
   * The current owner of the project template, may be null.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current owner of the project template, may be null.")

  public UserCompact getOwner() {
    return owner;
  }


  public void setOwner(UserCompact owner) {
    
    
    
    this.owner = owner;
  }


  public ProjectTemplateBaseAllOf team(TeamCompact team) {
    
    
    
    
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TeamCompact getTeam() {
    return team;
  }


  public void setTeam(TeamCompact team) {
    
    
    
    this.team = team;
  }


   /**
   * Array of date variables in this project template. Calendar dates must be provided for these variables when instantiating a project.
   * @return requestedDates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of date variables in this project template. Calendar dates must be provided for these variables when instantiating a project.")

  public List<DateVariableCompact> getRequestedDates() {
    return requestedDates;
  }




  public ProjectTemplateBaseAllOf color(ColorEnum color) {
    
    
    
    
    this.color = color;
    return this;
  }

   /**
   * Color of the project template.
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LIGHT_GREEN", value = "Color of the project template.")

  public ColorEnum getColor() {
    return color;
  }


  public void setColor(ColorEnum color) {
    
    
    
    this.color = color;
  }


  public ProjectTemplateBaseAllOf requestedRoles(List<TemplateRole> requestedRoles) {
    
    
    
    
    this.requestedRoles = requestedRoles;
    return this;
  }

  public ProjectTemplateBaseAllOf addRequestedRolesItem(TemplateRole requestedRolesItem) {
    if (this.requestedRoles == null) {
      this.requestedRoles = new ArrayList<>();
    }
    this.requestedRoles.add(requestedRolesItem);
    return this;
  }

   /**
   * Array of template roles in this project template. User Ids can be provided for these variables when instantiating a project to assign template tasks to the user.
   * @return requestedRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of template roles in this project template. User Ids can be provided for these variables when instantiating a project to assign template tasks to the user.")

  public List<TemplateRole> getRequestedRoles() {
    return requestedRoles;
  }


  public void setRequestedRoles(List<TemplateRole> requestedRoles) {
    
    
    
    this.requestedRoles = requestedRoles;
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
   * @return the ProjectTemplateBaseAllOf instance itself
   */
  public ProjectTemplateBaseAllOf putAdditionalProperty(String key, Object value) {
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
    ProjectTemplateBaseAllOf projectTemplateBaseAllOf = (ProjectTemplateBaseAllOf) o;
    return Objects.equals(this.description, projectTemplateBaseAllOf.description) &&
        Objects.equals(this.htmlDescription, projectTemplateBaseAllOf.htmlDescription) &&
        Objects.equals(this._public, projectTemplateBaseAllOf._public) &&
        Objects.equals(this.owner, projectTemplateBaseAllOf.owner) &&
        Objects.equals(this.team, projectTemplateBaseAllOf.team) &&
        Objects.equals(this.requestedDates, projectTemplateBaseAllOf.requestedDates) &&
        Objects.equals(this.color, projectTemplateBaseAllOf.color) &&
        Objects.equals(this.requestedRoles, projectTemplateBaseAllOf.requestedRoles)&&
        Objects.equals(this.additionalProperties, projectTemplateBaseAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, htmlDescription, _public, owner, team, requestedDates, color, requestedRoles, additionalProperties);
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
    sb.append("class ProjectTemplateBaseAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    htmlDescription: ").append(toIndentedString(htmlDescription)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    requestedDates: ").append(toIndentedString(requestedDates)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    requestedRoles: ").append(toIndentedString(requestedRoles)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("html_description");
    openapiFields.add("public");
    openapiFields.add("owner");
    openapiFields.add("team");
    openapiFields.add("requested_dates");
    openapiFields.add("color");
    openapiFields.add("requested_roles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectTemplateBaseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectTemplateBaseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectTemplateBaseAllOf is not found in the empty JSON string", ProjectTemplateBaseAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("html_description") != null && !jsonObj.get("html_description").isJsonNull()) && !jsonObj.get("html_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_description").toString()));
      }
      // validate the optional field `owner`
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) {
        UserCompact.validateJsonObject(jsonObj.getAsJsonObject("owner"));
      }
      // validate the optional field `team`
      if (jsonObj.get("team") != null && !jsonObj.get("team").isJsonNull()) {
        TeamCompact.validateJsonObject(jsonObj.getAsJsonObject("team"));
      }
      if (jsonObj.get("requested_dates") != null && !jsonObj.get("requested_dates").isJsonNull()) {
        JsonArray jsonArrayrequestedDates = jsonObj.getAsJsonArray("requested_dates");
        if (jsonArrayrequestedDates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requested_dates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requested_dates` to be an array in the JSON string but got `%s`", jsonObj.get("requested_dates").toString()));
          }

          // validate the optional field `requested_dates` (array)
          for (int i = 0; i < jsonArrayrequestedDates.size(); i++) {
            DateVariableCompact.validateJsonObject(jsonArrayrequestedDates.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("color").isJsonNull() && (jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if (jsonObj.get("requested_roles") != null && !jsonObj.get("requested_roles").isJsonNull()) {
        JsonArray jsonArrayrequestedRoles = jsonObj.getAsJsonArray("requested_roles");
        if (jsonArrayrequestedRoles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requested_roles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requested_roles` to be an array in the JSON string but got `%s`", jsonObj.get("requested_roles").toString()));
          }

          // validate the optional field `requested_roles` (array)
          for (int i = 0; i < jsonArrayrequestedRoles.size(); i++) {
            TemplateRole.validateJsonObject(jsonArrayrequestedRoles.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectTemplateBaseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectTemplateBaseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectTemplateBaseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectTemplateBaseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectTemplateBaseAllOf>() {
           @Override
           public void write(JsonWriter out, ProjectTemplateBaseAllOf value) throws IOException {
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
           public ProjectTemplateBaseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectTemplateBaseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectTemplateBaseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectTemplateBaseAllOf
  * @throws IOException if the JSON string is invalid with respect to ProjectTemplateBaseAllOf
  */
  public static ProjectTemplateBaseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectTemplateBaseAllOf.class);
  }

 /**
  * Convert an instance of ProjectTemplateBaseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

