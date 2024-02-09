package c6;

import o5.j;
import u5.a;

public final class q extends p {

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f3856j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k  reason: collision with root package name */
    static final int[][] f3857k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i  reason: collision with root package name */
    private final int[] f3858i = new int[4];

    public static String t(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c10 = cArr[5];
        switch (c10) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c10);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c10);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    private static void u(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 <= 1; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (i10 == f3857k[i11][i12]) {
                    sb.insert(0, (char) (i11 + 48));
                    sb.append((char) (i12 + 48));
                    return;
                }
            }
        }
        throw j.a();
    }

    /* access modifiers changed from: protected */
    public boolean i(String str) {
        return super.i(t(str));
    }

    /* access modifiers changed from: protected */
    public int[] l(a aVar, int i10) {
        return p.o(aVar, i10, true, f3856j);
    }

    /* access modifiers changed from: protected */
    public int m(a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f3858i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int k10 = aVar.k();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < k10; i12++) {
            int k11 = p.k(aVar, iArr2, i10, p.f3852h);
            sb.append((char) ((k11 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (k11 >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        u(sb, i11);
        return i10;
    }

    /* access modifiers changed from: package-private */
    public o5.a r() {
        return o5.a.UPC_E;
    }
}
