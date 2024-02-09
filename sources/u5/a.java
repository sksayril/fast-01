package u5;

import java.util.Arrays;

public final class a implements Cloneable {

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f12478o = new int[0];

    /* renamed from: m  reason: collision with root package name */
    private int[] f12479m;

    /* renamed from: n  reason: collision with root package name */
    private int f12480n;

    public a() {
        this.f12480n = 0;
        this.f12479m = f12478o;
    }

    public a(int i10) {
        this.f12480n = i10;
        this.f12479m = p(i10);
    }

    a(int[] iArr, int i10) {
        this.f12479m = iArr;
        this.f12480n = i10;
    }

    private static int[] p(int i10) {
        return new int[((i10 + 31) / 32)];
    }

    public void b() {
        int length = this.f12479m.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f12479m[i10] = 0;
        }
    }

    /* renamed from: d */
    public a clone() {
        return new a((int[]) this.f12479m.clone(), this.f12480n);
    }

    public boolean e(int i10) {
        return ((1 << (i10 & 31)) & this.f12479m[i10 / 32]) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12480n == aVar.f12480n && Arrays.equals(this.f12479m, aVar.f12479m);
    }

    public int[] f() {
        return this.f12479m;
    }

    public int h(int i10) {
        int i11 = this.f12480n;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & this.f12479m[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f12479m;
            if (i12 == iArr.length) {
                return this.f12480n;
            }
            i13 = iArr[i12];
        }
        return Math.min((i12 * 32) + Integer.numberOfTrailingZeros(i13), this.f12480n);
    }

    public int hashCode() {
        return (this.f12480n * 31) + Arrays.hashCode(this.f12479m);
    }

    public int i(int i10) {
        int i11 = this.f12480n;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & (~this.f12479m[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f12479m;
            if (i12 == iArr.length) {
                return this.f12480n;
            }
            i13 = ~iArr[i12];
        }
        return Math.min((i12 * 32) + Integer.numberOfTrailingZeros(i13), this.f12480n);
    }

    public int k() {
        return this.f12480n;
    }

    public boolean n(int i10, int i11, boolean z9) {
        if (i11 < i10 || i10 < 0 || i11 > this.f12480n) {
            throw new IllegalArgumentException();
        } else if (i11 == i10) {
            return true;
        } else {
            int i12 = i11 - 1;
            int i13 = i10 / 32;
            int i14 = i12 / 32;
            int i15 = i13;
            while (i15 <= i14) {
                int i16 = 31;
                int i17 = i15 > i13 ? 0 : i10 & 31;
                if (i15 >= i14) {
                    i16 = 31 & i12;
                }
                int i18 = (2 << i16) - (1 << i17);
                int i19 = this.f12479m[i15] & i18;
                if (!z9) {
                    i18 = 0;
                }
                if (i19 != i18) {
                    return false;
                }
                i15++;
            }
            return true;
        }
    }

    public void q() {
        int[] iArr = new int[this.f12479m.length];
        int i10 = (this.f12480n - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 - i12] = Integer.reverse(this.f12479m[i12]);
        }
        int i13 = this.f12480n;
        int i14 = i11 * 32;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i11 - 1] = i16;
        }
        this.f12479m = iArr;
    }

    public void r(int i10) {
        int[] iArr = this.f12479m;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public void s(int i10, int i11) {
        this.f12479m[i10 / 32] = i11;
    }

    public String toString() {
        int i10 = this.f12480n;
        StringBuilder sb = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f12480n; i11++) {
            if ((i11 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(e(i11) ? 'X' : '.');
        }
        return sb.toString();
    }
}
