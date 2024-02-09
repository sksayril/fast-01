package h2;

import android.app.Activity;
import android.content.Intent;

final class d0 extends f0 {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ Intent f9142m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Activity f9143n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ int f9144o;

    d0(Intent intent, Activity activity, int i10) {
        this.f9142m = intent;
        this.f9143n = activity;
        this.f9144o = i10;
    }

    public final void a() {
        Intent intent = this.f9142m;
        if (intent != null) {
            this.f9143n.startActivityForResult(intent, this.f9144o);
        }
    }
}
