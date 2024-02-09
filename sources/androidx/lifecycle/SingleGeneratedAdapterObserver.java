package androidx.lifecycle;

import androidx.lifecycle.g;
import kotlin.jvm.internal.l;

public final class SingleGeneratedAdapterObserver implements j {

    /* renamed from: m  reason: collision with root package name */
    private final d f2725m;

    public SingleGeneratedAdapterObserver(d dVar) {
        l.e(dVar, "generatedAdapter");
        this.f2725m = dVar;
    }

    public void h(l lVar, g.a aVar) {
        l.e(lVar, "source");
        l.e(aVar, "event");
        this.f2725m.a(lVar, aVar, false, (p) null);
        this.f2725m.a(lVar, aVar, true, (p) null);
    }
}
