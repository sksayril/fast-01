package y3;

import a4.e;
import a4.f;
import android.os.Bundle;
import b4.b;
import b4.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import s4.a;
import u3.a;
import z3.g;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final a<u3.a> f13233a;

    /* renamed from: b  reason: collision with root package name */
    private volatile a4.a f13234b;

    /* renamed from: c  reason: collision with root package name */
    private volatile b f13235c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b4.a> f13236d;

    public d(a<u3.a> aVar) {
        this(aVar, new c(), new f());
    }

    public d(a<u3.a> aVar, b bVar, a4.a aVar2) {
        this.f13233a = aVar;
        this.f13235c = bVar;
        this.f13236d = new ArrayList();
        this.f13234b = aVar2;
        f();
    }

    private void f() {
        this.f13233a.a(new c(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f13234b.a(str, bundle);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(b4.a aVar) {
        synchronized (this) {
            if (this.f13235c instanceof c) {
                this.f13236d.add(aVar);
            }
            this.f13235c.a(aVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(s4.b bVar) {
        g.f().b("AnalyticsConnector now available.");
        u3.a aVar = (u3.a) bVar.get();
        e eVar = new e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) != null) {
            g.f().b("Registered Firebase Analytics listener.");
            a4.d dVar = new a4.d();
            a4.c cVar = new a4.c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (b4.a a10 : this.f13236d) {
                    dVar.a(a10);
                }
                eVar2.d(dVar);
                eVar2.e(cVar);
                this.f13235c = dVar;
                this.f13234b = cVar;
            }
            return;
        }
        g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static a.C0213a j(u3.a aVar, e eVar) {
        a.C0213a a10 = aVar.a("clx", eVar);
        if (a10 == null) {
            g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a10 = aVar.a("crash", eVar);
            if (a10 != null) {
                g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return a10;
    }

    public a4.a d() {
        return new a(this);
    }

    public b e() {
        return new b(this);
    }
}
