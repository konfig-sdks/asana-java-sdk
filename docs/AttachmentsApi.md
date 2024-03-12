# AttachmentsApi

All URIs are relative to *https://app.asana.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSpecific**](AttachmentsApi.md#deleteSpecific) | **DELETE** /attachments/{attachment_gid} | Delete an attachment |
| [**getAllForObject**](AttachmentsApi.md#getAllForObject) | **GET** /attachments | Get attachments from an object |
| [**getAttachmentRecord**](AttachmentsApi.md#getAttachmentRecord) | **GET** /attachments/{attachment_gid} | Get an attachment |
| [**uploadAttachment**](AttachmentsApi.md#uploadAttachment) | **POST** /attachments | Upload an attachment |


<a name="deleteSpecific"></a>
# **deleteSpecific**
> AttachmentsDeleteSpecificResponse deleteSpecific(attachmentGid).optPretty(optPretty).execute();

Delete an attachment

Deletes a specific, existing attachment.  Returns an empty data record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttachmentsApi;
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
    String attachmentGid = "12345"; // Globally unique identifier for the attachment.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    try {
      AttachmentsDeleteSpecificResponse result = client
              .attachments
              .deleteSpecific(attachmentGid)
              .optPretty(optPretty)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#deleteSpecific");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttachmentsDeleteSpecificResponse> response = client
              .attachments
              .deleteSpecific(attachmentGid)
              .optPretty(optPretty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#deleteSpecific");
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
| **attachmentGid** | **String**| Globally unique identifier for the attachment. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |

### Return type

[**AttachmentsDeleteSpecificResponse**](AttachmentsDeleteSpecificResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted the specified attachment. |  -  |

<a name="getAllForObject"></a>
# **getAllForObject**
> AttachmentsGetAllForObjectResponse getAllForObject(parent).optPretty(optPretty).limit(limit).offset(offset).optFields(optFields).execute();

Get attachments from an object

Returns the compact records for all attachments on the object.  There are three possible &#x60;parent&#x60; values for this request: &#x60;project&#x60;, &#x60;project_brief&#x60;, and &#x60;task&#x60;. For a project, an attachment refers to a file uploaded to the \&quot;Key resources\&quot; section in the project Overview. For a project brief, an attachment refers to inline files in the project brief itself. For a task, an attachment refers to a file directly associated to that task.  Note that within the Asana app, inline images in the task description do not appear in the index of image thumbnails nor as stories in the task. However, requests made to &#x60;GET /attachments&#x60; for a task will return all of the images in the task, including inline images.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttachmentsApi;
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
    String parent = "159874"; // Globally unique identifier for object to fetch statuses from. Must be a GID for a `project`, `project_brief`, or `task`.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    Integer limit = 50; // Results per page. The number of objects to return per page. The value must be between 1 and 100.
    String offset = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9"; // Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      AttachmentsGetAllForObjectResponse result = client
              .attachments
              .getAllForObject(parent)
              .optPretty(optPretty)
              .limit(limit)
              .offset(offset)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#getAllForObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttachmentsGetAllForObjectResponse> response = client
              .attachments
              .getAllForObject(parent)
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
      System.err.println("Exception when calling AttachmentsApi#getAllForObject");
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
| **parent** | **String**| Globally unique identifier for object to fetch statuses from. Must be a GID for a &#x60;project&#x60;, &#x60;project_brief&#x60;, or &#x60;task&#x60;. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **limit** | **Integer**| Results per page. The number of objects to return per page. The value must be between 1 and 100. | [optional] |
| **offset** | **String**| Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: connected_to_app, created_at, download_url, host, name, offset, parent, parent.created_by, parent.name, parent.resource_subtype, path, permanent_url, resource_subtype, size, uri, view_url] |

### Return type

[**AttachmentsGetAllForObjectResponse**](AttachmentsGetAllForObjectResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the specified object&#39;s attachments. |  -  |

<a name="getAttachmentRecord"></a>
# **getAttachmentRecord**
> AttachmentsGetAttachmentRecordResponse getAttachmentRecord(attachmentGid).optPretty(optPretty).optFields(optFields).execute();

Get an attachment

Get the full record for a single attachment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttachmentsApi;
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
    String attachmentGid = "12345"; // Globally unique identifier for the attachment.
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    try {
      AttachmentsGetAttachmentRecordResponse result = client
              .attachments
              .getAttachmentRecord(attachmentGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#getAttachmentRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttachmentsGetAttachmentRecordResponse> response = client
              .attachments
              .getAttachmentRecord(attachmentGid)
              .optPretty(optPretty)
              .optFields(optFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#getAttachmentRecord");
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
| **attachmentGid** | **String**| Globally unique identifier for the attachment. | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: connected_to_app, created_at, download_url, host, name, parent, parent.created_by, parent.name, parent.resource_subtype, permanent_url, resource_subtype, size, view_url] |

### Return type

[**AttachmentsGetAttachmentRecordResponse**](AttachmentsGetAttachmentRecordResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the record for a single attachment. |  -  |

<a name="uploadAttachment"></a>
# **uploadAttachment**
> AttachmentsUploadAttachmentResponse uploadAttachment(parent).optPretty(optPretty).optFields(optFields).resourceSubtype(resourceSubtype)._file(_file).url(url).name(name).connectToApp(connectToApp).attachmentRequest(attachmentRequest).execute();

Upload an attachment

Upload an attachment.  This method uploads an attachment on an object and returns the compact record for the created attachment object. This is possible by either:  - Providing the URL of the external resource being attached, or - Downloading the file content first and then uploading it as any other attachment. Note that it is not possible to attach files from third party services such as Dropbox, Box, Vimeo &amp; Google Drive via the API  The 100MB size limit on attachments in Asana is enforced on this endpoint.  This endpoint expects a multipart/form-data encoded request containing the full contents of the file to be uploaded.  Requests made should follow the HTTP/1.1 specification that line terminators are of the form &#x60;CRLF&#x60; or &#x60;\\r\\n&#x60; outlined [here](http://www.w3.org/Protocols/HTTP/1.1/draft-ietf-http-v11-spec-01#Basic-Rules) in order for the server to reliably and properly handle the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Asana;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttachmentsApi;
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
    String parent = "parent_example"; // Required identifier of the parent task, project, or project_brief, as a string. 
    Boolean optPretty = true; // Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    List<String> optFields = Arrays.asList(); // This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include.
    String resourceSubtype = "asana"; // The type of the attachment. Must be one of the given values. If not specified, a file attachment of type `asana` will be assumed. Note that if the value of `resource_subtype` is `external`, a `parent`, `name`, and `url` must also be provided. 
    File _file = new File("/path/to/file"); // Required for `asana` attachments. 
    String url = "url_example"; // The URL of the external resource being attached. Required for attachments of type `external`. 
    String name = "name_example"; // The name of the external resource being attached. Required for attachments of type `external`. 
    Boolean connectToApp = true; // *Optional*. Only relevant for external attachments with a parent task. A boolean indicating whether the current app should be connected with the attachment for the purposes of showing an app components widget. Requires the app to have been added to a project the parent task is in. 
    try {
      AttachmentsUploadAttachmentResponse result = client
              .attachments
              .uploadAttachment(parent)
              .optPretty(optPretty)
              .optFields(optFields)
              .resourceSubtype(resourceSubtype)
              ._file(_file)
              .url(url)
              .name(name)
              .connectToApp(connectToApp)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#uploadAttachment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttachmentsUploadAttachmentResponse> response = client
              .attachments
              .uploadAttachment(parent)
              .optPretty(optPretty)
              .optFields(optFields)
              .resourceSubtype(resourceSubtype)
              ._file(_file)
              .url(url)
              .name(name)
              .connectToApp(connectToApp)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#uploadAttachment");
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
| **parent** | **String**| Required identifier of the parent task, project, or project_brief, as a string.  | |
| **optPretty** | **Boolean**| Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. | [optional] |
| **optFields** | [**List&lt;String&gt;**](String.md)| This endpoint returns a compact resource, which excludes some properties by default. To include those optional properties, set this query parameter to a comma-separated list of the properties you wish to include. | [optional] [enum: connected_to_app, created_at, download_url, host, name, parent, parent.created_by, parent.name, parent.resource_subtype, permanent_url, resource_subtype, size, view_url] |
| **resourceSubtype** | **String**| The type of the attachment. Must be one of the given values. If not specified, a file attachment of type &#x60;asana&#x60; will be assumed. Note that if the value of &#x60;resource_subtype&#x60; is &#x60;external&#x60;, a &#x60;parent&#x60;, &#x60;name&#x60;, and &#x60;url&#x60; must also be provided.  | [optional] [enum: asana, dropbox, gdrive, onedrive, box, vimeo, external] |
| **_file** | **File**| Required for &#x60;asana&#x60; attachments.  | [optional] |
| **url** | **String**| The URL of the external resource being attached. Required for attachments of type &#x60;external&#x60;.  | [optional] |
| **name** | **String**| The name of the external resource being attached. Required for attachments of type &#x60;external&#x60;.  | [optional] |
| **connectToApp** | **Boolean**| *Optional*. Only relevant for external attachments with a parent task. A boolean indicating whether the current app should be connected with the attachment for the purposes of showing an app components widget. Requires the app to have been added to a project the parent task is in.  | [optional] |
| **attachmentRequest** | [**AttachmentRequest**](AttachmentRequest.md)| The file you want to upload.  *Note when using curl:*  Be sure to add an &#x60;‘@’&#x60; before the file path, and use the &#x60;--form&#x60; option instead of the &#x60;-d&#x60; option.  When uploading PDFs with curl, force the content-type to be pdf by appending the content type to the file path: &#x60;--form \&quot;file&#x3D;@file.pdf;type&#x3D;application/pdf\&quot;&#x60;. | [optional] |

### Return type

[**AttachmentsUploadAttachmentResponse**](AttachmentsUploadAttachmentResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully uploaded the attachment to the parent object. |  -  |

