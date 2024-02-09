package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.event.ProgressListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GetObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* renamed from: r  reason: collision with root package name */
    private S3ObjectIdBuilder f4413r;

    /* renamed from: s  reason: collision with root package name */
    private long[] f4414s;

    /* renamed from: t  reason: collision with root package name */
    private List<String> f4415t;

    /* renamed from: u  reason: collision with root package name */
    private List<String> f4416u;

    /* renamed from: v  reason: collision with root package name */
    private Date f4417v;

    /* renamed from: w  reason: collision with root package name */
    private Date f4418w;

    /* renamed from: x  reason: collision with root package name */
    private ProgressListener f4419x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f4420y;

    public GetObjectRequest(String str, String str2) {
        this(str, str2, (String) null);
    }

    public GetObjectRequest(String str, String str2, String str3) {
        this.f4413r = new S3ObjectIdBuilder();
        this.f4415t = new ArrayList();
        this.f4416u = new ArrayList();
        B(str);
        C(str2);
        E(str3);
    }

    public boolean A() {
        return this.f4420y;
    }

    public void B(String str) {
        this.f4413r.d(str);
    }

    public void C(String str) {
        this.f4413r.e(str);
    }

    public void D(long j10, long j11) {
        this.f4414s = new long[]{j10, j11};
    }

    public void E(String str) {
        this.f4413r.f(str);
    }

    public ProgressListener e() {
        return this.f4419x;
    }

    public void n(ProgressListener progressListener) {
        this.f4419x = progressListener;
    }

    public String q() {
        return this.f4413r.a();
    }

    public String r() {
        return this.f4413r.b();
    }

    public List<String> s() {
        return this.f4415t;
    }

    public Date t() {
        return this.f4418w;
    }

    public List<String> u() {
        return this.f4416u;
    }

    public long[] v() {
        long[] jArr = this.f4414s;
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public ResponseHeaderOverrides w() {
        return null;
    }

    public SSECustomerKey x() {
        return null;
    }

    public Date y() {
        return this.f4417v;
    }

    public String z() {
        return this.f4413r.c();
    }
}
