package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import java.io.Serializable;
import java.util.List;

public class ListBucketMetricsConfigurationsResult implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private List<MetricsConfiguration> f4447m;

    /* renamed from: n  reason: collision with root package name */
    private String f4448n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4449o;

    /* renamed from: p  reason: collision with root package name */
    private String f4450p;

    public List<MetricsConfiguration> a() {
        return this.f4447m;
    }

    public void b(String str) {
        this.f4448n = str;
    }

    public void c(List<MetricsConfiguration> list) {
        this.f4447m = list;
    }

    public void d(String str) {
        this.f4450p = str;
    }

    public void e(boolean z9) {
        this.f4449o = z9;
    }
}
