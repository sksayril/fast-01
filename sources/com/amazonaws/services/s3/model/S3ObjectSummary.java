package com.amazonaws.services.s3.model;

import java.util.Date;

public class S3ObjectSummary {

    /* renamed from: a  reason: collision with root package name */
    protected String f4536a;

    /* renamed from: b  reason: collision with root package name */
    protected String f4537b;

    /* renamed from: c  reason: collision with root package name */
    protected String f4538c;

    /* renamed from: d  reason: collision with root package name */
    protected long f4539d;

    /* renamed from: e  reason: collision with root package name */
    protected Date f4540e;

    /* renamed from: f  reason: collision with root package name */
    protected String f4541f;

    /* renamed from: g  reason: collision with root package name */
    protected Owner f4542g;

    public void a(String str) {
        this.f4538c = str;
    }

    public void b(String str) {
        this.f4537b = str;
    }

    public void c(Date date) {
        this.f4540e = date;
    }

    public void d(Owner owner) {
        this.f4542g = owner;
    }

    public void e(long j10) {
        this.f4539d = j10;
    }

    public void f(String str) {
        this.f4541f = str;
    }

    public String toString() {
        return "S3ObjectSummary{bucketName='" + this.f4536a + '\'' + ", key='" + this.f4537b + '\'' + ", eTag='" + this.f4538c + '\'' + ", size=" + this.f4539d + ", lastModified=" + this.f4540e + ", storageClass='" + this.f4541f + '\'' + ", owner=" + this.f4542g + '}';
    }
}
