package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Objects;

class p7 extends q7 {

    /* renamed from: q  reason: collision with root package name */
    protected final byte[] f5510q;

    p7(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f5510q = bArr;
    }

    public int A() {
        return this.f5510q.length;
    }

    /* access modifiers changed from: protected */
    public final int B(int i10, int i11, int i12) {
        return r8.a(i10, this.f5510q, G(), i12);
    }

    public final boolean E() {
        int G = G();
        return bc.f(this.f5510q, G, A() + G);
    }

    /* access modifiers changed from: package-private */
    public final boolean F(f7 f7Var, int i10, int i11) {
        if (i11 > f7Var.A()) {
            int A = A();
            throw new IllegalArgumentException("Length too large: " + i11 + A);
        } else if (i11 > f7Var.A()) {
            int A2 = f7Var.A();
            throw new IllegalArgumentException("Ran off end of other: " + 0 + ", " + i11 + ", " + A2);
        } else if (!(f7Var instanceof p7)) {
            return f7Var.i(0, i11).equals(i(0, i11));
        } else {
            p7 p7Var = (p7) f7Var;
            byte[] bArr = this.f5510q;
            byte[] bArr2 = p7Var.f5510q;
            int G = G() + i11;
            int G2 = G();
            int G3 = p7Var.G();
            while (G2 < G) {
                if (bArr[G2] != bArr2[G3]) {
                    return false;
                }
                G2++;
                G3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public int G() {
        return 0;
    }

    public byte c(int i10) {
        return this.f5510q[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f7) || A() != ((f7) obj).A()) {
            return false;
        }
        if (A() == 0) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return obj.equals(this);
        }
        p7 p7Var = (p7) obj;
        int d10 = d();
        int d11 = p7Var.d();
        if (d10 == 0 || d11 == 0 || d10 == d11) {
            return F(p7Var, 0, A());
        }
        return false;
    }

    public final f7 i(int i10, int i11) {
        int g10 = f7.g(0, i11, A());
        return g10 == 0 ? f7.f5243n : new j7(this.f5510q, G(), g10);
    }

    /* access modifiers changed from: protected */
    public final String o(Charset charset) {
        return new String(this.f5510q, G(), A(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void y(g7 g7Var) {
        g7Var.a(this.f5510q, G(), A());
    }

    /* access modifiers changed from: package-private */
    public byte z(int i10) {
        return this.f5510q[i10];
    }
}
