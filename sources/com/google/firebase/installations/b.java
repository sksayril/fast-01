package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.firebase.installations.c;
import d3.j;
import d3.k;
import d3.m;
import h2.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import r4.i;
import t3.f;
import t4.d;
import w3.x;
import w4.c;

public class b implements d {

    /* renamed from: m  reason: collision with root package name */
    private static final Object f7444m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadFactory f7445n = new a();

    /* renamed from: a  reason: collision with root package name */
    private final f f7446a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7447b;

    /* renamed from: c  reason: collision with root package name */
    private final v4.c f7448c;

    /* renamed from: d  reason: collision with root package name */
    private final f f7449d;

    /* renamed from: e  reason: collision with root package name */
    private final x<v4.b> f7450e;

    /* renamed from: f  reason: collision with root package name */
    private final t4.f f7451f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f7452g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f7453h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f7454i;

    /* renamed from: j  reason: collision with root package name */
    private String f7455j;

    /* renamed from: k  reason: collision with root package name */
    private Set<u4.a> f7456k;

    /* renamed from: l  reason: collision with root package name */
    private final List<e> f7457l;

    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f7458a = new AtomicInteger(1);

        a() {
        }

        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f7458a.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.b$b  reason: collision with other inner class name */
    static /* synthetic */ class C0098b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7459a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f7460b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                w4.f$b[] r0 = w4.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7460b = r0
                r1 = 1
                w4.f$b r2 = w4.f.b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7460b     // Catch:{ NoSuchFieldError -> 0x001d }
                w4.f$b r3 = w4.f.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f7460b     // Catch:{ NoSuchFieldError -> 0x0028 }
                w4.f$b r3 = w4.f.b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                w4.d$b[] r2 = w4.d.b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f7459a = r2
                w4.d$b r3 = w4.d.b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f7459a     // Catch:{ NoSuchFieldError -> 0x0043 }
                w4.d$b r2 = w4.d.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.b.C0098b.<clinit>():void");
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    b(ExecutorService executorService, Executor executor, f fVar, c cVar, v4.c cVar2, f fVar2, x<v4.b> xVar, t4.f fVar3) {
        this.f7452g = new Object();
        this.f7456k = new HashSet();
        this.f7457l = new ArrayList();
        this.f7446a = fVar;
        this.f7447b = cVar;
        this.f7448c = cVar2;
        this.f7449d = fVar2;
        this.f7450e = xVar;
        this.f7451f = fVar3;
        this.f7453h = executorService;
        this.f7454i = executor;
    }

    @SuppressLint({"ThreadPoolCreation"})
    b(f fVar, s4.b<i> bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new c(fVar.m(), bVar), new v4.c(fVar), f.c(), new x(new t4.c(fVar)), new t4.f());
    }

    private void A(v4.d dVar) {
        synchronized (this.f7452g) {
            Iterator<e> it = this.f7457l.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void B(String str) {
        this.f7455j = str;
    }

    private synchronized void C(v4.d dVar, v4.d dVar2) {
        if (this.f7456k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            for (u4.a a10 : this.f7456k) {
                a10.a(dVar2.d());
            }
        }
    }

    private j<String> e() {
        k kVar = new k();
        f(new d(kVar));
        return kVar.a();
    }

    private void f(e eVar) {
        synchronized (this.f7452g) {
            this.f7457l.add(eVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t(boolean r3) {
        /*
            r2 = this;
            v4.d r0 = r2.p()
            boolean r1 = r0.i()     // Catch:{ c -> 0x005c }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.l()     // Catch:{ c -> 0x005c }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.f r3 = r2.f7449d     // Catch:{ c -> 0x005c }
            boolean r3 = r3.f(r0)     // Catch:{ c -> 0x005c }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            v4.d r3 = r2.i(r0)     // Catch:{ c -> 0x005c }
            goto L_0x0026
        L_0x0022:
            v4.d r3 = r2.y(r0)     // Catch:{ c -> 0x005c }
        L_0x0026:
            r2.s(r3)
            r2.C(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.d()
            r2.B(r0)
        L_0x0039:
            boolean r0 = r3.i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.c r3 = new com.google.firebase.installations.c
            com.google.firebase.installations.c$a r0 = com.google.firebase.installations.c.a.BAD_CONFIG
            r3.<init>(r0)
        L_0x0046:
            r2.z(r3)
            goto L_0x005b
        L_0x004a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x0058
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            goto L_0x0046
        L_0x0058:
            r2.A(r3)
        L_0x005b:
            return
        L_0x005c:
            r3 = move-exception
            r2.z(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.b.t(boolean):void");
    }

    private final void h(boolean z9) {
        v4.d q9 = q();
        if (z9) {
            q9 = q9.p();
        }
        A(q9);
        this.f7454i.execute(new t4.b(this, z9));
    }

    private v4.d i(v4.d dVar) {
        w4.f e10 = this.f7447b.e(j(), dVar.d(), r(), dVar.f());
        int i10 = C0098b.f7460b[e10.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(e10.c(), e10.d(), this.f7449d.b());
        } else if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            if (i10 == 3) {
                B((String) null);
                return dVar.r();
            }
            throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
        }
    }

    private synchronized String l() {
        return this.f7455j;
    }

    private v4.b m() {
        return this.f7450e.get();
    }

    public static b n() {
        return o(f.o());
    }

    public static b o(f fVar) {
        p.b(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (b) fVar.k(d.class);
    }

    private v4.d p() {
        v4.d d10;
        synchronized (f7444m) {
            a a10 = a.a(this.f7446a.m(), "generatefid.lock");
            try {
                d10 = this.f7448c.d();
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th) {
                if (a10 != null) {
                    a10.b();
                }
                throw th;
            }
        }
        return d10;
    }

    private v4.d q() {
        v4.d d10;
        synchronized (f7444m) {
            a a10 = a.a(this.f7446a.m(), "generatefid.lock");
            try {
                d10 = this.f7448c.d();
                if (d10.j()) {
                    d10 = this.f7448c.b(d10.t(x(d10)));
                }
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th) {
                if (a10 != null) {
                    a10.b();
                }
                throw th;
            }
        }
        return d10;
    }

    private void s(v4.d dVar) {
        synchronized (f7444m) {
            a a10 = a.a(this.f7446a.m(), "generatefid.lock");
            try {
                this.f7448c.b(dVar);
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th) {
                if (a10 != null) {
                    a10.b();
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u() {
        h(false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ v4.b v(f fVar) {
        return new v4.b(fVar);
    }

    private void w() {
        p.g(k(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.g(r(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.g(j(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.b(f.h(k()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.b(f.g(j()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String x(v4.d dVar) {
        if ((!this.f7446a.q().equals("CHIME_ANDROID_SDK") && !this.f7446a.y()) || !dVar.m()) {
            return this.f7451f.a();
        }
        String f10 = m().f();
        return TextUtils.isEmpty(f10) ? this.f7451f.a() : f10;
    }

    private v4.d y(v4.d dVar) {
        w4.d d10 = this.f7447b.d(j(), dVar.d(), r(), k(), (dVar.d() == null || dVar.d().length() != 11) ? null : m().i());
        int i10 = C0098b.f7459a[d10.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(d10.c(), d10.d(), this.f7449d.b(), d10.b().c(), d10.b().d());
        } else if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
        }
    }

    private void z(Exception exc) {
        synchronized (this.f7452g) {
            Iterator<e> it = this.f7457l.iterator();
            while (it.hasNext()) {
                if (it.next().b(exc)) {
                    it.remove();
                }
            }
        }
    }

    public j<String> a() {
        w();
        String l10 = l();
        if (l10 != null) {
            return m.e(l10);
        }
        j<String> e10 = e();
        this.f7453h.execute(new t4.a(this));
        return e10;
    }

    /* access modifiers changed from: package-private */
    public String j() {
        return this.f7446a.r().b();
    }

    /* access modifiers changed from: package-private */
    public String k() {
        return this.f7446a.r().c();
    }

    /* access modifiers changed from: package-private */
    public String r() {
        return this.f7446a.r().g();
    }
}
