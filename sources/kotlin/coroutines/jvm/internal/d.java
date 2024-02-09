package kotlin.coroutines.jvm.internal;

import j8.e;
import j8.g;
import kotlin.jvm.internal.l;

public abstract class d extends a {
    private final g _context;
    private transient j8.d<Object> intercepted;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(j8.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    public d(j8.d<Object> dVar, g gVar) {
        super(dVar);
        this._context = gVar;
    }

    public g getContext() {
        g gVar = this._context;
        l.b(gVar);
        return gVar;
    }

    public final j8.d<Object> intercepted() {
        j8.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            e eVar = (e) getContext().a(e.f10860l);
            if (eVar == null || (dVar = eVar.G(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        j8.d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            g.b a10 = getContext().a(e.f10860l);
            l.b(a10);
            ((e) a10).m(dVar);
        }
        this.intercepted = c.f11056m;
    }
}
