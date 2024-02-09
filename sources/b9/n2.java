package b9;

import j8.g;

public final class n2 extends g0 {

    /* renamed from: o  reason: collision with root package name */
    public static final n2 f3472o = new n2();

    private n2() {
    }

    public void I(g gVar, Runnable runnable) {
        r2 r2Var = (r2) gVar.a(r2.f3487o);
        if (r2Var != null) {
            r2Var.f3488n = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public boolean J(g gVar) {
        return false;
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
