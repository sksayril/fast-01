package j2;

import android.content.Context;
import com.google.android.gms.common.api.internal.g;
import d3.j;
import f2.a;
import f2.e;
import h2.t;
import h2.v;
import h2.w;
import r2.f;

public final class d extends e implements v {

    /* renamed from: k  reason: collision with root package name */
    private static final a.g f10794k;

    /* renamed from: l  reason: collision with root package name */
    private static final a.C0134a f10795l;

    /* renamed from: m  reason: collision with root package name */
    private static final a f10796m;

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f10797n = 0;

    static {
        a.g gVar = new a.g();
        f10794k = gVar;
        c cVar = new c();
        f10795l = cVar;
        f10796m = new a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, w wVar) {
        super(context, f10796m, wVar, e.a.f8746c);
    }

    public final j<Void> e(t tVar) {
        g.a a10 = g.a();
        a10.d(f.f12080a);
        a10.c(false);
        a10.b(new b(tVar));
        return g(a10.a());
    }
}
