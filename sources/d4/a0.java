package d4;

import d4.f0;
import java.util.Objects;

final class a0 extends f0.e.f {

    /* renamed from: a  reason: collision with root package name */
    private final String f7925a;

    static final class b extends f0.e.f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f7926a;

        b() {
        }

        public f0.e.f a() {
            String str = "";
            if (this.f7926a == null) {
                str = str + " identifier";
            }
            if (str.isEmpty()) {
                return new a0(this.f7926a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.f.a b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f7926a = str;
            return this;
        }
    }

    private a0(String str) {
        this.f7925a = str;
    }

    public String b() {
        return this.f7925a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.f) {
            return this.f7925a.equals(((f0.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f7925a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f7925a + "}";
    }
}
