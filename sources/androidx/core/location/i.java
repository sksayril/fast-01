package androidx.core.location;

import androidx.core.location.c;
import java.util.List;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ c.d f1528m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ List f1529n;

    public /* synthetic */ i(c.d dVar, List list) {
        this.f1528m = dVar;
        this.f1529n = list;
    }

    public final void run() {
        this.f1528m.j(this.f1529n);
    }
}
