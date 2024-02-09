package p4;

import java.lang.annotation.Annotation;
import p4.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f11874a;

    /* renamed from: b  reason: collision with root package name */
    private d.a f11875b = d.a.DEFAULT;

    /* renamed from: p4.a$a  reason: collision with other inner class name */
    private static final class C0200a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f11876a;

        /* renamed from: b  reason: collision with root package name */
        private final d.a f11877b;

        C0200a(int i10, d.a aVar) {
            this.f11876a = i10;
            this.f11877b = aVar;
        }

        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f11876a == dVar.tag() && this.f11877b.equals(dVar.intEncoding());
        }

        public int hashCode() {
            return (this.f11876a ^ 14552422) + (this.f11877b.hashCode() ^ 2041407134);
        }

        public d.a intEncoding() {
            return this.f11877b;
        }

        public int tag() {
            return this.f11876a;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f11876a + "intEncoding=" + this.f11877b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0200a(this.f11874a, this.f11875b);
    }

    public a c(int i10) {
        this.f11874a = i10;
        return this;
    }
}
