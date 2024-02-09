package d4;

import d4.f0;

final class j extends f0.e.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f8045a;

    public String a() {
        return this.f8045a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.a.b) {
            return this.f8045a.equals(((f0.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f8045a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f8045a + "}";
    }
}
