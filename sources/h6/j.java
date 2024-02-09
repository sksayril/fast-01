package h6;

import i6.a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import o5.d;
import o5.f;
import o5.p;
import u5.b;
import u5.e;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final a f9410a = new a();

    private static c a(h hVar) {
        int[] j10;
        if (hVar == null || (j10 = hVar.j()) == null) {
            return null;
        }
        int p10 = p(j10);
        int i10 = 0;
        int i11 = 0;
        for (int i12 : j10) {
            i11 += p10 - i12;
            if (i12 > 0) {
                break;
            }
        }
        d[] d10 = hVar.d();
        int i13 = 0;
        while (i11 > 0 && d10[i13] == null) {
            i11--;
            i13++;
        }
        for (int length = j10.length - 1; length >= 0; length--) {
            i10 += p10 - j10[length];
            if (j10[length] > 0) {
                break;
            }
        }
        int length2 = d10.length - 1;
        while (i10 > 0 && d10[length2] == null) {
            i10--;
            length2--;
        }
        return hVar.a().a(i11, i10, hVar.k());
    }

    private static void b(f fVar, b[][] bVarArr) {
        b bVar = bVarArr[0][1];
        int[] a10 = bVar.a();
        int j10 = (fVar.j() * fVar.l()) - r(fVar.k());
        if (a10.length == 0) {
            if (j10 < 1 || j10 > 928) {
                throw o5.j.a();
            }
        } else if (a10[0] == j10 || j10 < 1 || j10 > 928) {
            return;
        }
        bVar.b(j10);
    }

    private static int c(b bVar, int i10, int i11, boolean z9, int i12, int i13) {
        int i14 = z9 ? -1 : 1;
        int i15 = i12;
        for (int i16 = 0; i16 < 2; i16++) {
            while (true) {
                if (!z9) {
                    if (i15 >= i11) {
                        continue;
                        break;
                    }
                } else if (i15 < i10) {
                    continue;
                    break;
                }
                if (z9 != bVar.h(i15, i13)) {
                    continue;
                    break;
                } else if (Math.abs(i12 - i15) > 2) {
                    return i12;
                } else {
                    i15 += i14;
                }
            }
            i14 = -i14;
            z9 = !z9;
        }
        return i15;
    }

    private static boolean d(int i10, int i11, int i12) {
        return i11 + -2 <= i10 && i10 <= i12 + 2;
    }

    private static int e(int[] iArr, int[] iArr2, int i10) {
        if ((iArr2 == null || iArr2.length <= (i10 / 2) + 3) && i10 >= 0 && i10 <= 512) {
            return f9410a.a(iArr, i10, iArr2);
        }
        throw d.a();
    }

    private static b[][] f(f fVar) {
        int c10;
        int l10 = fVar.l();
        int[] iArr = new int[2];
        iArr[1] = fVar.j() + 2;
        iArr[0] = l10;
        b[][] bVarArr = (b[][]) Array.newInstance(b.class, iArr);
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            for (int i11 = 0; i11 < bVarArr[i10].length; i11++) {
                bVarArr[i10][i11] = new b();
            }
        }
        int i12 = 0;
        for (g gVar : fVar.o()) {
            if (gVar != null) {
                for (d dVar : gVar.d()) {
                    if (dVar != null && (c10 = dVar.c()) >= 0 && c10 < bVarArr.length) {
                        bVarArr[c10][i12].b(dVar.e());
                    }
                }
            }
            i12++;
        }
        return bVarArr;
    }

    private static e g(f fVar) {
        b[][] f10 = f(fVar);
        b(fVar, f10);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(fVar.l() * fVar.j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < fVar.l(); i10++) {
            int i11 = 0;
            while (i11 < fVar.j()) {
                int i12 = i11 + 1;
                int[] a10 = f10[i10][i12].a();
                int j10 = (fVar.j() * i10) + i11;
                if (a10.length == 0) {
                    arrayList.add(Integer.valueOf(j10));
                } else if (a10.length == 1) {
                    iArr[j10] = a10[0];
                } else {
                    arrayList3.add(Integer.valueOf(j10));
                    arrayList2.add(a10);
                }
                i11 = i12;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i13 = 0; i13 < size; i13++) {
            iArr2[i13] = (int[]) arrayList2.get(i13);
        }
        return h(fVar.k(), iArr, g6.a.b(arrayList), g6.a.b(arrayList3), iArr2);
    }

    private static e h(int i10, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i11 = 100;
        while (true) {
            int i12 = i11 - 1;
            if (i11 > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr[iArr3[i13]] = iArr4[i13][iArr5[i13]];
                }
                try {
                    return j(iArr, i10, iArr2);
                } catch (d unused) {
                    if (length != 0) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                break;
                            } else if (iArr5[i14] < iArr4[i14].length - 1) {
                                iArr5[i14] = iArr5[i14] + 1;
                                break;
                            } else {
                                iArr5[i14] = 0;
                                if (i14 != length - 1) {
                                    i14++;
                                } else {
                                    throw d.a();
                                }
                            }
                        }
                        i11 = i12;
                    } else {
                        throw d.a();
                    }
                }
            } else {
                throw d.a();
            }
        }
    }

    public static e i(b bVar, p pVar, p pVar2, p pVar3, p pVar4, int i10, int i11) {
        f v9;
        g gVar;
        int i12;
        int i13;
        int i14;
        h hVar = null;
        h hVar2 = null;
        c cVar = new c(bVar, pVar, pVar2, pVar3, pVar4);
        boolean z9 = true;
        while (true) {
            if (pVar != null) {
                hVar = s(bVar, cVar, pVar, true, i10, i11);
            }
            if (pVar3 != null) {
                hVar2 = s(bVar, cVar, pVar3, false, i10, i11);
            }
            v9 = v(hVar, hVar2);
            if (v9 != null) {
                c m10 = v9.m();
                if (!z9 || m10 == null || (m10.g() >= cVar.g() && m10.e() <= cVar.e())) {
                    v9.p(cVar);
                    int j10 = v9.j() + 1;
                    v9.q(0, hVar);
                    v9.q(j10, hVar2);
                } else {
                    cVar = m10;
                    z9 = false;
                }
            } else {
                throw o5.j.a();
            }
        }
        v9.p(cVar);
        int j102 = v9.j() + 1;
        v9.q(0, hVar);
        v9.q(j102, hVar2);
        boolean z10 = hVar != null;
        int i15 = i10;
        int i16 = i11;
        for (int i17 = 1; i17 <= j102; i17++) {
            int i18 = z10 ? i17 : j102 - i17;
            if (v9.n(i18) == null) {
                if (i18 == 0 || i18 == j102) {
                    gVar = new h(cVar, i18 == 0);
                } else {
                    gVar = new g(cVar);
                }
                v9.q(i18, gVar);
                int i19 = -1;
                int g10 = cVar.g();
                int i20 = -1;
                while (g10 <= cVar.e()) {
                    int t9 = t(v9, i18, g10, z10);
                    if (t9 >= 0 && t9 <= cVar.d()) {
                        i14 = t9;
                    } else if (i20 == i19) {
                        i13 = i20;
                        i12 = g10;
                        i20 = i13;
                        g10 = i12 + 1;
                        i19 = -1;
                    } else {
                        i14 = i20;
                    }
                    i13 = i20;
                    int i21 = g10;
                    d k10 = k(bVar, cVar.f(), cVar.d(), z10, i14, i21, i15, i16);
                    i12 = i21;
                    if (k10 != null) {
                        gVar.f(i12, k10);
                        i15 = Math.min(i15, k10.f());
                        i16 = Math.max(i16, k10.f());
                        i20 = i14;
                        g10 = i12 + 1;
                        i19 = -1;
                    }
                    i20 = i13;
                    g10 = i12 + 1;
                    i19 = -1;
                }
            }
        }
        return g(v9);
    }

    private static e j(int[] iArr, int i10, int[] iArr2) {
        if (iArr.length != 0) {
            int i11 = 1 << (i10 + 1);
            int e10 = e(iArr, iArr2, i11);
            w(iArr, i11);
            e b10 = e.b(iArr, String.valueOf(i10));
            b10.l(Integer.valueOf(e10));
            b10.k(Integer.valueOf(iArr2.length));
            return b10;
        }
        throw f.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = h6.i.d(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static h6.d k(u5.b r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = c(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = q(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = v5.a.d(r7)
            if (r10 == 0) goto L_0x001b
            int r10 = r11 + r9
            goto L_0x0039
        L_0x001b:
            r10 = 0
        L_0x001c:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0034
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0034:
            int r10 = r11 - r9
            r6 = r11
            r11 = r10
            r10 = r6
        L_0x0039:
            boolean r9 = d(r9, r13, r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = h6.i.d(r7)
            int r9 = g6.a.a(r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            h6.d r8 = new h6.d
            int r7 = n(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.j.k(u5.b, int, int, boolean, int, int, int, int):h6.d");
    }

    private static a l(h hVar, h hVar2) {
        a i10;
        a i11;
        if (hVar == null || (i10 = hVar.i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.i();
        } else if (hVar2 == null || (i11 = hVar2.i()) == null || i10.a() == i11.a() || i10.b() == i11.b() || i10.c() == i11.c()) {
            return i10;
        } else {
            return null;
        }
    }

    private static int[] m(int i10) {
        int[] iArr = new int[8];
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i10 & 1;
            if (i13 != i11) {
                i12--;
                if (i12 < 0) {
                    return iArr;
                }
                i11 = i13;
            }
            iArr[i12] = iArr[i12] + 1;
            i10 >>= 1;
        }
    }

    private static int n(int i10) {
        return o(m(i10));
    }

    private static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int p(int[] iArr) {
        int i10 = -1;
        for (int max : iArr) {
            i10 = Math.max(i10, max);
        }
        return i10;
    }

    private static int[] q(b bVar, int i10, int i11, boolean z9, int i12, int i13) {
        int[] iArr = new int[8];
        int i14 = z9 ? 1 : -1;
        int i15 = 0;
        boolean z10 = z9;
        while (true) {
            if (!z9) {
                if (i12 < i10) {
                    break;
                }
            } else if (i12 >= i11) {
                break;
            }
            if (i15 >= 8) {
                break;
            } else if (bVar.h(i12, i13) == z10) {
                iArr[i15] = iArr[i15] + 1;
                i12 += i14;
            } else {
                i15++;
                z10 = !z10;
            }
        }
        if (i15 != 8) {
            if (z9) {
                i10 = i11;
            }
            if (!(i12 == i10 && i15 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    private static int r(int i10) {
        return 2 << i10;
    }

    private static h s(b bVar, c cVar, p pVar, boolean z9, int i10, int i11) {
        boolean z10 = z9;
        h hVar = new h(cVar, z10);
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 == 0 ? 1 : -1;
            int c10 = (int) pVar.c();
            int d10 = (int) pVar.d();
            while (d10 <= cVar.e() && d10 >= cVar.g()) {
                d k10 = k(bVar, 0, bVar.r(), z9, c10, d10, i10, i11);
                if (k10 != null) {
                    hVar.f(d10, k10);
                    c10 = z10 ? k10.d() : k10.b();
                }
                d10 += i13;
            }
            i12++;
        }
        return hVar;
    }

    private static int t(f fVar, int i10, int i11, boolean z9) {
        int i12 = z9 ? 1 : -1;
        d dVar = null;
        int i13 = i10 - i12;
        if (u(fVar, i13)) {
            dVar = fVar.n(i13).b(i11);
        }
        if (dVar != null) {
            return z9 ? dVar.b() : dVar.d();
        }
        d c10 = fVar.n(i10).c(i11);
        if (c10 != null) {
            return z9 ? c10.d() : c10.b();
        }
        if (u(fVar, i13)) {
            c10 = fVar.n(i13).c(i11);
        }
        if (c10 != null) {
            return z9 ? c10.b() : c10.d();
        }
        int i14 = 0;
        while (true) {
            i10 -= i12;
            if (u(fVar, i10)) {
                for (d dVar2 : fVar.n(i10).d()) {
                    if (dVar2 != null) {
                        return (z9 ? dVar2.b() : dVar2.d()) + (i12 * i14 * (dVar2.b() - dVar2.d()));
                    }
                }
                i14++;
            } else {
                c m10 = fVar.m();
                return z9 ? m10.f() : m10.d();
            }
        }
    }

    private static boolean u(f fVar, int i10) {
        return i10 >= 0 && i10 <= fVar.j() + 1;
    }

    private static f v(h hVar, h hVar2) {
        a l10;
        if ((hVar == null && hVar2 == null) || (l10 = l(hVar, hVar2)) == null) {
            return null;
        }
        return new f(l10, c.j(a(hVar), a(hVar2)));
    }

    private static void w(int[] iArr, int i10) {
        if (iArr.length >= 4) {
            int i11 = iArr[0];
            if (i11 > iArr.length) {
                throw f.a();
            } else if (i11 != 0) {
            } else {
                if (i10 < iArr.length) {
                    iArr[0] = iArr.length - i10;
                    return;
                }
                throw f.a();
            }
        } else {
            throw f.a();
        }
    }
}
