package z5;

import o5.p;
import u5.b;
import u5.g;
import u5.j;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f13595a;

    /* renamed from: b  reason: collision with root package name */
    private final v5.b f13596b;

    public a(b bVar) {
        this.f13595a = bVar;
        this.f13596b = new v5.b(bVar);
    }

    private p a(p[] pVarArr) {
        p pVar = pVarArr[0];
        p pVar2 = pVarArr[1];
        p pVar3 = pVarArr[2];
        p pVar4 = pVarArr[3];
        int j10 = j(pVar, pVar4);
        p h10 = h(pVar, pVar2, (j(pVar2, pVar4) + 1) * 4);
        p h11 = h(pVar3, pVar2, (j10 + 1) * 4);
        int j11 = j(h10, pVar4);
        int j12 = j(h11, pVar4);
        float f10 = (float) (j11 + 1);
        p pVar5 = new p(pVar4.c() + ((pVar3.c() - pVar2.c()) / f10), pVar4.d() + ((pVar3.d() - pVar2.d()) / f10));
        float f11 = (float) (j12 + 1);
        p pVar6 = new p(pVar4.c() + ((pVar.c() - pVar2.c()) / f11), pVar4.d() + ((pVar.d() - pVar2.d()) / f11));
        if (e(pVar5)) {
            return (e(pVar6) && j(h10, pVar5) + j(h11, pVar5) <= j(h10, pVar6) + j(h11, pVar6)) ? pVar6 : pVar5;
        }
        if (e(pVar6)) {
            return pVar6;
        }
        return null;
    }

    private p[] c(p[] pVarArr) {
        p pVar = pVarArr[0];
        p pVar2 = pVarArr[1];
        p pVar3 = pVarArr[3];
        p pVar4 = pVarArr[2];
        int j10 = j(pVar, pVar2);
        int j11 = j(pVar2, pVar3);
        int j12 = j(pVar3, pVar4);
        int j13 = j(pVar4, pVar);
        p[] pVarArr2 = {pVar4, pVar, pVar2, pVar3};
        if (j10 > j11) {
            pVarArr2[0] = pVar;
            pVarArr2[1] = pVar2;
            pVarArr2[2] = pVar3;
            pVarArr2[3] = pVar4;
            j10 = j11;
        }
        if (j10 > j12) {
            pVarArr2[0] = pVar2;
            pVarArr2[1] = pVar3;
            pVarArr2[2] = pVar4;
            pVarArr2[3] = pVar;
        } else {
            j12 = j10;
        }
        if (j12 > j13) {
            pVarArr2[0] = pVar3;
            pVarArr2[1] = pVar4;
            pVarArr2[2] = pVar;
            pVarArr2[3] = pVar2;
        }
        return pVarArr2;
    }

    private p[] d(p[] pVarArr) {
        p pVar = pVarArr[0];
        p pVar2 = pVarArr[1];
        p pVar3 = pVarArr[2];
        p pVar4 = pVarArr[3];
        int j10 = (j(pVar, pVar4) + 1) * 4;
        if (j(h(pVar2, pVar3, j10), pVar) < j(h(pVar3, pVar2, j10), pVar4)) {
            pVarArr[0] = pVar;
            pVarArr[1] = pVar2;
            pVarArr[2] = pVar3;
            pVarArr[3] = pVar4;
        } else {
            pVarArr[0] = pVar2;
            pVarArr[1] = pVar3;
            pVarArr[2] = pVar4;
            pVarArr[3] = pVar;
        }
        return pVarArr;
    }

    private boolean e(p pVar) {
        return pVar.c() >= 0.0f && pVar.c() <= ((float) (this.f13595a.r() - 1)) && pVar.d() > 0.0f && pVar.d() <= ((float) (this.f13595a.n() - 1));
    }

    private static p f(p pVar, float f10, float f11) {
        float c10 = pVar.c();
        float d10 = pVar.d();
        return new p(c10 < f10 ? c10 - 1.0f : c10 + 1.0f, d10 < f11 ? d10 - 1.0f : d10 + 1.0f);
    }

    private static b g(b bVar, p pVar, p pVar2, p pVar3, p pVar4, int i10, int i11) {
        float f10 = ((float) i10) - 0.5f;
        float f11 = ((float) i11) - 0.5f;
        return j.b().c(bVar, i10, i11, 0.5f, 0.5f, f10, 0.5f, f10, f11, 0.5f, f11, pVar.c(), pVar.d(), pVar4.c(), pVar4.d(), pVar3.c(), pVar3.d(), pVar2.c(), pVar2.d());
    }

    private static p h(p pVar, p pVar2, int i10) {
        float f10 = (float) (i10 + 1);
        return new p(pVar.c() + ((pVar2.c() - pVar.c()) / f10), pVar.d() + ((pVar2.d() - pVar.d()) / f10));
    }

    private p[] i(p[] pVarArr) {
        p pVar = pVarArr[0];
        p pVar2 = pVarArr[1];
        p pVar3 = pVarArr[2];
        p pVar4 = pVarArr[3];
        p h10 = h(pVar, pVar2, (j(pVar3, pVar4) + 1) * 4);
        p h11 = h(pVar3, pVar2, (j(pVar, pVar4) + 1) * 4);
        int j10 = j(h10, pVar4) + 1;
        int j11 = j(h11, pVar4) + 1;
        if ((j10 & 1) == 1) {
            j10++;
        }
        if ((j11 & 1) == 1) {
            j11++;
        }
        float c10 = (((pVar.c() + pVar2.c()) + pVar3.c()) + pVar4.c()) / 4.0f;
        float d10 = (((pVar.d() + pVar2.d()) + pVar3.d()) + pVar4.d()) / 4.0f;
        p f10 = f(pVar, c10, d10);
        p f11 = f(pVar2, c10, d10);
        p f12 = f(pVar3, c10, d10);
        p f13 = f(pVar4, c10, d10);
        int i10 = j11 * 4;
        int i11 = j10 * 4;
        return new p[]{h(h(f10, f11, i10), f13, i11), h(h(f11, f10, i10), f12, i11), h(h(f12, f13, i10), f11, i11), h(h(f13, f12, i10), f10, i11)};
    }

    private int j(p pVar, p pVar2) {
        int c10 = (int) pVar.c();
        int d10 = (int) pVar.d();
        int c11 = (int) pVar2.c();
        int i10 = 1;
        int min = Math.min(this.f13595a.n() - 1, (int) pVar2.d());
        int i11 = 0;
        boolean z9 = Math.abs(min - d10) > Math.abs(c11 - c10);
        if (z9) {
            int i12 = d10;
            d10 = c10;
            c10 = i12;
            int i13 = min;
            min = c11;
            c11 = i13;
        }
        int abs = Math.abs(c11 - c10);
        int abs2 = Math.abs(min - d10);
        int i14 = (-abs) / 2;
        int i15 = d10 < min ? 1 : -1;
        if (c10 >= c11) {
            i10 = -1;
        }
        boolean h10 = this.f13595a.h(z9 ? d10 : c10, z9 ? c10 : d10);
        while (c10 != c11) {
            boolean h11 = this.f13595a.h(z9 ? d10 : c10, z9 ? c10 : d10);
            if (h11 != h10) {
                i11++;
                h10 = h11;
            }
            i14 += abs2;
            if (i14 > 0) {
                if (d10 == min) {
                    break;
                }
                d10 += i15;
                i14 -= abs;
            }
            c10 += i10;
        }
        return i11;
    }

    public g b() {
        int i10;
        int i11;
        p[] d10 = d(c(this.f13596b.c()));
        d10[3] = a(d10);
        if (d10[3] != null) {
            p[] i12 = i(d10);
            p pVar = i12[0];
            p pVar2 = i12[1];
            p pVar3 = i12[2];
            p pVar4 = i12[3];
            int j10 = j(pVar, pVar4) + 1;
            int j11 = j(pVar3, pVar4) + 1;
            if ((j10 & 1) == 1) {
                j10++;
            }
            if ((j11 & 1) == 1) {
                j11++;
            }
            if (j10 * 4 >= j11 * 6 || j11 * 4 >= j10 * 6) {
                i11 = j10;
                i10 = j11;
            } else {
                i11 = Math.max(j10, j11);
                i10 = i11;
            }
            return new g(g(this.f13595a, pVar, pVar2, pVar3, pVar4, i11, i10), new p[]{pVar, pVar2, pVar3, pVar4});
        }
        throw o5.j.a();
    }
}
