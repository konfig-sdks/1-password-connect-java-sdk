package com.konfigthis.client;

import com.konfigthis.client.api.ActivityApi;
import com.konfigthis.client.api.FilesApi;
import com.konfigthis.client.api.HealthApi;
import com.konfigthis.client.api.ItemsApi;
import com.konfigthis.client.api.MetricsApi;
import com.konfigthis.client.api.VaultsApi;

public class OnePasswordConnect {
    private ApiClient apiClient;
    public final ActivityApi activity;
    public final FilesApi files;
    public final HealthApi health;
    public final ItemsApi items;
    public final MetricsApi metrics;
    public final VaultsApi vaults;

    public OnePasswordConnect() {
        this(null);
    }

    public OnePasswordConnect(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.activity = new ActivityApi(this.apiClient);
        this.files = new FilesApi(this.apiClient);
        this.health = new HealthApi(this.apiClient);
        this.items = new ItemsApi(this.apiClient);
        this.metrics = new MetricsApi(this.apiClient);
        this.vaults = new VaultsApi(this.apiClient);
    }

}
