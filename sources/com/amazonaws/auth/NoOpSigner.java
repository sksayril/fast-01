package com.amazonaws.auth;

import com.amazonaws.Request;

public class NoOpSigner implements Signer {
    public void a(Request<?> request, AWSCredentials aWSCredentials) {
    }
}
