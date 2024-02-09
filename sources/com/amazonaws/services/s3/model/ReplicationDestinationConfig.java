package com.amazonaws.services.s3.model;

public class ReplicationDestinationConfig {

    /* renamed from: a  reason: collision with root package name */
    private String f4516a;

    /* renamed from: b  reason: collision with root package name */
    private String f4517b;

    public void a(String str) {
        if (str != null) {
            this.f4516a = str;
            return;
        }
        throw new IllegalArgumentException("Bucket name cannot be null");
    }

    public void b(String str) {
        this.f4517b = str;
    }
}
