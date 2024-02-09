package io.flutter.plugins.imagepicker;

import android.content.Intent;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ l f10549m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f10550n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Intent f10551o;

    public /* synthetic */ i(l lVar, int i10, Intent intent) {
        this.f10549m = lVar;
        this.f10550n = i10;
        this.f10551o = intent;
    }

    public final void run() {
        this.f10549m.H(this.f10550n, this.f10551o);
    }
}
