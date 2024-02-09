package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.embedding.engine.systemchannels.l;

public final /* synthetic */ class n implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f10112a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l.d f10113b;

    public /* synthetic */ n(q qVar, l.d dVar) {
        this.f10112a = qVar;
        this.f10113b = dVar;
    }

    public final void onFocusChange(View view, boolean z9) {
        this.f10112a.a0(this.f10113b, view, z9);
    }
}
