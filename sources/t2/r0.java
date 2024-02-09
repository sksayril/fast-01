package t2;

import java.util.List;

final class r0 extends s0 {

    /* renamed from: o  reason: collision with root package name */
    final transient int f12381o;

    /* renamed from: p  reason: collision with root package name */
    final transient int f12382p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ s0 f12383q;

    r0(s0 s0Var, int i10, int i11) {
        this.f12383q = s0Var;
        this.f12381o = i10;
        this.f12382p = i11;
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return this.f12383q.f() + this.f12381o + this.f12382p;
    }

    /* access modifiers changed from: package-private */
    public final int f() {
        return this.f12383q.f() + this.f12381o;
    }

    public final Object get(int i10) {
        m0.a(i10, this.f12382p, "index");
        return this.f12383q.get(i10 + this.f12381o);
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object[] l() {
        return this.f12383q.l();
    }

    public final s0 o(int i10, int i11) {
        m0.c(i10, i11, this.f12382p);
        s0 s0Var = this.f12383q;
        int i12 = this.f12381o;
        return s0Var.subList(i10 + i12, i11 + i12);
    }

    public final int size() {
        return this.f12382p;
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
