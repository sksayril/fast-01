package androidx.datastore.preferences.protobuf;

class p1 extends n1<o1, o1> {
    p1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public o1 g(Object obj) {
        return ((y) obj).unknownFields;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int h(o1 o1Var) {
        return o1Var.f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int i(o1 o1Var) {
        return o1Var.g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public o1 k(o1 o1Var, o1 o1Var2) {
        return o1Var2.equals(o1.e()) ? o1Var : o1.k(o1Var, o1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public o1 n() {
        return o1.l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void o(Object obj, o1 o1Var) {
        p(obj, o1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void p(Object obj, o1 o1Var) {
        ((y) obj).unknownFields = o1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public o1 r(o1 o1Var) {
        o1Var.j();
        return o1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void s(o1 o1Var, u1 u1Var) {
        o1Var.o(u1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void t(o1 o1Var, u1 u1Var) {
        o1Var.q(u1Var);
    }

    /* access modifiers changed from: package-private */
    public void j(Object obj) {
        g(obj).j();
    }

    /* access modifiers changed from: package-private */
    public boolean q(f1 f1Var) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void a(o1 o1Var, int i10, int i11) {
        o1Var.n(t1.c(i10, 5), Integer.valueOf(i11));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void b(o1 o1Var, int i10, long j10) {
        o1Var.n(t1.c(i10, 1), Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void c(o1 o1Var, int i10, o1 o1Var2) {
        o1Var.n(t1.c(i10, 3), o1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void d(o1 o1Var, int i10, h hVar) {
        o1Var.n(t1.c(i10, 2), hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void e(o1 o1Var, int i10, long j10) {
        o1Var.n(t1.c(i10, 0), Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public o1 f(Object obj) {
        o1 A = g(obj);
        if (A != o1.e()) {
            return A;
        }
        o1 l10 = o1.l();
        p(obj, l10);
        return l10;
    }
}
