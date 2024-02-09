package io.flutter.plugin.platform;

import android.view.View;

public final /* synthetic */ class l implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f10108a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10109b;

    public /* synthetic */ l(q qVar, int i10) {
        this.f10108a = qVar;
        this.f10109b = i10;
    }

    public final void onFocusChange(View view, boolean z9) {
        this.f10108a.c0(this.f10109b, view, z9);
    }
}
