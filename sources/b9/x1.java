package b9;

import kotlin.jvm.internal.l;

public abstract class x1 extends b0 implements y0, m1 {

    /* renamed from: p  reason: collision with root package name */
    public y1 f3499p;

    public boolean b() {
        return true;
    }

    public d2 d() {
        return null;
    }

    public void e() {
        w().w0(this);
    }

    public String toString() {
        return n0.a(this) + '@' + n0.b(this) + "[job@" + n0.b(w()) + ']';
    }

    public final y1 w() {
        y1 y1Var = this.f3499p;
        if (y1Var != null) {
            return y1Var;
        }
        l.p("job");
        return null;
    }

    public final void x(y1 y1Var) {
        this.f3499p = y1Var;
    }
}
