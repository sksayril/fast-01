package w1;

import android.content.Context;
import f8.a;
import java.util.concurrent.Executor;
import q1.e;
import r1.b;
import x1.c;
import x1.d;

public final class s implements b<r> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f12804a;

    /* renamed from: b  reason: collision with root package name */
    private final a<e> f12805b;

    /* renamed from: c  reason: collision with root package name */
    private final a<d> f12806c;

    /* renamed from: d  reason: collision with root package name */
    private final a<x> f12807d;

    /* renamed from: e  reason: collision with root package name */
    private final a<Executor> f12808e;

    /* renamed from: f  reason: collision with root package name */
    private final a<y1.b> f12809f;

    /* renamed from: g  reason: collision with root package name */
    private final a<z1.a> f12810g;

    /* renamed from: h  reason: collision with root package name */
    private final a<z1.a> f12811h;

    /* renamed from: i  reason: collision with root package name */
    private final a<c> f12812i;

    public s(a<Context> aVar, a<e> aVar2, a<d> aVar3, a<x> aVar4, a<Executor> aVar5, a<y1.b> aVar6, a<z1.a> aVar7, a<z1.a> aVar8, a<c> aVar9) {
        this.f12804a = aVar;
        this.f12805b = aVar2;
        this.f12806c = aVar3;
        this.f12807d = aVar4;
        this.f12808e = aVar5;
        this.f12809f = aVar6;
        this.f12810g = aVar7;
        this.f12811h = aVar8;
        this.f12812i = aVar9;
    }

    public static s a(a<Context> aVar, a<e> aVar2, a<d> aVar3, a<x> aVar4, a<Executor> aVar5, a<y1.b> aVar6, a<z1.a> aVar7, a<z1.a> aVar8, a<c> aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, e eVar, d dVar, x xVar, Executor executor, y1.b bVar, z1.a aVar, z1.a aVar2, c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    /* renamed from: b */
    public r get() {
        return c(this.f12804a.get(), this.f12805b.get(), this.f12806c.get(), this.f12807d.get(), this.f12808e.get(), this.f12809f.get(), this.f12810g.get(), this.f12811h.get(), this.f12812i.get());
    }
}
