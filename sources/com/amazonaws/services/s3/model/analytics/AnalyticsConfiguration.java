package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

public class AnalyticsConfiguration implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private String f4568m;

    /* renamed from: n  reason: collision with root package name */
    private AnalyticsFilter f4569n;

    /* renamed from: o  reason: collision with root package name */
    private StorageClassAnalysis f4570o;

    public void a(AnalyticsFilter analyticsFilter) {
        this.f4569n = analyticsFilter;
    }

    public void b(String str) {
        this.f4568m = str;
    }

    public void c(StorageClassAnalysis storageClassAnalysis) {
        this.f4570o = storageClassAnalysis;
    }
}
