package p1;

import java.util.Objects;
import n1.e;
import p1.o;

final class c extends o {

    /* renamed from: a  reason: collision with root package name */
    private final p f11800a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11801b;

    /* renamed from: c  reason: collision with root package name */
    private final n1.c<?> f11802c;

    /* renamed from: d  reason: collision with root package name */
    private final e<?, byte[]> f11803d;

    /* renamed from: e  reason: collision with root package name */
    private final n1.b f11804e;

    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private p f11805a;

        /* renamed from: b  reason: collision with root package name */
        private String f11806b;

        /* renamed from: c  reason: collision with root package name */
        private n1.c<?> f11807c;

        /* renamed from: d  reason: collision with root package name */
        private e<?, byte[]> f11808d;

        /* renamed from: e  reason: collision with root package name */
        private n1.b f11809e;

        b() {
        }

        public o a() {
            String str = "";
            if (this.f11805a == null) {
                str = str + " transportContext";
            }
            if (this.f11806b == null) {
                str = str + " transportName";
            }
            if (this.f11807c == null) {
                str = str + " event";
            }
            if (this.f11808d == null) {
                str = str + " transformer";
            }
            if (this.f11809e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f11805a, this.f11806b, this.f11807c, this.f11808d, this.f11809e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public o.a b(n1.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f11809e = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public o.a c(n1.c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f11807c = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public o.a d(e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f11808d = eVar;
            return this;
        }

        public o.a e(p pVar) {
            Objects.requireNonNull(pVar, "Null transportContext");
            this.f11805a = pVar;
            return this;
        }

        public o.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f11806b = str;
            return this;
        }
    }

    private c(p pVar, String str, n1.c<?> cVar, e<?, byte[]> eVar, n1.b bVar) {
        this.f11800a = pVar;
        this.f11801b = str;
        this.f11802c = cVar;
        this.f11803d = eVar;
        this.f11804e = bVar;
    }

    public n1.b b() {
        return this.f11804e;
    }

    /* access modifiers changed from: package-private */
    public n1.c<?> c() {
        return this.f11802c;
    }

    /* access modifiers changed from: package-private */
    public e<?, byte[]> e() {
        return this.f11803d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f11800a.equals(oVar.f()) && this.f11801b.equals(oVar.g()) && this.f11802c.equals(oVar.c()) && this.f11803d.equals(oVar.e()) && this.f11804e.equals(oVar.b());
    }

    public p f() {
        return this.f11800a;
    }

    public String g() {
        return this.f11801b;
    }

    public int hashCode() {
        return ((((((((this.f11800a.hashCode() ^ 1000003) * 1000003) ^ this.f11801b.hashCode()) * 1000003) ^ this.f11802c.hashCode()) * 1000003) ^ this.f11803d.hashCode()) * 1000003) ^ this.f11804e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f11800a + ", transportName=" + this.f11801b + ", event=" + this.f11802c + ", transformer=" + this.f11803d + ", encoding=" + this.f11804e + "}";
    }
}
