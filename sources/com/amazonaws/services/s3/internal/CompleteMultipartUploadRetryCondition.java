package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.model.AmazonS3Exception;

public class CompleteMultipartUploadRetryCondition implements RetryPolicy.RetryCondition {

    /* renamed from: b  reason: collision with root package name */
    private final int f4278b;

    public CompleteMultipartUploadRetryCondition() {
        this(3);
    }

    CompleteMultipartUploadRetryCondition(int i10) {
        this.f4278b = i10;
    }

    public boolean a(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i10) {
        return (amazonClientException instanceof AmazonS3Exception) && b((AmazonS3Exception) amazonClientException) && i10 < this.f4278b;
    }

    /* access modifiers changed from: package-private */
    public boolean b(AmazonS3Exception amazonS3Exception) {
        return (amazonS3Exception == null || amazonS3Exception.a() == null || amazonS3Exception.b() == null || !amazonS3Exception.a().contains("InternalError") || !amazonS3Exception.b().contains("Please try again.")) ? false : true;
    }
}
