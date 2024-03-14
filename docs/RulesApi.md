# RulesApi

All URIs are relative to *https://app.asana.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**triggerRuleRequest**](RulesApi.md#triggerRuleRequest) | **POST** /rule_triggers/{rule_trigger_gid}/run | Trigger a rule |


<a name="triggerRuleRequest"></a>
# **triggerRuleRequest**
> RulesTriggerRuleRequestResponse triggerRuleRequest(ruleTriggerGid, rulesTriggerRuleRequestRequest).execute();

Trigger a rule

Trigger a rule which uses an [\&quot;incoming web request\&quot;](https://developers.asana.com/reference/rest-api-reference) trigger.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RulesApi;
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
    String ruleTriggerGid = "12345"; // The ID of the incoming web request trigger. This value is a path parameter that is automatically generated for the API endpoint.
    RuleTriggerRequest data = new RuleTriggerRequest();
    try {
      RulesTriggerRuleRequestResponse result = client
              .rules
              .triggerRuleRequest(ruleTriggerGid)
              .data(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#triggerRuleRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RulesTriggerRuleRequestResponse> response = client
              .rules
              .triggerRuleRequest(ruleTriggerGid)
              .data(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#triggerRuleRequest");
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
| **ruleTriggerGid** | **String**| The ID of the incoming web request trigger. This value is a path parameter that is automatically generated for the API endpoint. | |
| **rulesTriggerRuleRequestRequest** | [**RulesTriggerRuleRequestRequest**](RulesTriggerRuleRequestRequest.md)| A dictionary of variables accessible from within the rule. | |

### Return type

[**RulesTriggerRuleRequestResponse**](RulesTriggerRuleRequestResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully triggered a rule. |  -  |

