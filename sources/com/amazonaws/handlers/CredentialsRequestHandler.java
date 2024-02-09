package com.amazonaws.handlers;

import com.amazonaws.auth.AWSCredentials;

public abstract class CredentialsRequestHandler extends RequestHandler2 {

    /* renamed from: a  reason: collision with root package name */
    protected AWSCredentials f4038a;

    public void e(AWSCredentials aWSCredentials) {
        this.f4038a = aWSCredentials;
    }
}
