package io.flutter.plugins.imagepicker;

import android.content.Intent;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ l f10555m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f10556n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Intent f10557o;

    public /* synthetic */ k(l lVar, int i10, Intent intent) {
        this.f10555m = lVar;
        this.f10556n = i10;
        this.f10557o = intent;
    }

    public final void run() {
        this.f10555m.K(this.f10556n, this.f10557o);
    }
}
