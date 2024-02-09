package androidx.core.location;

import android.os.Bundle;
import androidx.core.location.c;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ c.d f1524m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ String f1525n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f1526o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Bundle f1527p;

    public /* synthetic */ h(c.d dVar, String str, int i10, Bundle bundle) {
        this.f1524m = dVar;
        this.f1525n = str;
        this.f1526o = i10;
        this.f1527p = bundle;
    }

    public final void run() {
        this.f1524m.m(this.f1525n, this.f1526o, this.f1527p);
    }
}
