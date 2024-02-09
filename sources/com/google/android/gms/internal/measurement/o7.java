package com.google.android.gms.internal.measurement;

final class o7 {

    /* renamed from: a  reason: collision with root package name */
    private final y7 f5489a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f5490b;

    private o7(int i10) {
        byte[] bArr = new byte[i10];
        this.f5490b = bArr;
        this.f5489a = y7.H(bArr);
    }

    public final f7 a() {
        this.f5489a.I();
        return new p7(this.f5490b);
    }

    public final y7 b() {
        return this.f5489a;
    }
}
