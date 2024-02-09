package com.amazonaws.auth;

import com.amazonaws.Request;

public interface Signer {
    void a(Request<?> request, AWSCredentials aWSCredentials);
}
