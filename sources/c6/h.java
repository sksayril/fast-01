package c6;

import java.util.Map;
import o5.e;
import o5.f;
import o5.j;
import o5.n;
import o5.o;
import o5.p;
import u5.a;

public final class h extends k {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f3830b = {6, 8, 10, 12, 14};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f3831c = {1, 1, 1, 1};

    /* renamed from: d  reason: collision with root package name */
    private static final int[][] f3832d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e  reason: collision with root package name */
    private static final int[][] f3833e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a  reason: collision with root package name */
    private int f3834a = -1;

    private static int i(int[] iArr) {
        int length = f3833e.length;
        float f10 = 0.38f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = k.f(iArr, f3833e[i11], 0.5f);
            if (f11 < f10) {
                i10 = i11;
                f10 = f11;
            } else if (f11 == f10) {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            return i10 % 10;
        }
        throw j.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = m(r7, r0, f3832d[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] j(u5.a r7) {
        /*
            r6 = this;
            r7.q()
            int r0 = n(r7)     // Catch:{ all -> 0x0035 }
            r1 = 1
            r2 = 0
            int[][] r3 = f3832d     // Catch:{ j -> 0x0012 }
            r3 = r3[r2]     // Catch:{ j -> 0x0012 }
            int[] r0 = m(r7, r0, r3)     // Catch:{ j -> 0x0012 }
            goto L_0x001a
        L_0x0012:
            int[][] r3 = f3832d     // Catch:{ all -> 0x0035 }
            r3 = r3[r1]     // Catch:{ all -> 0x0035 }
            int[] r0 = m(r7, r0, r3)     // Catch:{ all -> 0x0035 }
        L_0x001a:
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            r6.o(r7, r3)     // Catch:{ all -> 0x0035 }
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            int r4 = r7.k()     // Catch:{ all -> 0x0035 }
            r5 = r0[r1]     // Catch:{ all -> 0x0035 }
            int r4 = r4 - r5
            r0[r2] = r4     // Catch:{ all -> 0x0035 }
            int r2 = r7.k()     // Catch:{ all -> 0x0035 }
            int r2 = r2 - r3
            r0[r1] = r2     // Catch:{ all -> 0x0035 }
            r7.q()
            return r0
        L_0x0035:
            r0 = move-exception
            r7.q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.h.j(u5.a):int[]");
    }

    private static void k(a aVar, int i10, int i11, StringBuilder sb) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i10 < i11) {
            k.g(aVar, i10, iArr);
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = i12 * 2;
                iArr2[i12] = iArr[i13];
                iArr3[i12] = iArr[i13 + 1];
            }
            sb.append((char) (i(iArr2) + 48));
            sb.append((char) (i(iArr3) + 48));
            for (int i14 = 0; i14 < 10; i14++) {
                i10 += iArr[i14];
            }
        }
    }

    private int[] l(a aVar) {
        int[] m10 = m(aVar, n(aVar), f3831c);
        this.f3834a = (m10[1] - m10[0]) / 4;
        o(aVar, m10[0]);
        return m10;
    }

    private static int[] m(a aVar, int i10, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int k10 = aVar.k();
        int i11 = i10;
        boolean z9 = false;
        int i12 = 0;
        while (i10 < k10) {
            if (aVar.e(i10) != z9) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else if (k.f(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i11, i10};
                } else {
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z9 = !z9;
            }
            i10++;
        }
        throw j.a();
    }

    private static int n(a aVar) {
        int k10 = aVar.k();
        int h10 = aVar.h(0);
        if (h10 != k10) {
            return h10;
        }
        throw j.a();
    }

    private void o(a aVar, int i10) {
        int min = Math.min(this.f3834a * 10, i10);
        int i11 = i10 - 1;
        while (min > 0 && i11 >= 0 && !aVar.e(i11)) {
            min--;
            i11--;
        }
        if (min != 0) {
            throw j.a();
        }
    }

    public n a(int i10, a aVar, Map<e, ?> map) {
        boolean z9;
        int[] l10 = l(aVar);
        int[] j10 = j(aVar);
        StringBuilder sb = new StringBuilder(20);
        k(aVar, l10[1], j10[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f3830b;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= length2) {
                z9 = false;
                break;
            }
            int i13 = iArr[i11];
            if (length == i13) {
                z9 = true;
                break;
            }
            if (i13 > i12) {
                i12 = i13;
            }
            i11++;
        }
        if (!z9 && length > i12) {
            z9 = true;
        }
        if (z9) {
            float f10 = (float) i10;
            n nVar = new n(sb2, (byte[]) null, new p[]{new p((float) l10[1], f10), new p((float) j10[0], f10)}, o5.a.ITF);
            nVar.h(o.SYMBOLOGY_IDENTIFIER, "]I0");
            return nVar;
        }
        throw f.a();
    }
}
