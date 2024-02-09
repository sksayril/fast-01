package com.google.zxing.qrcode.decoder;

import o5.f;
import u5.b;

final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f7533a;

    /* renamed from: b  reason: collision with root package name */
    private j f7534b;

    /* renamed from: c  reason: collision with root package name */
    private g f7535c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7536d;

    a(b bVar) {
        int n10 = bVar.n();
        if (n10 < 21 || (n10 & 3) != 1) {
            throw f.a();
        }
        this.f7533a = bVar;
    }

    private int a(int i10, int i11, int i12) {
        return this.f7536d ? this.f7533a.h(i11, i10) : this.f7533a.h(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i10 = 0;
        while (i10 < this.f7533a.r()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f7533a.n(); i12++) {
                if (this.f7533a.h(i10, i12) != this.f7533a.h(i12, i10)) {
                    this.f7533a.f(i12, i10);
                    this.f7533a.f(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] c() {
        g d10 = d();
        j e10 = e();
        c cVar = c.values()[d10.c()];
        int n10 = this.f7533a.n();
        cVar.unmaskBitMatrix(this.f7533a, n10);
        b a10 = e10.a();
        byte[] bArr = new byte[e10.h()];
        int i10 = n10 - 1;
        boolean z9 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < n10; i15++) {
                int i16 = z9 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!a10.h(i18, i16)) {
                        i13++;
                        i14 <<= 1;
                        if (this.f7533a.h(i18, i16)) {
                            i14 |= 1;
                        }
                        if (i13 == 8) {
                            bArr[i12] = (byte) i14;
                            i12++;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z9 = !z9;
            i11 -= 2;
        }
        if (i12 == e10.h()) {
            return bArr;
        }
        throw f.a();
    }

    /* access modifiers changed from: package-private */
    public g d() {
        g gVar = this.f7535c;
        if (gVar != null) {
            return gVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = a(i12, 8, i11);
        }
        int a10 = a(8, 7, a(8, 8, a(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            a10 = a(8, i13, a10);
        }
        int n10 = this.f7533a.n();
        int i14 = n10 - 7;
        for (int i15 = n10 - 1; i15 >= i14; i15--) {
            i10 = a(8, i15, i10);
        }
        for (int i16 = n10 - 8; i16 < n10; i16++) {
            i10 = a(i16, 8, i10);
        }
        g a11 = g.a(a10, i10);
        this.f7535c = a11;
        if (a11 != null) {
            return a11;
        }
        throw f.a();
    }

    /* access modifiers changed from: package-private */
    public j e() {
        j jVar = this.f7534b;
        if (jVar != null) {
            return jVar;
        }
        int n10 = this.f7533a.n();
        int i10 = (n10 - 17) / 4;
        if (i10 <= 6) {
            return j.i(i10);
        }
        int i11 = n10 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = n10 - 9; i15 >= i11; i15--) {
                i13 = a(i15, i14, i13);
            }
        }
        j c10 = j.c(i13);
        if (c10 == null || c10.e() != n10) {
            for (int i16 = 5; i16 >= 0; i16--) {
                for (int i17 = n10 - 9; i17 >= i11; i17--) {
                    i12 = a(i16, i17, i12);
                }
            }
            j c11 = j.c(i12);
            if (c11 == null || c11.e() != n10) {
                throw f.a();
            }
            this.f7534b = c11;
            return c11;
        }
        this.f7534b = c10;
        return c10;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.f7535c != null) {
            c.values()[this.f7535c.c()].unmaskBitMatrix(this.f7533a, this.f7533a.n());
        }
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z9) {
        this.f7534b = null;
        this.f7535c = null;
        this.f7536d = z9;
    }
}
