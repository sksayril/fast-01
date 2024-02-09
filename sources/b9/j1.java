package b9;

import java.util.concurrent.Executor;

public final class j1 {
    public static final g0 a(Executor executor) {
        g0 g0Var;
        w0 w0Var = executor instanceof w0 ? (w0) executor : null;
        return (w0Var == null || (g0Var = w0Var.f3494m) == null) ? new i1(executor) : g0Var;
    }
}
