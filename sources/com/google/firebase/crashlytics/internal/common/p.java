package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import c4.m;
import com.google.firebase.crashlytics.internal.common.v;
import d3.j;
import d3.k;
import d4.f0;
import d4.g0;
import i4.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

class p {

    /* renamed from: t  reason: collision with root package name */
    static final FilenameFilter f7334t = o.f7332a;

    /* renamed from: a  reason: collision with root package name */
    private final Context f7335a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final x f7336b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final s f7337c;

    /* renamed from: d  reason: collision with root package name */
    private final m f7338d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final n f7339e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final b0 f7340f;

    /* renamed from: g  reason: collision with root package name */
    private final g4.f f7341g;

    /* renamed from: h  reason: collision with root package name */
    private final a f7342h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final c4.e f7343i;

    /* renamed from: j  reason: collision with root package name */
    private final z3.a f7344j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final a4.a f7345k;

    /* renamed from: l  reason: collision with root package name */
    private final m f7346l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final j0 f7347m;

    /* renamed from: n  reason: collision with root package name */
    private v f7348n;

    /* renamed from: o  reason: collision with root package name */
    private i f7349o = null;

    /* renamed from: p  reason: collision with root package name */
    final k<Boolean> f7350p = new k<>();

    /* renamed from: q  reason: collision with root package name */
    final k<Boolean> f7351q = new k<>();

    /* renamed from: r  reason: collision with root package name */
    final k<Void> f7352r = new k<>();

    /* renamed from: s  reason: collision with root package name */
    final AtomicBoolean f7353s = new AtomicBoolean(false);

    class a implements v.a {
        a() {
        }

        public void a(i iVar, Thread thread, Throwable th) {
            p.this.J(iVar, thread, th);
        }
    }

    class b implements Callable<j<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f7355a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f7356b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Thread f7357c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f7358d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f7359e;

        class a implements d3.i<i4.d, Void> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Executor f7361a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f7362b;

            a(Executor executor, String str) {
                this.f7361a = executor;
                this.f7362b = str;
            }

            /* renamed from: b */
            public j<Void> a(i4.d dVar) {
                String str = null;
                if (dVar == null) {
                    z3.g.f().k("Received null app settings, cannot send reports at crash time.");
                    return d3.m.e(null);
                }
                j[] jVarArr = new j[2];
                jVarArr[0] = p.this.P();
                j0 h10 = p.this.f7347m;
                Executor executor = this.f7361a;
                if (b.this.f7359e) {
                    str = this.f7362b;
                }
                jVarArr[1] = h10.y(executor, str);
                return d3.m.g(jVarArr);
            }
        }

        b(long j10, Throwable th, Thread thread, i iVar, boolean z9) {
            this.f7355a = j10;
            this.f7356b = th;
            this.f7357c = thread;
            this.f7358d = iVar;
            this.f7359e = z9;
        }

        /* renamed from: a */
        public j<Void> call() {
            long b10 = p.H(this.f7355a);
            String c10 = p.this.D();
            if (c10 == null) {
                z3.g.f().d("Tried to write a fatal exception while no session was open.");
                return d3.m.e(null);
            }
            p.this.f7337c.a();
            p.this.f7347m.t(this.f7356b, this.f7357c, c10, b10);
            p.this.y(this.f7355a);
            p.this.v(this.f7358d);
            p.this.x(new h(p.this.f7340f).toString(), Boolean.valueOf(this.f7359e));
            if (!p.this.f7336b.d()) {
                return d3.m.e(null);
            }
            Executor c11 = p.this.f7339e.c();
            return this.f7358d.a().s(c11, new a(c11, c10));
        }
    }

    class c implements d3.i<Void, Boolean> {
        c() {
        }

        /* renamed from: b */
        public j<Boolean> a(Void voidR) {
            return d3.m.e(Boolean.TRUE);
        }
    }

    class d implements d3.i<Boolean, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f7365a;

        class a implements Callable<j<Void>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Boolean f7367a;

            /* renamed from: com.google.firebase.crashlytics.internal.common.p$d$a$a  reason: collision with other inner class name */
            class C0096a implements d3.i<i4.d, Void> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Executor f7369a;

                C0096a(Executor executor) {
                    this.f7369a = executor;
                }

                /* renamed from: b */
                public j<Void> a(i4.d dVar) {
                    if (dVar == null) {
                        z3.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        j unused = p.this.P();
                        p.this.f7347m.x(this.f7369a);
                        p.this.f7352r.e(null);
                    }
                    return d3.m.e(null);
                }
            }

            a(Boolean bool) {
                this.f7367a = bool;
            }

            /* renamed from: a */
            public j<Void> call() {
                if (!this.f7367a.booleanValue()) {
                    z3.g.f().i("Deleting cached crash reports...");
                    p.s(p.this.N());
                    p.this.f7347m.w();
                    p.this.f7352r.e(null);
                    return d3.m.e(null);
                }
                z3.g.f().b("Sending cached crash reports...");
                p.this.f7336b.c(this.f7367a.booleanValue());
                Executor c10 = p.this.f7339e.c();
                return d.this.f7365a.s(c10, new C0096a(c10));
            }
        }

        d(j jVar) {
            this.f7365a = jVar;
        }

        /* renamed from: b */
        public j<Void> a(Boolean bool) {
            return p.this.f7339e.i(new a(bool));
        }
    }

    class e implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f7371a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f7372b;

        e(long j10, String str) {
            this.f7371a = j10;
            this.f7372b = str;
        }

        /* renamed from: a */
        public Void call() {
            if (p.this.L()) {
                return null;
            }
            p.this.f7343i.g(this.f7371a, this.f7372b);
            return null;
        }
    }

    class f implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f7374m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Throwable f7375n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Thread f7376o;

        f(long j10, Throwable th, Thread thread) {
            this.f7374m = j10;
            this.f7375n = th;
            this.f7376o = thread;
        }

        public void run() {
            if (!p.this.L()) {
                long b10 = p.H(this.f7374m);
                String c10 = p.this.D();
                if (c10 == null) {
                    z3.g.f().k("Tried to write a non-fatal exception while no session was open.");
                } else {
                    p.this.f7347m.u(this.f7375n, this.f7376o, c10, b10);
                }
            }
        }
    }

    class g implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7378a;

        g(String str) {
            this.f7378a = str;
        }

        /* renamed from: a */
        public Void call() {
            p.this.x(this.f7378a, Boolean.FALSE);
            return null;
        }
    }

    class h implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f7380a;

        h(long j10) {
            this.f7380a = j10;
        }

        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f7380a);
            p.this.f7345k.a("_ae", bundle);
            return null;
        }
    }

    p(Context context, n nVar, b0 b0Var, x xVar, g4.f fVar, s sVar, a aVar, m mVar, c4.e eVar, j0 j0Var, z3.a aVar2, a4.a aVar3, m mVar2) {
        this.f7335a = context;
        this.f7339e = nVar;
        this.f7340f = b0Var;
        this.f7336b = xVar;
        this.f7341g = fVar;
        this.f7337c = sVar;
        this.f7342h = aVar;
        this.f7338d = mVar;
        this.f7343i = eVar;
        this.f7344j = aVar2;
        this.f7345k = aVar3;
        this.f7346l = mVar2;
        this.f7347m = j0Var;
    }

    private void A(String str) {
        z3.g f10 = z3.g.f();
        f10.i("Finalizing native report for session " + str);
        z3.h b10 = this.f7344j.b(str);
        File e10 = b10.e();
        f0.a d10 = b10.d();
        if (R(str, e10, d10)) {
            z3.g.f().k("No native core present");
            return;
        }
        long lastModified = e10.lastModified();
        c4.e eVar = new c4.e(this.f7341g, str);
        File i10 = this.f7341g.i(str);
        if (!i10.isDirectory()) {
            z3.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        y(lastModified);
        List<e0> F = F(b10, str, this.f7341g, eVar.b());
        f0.b(i10, F);
        z3.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f7347m.j(str, F, d10);
        eVar.a();
    }

    private static boolean C() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public String D() {
        SortedSet<String> p10 = this.f7347m.p();
        if (!p10.isEmpty()) {
            return p10.first();
        }
        return null;
    }

    private static long E() {
        return H(System.currentTimeMillis());
    }

    static List<e0> F(z3.h hVar, String str, g4.f fVar, byte[] bArr) {
        File o10 = fVar.o(str, "user-data");
        File o11 = fVar.o(str, "keys");
        File o12 = fVar.o(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g("logs_file", "logs", bArr));
        arrayList.add(new a0("crash_meta_file", "metadata", hVar.g()));
        arrayList.add(new a0("session_meta_file", "session", hVar.f()));
        arrayList.add(new a0("app_meta_file", "app", hVar.a()));
        arrayList.add(new a0("device_meta_file", "device", hVar.c()));
        arrayList.add(new a0("os_meta_file", "os", hVar.b()));
        arrayList.add(S(hVar));
        arrayList.add(new a0("user_meta_file", "user", o10));
        arrayList.add(new a0("keys_file", "keys", o11));
        arrayList.add(new a0("rollouts_file", "rollouts", o12));
        return arrayList;
    }

    private InputStream G(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            z3.g.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        z3.g.f().g("No version control information found");
        return null;
    }

    /* access modifiers changed from: private */
    public static long H(long j10) {
        return j10 / 1000;
    }

    private j<Void> O(long j10) {
        if (C()) {
            z3.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return d3.m.e(null);
        }
        z3.g.f().b("Logging app exception event to Firebase Analytics");
        return d3.m.c(new ScheduledThreadPoolExecutor(1), new h(j10));
    }

    /* access modifiers changed from: private */
    public j<Void> P() {
        ArrayList arrayList = new ArrayList();
        for (File next : N()) {
            try {
                arrayList.add(O(Long.parseLong(next.getName().substring(3))));
            } catch (NumberFormatException unused) {
                z3.g f10 = z3.g.f();
                f10.k("Could not parse app exception timestamp from file " + next.getName());
            }
            next.delete();
        }
        return d3.m.f(arrayList);
    }

    private static boolean R(String str, File file, f0.a aVar) {
        if (file == null || !file.exists()) {
            z3.g f10 = z3.g.f();
            f10.k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            z3.g f11 = z3.g.f();
            f11.g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static e0 S(z3.h hVar) {
        File e10 = hVar.e();
        if (e10 != null && e10.exists()) {
            return new a0("minidump_file", "minidump", e10);
        }
        return new g("minidump_file", "minidump", new byte[]{0});
    }

    private static byte[] U(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private j<Boolean> b0() {
        if (this.f7336b.d()) {
            z3.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f7350p.e(Boolean.FALSE);
            return d3.m.e(Boolean.TRUE);
        }
        z3.g.f().b("Automatic data collection is disabled.");
        z3.g.f().i("Notifying that unsent reports are available.");
        this.f7350p.e(Boolean.TRUE);
        j<TContinuationResult> r9 = this.f7336b.j().r(new c());
        z3.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return q0.n(r9, this.f7351q.a());
    }

    private void c0(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            List historicalProcessExitReasons = ((ActivityManager) this.f7335a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f7347m.v(str, historicalProcessExitReasons, new c4.e(this.f7341g, str), m.j(str, this.f7341g, this.f7339e));
                return;
            }
            z3.g f10 = z3.g.f();
            f10.i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        z3.g f11 = z3.g.f();
        f11.i("ANR feature enabled, but device is API " + i10);
    }

    private static g0.a p(b0 b0Var, a aVar) {
        return g0.a.b(b0Var.f(), aVar.f7269f, aVar.f7270g, b0Var.a().c(), y.determineFrom(aVar.f7267d).getId(), aVar.f7271h);
    }

    private static g0.b q(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return g0.b.c(i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), i.b(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), i.w(), i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static g0.c r() {
        return g0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, i.x());
    }

    /* access modifiers changed from: private */
    public static void s(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void w(boolean r4, i4.i r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.firebase.crashlytics.internal.common.j0 r1 = r3.f7347m
            java.util.SortedSet r1 = r1.p()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r4) goto L_0x001b
            z3.g r4 = z3.g.f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.i(r5)
            return
        L_0x001b:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            i4.d r5 = r5.b()
            i4.d$a r5 = r5.f9460b
            boolean r5 = r5.f9468b
            if (r5 == 0) goto L_0x002f
            r3.c0(r1)
            goto L_0x0038
        L_0x002f:
            z3.g r5 = z3.g.f()
            java.lang.String r2 = "ANR feature disabled."
            r5.i(r2)
        L_0x0038:
            z3.a r5 = r3.f7344j
            boolean r5 = r5.d(r1)
            if (r5 == 0) goto L_0x0043
            r3.A(r1)
        L_0x0043:
            r5 = 0
            if (r4 == 0) goto L_0x004f
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0054
        L_0x004f:
            com.google.firebase.crashlytics.internal.common.m r4 = r3.f7346l
            r4.e(r5)
        L_0x0054:
            com.google.firebase.crashlytics.internal.common.j0 r4 = r3.f7347m
            long r0 = E()
            r4.k(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.p.w(boolean, i4.i):void");
    }

    /* access modifiers changed from: private */
    public void x(String str, Boolean bool) {
        long E = E();
        z3.g f10 = z3.g.f();
        f10.b("Opening a new session with ID " + str);
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{r.l()});
        g0.a p10 = p(this.f7340f, this.f7342h);
        g0.c r9 = r();
        g0.b q9 = q(this.f7335a);
        this.f7344j.a(str, format, E, g0.b(p10, r9, q9));
        if (bool.booleanValue() && str != null) {
            this.f7338d.o(str);
        }
        this.f7343i.e(str);
        this.f7346l.e(str);
        this.f7347m.q(str, E);
    }

    /* access modifiers changed from: private */
    public void y(long j10) {
        try {
            g4.f fVar = this.f7341g;
            if (!fVar.e(".ae" + j10).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            z3.g.f().l("Could not create app exception marker file.", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean B(i iVar) {
        this.f7339e.b();
        if (L()) {
            z3.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        z3.g.f().i("Finalizing previously open sessions.");
        try {
            w(true, iVar);
            z3.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            z3.g.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public String I() {
        InputStream G = G("META-INF/version-control-info.textproto");
        if (G == null) {
            return null;
        }
        z3.g.f().b("Read version control info");
        return Base64.encodeToString(U(G), 0);
    }

    /* access modifiers changed from: package-private */
    public void J(i iVar, Thread thread, Throwable th) {
        K(iVar, thread, th, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized void K(i iVar, Thread thread, Throwable th, boolean z9) {
        z3.g f10 = z3.g.f();
        f10.b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            q0.f(this.f7339e.i(new b(System.currentTimeMillis(), th, thread, iVar, z9)));
        } catch (TimeoutException unused) {
            z3.g.f().d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e10) {
            z3.g.f().e("Error handling uncaught exception", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean L() {
        v vVar = this.f7348n;
        return vVar != null && vVar.a();
    }

    /* access modifiers changed from: package-private */
    public List<File> N() {
        return this.f7341g.f(f7334t);
    }

    /* access modifiers changed from: package-private */
    public void Q(Thread thread, Throwable th) {
        i iVar = this.f7349o;
        if (iVar == null) {
            z3.g.f().k("settingsProvider not set");
        } else {
            K(iVar, thread, th, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void T(String str) {
        this.f7339e.h(new g(str));
    }

    /* access modifiers changed from: package-private */
    public void V() {
        try {
            String I = I();
            if (I != null) {
                Y("com.crashlytics.version-control-info", I);
                z3.g.f().g("Saved version control info");
            }
        } catch (IOException e10) {
            z3.g.f().l("Unable to save version control info", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public j<Void> W() {
        this.f7351q.e(Boolean.TRUE);
        return this.f7352r.a();
    }

    /* access modifiers changed from: package-private */
    public void X(String str, String str2) {
        try {
            this.f7338d.m(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f7335a;
            if (context == null || !i.u(context)) {
                z3.g.f().d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    public void Y(String str, String str2) {
        try {
            this.f7338d.n(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f7335a;
            if (context == null || !i.u(context)) {
                z3.g.f().d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    public void Z(String str) {
        this.f7338d.p(str);
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"TaskMainThread"})
    public j<Void> a0(j<i4.d> jVar) {
        if (!this.f7347m.n()) {
            z3.g.f().i("No crash reports are available to be sent.");
            this.f7350p.e(Boolean.FALSE);
            return d3.m.e(null);
        }
        z3.g.f().i("Crash reports are available to be sent.");
        return b0().r(new d(jVar));
    }

    /* access modifiers changed from: package-private */
    public void d0(Thread thread, Throwable th) {
        this.f7339e.g(new f(System.currentTimeMillis(), th, thread));
    }

    /* access modifiers changed from: package-private */
    public void e0(long j10, String str) {
        this.f7339e.h(new e(j10, str));
    }

    /* access modifiers changed from: package-private */
    public j<Boolean> o() {
        if (this.f7353s.compareAndSet(false, true)) {
            return this.f7350p.a();
        }
        z3.g.f().k("checkForUnsentReports should only be called once per execution.");
        return d3.m.e(Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    public j<Void> t() {
        this.f7351q.e(Boolean.FALSE);
        return this.f7352r.a();
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        if (!this.f7337c.c()) {
            String D = D();
            return D != null && this.f7344j.d(D);
        }
        z3.g.f().i("Found previous crash marker.");
        this.f7337c.d();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void v(i iVar) {
        w(false, iVar);
    }

    /* access modifiers changed from: package-private */
    public void z(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, i iVar) {
        this.f7349o = iVar;
        T(str);
        v vVar = new v(new a(), iVar, uncaughtExceptionHandler, this.f7344j);
        this.f7348n = vVar;
        Thread.setDefaultUncaughtExceptionHandler(vVar);
    }
}
