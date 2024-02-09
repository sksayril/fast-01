package m6;

public class p implements Comparable<p> {

    /* renamed from: m  reason: collision with root package name */
    public final int f11243m;

    /* renamed from: n  reason: collision with root package name */
    public final int f11244n;

    public p(int i10, int i11) {
        this.f11243m = i10;
        this.f11244n = i11;
    }

    /* renamed from: e */
    public int compareTo(p pVar) {
        int i10 = this.f11244n * this.f11243m;
        int i11 = pVar.f11244n * pVar.f11243m;
        if (i11 < i10) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f11243m == pVar.f11243m && this.f11244n == pVar.f11244n;
    }

    public p g() {
        return new p(this.f11244n, this.f11243m);
    }

    public int hashCode() {
        return (this.f11243m * 31) + this.f11244n;
    }

    public p i(p pVar) {
        int i10 = this.f11243m;
        int i11 = pVar.f11244n;
        int i12 = i10 * i11;
        int i13 = pVar.f11243m;
        int i14 = this.f11244n;
        return i12 <= i13 * i14 ? new p(i13, (i14 * i13) / i10) : new p((i10 * i11) / i14, i11);
    }

    public p k(p pVar) {
        int i10 = this.f11243m;
        int i11 = pVar.f11244n;
        int i12 = i10 * i11;
        int i13 = pVar.f11243m;
        int i14 = this.f11244n;
        return i12 >= i13 * i14 ? new p(i13, (i14 * i13) / i10) : new p((i10 * i11) / i14, i11);
    }

    public String toString() {
        return this.f11243m + "x" + this.f11244n;
    }
}
