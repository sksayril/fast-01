package io.flutter.plugins.imagepicker;

import android.content.Intent;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ l f10546m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f10547n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Intent f10548o;

    public /* synthetic */ h(l lVar, int i10, Intent intent) {
        this.f10546m = lVar;
        this.f10547n = i10;
        this.f10548o = intent;
    }

    public final void run() {
        this.f10546m.G(this.f10547n, this.f10548o);
    }
}
