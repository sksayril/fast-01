package c5;

import kotlin.jvm.internal.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f3758a;

    public m(String str) {
        this.f3758a = str;
    }

    public final String a() {
        return this.f3758a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && l.a(this.f3758a, ((m) obj).f3758a);
    }

    public int hashCode() {
        String str = this.f3758a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f3758a + ')';
    }
}
