package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class Owner implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private String f4483m;

    /* renamed from: n  reason: collision with root package name */
    private String f4484n;

    public String a() {
        return this.f4483m;
    }

    public String b() {
        return this.f4484n;
    }

    public void c(String str) {
        this.f4483m = str;
    }

    public void d(String str) {
        this.f4484n = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) obj;
        String b10 = owner.b();
        String a10 = owner.a();
        String b11 = b();
        String a11 = a();
        if (b10 == null) {
            b10 = "";
        }
        if (a10 == null) {
            a10 = "";
        }
        if (b11 == null) {
            b11 = "";
        }
        if (a11 == null) {
            a11 = "";
        }
        return b10.equals(b11) && a10.equals(a11);
    }

    public int hashCode() {
        String str = this.f4484n;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "S3Owner [name=" + a() + ",id=" + b() + "]";
    }
}
