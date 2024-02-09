package g9;

import b9.a;
import j8.d;
import j8.g;
import kotlin.coroutines.jvm.internal.e;
import r8.l;

public class d0<T> extends a<T> implements e {

    /* renamed from: p  reason: collision with root package name */
    public final d<T> f8982p;

    public d0(g gVar, d<? super T> dVar) {
        super(gVar, true, true);
        this.f8982p = dVar;
    }

    /* access modifiers changed from: protected */
    public void B(Object obj) {
        k.c(c.c(this.f8982p), b9.d0.a(obj, this.f8982p), (l) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void I0(Object obj) {
        d<T> dVar = this.f8982p;
        dVar.resumeWith(b9.d0.a(obj, dVar));
    }

    public final e getCallerFrame() {
        d<T> dVar = this.f8982p;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean i0() {
        return true;
    }
}
