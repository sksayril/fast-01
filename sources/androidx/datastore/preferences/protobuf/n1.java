package androidx.datastore.preferences.protobuf;

abstract class n1<T, B> {
    n1() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(B b10, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract void b(B b10, int i10, long j10);

    /* access modifiers changed from: package-private */
    public abstract void c(B b10, int i10, T t9);

    /* access modifiers changed from: package-private */
    public abstract void d(B b10, int i10, h hVar);

    /* access modifiers changed from: package-private */
    public abstract void e(B b10, int i10, long j10);

    /* access modifiers changed from: package-private */
    public abstract B f(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T g(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int h(T t9);

    /* access modifiers changed from: package-private */
    public abstract int i(T t9);

    /* access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T k(T t9, T t10);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(B r3, androidx.datastore.preferences.protobuf.f1 r4) {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.s()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n1.l(java.lang.Object, androidx.datastore.preferences.protobuf.f1):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean m(B b10, f1 f1Var) {
        int e10 = f1Var.e();
        int a10 = t1.a(e10);
        int b11 = t1.b(e10);
        if (b11 == 0) {
            e(b10, a10, f1Var.K());
            return true;
        } else if (b11 == 1) {
            b(b10, a10, f1Var.h());
            return true;
        } else if (b11 == 2) {
            d(b10, a10, f1Var.y());
            return true;
        } else if (b11 == 3) {
            Object n10 = n();
            int c10 = t1.c(a10, 4);
            l(n10, f1Var);
            if (c10 == f1Var.e()) {
                c(b10, a10, r(n10));
                return true;
            }
            throw b0.a();
        } else if (b11 == 4) {
            return false;
        } else {
            if (b11 == 5) {
                a(b10, a10, f1Var.q());
                return true;
            }
            throw b0.d();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract B n();

    /* access modifiers changed from: package-private */
    public abstract void o(Object obj, B b10);

    /* access modifiers changed from: package-private */
    public abstract void p(Object obj, T t9);

    /* access modifiers changed from: package-private */
    public abstract boolean q(f1 f1Var);

    /* access modifiers changed from: package-private */
    public abstract T r(B b10);

    /* access modifiers changed from: package-private */
    public abstract void s(T t9, u1 u1Var);

    /* access modifiers changed from: package-private */
    public abstract void t(T t9, u1 u1Var);
}
