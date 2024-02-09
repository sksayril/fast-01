package com.amazonaws.auth;

public class BasicSessionCredentials implements AWSSessionCredentials {

    /* renamed from: a  reason: collision with root package name */
    private final String f4011a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4012b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4013c;

    public BasicSessionCredentials(String str, String str2, String str3) {
        this.f4011a = str;
        this.f4012b = str2;
        this.f4013c = str3;
    }

    public String a() {
        return this.f4012b;
    }

    public String b() {
        return this.f4013c;
    }

    public String c() {
        return this.f4011a;
    }
}
