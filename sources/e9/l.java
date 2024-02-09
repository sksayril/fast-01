package e9;

import g8.s;
import j8.d;
import r8.p;

final class l<T> extends a<T> {

    /* renamed from: m  reason: collision with root package name */
    private final p<c<? super T>, d<? super s>, Object> f8566m;

    public l(p<? super c<? super T>, ? super d<? super s>, ? extends Object> pVar) {
        this.f8566m = pVar;
    }

    public Object b(c<? super T> cVar, d<? super s> dVar) {
        Object invoke = this.f8566m.invoke(cVar, dVar);
        return invoke == d.d() ? invoke : s.f8976a;
    }
}
