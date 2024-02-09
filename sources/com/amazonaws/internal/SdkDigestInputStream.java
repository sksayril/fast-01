package com.amazonaws.internal;

import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class SdkDigestInputStream extends DigestInputStream implements MetricAware {
    static {
        Class<SdkDigestInputStream> cls = SdkDigestInputStream.class;
    }

    public SdkDigestInputStream(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream, messageDigest);
    }

    @Deprecated
    public final boolean a() {
        if (this.in instanceof MetricAware) {
            return ((MetricAware) this.in).a();
        }
        return false;
    }

    public final long skip(long j10) {
        if (j10 <= 0) {
            return j10;
        }
        int min = (int) Math.min(2048, j10);
        byte[] bArr = new byte[min];
        long j11 = j10;
        while (j11 > 0) {
            int read = read(bArr, 0, (int) Math.min(j11, (long) min));
            if (read != -1) {
                j11 -= (long) read;
            } else if (j11 == j10) {
                return -1;
            } else {
                return j10 - j11;
            }
        }
        return j10;
    }
}
