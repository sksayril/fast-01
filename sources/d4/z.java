package d4;

import d4.f0;
import java.util.Objects;

final class z extends f0.e.C0123e {

    /* renamed from: a  reason: collision with root package name */
    private final int f8176a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8177b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8178c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8179d;

    static final class b extends f0.e.C0123e.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f8180a;

        /* renamed from: b  reason: collision with root package name */
        private String f8181b;

        /* renamed from: c  reason: collision with root package name */
        private String f8182c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f8183d;

        b() {
        }

        public f0.e.C0123e a() {
            String str = "";
            if (this.f8180a == null) {
                str = str + " platform";
            }
            if (this.f8181b == null) {
                str = str + " version";
            }
            if (this.f8182c == null) {
                str = str + " buildVersion";
            }
            if (this.f8183d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new z(this.f8180a.intValue(), this.f8181b, this.f8182c, this.f8183d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.C0123e.a b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f8182c = str;
            return this;
        }

        public f0.e.C0123e.a c(boolean z9) {
            this.f8183d = Boolean.valueOf(z9);
            return this;
        }

        public f0.e.C0123e.a d(int i10) {
            this.f8180a = Integer.valueOf(i10);
            return this;
        }

        public f0.e.C0123e.a e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f8181b = str;
            return this;
        }
    }

    private z(int i10, String str, String str2, boolean z9) {
        this.f8176a = i10;
        this.f8177b = str;
        this.f8178c = str2;
        this.f8179d = z9;
    }

    public String b() {
        return this.f8178c;
    }

    public int c() {
        return this.f8176a;
    }

    public String d() {
        return this.f8177b;
    }

    public boolean e() {
        return this.f8179d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.C0123e)) {
            return false;
        }
        f0.e.C0123e eVar = (f0.e.C0123e) obj;
        return this.f8176a == eVar.c() && this.f8177b.equals(eVar.d()) && this.f8178c.equals(eVar.b()) && this.f8179d == eVar.e();
    }

    public int hashCode() {
        return ((((((this.f8176a ^ 1000003) * 1000003) ^ this.f8177b.hashCode()) * 1000003) ^ this.f8178c.hashCode()) * 1000003) ^ (this.f8179d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f8176a + ", version=" + this.f8177b + ", buildVersion=" + this.f8178c + ", jailbroken=" + this.f8179d + "}";
    }
}
