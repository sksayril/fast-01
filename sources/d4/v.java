package d4;

import d4.f0;
import java.util.Objects;

final class v extends f0.e.d.C0121d {

    /* renamed from: a  reason: collision with root package name */
    private final String f8160a;

    static final class b extends f0.e.d.C0121d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f8161a;

        b() {
        }

        public f0.e.d.C0121d a() {
            String str = "";
            if (this.f8161a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new v(this.f8161a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.C0121d.a b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.f8161a = str;
            return this;
        }
    }

    private v(String str) {
        this.f8160a = str;
    }

    public String b() {
        return this.f8160a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.C0121d) {
            return this.f8160a.equals(((f0.e.d.C0121d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f8160a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f8160a + "}";
    }
}
