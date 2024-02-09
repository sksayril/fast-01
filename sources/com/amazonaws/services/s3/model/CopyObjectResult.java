package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.SSEResultBase;
import java.io.Serializable;
import java.util.Date;

public class CopyObjectResult extends SSEResultBase implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult, Serializable {

    /* renamed from: p  reason: collision with root package name */
    private String f4399p;

    /* renamed from: q  reason: collision with root package name */
    private Date f4400q;

    /* renamed from: r  reason: collision with root package name */
    private String f4401r;

    /* renamed from: s  reason: collision with root package name */
    private Date f4402s;

    /* renamed from: t  reason: collision with root package name */
    private String f4403t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f4404u;

    public void a(String str) {
        this.f4401r = str;
    }

    public void b(boolean z9) {
        this.f4404u = z9;
    }

    public void c(String str) {
        this.f4399p = str;
    }

    public void g(Date date) {
        this.f4400q = date;
    }

    public void k(String str) {
        this.f4403t = str;
    }

    public void n(Date date) {
        this.f4402s = date;
    }
}
