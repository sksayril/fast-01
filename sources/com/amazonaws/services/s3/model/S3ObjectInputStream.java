package com.amazonaws.services.s3.model;

import com.amazonaws.internal.MetricAware;
import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.MetricFilterInputStream;
import com.amazonaws.services.s3.metrics.S3ServiceMetric;
import java.io.IOException;
import java.io.InputStream;

public class S3ObjectInputStream extends SdkFilterInputStream {

    /* renamed from: m  reason: collision with root package name */
    private boolean f4535m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public S3ObjectInputStream(InputStream inputStream) {
        super(h(inputStream) ? new MetricFilterInputStream(S3ServiceMetric.f4317n, inputStream) : inputStream);
    }

    private void g() {
        try {
            close();
        } catch (IOException e10) {
            LogFactory.b(getClass()).b("FYI", e10);
        }
    }

    private static boolean h(InputStream inputStream) {
        if (!AwsSdkMetrics.isMetricsEnabled()) {
            return false;
        }
        if (inputStream instanceof MetricAware) {
            return !((MetricAware) inputStream).a();
        }
        return true;
    }

    public int available() {
        int available = super.available();
        if (available == 0) {
            return 1;
        }
        return available;
    }

    public void b() {
        g();
    }

    public int read() {
        int read = super.read();
        if (read == -1) {
            this.f4535m = true;
        }
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) {
        int read = super.read(bArr, i10, i11);
        if (read == -1) {
            this.f4535m = true;
        }
        return read;
    }

    public void reset() {
        super.reset();
        this.f4535m = false;
    }
}
