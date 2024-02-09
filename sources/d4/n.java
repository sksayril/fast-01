package d4;

import d4.f0;
import java.util.List;
import java.util.Objects;

final class n extends f0.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final List<f0.e.d.a.b.C0116e> f8090a;

    /* renamed from: b  reason: collision with root package name */
    private final f0.e.d.a.b.c f8091b;

    /* renamed from: c  reason: collision with root package name */
    private final f0.a f8092c;

    /* renamed from: d  reason: collision with root package name */
    private final f0.e.d.a.b.C0114d f8093d;

    /* renamed from: e  reason: collision with root package name */
    private final List<f0.e.d.a.b.C0110a> f8094e;

    static final class b extends f0.e.d.a.b.C0112b {

        /* renamed from: a  reason: collision with root package name */
        private List<f0.e.d.a.b.C0116e> f8095a;

        /* renamed from: b  reason: collision with root package name */
        private f0.e.d.a.b.c f8096b;

        /* renamed from: c  reason: collision with root package name */
        private f0.a f8097c;

        /* renamed from: d  reason: collision with root package name */
        private f0.e.d.a.b.C0114d f8098d;

        /* renamed from: e  reason: collision with root package name */
        private List<f0.e.d.a.b.C0110a> f8099e;

        b() {
        }

        public f0.e.d.a.b a() {
            String str = "";
            if (this.f8098d == null) {
                str = str + " signal";
            }
            if (this.f8099e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new n(this.f8095a, this.f8096b, this.f8097c, this.f8098d, this.f8099e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.a.b.C0112b b(f0.a aVar) {
            this.f8097c = aVar;
            return this;
        }

        public f0.e.d.a.b.C0112b c(List<f0.e.d.a.b.C0110a> list) {
            Objects.requireNonNull(list, "Null binaries");
            this.f8099e = list;
            return this;
        }

        public f0.e.d.a.b.C0112b d(f0.e.d.a.b.c cVar) {
            this.f8096b = cVar;
            return this;
        }

        public f0.e.d.a.b.C0112b e(f0.e.d.a.b.C0114d dVar) {
            Objects.requireNonNull(dVar, "Null signal");
            this.f8098d = dVar;
            return this;
        }

        public f0.e.d.a.b.C0112b f(List<f0.e.d.a.b.C0116e> list) {
            this.f8095a = list;
            return this;
        }
    }

    private n(List<f0.e.d.a.b.C0116e> list, f0.e.d.a.b.c cVar, f0.a aVar, f0.e.d.a.b.C0114d dVar, List<f0.e.d.a.b.C0110a> list2) {
        this.f8090a = list;
        this.f8091b = cVar;
        this.f8092c = aVar;
        this.f8093d = dVar;
        this.f8094e = list2;
    }

    public f0.a b() {
        return this.f8092c;
    }

    public List<f0.e.d.a.b.C0110a> c() {
        return this.f8094e;
    }

    public f0.e.d.a.b.c d() {
        return this.f8091b;
    }

    public f0.e.d.a.b.C0114d e() {
        return this.f8093d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b)) {
            return false;
        }
        f0.e.d.a.b bVar = (f0.e.d.a.b) obj;
        List<f0.e.d.a.b.C0116e> list = this.f8090a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            f0.e.d.a.b.c cVar = this.f8091b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                f0.a aVar = this.f8092c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    return this.f8093d.equals(bVar.e()) && this.f8094e.equals(bVar.c());
                }
            }
        }
    }

    public List<f0.e.d.a.b.C0116e> f() {
        return this.f8090a;
    }

    public int hashCode() {
        List<f0.e.d.a.b.C0116e> list = this.f8090a;
        int i10 = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        f0.e.d.a.b.c cVar = this.f8091b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        f0.a aVar = this.f8092c;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return ((((hashCode2 ^ i10) * 1000003) ^ this.f8093d.hashCode()) * 1000003) ^ this.f8094e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f8090a + ", exception=" + this.f8091b + ", appExitInfo=" + this.f8092c + ", signal=" + this.f8093d + ", binaries=" + this.f8094e + "}";
    }
}
