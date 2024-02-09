package d5;

import kotlin.jvm.internal.l;

public interface b {

    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* renamed from: d5.b$b  reason: collision with other inner class name */
    public static final class C0125b {

        /* renamed from: a  reason: collision with root package name */
        private final String f8197a;

        public C0125b(String str) {
            l.e(str, "sessionId");
            this.f8197a = str;
        }

        public final String a() {
            return this.f8197a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0125b) && l.a(this.f8197a, ((C0125b) obj).f8197a);
        }

        public int hashCode() {
            return this.f8197a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f8197a + ')';
        }
    }

    a a();

    void b(C0125b bVar);

    boolean c();
}
