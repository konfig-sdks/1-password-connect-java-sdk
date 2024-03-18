/*
 * 1Password Connect
 * REST API interface for 1Password Connect.
 *
 * The version of the OpenAPI document: 1.5.7
 * Contact: support@1password.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetricsApi
 */
@Disabled
public class MetricsApiTest {

    private static MetricsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new MetricsApi(apiClient);
    }

    /**
     * Query server for exposed Prometheus metrics
     *
     * See Prometheus documentation for a complete data model.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryServerMetricsTest() throws ApiException {
        String response = api.queryServerMetrics()
                .execute();
        // TODO: test validations
    }

}
