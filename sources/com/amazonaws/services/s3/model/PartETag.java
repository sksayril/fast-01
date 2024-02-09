package com.amazonaws.services.s3.model;

public class PartETag {

    /* renamed from: a  reason: collision with root package name */
    private int f4485a;

    /* renamed from: b  reason: collision with root package name */
    private String f4486b;

    public PartETag(int i10, String str) {
        this.f4485a = i10;
        this.f4486b = str;
    }

    public String a() {
        return this.f4486b;
    }

    public int b() {
        return this.f4485a;
    }
}
