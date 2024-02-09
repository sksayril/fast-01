package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

class DecodedStreamBuffer {

    /* renamed from: f  reason: collision with root package name */
    private static final Log f4018f = LogFactory.b(DecodedStreamBuffer.class);

    /* renamed from: a  reason: collision with root package name */
    private byte[] f4019a;

    /* renamed from: b  reason: collision with root package name */
    private int f4020b;

    /* renamed from: c  reason: collision with root package name */
    private int f4021c;

    /* renamed from: d  reason: collision with root package name */
    private int f4022d = -1;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4023e;

    public DecodedStreamBuffer(int i10) {
        this.f4019a = new byte[i10];
        this.f4020b = i10;
    }

    public void a(byte[] bArr, int i10, int i11) {
        this.f4022d = -1;
        int i12 = this.f4021c;
        if (i12 + i11 > this.f4020b) {
            Log log = f4018f;
            if (log.c()) {
                log.a("Buffer size " + this.f4020b + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
            }
            this.f4023e = true;
            return;
        }
        System.arraycopy(bArr, i10, this.f4019a, i12, i11);
        this.f4021c += i11;
    }

    public boolean b() {
        int i10 = this.f4022d;
        return i10 != -1 && i10 < this.f4021c;
    }

    public byte c() {
        byte[] bArr = this.f4019a;
        int i10 = this.f4022d;
        this.f4022d = i10 + 1;
        return bArr[i10];
    }

    public void d() {
        if (!this.f4023e) {
            this.f4022d = 0;
            return;
        }
        throw new AmazonClientException("The input stream is not repeatable since the buffer size " + this.f4020b + " has been exceeded.");
    }
}
