package b9;

final class a1 implements m1 {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f3429m;

    public a1(boolean z9) {
        this.f3429m = z9;
    }

    public boolean b() {
        return this.f3429m;
    }

    public d2 d() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
