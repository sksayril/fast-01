package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Closeable;
import java.io.Serializable;

public class S3Object implements Closeable, Serializable, S3RequesterChargedResult {

    /* renamed from: m  reason: collision with root package name */
    private String f4525m = null;

    /* renamed from: n  reason: collision with root package name */
    private String f4526n = null;

    /* renamed from: o  reason: collision with root package name */
    private ObjectMetadata f4527o = new ObjectMetadata();

    /* renamed from: p  reason: collision with root package name */
    private transient S3ObjectInputStream f4528p;

    /* renamed from: q  reason: collision with root package name */
    private String f4529q;

    /* renamed from: r  reason: collision with root package name */
    private Integer f4530r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f4531s;

    public String a() {
        return this.f4525m;
    }

    public void b(boolean z9) {
        this.f4531s = z9;
    }

    public void close() {
        if (e() != null) {
            e().close();
        }
    }

    public S3ObjectInputStream e() {
        return this.f4528p;
    }

    public ObjectMetadata g() {
        return this.f4527o;
    }

    public void h(String str) {
        this.f4526n = str;
    }

    public void k(String str) {
        this.f4525m = str;
    }

    public void l(S3ObjectInputStream s3ObjectInputStream) {
        this.f4528p = s3ObjectInputStream;
    }

    public void m(String str) {
        this.f4529q = str;
    }

    public void n(Integer num) {
        this.f4530r = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("S3Object [key=");
        sb.append(a());
        sb.append(",bucket=");
        String str = this.f4526n;
        if (str == null) {
            str = "<Unknown>";
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
