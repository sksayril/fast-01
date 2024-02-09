package t2;

import com.google.android.gms.common.api.internal.c;
import g2.i;

final class k implements i, w {

    /* renamed from: a  reason: collision with root package name */
    private final j f12367a;

    /* renamed from: b  reason: collision with root package name */
    private c f12368b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12369c = true;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l f12370d;

    k(l lVar, c cVar, j jVar) {
        this.f12370d = lVar;
        this.f12368b = cVar;
        this.f12367a = jVar;
    }

    public final void a() {
        c.a b10;
        synchronized (this) {
            this.f12369c = false;
            b10 = this.f12368b.b();
        }
        if (b10 != null) {
            this.f12370d.j(b10, 2441);
        }
    }

    public final synchronized void b(c cVar) {
        c cVar2 = this.f12368b;
        if (cVar2 != cVar) {
            cVar2.a();
            this.f12368b = cVar;
        }
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        c.a b10;
        boolean z9;
        c0 c0Var = (c0) obj;
        d3.k kVar = (d3.k) obj2;
        synchronized (this) {
            b10 = this.f12368b.b();
            z9 = this.f12369c;
            this.f12368b.a();
        }
        if (b10 == null) {
            kVar.c(Boolean.FALSE);
        } else {
            this.f12367a.a(c0Var, b10, z9, kVar);
        }
    }

    public final synchronized c zza() {
        return this.f12368b;
    }
}
