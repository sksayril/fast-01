package g2;

import f2.a;
import f2.a.d;
import h2.o;

public final class b<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final int f8858a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8859b;

    /* renamed from: c  reason: collision with root package name */
    private final a.d f8860c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8861d;

    private b(a aVar, a.d dVar, String str) {
        this.f8859b = aVar;
        this.f8860c = dVar;
        this.f8861d = str;
        this.f8858a = o.b(aVar, dVar, str);
    }

    public static <O extends a.d> b<O> a(a<O> aVar, O o10, String str) {
        return new b<>(aVar, o10, str);
    }

    public final String b() {
        return this.f8859b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return o.a(this.f8859b, bVar.f8859b) && o.a(this.f8860c, bVar.f8860c) && o.a(this.f8861d, bVar.f8861d);
    }

    public final int hashCode() {
        return this.f8858a;
    }
}
