package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "http://localhost:8080/v1";
        
        // Configure HTTP bearer authorization: ConnectToken
        configuration.token = "BEARER TOKEN";
        OnePasswordConnect client = new OnePasswordConnect(configuration);
        assertNotNull(client);
    }
}
