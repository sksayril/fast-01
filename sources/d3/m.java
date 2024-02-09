package d3;

import h2.p;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class m {
    public static <TResult> TResult a(j<TResult> jVar) {
        p.h();
        p.k(jVar, "Task must not be null");
        if (jVar.p()) {
            return h(jVar);
        }
        o oVar = new o((n) null);
        i(jVar, oVar);
        oVar.b();
        return h(jVar);
    }

    public static <TResult> TResult b(j<TResult> jVar, long j10, TimeUnit timeUnit) {
        p.h();
        p.k(jVar, "Task must not be null");
        p.k(timeUnit, "TimeUnit must not be null");
        if (jVar.p()) {
            return h(jVar);
        }
        o oVar = new o((n) null);
        i(jVar, oVar);
        if (oVar.d(j10, timeUnit)) {
            return h(jVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> j<TResult> c(Executor executor, Callable<TResult> callable) {
        p.k(executor, "Executor must not be null");
        p.k(callable, "Callback must not be null");
        k0 k0Var = new k0();
        executor.execute(new l0(k0Var, callable));
        return k0Var;
    }

    public static <TResult> j<TResult> d(Exception exc) {
        k0 k0Var = new k0();
        k0Var.t(exc);
        return k0Var;
    }

    public static <TResult> j<TResult> e(TResult tresult) {
        k0 k0Var = new k0();
        k0Var.u(tresult);
        return k0Var;
    }

    public static j<Void> f(Collection<? extends j<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return e((Object) null);
        }
        for (j requireNonNull : collection) {
            Objects.requireNonNull(requireNonNull, "null tasks are not accepted");
        }
        k0 k0Var = new k0();
        q qVar = new q(collection.size(), k0Var);
        for (j i10 : collection) {
            i(i10, qVar);
        }
        return k0Var;
    }

    public static j<Void> g(j<?>... jVarArr) {
        return (jVarArr == null || jVarArr.length == 0) ? e((Object) null) : f(Arrays.asList(jVarArr));
    }

    private static Object h(j jVar) {
        if (jVar.q()) {
            return jVar.n();
        }
        if (jVar.o()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(jVar.m());
    }

    private static void i(j jVar, p pVar) {
        Executor executor = l.f7746b;
        jVar.i(executor, pVar);
        jVar.f(executor, pVar);
        jVar.a(executor, pVar);
    }
}
