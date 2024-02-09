package x1;

import f8.a;
import r1.b;

public final class n0 implements b<m0> {

    /* renamed from: a  reason: collision with root package name */
    private final a<z1.a> f13105a;

    /* renamed from: b  reason: collision with root package name */
    private final a<z1.a> f13106b;

    /* renamed from: c  reason: collision with root package name */
    private final a<e> f13107c;

    /* renamed from: d  reason: collision with root package name */
    private final a<t0> f13108d;

    /* renamed from: e  reason: collision with root package name */
    private final a<String> f13109e;

    public n0(a<z1.a> aVar, a<z1.a> aVar2, a<e> aVar3, a<t0> aVar4, a<String> aVar5) {
        this.f13105a = aVar;
        this.f13106b = aVar2;
        this.f13107c = aVar3;
        this.f13108d = aVar4;
        this.f13109e = aVar5;
    }

    public static n0 a(a<z1.a> aVar, a<z1.a> aVar2, a<e> aVar3, a<t0> aVar4, a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(z1.a aVar, z1.a aVar2, Object obj, Object obj2, a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    /* renamed from: b */
    public m0 get() {
        return c(this.f13105a.get(), this.f13106b.get(), this.f13107c.get(), this.f13108d.get(), this.f13109e);
    }
}
