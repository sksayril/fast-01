package com.amazonaws.internal;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

public class StaticCredentialsProvider implements AWSCredentialsProvider {

    /* renamed from: a  reason: collision with root package name */
    private final AWSCredentials f4074a;

    public StaticCredentialsProvider(AWSCredentials aWSCredentials) {
        this.f4074a = aWSCredentials;
    }

    public AWSCredentials a() {
        return this.f4074a;
    }
}
