package com.amazonaws.metrics;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.InputStream;

public class MetricFilterInputStream extends SdkFilterInputStream {

    /* renamed from: m  reason: collision with root package name */
    private final ByteThroughputHelper f4101m;

    public MetricFilterInputStream(ThroughputMetricType throughputMetricType, InputStream inputStream) {
        super(inputStream);
        this.f4101m = new ByteThroughputHelper(throughputMetricType);
    }

    public final boolean a() {
        return true;
    }

    public void close() {
        this.f4101m.f();
        this.in.close();
        e();
    }

    public int read(byte[] bArr, int i10, int i11) {
        e();
        long g10 = this.f4101m.g();
        int read = this.in.read(bArr, i10, i11);
        if (read > 0) {
            this.f4101m.d(read, g10);
        }
        return read;
    }
}
