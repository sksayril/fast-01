package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

public class StorageClassAnalysisDataExport implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private String f4581m;

    /* renamed from: n  reason: collision with root package name */
    private AnalyticsExportDestination f4582n;

    public void a(AnalyticsExportDestination analyticsExportDestination) {
        this.f4582n = analyticsExportDestination;
    }

    public void b(String str) {
        this.f4581m = str;
    }
}
