package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.FilterInputStream;
import java.io.InputStream;

public class SdkFilterInputStream extends FilterInputStream implements MetricAware {
    protected SdkFilterInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Deprecated
    public boolean a() {
        if (this.in instanceof MetricAware) {
            return ((MetricAware) this.in).a();
        }
        return false;
    }

    public int available() {
        e();
        return this.in.available();
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public void close() {
        this.in.close();
        e();
    }

    /* access modifiers changed from: protected */
    public final void e() {
        if (Thread.interrupted()) {
            b();
            throw new AbortedException();
        }
    }

    public synchronized void mark(int i10) {
        e();
        this.in.mark(i10);
    }

    public boolean markSupported() {
        e();
        return this.in.markSupported();
    }

    public int read() {
        e();
        return this.in.read();
    }

    public int read(byte[] bArr, int i10, int i11) {
        e();
        return this.in.read(bArr, i10, i11);
    }

    public synchronized void reset() {
        e();
        this.in.reset();
    }

    public long skip(long j10) {
        e();
        return this.in.skip(j10);
    }
}
