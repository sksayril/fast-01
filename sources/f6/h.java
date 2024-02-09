package f6;

import u5.a;

abstract class h extends j {
    h(a aVar) {
        super(aVar);
    }

    private static void e(StringBuilder sb, int i10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 13; i13++) {
            int charAt = sb.charAt(i13 + i10) - '0';
            if ((i13 & 1) == 0) {
                charAt *= 3;
            }
            i12 += charAt;
        }
        int i14 = 10 - (i12 % 10);
        if (i14 != 10) {
            i11 = i14;
        }
        sb.append(i11);
    }

    /* access modifiers changed from: package-private */
    public final void f(StringBuilder sb, int i10) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        g(sb, i10, length);
    }

    /* access modifiers changed from: package-private */
    public final void g(StringBuilder sb, int i10, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            int f10 = b().f((i12 * 10) + i10, 10);
            if (f10 / 100 == 0) {
                sb.append('0');
            }
            if (f10 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f10);
        }
        e(sb, i11);
    }
}
