package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Objects;

public final class AwsChunkedEncodingInputStream extends SdkInputStream {

    /* renamed from: y  reason: collision with root package name */
    private static final byte[] f3995y = new byte[0];

    /* renamed from: z  reason: collision with root package name */
    private static final Log f3996z = LogFactory.b(AwsChunkedEncodingInputStream.class);

    /* renamed from: m  reason: collision with root package name */
    private InputStream f3997m;

    /* renamed from: n  reason: collision with root package name */
    private final int f3998n;

    /* renamed from: o  reason: collision with root package name */
    private final byte[] f3999o;

    /* renamed from: p  reason: collision with root package name */
    private final String f4000p;

    /* renamed from: q  reason: collision with root package name */
    private final String f4001q;

    /* renamed from: r  reason: collision with root package name */
    private final String f4002r;

    /* renamed from: s  reason: collision with root package name */
    private String f4003s;

    /* renamed from: t  reason: collision with root package name */
    private final AWS4Signer f4004t;

    /* renamed from: u  reason: collision with root package name */
    private ChunkContentIterator f4005u;

    /* renamed from: v  reason: collision with root package name */
    private DecodedStreamBuffer f4006v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f4007w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f4008x;

    public AwsChunkedEncodingInputStream(InputStream inputStream, int i10, byte[] bArr, String str, String str2, String str3, AWS4Signer aWS4Signer) {
        this.f3997m = null;
        this.f4007w = true;
        this.f4008x = false;
        if (inputStream instanceof AwsChunkedEncodingInputStream) {
            AwsChunkedEncodingInputStream awsChunkedEncodingInputStream = (AwsChunkedEncodingInputStream) inputStream;
            i10 = Math.max(awsChunkedEncodingInputStream.f3998n, i10);
            this.f3997m = awsChunkedEncodingInputStream.f3997m;
            this.f4006v = awsChunkedEncodingInputStream.f4006v;
        } else {
            this.f3997m = inputStream;
            this.f4006v = null;
        }
        if (i10 >= 131072) {
            this.f3998n = i10;
            this.f3999o = bArr;
            this.f4000p = str;
            this.f4001q = str2;
            this.f4002r = str3;
            this.f4003s = str3;
            this.f4004t = aWS4Signer;
            return;
        }
        throw new IllegalArgumentException("Max buffer size should not be less than chunk size");
    }

    public AwsChunkedEncodingInputStream(InputStream inputStream, byte[] bArr, String str, String str2, String str3, AWS4Signer aWS4Signer) {
        this(inputStream, 262144, bArr, str, str2, str3, aWS4Signer);
    }

    private static long h(long j10) {
        return ((long) (Long.toHexString(j10).length() + 17 + 64 + 2)) + j10 + ((long) 2);
    }

    public static long k(long j10) {
        if (j10 >= 0) {
            long j11 = j10 / 131072;
            long j12 = j10 % 131072;
            return (j11 * h(131072)) + (j12 > 0 ? h(j12) : 0) + h(0);
        }
        throw new IllegalArgumentException("Nonnegative content length expected.");
    }

    private byte[] l(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(bArr.length));
        String a10 = BinaryUtils.a(this.f4004t.r("AWS4-HMAC-SHA256-PAYLOAD\n" + this.f4000p + "\n" + this.f4001q + "\n" + this.f4003s + "\n" + BinaryUtils.a(this.f4004t.o("")) + "\n" + BinaryUtils.a(this.f4004t.p(bArr)), this.f3999o, SigningAlgorithm.HmacSHA256));
        this.f4003s = a10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(";chunk-signature=");
        sb2.append(a10);
        sb.append(sb2.toString());
        sb.append("\r\n");
        try {
            String sb3 = sb.toString();
            Charset charset = StringUtils.f4756a;
            byte[] bytes = sb3.getBytes(charset);
            byte[] bytes2 = "\r\n".getBytes(charset);
            byte[] bArr2 = new byte[(bytes.length + bArr.length + bytes2.length)];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            System.arraycopy(bytes2, 0, bArr2, bytes.length + bArr.length, bytes2.length);
            return bArr2;
        } catch (Exception e10) {
            throw new AmazonClientException("Unable to sign the chunked data. " + e10.getMessage(), e10);
        }
    }

    private boolean m() {
        byte[] bArr = new byte[131072];
        int i10 = 0;
        while (i10 < 131072) {
            DecodedStreamBuffer decodedStreamBuffer = this.f4006v;
            if (decodedStreamBuffer == null || !decodedStreamBuffer.b()) {
                int read = this.f3997m.read(bArr, i10, 131072 - i10);
                if (read == -1) {
                    break;
                }
                DecodedStreamBuffer decodedStreamBuffer2 = this.f4006v;
                if (decodedStreamBuffer2 != null) {
                    decodedStreamBuffer2.a(bArr, i10, read);
                }
                i10 += read;
            } else {
                bArr[i10] = this.f4006v.c();
                i10++;
            }
        }
        if (i10 == 0) {
            this.f4005u = new ChunkContentIterator(l(f3995y));
            return true;
        }
        if (i10 < 131072) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            bArr = bArr2;
        }
        this.f4005u = new ChunkContentIterator(l(bArr));
        return false;
    }

    /* access modifiers changed from: protected */
    public InputStream g() {
        return this.f3997m;
    }

    public synchronized void mark(int i10) {
        e();
        if (!this.f4007w) {
            throw new UnsupportedOperationException("Chunk-encoded stream only supports mark() at the start of the stream.");
        } else if (this.f3997m.markSupported()) {
            Log log = f3996z;
            if (log.c()) {
                log.a("AwsChunkedEncodingInputStream marked at the start of the stream (will directly mark the wrapped stream since it's mark-supported).");
            }
            this.f3997m.mark(Integer.MAX_VALUE);
        } else {
            Log log2 = f3996z;
            if (log2.c()) {
                log2.a("AwsChunkedEncodingInputStream marked at the start of the stream (initializing the buffer since the wrapped stream is not mark-supported).");
            }
            this.f4006v = new DecodedStreamBuffer(this.f3998n);
        }
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read == -1) {
            return read;
        }
        Log log = f3996z;
        if (log.c()) {
            log.a("One byte read from the stream.");
        }
        return bArr[0] & 255;
    }

    public int read(byte[] bArr, int i10, int i11) {
        e();
        Objects.requireNonNull(bArr);
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        } else if (i11 == 0) {
            return 0;
        } else {
            ChunkContentIterator chunkContentIterator = this.f4005u;
            if (chunkContentIterator == null || !chunkContentIterator.a()) {
                if (this.f4008x) {
                    return -1;
                }
                this.f4008x = m();
            }
            int b10 = this.f4005u.b(bArr, i10, i11);
            if (b10 > 0) {
                this.f4007w = false;
                Log log = f3996z;
                if (log.c()) {
                    log.a(b10 + " byte read from the stream.");
                }
            }
            return b10;
        }
    }

    public synchronized void reset() {
        e();
        this.f4005u = null;
        this.f4003s = this.f4002r;
        if (this.f3997m.markSupported()) {
            Log log = f3996z;
            if (log.c()) {
                log.a("AwsChunkedEncodingInputStream reset (will reset the wrapped stream because it is mark-supported).");
            }
            this.f3997m.reset();
        } else {
            Log log2 = f3996z;
            if (log2.c()) {
                log2.a("AwsChunkedEncodingInputStream reset (will use the buffer of the decoded stream).");
            }
            DecodedStreamBuffer decodedStreamBuffer = this.f4006v;
            if (decodedStreamBuffer != null) {
                decodedStreamBuffer.d();
            } else {
                throw new IOException("Cannot reset the stream because the mark is not set.");
            }
        }
        this.f4005u = null;
        this.f4007w = true;
        this.f4008x = false;
    }

    public long skip(long j10) {
        int read;
        if (j10 <= 0) {
            return 0;
        }
        int min = (int) Math.min(262144, j10);
        byte[] bArr = new byte[min];
        long j11 = j10;
        while (j11 > 0 && (read = read(bArr, 0, min)) >= 0) {
            j11 -= (long) read;
        }
        return j10 - j11;
    }
}
