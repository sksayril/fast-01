package io.flutter.plugins.imagepicker;

import android.content.Intent;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ l f10552m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f10553n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Intent f10554o;

    public /* synthetic */ j(l lVar, int i10, Intent intent) {
        this.f10552m = lVar;
        this.f10553n = i10;
        this.f10554o = intent;
    }

    public final void run() {
        this.f10552m.J(this.f10553n, this.f10554o);
    }
}
