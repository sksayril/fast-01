package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;

public class ServerSideEncryptionHeaderHandler<T extends ServerSideEncryptionResult> implements HeaderHandler<T> {
    /* renamed from: b */
    public void a(T t9, HttpResponse httpResponse) {
        t9.f(httpResponse.c().get("x-amz-server-side-encryption"));
        t9.e(httpResponse.c().get("x-amz-server-side-encryption-customer-algorithm"));
        t9.d(httpResponse.c().get("x-amz-server-side-encryption-customer-key-MD5"));
    }
}
