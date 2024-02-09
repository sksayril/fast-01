package e9;

import androidx.concurrent.futures.b;
import b9.m;
import f9.c;
import f9.d;
import g8.m;
import g8.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.l;

final class o extends d<m<?>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8579a = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d */
    public boolean a(m<?> mVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8579a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, n.f8577a);
        return true;
    }

    public final Object e(j8.d<? super s> dVar) {
        m mVar = new m(c.c(dVar), 1);
        mVar.z();
        if (!b.a(f8579a, this, n.f8577a, mVar)) {
            m.a aVar = g8.m.f8970m;
            mVar.resumeWith(g8.m.a(s.f8976a));
        }
        Object w9 = mVar.w();
        if (w9 == d.d()) {
            h.c(dVar);
        }
        return w9 == d.d() ? w9 : s.f8976a;
    }

    /* renamed from: f */
    public j8.d<s>[] b(m<?> mVar) {
        f8579a.set(this, (Object) null);
        return c.f8811a;
    }

    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8579a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null && obj != n.f8578b) {
                if (obj == n.f8577a) {
                    if (b.a(f8579a, this, obj, n.f8578b)) {
                        return;
                    }
                } else if (b.a(f8579a, this, obj, n.f8577a)) {
                    m.a aVar = g8.m.f8970m;
                    ((b9.m) obj).resumeWith(g8.m.a(s.f8976a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = f8579a.getAndSet(this, n.f8577a);
        l.b(andSet);
        return andSet == n.f8578b;
    }
}
