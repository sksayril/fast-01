package p1;

import java.util.Arrays;
import java.util.Objects;
import p1.p;

final class d extends p {

    /* renamed from: a  reason: collision with root package name */
    private final String f11810a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f11811b;

    /* renamed from: c  reason: collision with root package name */
    private final n1.d f11812c;

    static final class b extends p.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11813a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f11814b;

        /* renamed from: c  reason: collision with root package name */
        private n1.d f11815c;

        b() {
        }

        public p a() {
            String str = "";
            if (this.f11813a == null) {
                str = str + " backendName";
            }
            if (this.f11815c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f11813a, this.f11814b, this.f11815c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public p.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f11813a = str;
            return this;
        }

        public p.a c(byte[] bArr) {
            this.f11814b = bArr;
            return this;
        }

        public p.a d(n1.d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f11815c = dVar;
            return this;
        }
    }

    private d(String str, byte[] bArr, n1.d dVar) {
        this.f11810a = str;
        this.f11811b = bArr;
        this.f11812c = dVar;
    }

    public String b() {
        return this.f11810a;
    }

    public byte[] c() {
        return this.f11811b;
    }

    public n1.d d() {
        return this.f11812c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f11810a.equals(pVar.b())) {
            return Arrays.equals(this.f11811b, pVar instanceof d ? ((d) pVar).f11811b : pVar.c()) && this.f11812c.equals(pVar.d());
        }
    }

    public int hashCode() {
        return ((((this.f11810a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11811b)) * 1000003) ^ this.f11812c.hashCode();
    }
}
