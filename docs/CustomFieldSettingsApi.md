# CustomFieldSettingsApi

All URIs are relative to *https://app.asana.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPortfolioCustomFieldSettings**](CustomFieldSettingsApi.md#getPortfolioCustomFieldSettings) | **GET** /portfolios/{portfolio_gid}/custom_field_settings | Get a portfolio&#39;s custom fields |
| [**getProjectCustomFieldSettings**](CustomFieldSettingsApi.md#getProjectCustomFieldSettings) | **GET** /projects/{project_gid}/custom_field_settings | Get a project&#39;s custom fields |


<a name="getPortfolioCustomFieldSettings"></a>
# **getPortfolioCustomFieldSettings**
> CustomFieldSettingsGetPortfolioCustomFieldSettingsResponse getPortfolioCustomFieldSettings(portfolioGid).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get a portfolio&#39;s custom fields

Returns a list of all of the custom fields settings on a portfolio, in compact form.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldSettingsApi;
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
      CustomFieldSettingsGetPortfolioCustomFieldSettingsResponse result = client
              .customFieldSettings
              .getPortfolioCustomFieldSettings(portfolioGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldSettingsApi#getPortfolioCustomFieldSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldSettingsGetPortfolioCustomFieldSettingsResponse> response = client
              .customFieldSettings
              .getPortfolioCustomFieldSettings(portfolioGid)
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
      System.err.println("Exception when calling CustomFieldSettingsApi#getPortfolioCustomFieldSettings");
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
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: custom_field, custom_field.asana_created_field, custom_field.created_by, custom_field.created_by.name, custom_field.currency_code, custom_field.custom_label, custom_field.custom_label_position, custom_field.date_value, custom_field.date_value.date, custom_field.date_value.date_time, custom_field.description, custom_field.display_value, custom_field.enabled, custom_field.enum_options, custom_field.enum_options.color, custom_field.enum_options.enabled, custom_field.enum_options.name, custom_field.enum_value, custom_field.enum_value.color, custom_field.enum_value.enabled, custom_field.enum_value.name, custom_field.format, custom_field.has_notifications_enabled, custom_field.id_prefix, custom_field.is_formula_field, custom_field.is_global_to_workspace, custom_field.is_value_read_only, custom_field.multi_enum_values, custom_field.multi_enum_values.color, custom_field.multi_enum_values.enabled, custom_field.multi_enum_values.name, custom_field.name, custom_field.number_value, custom_field.people_value, custom_field.people_value.name, custom_field.precision, custom_field.representation_type, custom_field.resource_subtype, custom_field.text_value, custom_field.type, is_important, offset, parent, parent.name, path, project, project.name, uri] |

### Return type

[**CustomFieldSettingsGetPortfolioCustomFieldSettingsResponse**](CustomFieldSettingsGetPortfolioCustomFieldSettingsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved custom field settings objects for a portfolio. |  -  |

<a name="getProjectCustomFieldSettings"></a>
# **getProjectCustomFieldSettings**
> CustomFieldSettingsGetProjectCustomFieldSettingsResponse getProjectCustomFieldSettings(projectGid).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get a project&#39;s custom fields

Returns a list of all of the custom fields settings on a project, in compact form. Note that, as in all queries to collections which return compact representation, &#x60;opt_fields&#x60; can be used to include more data than is returned in the compact representation. See the [documentation for input/output options](https://developers.asana.com/docs/inputoutput-options) for more information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldSettingsApi;
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
    String projectGid = "1331"; // Globally unique identifier for the project.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      CustomFieldSettingsGetProjectCustomFieldSettingsResponse result = client
              .customFieldSettings
              .getProjectCustomFieldSettings(projectGid)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldSettingsApi#getProjectCustomFieldSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldSettingsGetProjectCustomFieldSettingsResponse> response = client
              .customFieldSettings
              .getProjectCustomFieldSettings(projectGid)
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
      System.err.println("Exception when calling CustomFieldSettingsApi#getProjectCustomFieldSettings");
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
| **projectGid** | **String**| Globally unique identifier for the project. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: custom_field, custom_field.asana_created_field, custom_field.created_by, custom_field.created_by.name, custom_field.currency_code, custom_field.custom_label, custom_field.custom_label_position, custom_field.date_value, custom_field.date_value.date, custom_field.date_value.date_time, custom_field.description, custom_field.display_value, custom_field.enabled, custom_field.enum_options, custom_field.enum_options.color, custom_field.enum_options.enabled, custom_field.enum_options.name, custom_field.enum_value, custom_field.enum_value.color, custom_field.enum_value.enabled, custom_field.enum_value.name, custom_field.format, custom_field.has_notifications_enabled, custom_field.id_prefix, custom_field.is_formula_field, custom_field.is_global_to_workspace, custom_field.is_value_read_only, custom_field.multi_enum_values, custom_field.multi_enum_values.color, custom_field.multi_enum_values.enabled, custom_field.multi_enum_values.name, custom_field.name, custom_field.number_value, custom_field.people_value, custom_field.people_value.name, custom_field.precision, custom_field.representation_type, custom_field.resource_subtype, custom_field.text_value, custom_field.type, is_important, offset, parent, parent.name, path, project, project.name, uri] |

### Return type

[**CustomFieldSettingsGetProjectCustomFieldSettingsResponse**](CustomFieldSettingsGetProjectCustomFieldSettingsResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved custom field settings objects for a project. |  -  |

