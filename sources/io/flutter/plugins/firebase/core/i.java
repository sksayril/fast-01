package io.flutter.plugins.firebase.core;

import android.content.Context;
import c7.a;
import d3.j;
import d3.k;
import d3.m;
import io.flutter.plugins.firebase.core.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t3.f;
import t3.n;

public class i implements a, p.b, p.a {

    /* renamed from: o  reason: collision with root package name */
    public static Map<String, String> f10326o = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private Context f10327m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10328n = false;

    private j<p.f> o(f fVar) {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(this, fVar, kVar));
        return kVar.a();
    }

    private p.e p(n nVar) {
        p.e.a aVar = new p.e.a();
        aVar.b(nVar.b());
        aVar.c(nVar.c());
        if (nVar.f() != null) {
            aVar.e(nVar.f());
        }
        if (nVar.g() != null) {
            aVar.f(nVar.g());
        }
        aVar.d(nVar.d());
        aVar.g(nVar.h());
        aVar.h(nVar.e());
        return aVar.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void q(String str, k kVar) {
        try {
            try {
                f.p(str).j();
            } catch (IllegalStateException unused) {
            }
            kVar.c(null);
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(f fVar, k kVar) {
        try {
            p.f.a aVar = new p.f.a();
            aVar.c(fVar.q());
            aVar.d(p(fVar.r()));
            aVar.b(Boolean.valueOf(fVar.x()));
            aVar.e((Map) m.a(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(fVar)));
            kVar.c(aVar.a());
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0044 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x004a A[Catch:{ Exception -> 0x0067 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void s(io.flutter.plugins.firebase.core.p.e r3, java.lang.String r4, d3.k r5) {
        /*
            r2 = this;
            t3.n$b r0 = new t3.n$b     // Catch:{ Exception -> 0x0067 }
            r0.<init>()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.b()     // Catch:{ Exception -> 0x0067 }
            t3.n$b r0 = r0.b(r1)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.c()     // Catch:{ Exception -> 0x0067 }
            t3.n$b r0 = r0.c(r1)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.e()     // Catch:{ Exception -> 0x0067 }
            t3.n$b r0 = r0.d(r1)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.f()     // Catch:{ Exception -> 0x0067 }
            t3.n$b r0 = r0.f(r1)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.g()     // Catch:{ Exception -> 0x0067 }
            t3.n$b r0 = r0.g(r1)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.h()     // Catch:{ Exception -> 0x0067 }
            t3.n$b r0 = r0.h(r1)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r3.i()     // Catch:{ Exception -> 0x0067 }
            t3.n$b r0 = r0.e(r1)     // Catch:{ Exception -> 0x0067 }
            t3.n r0 = r0.a()     // Catch:{ Exception -> 0x0067 }
            android.os.Looper.prepare()     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            java.lang.String r1 = r3.d()     // Catch:{ Exception -> 0x0067 }
            if (r1 == 0) goto L_0x0053
            java.util.Map<java.lang.String, java.lang.String> r1 = f10326o     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r3.d()     // Catch:{ Exception -> 0x0067 }
            r1.put(r4, r3)     // Catch:{ Exception -> 0x0067 }
        L_0x0053:
            android.content.Context r3 = r2.f10327m     // Catch:{ Exception -> 0x0067 }
            t3.f r3 = t3.f.w(r3, r0, r4)     // Catch:{ Exception -> 0x0067 }
            d3.j r3 = r2.o(r3)     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r3 = d3.m.a(r3)     // Catch:{ Exception -> 0x0067 }
            io.flutter.plugins.firebase.core.p$f r3 = (io.flutter.plugins.firebase.core.p.f) r3     // Catch:{ Exception -> 0x0067 }
            r5.c(r3)     // Catch:{ Exception -> 0x0067 }
            goto L_0x006b
        L_0x0067:
            r3 = move-exception
            r5.b(r3)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.core.i.s(io.flutter.plugins.firebase.core.p$e, java.lang.String, d3.k):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t(k kVar) {
        try {
            if (!this.f10328n) {
                this.f10328n = true;
            } else {
                m.a(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            }
            List<f> n10 = f.n(this.f10327m);
            ArrayList arrayList = new ArrayList(n10.size());
            for (f o10 : n10) {
                arrayList.add((p.f) m.a(o(o10)));
            }
            kVar.c(arrayList);
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void u(p.g gVar, j jVar) {
        if (jVar.q()) {
            gVar.a(jVar.n());
        } else {
            gVar.b(jVar.m());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v(k kVar) {
        try {
            n a10 = n.a(this.f10327m);
            if (a10 == null) {
                kVar.c(null);
            } else {
                kVar.c(p(a10));
            }
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void w(String str, Boolean bool, k kVar) {
        try {
            f.p(str).F(bool);
            kVar.c(null);
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void x(String str, Boolean bool, k kVar) {
        try {
            f.p(str).E(bool.booleanValue());
            kVar.c(null);
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    private <T> void y(k<T> kVar, p.g<T> gVar) {
        kVar.a().b(new a(gVar));
    }

    public void a(String str, p.e eVar, p.g<p.f> gVar) {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, eVar, str, kVar));
        y(kVar, gVar);
    }

    public void b(p.g<List<p.f>> gVar) {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, kVar));
        y(kVar, gVar);
    }

    public void c(p.g<p.e> gVar) {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, kVar));
        y(kVar, gVar);
    }

    public void d(String str, Boolean bool, p.g<Void> gVar) {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(str, bool, kVar));
        y(kVar, gVar);
    }

    public void e(String str, Boolean bool, p.g<Void> gVar) {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(str, bool, kVar));
        y(kVar, gVar);
    }

    public void f(String str, p.g<Void> gVar) {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(str, kVar));
        y(kVar, gVar);
    }

    public void onAttachedToEngine(a.b bVar) {
        t.e(bVar.b(), this);
        o.e(bVar.b(), this);
        this.f10327m = bVar.a();
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f10327m = null;
        t.e(bVar.b(), (p.b) null);
        o.e(bVar.b(), (p.a) null);
    }
}
