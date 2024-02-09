package p3;

final class i<T> extends g<T> {

    /* renamed from: m  reason: collision with root package name */
    private final T f11866m;

    i(T t9) {
        this.f11866m = t9;
    }

    public T b() {
        return this.f11866m;
    }

    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f11866m.equals(((i) obj).f11866m);
        }
        return false;
    }

    public int hashCode() {
        return this.f11866m.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f11866m);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
