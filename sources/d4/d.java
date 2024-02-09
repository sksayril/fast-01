package d4;

import d4.f0;
import java.util.Objects;

final class d extends f0.a.C0106a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7976a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7977b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7978c;

    static final class b extends f0.a.C0106a.C0107a {

        /* renamed from: a  reason: collision with root package name */
        private String f7979a;

        /* renamed from: b  reason: collision with root package name */
        private String f7980b;

        /* renamed from: c  reason: collision with root package name */
        private String f7981c;

        b() {
        }

        public f0.a.C0106a a() {
            String str = "";
            if (this.f7979a == null) {
                str = str + " arch";
            }
            if (this.f7980b == null) {
                str = str + " libraryName";
            }
            if (this.f7981c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new d(this.f7979a, this.f7980b, this.f7981c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.a.C0106a.C0107a b(String str) {
            Objects.requireNonNull(str, "Null arch");
            this.f7979a = str;
            return this;
        }

        public f0.a.C0106a.C0107a c(String str) {
            Objects.requireNonNull(str, "Null buildId");
            this.f7981c = str;
            return this;
        }

        public f0.a.C0106a.C0107a d(String str) {
            Objects.requireNonNull(str, "Null libraryName");
            this.f7980b = str;
            return this;
        }
    }

    private d(String str, String str2, String str3) {
        this.f7976a = str;
        this.f7977b = str2;
        this.f7978c = str3;
    }

    public String b() {
        return this.f7976a;
    }

    public String c() {
        return this.f7978c;
    }

    public String d() {
        return this.f7977b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.a.C0106a)) {
            return false;
        }
        f0.a.C0106a aVar = (f0.a.C0106a) obj;
        return this.f7976a.equals(aVar.b()) && this.f7977b.equals(aVar.d()) && this.f7978c.equals(aVar.c());
    }

    public int hashCode() {
        return ((((this.f7976a.hashCode() ^ 1000003) * 1000003) ^ this.f7977b.hashCode()) * 1000003) ^ this.f7978c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f7976a + ", libraryName=" + this.f7977b + ", buildId=" + this.f7978c + "}";
    }
}
