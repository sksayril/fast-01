package w5;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f12989a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f12990b;

    b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f12989a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f12990b = iArr;
                return;
            }
            int i10 = 1;
            while (i10 < length && iArr[i10] == 0) {
                i10++;
            }
            if (i10 == length) {
                this.f12990b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i10)];
            this.f12990b = iArr2;
            System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public b a(b bVar) {
        if (!this.f12989a.equals(bVar.f12989a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (e()) {
            return bVar;
        } else {
            if (bVar.e()) {
                return this;
            }
            int[] iArr = this.f12990b;
            int[] iArr2 = bVar.f12990b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr4[i10] = a.a(iArr2[i10 - length], iArr[i10]);
            }
            return new b(this.f12989a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    public int b(int i10) {
        if (i10 == 0) {
            return c(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int a10 : this.f12990b) {
                i11 = a.a(i11, a10);
            }
            return i11;
        }
        int[] iArr = this.f12990b;
        int i12 = iArr[0];
        int length = iArr.length;
        for (int i13 = 1; i13 < length; i13++) {
            i12 = a.a(this.f12989a.j(i10, i12), this.f12990b[i13]);
        }
        return i12;
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        int[] iArr = this.f12990b;
        return iArr[(iArr.length - 1) - i10];
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f12990b.length - 1;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f12990b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    public b f(int i10) {
        if (i10 == 0) {
            return this.f12989a.g();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f12990b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f12989a.j(this.f12990b[i11], i10);
        }
        return new b(this.f12989a, iArr);
    }

    /* access modifiers changed from: package-private */
    public b g(b bVar) {
        if (!this.f12989a.equals(bVar.f12989a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (e() || bVar.e()) {
            return this.f12989a.g();
        } else {
            int[] iArr = this.f12990b;
            int length = iArr.length;
            int[] iArr2 = bVar.f12990b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    int i13 = i10 + i12;
                    iArr3[i13] = a.a(iArr3[i13], this.f12989a.j(i11, iArr2[i12]));
                }
            }
            return new b(this.f12989a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    public b h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f12989a.g();
        } else {
            int length = this.f12990b.length;
            int[] iArr = new int[(i10 + length)];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = this.f12989a.j(this.f12990b[i12], i11);
            }
            return new b(this.f12989a, iArr);
        }
    }

    public String toString() {
        char c10;
        if (e()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(d() * 8);
        int d10 = d();
        while (d10 >= 0) {
            int c11 = c(d10);
            if (c11 != 0) {
                if (c11 < 0) {
                    sb.append(d10 == d() ? "-" : " - ");
                    c11 = -c11;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d10 == 0 || c11 != 1) {
                    int i10 = this.f12989a.i(c11);
                    if (i10 == 0) {
                        c10 = '1';
                    } else if (i10 == 1) {
                        c10 = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(i10);
                    }
                    sb.append(c10);
                }
                if (d10 != 0) {
                    if (d10 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d10);
                    }
                }
            }
            d10--;
        }
        return sb.toString();
    }
}
