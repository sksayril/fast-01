package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.SSEResultBase;

public class UploadPartResult extends SSEResultBase implements S3RequesterChargedResult {

    /* renamed from: p  reason: collision with root package name */
    private int f4565p;

    /* renamed from: q  reason: collision with root package name */
    private String f4566q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f4567r;

    public void b(boolean z9) {
        this.f4567r = z9;
    }

    public String c() {
        return this.f4566q;
    }

    public void g(String str) {
        this.f4566q = str;
    }

    public void h(int i10) {
        this.f4565p = i10;
    }
}
