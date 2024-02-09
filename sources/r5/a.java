package r5;

import o5.j;
import o5.p;
import u5.b;
import w5.c;
import w5.d;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f12098g = {3808, 476, 2107, 1799};

    /* renamed from: a  reason: collision with root package name */
    private final b f12099a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12100b;

    /* renamed from: c  reason: collision with root package name */
    private int f12101c;

    /* renamed from: d  reason: collision with root package name */
    private int f12102d;

    /* renamed from: e  reason: collision with root package name */
    private int f12103e;

    /* renamed from: f  reason: collision with root package name */
    private int f12104f;

    /* renamed from: r5.a$a  reason: collision with other inner class name */
    static final class C0207a {

        /* renamed from: a  reason: collision with root package name */
        private final int f12105a;

        /* renamed from: b  reason: collision with root package name */
        private final int f12106b;

        C0207a(int i10, int i11) {
            this.f12105a = i10;
            this.f12106b = i11;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f12105a;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f12106b;
        }

        /* access modifiers changed from: package-private */
        public p c() {
            return new p((float) this.f12105a, (float) this.f12106b);
        }

        public String toString() {
            return "<" + this.f12105a + ' ' + this.f12106b + '>';
        }
    }

    public a(b bVar) {
        this.f12099a = bVar;
    }

    private static float b(p pVar, p pVar2) {
        return v5.a.a(pVar.c(), pVar.d(), pVar2.c(), pVar2.d());
    }

    private static float c(C0207a aVar, C0207a aVar2) {
        return v5.a.b(aVar.a(), aVar.b(), aVar2.a(), aVar2.b());
    }

    private static p[] d(p[] pVarArr, int i10, int i11) {
        float f10 = ((float) i11) / (((float) i10) * 2.0f);
        float c10 = pVarArr[0].c() - pVarArr[2].c();
        float d10 = pVarArr[0].d() - pVarArr[2].d();
        float c11 = (pVarArr[0].c() + pVarArr[2].c()) / 2.0f;
        float d11 = (pVarArr[0].d() + pVarArr[2].d()) / 2.0f;
        float f11 = c10 * f10;
        float f12 = d10 * f10;
        p pVar = new p(c11 + f11, d11 + f12);
        p pVar2 = new p(c11 - f11, d11 - f12);
        float c12 = pVarArr[1].c() - pVarArr[3].c();
        float d12 = pVarArr[1].d() - pVarArr[3].d();
        float c13 = (pVarArr[1].c() + pVarArr[3].c()) / 2.0f;
        float d13 = (pVarArr[1].d() + pVarArr[3].d()) / 2.0f;
        float f13 = c12 * f10;
        float f14 = f10 * d12;
        return new p[]{pVar, new p(c13 + f13, d13 + f14), pVar2, new p(c13 - f13, d13 - f14)};
    }

    private void e(p[] pVarArr) {
        int i10;
        long j10;
        long j11;
        if (!o(pVarArr[0]) || !o(pVarArr[1]) || !o(pVarArr[2]) || !o(pVarArr[3])) {
            throw j.a();
        }
        int i11 = this.f12103e * 2;
        int[] iArr = {r(pVarArr[0], pVarArr[1], i11), r(pVarArr[1], pVarArr[2], i11), r(pVarArr[2], pVarArr[3], i11), r(pVarArr[3], pVarArr[0], i11)};
        this.f12104f = m(iArr, i11);
        long j12 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = iArr[(this.f12104f + i12) % 4];
            if (this.f12100b) {
                j11 = j12 << 7;
                j10 = (long) ((i13 >> 1) & 127);
            } else {
                j11 = j12 << 10;
                j10 = (long) (((i13 >> 2) & 992) + ((i13 >> 1) & 31));
            }
            j12 = j11 + j10;
        }
        int h10 = h(j12, this.f12100b);
        if (this.f12100b) {
            this.f12101c = (h10 >> 6) + 1;
            i10 = h10 & 63;
        } else {
            this.f12101c = (h10 >> 11) + 1;
            i10 = h10 & 2047;
        }
        this.f12102d = i10 + 1;
    }

    private p[] f(C0207a aVar) {
        this.f12103e = 1;
        C0207a aVar2 = aVar;
        C0207a aVar3 = aVar2;
        C0207a aVar4 = aVar3;
        C0207a aVar5 = aVar4;
        boolean z9 = true;
        while (this.f12103e < 9) {
            C0207a j10 = j(aVar2, z9, 1, -1);
            C0207a j11 = j(aVar3, z9, 1, 1);
            C0207a j12 = j(aVar4, z9, -1, 1);
            C0207a j13 = j(aVar5, z9, -1, -1);
            if (this.f12103e > 2) {
                double c10 = (double) ((c(j13, j10) * ((float) this.f12103e)) / (c(aVar5, aVar2) * ((float) (this.f12103e + 2))));
                if (c10 < 0.75d || c10 > 1.25d || !p(j10, j11, j12, j13)) {
                    break;
                }
            }
            z9 = !z9;
            this.f12103e++;
            aVar5 = j13;
            aVar2 = j10;
            aVar3 = j11;
            aVar4 = j12;
        }
        int i10 = this.f12103e;
        if (i10 == 5 || i10 == 7) {
            this.f12100b = i10 == 5;
            p[] pVarArr = {new p(((float) aVar2.a()) + 0.5f, ((float) aVar2.b()) - 0.5f), new p(((float) aVar3.a()) + 0.5f, ((float) aVar3.b()) + 0.5f), new p(((float) aVar4.a()) - 0.5f, ((float) aVar4.b()) + 0.5f), new p(((float) aVar5.a()) - 0.5f, ((float) aVar5.b()) - 0.5f)};
            int i11 = this.f12103e;
            return d(pVarArr, (i11 * 2) - 3, i11 * 2);
        }
        throw j.a();
    }

    private int g(C0207a aVar, C0207a aVar2) {
        float c10 = c(aVar, aVar2);
        boolean z9 = false;
        if (c10 == 0.0f) {
            return 0;
        }
        float a10 = ((float) (aVar2.a() - aVar.a())) / c10;
        float b10 = ((float) (aVar2.b() - aVar.b())) / c10;
        float a11 = (float) aVar.a();
        float b11 = (float) aVar.b();
        boolean h10 = this.f12099a.h(aVar.a(), aVar.b());
        int floor = (int) Math.floor((double) c10);
        int i10 = 0;
        for (int i11 = 0; i11 < floor; i11++) {
            if (this.f12099a.h(v5.a.c(a11), v5.a.c(b11)) != h10) {
                i10++;
            }
            a11 += a10;
            b11 += b10;
        }
        float f10 = ((float) i10) / c10;
        if (f10 > 0.1f && f10 < 0.9f) {
            return 0;
        }
        if (f10 <= 0.1f) {
            z9 = true;
        }
        return z9 == h10 ? 1 : -1;
    }

    private static int h(long j10, boolean z9) {
        int i10;
        int i11;
        if (z9) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int i12 = i10 - i11;
        int[] iArr = new int[i10];
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iArr[i13] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            new c(w5.a.f12977k).a(iArr, i12);
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 = (i14 << 4) + iArr[i15];
            }
            return i14;
        } catch (d unused) {
            throw j.a();
        }
    }

    private int i() {
        if (this.f12100b) {
            return (this.f12101c * 4) + 11;
        }
        int i10 = this.f12101c;
        return (i10 * 4) + ((((i10 * 2) + 6) / 15) * 2) + 15;
    }

    private C0207a j(C0207a aVar, boolean z9, int i10, int i11) {
        int a10 = aVar.a() + i10;
        int b10 = aVar.b();
        while (true) {
            b10 += i11;
            if (!n(a10, b10) || this.f12099a.h(a10, b10) != z9) {
                int i12 = a10 - i10;
                int i13 = b10 - i11;
            } else {
                a10 += i10;
            }
        }
        int i122 = a10 - i10;
        int i132 = b10 - i11;
        while (n(i122, i132) && this.f12099a.h(i122, i132) == z9) {
            i122 += i10;
        }
        int i14 = i122 - i10;
        while (n(i14, i132) && this.f12099a.h(i14, i132) == z9) {
            i132 += i11;
        }
        return new C0207a(i14, i132 - i11);
    }

    private C0207a k() {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        p pVar5;
        p pVar6;
        p pVar7;
        p pVar8;
        try {
            p[] c10 = new v5.b(this.f12099a).c();
            pVar3 = c10[0];
            pVar2 = c10[1];
            pVar = c10[2];
            pVar4 = c10[3];
        } catch (j unused) {
            int r9 = this.f12099a.r() / 2;
            int n10 = this.f12099a.n() / 2;
            int i10 = r9 + 7;
            int i11 = n10 - 7;
            p c11 = j(new C0207a(i10, i11), false, 1, -1).c();
            int i12 = n10 + 7;
            p c12 = j(new C0207a(i10, i12), false, 1, 1).c();
            int i13 = r9 - 7;
            p c13 = j(new C0207a(i13, i12), false, -1, 1).c();
            pVar4 = j(new C0207a(i13, i11), false, -1, -1).c();
            p pVar9 = c12;
            pVar = c13;
            pVar3 = c11;
            pVar2 = pVar9;
        }
        int c14 = v5.a.c((((pVar3.c() + pVar4.c()) + pVar2.c()) + pVar.c()) / 4.0f);
        int c15 = v5.a.c((((pVar3.d() + pVar4.d()) + pVar2.d()) + pVar.d()) / 4.0f);
        try {
            p[] c16 = new v5.b(this.f12099a, 15, c14, c15).c();
            pVar6 = c16[0];
            pVar5 = c16[1];
            pVar7 = c16[2];
            pVar8 = c16[3];
        } catch (j unused2) {
            int i14 = c14 + 7;
            int i15 = c15 - 7;
            pVar6 = j(new C0207a(i14, i15), false, 1, -1).c();
            int i16 = c15 + 7;
            pVar5 = j(new C0207a(i14, i16), false, 1, 1).c();
            int i17 = c14 - 7;
            pVar7 = j(new C0207a(i17, i16), false, -1, 1).c();
            pVar8 = j(new C0207a(i17, i15), false, -1, -1).c();
        }
        return new C0207a(v5.a.c((((pVar6.c() + pVar8.c()) + pVar5.c()) + pVar7.c()) / 4.0f), v5.a.c((((pVar6.d() + pVar8.d()) + pVar5.d()) + pVar7.d()) / 4.0f));
    }

    private p[] l(p[] pVarArr) {
        return d(pVarArr, this.f12103e * 2, i());
    }

    private static int m(int[] iArr, int i10) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        int i13 = ((i11 & 1) << 11) + (i11 >> 1);
        for (int i14 = 0; i14 < 4; i14++) {
            if (Integer.bitCount(f12098g[i14] ^ i13) <= 2) {
                return i14;
            }
        }
        throw j.a();
    }

    private boolean n(int i10, int i11) {
        return i10 >= 0 && i10 < this.f12099a.r() && i11 >= 0 && i11 < this.f12099a.n();
    }

    private boolean o(p pVar) {
        return n(v5.a.c(pVar.c()), v5.a.c(pVar.d()));
    }

    private boolean p(C0207a aVar, C0207a aVar2, C0207a aVar3, C0207a aVar4) {
        C0207a aVar5 = new C0207a(Math.max(0, aVar.a() - 3), Math.min(this.f12099a.n() - 1, aVar.b() + 3));
        C0207a aVar6 = new C0207a(Math.max(0, aVar2.a() - 3), Math.max(0, aVar2.b() - 3));
        C0207a aVar7 = new C0207a(Math.min(this.f12099a.r() - 1, aVar3.a() + 3), Math.max(0, Math.min(this.f12099a.n() - 1, aVar3.b() - 3)));
        C0207a aVar8 = new C0207a(Math.min(this.f12099a.r() - 1, aVar4.a() + 3), Math.min(this.f12099a.n() - 1, aVar4.b() + 3));
        int g10 = g(aVar8, aVar5);
        return g10 != 0 && g(aVar5, aVar6) == g10 && g(aVar6, aVar7) == g10 && g(aVar7, aVar8) == g10;
    }

    private b q(b bVar, p pVar, p pVar2, p pVar3, p pVar4) {
        u5.j b10 = u5.j.b();
        int i10 = i();
        int i11 = i10;
        int i12 = i10;
        float f10 = ((float) i10) / 2.0f;
        int i13 = this.f12103e;
        float f11 = f10 - ((float) i13);
        float f12 = f10 + ((float) i13);
        return b10.c(bVar, i12, i11, f11, f11, f12, f11, f12, f12, f11, f12, pVar.c(), pVar.d(), pVar2.c(), pVar2.d(), pVar3.c(), pVar3.d(), pVar4.c(), pVar4.d());
    }

    private int r(p pVar, p pVar2, int i10) {
        float b10 = b(pVar, pVar2);
        float f10 = b10 / ((float) i10);
        float c10 = pVar.c();
        float d10 = pVar.d();
        float c11 = ((pVar2.c() - pVar.c()) * f10) / b10;
        float d11 = (f10 * (pVar2.d() - pVar.d())) / b10;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = (float) i12;
            if (this.f12099a.h(v5.a.c((f11 * c11) + c10), v5.a.c((f11 * d11) + d10))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    public p5.a a(boolean z9) {
        p[] f10 = f(k());
        if (z9) {
            p pVar = f10[0];
            f10[0] = f10[2];
            f10[2] = pVar;
        }
        e(f10);
        b bVar = this.f12099a;
        int i10 = this.f12104f;
        return new p5.a(q(bVar, f10[i10 % 4], f10[(i10 + 1) % 4], f10[(i10 + 2) % 4], f10[(i10 + 3) % 4]), l(f10), this.f12100b, this.f12102d, this.f12101c);
    }
}
