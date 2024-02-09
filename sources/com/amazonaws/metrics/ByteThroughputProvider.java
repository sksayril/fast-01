package com.amazonaws.metrics;

public abstract class ByteThroughputProvider {

    /* renamed from: a  reason: collision with root package name */
    private long f4097a;

    /* renamed from: b  reason: collision with root package name */
    private int f4098b;

    /* renamed from: c  reason: collision with root package name */
    private final ThroughputMetricType f4099c;

    protected ByteThroughputProvider(ThroughputMetricType throughputMetricType) {
        this.f4099c = throughputMetricType;
    }

    public int a() {
        return this.f4098b;
    }

    public long b() {
        return this.f4097a;
    }

    public String c() {
        return super.toString();
    }

    /* access modifiers changed from: protected */
    public void d(int i10, long j10) {
        this.f4098b += i10;
        this.f4097a += System.nanoTime() - j10;
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f4098b = 0;
        this.f4097a = 0;
    }

    public String toString() {
        return String.format("providerId=%s, throughputType=%s, byteCount=%d, duration=%d", new Object[]{c(), this.f4099c, Integer.valueOf(this.f4098b), Long.valueOf(this.f4097a)});
    }
}
