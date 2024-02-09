package g1;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Objects;
import k7.j;
import k7.k;

final class l implements k.c {

    /* renamed from: m  reason: collision with root package name */
    private final Context f8842m;

    /* renamed from: n  reason: collision with root package name */
    private final a f8843n;

    /* renamed from: o  reason: collision with root package name */
    private final n f8844o;

    /* renamed from: p  reason: collision with root package name */
    private final p f8845p;

    /* renamed from: q  reason: collision with root package name */
    private Activity f8846q;

    l(Context context, a aVar, n nVar, p pVar) {
        this.f8842m = context;
        this.f8843n = aVar;
        this.f8844o = nVar;
        this.f8845p = pVar;
    }

    public void i(Activity activity) {
        this.f8846q = activity;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f10996a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals("checkServiceStatus")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals("shouldShowRequestPermissionRationale")) {
                    c10 = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals("checkPermissionStatus")) {
                    c10 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals("requestPermissions")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                int parseInt = Integer.parseInt(jVar.f10997b.toString());
                p pVar = this.f8845p;
                Context context = this.f8842m;
                Objects.requireNonNull(dVar);
                pVar.a(parseInt, context, new k(dVar), new e(dVar));
                return;
            case 1:
                int parseInt2 = Integer.parseInt(jVar.f10997b.toString());
                n nVar = this.f8844o;
                Activity activity = this.f8846q;
                Objects.requireNonNull(dVar);
                nVar.g(parseInt2, activity, new j(dVar), new g(dVar));
                return;
            case 2:
                int parseInt3 = Integer.parseInt(jVar.f10997b.toString());
                n nVar2 = this.f8844o;
                Context context2 = this.f8842m;
                Objects.requireNonNull(dVar);
                nVar2.c(parseInt3, context2, new h(dVar));
                return;
            case 3:
                a aVar = this.f8843n;
                Context context3 = this.f8842m;
                Objects.requireNonNull(dVar);
                aVar.a(context3, new c(dVar), new f(dVar));
                return;
            case 4:
                n nVar3 = this.f8844o;
                Activity activity2 = this.f8846q;
                Objects.requireNonNull(dVar);
                nVar3.f((List) jVar.b(), activity2, new i(dVar), new d(dVar));
                return;
            default:
                dVar.c();
                return;
        }
    }
}
