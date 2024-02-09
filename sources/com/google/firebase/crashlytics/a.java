package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.crashlytics.internal.common.b0;
import com.google.firebase.crashlytics.internal.common.i;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.common.r;
import com.google.firebase.crashlytics.internal.common.x;
import com.google.firebase.crashlytics.internal.common.z;
import d3.j;
import i4.f;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import t4.d;
import z3.g;
import z3.k;

public class a {

    /* renamed from: a  reason: collision with root package name */
    final r f7260a;

    /* renamed from: com.google.firebase.crashlytics.a$a  reason: collision with other inner class name */
    class C0095a implements d3.b<Void, Object> {
        C0095a() {
        }

        public Object a(j<Void> jVar) {
            if (jVar.q()) {
                return null;
            }
            g.f().e("Error fetching settings.", jVar.m());
            return null;
        }
    }

    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f7261a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f7262b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f7263c;

        b(boolean z9, r rVar, f fVar) {
            this.f7261a = z9;
            this.f7262b = rVar;
            this.f7263c = fVar;
        }

        /* renamed from: a */
        public Void call() {
            if (!this.f7261a) {
                return null;
            }
            this.f7262b.j(this.f7263c);
            return null;
        }
    }

    private a(r rVar) {
        this.f7260a = rVar;
    }

    public static a d() {
        a aVar = (a) t3.f.o().k(a.class);
        Objects.requireNonNull(aVar, "FirebaseCrashlytics component is not present.");
        return aVar;
    }

    static a e(t3.f fVar, d dVar, s4.a<z3.a> aVar, s4.a<u3.a> aVar2, s4.a<a5.a> aVar3) {
        Context m10 = fVar.m();
        String packageName = m10.getPackageName();
        g f10 = g.f();
        f10.g("Initializing Firebase Crashlytics " + r.l() + " for " + packageName);
        g4.f fVar2 = new g4.f(m10);
        x xVar = new x(fVar);
        b0 b0Var = new b0(m10, packageName, dVar, xVar);
        z3.d dVar2 = new z3.d(aVar);
        y3.d dVar3 = new y3.d(aVar2);
        ExecutorService c10 = z.c("Crashlytics Exception Handler");
        m mVar = new m(xVar, fVar2);
        d5.a.e(mVar);
        k kVar = new k(aVar3);
        r rVar = r4;
        b0 b0Var2 = b0Var;
        r rVar2 = new r(fVar, b0Var, dVar2, xVar, dVar3.e(), dVar3.d(), fVar2, c10, mVar, kVar);
        String c11 = fVar.r().c();
        String m11 = i.m(m10);
        List<com.google.firebase.crashlytics.internal.common.f> j10 = i.j(m10);
        g f11 = g.f();
        f11.b("Mapping file ID is: " + m11);
        for (com.google.firebase.crashlytics.internal.common.f next : j10) {
            g.f().b(String.format("Build id for %s on %s: %s", new Object[]{next.c(), next.a(), next.b()}));
        }
        x xVar2 = xVar;
        try {
            com.google.firebase.crashlytics.internal.common.a a10 = com.google.firebase.crashlytics.internal.common.a.a(m10, b0Var2, c11, m11, j10, new z3.f(m10));
            g f12 = g.f();
            f12.i("Installer package name is: " + a10.f7267d);
            ExecutorService c12 = z.c("com.google.firebase.crashlytics.startup");
            f l10 = f.l(m10, c11, b0Var2, new f4.b(), a10.f7269f, a10.f7270g, fVar2, xVar2);
            l10.p(c12).k(c12, new C0095a());
            r rVar3 = rVar;
            d3.m.c(c12, new b(rVar3.s(a10, l10), rVar3, l10));
            return new a(rVar3);
        } catch (PackageManager.NameNotFoundException e10) {
            g.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    public j<Boolean> a() {
        return this.f7260a.e();
    }

    public void b() {
        this.f7260a.f();
    }

    public boolean c() {
        return this.f7260a.g();
    }

    public void f(String str) {
        this.f7260a.n(str);
    }

    public void g(Throwable th) {
        if (th == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f7260a.o(th);
        }
    }

    public void h() {
        this.f7260a.t();
    }

    public void i(Boolean bool) {
        this.f7260a.u(bool);
    }

    public void j(boolean z9) {
        this.f7260a.u(Boolean.valueOf(z9));
    }

    public void k(String str, String str2) {
        this.f7260a.v(str, str2);
    }

    public void l(String str) {
        this.f7260a.x(str);
    }
}
