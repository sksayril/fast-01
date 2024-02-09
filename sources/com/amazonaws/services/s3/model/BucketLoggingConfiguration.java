package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class BucketLoggingConfiguration implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private String f4367m = null;

    /* renamed from: n  reason: collision with root package name */
    private String f4368n = null;

    public String a() {
        return this.f4367m;
    }

    public String b() {
        return this.f4368n;
    }

    public boolean c() {
        return (this.f4367m == null || this.f4368n == null) ? false : true;
    }

    public void d(String str) {
        this.f4367m = str;
    }

    public void e(String str) {
        if (str == null) {
            str = "";
        }
        this.f4368n = str;
    }

    public String toString() {
        String str = "LoggingConfiguration enabled=" + c();
        if (!c()) {
            return str;
        }
        return str + ", destinationBucketName=" + a() + ", logFilePrefix=" + b();
    }
}
