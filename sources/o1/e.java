package o1;

import o1.k;

final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k.b f11544a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11545b;

    static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private k.b f11546a;

        /* renamed from: b  reason: collision with root package name */
        private a f11547b;

        b() {
        }

        public k a() {
            return new e(this.f11546a, this.f11547b);
        }

        public k.a b(a aVar) {
            this.f11547b = aVar;
            return this;
        }

        public k.a c(k.b bVar) {
            this.f11546a = bVar;
            return this;
        }
    }

    private e(k.b bVar, a aVar) {
        this.f11544a = bVar;
        this.f11545b = aVar;
    }

    public a b() {
        return this.f11545b;
    }

    public k.b c() {
        return this.f11544a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f11544a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            a aVar = this.f11545b;
            a b10 = kVar.b();
            if (aVar == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (aVar.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f11544a;
        int i10 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        a aVar = this.f11545b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f11544a + ", androidClientInfo=" + this.f11545b + "}";
    }
}
