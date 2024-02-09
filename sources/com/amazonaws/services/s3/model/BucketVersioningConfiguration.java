package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class BucketVersioningConfiguration implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private String f4372m;

    /* renamed from: n  reason: collision with root package name */
    private Boolean f4373n = null;

    public BucketVersioningConfiguration() {
        b("Off");
    }

    public void a(Boolean bool) {
        this.f4373n = bool;
    }

    public void b(String str) {
        this.f4372m = str;
    }
}
