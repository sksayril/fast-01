package t2;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.location.LocationRequest;
import d3.j;
import f2.a;
import f2.e;
import h2.p;
import w2.b;

public final class l extends e implements b {

    /* renamed from: k  reason: collision with root package name */
    static final a.g f12371k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f12372l;

    static {
        a.g gVar = new a.g();
        f12371k = gVar;
        f12372l = new a("LocationServices.API", new i(), gVar);
    }

    public l(Activity activity) {
        super(activity, f12372l, a.d.f8733a, e.a.f8746c);
    }

    public l(Context context) {
        super(context, f12372l, a.d.f8733a, e.a.f8746c);
    }

    private final j q(LocationRequest locationRequest, c cVar) {
        k kVar = new k(this, cVar, c.f12344a);
        return i(f.a().b(new d(kVar, locationRequest)).d(kVar).e(cVar).c(2436).a());
    }

    public final j<Void> a(LocationRequest locationRequest, w2.e eVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            p.k(looper, "invalid null looper");
        }
        return q(locationRequest, d.a(eVar, looper, w2.e.class.getSimpleName()));
    }

    public final j<Void> b(w2.e eVar) {
        return j(d.b(eVar, w2.e.class.getSimpleName()), 2418).k(h.f12356m, f.f12353a);
    }

    public final j<Location> c() {
        return h(g.a().b(g.f12355a).e(2414).a());
    }
}
