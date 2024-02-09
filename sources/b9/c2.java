package b9;

public abstract class c2 extends g0 {
    public abstract c2 L();

    /* access modifiers changed from: protected */
    public final String M() {
        c2 c2Var;
        c2 c10 = x0.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            c2Var = c10.L();
        } catch (UnsupportedOperationException unused) {
            c2Var = null;
        }
        if (this == c2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String M = M();
        if (M != null) {
            return M;
        }
        return n0.a(this) + '@' + n0.b(this);
    }
}
