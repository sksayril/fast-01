package r3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p3.d;
import p3.h;

public final class b extends c {

    private static final class a<V> implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final Future<V> f12083m;

        /* renamed from: n  reason: collision with root package name */
        final a<? super V> f12084n;

        a(Future<V> future, a<? super V> aVar) {
            this.f12083m = future;
            this.f12084n = aVar;
        }

        public void run() {
            Throwable a10;
            Future<V> future = this.f12083m;
            if (!(future instanceof s3.a) || (a10 = s3.b.a((s3.a) future)) == null) {
                try {
                    this.f12084n.a(b.b(this.f12083m));
                } catch (ExecutionException e10) {
                    this.f12084n.b(e10.getCause());
                } catch (Error | RuntimeException e11) {
                    this.f12084n.b(e11);
                }
            } else {
                this.f12084n.b(a10);
            }
        }

        public String toString() {
            return d.a(this).c(this.f12084n).toString();
        }
    }

    public static <V> void a(d<V> dVar, a<? super V> aVar, Executor executor) {
        h.i(aVar);
        dVar.e(new a(dVar, aVar), executor);
    }

    public static <V> V b(Future<V> future) {
        h.o(future.isDone(), "Future was expected to be done: %s", future);
        return e.a(future);
    }
}
