package com.google.common.collect;

import java.util.Arrays;
import p3.f;

final class i {
    static Object a(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString());
    }

    static int b(int i10, int i11) {
        return i10 & (~i11);
    }

    static int c(int i10, int i11) {
        return i10 & i11;
    }

    static int d(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    static int e(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    static int f(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int c10 = l.c(obj);
        int i13 = c10 & i10;
        int h10 = h(obj3, i13);
        if (h10 == 0) {
            return -1;
        }
        int b10 = b(c10, i10);
        int i14 = -1;
        while (true) {
            i11 = h10 - 1;
            i12 = iArr[i11];
            if (b(i12, i10) != b10 || !f.a(obj, objArr[i11]) || (objArr2 != null && !f.a(obj2, objArr2[i11]))) {
                int c11 = c(i12, i10);
                if (c11 == 0) {
                    return -1;
                }
                int i15 = c11;
                i14 = i11;
                h10 = i15;
            }
        }
        int c12 = c(i12, i10);
        if (i14 == -1) {
            i(obj3, i13, c12);
        } else {
            iArr[i14] = d(iArr[i14], c12, i10);
        }
        return i11;
    }

    static void g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    static int h(Object obj, int i10) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    static void i(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    static int j(int i10) {
        return Math.max(4, l.a(i10 + 1, 1.0d));
    }
}
