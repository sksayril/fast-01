package com.amazonaws.auth;

class ChunkContentIterator {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f4014a;

    /* renamed from: b  reason: collision with root package name */
    private int f4015b;

    public ChunkContentIterator(byte[] bArr) {
        this.f4014a = bArr;
    }

    public boolean a() {
        return this.f4015b < this.f4014a.length;
    }

    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (!a()) {
            return -1;
        }
        int min = Math.min(this.f4014a.length - this.f4015b, i11);
        System.arraycopy(this.f4014a, this.f4015b, bArr, i10, min);
        this.f4015b += min;
        return min;
    }
}
