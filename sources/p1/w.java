package p1;

import f8.a;
import r1.b;
import v1.e;
import w1.r;
import w1.v;

public final class w implements b<u> {

    /* renamed from: a  reason: collision with root package name */
    private final a<z1.a> f11850a;

    /* renamed from: b  reason: collision with root package name */
    private final a<z1.a> f11851b;

    /* renamed from: c  reason: collision with root package name */
    private final a<e> f11852c;

    /* renamed from: d  reason: collision with root package name */
    private final a<r> f11853d;

    /* renamed from: e  reason: collision with root package name */
    private final a<v> f11854e;

    public w(a<z1.a> aVar, a<z1.a> aVar2, a<e> aVar3, a<r> aVar4, a<v> aVar5) {
        this.f11850a = aVar;
        this.f11851b = aVar2;
        this.f11852c = aVar3;
        this.f11853d = aVar4;
        this.f11854e = aVar5;
    }

    public static w a(a<z1.a> aVar, a<z1.a> aVar2, a<e> aVar3, a<r> aVar4, a<v> aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(z1.a aVar, z1.a aVar2, e eVar, r rVar, v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    /* renamed from: b */
    public u get() {
        return c(this.f11850a.get(), this.f11851b.get(), this.f11852c.get(), this.f11853d.get(), this.f11854e.get());
    }
}
