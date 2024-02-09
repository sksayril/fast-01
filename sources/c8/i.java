package c8;

import android.app.Activity;
import android.util.Log;
import c7.a;
import c8.a;
import d7.c;

public final class i implements a, d7.a {

    /* renamed from: m  reason: collision with root package name */
    private h f3880m;

    public void onAttachedToActivity(c cVar) {
        h hVar = this.f3880m;
        if (hVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            hVar.k(cVar.d());
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f3880m = new h(bVar.a());
        f.f(bVar.b(), this.f3880m);
    }

    public void onDetachedFromActivity() {
        h hVar = this.f3880m;
        if (hVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            hVar.k((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        if (this.f3880m == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        f.f(bVar.b(), (a.b) null);
        this.f3880m = null;
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }
}
