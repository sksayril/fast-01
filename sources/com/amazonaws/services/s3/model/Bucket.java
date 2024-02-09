package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.Date;

public class Bucket implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private String f4345m = null;

    /* renamed from: n  reason: collision with root package name */
    private Owner f4346n = null;

    /* renamed from: o  reason: collision with root package name */
    private Date f4347o = null;

    public Date a() {
        return this.f4347o;
    }

    public String b() {
        return this.f4345m;
    }

    public Owner c() {
        return this.f4346n;
    }

    public void d(Date date) {
        this.f4347o = date;
    }

    public void e(String str) {
        this.f4345m = str;
    }

    public void f(Owner owner) {
        this.f4346n = owner;
    }

    public String toString() {
        return "S3Bucket [name=" + b() + ", creationDate=" + a() + ", owner=" + c() + "]";
    }
}
