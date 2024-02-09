package c6;

import java.util.Arrays;
import java.util.Map;
import o5.c;
import o5.e;
import o5.j;
import o5.l;
import o5.n;
import o5.o;
import o5.p;
import u5.a;

public abstract class k implements l {
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d A[Catch:{ m -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o5.n b(o5.c r22, java.util.Map<o5.e, ?> r23) {
        /*
            r21 = this;
            r0 = r23
            int r1 = r22.d()
            int r2 = r22.c()
            u5.a r3 = new u5.a
            r3.<init>(r1)
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x001d
            o5.e r6 = o5.e.TRY_HARDER
            boolean r6 = r0.containsKey(r6)
            if (r6 == 0) goto L_0x001d
            r6 = 1
            goto L_0x001e
        L_0x001d:
            r6 = 0
        L_0x001e:
            if (r6 == 0) goto L_0x0023
            r7 = 8
            goto L_0x0024
        L_0x0023:
            r7 = 5
        L_0x0024:
            int r7 = r2 >> r7
            int r7 = java.lang.Math.max(r5, r7)
            if (r6 == 0) goto L_0x002e
            r6 = r2
            goto L_0x0030
        L_0x002e:
            r6 = 15
        L_0x0030:
            int r8 = r2 / 2
            r9 = 0
        L_0x0033:
            if (r9 >= r6) goto L_0x00e1
            int r10 = r9 + 1
            int r11 = r10 / 2
            r9 = r9 & 1
            if (r9 != 0) goto L_0x003f
            r9 = 1
            goto L_0x0040
        L_0x003f:
            r9 = 0
        L_0x0040:
            if (r9 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            int r11 = -r11
        L_0x0044:
            int r11 = r11 * r7
            int r11 = r11 + r8
            if (r11 < 0) goto L_0x00e1
            if (r11 >= r2) goto L_0x00e1
            r9 = r22
            u5.a r3 = r9.b(r11, r3)     // Catch:{ j -> 0x00d5 }
            r12 = 0
        L_0x0052:
            r13 = 2
            if (r12 >= r13) goto L_0x00d5
            if (r12 != r5) goto L_0x0075
            r3.q()
            if (r0 == 0) goto L_0x0075
            o5.e r13 = o5.e.NEED_RESULT_POINT_CALLBACK
            boolean r14 = r0.containsKey(r13)
            if (r14 == 0) goto L_0x0075
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<o5.e> r15 = o5.e.class
            r14.<init>(r15)
            r14.putAll(r0)
            r14.remove(r13)
            r13 = r21
            r0 = r14
            goto L_0x0077
        L_0x0075:
            r13 = r21
        L_0x0077:
            o5.n r14 = r13.a(r11, r3, r0)     // Catch:{ m -> 0x00c6 }
            if (r12 != r5) goto L_0x00c5
            o5.o r15 = o5.o.ORIENTATION     // Catch:{ m -> 0x00c6 }
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ m -> 0x00c6 }
            r14.h(r15, r5)     // Catch:{ m -> 0x00c6 }
            o5.p[] r5 = r14.e()     // Catch:{ m -> 0x00c6 }
            if (r5 == 0) goto L_0x00c5
            o5.p r15 = new o5.p     // Catch:{ m -> 0x00c6 }
            r16 = r0
            float r0 = (float) r1
            r18 = r5[r4]     // Catch:{ m -> 0x00c8 }
            float r18 = r18.c()     // Catch:{ m -> 0x00c8 }
            float r18 = r0 - r18
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = r1
            float r1 = r18 - r19
            r18 = r5[r4]     // Catch:{ m -> 0x00ca }
            float r4 = r18.d()     // Catch:{ m -> 0x00ca }
            r15.<init>(r1, r4)     // Catch:{ m -> 0x00ca }
            r1 = 0
            r5[r1] = r15     // Catch:{ m -> 0x00ca }
            o5.p r4 = new o5.p     // Catch:{ m -> 0x00ca }
            r15 = 1
            r17 = r5[r15]     // Catch:{ m -> 0x00cb }
            float r17 = r17.c()     // Catch:{ m -> 0x00cb }
            float r0 = r0 - r17
            float r0 = r0 - r19
            r17 = r5[r15]     // Catch:{ m -> 0x00cb }
            float r1 = r17.d()     // Catch:{ m -> 0x00cb }
            r4.<init>(r0, r1)     // Catch:{ m -> 0x00cb }
            r5[r15] = r4     // Catch:{ m -> 0x00cb }
        L_0x00c5:
            return r14
        L_0x00c6:
            r16 = r0
        L_0x00c8:
            r20 = r1
        L_0x00ca:
            r15 = 1
        L_0x00cb:
            int r12 = r12 + 1
            r0 = r16
            r1 = r20
            r4 = 0
            r5 = 1
            goto L_0x0052
        L_0x00d5:
            r13 = r21
            r20 = r1
            r15 = 1
            r9 = r10
            r1 = r20
            r4 = 0
            r5 = 1
            goto L_0x0033
        L_0x00e1:
            r13 = r21
            o5.j r0 = o5.j.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.k.b(o5.c, java.util.Map):o5.n");
    }

    protected static float f(int[] iArr, int[] iArr2, float f10) {
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
        float f11 = (float) i10;
        float f12 = f11 / ((float) i11);
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f15 = ((float) iArr2[i13]) * f12;
            float f16 = (float) i14;
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    protected static void g(a aVar, int i10, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int k10 = aVar.k();
        if (i10 < k10) {
            boolean z9 = !aVar.e(i10);
            while (i10 < k10) {
                if (aVar.e(i10) != z9) {
                    iArr[i11] = iArr[i11] + 1;
                } else {
                    i11++;
                    if (i11 == length) {
                        break;
                    }
                    iArr[i11] = 1;
                    z9 = !z9;
                }
                i10++;
            }
            if (i11 == length) {
                return;
            }
            if (i11 != length - 1 || i10 != k10) {
                throw j.a();
            }
            return;
        }
        throw j.a();
    }

    protected static void h(a aVar, int i10, int[] iArr) {
        int length = iArr.length;
        boolean e10 = aVar.e(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (aVar.e(i10) != e10) {
                length--;
                e10 = !e10;
            }
        }
        if (length < 0) {
            g(aVar, i10 + 1, iArr);
            return;
        }
        throw j.a();
    }

    public abstract n a(int i10, a aVar, Map<e, ?> map);

    public void c() {
    }

    public n d(c cVar, Map<e, ?> map) {
        try {
            return b(cVar, map);
        } catch (j e10) {
            if (!(map != null && map.containsKey(e.TRY_HARDER)) || !cVar.e()) {
                throw e10;
            }
            c f10 = cVar.f();
            n b10 = b(f10, map);
            Map<o, Object> d10 = b10.d();
            int i10 = 270;
            if (d10 != null) {
                o oVar = o.ORIENTATION;
                if (d10.containsKey(oVar)) {
                    i10 = (((Integer) d10.get(oVar)).intValue() + 270) % 360;
                }
            }
            b10.h(o.ORIENTATION, Integer.valueOf(i10));
            p[] e11 = b10.e();
            if (e11 != null) {
                int c10 = f10.c();
                for (int i11 = 0; i11 < e11.length; i11++) {
                    e11[i11] = new p((((float) c10) - e11[i11].d()) - 1.0f, e11[i11].c());
                }
            }
            return b10;
        }
    }

    public n e(c cVar) {
        return d(cVar, (Map<e, ?>) null);
    }
}
