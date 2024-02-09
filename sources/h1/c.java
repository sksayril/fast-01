package h1;

import android.content.Context;
import android.os.Vibrator;
import c7.a;
import k7.k;

public class c implements a {

    /* renamed from: m  reason: collision with root package name */
    private k f9104m;

    private void a(k7.c cVar, Context context) {
        b bVar = new b(new a((Vibrator) context.getSystemService("vibrator")));
        k kVar = new k(cVar, "vibration");
        this.f9104m = kVar;
        kVar.e(bVar);
    }

    private void b() {
        this.f9104m.e((k.c) null);
        this.f9104m = null;
    }

    public void onAttachedToEngine(a.b bVar) {
        a(bVar.b(), bVar.a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        b();
    }
}
