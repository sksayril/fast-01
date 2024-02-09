package androidx.core.location;

import android.location.Location;
import androidx.core.location.c;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ c.d f1518m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Location f1519n;

    public /* synthetic */ e(c.d dVar, Location location) {
        this.f1518m = dVar;
        this.f1519n = location;
    }

    public final void run() {
        this.f1518m.i(this.f1519n);
    }
}
