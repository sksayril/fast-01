package androidx.core.util;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1678a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static char[] f1679b = new char[24];

    private static int a(int i10, int i11, boolean z9, int i12) {
        if (i10 > 99 || (z9 && i12 >= 3)) {
            return i11 + 3;
        }
        if (i10 > 9 || (z9 && i12 >= 2)) {
            return i11 + 2;
        }
        if (z9 || i10 > 0) {
            return i11 + 1;
        }
        return 0;
    }

    public static void b(long j10, StringBuilder sb) {
        synchronized (f1678a) {
            sb.append(f1679b, 0, c(j10, 0));
        }
    }

    private static int c(long j10, int i10) {
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11 = j10;
        int i16 = i10;
        if (f1679b.length < i16) {
            f1679b = new char[i16];
        }
        char[] cArr = f1679b;
        int i17 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
        if (i17 == 0) {
            int i18 = i16 - 1;
            while (i18 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i17 > 0) {
            c10 = '+';
        } else {
            c10 = '-';
            j11 = -j11;
        }
        int i19 = (int) (j11 % 1000);
        int floor = (int) Math.floor((double) (j11 / 1000));
        if (floor > 86400) {
            i11 = floor / 86400;
            floor -= 86400 * i11;
        } else {
            i11 = 0;
        }
        if (floor > 3600) {
            i12 = floor / 3600;
            floor -= i12 * 3600;
        } else {
            i12 = 0;
        }
        if (floor > 60) {
            int i20 = floor / 60;
            i13 = floor - (i20 * 60);
            i14 = i20;
        } else {
            i13 = floor;
            i14 = 0;
        }
        if (i16 != 0) {
            int a10 = a(i11, 1, false, 0);
            int a11 = a10 + a(i12, 1, a10 > 0, 2);
            int a12 = a11 + a(i14, 1, a11 > 0, 2);
            int a13 = a12 + a(i13, 1, a12 > 0, 2);
            i15 = 0;
            for (int a14 = a13 + a(i19, 2, true, a13 > 0 ? 3 : 0) + 1; a14 < i16; a14++) {
                cArr[i15] = ' ';
                i15++;
            }
        } else {
            i15 = 0;
        }
        cArr[i15] = c10;
        int i21 = i15 + 1;
        boolean z9 = i16 != 0;
        int i22 = i21;
        int d10 = d(cArr, i11, 'd', i21, false, 0);
        int d11 = d(cArr, i12, 'h', d10, d10 != i22, z9 ? 2 : 0);
        int d12 = d(cArr, i14, 'm', d11, d11 != i22, z9 ? 2 : 0);
        int d13 = d(cArr, i13, 's', d12, d12 != i22, z9 ? 2 : 0);
        int d14 = d(cArr, i19, 'm', d13, true, (!z9 || d13 == i22) ? 0 : 3);
        cArr[d14] = 's';
        return d14 + 1;
    }

    private static int d(char[] cArr, int i10, char c10, int i11, boolean z9, int i12) {
        int i13;
        if (!z9 && i10 <= 0) {
            return i11;
        }
        if ((!z9 || i12 < 3) && i10 <= 99) {
            i13 = i11;
        } else {
            int i14 = i10 / 100;
            cArr[i11] = (char) (i14 + 48);
            i13 = i11 + 1;
            i10 -= i14 * 100;
        }
        if ((z9 && i12 >= 2) || i10 > 9 || i11 != i13) {
            int i15 = i10 / 10;
            cArr[i13] = (char) (i15 + 48);
            i13++;
            i10 -= i15 * 10;
        }
        cArr[i13] = (char) (i10 + 48);
        int i16 = i13 + 1;
        cArr[i16] = c10;
        return i16 + 1;
    }
}
