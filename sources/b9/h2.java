package b9;

import g8.m;
import g8.n;
import g8.s;

final class h2<T> extends x1 {

    /* renamed from: q  reason: collision with root package name */
    private final m<T> f3458q;

    public h2(m<? super T> mVar) {
        this.f3458q = mVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Throwable) obj);
        return s.f8976a;
    }

    public void v(Throwable th) {
        Object obj;
        m<T> mVar;
        Object d02 = w().d0();
        if (d02 instanceof z) {
            mVar = this.f3458q;
            m.a aVar = m.f8970m;
            obj = n.a(((z) d02).f3519a);
        } else {
            mVar = this.f3458q;
            m.a aVar2 = m.f8970m;
            obj = z1.h(d02);
        }
        mVar.resumeWith(m.a(obj));
    }
}
