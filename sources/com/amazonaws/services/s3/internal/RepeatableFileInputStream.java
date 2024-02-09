package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class RepeatableFileInputStream extends SdkInputStream {

    /* renamed from: q  reason: collision with root package name */
    private static final Log f4293q = LogFactory.c("RepeatableFIS");

    /* renamed from: m  reason: collision with root package name */
    private final File f4294m;

    /* renamed from: n  reason: collision with root package name */
    private FileInputStream f4295n = null;

    /* renamed from: o  reason: collision with root package name */
    private long f4296o = 0;

    /* renamed from: p  reason: collision with root package name */
    private long f4297p = 0;

    public RepeatableFileInputStream(File file) {
        if (file != null) {
            this.f4295n = new FileInputStream(file);
            this.f4294m = file;
            return;
        }
        throw new IllegalArgumentException("File cannot be null");
    }

    public int available() {
        e();
        return this.f4295n.available();
    }

    public void close() {
        this.f4295n.close();
        e();
    }

    public InputStream g() {
        return this.f4295n;
    }

    public void mark(int i10) {
        e();
        this.f4297p += this.f4296o;
        this.f4296o = 0;
        Log log = f4293q;
        if (log.c()) {
            log.a("Input stream marked at " + this.f4297p + " bytes");
        }
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        e();
        int read = this.f4295n.read();
        if (read == -1) {
            return -1;
        }
        this.f4296o++;
        return read;
    }

    public int read(byte[] bArr, int i10, int i11) {
        e();
        int read = this.f4295n.read(bArr, i10, i11);
        this.f4296o += (long) read;
        return read;
    }

    public void reset() {
        this.f4295n.close();
        e();
        this.f4295n = new FileInputStream(this.f4294m);
        long j10 = this.f4297p;
        while (j10 > 0) {
            j10 -= this.f4295n.skip(j10);
        }
        Log log = f4293q;
        if (log.c()) {
            log.a("Reset to mark point " + this.f4297p + " after returning " + this.f4296o + " bytes");
        }
        this.f4296o = 0;
    }

    public long skip(long j10) {
        e();
        long skip = this.f4295n.skip(j10);
        this.f4296o += skip;
        return skip;
    }
}
