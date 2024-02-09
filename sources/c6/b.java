package c6;

import o5.j;
import u5.a;

public final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    static final int[][] f3814a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    private static int i(a aVar, int[] iArr, int i10) {
        k.g(aVar, i10, iArr);
        float f10 = 0.25f;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[][] iArr2 = f3814a;
            if (i12 >= iArr2.length) {
                break;
            }
            float f11 = k.f(iArr, iArr2[i12], 0.7f);
            if (f11 < f10) {
                i11 = i12;
                f10 = f11;
            }
            i12++;
        }
        if (i11 >= 0) {
            return i11;
        }
        throw j.a();
    }

    private static int[] j(a aVar) {
        int k10 = aVar.k();
        int h10 = aVar.h(0);
        int[] iArr = new int[6];
        int i10 = h10;
        boolean z9 = false;
        int i11 = 0;
        while (h10 < k10) {
            if (aVar.e(h10) != z9) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 == 5) {
                    float f10 = 0.25f;
                    int i12 = -1;
                    for (int i13 = 103; i13 <= 105; i13++) {
                        float f11 = k.f(iArr, f3814a[i13], 0.7f);
                        if (f11 < f10) {
                            i12 = i13;
                            f10 = f11;
                        }
                    }
                    if (i12 < 0 || !aVar.n(Math.max(0, i10 - ((h10 - i10) / 2)), i10, false)) {
                        i10 += iArr[0] + iArr[1];
                        int i14 = i11 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i14);
                        iArr[i14] = 0;
                        iArr[i11] = 0;
                        i11--;
                    } else {
                        return new int[]{i10, h10, i12};
                    }
                } else {
                    i11++;
                }
                iArr[i11] = 1;
                z9 = !z9;
            }
            h10++;
        }
        throw j.a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x019e, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01a1, code lost:
        if (r17 == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01a3, code lost:
        if (r14 != 'e') goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01a5, code lost:
        r14 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01a8, code lost:
        r14 = 'e';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01aa, code lost:
        r17 = r10;
        r15 = 6;
        r24 = r12;
        r12 = r8;
        r8 = r20;
        r20 = r18;
        r18 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e0, code lost:
        if (r3 != false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e6, code lost:
        r14 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f3, code lost:
        r13.append((char) r2);
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0105, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0131, code lost:
        r2 = false;
        r3 = false;
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0137, code lost:
        if (r3 != false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0139, code lost:
        r2 = false;
        r3 = false;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x013d, code lost:
        r2 = false;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0140, code lost:
        r2 = false;
        r14 = 'c';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0145, code lost:
        r14 = 'e';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0148, code lost:
        r2 = false;
        r22 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x014c, code lost:
        r2 = false;
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x014f, code lost:
        r10 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o5.n a(int r26, u5.a r27, java.util.Map<o5.e, ?> r28) {
        /*
            r25 = this;
            r0 = r27
            r1 = r28
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            o5.e r4 = o5.e.ASSUME_GS1
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            int[] r4 = j(r27)
            r5 = 2
            r6 = r4[r5]
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 20
            r7.<init>(r8)
            byte r9 = (byte) r6
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            r7.add(r9)
            switch(r6) {
                case 103: goto L_0x0037;
                case 104: goto L_0x0034;
                case 105: goto L_0x0031;
                default: goto L_0x002c;
            }
        L_0x002c:
            o5.f r0 = o5.f.a()
            throw r0
        L_0x0031:
            r12 = 99
            goto L_0x0039
        L_0x0034:
            r12 = 100
            goto L_0x0039
        L_0x0037:
            r12 = 101(0x65, float:1.42E-43)
        L_0x0039:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r8)
            r8 = r4[r3]
            r14 = r4[r2]
            r15 = 6
            int[] r9 = new int[r15]
            r5 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 1
            r22 = 0
            r24 = r12
            r12 = r8
            r8 = r14
            r14 = r24
        L_0x005a:
            if (r16 != 0) goto L_0x01b9
            int r12 = i(r0, r9, r8)
            byte r11 = (byte) r12
            java.lang.Byte r11 = java.lang.Byte.valueOf(r11)
            r7.add(r11)
            r11 = 106(0x6a, float:1.49E-43)
            if (r12 == r11) goto L_0x006e
            r21 = 1
        L_0x006e:
            if (r12 == r11) goto L_0x0076
            int r19 = r19 + 1
            int r20 = r19 * r12
            int r6 = r6 + r20
        L_0x0076:
            r20 = r8
            r10 = 0
        L_0x0079:
            if (r10 >= r15) goto L_0x0082
            r23 = r9[r10]
            int r20 = r20 + r23
            int r10 = r10 + 1
            goto L_0x0079
        L_0x0082:
            switch(r12) {
                case 103: goto L_0x0090;
                case 104: goto L_0x0090;
                case 105: goto L_0x0090;
                default: goto L_0x0085;
            }
        L_0x0085:
            r10 = 96
            java.lang.String r15 = "]C1"
            switch(r14) {
                case 99: goto L_0x0153;
                case 100: goto L_0x00ea;
                case 101: goto L_0x0095;
                default: goto L_0x008c;
            }
        L_0x008c:
            r2 = 100
            goto L_0x019e
        L_0x0090:
            o5.f r0 = o5.f.a()
            throw r0
        L_0x0095:
            r2 = 64
            if (r12 >= r2) goto L_0x00a1
            int r2 = r12 + 32
            if (r3 != r5) goto L_0x009e
            goto L_0x00f3
        L_0x009e:
            int r2 = r2 + 128
            goto L_0x00f3
        L_0x00a1:
            if (r12 >= r10) goto L_0x00ab
            if (r3 != r5) goto L_0x00a8
            int r2 = r12 + -64
            goto L_0x00f3
        L_0x00a8:
            int r2 = r12 + 64
            goto L_0x00f3
        L_0x00ab:
            if (r12 == r11) goto L_0x00af
            r21 = 0
        L_0x00af:
            if (r12 == r11) goto L_0x014c
            switch(r12) {
                case 97: goto L_0x0148;
                case 98: goto L_0x00e5;
                case 99: goto L_0x0140;
                case 100: goto L_0x00e3;
                case 101: goto L_0x00d9;
                case 102: goto L_0x00b5;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            goto L_0x0105
        L_0x00b5:
            int r2 = r13.length()
            if (r2 != 0) goto L_0x00be
            r22 = 1
            goto L_0x00c7
        L_0x00be:
            int r2 = r13.length()
            r10 = 1
            if (r2 != r10) goto L_0x00c7
            r22 = 2
        L_0x00c7:
            if (r1 == 0) goto L_0x0105
            int r2 = r13.length()
            if (r2 != 0) goto L_0x00d3
            r13.append(r15)
            goto L_0x00b4
        L_0x00d3:
            r2 = 29
            r13.append(r2)
            goto L_0x00b4
        L_0x00d9:
            if (r5 != 0) goto L_0x00de
            if (r3 == 0) goto L_0x00de
            goto L_0x0131
        L_0x00de:
            if (r5 == 0) goto L_0x013d
            if (r3 == 0) goto L_0x013d
            goto L_0x0139
        L_0x00e3:
            r2 = 0
            goto L_0x00e6
        L_0x00e5:
            r2 = 1
        L_0x00e6:
            r14 = 100
            goto L_0x014f
        L_0x00ea:
            if (r12 >= r10) goto L_0x00fc
            int r2 = r12 + 32
            if (r3 != r5) goto L_0x00f1
            goto L_0x00f3
        L_0x00f1:
            int r2 = r2 + 128
        L_0x00f3:
            char r2 = (char) r2
            r13.append(r2)
            r2 = 100
            r3 = 0
            goto L_0x019e
        L_0x00fc:
            if (r12 == r11) goto L_0x0100
            r21 = 0
        L_0x0100:
            if (r12 == r11) goto L_0x014c
            switch(r12) {
                case 97: goto L_0x0148;
                case 98: goto L_0x0144;
                case 99: goto L_0x0140;
                case 100: goto L_0x012d;
                case 101: goto L_0x012b;
                case 102: goto L_0x0107;
                default: goto L_0x0105;
            }
        L_0x0105:
            r2 = 0
            goto L_0x014f
        L_0x0107:
            int r2 = r13.length()
            if (r2 != 0) goto L_0x0110
            r22 = 1
            goto L_0x0119
        L_0x0110:
            int r2 = r13.length()
            r10 = 1
            if (r2 != r10) goto L_0x0119
            r22 = 2
        L_0x0119:
            if (r1 == 0) goto L_0x0105
            int r2 = r13.length()
            if (r2 != 0) goto L_0x0125
            r13.append(r15)
            goto L_0x0105
        L_0x0125:
            r2 = 29
            r13.append(r2)
            goto L_0x0105
        L_0x012b:
            r2 = 0
            goto L_0x0145
        L_0x012d:
            if (r5 != 0) goto L_0x0135
            if (r3 == 0) goto L_0x0135
        L_0x0131:
            r2 = 0
            r3 = 0
            r5 = 1
            goto L_0x014f
        L_0x0135:
            if (r5 == 0) goto L_0x013d
            if (r3 == 0) goto L_0x013d
        L_0x0139:
            r2 = 0
            r3 = 0
            r5 = 0
            goto L_0x014f
        L_0x013d:
            r2 = 0
            r3 = 1
            goto L_0x014f
        L_0x0140:
            r2 = 0
            r14 = 99
            goto L_0x014f
        L_0x0144:
            r2 = 1
        L_0x0145:
            r14 = 101(0x65, float:1.42E-43)
            goto L_0x014f
        L_0x0148:
            r2 = 0
            r22 = 4
            goto L_0x014f
        L_0x014c:
            r2 = 0
            r16 = 1
        L_0x014f:
            r10 = r2
            r2 = 100
            goto L_0x019f
        L_0x0153:
            r2 = 100
            if (r12 >= r2) goto L_0x0164
            r10 = 10
            if (r12 >= r10) goto L_0x0160
            r10 = 48
            r13.append(r10)
        L_0x0160:
            r13.append(r12)
            goto L_0x019e
        L_0x0164:
            if (r12 == r11) goto L_0x0168
            r21 = 0
        L_0x0168:
            if (r12 == r11) goto L_0x019a
            switch(r12) {
                case 100: goto L_0x0196;
                case 101: goto L_0x0192;
                case 102: goto L_0x016e;
                default: goto L_0x016d;
            }
        L_0x016d:
            goto L_0x019e
        L_0x016e:
            int r10 = r13.length()
            if (r10 != 0) goto L_0x0177
            r22 = 1
            goto L_0x0180
        L_0x0177:
            int r10 = r13.length()
            r11 = 1
            if (r10 != r11) goto L_0x0180
            r22 = 2
        L_0x0180:
            if (r1 == 0) goto L_0x019e
            int r10 = r13.length()
            if (r10 != 0) goto L_0x018c
            r13.append(r15)
            goto L_0x019e
        L_0x018c:
            r10 = 29
            r13.append(r10)
            goto L_0x019e
        L_0x0192:
            r10 = 0
            r14 = 101(0x65, float:1.42E-43)
            goto L_0x019f
        L_0x0196:
            r10 = 0
            r14 = 100
            goto L_0x019f
        L_0x019a:
            r10 = 0
            r16 = 1
            goto L_0x019f
        L_0x019e:
            r10 = 0
        L_0x019f:
            r11 = 101(0x65, float:1.42E-43)
            if (r17 == 0) goto L_0x01aa
            if (r14 != r11) goto L_0x01a8
            r14 = 100
            goto L_0x01aa
        L_0x01a8:
            r14 = 101(0x65, float:1.42E-43)
        L_0x01aa:
            r17 = r10
            r2 = 1
            r15 = 6
            r24 = r12
            r12 = r8
            r8 = r20
            r20 = r18
            r18 = r24
            goto L_0x005a
        L_0x01b9:
            int r1 = r8 - r12
            int r2 = r0.i(r8)
            int r3 = r27.k()
            int r5 = r2 - r12
            r8 = 2
            int r5 = r5 / r8
            int r5 = r5 + r2
            int r3 = java.lang.Math.min(r3, r5)
            r5 = 0
            boolean r0 = r0.n(r2, r3, r5)
            if (r0 == 0) goto L_0x025e
            r3 = r20
            int r19 = r19 * r3
            int r6 = r6 - r19
            int r6 = r6 % 103
            if (r6 != r3) goto L_0x0259
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0254
            if (r0 <= 0) goto L_0x01f3
            if (r21 == 0) goto L_0x01f3
            r2 = 99
            if (r14 != r2) goto L_0x01ee
            int r2 = r0 + -2
            goto L_0x01f0
        L_0x01ee:
            int r2 = r0 + -1
        L_0x01f0:
            r13.delete(r2, r0)
        L_0x01f3:
            r0 = 1
            r2 = r4[r0]
            r0 = 0
            r3 = r4[r0]
            int r2 = r2 + r3
            float r0 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r3 = (float) r12
            float r1 = (float) r1
            float r1 = r1 / r2
            float r3 = r3 + r1
            int r1 = r7.size()
            byte[] r2 = new byte[r1]
            r5 = 0
        L_0x0209:
            if (r5 >= r1) goto L_0x021a
            java.lang.Object r4 = r7.get(r5)
            java.lang.Byte r4 = (java.lang.Byte) r4
            byte r4 = r4.byteValue()
            r2[r5] = r4
            int r5 = r5 + 1
            goto L_0x0209
        L_0x021a:
            o5.n r1 = new o5.n
            java.lang.String r4 = r13.toString()
            r5 = 2
            o5.p[] r5 = new o5.p[r5]
            o5.p r6 = new o5.p
            r7 = r26
            float r7 = (float) r7
            r6.<init>(r0, r7)
            r0 = 0
            r5[r0] = r6
            o5.p r0 = new o5.p
            r0.<init>(r3, r7)
            r3 = 1
            r5[r3] = r0
            o5.a r0 = o5.a.CODE_128
            r1.<init>(r4, r2, r5, r0)
            o5.o r0 = o5.o.SYMBOLOGY_IDENTIFIER
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "]C"
            r2.append(r3)
            r3 = r22
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.h(r0, r2)
            return r1
        L_0x0254:
            o5.j r0 = o5.j.a()
            throw r0
        L_0x0259:
            o5.d r0 = o5.d.a()
            throw r0
        L_0x025e:
            o5.j r0 = o5.j.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.b.a(int, u5.a, java.util.Map):o5.n");
    }
}
