package j6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o5.c;
import o5.e;
import o5.p;
import u5.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f10808a = {0, 4, 1, 5};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f10809b = {6, 2, 7, 3};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f10810c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f10811d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private static void a(p[] pVarArr, p[] pVarArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            pVarArr[iArr[i10]] = pVarArr2[i10];
        }
    }

    public static b b(c cVar, Map<e, ?> map, boolean z9) {
        b a10 = cVar.a();
        List<p[]> c10 = c(z9, a10);
        int i10 = 0;
        while (c10.isEmpty() && i10 < 3) {
            a10 = a10.clone();
            if (i10 != 1) {
                a10.s();
            } else {
                a10.t();
            }
            c10 = c(z9, a10);
            i10++;
        }
        return new b(a10, c10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r4.hasNext() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r5 = (o5.p[]) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r5[1] == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r3 = (int) java.lang.Math.max((float) r3, r5[1].d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r5[3] == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r4 = r0.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<o5.p[]> c(boolean r8, u5.b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0008:
            r4 = 0
            r5 = 0
        L_0x000a:
            int r6 = r9.n()
            if (r3 >= r6) goto L_0x007a
            o5.p[] r4 = f(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L_0x0053
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L_0x0053
            if (r5 != 0) goto L_0x0020
            goto L_0x007a
        L_0x0020:
            java.util.Iterator r4 = r0.iterator()
        L_0x0024:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0050
            java.lang.Object r5 = r4.next()
            o5.p[] r5 = (o5.p[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L_0x0040
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.d()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L_0x0040:
            r7 = r5[r6]
            if (r7 == 0) goto L_0x0024
            r5 = r5[r6]
            float r5 = r5.d()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x0024
        L_0x0050:
            int r3 = r3 + 5
            goto L_0x0008
        L_0x0053:
            r0.add(r4)
            if (r8 != 0) goto L_0x0059
            goto L_0x007a
        L_0x0059:
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L_0x0068
            r5 = r4[r3]
            float r5 = r5.c()
            int r5 = (int) r5
            r3 = r4[r3]
            goto L_0x0072
        L_0x0068:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.c()
            int r5 = (int) r5
            r3 = r4[r3]
        L_0x0072:
            float r3 = r3.d()
            int r3 = (int) r3
            r4 = r5
            r5 = 1
            goto L_0x000a
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.a.c(boolean, u5.b):java.util.List");
    }

    private static int[] d(b bVar, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (bVar.h(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        int i15 = i10;
        int i16 = 0;
        boolean z9 = false;
        while (i10 < i12) {
            if (bVar.h(i10, i11) != z9) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else if (g(iArr2, iArr) < 0.42f) {
                    return new int[]{i15, i10};
                } else {
                    i15 += iArr2[0] + iArr2[1];
                    int i17 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i16] = 0;
                    i16--;
                }
                iArr2[i16] = 1;
                z9 = !z9;
            }
            i10++;
        }
        if (i16 != length - 1 || g(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i15, i10 - 1};
    }

    private static p[] e(b bVar, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z9;
        int i14;
        int i15;
        int i16 = i10;
        p[] pVarArr = new p[4];
        int[] iArr2 = new int[iArr.length];
        int i17 = i12;
        while (true) {
            if (i17 >= i16) {
                z9 = false;
                break;
            }
            int[] d10 = d(bVar, i13, i17, i11, iArr, iArr2);
            if (d10 != null) {
                int i18 = i17;
                int[] iArr3 = d10;
                int i19 = i18;
                while (true) {
                    if (i19 <= 0) {
                        i15 = i19;
                        break;
                    }
                    int i20 = i19 - 1;
                    int[] d11 = d(bVar, i13, i20, i11, iArr, iArr2);
                    if (d11 == null) {
                        i15 = i20 + 1;
                        break;
                    }
                    iArr3 = d11;
                    i19 = i20;
                }
                float f10 = (float) i15;
                pVarArr[0] = new p((float) iArr3[0], f10);
                pVarArr[1] = new p((float) iArr3[1], f10);
                i17 = i15;
                z9 = true;
            } else {
                i17 += 5;
            }
        }
        int i21 = i17 + 1;
        if (z9) {
            int[] iArr4 = {(int) pVarArr[0].c(), (int) pVarArr[1].c()};
            int i22 = i21;
            int i23 = 0;
            while (true) {
                if (i22 >= i16) {
                    i14 = i23;
                    break;
                }
                i14 = i23;
                int[] d12 = d(bVar, iArr4[0], i22, i11, iArr, iArr2);
                if (d12 != null && Math.abs(iArr4[0] - d12[0]) < 5 && Math.abs(iArr4[1] - d12[1]) < 5) {
                    iArr4 = d12;
                    i23 = 0;
                } else if (i14 > 25) {
                    break;
                } else {
                    i23 = i14 + 1;
                }
                i22++;
            }
            i21 = i22 - (i14 + 1);
            float f11 = (float) i21;
            pVarArr[2] = new p((float) iArr4[0], f11);
            pVarArr[3] = new p((float) iArr4[1], f11);
        }
        if (i21 - i17 < 10) {
            Arrays.fill(pVarArr, (Object) null);
        }
        return pVarArr;
    }

    private static p[] f(b bVar, int i10, int i11) {
        int n10 = bVar.n();
        int r9 = bVar.r();
        p[] pVarArr = new p[8];
        a(pVarArr, e(bVar, n10, r9, i10, i11, f10810c), f10808a);
        if (pVarArr[4] != null) {
            i11 = (int) pVarArr[4].c();
            i10 = (int) pVarArr[4].d();
        }
        a(pVarArr, e(bVar, n10, r9, i10, i11, f10811d), f10809b);
        return pVarArr;
    }

    private static float g(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = (float) i10;
        float f11 = f10 / ((float) i11);
        float f12 = 0.8f * f11;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f14 = ((float) iArr2[i13]) * f11;
            float f15 = (float) i14;
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }
}
