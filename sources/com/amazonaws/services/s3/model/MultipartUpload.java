package com.amazonaws.services.s3.model;

import java.util.Date;

public class MultipartUpload {

    /* renamed from: a  reason: collision with root package name */
    private String f4455a;

    /* renamed from: b  reason: collision with root package name */
    private String f4456b;

    /* renamed from: c  reason: collision with root package name */
    private Owner f4457c;

    /* renamed from: d  reason: collision with root package name */
    private Owner f4458d;

    /* renamed from: e  reason: collision with root package name */
    private String f4459e;

    /* renamed from: f  reason: collision with root package name */
    private Date f4460f;

    public void a(Date date) {
        this.f4460f = date;
    }

    public void b(Owner owner) {
        this.f4458d = owner;
    }

    public void c(String str) {
        this.f4455a = str;
    }

    public void d(Owner owner) {
        this.f4457c = owner;
    }

    public void e(String str) {
        this.f4459e = str;
    }

    public void f(String str) {
        this.f4456b = str;
    }
}
