package b9;

import h8.e;

public abstract class b1 extends g0 {

    /* renamed from: o  reason: collision with root package name */
    private long f3431o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f3432p;

    /* renamed from: q  reason: collision with root package name */
    private e<u0<?>> f3433q;

    public static /* synthetic */ void M(b1 b1Var, boolean z9, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z9 = false;
            }
            b1Var.L(z9);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    private final long N(boolean z9) {
        return z9 ? 4294967296L : 1;
    }

    public static /* synthetic */ void R(b1 b1Var, boolean z9, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z9 = false;
            }
            b1Var.Q(z9);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void L(boolean z9) {
        long N = this.f3431o - N(z9);
        this.f3431o = N;
        if (N <= 0 && this.f3432p) {
            shutdown();
        }
    }

    public final void O(u0<?> u0Var) {
        e<u0<?>> eVar = this.f3433q;
        if (eVar == null) {
            eVar = new e<>();
            this.f3433q = eVar;
        }
        eVar.g(u0Var);
    }

    /* access modifiers changed from: protected */
    public long P() {
        e<u0<?>> eVar = this.f3433q;
        return (eVar != null && !eVar.isEmpty()) ? 0 : Long.MAX_VALUE;
    }

    public final void Q(boolean z9) {
        this.f3431o += N(z9);
        if (!z9) {
            this.f3432p = true;
        }
    }

    public final boolean S() {
        return this.f3431o >= N(true);
    }

    public final boolean T() {
        e<u0<?>> eVar = this.f3433q;
        if (eVar != null) {
            return eVar.isEmpty();
        }
        return true;
    }

    public long U() {
        return !V() ? Long.MAX_VALUE : 0;
    }

    public final boolean V() {
        u0 C;
        e<u0<?>> eVar = this.f3433q;
        if (eVar == null || (C = eVar.C()) == null) {
            return false;
        }
        C.run();
        return true;
    }

    public boolean W() {
        return false;
    }

    public void shutdown() {
    }
}
