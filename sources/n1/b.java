package n1;

import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f11289a;

    private b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f11289a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f11289a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f11289a.equals(((b) obj).f11289a);
    }

    public int hashCode() {
        return this.f11289a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f11289a + "\"}";
    }
}
