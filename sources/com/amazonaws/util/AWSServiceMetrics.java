package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;

@Deprecated
public enum AWSServiceMetrics implements MetricType {
    HttpClientGetConnectionTime("HttpClient");
    
    private final String serviceName;

    private AWSServiceMetrics(String str) {
        this.serviceName = str;
    }

    public String getServiceName() {
        return this.serviceName;
    }
}
