package d4;

import d4.f0;
import java.util.Objects;

final class e extends f0.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f7991a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7992b;

    static final class b extends f0.c.a {

        /* renamed from: a  reason: collision with root package name */
        private String f7993a;

        /* renamed from: b  reason: collision with root package name */
        private String f7994b;

        b() {
        }

        public f0.c a() {
            String str = "";
            if (this.f7993a == null) {
                str = str + " key";
            }
            if (this.f7994b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new e(this.f7993a, this.f7994b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.c.a b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.f7993a = str;
            return this;
        }

        public f0.c.a c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.f7994b = str;
            return this;
        }
    }

    private e(String str, String str2) {
        this.f7991a = str;
        this.f7992b = str2;
    }

    public String b() {
        return this.f7991a;
    }

    public String c() {
        return this.f7992b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.c)) {
            return false;
        }
        f0.c cVar = (f0.c) obj;
        return this.f7991a.equals(cVar.b()) && this.f7992b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.f7991a.hashCode() ^ 1000003) * 1000003) ^ this.f7992b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f7991a + ", value=" + this.f7992b + "}";
    }
}
