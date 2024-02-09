package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class SSEAwsKeyManagementParams implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private final String f4551m;

    public SSEAwsKeyManagementParams(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("AWS Key Management System Key id cannot be null");
        }
        this.f4551m = str;
    }

    public String a() {
        return this.f4551m;
    }

    public String b() {
        return SSEAlgorithm.KMS.getAlgorithm();
    }
}
