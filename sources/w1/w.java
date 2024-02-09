package w1;

import f8.a;
import java.util.concurrent.Executor;
import r1.b;
import x1.d;

public final class w implements b<v> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Executor> f12819a;

    /* renamed from: b  reason: collision with root package name */
    private final a<d> f12820b;

    /* renamed from: c  reason: collision with root package name */
    private final a<x> f12821c;

    /* renamed from: d  reason: collision with root package name */
    private final a<y1.b> f12822d;

    public w(a<Executor> aVar, a<d> aVar2, a<x> aVar3, a<y1.b> aVar4) {
        this.f12819a = aVar;
        this.f12820b = aVar2;
        this.f12821c = aVar3;
        this.f12822d = aVar4;
    }

    public static w a(a<Executor> aVar, a<d> aVar2, a<x> aVar3, a<y1.b> aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, d dVar, x xVar, y1.b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    /* renamed from: b */
    public v get() {
        return c(this.f12819a.get(), this.f12820b.get(), this.f12821c.get(), this.f12822d.get());
    }
}
