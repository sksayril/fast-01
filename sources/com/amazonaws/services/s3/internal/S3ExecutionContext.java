package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.ExecutionContext;
import java.net.URI;
import java.util.List;

public class S3ExecutionContext extends ExecutionContext {

    /* renamed from: f  reason: collision with root package name */
    private Signer f4301f;

    public S3ExecutionContext(List<RequestHandler2> list, boolean z9, AmazonWebServiceClient amazonWebServiceClient) {
        super(list, z9, amazonWebServiceClient);
    }

    public Signer e(URI uri) {
        return this.f4301f;
    }

    public void g(Signer signer) {
        this.f4301f = signer;
    }
}
