package v1;

import f8.a;
import java.util.concurrent.Executor;
import q1.e;
import r1.b;
import w1.x;

public final class d implements b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Executor> f12699a;

    /* renamed from: b  reason: collision with root package name */
    private final a<e> f12700b;

    /* renamed from: c  reason: collision with root package name */
    private final a<x> f12701c;

    /* renamed from: d  reason: collision with root package name */
    private final a<x1.d> f12702d;

    /* renamed from: e  reason: collision with root package name */
    private final a<y1.b> f12703e;

    public d(a<Executor> aVar, a<e> aVar2, a<x> aVar3, a<x1.d> aVar4, a<y1.b> aVar5) {
        this.f12699a = aVar;
        this.f12700b = aVar2;
        this.f12701c = aVar3;
        this.f12702d = aVar4;
        this.f12703e = aVar5;
    }

    public static d a(a<Executor> aVar, a<e> aVar2, a<x> aVar3, a<x1.d> aVar4, a<y1.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, e eVar, x xVar, x1.d dVar, y1.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    /* renamed from: b */
    public c get() {
        return c(this.f12699a.get(), this.f12700b.get(), this.f12701c.get(), this.f12702d.get(), this.f12703e.get());
    }
}
