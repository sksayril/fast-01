package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;

public class S3RequesterChargedHeaderHandler<T extends S3RequesterChargedResult> implements HeaderHandler<T> {
    /* renamed from: b */
    public void a(T t9, HttpResponse httpResponse) {
        t9.b(httpResponse.c().get("x-amz-request-charged") != null);
    }
}
