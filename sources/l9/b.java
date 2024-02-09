package l9;

import b9.l;
import d3.e;
import d3.j;
import g8.m;
import g8.n;
import j8.d;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.h;

public final class b {

    static final class a<TResult> implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<T> f11182a;

        a(l<? super T> lVar) {
            this.f11182a = lVar;
        }

        public final void a(j<T> jVar) {
            Exception m10 = jVar.m();
            if (m10 != null) {
                l<T> lVar = this.f11182a;
                m.a aVar = m.f8970m;
                lVar.resumeWith(m.a(n.a(m10)));
            } else if (jVar.o()) {
                l.a.a(this.f11182a, (Throwable) null, 1, (Object) null);
            } else {
                l<T> lVar2 = this.f11182a;
                m.a aVar2 = m.f8970m;
                lVar2.resumeWith(m.a(jVar.n()));
            }
        }
    }

    public static final <T> Object a(j<T> jVar, d<? super T> dVar) {
        return b(jVar, (d3.a) null, dVar);
    }

    private static final <T> Object b(j<T> jVar, d3.a aVar, d<? super T> dVar) {
        if (jVar.p()) {
            Exception m10 = jVar.m();
            if (m10 != null) {
                throw m10;
            } else if (!jVar.o()) {
                return jVar.n();
            } else {
                throw new CancellationException("Task " + jVar + " was cancelled normally.");
            }
        } else {
            b9.m mVar = new b9.m(c.c(dVar), 1);
            mVar.z();
            jVar.c(a.f11181m, new a(mVar));
            Object w9 = mVar.w();
            if (w9 == d.d()) {
                h.c(dVar);
            }
            return w9;
        }
    }
}
