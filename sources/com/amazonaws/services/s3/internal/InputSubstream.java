package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.InputStream;

public final class InputSubstream extends SdkFilterInputStream {

    /* renamed from: m  reason: collision with root package name */
    private long f4282m = 0;

    /* renamed from: n  reason: collision with root package name */
    private final long f4283n;

    /* renamed from: o  reason: collision with root package name */
    private final long f4284o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f4285p;

    /* renamed from: q  reason: collision with root package name */
    private long f4286q = 0;

    public InputSubstream(InputStream inputStream, long j10, long j11, boolean z9) {
        super(inputStream);
        this.f4284o = j11;
        this.f4283n = j10;
        this.f4285p = z9;
    }

    public int available() {
        long j10 = this.f4282m;
        long j11 = this.f4283n;
        return (int) Math.min(j10 < j11 ? this.f4284o : (this.f4284o + j11) - j10, (long) super.available());
    }

    public void close() {
        if (this.f4285p) {
            super.close();
        }
    }

    public synchronized void mark(int i10) {
        this.f4286q = this.f4282m;
        super.mark(i10);
    }

    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        return read == -1 ? read : bArr[0];
    }

    public int read(byte[] bArr, int i10, int i11) {
        long j10;
        long j11;
        while (true) {
            j10 = this.f4282m;
            j11 = this.f4283n;
            if (j10 >= j11) {
                break;
            }
            this.f4282m += super.skip(j11 - j10);
        }
        long j12 = (this.f4284o + j11) - j10;
        if (j12 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i10, (int) Math.min((long) i11, j12));
        this.f4282m += (long) read;
        return read;
    }

    public synchronized void reset() {
        this.f4282m = this.f4286q;
        super.reset();
    }
}
