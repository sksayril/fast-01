package d4;

import d4.f0;
import java.util.Objects;

final class x extends f0.e.d.C0122e.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f8170a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8171b;

    static final class b extends f0.e.d.C0122e.b.a {

        /* renamed from: a  reason: collision with root package name */
        private String f8172a;

        /* renamed from: b  reason: collision with root package name */
        private String f8173b;

        b() {
        }

        public f0.e.d.C0122e.b a() {
            String str = "";
            if (this.f8172a == null) {
                str = str + " rolloutId";
            }
            if (this.f8173b == null) {
                str = str + " variantId";
            }
            if (str.isEmpty()) {
                return new x(this.f8172a, this.f8173b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.C0122e.b.a b(String str) {
            Objects.requireNonNull(str, "Null rolloutId");
            this.f8172a = str;
            return this;
        }

        public f0.e.d.C0122e.b.a c(String str) {
            Objects.requireNonNull(str, "Null variantId");
            this.f8173b = str;
            return this;
        }
    }

    private x(String str, String str2) {
        this.f8170a = str;
        this.f8171b = str2;
    }

    public String b() {
        return this.f8170a;
    }

    public String c() {
        return this.f8171b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.C0122e.b)) {
            return false;
        }
        f0.e.d.C0122e.b bVar = (f0.e.d.C0122e.b) obj;
        return this.f8170a.equals(bVar.b()) && this.f8171b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.f8170a.hashCode() ^ 1000003) * 1000003) ^ this.f8171b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f8170a + ", variantId=" + this.f8171b + "}";
    }
}
