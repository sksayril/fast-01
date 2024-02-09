package e6;

import c6.k;
import d6.a;
import d6.b;
import d6.c;
import d6.f;
import f.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o5.e;
import o5.n;
import o5.o;
import o5.p;

public final class d extends a {

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f8515k = {7, 5, 4, 3, 1};

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f8516l = {4, 20, 52, 104, 204};

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f8517m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n  reason: collision with root package name */
    private static final int[][] f8518n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o  reason: collision with root package name */
    private static final int[][] f8519o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, j.E0, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, j.D0, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, j.J0, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, j.I0, 155}, new int[]{43, 129, 176, 106, 107, 110, j.F0, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, j.C0, 137, 200, 178, 112, j.L0, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{j.G0, 149, 25, 75, 14, 42, j.M0, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, j.K0}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p  reason: collision with root package name */
    private static final int[][] f8520p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g  reason: collision with root package name */
    private final List<b> f8521g = new ArrayList(11);

    /* renamed from: h  reason: collision with root package name */
    private final List<c> f8522h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final int[] f8523i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    private boolean f8524j;

    private static int A(u5.a aVar, int i10) {
        return aVar.e(i10) ? aVar.h(aVar.i(i10)) : aVar.i(aVar.h(i10));
    }

    private static boolean B(c cVar, boolean z9, boolean z10) {
        return cVar.c() != 0 || !z9 || !z10;
    }

    private static boolean C(Iterable<b> iterable, Iterable<c> iterable2) {
        boolean z9;
        boolean z10;
        Iterator<c> it = iterable2.iterator();
        do {
            z9 = false;
            if (it.hasNext()) {
                c next = it.next();
                Iterator<b> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z9 = true;
                        continue;
                        break;
                    }
                    b next2 = it2.next();
                    Iterator<b> it3 = next.a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z10 = true;
                                continue;
                                break;
                            }
                        } else {
                            z10 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z10) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z9);
        return true;
    }

    private static boolean D(List<b> list) {
        boolean z9;
        for (int[] iArr : f8520p) {
            if (list.size() <= iArr.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        z9 = true;
                        break;
                    } else if (list.get(i10).a().c() != iArr[i10]) {
                        z9 = false;
                        break;
                    } else {
                        i10++;
                    }
                }
                if (z9) {
                    return true;
                }
            }
        }
        return false;
    }

    private c E(u5.a aVar, int i10, boolean z9) {
        int i11;
        int i12;
        int i13;
        if (z9) {
            int i14 = this.f8523i[0] - 1;
            while (i14 >= 0 && !aVar.e(i14)) {
                i14--;
            }
            int i15 = i14 + 1;
            int[] iArr = this.f8523i;
            i13 = iArr[0] - i15;
            i11 = iArr[1];
            i12 = i15;
        } else {
            int[] iArr2 = this.f8523i;
            int i16 = iArr2[0];
            int i17 = aVar.i(iArr2[1] + 1);
            i11 = i17;
            i12 = i16;
            i13 = i17 - this.f8523i[1];
        }
        int[] k10 = k();
        System.arraycopy(k10, 0, k10, 1, k10.length - 1);
        k10[0] = i13;
        try {
            return new c(a.r(k10, f8518n), new int[]{i12, i11}, i12, i11, i10);
        } catch (o5.j unused) {
            return null;
        }
    }

    private static void F(Collection<b> collection, Collection<c> collection2) {
        Iterator<c> it = collection2.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a().size() != collection.size()) {
                boolean z9 = true;
                Iterator<b> it2 = next.a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!collection.contains(it2.next())) {
                            z9 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z9) {
                    it.remove();
                }
            }
        }
    }

    private static void H(int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length / 2; i10++) {
            int i11 = iArr[i10];
            int i12 = (length - i10) - 1;
            iArr[i10] = iArr[i12];
            iArr[i12] = i11;
        }
    }

    private void I(int i10) {
        boolean z9 = false;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            if (i11 >= this.f8522h.size()) {
                break;
            }
            c cVar = this.f8522h.get(i11);
            if (cVar.b() > i10) {
                z9 = cVar.c(this.f8521g);
                break;
            } else {
                z10 = cVar.c(this.f8521g);
                i11++;
            }
        }
        if (!z9 && !z10 && !C(this.f8521g, this.f8522h)) {
            this.f8522h.add(i11, new c(this.f8521g, i10));
            F(this.f8521g, this.f8522h);
        }
    }

    private void s(int i10) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int d10 = v5.a.d(n());
        int d11 = v5.a.d(l());
        boolean z13 = false;
        boolean z14 = true;
        if (d10 > 13) {
            z10 = false;
            z9 = true;
        } else {
            z10 = d10 < 4;
            z9 = false;
        }
        if (d11 > 13) {
            z12 = false;
            z11 = true;
        } else {
            z12 = d11 < 4;
            z11 = false;
        }
        int i11 = (d10 + d11) - i10;
        boolean z15 = (d10 & 1) == 1;
        if ((d11 & 1) == 0) {
            z13 = true;
        }
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw o5.j.a();
                } else if (z15) {
                    if (!z13) {
                        z14 = z10;
                    } else {
                        throw o5.j.a();
                    }
                } else if (z13) {
                    z14 = z10;
                    z11 = true;
                } else {
                    throw o5.j.a();
                }
            } else if (z15) {
                if (z13) {
                    if (d10 >= d11) {
                        z14 = z10;
                        z12 = true;
                    }
                    z11 = true;
                } else {
                    throw o5.j.a();
                }
            } else if (!z13) {
                z14 = z10;
            } else {
                throw o5.j.a();
            }
            z9 = true;
        } else if (z15) {
            if (z13) {
                throw o5.j.a();
            }
        } else if (z13) {
            z14 = z10;
            z12 = true;
        } else {
            throw o5.j.a();
        }
        if (z14) {
            if (!z9) {
                a.p(n(), o());
            } else {
                throw o5.j.a();
            }
        }
        if (z9) {
            a.i(n(), o());
        }
        if (z12) {
            if (!z11) {
                a.p(l(), o());
            } else {
                throw o5.j.a();
            }
        }
        if (z11) {
            a.i(l(), m());
        }
    }

    private boolean t() {
        b bVar = this.f8521g.get(0);
        b b10 = bVar.b();
        b c10 = bVar.c();
        if (c10 == null) {
            return false;
        }
        int a10 = c10.a();
        int i10 = 2;
        for (int i11 = 1; i11 < this.f8521g.size(); i11++) {
            b bVar2 = this.f8521g.get(i11);
            a10 += bVar2.b().a();
            i10++;
            b c11 = bVar2.c();
            if (c11 != null) {
                a10 += c11.a();
                i10++;
            }
        }
        return ((i10 + -4) * 211) + (a10 % 211) == b10.b();
    }

    private List<b> u(List<c> list, int i10) {
        while (i10 < this.f8522h.size()) {
            c cVar = this.f8522h.get(i10);
            this.f8521g.clear();
            for (c a10 : list) {
                this.f8521g.addAll(a10.a());
            }
            this.f8521g.addAll(cVar.a());
            if (!D(this.f8521g)) {
                i10++;
            } else if (t()) {
                return this.f8521g;
            } else {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return u(arrayList, i10 + 1);
                } catch (o5.j unused) {
                }
            }
        }
        throw o5.j.a();
    }

    private List<b> v(boolean z9) {
        List<b> list = null;
        if (this.f8522h.size() > 25) {
            this.f8522h.clear();
            return null;
        }
        this.f8521g.clear();
        if (z9) {
            Collections.reverse(this.f8522h);
        }
        try {
            list = u(new ArrayList(), 0);
        } catch (o5.j unused) {
        }
        if (z9) {
            Collections.reverse(this.f8522h);
        }
        return list;
    }

    static n w(List<b> list) {
        String d10 = f6.j.a(a.a(list)).d();
        p[] a10 = list.get(0).a().a();
        p[] a11 = list.get(list.size() - 1).a().a();
        n nVar = new n(d10, (byte[]) null, new p[]{a10[0], a10[1], a11[0], a11[1]}, o5.a.RSS_EXPANDED);
        nVar.h(o.SYMBOLOGY_IDENTIFIER, "]e0");
        return nVar;
    }

    private void z(u5.a aVar, List<b> list, int i10) {
        int[] k10 = k();
        k10[0] = 0;
        k10[1] = 0;
        k10[2] = 0;
        k10[3] = 0;
        int k11 = aVar.k();
        if (i10 < 0) {
            i10 = list.isEmpty() ? 0 : list.get(list.size() - 1).a().b()[1];
        }
        boolean z9 = list.size() % 2 != 0;
        if (this.f8524j) {
            z9 = !z9;
        }
        boolean z10 = false;
        while (i10 < k11) {
            z10 = !aVar.e(i10);
            if (!z10) {
                break;
            }
            i10++;
        }
        boolean z11 = z10;
        int i11 = 0;
        int i12 = i10;
        while (i10 < k11) {
            if (aVar.e(i10) != z11) {
                k10[i11] = k10[i11] + 1;
            } else {
                if (i11 == 3) {
                    if (z9) {
                        H(k10);
                    }
                    if (a.q(k10)) {
                        int[] iArr = this.f8523i;
                        iArr[0] = i12;
                        iArr[1] = i10;
                        return;
                    }
                    if (z9) {
                        H(k10);
                    }
                    i12 += k10[0] + k10[1];
                    k10[0] = k10[2];
                    k10[1] = k10[3];
                    k10[2] = 0;
                    k10[3] = 0;
                    i11--;
                } else {
                    i11++;
                }
                k10[i11] = 1;
                z11 = !z11;
            }
            i10++;
        }
        throw o5.j.a();
    }

    /* access modifiers changed from: package-private */
    public b G(u5.a aVar, List<b> list, int i10) {
        c E;
        b bVar;
        boolean z9 = list.size() % 2 == 0;
        if (this.f8524j) {
            z9 = !z9;
        }
        int i11 = -1;
        boolean z10 = true;
        do {
            z(aVar, list, i11);
            E = E(aVar, i10, z9);
            if (E == null) {
                i11 = A(aVar, this.f8523i[0]);
                continue;
            } else {
                z10 = false;
                continue;
            }
        } while (z10);
        b x9 = x(aVar, E, z9, true);
        if (list.isEmpty() || !list.get(list.size() - 1).d()) {
            try {
                bVar = x(aVar, E, z9, false);
            } catch (o5.j unused) {
                bVar = null;
            }
            return new b(x9, bVar, E);
        }
        throw o5.j.a();
    }

    public n a(int i10, u5.a aVar, Map<e, ?> map) {
        this.f8521g.clear();
        this.f8524j = false;
        try {
            return w(y(i10, aVar));
        } catch (o5.j unused) {
            this.f8521g.clear();
            this.f8524j = true;
            return w(y(i10, aVar));
        }
    }

    public void c() {
        this.f8521g.clear();
        this.f8522h.clear();
    }

    /* access modifiers changed from: package-private */
    public b x(u5.a aVar, c cVar, boolean z9, boolean z10) {
        u5.a aVar2 = aVar;
        int[] j10 = j();
        Arrays.fill(j10, 0);
        int[] b10 = cVar.b();
        if (z10) {
            k.h(aVar2, b10[0], j10);
        } else {
            k.g(aVar2, b10[1], j10);
            int i10 = 0;
            for (int length = j10.length - 1; i10 < length; length--) {
                int i11 = j10[i10];
                j10[i10] = j10[length];
                j10[length] = i11;
                i10++;
            }
        }
        float d10 = ((float) v5.a.d(j10)) / ((float) 17);
        float f10 = ((float) (cVar.b()[1] - cVar.b()[0])) / 15.0f;
        if (Math.abs(d10 - f10) / f10 <= 0.3f) {
            int[] n10 = n();
            int[] l10 = l();
            float[] o10 = o();
            float[] m10 = m();
            for (int i12 = 0; i12 < j10.length; i12++) {
                float f11 = (((float) j10[i12]) * 1.0f) / d10;
                int i13 = (int) (0.5f + f11);
                if (i13 < 1) {
                    if (f11 >= 0.3f) {
                        i13 = 1;
                    } else {
                        throw o5.j.a();
                    }
                } else if (i13 > 8) {
                    if (f11 <= 8.7f) {
                        i13 = 8;
                    } else {
                        throw o5.j.a();
                    }
                }
                int i14 = i12 / 2;
                if ((i12 & 1) == 0) {
                    n10[i14] = i13;
                    o10[i14] = f11 - ((float) i13);
                } else {
                    l10[i14] = i13;
                    m10[i14] = f11 - ((float) i13);
                }
            }
            s(17);
            int c10 = (((cVar.c() * 4) + (z9 ? 0 : 2)) + (z10 ^ true ? 1 : 0)) - 1;
            int i15 = 0;
            int i16 = 0;
            for (int length2 = n10.length - 1; length2 >= 0; length2--) {
                if (B(cVar, z9, z10)) {
                    i15 += n10[length2] * f8519o[c10][length2 * 2];
                }
                i16 += n10[length2];
            }
            int i17 = 0;
            for (int length3 = l10.length - 1; length3 >= 0; length3--) {
                if (B(cVar, z9, z10)) {
                    i17 += l10[length3] * f8519o[c10][(length3 * 2) + 1];
                }
            }
            int i18 = i15 + i17;
            if ((i16 & 1) != 0 || i16 > 13 || i16 < 4) {
                throw o5.j.a();
            }
            int i19 = (13 - i16) / 2;
            int i20 = f8515k[i19];
            return new b((f.b(n10, i20, true) * f8516l[i19]) + f.b(l10, 9 - i20, false) + f8517m[i19], i18);
        }
        throw o5.j.a();
    }

    /* access modifiers changed from: package-private */
    public List<b> y(int i10, u5.a aVar) {
        boolean z9 = false;
        while (!z9) {
            try {
                List<b> list = this.f8521g;
                list.add(G(aVar, list, i10));
            } catch (o5.j e10) {
                if (!this.f8521g.isEmpty()) {
                    z9 = true;
                } else {
                    throw e10;
                }
            }
        }
        if (t()) {
            return this.f8521g;
        }
        boolean z10 = !this.f8522h.isEmpty();
        I(i10);
        if (z10) {
            List<b> v9 = v(false);
            if (v9 != null) {
                return v9;
            }
            List<b> v10 = v(true);
            if (v10 != null) {
                return v10;
            }
        }
        throw o5.j.a();
    }
}
