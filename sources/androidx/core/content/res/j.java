package androidx.core.content.res;

import android.graphics.Typeface;
import androidx.core.content.res.h;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ h.e f1437m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Typeface f1438n;

    public /* synthetic */ j(h.e eVar, Typeface typeface) {
        this.f1437m = eVar;
        this.f1438n = typeface;
    }

    public final void run() {
        this.f1437m.g(this.f1438n);
    }
}
