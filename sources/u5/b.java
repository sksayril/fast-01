package u5;

import java.util.Arrays;

public final class b implements Cloneable {

    /* renamed from: m  reason: collision with root package name */
    private int f12481m;

    /* renamed from: n  reason: collision with root package name */
    private int f12482n;

    /* renamed from: o  reason: collision with root package name */
    private int f12483o;

    /* renamed from: p  reason: collision with root package name */
    private int[] f12484p;

    public b(int i10) {
        this(i10, i10);
    }

    public b(int i10, int i11) {
        if (i10 < 1 || i11 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f12481m = i10;
        this.f12482n = i11;
        int i12 = (i10 + 31) / 32;
        this.f12483o = i12;
        this.f12484p = new int[(i12 * i11)];
    }

    private b(int i10, int i11, int i12, int[] iArr) {
        this.f12481m = i10;
        this.f12482n = i11;
        this.f12483o = i12;
        this.f12484p = iArr;
    }

    private String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f12482n * (this.f12481m + 1));
        for (int i10 = 0; i10 < this.f12482n; i10++) {
            for (int i11 = 0; i11 < this.f12481m; i11++) {
                sb.append(h(i11, i10) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: d */
    public b clone() {
        return new b(this.f12481m, this.f12482n, this.f12483o, (int[]) this.f12484p.clone());
    }

    public void e() {
        int length = this.f12484p.length;
        for (int i10 = 0; i10 < length; i10++) {
            int[] iArr = this.f12484p;
            iArr[i10] = ~iArr[i10];
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12481m == bVar.f12481m && this.f12482n == bVar.f12482n && this.f12483o == bVar.f12483o && Arrays.equals(this.f12484p, bVar.f12484p);
    }

    public void f(int i10, int i11) {
        int i12 = (i11 * this.f12483o) + (i10 / 32);
        int[] iArr = this.f12484p;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public boolean h(int i10, int i11) {
        return ((this.f12484p[(i11 * this.f12483o) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int hashCode() {
        int i10 = this.f12481m;
        return (((((((i10 * 31) + i10) * 31) + this.f12482n) * 31) + this.f12483o) * 31) + Arrays.hashCode(this.f12484p);
    }

    public int[] i() {
        int length = this.f12484p.length - 1;
        while (length >= 0 && this.f12484p[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f12483o;
        int i11 = length / i10;
        int i12 = (length % i10) * 32;
        int i13 = 31;
        while ((this.f12484p[length] >>> i13) == 0) {
            i13--;
        }
        return new int[]{i12 + i13, i11};
    }

    public int[] k() {
        int i10 = this.f12481m;
        int i11 = this.f12482n;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < this.f12482n; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = this.f12483o;
                if (i15 >= i16) {
                    break;
                }
                int i17 = this.f12484p[(i16 * i14) + i15];
                if (i17 != 0) {
                    if (i14 < i11) {
                        i11 = i14;
                    }
                    if (i14 > i13) {
                        i13 = i14;
                    }
                    int i18 = i15 * 32;
                    if (i18 < i10) {
                        int i19 = 0;
                        while ((i17 << (31 - i19)) == 0) {
                            i19++;
                        }
                        int i20 = i19 + i18;
                        if (i20 < i10) {
                            i10 = i20;
                        }
                    }
                    if (i18 + 31 > i12) {
                        int i21 = 31;
                        while ((i17 >>> i21) == 0) {
                            i21--;
                        }
                        int i22 = i18 + i21;
                        if (i22 > i12) {
                            i12 = i22;
                        }
                    }
                }
                i15++;
            }
        }
        if (i12 < i10 || i13 < i11) {
            return null;
        }
        return new int[]{i10, i11, (i12 - i10) + 1, (i13 - i11) + 1};
    }

    public int n() {
        return this.f12482n;
    }

    public a p(int i10, a aVar) {
        if (aVar == null || aVar.k() < this.f12481m) {
            aVar = new a(this.f12481m);
        } else {
            aVar.b();
        }
        int i11 = i10 * this.f12483o;
        for (int i12 = 0; i12 < this.f12483o; i12++) {
            aVar.s(i12 * 32, this.f12484p[i11 + i12]);
        }
        return aVar;
    }

    public int[] q() {
        int[] iArr;
        int i10 = 0;
        while (true) {
            iArr = this.f12484p;
            if (i10 < iArr.length && iArr[i10] == 0) {
                i10++;
            }
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f12483o;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) * 32;
        int i14 = iArr[i10];
        int i15 = 0;
        while ((i14 << (31 - i15)) == 0) {
            i15++;
        }
        return new int[]{i13 + i15, i12};
    }

    public int r() {
        return this.f12481m;
    }

    public void s() {
        a aVar = new a(this.f12481m);
        a aVar2 = new a(this.f12481m);
        int i10 = (this.f12482n + 1) / 2;
        for (int i11 = 0; i11 < i10; i11++) {
            aVar = p(i11, aVar);
            int i12 = (this.f12482n - 1) - i11;
            aVar2 = p(i12, aVar2);
            aVar.q();
            aVar2.q();
            w(i11, aVar2);
            w(i12, aVar);
        }
    }

    public void t() {
        int i10 = this.f12482n;
        int i11 = this.f12481m;
        int i12 = (i10 + 31) / 32;
        int[] iArr = new int[(i12 * i11)];
        for (int i13 = 0; i13 < this.f12482n; i13++) {
            for (int i14 = 0; i14 < this.f12481m; i14++) {
                if (((this.f12484p[(this.f12483o * i13) + (i14 / 32)] >>> (i14 & 31)) & 1) != 0) {
                    int i15 = (((i11 - 1) - i14) * i12) + (i13 / 32);
                    iArr[i15] = (1 << (i13 & 31)) | iArr[i15];
                }
            }
        }
        this.f12481m = i10;
        this.f12482n = i11;
        this.f12483o = i12;
        this.f12484p = iArr;
    }

    public String toString() {
        return x("X ", "  ");
    }

    public void u(int i10, int i11) {
        int i12 = (i11 * this.f12483o) + (i10 / 32);
        int[] iArr = this.f12484p;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void v(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i13 < 1 || i12 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i14 = i12 + i10;
            int i15 = i13 + i11;
            if (i15 > this.f12482n || i14 > this.f12481m) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i11 < i15) {
                int i16 = this.f12483o * i11;
                for (int i17 = i10; i17 < i14; i17++) {
                    int[] iArr = this.f12484p;
                    int i18 = (i17 / 32) + i16;
                    iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                }
                i11++;
            }
        }
    }

    public void w(int i10, a aVar) {
        int[] f10 = aVar.f();
        int[] iArr = this.f12484p;
        int i11 = this.f12483o;
        System.arraycopy(f10, 0, iArr, i10 * i11, i11);
    }

    public String x(String str, String str2) {
        return b(str, str2, "\n");
    }
}
