package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import c4.e;
import d3.j;
import d3.m;
import i4.i;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t3.f;
import z3.g;
import z3.k;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7387a;

    /* renamed from: b  reason: collision with root package name */
    private final f f7388b;

    /* renamed from: c  reason: collision with root package name */
    private final x f7389c;

    /* renamed from: d  reason: collision with root package name */
    private final g0 f7390d = new g0();

    /* renamed from: e  reason: collision with root package name */
    private final long f7391e = System.currentTimeMillis();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public s f7392f;

    /* renamed from: g  reason: collision with root package name */
    private s f7393g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7394h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public p f7395i;

    /* renamed from: j  reason: collision with root package name */
    private final b0 f7396j;

    /* renamed from: k  reason: collision with root package name */
    private final g4.f f7397k;

    /* renamed from: l  reason: collision with root package name */
    public final b4.b f7398l;

    /* renamed from: m  reason: collision with root package name */
    private final a4.a f7399m;

    /* renamed from: n  reason: collision with root package name */
    private final ExecutorService f7400n;

    /* renamed from: o  reason: collision with root package name */
    private final n f7401o;

    /* renamed from: p  reason: collision with root package name */
    private final m f7402p;

    /* renamed from: q  reason: collision with root package name */
    private final z3.a f7403q;

    /* renamed from: r  reason: collision with root package name */
    private final k f7404r;

    class a implements Callable<j<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f7405a;

        a(i iVar) {
            this.f7405a = iVar;
        }

        /* renamed from: a */
        public j<Void> call() {
            return r.this.i(this.f7405a);
        }
    }

    class b implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ i f7407m;

        b(i iVar) {
            this.f7407m = iVar;
        }

        public void run() {
            j unused = r.this.i(this.f7407m);
        }
    }

    class c implements Callable<Boolean> {
        c() {
        }

        /* renamed from: a */
        public Boolean call() {
            try {
                boolean d10 = r.this.f7392f.d();
                if (!d10) {
                    g.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d10);
            } catch (Exception e10) {
                g.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    class d implements Callable<Boolean> {
        d() {
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(r.this.f7395i.u());
        }
    }

    public r(f fVar, b0 b0Var, z3.a aVar, x xVar, b4.b bVar, a4.a aVar2, g4.f fVar2, ExecutorService executorService, m mVar, k kVar) {
        this.f7388b = fVar;
        this.f7389c = xVar;
        this.f7387a = fVar.m();
        this.f7396j = b0Var;
        this.f7403q = aVar;
        this.f7398l = bVar;
        this.f7399m = aVar2;
        this.f7400n = executorService;
        this.f7397k = fVar2;
        this.f7401o = new n(executorService);
        this.f7402p = mVar;
        this.f7404r = kVar;
    }

    private void d() {
        boolean z9;
        try {
            z9 = Boolean.TRUE.equals((Boolean) q0.f(this.f7401o.h(new d())));
        } catch (Exception unused) {
            z9 = false;
        }
        this.f7394h = z9;
    }

    /* access modifiers changed from: private */
    public j<Void> i(i iVar) {
        r();
        try {
            this.f7398l.a(new q(this));
            this.f7395i.V();
            if (!iVar.b().f9460b.f9467a) {
                g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return m.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f7395i.B(iVar)) {
                g.f().k("Previous sessions could not be finalized.");
            }
            j<Void> a02 = this.f7395i.a0(iVar.a());
            q();
            return a02;
        } catch (Exception e10) {
            g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
            return m.d(e10);
        } finally {
            q();
        }
    }

    private void k(i iVar) {
        String str;
        g gVar;
        Future<?> submit = this.f7400n.submit(new b(iVar));
        g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3, TimeUnit.SECONDS);
            return;
        } catch (InterruptedException e10) {
            e = e10;
            gVar = g.f();
            str = "Crashlytics was interrupted during initialization.";
        } catch (ExecutionException e11) {
            e = e11;
            gVar = g.f();
            str = "Crashlytics encountered a problem during initialization.";
        } catch (TimeoutException e12) {
            e = e12;
            gVar = g.f();
            str = "Crashlytics timed out during initialization.";
        }
        gVar.e(str, e);
    }

    public static String l() {
        return "18.6.0";
    }

    static boolean m(String str, boolean z9) {
        if (!z9) {
            g.f().i("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        }
    }

    public j<Boolean> e() {
        return this.f7395i.o();
    }

    public j<Void> f() {
        return this.f7395i.t();
    }

    public boolean g() {
        return this.f7394h;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.f7392f.c();
    }

    public j<Void> j(i iVar) {
        return q0.h(this.f7400n, new a(iVar));
    }

    public void n(String str) {
        this.f7395i.e0(System.currentTimeMillis() - this.f7391e, str);
    }

    public void o(Throwable th) {
        this.f7395i.d0(Thread.currentThread(), th);
    }

    public void p(Throwable th) {
        g f10 = g.f();
        f10.b("Recorded on-demand fatal events: " + this.f7390d.b());
        g f11 = g.f();
        f11.b("Dropped on-demand fatal events: " + this.f7390d.a());
        this.f7395i.Y("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(this.f7390d.b()));
        this.f7395i.Y("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(this.f7390d.a()));
        this.f7395i.Q(Thread.currentThread(), th);
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f7401o.h(new c());
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f7401o.b();
        this.f7392f.a();
        g.f().i("Initialization marker file was created.");
    }

    public boolean s(a aVar, i iVar) {
        i iVar2 = iVar;
        if (m(aVar.f7265b, i.i(this.f7387a, "com.crashlytics.RequireBuildId", true))) {
            String hVar = new h(this.f7396j).toString();
            try {
                this.f7393g = new s("crash_marker", this.f7397k);
                this.f7392f = new s("initialization_marker", this.f7397k);
                c4.m mVar = new c4.m(hVar, this.f7397k, this.f7401o);
                e eVar = new e(this.f7397k);
                j4.a aVar2 = new j4.a(1024, new j4.c(10));
                this.f7404r.c(mVar);
                j0 h10 = j0.h(this.f7387a, this.f7396j, this.f7397k, aVar, eVar, mVar, aVar2, iVar, this.f7390d, this.f7402p);
                Context context = this.f7387a;
                n nVar = this.f7401o;
                b0 b0Var = this.f7396j;
                x xVar = this.f7389c;
                g4.f fVar = this.f7397k;
                s sVar = this.f7393g;
                String str = hVar;
                Context context2 = context;
                n nVar2 = nVar;
                b0 b0Var2 = b0Var;
                x xVar2 = xVar;
                g4.f fVar2 = fVar;
                s sVar2 = sVar;
                a aVar3 = aVar;
                this.f7395i = new p(context2, nVar2, b0Var2, xVar2, fVar2, sVar2, aVar3, mVar, eVar, h10, this.f7403q, this.f7399m, this.f7402p);
                boolean h11 = h();
                d();
                this.f7395i.z(str, Thread.getDefaultUncaughtExceptionHandler(), iVar2);
                if (!h11 || !i.d(this.f7387a)) {
                    g.f().b("Successfully configured exception handler.");
                    return true;
                }
                g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                k(iVar2);
                return false;
            } catch (Exception e10) {
                g.f().e("Crashlytics was not started due to an exception during initialization", e10);
                this.f7395i = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
    }

    public j<Void> t() {
        return this.f7395i.W();
    }

    public void u(Boolean bool) {
        this.f7389c.h(bool);
    }

    public void v(String str, String str2) {
        this.f7395i.X(str, str2);
    }

    public void w(String str, String str2) {
        this.f7395i.Y(str, str2);
    }

    public void x(String str) {
        this.f7395i.Z(str);
    }
}
