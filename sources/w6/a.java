package w6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.WindowManager;
import c7.a;
import k7.c;
import k7.k;
import kotlin.jvm.internal.l;

public final class a implements c7.a {

    /* renamed from: m  reason: collision with root package name */
    private k f12992m;

    private final void a(c cVar, Context context) {
        this.f12992m = new k(cVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        l.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("window");
        l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        b bVar = new b(packageManager, (WindowManager) systemService);
        k kVar = this.f12992m;
        if (kVar == null) {
            l.p("methodChannel");
            kVar = null;
        }
        kVar.e(bVar);
    }

    public void onAttachedToEngine(a.b bVar) {
        l.e(bVar, "binding");
        c b10 = bVar.b();
        l.d(b10, "getBinaryMessenger(...)");
        Context a10 = bVar.a();
        l.d(a10, "getApplicationContext(...)");
        a(b10, a10);
    }

    public void onDetachedFromEngine(a.b bVar) {
        l.e(bVar, "binding");
        k kVar = this.f12992m;
        if (kVar == null) {
            l.p("methodChannel");
            kVar = null;
        }
        kVar.e((k.c) null);
    }
}
