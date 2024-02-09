package d6;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f8204a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8205b;

    public b(int i10, int i11) {
        this.f8204a = i10;
        this.f8205b = i11;
    }

    public final int a() {
        return this.f8205b;
    }

    public final int b() {
        return this.f8204a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8204a == bVar.f8204a && this.f8205b == bVar.f8205b;
    }

    public final int hashCode() {
        return this.f8204a ^ this.f8205b;
    }

    public final String toString() {
        return this.f8204a + "(" + this.f8205b + ')';
    }
}
