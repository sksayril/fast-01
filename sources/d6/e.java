package d6;

import c6.k;
import f.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o5.a;
import o5.n;
import o5.o;
import o5.p;
import o5.q;

public final class e extends a {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f8211i = {1, 10, 34, 70, j.M0};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f8212j = {4, 20, 48, 81};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f8213k = {0, 161, 961, 2015, 2715};

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f8214l = {0, 336, 1036, 1516};

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f8215m = {8, 6, 4, 3, 1};

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f8216n = {2, 4, 6, 8};

    /* renamed from: o  reason: collision with root package name */
    private static final int[][] f8217o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g  reason: collision with root package name */
    private final List<d> f8218g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<d> f8219h = new ArrayList();

    private static void s(Collection<d> collection, d dVar) {
        if (dVar != null) {
            boolean z9 = false;
            Iterator<d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d next = it.next();
                if (next.b() == dVar.b()) {
                    next.e();
                    z9 = true;
                    break;
                }
            }
            if (!z9) {
                collection.add(dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r5 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t(boolean r10, int r11) {
        /*
            r9 = this;
            int[] r0 = r9.n()
            int r0 = v5.a.d(r0)
            int[] r1 = r9.l()
            int r1 = v5.a.d(r1)
            r2 = 4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0028
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r6 = 0
            r7 = 1
            goto L_0x0022
        L_0x001c:
            if (r0 >= r2) goto L_0x0020
            r6 = 1
            goto L_0x0021
        L_0x0020:
            r6 = 0
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r1 <= r5) goto L_0x0025
            goto L_0x003a
        L_0x0025:
            if (r1 >= r2) goto L_0x0041
            goto L_0x003f
        L_0x0028:
            r5 = 11
            if (r0 <= r5) goto L_0x002f
            r6 = 0
            r7 = 1
            goto L_0x0036
        L_0x002f:
            r5 = 5
            if (r0 >= r5) goto L_0x0034
            r6 = 1
            goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            r7 = 0
        L_0x0036:
            r5 = 10
            if (r1 <= r5) goto L_0x003d
        L_0x003a:
            r2 = 0
            r5 = 1
            goto L_0x0043
        L_0x003d:
            if (r1 >= r2) goto L_0x0041
        L_0x003f:
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            r5 = 0
        L_0x0043:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x004c
            r10 = 1
            goto L_0x004d
        L_0x004c:
            r10 = 0
        L_0x004d:
            r11 = r1 & 1
            if (r11 != r4) goto L_0x0052
            r3 = 1
        L_0x0052:
            r11 = -1
            if (r8 == r11) goto L_0x008c
            if (r8 == 0) goto L_0x0074
            if (r8 != r4) goto L_0x006f
            if (r10 == 0) goto L_0x0065
            if (r3 != 0) goto L_0x0060
            r4 = r6
        L_0x005e:
            r7 = 1
            goto L_0x009a
        L_0x0060:
            o5.j r10 = o5.j.a()
            throw r10
        L_0x0065:
            if (r3 == 0) goto L_0x006a
            r4 = r6
        L_0x0068:
            r5 = 1
            goto L_0x009a
        L_0x006a:
            o5.j r10 = o5.j.a()
            throw r10
        L_0x006f:
            o5.j r10 = o5.j.a()
            throw r10
        L_0x0074:
            if (r10 == 0) goto L_0x0083
            if (r3 == 0) goto L_0x007e
            if (r0 >= r1) goto L_0x007b
            goto L_0x0068
        L_0x007b:
            r4 = r6
            r2 = 1
            goto L_0x005e
        L_0x007e:
            o5.j r10 = o5.j.a()
            throw r10
        L_0x0083:
            if (r3 != 0) goto L_0x0087
            r4 = r6
            goto L_0x009a
        L_0x0087:
            o5.j r10 = o5.j.a()
            throw r10
        L_0x008c:
            if (r10 == 0) goto L_0x0096
            if (r3 != 0) goto L_0x0091
            goto L_0x009a
        L_0x0091:
            o5.j r10 = o5.j.a()
            throw r10
        L_0x0096:
            if (r3 == 0) goto L_0x00df
            r4 = r6
            r2 = 1
        L_0x009a:
            if (r4 == 0) goto L_0x00af
            if (r7 != 0) goto L_0x00aa
            int[] r10 = r9.n()
            float[] r11 = r9.o()
            d6.a.p(r10, r11)
            goto L_0x00af
        L_0x00aa:
            o5.j r10 = o5.j.a()
            throw r10
        L_0x00af:
            if (r7 == 0) goto L_0x00bc
            int[] r10 = r9.n()
            float[] r11 = r9.o()
            d6.a.i(r10, r11)
        L_0x00bc:
            if (r2 == 0) goto L_0x00d1
            if (r5 != 0) goto L_0x00cc
            int[] r10 = r9.l()
            float[] r11 = r9.o()
            d6.a.p(r10, r11)
            goto L_0x00d1
        L_0x00cc:
            o5.j r10 = o5.j.a()
            throw r10
        L_0x00d1:
            if (r5 == 0) goto L_0x00de
            int[] r10 = r9.l()
            float[] r11 = r9.m()
            d6.a.i(r10, r11)
        L_0x00de:
            return
        L_0x00df:
            o5.j r10 = o5.j.a()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.e.t(boolean, int):void");
    }

    private static boolean u(d dVar, d dVar2) {
        int a10 = (dVar.a() + (dVar2.a() * 16)) % 79;
        int c10 = (dVar.d().c() * 9) + dVar2.d().c();
        if (c10 > 72) {
            c10--;
        }
        if (c10 > 8) {
            c10--;
        }
        return a10 == c10;
    }

    private static n v(d dVar, d dVar2) {
        String valueOf = String.valueOf((((long) dVar.b()) * 4537077) + ((long) dVar2.b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int charAt = sb.charAt(i11) - '0';
            if ((i11 & 1) == 0) {
                charAt *= 3;
            }
            i10 += charAt;
        }
        int i12 = 10 - (i10 % 10);
        if (i12 == 10) {
            i12 = 0;
        }
        sb.append(i12);
        p[] a10 = dVar.d().a();
        p[] a11 = dVar2.d().a();
        n nVar = new n(sb.toString(), (byte[]) null, new p[]{a10[0], a10[1], a11[0], a11[1]}, a.RSS_14);
        nVar.h(o.SYMBOLOGY_IDENTIFIER, "]e0");
        return nVar;
    }

    private b w(u5.a aVar, c cVar, boolean z9) {
        int[] j10 = j();
        Arrays.fill(j10, 0);
        int[] b10 = cVar.b();
        if (z9) {
            k.h(aVar, b10[0], j10);
        } else {
            k.g(aVar, b10[1], j10);
            int i10 = 0;
            for (int length = j10.length - 1; i10 < length; length--) {
                int i11 = j10[i10];
                j10[i10] = j10[length];
                j10[length] = i11;
                i10++;
            }
        }
        int i12 = z9 ? 16 : 15;
        float d10 = ((float) v5.a.d(j10)) / ((float) i12);
        int[] n10 = n();
        int[] l10 = l();
        float[] o10 = o();
        float[] m10 = m();
        for (int i13 = 0; i13 < j10.length; i13++) {
            float f10 = ((float) j10[i13]) / d10;
            int i14 = (int) (0.5f + f10);
            if (i14 < 1) {
                i14 = 1;
            } else if (i14 > 8) {
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                n10[i15] = i14;
                o10[i15] = f10 - ((float) i14);
            } else {
                l10[i15] = i14;
                m10[i15] = f10 - ((float) i14);
            }
        }
        t(z9, i12);
        int i16 = 0;
        int i17 = 0;
        for (int length2 = n10.length - 1; length2 >= 0; length2--) {
            i16 = (i16 * 9) + n10[length2];
            i17 += n10[length2];
        }
        int i18 = 0;
        int i19 = 0;
        for (int length3 = l10.length - 1; length3 >= 0; length3--) {
            i18 = (i18 * 9) + l10[length3];
            i19 += l10[length3];
        }
        int i20 = i16 + (i18 * 3);
        if (z9) {
            if ((i17 & 1) != 0 || i17 > 12 || i17 < 4) {
                throw o5.j.a();
            }
            int i21 = (12 - i17) / 2;
            int i22 = f8215m[i21];
            return new b((f.b(n10, i22, false) * f8211i[i21]) + f.b(l10, 9 - i22, true) + f8213k[i21], i20);
        } else if ((i19 & 1) != 0 || i19 > 10 || i19 < 4) {
            throw o5.j.a();
        } else {
            int i23 = (10 - i19) / 2;
            int i24 = f8216n[i23];
            return new b((f.b(l10, 9 - i24, false) * f8212j[i23]) + f.b(n10, i24, true) + f8214l[i23], i20);
        }
    }

    private d x(u5.a aVar, boolean z9, int i10, Map<o5.e, ?> map) {
        try {
            c z10 = z(aVar, i10, z9, y(aVar, z9));
            q qVar = map == null ? null : (q) map.get(o5.e.NEED_RESULT_POINT_CALLBACK);
            if (qVar != null) {
                int[] b10 = z10.b();
                float f10 = ((float) ((b10[0] + b10[1]) - 1)) / 2.0f;
                if (z9) {
                    f10 = ((float) (aVar.k() - 1)) - f10;
                }
                qVar.a(new p(f10, (float) i10));
            }
            b w9 = w(aVar, z10, true);
            b w10 = w(aVar, z10, false);
            return new d((w9.b() * 1597) + w10.b(), w9.a() + (w10.a() * 4), z10);
        } catch (o5.j unused) {
            return null;
        }
    }

    private int[] y(u5.a aVar, boolean z9) {
        int[] k10 = k();
        k10[0] = 0;
        k10[1] = 0;
        k10[2] = 0;
        k10[3] = 0;
        int k11 = aVar.k();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < k11) {
            z10 = !aVar.e(i10);
            if (z9 == z10) {
                break;
            }
            i10++;
        }
        int i11 = i10;
        int i12 = 0;
        while (i10 < k11) {
            if (aVar.e(i10) != z10) {
                k10[i12] = k10[i12] + 1;
            } else {
                if (i12 != 3) {
                    i12++;
                } else if (a.q(k10)) {
                    return new int[]{i11, i10};
                } else {
                    i11 += k10[0] + k10[1];
                    k10[0] = k10[2];
                    k10[1] = k10[3];
                    k10[2] = 0;
                    k10[3] = 0;
                    i12--;
                }
                k10[i12] = 1;
                z10 = !z10;
            }
            i10++;
        }
        throw o5.j.a();
    }

    private c z(u5.a aVar, int i10, boolean z9, int[] iArr) {
        int i11;
        int i12;
        boolean e10 = aVar.e(iArr[0]);
        int i13 = iArr[0] - 1;
        while (i13 >= 0 && e10 != aVar.e(i13)) {
            i13--;
        }
        int i14 = i13 + 1;
        int[] k10 = k();
        System.arraycopy(k10, 0, k10, 1, k10.length - 1);
        k10[0] = iArr[0] - i14;
        int r9 = a.r(k10, f8217o);
        int i15 = iArr[1];
        if (z9) {
            i11 = (aVar.k() - 1) - i15;
            i12 = (aVar.k() - 1) - i14;
        } else {
            i11 = i15;
            i12 = i14;
        }
        return new c(r9, new int[]{i14, iArr[1]}, i12, i11, i10);
    }

    public n a(int i10, u5.a aVar, Map<o5.e, ?> map) {
        s(this.f8218g, x(aVar, false, i10, map));
        aVar.q();
        s(this.f8219h, x(aVar, true, i10, map));
        aVar.q();
        for (d next : this.f8218g) {
            if (next.c() > 1) {
                for (d next2 : this.f8219h) {
                    if (next2.c() > 1 && u(next, next2)) {
                        return v(next, next2);
                    }
                }
                continue;
            }
        }
        throw o5.j.a();
    }

    public void c() {
        this.f8218g.clear();
        this.f8219h.clear();
    }
}
