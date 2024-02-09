package com.google.android.gms.internal.measurement;

final class u7 extends v7 {

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f5641e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5642f;

    /* renamed from: g  reason: collision with root package name */
    private int f5643g;

    /* renamed from: h  reason: collision with root package name */
    private int f5644h;

    /* renamed from: i  reason: collision with root package name */
    private int f5645i;

    /* renamed from: j  reason: collision with root package name */
    private int f5646j;

    /* renamed from: k  reason: collision with root package name */
    private int f5647k;

    private u7(byte[] bArr, int i10, int i11, boolean z9) {
        super();
        this.f5647k = Integer.MAX_VALUE;
        this.f5641e = bArr;
        this.f5643g = i11 + i10;
        this.f5645i = i10;
        this.f5646j = i10;
        this.f5642f = z9;
    }

    private final void f() {
        int i10 = this.f5643g + this.f5644h;
        this.f5643g = i10;
        int i11 = i10 - this.f5646j;
        int i12 = this.f5647k;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f5644h = i13;
            this.f5643g = i10 - i13;
            return;
        }
        this.f5644h = 0;
    }

    public final int a(int i10) {
        if (i10 >= 0) {
            int d10 = i10 + d();
            if (d10 >= 0) {
                int i11 = this.f5647k;
                if (d10 <= i11) {
                    this.f5647k = d10;
                    f();
                    return i11;
                }
                throw b9.f();
            }
            throw b9.e();
        }
        throw b9.d();
    }

    public final int d() {
        return this.f5645i - this.f5646j;
    }
}
