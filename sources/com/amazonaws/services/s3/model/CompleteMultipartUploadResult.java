package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.SSEResultBase;
import java.io.Serializable;
import java.util.Date;

public class CompleteMultipartUploadResult extends SSEResultBase implements ObjectExpirationResult, S3RequesterChargedResult, Serializable {

    /* renamed from: p  reason: collision with root package name */
    private String f4391p;

    /* renamed from: q  reason: collision with root package name */
    private String f4392q;

    /* renamed from: r  reason: collision with root package name */
    private String f4393r;

    /* renamed from: s  reason: collision with root package name */
    private String f4394s;

    /* renamed from: t  reason: collision with root package name */
    private String f4395t;

    /* renamed from: u  reason: collision with root package name */
    private Date f4396u;

    /* renamed from: v  reason: collision with root package name */
    private String f4397v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f4398w;

    public void a(String str) {
        this.f4395t = str;
    }

    public void b(boolean z9) {
        this.f4398w = z9;
    }

    public void c(String str) {
        this.f4391p = str;
    }

    public void g(String str) {
        this.f4394s = str;
    }

    public void h(String str) {
        this.f4392q = str;
    }

    public void i(String str) {
        this.f4393r = str;
    }

    public void k(String str) {
        this.f4397v = str;
    }

    public void n(Date date) {
        this.f4396u = date;
    }
}
