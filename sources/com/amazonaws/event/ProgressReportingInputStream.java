package com.amazonaws.event;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.InputStream;

public class ProgressReportingInputStream extends SdkFilterInputStream {

    /* renamed from: m  reason: collision with root package name */
    private int f4034m = 8192;

    /* renamed from: n  reason: collision with root package name */
    private final ProgressListenerCallbackExecutor f4035n;

    /* renamed from: o  reason: collision with root package name */
    private int f4036o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f4037p;

    public ProgressReportingInputStream(InputStream inputStream, ProgressListenerCallbackExecutor progressListenerCallbackExecutor) {
        super(inputStream);
        this.f4035n = progressListenerCallbackExecutor;
    }

    private void g(int i10) {
        int i11 = this.f4036o + i10;
        this.f4036o = i11;
        if (i11 >= this.f4034m) {
            this.f4035n.c(new ProgressEvent((long) i11));
            this.f4036o = 0;
        }
    }

    private void h() {
        if (this.f4037p) {
            ProgressEvent progressEvent = new ProgressEvent((long) this.f4036o);
            progressEvent.c(4);
            this.f4036o = 0;
            this.f4035n.c(progressEvent);
        }
    }

    public void close() {
        int i10 = this.f4036o;
        if (i10 > 0) {
            this.f4035n.c(new ProgressEvent((long) i10));
            this.f4036o = 0;
        }
        super.close();
    }

    public void k(boolean z9) {
        this.f4037p = z9;
    }

    public void l(int i10) {
        this.f4034m = i10 * 1024;
    }

    public int read() {
        int read = super.read();
        if (read == -1) {
            h();
        } else {
            g(1);
        }
        return read;
    }

    public int read(byte[] bArr, int i10, int i11) {
        int read = super.read(bArr, i10, i11);
        if (read == -1) {
            h();
        }
        if (read != -1) {
            g(read);
        }
        return read;
    }

    public void reset() {
        super.reset();
        ProgressEvent progressEvent = new ProgressEvent((long) this.f4036o);
        progressEvent.c(32);
        this.f4035n.c(progressEvent);
        this.f4036o = 0;
    }
}
