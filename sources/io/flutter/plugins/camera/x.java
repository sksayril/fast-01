package io.flutter.plugins.camera;

import android.app.Activity;
import c7.a;
import io.flutter.plugins.camera.v;
import io.flutter.view.e;
import k7.c;

public final class x implements a, d7.a {

    /* renamed from: m  reason: collision with root package name */
    private a.b f10302m;

    /* renamed from: n  reason: collision with root package name */
    private m0 f10303n;

    private void a(Activity activity, c cVar, v.b bVar, e eVar) {
        this.f10303n = new m0(activity, cVar, new v(), bVar, eVar);
    }

    public void onAttachedToActivity(d7.c cVar) {
        a(cVar.d(), this.f10302m.b(), new w(cVar), this.f10302m.d());
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f10302m = bVar;
    }

    public void onDetachedFromActivity() {
        m0 m0Var = this.f10303n;
        if (m0Var != null) {
            m0Var.e();
            this.f10303n = null;
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f10302m = null;
    }

    public void onReattachedToActivityForConfigChanges(d7.c cVar) {
        onAttachedToActivity(cVar);
    }
}
