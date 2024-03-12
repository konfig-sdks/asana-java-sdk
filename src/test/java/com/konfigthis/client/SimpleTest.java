package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://app.asana.com/api/1.0";
        
        // Configure OAuth2 access token for authorization: oauth2
        configuration.accessToken = "YOUR ACCESS TOKEN";
        
        // Configure HTTP bearer authorization: personalAccessToken
        configuration.token = "BEARER TOKEN";
        Asana client = new Asana(configuration);
        assertNotNull(client);
    }
}
