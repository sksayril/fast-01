package m9;

import android.app.Activity;
import c7.a;
import d7.c;
import io.flutter.plugin.platform.h;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class b implements c7.a, d7.a {

    /* renamed from: m  reason: collision with root package name */
    public static final a f11260m = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public void onAttachedToActivity(c cVar) {
        l.e(cVar, "activityPluginBinding");
        f fVar = f.f11279a;
        fVar.c(cVar.d());
        fVar.d(cVar);
    }

    public void onAttachedToEngine(a.b bVar) {
        l.e(bVar, "flutterPluginBinding");
        h c10 = bVar.c();
        k7.c b10 = bVar.b();
        l.d(b10, "getBinaryMessenger(...)");
        c10.a("net.touchcapture.qr.flutterqr/qrview", new d(b10));
    }

    public void onDetachedFromActivity() {
        f fVar = f.f11279a;
        fVar.c((Activity) null);
        fVar.d((c) null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        f fVar = f.f11279a;
        fVar.c((Activity) null);
        fVar.d((c) null);
    }

    public void onDetachedFromEngine(a.b bVar) {
        l.e(bVar, "binding");
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        l.e(cVar, "activityPluginBinding");
        f fVar = f.f11279a;
        fVar.c(cVar.d());
        fVar.d(cVar);
    }
}
