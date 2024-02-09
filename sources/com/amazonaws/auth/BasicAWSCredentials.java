package com.amazonaws.auth;

public class BasicAWSCredentials implements AWSCredentials {

    /* renamed from: a  reason: collision with root package name */
    private final String f4009a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4010b;

    public BasicAWSCredentials(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Access key cannot be null.");
        } else if (str2 != null) {
            this.f4009a = str;
            this.f4010b = str2;
        } else {
            throw new IllegalArgumentException("Secret key cannot be null.");
        }
    }

    public String a() {
        return this.f4010b;
    }

    public String c() {
        return this.f4009a;
    }
}
