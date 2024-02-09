package o1;

import o1.o;

final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final o.c f11577a;

    /* renamed from: b  reason: collision with root package name */
    private final o.b f11578b;

    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private o.c f11579a;

        /* renamed from: b  reason: collision with root package name */
        private o.b f11580b;

        b() {
        }

        public o a() {
            return new i(this.f11579a, this.f11580b);
        }

        public o.a b(o.b bVar) {
            this.f11580b = bVar;
            return this;
        }

        public o.a c(o.c cVar) {
            this.f11579a = cVar;
            return this;
        }
    }

    private i(o.c cVar, o.b bVar) {
        this.f11577a = cVar;
        this.f11578b = bVar;
    }

    public o.b b() {
        return this.f11578b;
    }

    public o.c c() {
        return this.f11577a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f11577a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f11578b;
            o.b b10 = oVar.b();
            if (bVar == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (bVar.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f11577a;
        int i10 = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f11578b;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f11577a + ", mobileSubtype=" + this.f11578b + "}";
    }
}
