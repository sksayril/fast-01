package b9;

import g9.c;
import j8.g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

public final class i1 extends h1 implements s0 {

    /* renamed from: p  reason: collision with root package name */
    private final Executor f3459p;

    public i1(Executor executor) {
        this.f3459p = executor;
        c.a(M());
    }

    private final void L(g gVar, RejectedExecutionException rejectedExecutionException) {
        v1.c(gVar, g1.a("The task was rejected", rejectedExecutionException));
    }

    public void I(g gVar, Runnable runnable) {
        try {
            Executor M = M();
            c.a();
            M.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            L(gVar, e10);
            x0.b().I(gVar, runnable);
        }
    }

    public Executor M() {
        return this.f3459p;
    }

    public void close() {
        Executor M = M();
        ExecutorService executorService = M instanceof ExecutorService ? (ExecutorService) M : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof i1) && ((i1) obj).M() == M();
    }

    public int hashCode() {
        return System.identityHashCode(M());
    }

    public String toString() {
        return M().toString();
    }
}
