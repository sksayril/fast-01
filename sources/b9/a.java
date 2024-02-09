package b9;

import j8.d;
import j8.g;
import r8.l;
import r8.p;

public abstract class a<T> extends y1 implements d<T>, j0 {

    /* renamed from: o  reason: collision with root package name */
    private final g f3426o;

    public a(g gVar, boolean z9, boolean z10) {
        super(z10);
        if (z9) {
            g0((r1) gVar.a(r1.f3485c));
        }
        this.f3426o = gVar.t(this);
    }

    /* access modifiers changed from: protected */
    public void I0(Object obj) {
        B(obj);
    }

    /* access modifiers changed from: protected */
    public void J0(Throwable th, boolean z9) {
    }

    /* access modifiers changed from: protected */
    public void K0(T t9) {
    }

    public final <R> void L0(l0 l0Var, R r9, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        l0Var.invoke(pVar, r9, this);
    }

    /* access modifiers changed from: protected */
    public String P() {
        return n0.a(this) + " was cancelled";
    }

    public boolean b() {
        return super.b();
    }

    public g e() {
        return this.f3426o;
    }

    public final void f0(Throwable th) {
        i0.a(this.f3426o, th);
    }

    public final g getContext() {
        return this.f3426o;
    }

    public String n0() {
        String b10 = f0.b(this.f3426o);
        if (b10 == null) {
            return super.n0();
        }
        return '\"' + b10 + "\":" + super.n0();
    }

    public final void resumeWith(Object obj) {
        Object l02 = l0(d0.d(obj, (l) null, 1, (Object) null));
        if (l02 != z1.f3522b) {
            I0(l02);
        }
    }

    /* access modifiers changed from: protected */
    public final void s0(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            J0(zVar.f3519a, zVar.a());
            return;
        }
        K0(obj);
    }
}
