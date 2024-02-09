package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.SSEResultBase;

public class InitiateMultipartUploadResult extends SSEResultBase {

    /* renamed from: p  reason: collision with root package name */
    private String f4436p;

    /* renamed from: q  reason: collision with root package name */
    private String f4437q;

    /* renamed from: r  reason: collision with root package name */
    private String f4438r;

    public String c() {
        return this.f4438r;
    }

    public void g(String str) {
        this.f4436p = str;
    }

    public void h(String str) {
        this.f4437q = str;
    }

    public void i(String str) {
        this.f4438r = str;
    }
}
