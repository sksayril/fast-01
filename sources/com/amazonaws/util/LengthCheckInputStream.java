package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkFilterInputStream;
import java.io.InputStream;

public class LengthCheckInputStream extends SdkFilterInputStream {

    /* renamed from: m  reason: collision with root package name */
    private final long f4748m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f4749n;

    /* renamed from: o  reason: collision with root package name */
    private long f4750o;

    /* renamed from: p  reason: collision with root package name */
    private long f4751p;

    public LengthCheckInputStream(InputStream inputStream, long j10, boolean z9) {
        super(inputStream);
        if (j10 >= 0) {
            this.f4748m = j10;
            this.f4749n = z9;
            return;
        }
        throw new IllegalArgumentException();
    }

    private void g(boolean z9) {
        long j10 = this.f4750o;
        long j11 = this.f4748m;
        if (z9) {
            if (j10 != j11) {
                throw new AmazonClientException("Data read (" + this.f4750o + ") has a different length than the expected (" + this.f4748m + ")");
            }
        } else if (j10 > j11) {
            throw new AmazonClientException("More data read (" + this.f4750o + ") than expected (" + this.f4748m + ")");
        }
    }

    public void mark(int i10) {
        super.mark(i10);
        this.f4751p = this.f4750o;
    }

    public int read() {
        int read = super.read();
        if (read >= 0) {
            this.f4750o++;
        }
        g(read == -1);
        return read;
    }

    public int read(byte[] bArr, int i10, int i11) {
        int read = super.read(bArr, i10, i11);
        this.f4750o += read >= 0 ? (long) read : 0;
        g(read == -1);
        return read;
    }

    public void reset() {
        super.reset();
        if (super.markSupported()) {
            this.f4750o = this.f4751p;
        }
    }

    public long skip(long j10) {
        long skip = super.skip(j10);
        if (this.f4749n && skip > 0) {
            this.f4750o += skip;
            g(false);
        }
        return skip;
    }
}
