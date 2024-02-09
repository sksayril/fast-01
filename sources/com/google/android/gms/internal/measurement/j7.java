package com.google.android.gms.internal.measurement;

final class j7 extends p7 {

    /* renamed from: r  reason: collision with root package name */
    private final int f5376r;

    /* renamed from: s  reason: collision with root package name */
    private final int f5377s;

    j7(byte[] bArr, int i10, int i11) {
        super(bArr);
        f7.g(i10, i10 + i11, bArr.length);
        this.f5376r = i10;
        this.f5377s = i11;
    }

    public final int A() {
        return this.f5377s;
    }

    /* access modifiers changed from: protected */
    public final int G() {
        return this.f5376r;
    }

    public final byte c(int i10) {
        int A = A();
        if (((A - (i10 + 1)) | i10) >= 0) {
            return this.f5510q[this.f5376r + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + A);
    }

    /* access modifiers changed from: package-private */
    public final byte z(int i10) {
        return this.f5510q[this.f5376r + i10];
    }
}
