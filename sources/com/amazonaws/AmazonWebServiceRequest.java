package com.amazonaws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;

public abstract class AmazonWebServiceRequest implements Cloneable {

    /* renamed from: m  reason: collision with root package name */
    private ProgressListener f3933m;

    /* renamed from: n  reason: collision with root package name */
    private final RequestClientOptions f3934n = new RequestClientOptions();
    @Deprecated

    /* renamed from: o  reason: collision with root package name */
    private RequestMetricCollector f3935o;

    /* renamed from: p  reason: collision with root package name */
    private AWSCredentials f3936p;

    /* renamed from: q  reason: collision with root package name */
    private AmazonWebServiceRequest f3937q;

    private void k(AmazonWebServiceRequest amazonWebServiceRequest) {
        this.f3937q = amazonWebServiceRequest;
    }

    /* renamed from: b */
    public AmazonWebServiceRequest clone() {
        try {
            AmazonWebServiceRequest amazonWebServiceRequest = (AmazonWebServiceRequest) super.clone();
            amazonWebServiceRequest.k(this);
            return amazonWebServiceRequest;
        } catch (CloneNotSupportedException e10) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e10);
        }
    }

    /* access modifiers changed from: protected */
    public final <T extends AmazonWebServiceRequest> T d(T t9) {
        t9.n(this.f3933m);
        t9.p(this.f3935o);
        return t9;
    }

    public ProgressListener e() {
        return this.f3933m;
    }

    public RequestClientOptions f() {
        return this.f3934n;
    }

    public AWSCredentials h() {
        return this.f3936p;
    }

    @Deprecated
    public RequestMetricCollector i() {
        return this.f3935o;
    }

    public void n(ProgressListener progressListener) {
        this.f3933m = progressListener;
    }

    @Deprecated
    public void p(RequestMetricCollector requestMetricCollector) {
        this.f3935o = requestMetricCollector;
    }
}
