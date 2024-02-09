package d4;

import d4.f0;
import java.util.List;
import java.util.Objects;

final class r extends f0.e.d.a.b.C0116e {

    /* renamed from: a  reason: collision with root package name */
    private final String f8124a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8125b;

    /* renamed from: c  reason: collision with root package name */
    private final List<f0.e.d.a.b.C0116e.C0118b> f8126c;

    static final class b extends f0.e.d.a.b.C0116e.C0117a {

        /* renamed from: a  reason: collision with root package name */
        private String f8127a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f8128b;

        /* renamed from: c  reason: collision with root package name */
        private List<f0.e.d.a.b.C0116e.C0118b> f8129c;

        b() {
        }

        public f0.e.d.a.b.C0116e a() {
            String str = "";
            if (this.f8127a == null) {
                str = str + " name";
            }
            if (this.f8128b == null) {
                str = str + " importance";
            }
            if (this.f8129c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new r(this.f8127a, this.f8128b.intValue(), this.f8129c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.a.b.C0116e.C0117a b(List<f0.e.d.a.b.C0116e.C0118b> list) {
            Objects.requireNonNull(list, "Null frames");
            this.f8129c = list;
            return this;
        }

        public f0.e.d.a.b.C0116e.C0117a c(int i10) {
            this.f8128b = Integer.valueOf(i10);
            return this;
        }

        public f0.e.d.a.b.C0116e.C0117a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f8127a = str;
            return this;
        }
    }

    private r(String str, int i10, List<f0.e.d.a.b.C0116e.C0118b> list) {
        this.f8124a = str;
        this.f8125b = i10;
        this.f8126c = list;
    }

    public List<f0.e.d.a.b.C0116e.C0118b> b() {
        return this.f8126c;
    }

    public int c() {
        return this.f8125b;
    }

    public String d() {
        return this.f8124a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.C0116e)) {
            return false;
        }
        f0.e.d.a.b.C0116e eVar = (f0.e.d.a.b.C0116e) obj;
        return this.f8124a.equals(eVar.d()) && this.f8125b == eVar.c() && this.f8126c.equals(eVar.b());
    }

    public int hashCode() {
        return ((((this.f8124a.hashCode() ^ 1000003) * 1000003) ^ this.f8125b) * 1000003) ^ this.f8126c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f8124a + ", importance=" + this.f8125b + ", frames=" + this.f8126c + "}";
    }
}
