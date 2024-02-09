package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;

@Deprecated
public class AWSRequestMetrics {

    /* renamed from: a  reason: collision with root package name */
    protected final TimingInfo f4734a;

    public enum Field implements MetricType {
        AWSErrorCode,
        AWSRequestID,
        BytesProcessed,
        ClientExecuteTime,
        CredentialsRequestTime,
        Exception,
        HttpRequestTime,
        RedirectLocation,
        RequestMarshallTime,
        RequestSigningTime,
        ResponseProcessingTime,
        RequestCount,
        RetryCount,
        HttpClientRetryCount,
        HttpClientSendRequestTime,
        HttpClientReceiveResponseTime,
        RetryPauseTime,
        ServiceEndpoint,
        ServiceName,
        StatusCode
    }

    public AWSRequestMetrics() {
        this.f4734a = TimingInfo.m();
    }

    protected AWSRequestMetrics(TimingInfo timingInfo) {
        this.f4734a = timingInfo;
    }

    public void a(MetricType metricType, Object obj) {
    }

    public void b(MetricType metricType) {
    }

    public final TimingInfo c() {
        return this.f4734a;
    }

    public void d(MetricType metricType) {
    }

    public void e() {
    }

    public void f(MetricType metricType, long j10) {
    }

    public void g(MetricType metricType) {
    }
}
