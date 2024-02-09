package d4;

import d4.f0;
import java.util.Objects;

final class t extends f0.e.d.a.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f8140a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8141b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8142c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8143d;

    static final class b extends f0.e.d.a.c.C0120a {

        /* renamed from: a  reason: collision with root package name */
        private String f8144a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f8145b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f8146c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f8147d;

        b() {
        }

        public f0.e.d.a.c a() {
            String str = "";
            if (this.f8144a == null) {
                str = str + " processName";
            }
            if (this.f8145b == null) {
                str = str + " pid";
            }
            if (this.f8146c == null) {
                str = str + " importance";
            }
            if (this.f8147d == null) {
                str = str + " defaultProcess";
            }
            if (str.isEmpty()) {
                return new t(this.f8144a, this.f8145b.intValue(), this.f8146c.intValue(), this.f8147d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.a.c.C0120a b(boolean z9) {
            this.f8147d = Boolean.valueOf(z9);
            return this;
        }

        public f0.e.d.a.c.C0120a c(int i10) {
            this.f8146c = Integer.valueOf(i10);
            return this;
        }

        public f0.e.d.a.c.C0120a d(int i10) {
            this.f8145b = Integer.valueOf(i10);
            return this;
        }

        public f0.e.d.a.c.C0120a e(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f8144a = str;
            return this;
        }
    }

    private t(String str, int i10, int i11, boolean z9) {
        this.f8140a = str;
        this.f8141b = i10;
        this.f8142c = i11;
        this.f8143d = z9;
    }

    public int b() {
        return this.f8142c;
    }

    public int c() {
        return this.f8141b;
    }

    public String d() {
        return this.f8140a;
    }

    public boolean e() {
        return this.f8143d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.c)) {
            return false;
        }
        f0.e.d.a.c cVar = (f0.e.d.a.c) obj;
        return this.f8140a.equals(cVar.d()) && this.f8141b == cVar.c() && this.f8142c == cVar.b() && this.f8143d == cVar.e();
    }

    public int hashCode() {
        return ((((((this.f8140a.hashCode() ^ 1000003) * 1000003) ^ this.f8141b) * 1000003) ^ this.f8142c) * 1000003) ^ (this.f8143d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f8140a + ", pid=" + this.f8141b + ", importance=" + this.f8142c + ", defaultProcess=" + this.f8143d + "}";
    }
}
