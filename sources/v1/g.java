package v1;

import f8.a;
import r1.b;
import r1.d;
import w1.f;

public final class g implements b<f> {

    /* renamed from: a  reason: collision with root package name */
    private final a<z1.a> f12704a;

    public g(a<z1.a> aVar) {
        this.f12704a = aVar;
    }

    public static f a(z1.a aVar) {
        return (f) d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(a<z1.a> aVar) {
        return new g(aVar);
    }

    /* renamed from: c */
    public f get() {
        return a(this.f12704a.get());
    }
}
