package androidx.lifecycle;

import androidx.lifecycle.g;
import j8.g;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.l;

public final class LifecycleCoroutineScopeImpl extends h implements j {

    /* renamed from: m  reason: collision with root package name */
    private final g f2698m;

    /* renamed from: n  reason: collision with root package name */
    private final g f2699n;

    public g a() {
        return this.f2698m;
    }

    public g e() {
        return this.f2699n;
    }

    public void h(l lVar, g.a aVar) {
        l.e(lVar, "source");
        l.e(aVar, "event");
        if (a().b().compareTo(g.b.DESTROYED) <= 0) {
            a().c(this);
            w1.d(e(), (CancellationException) null, 1, (Object) null);
        }
    }
}
