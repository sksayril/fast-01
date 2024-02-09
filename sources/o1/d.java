package o1;

import java.util.List;
import java.util.Objects;

final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    private final List<m> f11543a;

    d(List<m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f11543a = list;
    }

    public List<m> c() {
        return this.f11543a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f11543a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f11543a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f11543a + "}";
    }
}
