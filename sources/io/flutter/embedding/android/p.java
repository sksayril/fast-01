package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.t;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ r f9762m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ t.c f9763n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f9764o;

    public /* synthetic */ p(r rVar, t.c cVar, KeyEvent keyEvent) {
        this.f9762m = rVar;
        this.f9763n = cVar;
        this.f9764o = keyEvent;
    }

    public final void run() {
        this.f9762m.m(this.f9763n, this.f9764o);
    }
}
