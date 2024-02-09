package b9;

import g8.m;

public final class w {
    public static final <T> u<T> a(r1 r1Var) {
        return new v(r1Var);
    }

    public static /* synthetic */ u b(r1 r1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            r1Var = null;
        }
        return a(r1Var);
    }

    public static final <T> boolean c(u<T> uVar, Object obj) {
        Throwable b10 = m.b(obj);
        return b10 == null ? uVar.p(obj) : uVar.o(b10);
    }
}
