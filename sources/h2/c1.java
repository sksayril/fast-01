package h2;

import android.os.Bundle;
import e2.b;

public final class c1 extends o0 {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c f9139g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c1(c cVar, int i10, Bundle bundle) {
        super(cVar, i10, (Bundle) null);
        this.f9139g = cVar;
    }

    /* access modifiers changed from: protected */
    public final void f(b bVar) {
        if (!this.f9139g.t() || !c.h0(this.f9139g)) {
            this.f9139g.f9125p.a(bVar);
            this.f9139g.L(bVar);
            return;
        }
        c.d0(this.f9139g, 16);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        this.f9139g.f9125p.a(b.f8327q);
        return true;
    }
}
