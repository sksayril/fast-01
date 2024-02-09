package b9;

import j8.g;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.l;

final class e<T> extends a<T> {

    /* renamed from: p  reason: collision with root package name */
    private final Thread f3442p;

    /* renamed from: q  reason: collision with root package name */
    private final b1 f3443q;

    public e(g gVar, Thread thread, b1 b1Var) {
        super(gVar, true, true);
        this.f3442p = thread;
        this.f3443q = b1Var;
    }

    /* access modifiers changed from: protected */
    public void B(Object obj) {
        if (!l.a(Thread.currentThread(), this.f3442p)) {
            Thread thread = this.f3442p;
            c.a();
            LockSupport.unpark(thread);
        }
    }

    public final T M0() {
        c.a();
        try {
            b1 b1Var = this.f3443q;
            z zVar = null;
            if (b1Var != null) {
                b1.R(b1Var, false, 1, (Object) null);
            }
            while (!Thread.interrupted()) {
                b1 b1Var2 = this.f3443q;
                long U = b1Var2 != null ? b1Var2.U() : Long.MAX_VALUE;
                if (!h0()) {
                    c.a();
                    LockSupport.parkNanos(this, U);
                } else {
                    b1 b1Var3 = this.f3443q;
                    if (b1Var3 != null) {
                        b1.M(b1Var3, false, 1, (Object) null);
                    }
                    c.a();
                    T h10 = z1.h(d0());
                    if (h10 instanceof z) {
                        zVar = (z) h10;
                    }
                    if (zVar == null) {
                        return h10;
                    }
                    throw zVar.f3519a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            K(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            c.a();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public boolean i0() {
        return true;
    }
}
