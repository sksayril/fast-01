package com.amazonaws.services.s3.model.metrics;

import java.io.Serializable;

public class MetricsConfiguration implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private String f4602m;

    /* renamed from: n  reason: collision with root package name */
    private MetricsFilter f4603n;

    public void a(MetricsFilter metricsFilter) {
        this.f4603n = metricsFilter;
    }

    public void b(String str) {
        this.f4602m = str;
    }
}
