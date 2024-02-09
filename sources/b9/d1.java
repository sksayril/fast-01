package b9;

import b9.c1;
import java.util.concurrent.locks.LockSupport;

public abstract class d1 extends b1 {
    /* access modifiers changed from: protected */
    public abstract Thread X();

    /* access modifiers changed from: protected */
    public void Y(long j10, c1.a aVar) {
        o0.f3473u.j0(j10, aVar);
    }

    /* access modifiers changed from: protected */
    public final void Z() {
        Thread X = X();
        if (Thread.currentThread() != X) {
            c.a();
            LockSupport.unpark(X);
        }
    }
}
