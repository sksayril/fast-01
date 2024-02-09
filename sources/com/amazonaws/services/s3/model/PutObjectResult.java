package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.SSEResultBase;
import java.util.Date;

public class PutObjectResult extends SSEResultBase implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult {

    /* renamed from: p  reason: collision with root package name */
    private String f4504p;

    /* renamed from: q  reason: collision with root package name */
    private String f4505q;

    /* renamed from: r  reason: collision with root package name */
    private Date f4506r;

    /* renamed from: s  reason: collision with root package name */
    private String f4507s;

    /* renamed from: t  reason: collision with root package name */
    private String f4508t;

    /* renamed from: u  reason: collision with root package name */
    private ObjectMetadata f4509u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f4510v;

    public void a(String str) {
        this.f4504p = str;
    }

    public void b(boolean z9) {
        this.f4510v = z9;
    }

    public void c(String str) {
        this.f4508t = str;
    }

    public void g(String str) {
        this.f4505q = str;
    }

    public void h(ObjectMetadata objectMetadata) {
        this.f4509u = objectMetadata;
    }

    public void k(String str) {
        this.f4507s = str;
    }

    public void n(Date date) {
        this.f4506r = date;
    }
}
