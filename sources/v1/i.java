package v1;

import android.content.Context;
import f8.a;
import r1.b;
import w1.f;
import w1.x;
import x1.d;

public final class i implements b<x> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f12705a;

    /* renamed from: b  reason: collision with root package name */
    private final a<d> f12706b;

    /* renamed from: c  reason: collision with root package name */
    private final a<f> f12707c;

    /* renamed from: d  reason: collision with root package name */
    private final a<z1.a> f12708d;

    public i(a<Context> aVar, a<d> aVar2, a<f> aVar3, a<z1.a> aVar4) {
        this.f12705a = aVar;
        this.f12706b = aVar2;
        this.f12707c = aVar3;
        this.f12708d = aVar4;
    }

    public static i a(a<Context> aVar, a<d> aVar2, a<f> aVar3, a<z1.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, d dVar, f fVar, z1.a aVar) {
        return (x) r1.d.c(h.a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public x get() {
        return c(this.f12705a.get(), this.f12706b.get(), this.f12707c.get(), this.f12708d.get());
    }
}
