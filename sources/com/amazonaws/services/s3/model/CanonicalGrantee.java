package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class CanonicalGrantee implements Grantee, Serializable {

    /* renamed from: m  reason: collision with root package name */
    private String f4384m = null;

    /* renamed from: n  reason: collision with root package name */
    private String f4385n = null;

    public CanonicalGrantee(String str) {
        setIdentifier(str);
    }

    public void a(String str) {
        this.f4385n = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CanonicalGrantee) {
            return this.f4384m.equals(((CanonicalGrantee) obj).f4384m);
        }
        return false;
    }

    public String getIdentifier() {
        return this.f4384m;
    }

    public String getTypeIdentifier() {
        return "id";
    }

    public int hashCode() {
        return this.f4384m.hashCode();
    }

    public void setIdentifier(String str) {
        this.f4384m = str;
    }
}
