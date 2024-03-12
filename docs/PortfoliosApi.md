# PortfoliosApi

All URIs are relative to *https://app.asana.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCustomFieldSetting**](PortfoliosApi.md#addCustomFieldSetting) | **POST** /portfolios/{portfolio_gid}/addCustomFieldSetting | Add a custom field to a portfolio |
| [**addMembersToPortfolio**](PortfoliosApi.md#addMembersToPortfolio) | **POST** /portfolios/{portfolio_gid}/addMembers | Add users to a portfolio |
| [**addPortfolioItem**](PortfoliosApi.md#addPortfolioItem) | **POST** /portfolios/{portfolio_gid}/addItem | Add a portfolio item |
| [**createNewPortfolioRecord**](PortfoliosApi.md#createNewPortfolioRecord) | **POST** /portfolios | Create a portfolio |
| [**deleteRecord**](PortfoliosApi.md#deleteRecord) | **DELETE** /portfolios/{portfolio_gid} | Delete a portfolio |
| [**getItems**](PortfoliosApi.md#getItems) | **GET** /portfolios/{portfolio_gid}/items | Get portfolio items |
| [**getRecord**](PortfoliosApi.md#getRecord) | **GET** /portfolios/{portfolio_gid} | Get a portfolio |
| [**listMultiplePortfolios**](PortfoliosApi.md#listMultiplePortfolios) | **GET** /portfolios | Get multiple portfolios |
| [**removeCustomFieldSetting**](PortfoliosApi.md#removeCustomFieldSetting) | **POST** /portfolios/{portfolio_gid}/removeCustomFieldSetting | Remove a custom field from a portfolio |
| [**removeItemFromPortfolio**](PortfoliosApi.md#removeItemFromPortfolio) | **POST** /portfolios/{portfolio_gid}/removeItem | Remove a portfolio item |
| [**removeMembersFromPortfolio**](PortfoliosApi.md#removeMembersFromPortfolio) | **POST** /portfolios/{portfolio_gid}/removeMembers | Remove users from a portfolio |
| [**updatePortfolioRecord**](PortfoliosApi.md#updatePortfolioRecord) | **PUT** /portfolios/{portfolio_gid} | Update a portfolio |


<a name="addCustomFieldSetting"></a>
# **addCustomFieldSetting**
> PortfoliosAddCustomFieldSettingResponse addCustomFieldSetting(portfolioGid, portfoliosAddCustomFieldSettingRequest).optPretty(optPretty).execute();

Add a custom field to a portfolio

Custom fields are associated with portfolios by way of custom field settings.  This method creates a setting for the portfolio.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    String portfolioGid = "12345"; // Globally unique identifier for the portfolio.
    AddCustomFieldSettingRequest data = new AddCustomFieldSettingRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      PortfoliosAddCustomFieldSettingResponse result = client
              .portfolios
              .addCustomFieldSetting(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#addCustomFieldSetting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfoliosAddCustomFieldSettingResponse> response = client
              .portfolios
              .addCustomFieldSetting(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#addCustomFieldSetting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portfolioGid** | **String**| Globally unique identifier for the portfolio. | |
| **portfoliosAddCustomFieldSettingRequest** | [**PortfoliosAddCustomFieldSettingRequest**](PortfoliosAddCustomFieldSettingRequest.md)| Information about the custom field setting. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**PortfoliosAddCustomFieldSettingResponse**](PortfoliosAddCustomFieldSettingResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully added the custom field to the portfolio. |  -  |

<a name="addMembersToPortfolio"></a>
# **addMembersToPortfolio**
> PortfoliosAddMembersToPortfolioResponse addMembersToPortfolio(portfolioGid, portfoliosAddMembersToPortfolioRequest).optPretty(optPretty).optFields(optFields).execute();

Add users to a portfolio

Adds the specified list of users as members of the portfolio. Returns the updated portfolio record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    String portfolioGid = "12345"; // Globally unique identifier for the portfolio.
    AddMembersRequest data = new AddMembersRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      PortfoliosAddMembersToPortfolioResponse result = client
              .portfolios
              .addMembersToPortfolio(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#addMembersToPortfolio");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfoliosAddMembersToPortfolioResponse> response = client
              .portfolios
              .addMembersToPortfolio(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#addMembersToPortfolio");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portfolioGid** | **String**| Globally unique identifier for the portfolio. | |
| **portfoliosAddMembersToPortfolioRequest** | [**PortfoliosAddMembersToPortfolioRequest**](PortfoliosAddMembersToPortfolioRequest.md)| Information about the members being added. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: color, created_at, created_by, created_by.name, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, due_on, members, members.name, name, owner, owner.name, permalink_url, project_templates, project_templates.name, public, start_on, workspace, workspace.name] |

### Return type

[**PortfoliosAddMembersToPortfolioResponse**](PortfoliosAddMembersToPortfolioResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully added members to the portfolio. |  -  |

<a name="addPortfolioItem"></a>
# **addPortfolioItem**
> PortfoliosAddPortfolioItemResponse addPortfolioItem(portfolioGid, portfoliosAddPortfolioItemRequest).optPretty(optPretty).execute();

Add a portfolio item

Add an item to a portfolio. Returns an empty data block.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    String portfolioGid = "12345"; // Globally unique identifier for the portfolio.
    PortfolioAddItemRequest data = new PortfolioAddItemRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      PortfoliosAddPortfolioItemResponse result = client
              .portfolios
              .addPortfolioItem(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#addPortfolioItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfoliosAddPortfolioItemResponse> response = client
              .portfolios
              .addPortfolioItem(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#addPortfolioItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portfolioGid** | **String**| Globally unique identifier for the portfolio. | |
| **portfoliosAddPortfolioItemRequest** | [**PortfoliosAddPortfolioItemRequest**](PortfoliosAddPortfolioItemRequest.md)| Information about the item being inserted. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**PortfoliosAddPortfolioItemResponse**](PortfoliosAddPortfolioItemResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully added the item to the portfolio. |  -  |

<a name="createNewPortfolioRecord"></a>
# **createNewPortfolioRecord**
> PortfoliosCreateNewPortfolioRecordResponse createNewPortfolioRecord(portfoliosCreateNewPortfolioRecordRequest).optPretty(optPretty).optFields(optFields).execute();

Create a portfolio

Creates a new portfolio in the given workspace with the supplied name.  Note that portfolios created in the Asana UI may have some state (like the “Priority” custom field) which is automatically added to the portfolio when it is created. Portfolios created via our API will *not* be created with the same initial state to allow integrations to create their own starting state on a portfolio.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    PortfolioRequest data = new PortfolioRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      PortfoliosCreateNewPortfolioRecordResponse result = client
              .portfolios
              .createNewPortfolioRecord()
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#createNewPortfolioRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfoliosCreateNewPortfolioRecordResponse> response = client
              .portfolios
              .createNewPortfolioRecord()
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#createNewPortfolioRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portfoliosCreateNewPortfolioRecordRequest** | [**PortfoliosCreateNewPortfolioRecordRequest**](PortfoliosCreateNewPortfolioRecordRequest.md)| The portfolio to create. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: color, created_at, created_by, created_by.name, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, due_on, members, members.name, name, owner, owner.name, permalink_url, project_templates, project_templates.name, public, start_on, workspace, workspace.name] |

### Return type

[**PortfoliosCreateNewPortfolioRecordResponse**](PortfoliosCreateNewPortfolioRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created portfolio. |  -  |

<a name="deleteRecord"></a>
# **deleteRecord**
> PortfoliosDeleteRecordResponse deleteRecord(portfolioGid).optPretty(optPretty).execute();

Delete a portfolio

An existing portfolio can be deleted by making a DELETE request on the URL for that portfolio.  Returns an empty data record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    String portfolioGid = "12345"; // Globally unique identifier for the portfolio.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      PortfoliosDeleteRecordResponse result = client
              .portfolios
              .deleteRecord(portfolioGid)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#deleteRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfoliosDeleteRecordResponse> response = client
              .portfolios
              .deleteRecord(portfolioGid)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#deleteRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portfolioGid** | **String**| Globally unique identifier for the portfolio. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**PortfoliosDeleteRecordResponse**](PortfoliosDeleteRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the specified portfolio. |  -  |

<a name="getItems"></a>
# **getItems**
> PortfoliosGetItemsResponse getItems(portfolioGid).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get portfolio items

Get a list of the items in compact form in a portfolio.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    String portfolioGid = "12345"; // Globally unique identifier for the portfolio.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      PortfoliosGetItemsResponse result = client
              .portfolios
              .getItems(portfolioGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfoliosGetItemsResponse> response = client
              .portfolios
              .getItems(portfolioGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portfolioGid** | **String**| Globally unique identifier for the portfolio. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: archived, color, completed, completed_at, completed_by, completed_by.name, created_at, created_from_template, created_from_template.name, current_status, current_status.author, current_status.author.name, current_status.color, current_status.created_at, current_status.created_by, current_status.created_by.name, current_status.html_text, current_status.modified_at, current_status.text, current_status.title, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, default_access_level, default_view, due_date, due_on, followers, followers.name, html_notes, icon, members, members.name, minimum_access_level_for_customization, minimum_access_level_for_sharing, modified_at, name, notes, offset, owner, path, permalink_url, privacy_setting, project_brief, public, start_on, team, team.name, uri, workspace, workspace.name] |

### Return type

[**PortfoliosGetItemsResponse**](PortfoliosGetItemsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the requested portfolio&#39;s items. |  -  |

<a name="getRecord"></a>
# **getRecord**
> PortfoliosGetRecordResponse getRecord(portfolioGid).optPretty(optPretty).optFields(optFields).execute();

Get a portfolio

Returns the complete portfolio record for a single portfolio.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    String portfolioGid = "12345"; // Globally unique identifier for the portfolio.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      PortfoliosGetRecordResponse result = client
              .portfolios
              .getRecord(portfolioGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfoliosGetRecordResponse> response = client
              .portfolios
              .getRecord(portfolioGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portfolioGid** | **String**| Globally unique identifier for the portfolio. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: color, created_at, created_by, created_by.name, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, due_on, members, members.name, name, owner, owner.name, permalink_url, project_templates, project_templates.name, public, start_on, workspace, workspace.name] |

### Return type

[**PortfoliosGetRecordResponse**](PortfoliosGetRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the requested portfolio. |  -  |

<a name="listMultiplePortfolios"></a>
# **listMultiplePortfolios**
> PortfoliosListMultiplePortfoliosResponse listMultiplePortfolios(workspace).optPretty(optPretty).limit(limit).offset(offset).owner(owner).optFields(optFields).execute();

Get multiple portfolios

Returns a list of the portfolios in compact representation that are owned by the current API user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    String workspace = "1331"; // The workspace or organization to filter portfolios on.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    String owner = "14916"; // The user who owns the portfolio. Currently, API users can only get a list of portfolios that they themselves own, unless the request is made from a Service Account. In the case of a Service Account, if this parameter is specified, then all portfolios owned by this parameter are returned. Otherwise, all portfolios across the workspace are returned.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      PortfoliosListMultiplePortfoliosResponse result = client
              .portfolios
              .listMultiplePortfolios(workspace)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .owner(owner)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#listMultiplePortfolios");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfoliosListMultiplePortfoliosResponse> response = client
              .portfolios
              .listMultiplePortfolios(workspace)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .owner(owner)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#listMultiplePortfolios");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workspace** | **String**| The workspace or organization to filter portfolios on. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **owner** | **String**| The user who owns the portfolio. Currently, API users can only get a list of portfolios that they themselves own, unless the request is made from a Service Account. In the case of a Service Account, if this parameter is specified, then all portfolios owned by this parameter are returned. Otherwise, all portfolios across the workspace are returned. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: color, created_at, created_by, created_by.name, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, due_on, members, members.name, name, offset, owner, owner.name, path, permalink_url, project_templates, project_templates.name, public, start_on, uri, workspace, workspace.name] |

### Return type

[**PortfoliosListMultiplePortfoliosResponse**](PortfoliosListMultiplePortfoliosResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved portfolios. |  -  |

<a name="removeCustomFieldSetting"></a>
# **removeCustomFieldSetting**
> PortfoliosRemoveCustomFieldSettingResponse removeCustomFieldSetting(portfolioGid, portfoliosRemoveCustomFieldSettingRequest).optPretty(optPretty).execute();

Remove a custom field from a portfolio

Removes a custom field setting from a portfolio.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    String portfolioGid = "12345"; // Globally unique identifier for the portfolio.
    RemoveCustomFieldSettingRequest data = new RemoveCustomFieldSettingRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      PortfoliosRemoveCustomFieldSettingResponse result = client
              .portfolios
              .removeCustomFieldSetting(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#removeCustomFieldSetting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfoliosRemoveCustomFieldSettingResponse> response = client
              .portfolios
              .removeCustomFieldSetting(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#removeCustomFieldSetting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portfolioGid** | **String**| Globally unique identifier for the portfolio. | |
| **portfoliosRemoveCustomFieldSettingRequest** | [**PortfoliosRemoveCustomFieldSettingRequest**](PortfoliosRemoveCustomFieldSettingRequest.md)| Information about the custom field setting being removed. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**PortfoliosRemoveCustomFieldSettingResponse**](PortfoliosRemoveCustomFieldSettingResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully removed the custom field from the portfolio. |  -  |

<a name="removeItemFromPortfolio"></a>
# **removeItemFromPortfolio**
> PortfoliosRemoveItemFromPortfolioResponse removeItemFromPortfolio(portfolioGid, portfoliosRemoveItemFromPortfolioRequest).optPretty(optPretty).execute();

Remove a portfolio item

Remove an item from a portfolio. Returns an empty data block.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    String portfolioGid = "12345"; // Globally unique identifier for the portfolio.
    PortfolioRemoveItemRequest data = new PortfolioRemoveItemRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      PortfoliosRemoveItemFromPortfolioResponse result = client
              .portfolios
              .removeItemFromPortfolio(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#removeItemFromPortfolio");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfoliosRemoveItemFromPortfolioResponse> response = client
              .portfolios
              .removeItemFromPortfolio(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#removeItemFromPortfolio");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portfolioGid** | **String**| Globally unique identifier for the portfolio. | |
| **portfoliosRemoveItemFromPortfolioRequest** | [**PortfoliosRemoveItemFromPortfolioRequest**](PortfoliosRemoveItemFromPortfolioRequest.md)| Information about the item being removed. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**PortfoliosRemoveItemFromPortfolioResponse**](PortfoliosRemoveItemFromPortfolioResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully removed the item from the portfolio. |  -  |

<a name="removeMembersFromPortfolio"></a>
# **removeMembersFromPortfolio**
> PortfoliosRemoveMembersFromPortfolioResponse removeMembersFromPortfolio(portfolioGid, portfoliosRemoveMembersFromPortfolioRequest).optPretty(optPretty).optFields(optFields).execute();

Remove users from a portfolio

Removes the specified list of users from members of the portfolio. Returns the updated portfolio record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    String portfolioGid = "12345"; // Globally unique identifier for the portfolio.
    RemoveMembersRequest data = new RemoveMembersRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      PortfoliosRemoveMembersFromPortfolioResponse result = client
              .portfolios
              .removeMembersFromPortfolio(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#removeMembersFromPortfolio");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfoliosRemoveMembersFromPortfolioResponse> response = client
              .portfolios
              .removeMembersFromPortfolio(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#removeMembersFromPortfolio");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portfolioGid** | **String**| Globally unique identifier for the portfolio. | |
| **portfoliosRemoveMembersFromPortfolioRequest** | [**PortfoliosRemoveMembersFromPortfolioRequest**](PortfoliosRemoveMembersFromPortfolioRequest.md)| Information about the members being removed. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: color, created_at, created_by, created_by.name, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, due_on, members, members.name, name, owner, owner.name, permalink_url, project_templates, project_templates.name, public, start_on, workspace, workspace.name] |

### Return type

[**PortfoliosRemoveMembersFromPortfolioResponse**](PortfoliosRemoveMembersFromPortfolioResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully removed the members from the portfolio. |  -  |

<a name="updatePortfolioRecord"></a>
# **updatePortfolioRecord**
> PortfoliosUpdatePortfolioRecordResponse updatePortfolioRecord(portfolioGid, portfoliosUpdatePortfolioRecordRequest).optPretty(optPretty).optFields(optFields).execute();

Update a portfolio

An existing portfolio can be updated by making a PUT request on the URL for that portfolio. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated portfolio record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://app.asana.com/api/1.0";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP bearer authorization: personalAccessToken
    configuration.token = "BEARER TOKEN";
    Asana client = new Asana(configuration);
    String portfolioGid = "12345"; // Globally unique identifier for the portfolio.
    PortfolioRequest data = new PortfolioRequest();
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      PortfoliosUpdatePortfolioRecordResponse result = client
              .portfolios
              .updatePortfolioRecord(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#updatePortfolioRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfoliosUpdatePortfolioRecordResponse> response = client
              .portfolios
              .updatePortfolioRecord(portfolioGid)
              .data(data)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#updatePortfolioRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portfolioGid** | **String**| Globally unique identifier for the portfolio. | |
| **portfoliosUpdatePortfolioRecordRequest** | [**PortfoliosUpdatePortfolioRecordRequest**](PortfoliosUpdatePortfolioRecordRequest.md)| The updated fields for the portfolio. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: color, created_at, created_by, created_by.name, current_status_update, current_status_update.resource_subtype, current_status_update.title, custom_field_settings, custom_field_settings.custom_field, custom_field_settings.custom_field.asana_created_field, custom_field_settings.custom_field.created_by, custom_field_settings.custom_field.created_by.name, custom_field_settings.custom_field.currency_code, custom_field_settings.custom_field.custom_label, custom_field_settings.custom_field.custom_label_position, custom_field_settings.custom_field.date_value, custom_field_settings.custom_field.date_value.date, custom_field_settings.custom_field.date_value.date_time, custom_field_settings.custom_field.description, custom_field_settings.custom_field.display_value, custom_field_settings.custom_field.enabled, custom_field_settings.custom_field.enum_options, custom_field_settings.custom_field.enum_options.color, custom_field_settings.custom_field.enum_options.enabled, custom_field_settings.custom_field.enum_options.name, custom_field_settings.custom_field.enum_value, custom_field_settings.custom_field.enum_value.color, custom_field_settings.custom_field.enum_value.enabled, custom_field_settings.custom_field.enum_value.name, custom_field_settings.custom_field.format, custom_field_settings.custom_field.has_notifications_enabled, custom_field_settings.custom_field.id_prefix, custom_field_settings.custom_field.is_formula_field, custom_field_settings.custom_field.is_global_to_workspace, custom_field_settings.custom_field.is_value_read_only, custom_field_settings.custom_field.multi_enum_values, custom_field_settings.custom_field.multi_enum_values.color, custom_field_settings.custom_field.multi_enum_values.enabled, custom_field_settings.custom_field.multi_enum_values.name, custom_field_settings.custom_field.name, custom_field_settings.custom_field.number_value, custom_field_settings.custom_field.people_value, custom_field_settings.custom_field.people_value.name, custom_field_settings.custom_field.precision, custom_field_settings.custom_field.representation_type, custom_field_settings.custom_field.resource_subtype, custom_field_settings.custom_field.text_value, custom_field_settings.custom_field.type, custom_field_settings.is_important, custom_field_settings.parent, custom_field_settings.parent.name, custom_field_settings.project, custom_field_settings.project.name, custom_fields, custom_fields.date_value, custom_fields.date_value.date, custom_fields.date_value.date_time, custom_fields.display_value, custom_fields.enabled, custom_fields.enum_options, custom_fields.enum_options.color, custom_fields.enum_options.enabled, custom_fields.enum_options.name, custom_fields.enum_value, custom_fields.enum_value.color, custom_fields.enum_value.enabled, custom_fields.enum_value.name, custom_fields.id_prefix, custom_fields.is_formula_field, custom_fields.multi_enum_values, custom_fields.multi_enum_values.color, custom_fields.multi_enum_values.enabled, custom_fields.multi_enum_values.name, custom_fields.name, custom_fields.number_value, custom_fields.representation_type, custom_fields.resource_subtype, custom_fields.text_value, custom_fields.type, due_on, members, members.name, name, owner, owner.name, permalink_url, project_templates, project_templates.name, public, start_on, workspace, workspace.name] |

### Return type

[**PortfoliosUpdatePortfolioRecordResponse**](PortfoliosUpdatePortfolioRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated the portfolio. |  -  |

