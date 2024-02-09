package com.amazonaws.http;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetricsFullSupport;
import java.net.URI;
import java.util.List;

public class ExecutionContext {

    /* renamed from: a  reason: collision with root package name */
    private final AWSRequestMetrics f4046a;

    /* renamed from: b  reason: collision with root package name */
    private final List<RequestHandler2> f4047b;

    /* renamed from: c  reason: collision with root package name */
    private String f4048c;

    /* renamed from: d  reason: collision with root package name */
    private final AmazonWebServiceClient f4049d;

    /* renamed from: e  reason: collision with root package name */
    private AWSCredentials f4050e;

    public ExecutionContext(List<RequestHandler2> list, boolean z9, AmazonWebServiceClient amazonWebServiceClient) {
        this.f4047b = list;
        this.f4046a = z9 ? new AWSRequestMetricsFullSupport() : new AWSRequestMetrics();
        this.f4049d = amazonWebServiceClient;
    }

    @Deprecated
    public AWSRequestMetrics a() {
        return this.f4046a;
    }

    public String b() {
        return this.f4048c;
    }

    public AWSCredentials c() {
        return this.f4050e;
    }

    public List<RequestHandler2> d() {
        return this.f4047b;
    }

    public Signer e(URI uri) {
        throw null;
    }

    public void f(AWSCredentials aWSCredentials) {
        this.f4050e = aWSCredentials;
    }

    public void g(Signer signer) {
        throw null;
    }
}
