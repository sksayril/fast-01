package androidx.core.os;

import android.os.OutcomeReceiver;
import g8.m;
import g8.n;
import j8.d;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;

final class g<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {

    /* renamed from: m  reason: collision with root package name */
    private final d<R> f1564m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(d<? super R> dVar) {
        super(false);
        l.e(dVar, "continuation");
        this.f1564m = dVar;
    }

    public void onError(E e10) {
        l.e(e10, "error");
        if (compareAndSet(false, true)) {
            d<R> dVar = this.f1564m;
            m.a aVar = m.f8970m;
            dVar.resumeWith(m.a(n.a(e10)));
        }
    }

    public void onResult(R r9) {
        l.e(r9, "result");
        if (compareAndSet(false, true)) {
            d<R> dVar = this.f1564m;
            m.a aVar = m.f8970m;
            dVar.resumeWith(m.a(r9));
        }
    }

    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
