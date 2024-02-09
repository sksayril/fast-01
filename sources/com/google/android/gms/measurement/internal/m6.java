package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.ee;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.internal.measurement.kd;
import h2.p;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import l2.d;
import l2.g;
import n2.c;
import org.json.JSONException;
import org.json.JSONObject;

public class m6 implements n7 {
    private static volatile m6 I;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private volatile boolean D;
    private int E;
    private int F;
    private AtomicInteger G = new AtomicInteger(0);
    final long H;

    /* renamed from: a  reason: collision with root package name */
    private final Context f6294a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6295b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6296c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6297d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6298e;

    /* renamed from: f  reason: collision with root package name */
    private final f f6299f;

    /* renamed from: g  reason: collision with root package name */
    private final g f6300g;

    /* renamed from: h  reason: collision with root package name */
    private final k5 f6301h;

    /* renamed from: i  reason: collision with root package name */
    private final x4 f6302i;

    /* renamed from: j  reason: collision with root package name */
    private final f6 f6303j;

    /* renamed from: k  reason: collision with root package name */
    private final gb f6304k;

    /* renamed from: l  reason: collision with root package name */
    private final oc f6305l;

    /* renamed from: m  reason: collision with root package name */
    private final w4 f6306m;

    /* renamed from: n  reason: collision with root package name */
    private final d f6307n;

    /* renamed from: o  reason: collision with root package name */
    private final q9 f6308o;

    /* renamed from: p  reason: collision with root package name */
    private final y7 f6309p;

    /* renamed from: q  reason: collision with root package name */
    private final b0 f6310q;

    /* renamed from: r  reason: collision with root package name */
    private final l9 f6311r;

    /* renamed from: s  reason: collision with root package name */
    private final String f6312s;

    /* renamed from: t  reason: collision with root package name */
    private u4 f6313t;

    /* renamed from: u  reason: collision with root package name */
    private y9 f6314u;

    /* renamed from: v  reason: collision with root package name */
    private c0 f6315v;

    /* renamed from: w  reason: collision with root package name */
    private r4 f6316w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f6317x = false;

    /* renamed from: y  reason: collision with root package name */
    private Boolean f6318y;

    /* renamed from: z  reason: collision with root package name */
    private long f6319z;

    private m6(w7 w7Var) {
        String str;
        z4 z4Var;
        Bundle bundle;
        boolean z9 = false;
        p.j(w7Var);
        f fVar = new f(w7Var.f6662a);
        this.f6299f = fVar;
        l4.f6272a = fVar;
        Context context = w7Var.f6662a;
        this.f6294a = context;
        this.f6295b = w7Var.f6663b;
        this.f6296c = w7Var.f6664c;
        this.f6297d = w7Var.f6665d;
        this.f6298e = w7Var.f6669h;
        this.A = w7Var.f6666e;
        this.f6312s = w7Var.f6671j;
        this.D = true;
        f2 f2Var = w7Var.f6668g;
        if (!(f2Var == null || (bundle = f2Var.f5227s) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = f2Var.f5227s.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        f6.l(context);
        d d10 = g.d();
        this.f6307n = d10;
        Long l10 = w7Var.f6670i;
        this.H = l10 != null ? l10.longValue() : d10.a();
        this.f6300g = new g(this);
        k5 k5Var = new k5(this);
        k5Var.o();
        this.f6301h = k5Var;
        x4 x4Var = new x4(this);
        x4Var.o();
        this.f6302i = x4Var;
        oc ocVar = new oc(this);
        ocVar.o();
        this.f6305l = ocVar;
        this.f6306m = new w4(new v7(w7Var, this));
        this.f6310q = new b0(this);
        q9 q9Var = new q9(this);
        q9Var.v();
        this.f6308o = q9Var;
        y7 y7Var = new y7(this);
        y7Var.v();
        this.f6309p = y7Var;
        gb gbVar = new gb(this);
        gbVar.v();
        this.f6304k = gbVar;
        l9 l9Var = new l9(this);
        l9Var.o();
        this.f6311r = l9Var;
        f6 f6Var = new f6(this);
        f6Var.o();
        this.f6303j = f6Var;
        f2 f2Var2 = w7Var.f6668g;
        if (!(f2Var2 == null || f2Var2.f5222n == 0)) {
            z9 = true;
        }
        boolean z10 = !z9;
        if (context.getApplicationContext() instanceof Application) {
            y7 G2 = G();
            if (G2.zza().getApplicationContext() instanceof Application) {
                Application application = (Application) G2.zza().getApplicationContext();
                if (G2.f6731c == null) {
                    G2.f6731c = new f9(G2);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(G2.f6731c);
                    application.registerActivityLifecycleCallbacks(G2.f6731c);
                    z4Var = G2.k().J();
                    str = "Registered activity lifecycle callback";
                }
            }
            f6Var.C(new n6(this, w7Var));
        }
        z4Var = k().K();
        str = "Application context is not an Application";
        z4Var.a(str);
        f6Var.C(new n6(this, w7Var));
    }

    public static m6 b(Context context, f2 f2Var, Long l10) {
        Bundle bundle;
        if (f2Var != null && (f2Var.f5225q == null || f2Var.f5226r == null)) {
            f2Var = new f2(f2Var.f5221m, f2Var.f5222n, f2Var.f5223o, f2Var.f5224p, (String) null, (String) null, f2Var.f5227s, (String) null);
        }
        p.j(context);
        p.j(context.getApplicationContext());
        if (I == null) {
            synchronized (m6.class) {
                if (I == null) {
                    I = new m6(new w7(context, f2Var, l10));
                }
            }
        } else if (!(f2Var == null || (bundle = f2Var.f5227s) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            p.j(I);
            I.l(f2Var.f5227s.getBoolean("dataCollectionDefaultEnabled"));
        }
        p.j(I);
        return I;
    }

    private static void e(e3 e3Var) {
        if (e3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!e3Var.y()) {
            String valueOf = String.valueOf(e3Var.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    static /* synthetic */ void f(m6 m6Var, w7 w7Var) {
        m6Var.i().m();
        c0 c0Var = new c0(m6Var);
        c0Var.o();
        m6Var.f6315v = c0Var;
        r4 r4Var = new r4(m6Var, w7Var.f6667f);
        r4Var.v();
        m6Var.f6316w = r4Var;
        u4 u4Var = new u4(m6Var);
        u4Var.v();
        m6Var.f6313t = u4Var;
        y9 y9Var = new y9(m6Var);
        y9Var.v();
        m6Var.f6314u = y9Var;
        m6Var.f6305l.p();
        m6Var.f6301h.p();
        m6Var.f6316w.w();
        m6Var.k().I().b("App measurement initialized, version", 82001L);
        m6Var.k().I().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String E2 = r4Var.E();
        if (TextUtils.isEmpty(m6Var.f6295b)) {
            if (m6Var.K().E0(E2)) {
                m6Var.k().I().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                z4 I2 = m6Var.k().I();
                I2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + E2);
            }
        }
        m6Var.k().E().a("Debug-level message logging enabled");
        if (m6Var.E != m6Var.G.get()) {
            m6Var.k().F().c("Not all components initialized", Integer.valueOf(m6Var.E), Integer.valueOf(m6Var.G.get()));
        }
        m6Var.f6317x = true;
    }

    private static void g(k7 k7Var) {
        if (k7Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!k7Var.q()) {
            String valueOf = String.valueOf(k7Var.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    private static void h(l7 l7Var) {
        if (l7Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private final l9 u() {
        g(this.f6311r);
        return this.f6311r;
    }

    public final r4 A() {
        e(this.f6316w);
        return this.f6316w;
    }

    public final u4 B() {
        e(this.f6313t);
        return this.f6313t;
    }

    public final w4 C() {
        return this.f6306m;
    }

    public final x4 D() {
        x4 x4Var = this.f6302i;
        if (x4Var == null || !x4Var.q()) {
            return null;
        }
        return this.f6302i;
    }

    public final k5 E() {
        h(this.f6301h);
        return this.f6301h;
    }

    /* access modifiers changed from: package-private */
    public final f6 F() {
        return this.f6303j;
    }

    public final y7 G() {
        e(this.f6309p);
        return this.f6309p;
    }

    public final q9 H() {
        e(this.f6308o);
        return this.f6308o;
    }

    public final y9 I() {
        e(this.f6314u);
        return this.f6314u;
    }

    public final gb J() {
        e(this.f6304k);
        return this.f6304k;
    }

    public final oc K() {
        h(this.f6305l);
        return this.f6305l;
    }

    public final String L() {
        return this.f6295b;
    }

    public final String M() {
        return this.f6296c;
    }

    public final String N() {
        return this.f6297d;
    }

    public final String O() {
        return this.f6312s;
    }

    /* access modifiers changed from: package-private */
    public final void P() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    public final void Q() {
        this.G.incrementAndGet();
    }

    public final d a() {
        return this.f6307n;
    }

    public final f c() {
        return this.f6299f;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d8, code lost:
        if (r1.z() != false) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(com.google.android.gms.internal.measurement.f2 r10) {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.f6 r0 = r9.i()
            r0.m()
            boolean r0 = com.google.android.gms.internal.measurement.df.a()
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.measurement.internal.g r0 = r9.f6300g
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.k0.M0
            boolean r0 = r0.r(r1)
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.measurement.internal.oc r0 = r9.K()
            boolean r0 = r0.U0()
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.measurement.internal.oc r0 = r9.K()
            r0.m()
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r2 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            r1.addAction(r2)
            com.google.android.gms.measurement.internal.tc r2 = new com.google.android.gms.measurement.internal.tc
            com.google.android.gms.measurement.internal.m6 r3 = r0.f6276a
            r2.<init>(r3)
            android.content.Context r3 = r0.zza()
            r4 = 2
            androidx.core.content.a.j(r3, r2, r1, r4)
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.E()
            java.lang.String r1 = "Registered app receiver"
            r0.a(r1)
        L_0x004e:
            com.google.android.gms.measurement.internal.k5 r0 = r9.E()
            com.google.android.gms.measurement.internal.p7 r0 = r0.I()
            int r1 = r0.b()
            com.google.android.gms.measurement.internal.g r2 = r9.f6300g
            java.lang.String r3 = "google_analytics_default_allow_ad_storage"
            java.lang.Boolean r2 = r2.E(r3)
            com.google.android.gms.measurement.internal.g r3 = r9.f6300g
            java.lang.String r4 = "google_analytics_default_allow_analytics_storage"
            java.lang.Boolean r3 = r3.E(r4)
            r4 = -10
            r5 = 0
            r6 = 30
            if (r2 != 0) goto L_0x0073
            if (r3 == 0) goto L_0x0083
        L_0x0073:
            com.google.android.gms.measurement.internal.k5 r7 = r9.E()
            boolean r7 = r7.w(r4)
            if (r7 == 0) goto L_0x0083
            com.google.android.gms.measurement.internal.p7 r1 = new com.google.android.gms.measurement.internal.p7
            r1.<init>(r2, r3, r4)
            goto L_0x00dc
        L_0x0083:
            com.google.android.gms.measurement.internal.r4 r2 = r9.A()
            java.lang.String r2 = r2.F()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00b0
            if (r1 == 0) goto L_0x00a1
            if (r1 == r6) goto L_0x00a1
            r2 = 10
            if (r1 == r2) goto L_0x00a1
            if (r1 == r6) goto L_0x00a1
            if (r1 == r6) goto L_0x00a1
            r2 = 40
            if (r1 != r2) goto L_0x00b0
        L_0x00a1:
            com.google.android.gms.measurement.internal.y7 r1 = r9.G()
            com.google.android.gms.measurement.internal.p7 r2 = new com.google.android.gms.measurement.internal.p7
            r2.<init>(r5, r5, r4)
            long r7 = r9.H
            r1.J(r2, r7)
            goto L_0x00db
        L_0x00b0:
            com.google.android.gms.measurement.internal.r4 r1 = r9.A()
            java.lang.String r1 = r1.F()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00db
            if (r10 == 0) goto L_0x00db
            android.os.Bundle r1 = r10.f5227s
            if (r1 == 0) goto L_0x00db
            com.google.android.gms.measurement.internal.k5 r1 = r9.E()
            boolean r1 = r1.w(r6)
            if (r1 == 0) goto L_0x00db
            android.os.Bundle r1 = r10.f5227s
            com.google.android.gms.measurement.internal.p7 r1 = com.google.android.gms.measurement.internal.p7.c(r1, r6)
            boolean r2 = r1.z()
            if (r2 == 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r1 = r5
        L_0x00dc:
            if (r1 == 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.y7 r0 = r9.G()
            long r2 = r9.H
            r0.J(r1, r2)
            r0 = r1
        L_0x00e8:
            com.google.android.gms.measurement.internal.y7 r1 = r9.G()
            r1.I(r0)
            boolean r0 = com.google.android.gms.internal.measurement.kd.a()
            r1 = 0
            if (r0 == 0) goto L_0x01aa
            com.google.android.gms.measurement.internal.g r0 = r9.f6300g
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.k0.S0
            boolean r0 = r0.r(r2)
            if (r0 == 0) goto L_0x01aa
            com.google.android.gms.measurement.internal.k5 r0 = r9.E()
            com.google.android.gms.measurement.internal.z r0 = r0.H()
            int r0 = r0.a()
            com.google.android.gms.measurement.internal.g r2 = r9.f6300g
            java.lang.String r3 = "google_analytics_default_allow_ad_user_data"
            java.lang.Boolean r2 = r2.E(r3)
            if (r2 == 0) goto L_0x012a
            boolean r3 = com.google.android.gms.measurement.internal.p7.k(r4, r0)
            if (r3 == 0) goto L_0x012a
            com.google.android.gms.measurement.internal.y7 r10 = r9.G()
            com.google.android.gms.measurement.internal.z r0 = new com.google.android.gms.measurement.internal.z
            r0.<init>((java.lang.Boolean) r2, (int) r4)
        L_0x0125:
            r10.H(r0)
            goto L_0x01aa
        L_0x012a:
            com.google.android.gms.measurement.internal.r4 r2 = r9.A()
            java.lang.String r2 = r2.F()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0146
            if (r0 == 0) goto L_0x013c
            if (r0 != r6) goto L_0x0146
        L_0x013c:
            com.google.android.gms.measurement.internal.y7 r10 = r9.G()
            com.google.android.gms.measurement.internal.z r0 = new com.google.android.gms.measurement.internal.z
            r0.<init>((java.lang.Boolean) r5, (int) r4)
            goto L_0x0125
        L_0x0146:
            com.google.android.gms.measurement.internal.r4 r2 = r9.A()
            java.lang.String r2 = r2.F()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0173
            if (r10 == 0) goto L_0x0173
            android.os.Bundle r2 = r10.f5227s
            if (r2 == 0) goto L_0x0173
            boolean r0 = com.google.android.gms.measurement.internal.p7.k(r6, r0)
            if (r0 == 0) goto L_0x0173
            android.os.Bundle r0 = r10.f5227s
            com.google.android.gms.measurement.internal.z r0 = com.google.android.gms.measurement.internal.z.b(r0, r6)
            boolean r2 = r0.j()
            if (r2 == 0) goto L_0x0173
            com.google.android.gms.measurement.internal.y7 r2 = r9.G()
            r2.H(r0)
        L_0x0173:
            com.google.android.gms.measurement.internal.r4 r0 = r9.A()
            java.lang.String r0 = r0.F()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01aa
            if (r10 == 0) goto L_0x01aa
            android.os.Bundle r0 = r10.f5227s
            if (r0 == 0) goto L_0x01aa
            com.google.android.gms.measurement.internal.k5 r0 = r9.E()
            com.google.android.gms.measurement.internal.q5 r0 = r0.f6242m
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L_0x01aa
            android.os.Bundle r0 = r10.f5227s
            java.lang.Boolean r0 = com.google.android.gms.measurement.internal.z.d(r0)
            if (r0 == 0) goto L_0x01aa
            com.google.android.gms.measurement.internal.y7 r2 = r9.G()
            java.lang.String r10 = r10.f5225q
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "allow_personalized_ads"
            r2.a0(r10, r3, r0, r1)
        L_0x01aa:
            com.google.android.gms.measurement.internal.k5 r10 = r9.E()
            com.google.android.gms.measurement.internal.p5 r10 = r10.f6234e
            long r2 = r10.a()
            r6 = 0
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x01d8
            com.google.android.gms.measurement.internal.x4 r10 = r9.k()
            com.google.android.gms.measurement.internal.z4 r10 = r10.J()
            long r2 = r9.H
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "Persisting first open"
            r10.b(r2, r0)
            com.google.android.gms.measurement.internal.k5 r10 = r9.E()
            com.google.android.gms.measurement.internal.p5 r10 = r10.f6234e
            long r2 = r9.H
            r10.b(r2)
        L_0x01d8:
            com.google.android.gms.measurement.internal.y7 r10 = r9.G()
            com.google.android.gms.measurement.internal.yc r10 = r10.f6742n
            r10.c()
            boolean r10 = r9.r()
            if (r10 != 0) goto L_0x026c
            boolean r10 = r9.o()
            if (r10 == 0) goto L_0x03dc
            com.google.android.gms.measurement.internal.oc r10 = r9.K()
            java.lang.String r0 = "android.permission.INTERNET"
            boolean r10 = r10.D0(r0)
            if (r10 != 0) goto L_0x0206
            com.google.android.gms.measurement.internal.x4 r10 = r9.k()
            com.google.android.gms.measurement.internal.z4 r10 = r10.F()
            java.lang.String r0 = "App is missing INTERNET permission"
            r10.a(r0)
        L_0x0206:
            com.google.android.gms.measurement.internal.oc r10 = r9.K()
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r10 = r10.D0(r0)
            if (r10 != 0) goto L_0x021f
            com.google.android.gms.measurement.internal.x4 r10 = r9.k()
            com.google.android.gms.measurement.internal.z4 r10 = r10.F()
            java.lang.String r0 = "App is missing ACCESS_NETWORK_STATE permission"
            r10.a(r0)
        L_0x021f:
            android.content.Context r10 = r9.f6294a
            n2.b r10 = n2.c.a(r10)
            boolean r10 = r10.e()
            if (r10 != 0) goto L_0x025d
            com.google.android.gms.measurement.internal.g r10 = r9.f6300g
            boolean r10 = r10.R()
            if (r10 != 0) goto L_0x025d
            android.content.Context r10 = r9.f6294a
            boolean r10 = com.google.android.gms.measurement.internal.oc.b0(r10)
            if (r10 != 0) goto L_0x0248
            com.google.android.gms.measurement.internal.x4 r10 = r9.k()
            com.google.android.gms.measurement.internal.z4 r10 = r10.F()
            java.lang.String r0 = "AppMeasurementReceiver not registered/enabled"
            r10.a(r0)
        L_0x0248:
            android.content.Context r10 = r9.f6294a
            boolean r10 = com.google.android.gms.measurement.internal.oc.c0(r10, r1)
            if (r10 != 0) goto L_0x025d
            com.google.android.gms.measurement.internal.x4 r10 = r9.k()
            com.google.android.gms.measurement.internal.z4 r10 = r10.F()
            java.lang.String r0 = "AppMeasurementService not registered/enabled"
            r10.a(r0)
        L_0x025d:
            com.google.android.gms.measurement.internal.x4 r10 = r9.k()
            com.google.android.gms.measurement.internal.z4 r10 = r10.F()
            java.lang.String r0 = "Uploading is not possible. App measurement disabled"
            r10.a(r0)
            goto L_0x03dc
        L_0x026c:
            com.google.android.gms.measurement.internal.r4 r10 = r9.A()
            java.lang.String r10 = r10.F()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0288
            com.google.android.gms.measurement.internal.r4 r10 = r9.A()
            java.lang.String r10 = r10.D()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0308
        L_0x0288:
            r9.K()
            com.google.android.gms.measurement.internal.r4 r10 = r9.A()
            java.lang.String r10 = r10.F()
            com.google.android.gms.measurement.internal.k5 r0 = r9.E()
            java.lang.String r0 = r0.O()
            com.google.android.gms.measurement.internal.r4 r1 = r9.A()
            java.lang.String r1 = r1.D()
            com.google.android.gms.measurement.internal.k5 r2 = r9.E()
            java.lang.String r2 = r2.N()
            boolean r10 = com.google.android.gms.measurement.internal.oc.k0(r10, r0, r1, r2)
            if (r10 == 0) goto L_0x02ea
            com.google.android.gms.measurement.internal.x4 r10 = r9.k()
            com.google.android.gms.measurement.internal.z4 r10 = r10.I()
            java.lang.String r0 = "Rechecking which service to use due to a GMP App Id change"
            r10.a(r0)
            com.google.android.gms.measurement.internal.k5 r10 = r9.E()
            r10.P()
            com.google.android.gms.measurement.internal.u4 r10 = r9.B()
            r10.G()
            com.google.android.gms.measurement.internal.y9 r10 = r9.f6314u
            r10.Y()
            com.google.android.gms.measurement.internal.y9 r10 = r9.f6314u
            r10.X()
            com.google.android.gms.measurement.internal.k5 r10 = r9.E()
            com.google.android.gms.measurement.internal.p5 r10 = r10.f6234e
            long r0 = r9.H
            r10.b(r0)
            com.google.android.gms.measurement.internal.k5 r10 = r9.E()
            com.google.android.gms.measurement.internal.q5 r10 = r10.f6236g
            r10.b(r5)
        L_0x02ea:
            com.google.android.gms.measurement.internal.k5 r10 = r9.E()
            com.google.android.gms.measurement.internal.r4 r0 = r9.A()
            java.lang.String r0 = r0.F()
            r10.F(r0)
            com.google.android.gms.measurement.internal.k5 r10 = r9.E()
            com.google.android.gms.measurement.internal.r4 r0 = r9.A()
            java.lang.String r0 = r0.D()
            r10.C(r0)
        L_0x0308:
            com.google.android.gms.measurement.internal.k5 r10 = r9.E()
            com.google.android.gms.measurement.internal.p7 r10 = r10.I()
            com.google.android.gms.measurement.internal.p7$a r0 = com.google.android.gms.measurement.internal.p7.a.ANALYTICS_STORAGE
            boolean r10 = r10.l(r0)
            if (r10 != 0) goto L_0x0321
            com.google.android.gms.measurement.internal.k5 r10 = r9.E()
            com.google.android.gms.measurement.internal.q5 r10 = r10.f6236g
            r10.b(r5)
        L_0x0321:
            com.google.android.gms.measurement.internal.y7 r10 = r9.G()
            com.google.android.gms.measurement.internal.k5 r0 = r9.E()
            com.google.android.gms.measurement.internal.q5 r0 = r0.f6236g
            java.lang.String r0 = r0.a()
            r10.S(r0)
            boolean r10 = com.google.android.gms.internal.measurement.qd.a()
            if (r10 == 0) goto L_0x0372
            com.google.android.gms.measurement.internal.g r10 = r9.f6300g
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r0 = com.google.android.gms.measurement.internal.k0.f6206p0
            boolean r10 = r10.r(r0)
            if (r10 == 0) goto L_0x0372
            com.google.android.gms.measurement.internal.oc r10 = r9.K()
            boolean r10 = r10.V0()
            if (r10 != 0) goto L_0x0372
            com.google.android.gms.measurement.internal.k5 r10 = r9.E()
            com.google.android.gms.measurement.internal.q5 r10 = r10.f6251v
            java.lang.String r10 = r10.a()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0372
            com.google.android.gms.measurement.internal.x4 r10 = r9.k()
            com.google.android.gms.measurement.internal.z4 r10 = r10.K()
            java.lang.String r0 = "Remote config removed with active feature rollouts"
            r10.a(r0)
            com.google.android.gms.measurement.internal.k5 r10 = r9.E()
            com.google.android.gms.measurement.internal.q5 r10 = r10.f6251v
            r10.b(r5)
        L_0x0372:
            com.google.android.gms.measurement.internal.r4 r10 = r9.A()
            java.lang.String r10 = r10.F()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x038e
            com.google.android.gms.measurement.internal.r4 r10 = r9.A()
            java.lang.String r10 = r10.D()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x03dc
        L_0x038e:
            boolean r10 = r9.o()
            com.google.android.gms.measurement.internal.k5 r0 = r9.E()
            boolean r0 = r0.A()
            if (r0 != 0) goto L_0x03ad
            com.google.android.gms.measurement.internal.g r0 = r9.f6300g
            boolean r0 = r0.Q()
            if (r0 != 0) goto L_0x03ad
            com.google.android.gms.measurement.internal.k5 r0 = r9.E()
            r1 = r10 ^ 1
            r0.D(r1)
        L_0x03ad:
            if (r10 == 0) goto L_0x03b6
            com.google.android.gms.measurement.internal.y7 r10 = r9.G()
            r10.m0()
        L_0x03b6:
            com.google.android.gms.measurement.internal.gb r10 = r9.J()
            com.google.android.gms.measurement.internal.pb r10 = r10.f6067e
            r10.a()
            com.google.android.gms.measurement.internal.y9 r10 = r9.I()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r10.P(r0)
            com.google.android.gms.measurement.internal.y9 r10 = r9.I()
            com.google.android.gms.measurement.internal.k5 r0 = r9.E()
            com.google.android.gms.measurement.internal.m5 r0 = r0.f6254y
            android.os.Bundle r0 = r0.a()
            r10.B(r0)
        L_0x03dc:
            boolean r10 = com.google.android.gms.internal.measurement.df.a()
            if (r10 == 0) goto L_0x040a
            com.google.android.gms.measurement.internal.g r10 = r9.f6300g
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r0 = com.google.android.gms.measurement.internal.k0.M0
            boolean r10 = r10.r(r0)
            if (r10 == 0) goto L_0x040a
            com.google.android.gms.measurement.internal.oc r10 = r9.K()
            boolean r10 = r10.U0()
            if (r10 == 0) goto L_0x040a
            java.lang.Thread r10 = new java.lang.Thread
            com.google.android.gms.measurement.internal.y7 r0 = r9.G()
            r0.getClass()
            com.google.android.gms.measurement.internal.l6 r1 = new com.google.android.gms.measurement.internal.l6
            r1.<init>(r0)
            r10.<init>(r1)
            r10.start()
        L_0x040a:
            com.google.android.gms.measurement.internal.k5 r10 = r9.E()
            com.google.android.gms.measurement.internal.n5 r10 = r10.f6244o
            r0 = 1
            r10.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m6.d(com.google.android.gms.internal.measurement.f2):void");
    }

    public final f6 i() {
        g(this.f6303j);
        return this.f6303j;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j(String str, int i10, Throwable th, byte[] bArr, Map map) {
        if (!((i10 == 200 || i10 == 204 || i10 == 304) && th == null)) {
            k().K().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
            return;
        }
        E().f6249t.a(true);
        if (bArr == null || bArr.length == 0) {
            k().E().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            String optString3 = jSONObject.optString("gbraid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                k().E().a("Deferred Deep Link is empty.");
                return;
            }
            Bundle bundle = new Bundle();
            if (!ee.a() || !this.f6300g.r(k0.Z0)) {
                if (!K().J0(optString)) {
                    k().K().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                }
            } else if (!K().J0(optString)) {
                k().K().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                return;
            } else {
                bundle.putString("gbraid", optString3);
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.f6309p.y0("auto", "_cmp", bundle);
            oc K = K();
            if (!TextUtils.isEmpty(optString) && K.g0(optString, optDouble)) {
                K.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
            }
        } catch (JSONException e10) {
            k().F().b("Failed to parse the Deferred Deep Link response. exception", e10);
        }
    }

    public final x4 k() {
        g(this.f6302i);
        return this.f6302i;
    }

    /* access modifiers changed from: package-private */
    public final void l(boolean z9) {
        this.A = Boolean.valueOf(z9);
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        this.E++;
    }

    public final boolean n() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean o() {
        return w() == 0;
    }

    public final boolean p() {
        i().m();
        return this.D;
    }

    public final boolean q() {
        return TextUtils.isEmpty(this.f6295b);
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        if (this.f6317x) {
            i().m();
            Boolean bool = this.f6318y;
            if (bool == null || this.f6319z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f6307n.b() - this.f6319z) > 1000)) {
                this.f6319z = this.f6307n.b();
                boolean z9 = true;
                Boolean valueOf = Boolean.valueOf(K().D0("android.permission.INTERNET") && K().D0("android.permission.ACCESS_NETWORK_STATE") && (c.a(this.f6294a).e() || this.f6300g.R() || (oc.b0(this.f6294a) && oc.c0(this.f6294a, false))));
                this.f6318y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!K().i0(A().F(), A().D()) && TextUtils.isEmpty(A().D())) {
                        z9 = false;
                    }
                    this.f6318y = Boolean.valueOf(z9);
                }
            }
            return this.f6318y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean s() {
        return this.f6298e;
    }

    public final boolean t() {
        i().m();
        g(u());
        String E2 = A().E();
        Pair<String, Boolean> t9 = E().t(E2);
        boolean z9 = false;
        if (!this.f6300g.O() || ((Boolean) t9.second).booleanValue() || TextUtils.isEmpty((CharSequence) t9.first)) {
            k().E().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        } else if (!u().v()) {
            k().K().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            if (kd.a() && this.f6300g.r(k0.U0)) {
                Bundle bundle = null;
                y7 G2 = G();
                G2.m();
                n U = G2.s().U();
                if (U != null) {
                    bundle = U.f6331m;
                }
                int i10 = 1;
                if (bundle == null) {
                    int i11 = this.F;
                    this.F = i11 + 1;
                    if (i11 < 10) {
                        z9 = true;
                    }
                    z4 E3 = k().E();
                    String str = z9 ? "Retrying." : "Skipping.";
                    E3.b("Failed to retrieve DMA consent from the service, " + str + " retryCount", Integer.valueOf(this.F));
                    return z9;
                }
                p7 c10 = p7.c(bundle, 100);
                sb.append("&gcs=");
                sb.append(c10.w());
                z b10 = z.b(bundle, 100);
                sb.append("&dma=");
                sb.append(b10.g() == Boolean.FALSE ? 0 : 1);
                if (!TextUtils.isEmpty(b10.h())) {
                    sb.append("&dma_cps=");
                    sb.append(b10.h());
                }
                if (z.d(bundle) == Boolean.TRUE) {
                    i10 = 0;
                }
                sb.append("&npa=");
                sb.append(i10);
                k().J().b("Consent query parameters to Bow", sb);
            }
            oc K = K();
            A();
            URL I2 = K.I(82001, E2, (String) t9.first, E().f6250u.a() - 1, sb.toString());
            if (I2 != null) {
                l9 u9 = u();
                o6 o6Var = new o6(this);
                u9.m();
                u9.n();
                p.j(I2);
                p.j(o6Var);
                u9.i().y(new n9(u9, E2, I2, (byte[]) null, (Map<String, String>) null, o6Var));
            }
            return false;
        }
    }

    public final void v(boolean z9) {
        i().m();
        this.D = z9;
    }

    public final int w() {
        i().m();
        if (this.f6300g.Q()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!p()) {
            return 8;
        }
        Boolean L = E().L();
        if (L != null) {
            return L.booleanValue() ? 0 : 3;
        }
        Boolean E2 = this.f6300g.E("firebase_analytics_collection_enabled");
        if (E2 != null) {
            return E2.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    public final b0 x() {
        b0 b0Var = this.f6310q;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("Component not created");
    }

    public final g y() {
        return this.f6300g;
    }

    public final c0 z() {
        g(this.f6315v);
        return this.f6315v;
    }

    public final Context zza() {
        return this.f6294a;
    }
}
