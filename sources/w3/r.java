package w3;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final f0<?> f12934a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12935b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12936c;

    private r(Class<?> cls, int i10, int i11) {
        this(f0.b(cls), i10, i11);
    }

    private r(f0<?> f0Var, int i10, int i11) {
        this.f12934a = (f0) e0.c(f0Var, "Null dependency anInterface.");
        this.f12935b = i10;
        this.f12936c = i11;
    }

    public static r a(Class<?> cls) {
        return new r(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static r h(Class<?> cls) {
        return new r(cls, 0, 1);
    }

    public static r i(Class<?> cls) {
        return new r(cls, 1, 0);
    }

    public static r j(f0<?> f0Var) {
        return new r(f0Var, 1, 0);
    }

    public static r k(Class<?> cls) {
        return new r(cls, 1, 1);
    }

    public static r l(f0<?> f0Var) {
        return new r(f0Var, 1, 1);
    }

    public static r m(Class<?> cls) {
        return new r(cls, 2, 0);
    }

    public f0<?> c() {
        return this.f12934a;
    }

    public boolean d() {
        return this.f12936c == 2;
    }

    public boolean e() {
        return this.f12936c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f12934a.equals(rVar.f12934a) && this.f12935b == rVar.f12935b && this.f12936c == rVar.f12936c;
    }

    public boolean f() {
        return this.f12935b == 1;
    }

    public boolean g() {
        return this.f12935b == 2;
    }

    public int hashCode() {
        return ((((this.f12934a.hashCode() ^ 1000003) * 1000003) ^ this.f12935b) * 1000003) ^ this.f12936c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f12934a);
        sb.append(", type=");
        int i10 = this.f12935b;
        sb.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.f12936c));
        sb.append("}");
        return sb.toString();
    }
}
