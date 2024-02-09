package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.t;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ r f9758m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ t.c f9759n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f9760o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f9761p;

    public /* synthetic */ o(r rVar, t.c cVar, long j10, KeyEvent keyEvent) {
        this.f9758m = rVar;
        this.f9759n = cVar;
        this.f9760o = j10;
        this.f9761p = keyEvent;
    }

    public final void run() {
        this.f9758m.l(this.f9759n, this.f9760o, this.f9761p);
    }
}
