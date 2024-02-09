package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class r8 {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f5561a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f5562b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    private static final Charset f5563c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f5564d;

    /* renamed from: e  reason: collision with root package name */
    private static final ByteBuffer f5565e;

    /* renamed from: f  reason: collision with root package name */
    private static final v7 f5566f;

    static {
        byte[] bArr = new byte[0];
        f5564d = bArr;
        f5565e = ByteBuffer.wrap(bArr);
        f5566f = v7.c(bArr, 0, bArr.length, false);
    }

    static int a(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int c(boolean z9) {
        return z9 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int a10 = a(length, bArr, 0, length);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    static <T> T e(T t9) {
        Objects.requireNonNull(t9);
        return t9;
    }

    static <T> T f(T t9, String str) {
        Objects.requireNonNull(t9, str);
        return t9;
    }

    static boolean g(da daVar) {
        if (!(daVar instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) daVar;
        return false;
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f5562b);
    }

    public static boolean i(byte[] bArr) {
        return bc.d(bArr);
    }
}
