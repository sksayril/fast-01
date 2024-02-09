package l6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import o5.p;
import o5.q;

public class e {

    /* renamed from: f  reason: collision with root package name */
    private static final b f11167f = new b();

    /* renamed from: a  reason: collision with root package name */
    private final u5.b f11168a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f11169b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f11170c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f11171d = new int[5];

    /* renamed from: e  reason: collision with root package name */
    private final q f11172e;

    private static final class b implements Comparator<d>, Serializable {
        private b() {
        }

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return Float.compare(dVar.i(), dVar2.i());
        }
    }

    public e(u5.b bVar, q qVar) {
        this.f11168a = bVar;
        this.f11172e = qVar;
    }

    private static float a(int[] iArr, int i10) {
        return ((float) ((i10 - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    private boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] k10 = k();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.f11168a.h(i11 - i15, i10 - i15)) {
            k10[2] = k10[2] + 1;
            i15++;
        }
        if (k10[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.f11168a.h(i11 - i15, i10 - i15)) {
            k10[1] = k10[1] + 1;
            i15++;
        }
        if (k10[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.f11168a.h(i11 - i15, i10 - i15)) {
            k10[0] = k10[0] + 1;
            i15++;
        }
        if (k10[0] == 0) {
            return false;
        }
        int n10 = this.f11168a.n();
        int r9 = this.f11168a.r();
        int i16 = 1;
        while (true) {
            int i17 = i10 + i16;
            if (i17 < n10 && (i14 = i11 + i16) < r9 && this.f11168a.h(i14, i17)) {
                k10[2] = k10[2] + 1;
                i16++;
            }
        }
        while (true) {
            int i18 = i10 + i16;
            if (i18 < n10 && (i13 = i11 + i16) < r9 && !this.f11168a.h(i13, i18)) {
                k10[3] = k10[3] + 1;
                i16++;
            }
        }
        if (k10[3] == 0) {
            return false;
        }
        while (true) {
            int i19 = i10 + i16;
            if (i19 < n10 && (i12 = i11 + i16) < r9 && this.f11168a.h(i12, i19)) {
                k10[4] = k10[4] + 1;
                i16++;
            }
        }
        if (k10[4] == 0) {
            return false;
        }
        return j(k10);
    }

    private float c(int i10, int i11, int i12, int i13) {
        u5.b bVar = this.f11168a;
        int r9 = bVar.r();
        int[] k10 = k();
        int i14 = i10;
        while (i14 >= 0 && bVar.h(i14, i11)) {
            k10[2] = k10[2] + 1;
            i14--;
        }
        if (i14 < 0) {
            return Float.NaN;
        }
        while (i14 >= 0 && !bVar.h(i14, i11) && k10[1] <= i12) {
            k10[1] = k10[1] + 1;
            i14--;
        }
        if (i14 < 0 || k10[1] > i12) {
            return Float.NaN;
        }
        while (i14 >= 0 && bVar.h(i14, i11) && k10[0] <= i12) {
            k10[0] = k10[0] + 1;
            i14--;
        }
        if (k10[0] > i12) {
            return Float.NaN;
        }
        int i15 = i10 + 1;
        while (i15 < r9 && bVar.h(i15, i11)) {
            k10[2] = k10[2] + 1;
            i15++;
        }
        if (i15 == r9) {
            return Float.NaN;
        }
        while (i15 < r9 && !bVar.h(i15, i11) && k10[3] < i12) {
            k10[3] = k10[3] + 1;
            i15++;
        }
        if (i15 == r9 || k10[3] >= i12) {
            return Float.NaN;
        }
        while (i15 < r9 && bVar.h(i15, i11) && k10[4] < i12) {
            k10[4] = k10[4] + 1;
            i15++;
        }
        if (k10[4] < i12 && Math.abs(((((k10[0] + k10[1]) + k10[2]) + k10[3]) + k10[4]) - i13) * 5 < i13 && i(k10)) {
            return a(k10, i15);
        }
        return Float.NaN;
    }

    private float d(int i10, int i11, int i12, int i13) {
        u5.b bVar = this.f11168a;
        int n10 = bVar.n();
        int[] k10 = k();
        int i14 = i10;
        while (i14 >= 0 && bVar.h(i11, i14)) {
            k10[2] = k10[2] + 1;
            i14--;
        }
        if (i14 < 0) {
            return Float.NaN;
        }
        while (i14 >= 0 && !bVar.h(i11, i14) && k10[1] <= i12) {
            k10[1] = k10[1] + 1;
            i14--;
        }
        if (i14 < 0 || k10[1] > i12) {
            return Float.NaN;
        }
        while (i14 >= 0 && bVar.h(i11, i14) && k10[0] <= i12) {
            k10[0] = k10[0] + 1;
            i14--;
        }
        if (k10[0] > i12) {
            return Float.NaN;
        }
        int i15 = i10 + 1;
        while (i15 < n10 && bVar.h(i11, i15)) {
            k10[2] = k10[2] + 1;
            i15++;
        }
        if (i15 == n10) {
            return Float.NaN;
        }
        while (i15 < n10 && !bVar.h(i11, i15) && k10[3] < i12) {
            k10[3] = k10[3] + 1;
            i15++;
        }
        if (i15 == n10 || k10[3] >= i12) {
            return Float.NaN;
        }
        while (i15 < n10 && bVar.h(i11, i15) && k10[4] < i12) {
            k10[4] = k10[4] + 1;
            i15++;
        }
        if (k10[4] < i12 && Math.abs(((((k10[0] + k10[1]) + k10[2]) + k10[3]) + k10[4]) - i13) * 5 < i13 * 2 && i(k10)) {
            return a(k10, i15);
        }
        return Float.NaN;
    }

    protected static void e(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    protected static void f(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    private int h() {
        if (this.f11169b.size() <= 1) {
            return 0;
        }
        d dVar = null;
        for (d next : this.f11169b) {
            if (next.h() >= 2) {
                if (dVar == null) {
                    dVar = next;
                } else {
                    this.f11170c = true;
                    return ((int) (Math.abs(dVar.c() - next.c()) - Math.abs(dVar.d() - next.d()))) / 2;
                }
            }
        }
        return 0;
    }

    protected static boolean i(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = ((float) i10) / 7.0f;
        float f11 = f10 / 2.0f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    protected static boolean j(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = ((float) i10) / 7.0f;
        float f11 = f10 / 1.333f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    private int[] k() {
        e(this.f11171d);
        return this.f11171d;
    }

    private boolean m() {
        int size = this.f11169b.size();
        float f10 = 0.0f;
        int i10 = 0;
        float f11 = 0.0f;
        for (d next : this.f11169b) {
            if (next.h() >= 2) {
                i10++;
                f11 += next.i();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f12 = f11 / ((float) size);
        for (d i11 : this.f11169b) {
            f10 += Math.abs(i11.i() - f12);
        }
        return f10 <= f11 * 0.05f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private l6.d[] n() {
        /*
            r26 = this;
            r0 = r26
            java.util.List<l6.d> r1 = r0.f11169b
            int r1 = r1.size()
            r2 = 3
            if (r1 < r2) goto L_0x00d8
            java.util.List<l6.d> r1 = r0.f11169b
            l6.e$b r3 = f11167f
            r1.sort(r3)
            l6.d[] r1 = new l6.d[r2]
            r2 = 0
            r5 = 0
            r6 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x001b:
            java.util.List<l6.d> r8 = r0.f11169b
            int r8 = r8.size()
            r9 = 2
            int r8 = r8 - r9
            if (r5 >= r8) goto L_0x00c9
            java.util.List<l6.d> r8 = r0.f11169b
            java.lang.Object r8 = r8.get(r5)
            l6.d r8 = (l6.d) r8
            float r10 = r8.i()
            int r5 = r5 + 1
            r11 = r5
        L_0x0034:
            java.util.List<l6.d> r12 = r0.f11169b
            int r12 = r12.size()
            r13 = 1
            int r12 = r12 - r13
            if (r11 >= r12) goto L_0x001b
            java.util.List<l6.d> r12 = r0.f11169b
            java.lang.Object r12 = r12.get(r11)
            l6.d r12 = (l6.d) r12
            double r14 = o(r8, r12)
            int r11 = r11 + 1
            r3 = r11
        L_0x004d:
            java.util.List<l6.d> r4 = r0.f11169b
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x0034
            java.util.List<l6.d> r4 = r0.f11169b
            java.lang.Object r4 = r4.get(r3)
            l6.d r4 = (l6.d) r4
            float r16 = r4.i()
            r17 = 1068708659(0x3fb33333, float:1.4)
            float r17 = r17 * r10
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 <= 0) goto L_0x006b
            goto L_0x00c6
        L_0x006b:
            double r16 = o(r12, r4)
            double r18 = o(r8, r4)
            int r20 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r20 >= 0) goto L_0x008e
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 <= 0) goto L_0x0085
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x0082
            r20 = r14
            goto L_0x00a6
        L_0x0082:
            r20 = r18
            goto L_0x009a
        L_0x0085:
            r20 = r14
            r24 = r16
            r16 = r18
            r18 = r24
            goto L_0x00a6
        L_0x008e:
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x00a0
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x009d
            r20 = r16
            r16 = r18
        L_0x009a:
            r18 = r14
            goto L_0x00a6
        L_0x009d:
            r20 = r16
            goto L_0x00a4
        L_0x00a0:
            r20 = r18
            r18 = r16
        L_0x00a4:
            r16 = r14
        L_0x00a6:
            r22 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r18 * r22
            double r18 = r16 - r18
            double r18 = java.lang.Math.abs(r18)
            double r20 = r20 * r22
            double r16 = r16 - r20
            double r16 = java.lang.Math.abs(r16)
            double r18 = r18 + r16
            int r16 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x00c6
            r1[r2] = r8
            r1[r13] = r12
            r1[r9] = r4
            r6 = r18
        L_0x00c6:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x00c9:
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00d3
            return r1
        L_0x00d3:
            o5.j r1 = o5.j.a()
            throw r1
        L_0x00d8:
            o5.j r1 = o5.j.a()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.e.n():l6.d[]");
    }

    private static double o(d dVar, d dVar2) {
        double c10 = (double) (dVar.c() - dVar2.c());
        double d10 = (double) (dVar.d() - dVar2.d());
        return (c10 * c10) + (d10 * d10);
    }

    /* access modifiers changed from: package-private */
    public final f g(Map<o5.e, ?> map) {
        boolean z9 = map != null && map.containsKey(o5.e.TRY_HARDER);
        int n10 = this.f11168a.n();
        int r9 = this.f11168a.r();
        int i10 = (n10 * 3) / 388;
        if (i10 < 3 || z9) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        int i11 = i10 - 1;
        boolean z10 = false;
        while (i11 < n10 && !z10) {
            e(iArr);
            int i12 = 0;
            int i13 = 0;
            while (i12 < r9) {
                if (this.f11168a.h(i12, i11)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 != 4) {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                } else if (!i(iArr) || !l(iArr, i11, i12)) {
                    f(iArr);
                    i13 = 3;
                } else {
                    if (this.f11170c) {
                        z10 = m();
                    } else {
                        int h10 = h();
                        if (h10 > iArr[2]) {
                            i11 += (h10 - iArr[2]) - 2;
                            i12 = r9 - 1;
                        }
                    }
                    e(iArr);
                    i10 = 2;
                    i13 = 0;
                }
                i12++;
            }
            if (i(iArr) && l(iArr, i11, r9)) {
                i10 = iArr[0];
                if (this.f11170c) {
                    z10 = m();
                }
            }
            i11 += i10;
        }
        d[] n11 = n();
        p.e(n11);
        return new f(n11);
    }

    /* access modifiers changed from: protected */
    public final boolean l(int[] iArr, int i10, int i11) {
        boolean z9 = false;
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a10 = (int) a(iArr, i11);
        float d10 = d(i10, a10, iArr[2], i12);
        if (!Float.isNaN(d10)) {
            int i13 = (int) d10;
            float c10 = c(a10, i13, iArr[2], i12);
            if (!Float.isNaN(c10) && b(i13, (int) c10)) {
                float f10 = ((float) i12) / 7.0f;
                int i14 = 0;
                while (true) {
                    if (i14 >= this.f11169b.size()) {
                        break;
                    }
                    d dVar = this.f11169b.get(i14);
                    if (dVar.f(f10, d10, c10)) {
                        this.f11169b.set(i14, dVar.g(d10, c10, f10));
                        z9 = true;
                        break;
                    }
                    i14++;
                }
                if (!z9) {
                    d dVar2 = new d(c10, d10, f10);
                    this.f11169b.add(dVar2);
                    q qVar = this.f11172e;
                    if (qVar != null) {
                        qVar.a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
