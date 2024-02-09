package c6;

import o5.j;

public final class a extends k {

    /* renamed from: d  reason: collision with root package name */
    static final char[] f3808d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e  reason: collision with root package name */
    static final int[] f3809e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f  reason: collision with root package name */
    private static final char[] f3810f = {'A', 'B', 'C', 'D'};

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f3811a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    private int[] f3812b = new int[80];

    /* renamed from: c  reason: collision with root package name */
    private int f3813c = 0;

    static boolean i(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    private void j(int i10) {
        int[] iArr = this.f3812b;
        int i11 = this.f3813c;
        iArr[i11] = i10;
        int i12 = i11 + 1;
        this.f3813c = i12;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[(i12 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f3812b = iArr2;
        }
    }

    private int k() {
        for (int i10 = 1; i10 < this.f3813c; i10 += 2) {
            int m10 = m(i10);
            if (m10 != -1 && i(f3810f, f3808d[m10])) {
                int i11 = 0;
                for (int i12 = i10; i12 < i10 + 7; i12++) {
                    i11 += this.f3812b[i12];
                }
                if (i10 == 1 || this.f3812b[i10 - 1] >= i11 / 2) {
                    return i10;
                }
            }
        }
        throw j.a();
    }

    private void l(u5.a aVar) {
        int i10 = 0;
        this.f3813c = 0;
        int i11 = aVar.i(0);
        int k10 = aVar.k();
        if (i11 < k10) {
            boolean z9 = true;
            while (i11 < k10) {
                if (aVar.e(i11) != z9) {
                    i10++;
                } else {
                    j(i10);
                    z9 = !z9;
                    i10 = 1;
                }
                i11++;
            }
            j(i10);
            return;
        }
        throw j.a();
    }

    private int m(int i10) {
        int i11 = i10 + 7;
        if (i11 >= this.f3813c) {
            return -1;
        }
        int[] iArr = this.f3812b;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = 0;
        for (int i16 = i10; i16 < i11; i16 += 2) {
            int i17 = iArr[i16];
            if (i17 < i14) {
                i14 = i17;
            }
            if (i17 > i15) {
                i15 = i17;
            }
        }
        int i18 = (i14 + i15) / 2;
        int i19 = 0;
        for (int i20 = i10 + 1; i20 < i11; i20 += 2) {
            int i21 = iArr[i20];
            if (i21 < i12) {
                i12 = i21;
            }
            if (i21 > i19) {
                i19 = i21;
            }
        }
        int i22 = (i12 + i19) / 2;
        int i23 = 128;
        int i24 = 0;
        for (int i25 = 0; i25 < 7; i25++) {
            i23 >>= 1;
            if (iArr[i10 + i25] > ((i25 & 1) == 0 ? i18 : i22)) {
                i24 |= i23;
            }
        }
        while (true) {
            int[] iArr2 = f3809e;
            if (i13 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i13] == i24) {
                return i13;
            }
            i13++;
        }
    }

    private void n(int i10) {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f3811a.length() - 1;
        int i11 = i10;
        int i12 = 0;
        while (true) {
            if (i12 > length) {
                break;
            }
            int i13 = f3809e[this.f3811a.charAt(i12)];
            for (int i14 = 6; i14 >= 0; i14--) {
                int i15 = (i14 & 1) + ((i13 & 1) * 2);
                iArr[i15] = iArr[i15] + this.f3812b[i11 + i14];
                iArr2[i15] = iArr2[i15] + 1;
                i13 >>= 1;
            }
            i11 += 8;
            i12++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i16 = 0; i16 < 2; i16++) {
            fArr2[i16] = 0.0f;
            int i17 = i16 + 2;
            fArr2[i17] = ((((float) iArr[i16]) / ((float) iArr2[i16])) + (((float) iArr[i17]) / ((float) iArr2[i17]))) / 2.0f;
            fArr[i16] = fArr2[i17];
            fArr[i17] = ((((float) iArr[i17]) * 2.0f) + 1.5f) / ((float) iArr2[i17]);
        }
        for (int i18 = 0; i18 <= length; i18++) {
            int i19 = f3809e[this.f3811a.charAt(i18)];
            for (int i20 = 6; i20 >= 0; i20--) {
                int i21 = (i20 & 1) + ((i19 & 1) * 2);
                float f10 = (float) this.f3812b[i10 + i20];
                if (f10 < fArr2[i21] || f10 > fArr[i21]) {
                    throw j.a();
                }
                i19 >>= 1;
            }
            i10 += 8;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0109 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o5.n a(int r11, u5.a r12, java.util.Map<o5.e, ?> r13) {
        /*
            r10 = this;
            int[] r0 = r10.f3812b
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r10.l(r12)
            int r12 = r10.k()
            java.lang.StringBuilder r0 = r10.f3811a
            r0.setLength(r1)
            r0 = r12
        L_0x0013:
            int r2 = r10.m(r0)
            r3 = -1
            if (r2 == r3) goto L_0x0109
            java.lang.StringBuilder r4 = r10.f3811a
            char r5 = (char) r2
            r4.append(r5)
            int r0 = r0 + 8
            java.lang.StringBuilder r4 = r10.f3811a
            int r4 = r4.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0038
            char[] r4 = f3810f
            char[] r6 = f3808d
            char r2 = r6[r2]
            boolean r2 = i(r4, r2)
            if (r2 == 0) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            int r2 = r10.f3813c
            if (r0 < r2) goto L_0x0013
        L_0x003c:
            int[] r2 = r10.f3812b
            int r4 = r0 + -1
            r2 = r2[r4]
            r6 = -8
            r7 = 0
        L_0x0044:
            if (r6 >= r3) goto L_0x0050
            int[] r8 = r10.f3812b
            int r9 = r0 + r6
            r8 = r8[r9]
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0044
        L_0x0050:
            int r3 = r10.f3813c
            r6 = 2
            if (r0 >= r3) goto L_0x005e
            int r7 = r7 / r6
            if (r2 < r7) goto L_0x0059
            goto L_0x005e
        L_0x0059:
            o5.j r11 = o5.j.a()
            throw r11
        L_0x005e:
            r10.n(r12)
            r0 = 0
        L_0x0062:
            java.lang.StringBuilder r2 = r10.f3811a
            int r2 = r2.length()
            if (r0 >= r2) goto L_0x007a
            java.lang.StringBuilder r2 = r10.f3811a
            char[] r3 = f3808d
            char r7 = r2.charAt(r0)
            char r3 = r3[r7]
            r2.setCharAt(r0, r3)
            int r0 = r0 + 1
            goto L_0x0062
        L_0x007a:
            java.lang.StringBuilder r0 = r10.f3811a
            char r0 = r0.charAt(r1)
            char[] r2 = f3810f
            boolean r0 = i(r2, r0)
            if (r0 == 0) goto L_0x0104
            java.lang.StringBuilder r0 = r10.f3811a
            int r3 = r0.length()
            int r3 = r3 - r5
            char r0 = r0.charAt(r3)
            boolean r0 = i(r2, r0)
            if (r0 == 0) goto L_0x00ff
            java.lang.StringBuilder r0 = r10.f3811a
            int r0 = r0.length()
            r2 = 3
            if (r0 <= r2) goto L_0x00fa
            if (r13 == 0) goto L_0x00ac
            o5.e r0 = o5.e.RETURN_CODABAR_START_END
            boolean r13 = r13.containsKey(r0)
            if (r13 != 0) goto L_0x00bb
        L_0x00ac:
            java.lang.StringBuilder r13 = r10.f3811a
            int r0 = r13.length()
            int r0 = r0 - r5
            r13.deleteCharAt(r0)
            java.lang.StringBuilder r13 = r10.f3811a
            r13.deleteCharAt(r1)
        L_0x00bb:
            r13 = 0
            r0 = 0
        L_0x00bd:
            if (r13 >= r12) goto L_0x00c7
            int[] r2 = r10.f3812b
            r2 = r2[r13]
            int r0 = r0 + r2
            int r13 = r13 + 1
            goto L_0x00bd
        L_0x00c7:
            float r13 = (float) r0
        L_0x00c8:
            if (r12 >= r4) goto L_0x00d2
            int[] r2 = r10.f3812b
            r2 = r2[r12]
            int r0 = r0 + r2
            int r12 = r12 + 1
            goto L_0x00c8
        L_0x00d2:
            float r12 = (float) r0
            o5.n r0 = new o5.n
            java.lang.StringBuilder r2 = r10.f3811a
            java.lang.String r2 = r2.toString()
            r3 = 0
            o5.p[] r4 = new o5.p[r6]
            o5.p r6 = new o5.p
            float r11 = (float) r11
            r6.<init>(r13, r11)
            r4[r1] = r6
            o5.p r13 = new o5.p
            r13.<init>(r12, r11)
            r4[r5] = r13
            o5.a r11 = o5.a.CODABAR
            r0.<init>(r2, r3, r4, r11)
            o5.o r11 = o5.o.SYMBOLOGY_IDENTIFIER
            java.lang.String r12 = "]F0"
            r0.h(r11, r12)
            return r0
        L_0x00fa:
            o5.j r11 = o5.j.a()
            throw r11
        L_0x00ff:
            o5.j r11 = o5.j.a()
            throw r11
        L_0x0104:
            o5.j r11 = o5.j.a()
            throw r11
        L_0x0109:
            o5.j r11 = o5.j.a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.a.a(int, u5.a, java.util.Map):o5.n");
    }
}
