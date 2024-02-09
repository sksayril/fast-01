package com.amazonaws.services.s3.metrics;

import com.amazonaws.metrics.SimpleMetricType;
import com.amazonaws.metrics.ThroughputMetricType;

public class S3ServiceMetric extends SimpleMetricType {

    /* renamed from: n  reason: collision with root package name */
    public static final S3ThroughputMetric f4317n;

    /* renamed from: o  reason: collision with root package name */
    public static final S3ServiceMetric f4318o;

    /* renamed from: p  reason: collision with root package name */
    public static final S3ThroughputMetric f4319p;

    /* renamed from: q  reason: collision with root package name */
    public static final S3ServiceMetric f4320q;

    /* renamed from: r  reason: collision with root package name */
    private static final S3ServiceMetric[] f4321r;

    /* renamed from: m  reason: collision with root package name */
    private final String f4322m;

    private static abstract class S3ThroughputMetric extends S3ServiceMetric implements ThroughputMetricType {
        private S3ThroughputMetric(String str) {
            super(str);
        }
    }

    static {
        AnonymousClass1 r02 = new S3ThroughputMetric(a("DownloadThroughput")) {
        };
        f4317n = r02;
        S3ServiceMetric s3ServiceMetric = new S3ServiceMetric(a("DownloadByteCount"));
        f4318o = s3ServiceMetric;
        AnonymousClass2 r22 = new S3ThroughputMetric(a("UploadThroughput")) {
        };
        f4319p = r22;
        S3ServiceMetric s3ServiceMetric2 = new S3ServiceMetric(a("UploadByteCount"));
        f4320q = s3ServiceMetric2;
        f4321r = new S3ServiceMetric[]{r02, s3ServiceMetric, r22, s3ServiceMetric2};
    }

    private S3ServiceMetric(String str) {
        this.f4322m = str;
    }

    private static final String a(String str) {
        return "S3" + str;
    }

    public static S3ServiceMetric[] b() {
        return (S3ServiceMetric[]) f4321r.clone();
    }

    public String name() {
        return this.f4322m;
    }
}
