package com.google.android.gms.internal.measurement;

public abstract class v7 {

    /* renamed from: d  reason: collision with root package name */
    private static volatile int f5664d = 100;

    /* renamed from: a  reason: collision with root package name */
    int f5665a;

    /* renamed from: b  reason: collision with root package name */
    private int f5666b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5667c;

    private v7() {
        this.f5665a = f5664d;
        this.f5666b = Integer.MAX_VALUE;
        this.f5667c = false;
    }

    public static long b(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    static v7 c(byte[] bArr, int i10, int i11, boolean z9) {
        u7 u7Var = new u7(bArr, i11);
        try {
            u7Var.a(i11);
            return u7Var;
        } catch (b9 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int e(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract int a(int i10);

    public abstract int d();
}
