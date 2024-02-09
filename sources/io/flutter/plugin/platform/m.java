package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.embedding.engine.systemchannels.l;

public final /* synthetic */ class m implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f10110a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l.d f10111b;

    public /* synthetic */ m(q qVar, l.d dVar) {
        this.f10110a = qVar;
        this.f10111b = dVar;
    }

    public final void onFocusChange(View view, boolean z9) {
        this.f10110a.b0(this.f10111b, view, z9);
    }
}
