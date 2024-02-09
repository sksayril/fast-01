package w8;

import h8.a0;
import kotlin.jvm.internal.g;
import m8.c;

public class a implements Iterable<Integer>, s8.a {

    /* renamed from: p  reason: collision with root package name */
    public static final C0222a f13002p = new C0222a((g) null);

    /* renamed from: m  reason: collision with root package name */
    private final int f13003m;

    /* renamed from: n  reason: collision with root package name */
    private final int f13004n;

    /* renamed from: o  reason: collision with root package name */
    private final int f13005o;

    /* renamed from: w8.a$a  reason: collision with other inner class name */
    public static final class C0222a {
        private C0222a() {
        }

        public /* synthetic */ C0222a(g gVar) {
            this();
        }

        public final a a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }
    }

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i12 != Integer.MIN_VALUE) {
            this.f13003m = i10;
            this.f13004n = c.c(i10, i11, i12);
            this.f13005o = i12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int c() {
        return this.f13003m;
    }

    public final int d() {
        return this.f13004n;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.f13003m == aVar.f13003m && this.f13004n == aVar.f13004n && this.f13005o == aVar.f13005o)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f13005o;
    }

    /* renamed from: g */
    public a0 iterator() {
        return new b(this.f13003m, this.f13004n, this.f13005o);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f13003m * 31) + this.f13004n) * 31) + this.f13005o;
    }

    public boolean isEmpty() {
        if (this.f13005o > 0) {
            if (this.f13003m > this.f13004n) {
                return true;
            }
        } else if (this.f13003m < this.f13004n) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i10;
        StringBuilder sb;
        if (this.f13005o > 0) {
            sb = new StringBuilder();
            sb.append(this.f13003m);
            sb.append("..");
            sb.append(this.f13004n);
            sb.append(" step ");
            i10 = this.f13005o;
        } else {
            sb = new StringBuilder();
            sb.append(this.f13003m);
            sb.append(" downTo ");
            sb.append(this.f13004n);
            sb.append(" step ");
            i10 = -this.f13005o;
        }
        sb.append(i10);
        return sb.toString();
    }
}
