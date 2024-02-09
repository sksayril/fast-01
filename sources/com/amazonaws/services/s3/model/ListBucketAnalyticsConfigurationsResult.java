package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import java.io.Serializable;
import java.util.List;

public class ListBucketAnalyticsConfigurationsResult implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private List<AnalyticsConfiguration> f4439m;

    /* renamed from: n  reason: collision with root package name */
    private String f4440n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4441o;

    /* renamed from: p  reason: collision with root package name */
    private String f4442p;

    public List<AnalyticsConfiguration> a() {
        return this.f4439m;
    }

    public void b(List<AnalyticsConfiguration> list) {
        this.f4439m = list;
    }

    public void c(String str) {
        this.f4440n = str;
    }

    public void d(String str) {
        this.f4442p = str;
    }

    public void e(boolean z9) {
        this.f4441o = z9;
    }
}
