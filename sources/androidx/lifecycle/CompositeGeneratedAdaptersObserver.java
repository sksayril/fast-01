package androidx.lifecycle;

import androidx.lifecycle.g;
import kotlin.jvm.internal.l;

public final class CompositeGeneratedAdaptersObserver implements j {

    /* renamed from: m  reason: collision with root package name */
    private final d[] f2691m;

    public CompositeGeneratedAdaptersObserver(d[] dVarArr) {
        l.e(dVarArr, "generatedAdapters");
        this.f2691m = dVarArr;
    }

    public void h(l lVar, g.a aVar) {
        l.e(lVar, "source");
        l.e(aVar, "event");
        p pVar = new p();
        for (d a10 : this.f2691m) {
            a10.a(lVar, aVar, false, pVar);
        }
        for (d a11 : this.f2691m) {
            a11.a(lVar, aVar, true, pVar);
        }
    }
}
