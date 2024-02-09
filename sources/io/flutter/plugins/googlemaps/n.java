package io.flutter.plugins.googlemaps;

import androidx.lifecycle.g;
import c7.a;
import d7.c;

public class n implements c7.a, d7.a {

    /* renamed from: m  reason: collision with root package name */
    g f10494m;

    class a implements o {
        a() {
        }

        public g a() {
            return n.this.f10494m;
        }
    }

    public void onAttachedToActivity(c cVar) {
        this.f10494m = g7.a.a(cVar);
    }

    public void onAttachedToEngine(a.b bVar) {
        bVar.c().a("plugins.flutter.dev/google_maps_android", new j(bVar.b(), bVar.a(), new a()));
    }

    public void onDetachedFromActivity() {
        this.f10494m = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }
}
