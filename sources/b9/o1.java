package b9;

import g8.s;
import r8.l;

final class o1 extends j {

    /* renamed from: m  reason: collision with root package name */
    private final l<Throwable, s> f3475m;

    public o1(l<? super Throwable, s> lVar) {
        this.f3475m = lVar;
    }

    public void f(Throwable th) {
        this.f3475m.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        f((Throwable) obj);
        return s.f8976a;
    }

    public String toString() {
        return "InvokeOnCancel[" + n0.a(this.f3475m) + '@' + n0.b(this) + ']';
    }
}
