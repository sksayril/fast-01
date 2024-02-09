package q1;

import java.util.Arrays;
import java.util.Objects;
import p1.i;
import q1.f;

final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<i> f11958a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f11959b;

    static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<i> f11960a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f11961b;

        b() {
        }

        public f a() {
            String str = "";
            if (this.f11960a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f11960a, this.f11961b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(Iterable<i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f11960a = iterable;
            return this;
        }

        public f.a c(byte[] bArr) {
            this.f11961b = bArr;
            return this;
        }
    }

    private a(Iterable<i> iterable, byte[] bArr) {
        this.f11958a = iterable;
        this.f11959b = bArr;
    }

    public Iterable<i> b() {
        return this.f11958a;
    }

    public byte[] c() {
        return this.f11959b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f11958a.equals(fVar.b())) {
            if (Arrays.equals(this.f11959b, fVar instanceof a ? ((a) fVar).f11959b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11958a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11959b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f11958a + ", extras=" + Arrays.toString(this.f11959b) + "}";
    }
}
