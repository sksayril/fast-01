package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.de;
import com.google.android.gms.internal.measurement.df;
import com.google.android.gms.internal.measurement.ee;
import com.google.android.gms.internal.measurement.kd;
import com.google.android.gms.internal.measurement.pf;
import com.google.android.gms.internal.measurement.qd;
import com.google.android.gms.measurement.internal.p7;
import g8.s;
import h2.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l2.d;
import l2.e;
import l2.m;
import p.a;
import r3.b;

public final class y7 extends e3 {

    /* renamed from: c  reason: collision with root package name */
    protected f9 f6731c;

    /* renamed from: d  reason: collision with root package name */
    private u7 f6732d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<t7> f6733e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    private boolean f6734f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<String> f6735g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    private final Object f6736h = new Object();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f6737i = false;

    /* renamed from: j  reason: collision with root package name */
    private PriorityQueue<rb> f6738j;

    /* renamed from: k  reason: collision with root package name */
    private p7 f6739k = p7.f6429c;

    /* renamed from: l  reason: collision with root package name */
    private final AtomicLong f6740l = new AtomicLong(0);

    /* renamed from: m  reason: collision with root package name */
    private long f6741m = -1;

    /* renamed from: n  reason: collision with root package name */
    final yc f6742n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f6743o = true;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public x f6744p;

    /* renamed from: q  reason: collision with root package name */
    private final qc f6745q = new x8(this);

    protected y7(m6 m6Var) {
        super(m6Var);
        this.f6742n = new yc(m6Var);
    }

    static /* synthetic */ void M(y7 y7Var, p7 p7Var, long j10, boolean z9, boolean z10) {
        y7Var.m();
        y7Var.u();
        p7 I = y7Var.g().I();
        if (j10 <= y7Var.f6741m && p7.k(I.b(), p7Var.b())) {
            y7Var.k().I().b("Dropped out-of-date consent setting, proposed settings", p7Var);
        } else if (y7Var.g().z(p7Var)) {
            y7Var.f6741m = j10;
            y7Var.s().T(z9);
            if (z10) {
                y7Var.s().P(new AtomicReference());
            }
        } else {
            y7Var.k().I().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(p7Var.b()));
        }
    }

    static /* synthetic */ void N(y7 y7Var, p7 p7Var, p7 p7Var2) {
        p7.a aVar = p7.a.ANALYTICS_STORAGE;
        p7.a aVar2 = p7.a.AD_STORAGE;
        boolean m10 = p7Var.m(p7Var2, aVar, aVar2);
        boolean r9 = p7Var.r(p7Var2, aVar, aVar2);
        if (m10 || r9) {
            y7Var.o().H();
        }
    }

    /* access modifiers changed from: private */
    public final void R(Boolean bool, boolean z9) {
        m();
        u();
        k().E().b("Setting app measurement enabled (FE)", bool);
        g().u(bool);
        if (z9) {
            g().B(bool);
        }
        if (this.f6276a.p() || (bool != null && !bool.booleanValue())) {
            s0();
        }
    }

    private final void V(String str, String str2, long j10, Object obj) {
        i().C(new o8(this, str, str2, obj, j10));
    }

    @TargetApi(30)
    private final PriorityQueue<rb> r0() {
        if (this.f6738j == null) {
            this.f6738j = new PriorityQueue<>(Comparator.comparing(x7.f6710a, a8.f5861m));
        }
        return this.f6738j;
    }

    /* access modifiers changed from: private */
    public final void s0() {
        Long valueOf;
        m();
        String a10 = g().f6242m.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf("true".equals(a10) ? 1 : 0);
            }
            Z("app", "_npa", valueOf, a().a());
        }
        if (!this.f6276a.o() || !this.f6743o) {
            k().E().a("Updating Scion state (FE)");
            s().a0();
            return;
        }
        k().E().a("Recording app launch after enabling measurement for the first time (FE)");
        m0();
        if (de.a() && d().r(k0.f6208q0)) {
            t().f6067e.a();
        }
        i().C(new n8(this));
    }

    private final void w0(String str, String str2, long j10, Bundle bundle, boolean z9, boolean z10, boolean z11, String str3) {
        i().C(new p8(this, str, str2, j10, oc.C(bundle), z9, z10, z11, str3));
    }

    public final ArrayList<Bundle> B(String str, String str2) {
        if (i().I()) {
            k().F().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (f.a()) {
            k().F().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f6276a.i().u(atomicReference, 5000, "get conditional user properties", new w8(this, atomicReference, (String) null, str, str2));
            List list = (List) atomicReference.get();
            if (list != null) {
                return oc.s0(list);
            }
            k().F().b("Timed out waiting for get conditional user properties", (Object) null);
            return new ArrayList<>();
        }
    }

    public final Map<String, Object> C(String str, String str2, boolean z9) {
        z4 F;
        String str3;
        if (i().I()) {
            F = k().F();
            str3 = "Cannot get user properties from analytics worker thread";
        } else if (f.a()) {
            F = k().F();
            str3 = "Cannot get user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f6276a.i().u(atomicReference, 5000, "get user properties", new v8(this, atomicReference, (String) null, str, str2, z9));
            List<nc> list = (List) atomicReference.get();
            if (list == null) {
                k().F().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z9));
                return Collections.emptyMap();
            }
            a aVar = new a(list.size());
            for (nc ncVar : list) {
                Object d10 = ncVar.d();
                if (d10 != null) {
                    aVar.put(ncVar.f6359n, d10);
                }
            }
            return aVar;
        }
        F.a(str3);
        return Collections.emptyMap();
    }

    /* access modifiers changed from: package-private */
    public final void D(long j10, boolean z9) {
        m();
        u();
        k().E().a("Resetting analytics data (FE)");
        gb t9 = t();
        t9.m();
        t9.f6068f.b();
        if (pf.a() && d().r(k0.f6222x0)) {
            o().H();
        }
        boolean o10 = this.f6276a.o();
        k5 g10 = g();
        g10.f6234e.b(j10);
        if (!TextUtils.isEmpty(g10.g().f6251v.a())) {
            g10.f6251v.b((String) null);
        }
        if (de.a() && g10.d().r(k0.f6208q0)) {
            g10.f6245p.b(0);
        }
        g10.f6246q.b(0);
        if (!g10.d().Q()) {
            g10.D(!o10);
        }
        g10.f6252w.b((String) null);
        g10.f6253x.b(0);
        g10.f6254y.b((Bundle) null);
        if (z9) {
            s().Z();
        }
        if (de.a() && d().r(k0.f6208q0)) {
            t().f6067e.a();
        }
        this.f6743o = !o10;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void E(Bundle bundle) {
        if (bundle == null) {
            g().f6254y.b(new Bundle());
            return;
        }
        Bundle a10 = g().f6254y.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                h();
                if (oc.f0(obj)) {
                    h();
                    oc.W(this.f6745q, 27, (String) null, (String) null, 0);
                }
                k().L().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (oc.G0(str)) {
                k().L().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a10.remove(str);
            } else if (h().j0("param", str, d().s(this.f6276a.A().E()), obj)) {
                h().M(a10, str, obj);
            }
        }
        h();
        if (oc.e0(a10, d().D())) {
            h();
            oc.W(this.f6745q, 26, (String) null, (String) null, 0);
            k().L().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        g().f6254y.b(a10);
        s().B(a10);
    }

    /* access modifiers changed from: package-private */
    public final void F(Bundle bundle, int i10, long j10) {
        u();
        String i11 = p7.i(bundle);
        if (i11 != null) {
            k().L().b("Ignoring invalid consent setting", i11);
            k().L().a("Valid consent values are 'granted', 'denied'");
        }
        p7 c10 = p7.c(bundle, i10);
        if (!kd.a() || !d().r(k0.S0)) {
            J(c10, j10);
            return;
        }
        if (c10.z()) {
            J(c10, j10);
        }
        z b10 = z.b(bundle, i10);
        if (b10.j()) {
            H(b10);
        }
        Boolean d10 = z.d(bundle);
        if (d10 != null) {
            a0("app", "allow_personalized_ads", d10.toString(), false);
        }
    }

    public final void G(Bundle bundle, long j10) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        p.j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            k().K().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        p.j(bundle2);
        m7.a(bundle2, "app_id", cls2, null);
        m7.a(bundle2, "origin", cls2, null);
        m7.a(bundle2, "name", cls2, null);
        m7.a(bundle2, "value", Object.class, null);
        m7.a(bundle2, "trigger_event_name", cls2, null);
        m7.a(bundle2, "trigger_timeout", cls, 0L);
        m7.a(bundle2, "timed_out_event_name", cls2, null);
        m7.a(bundle2, "timed_out_event_params", Bundle.class, null);
        m7.a(bundle2, "triggered_event_name", cls2, null);
        m7.a(bundle2, "triggered_event_params", Bundle.class, null);
        m7.a(bundle2, "time_to_live", cls, 0L);
        m7.a(bundle2, "expired_event_name", cls2, null);
        m7.a(bundle2, "expired_event_params", Bundle.class, null);
        p.f(bundle2.getString("name"));
        p.f(bundle2.getString("origin"));
        p.j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (h().p0(string) != 0) {
            k().F().b("Invalid conditional user property name", f().g(string));
        } else if (h().v(string, obj) != 0) {
            k().F().c("Invalid conditional user property value", f().g(string), obj);
        } else {
            Object z02 = h().z0(string, obj);
            if (z02 == null) {
                k().F().c("Unable to normalize conditional user property value", f().g(string), obj);
                return;
            }
            m7.b(bundle2, z02);
            long j11 = bundle2.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle2.getString("trigger_event_name")) || (j11 <= 15552000000L && j11 >= 1)) {
                long j12 = bundle2.getLong("time_to_live");
                if (j12 > 15552000000L || j12 < 1) {
                    k().F().c("Invalid conditional user property time to live", f().g(string), Long.valueOf(j12));
                } else {
                    i().C(new u8(this, bundle2));
                }
            } else {
                k().F().c("Invalid conditional user property timeout", f().g(string), Long.valueOf(j11));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void H(z zVar) {
        i().C(new e9(this, zVar));
    }

    /* access modifiers changed from: package-private */
    public final void I(p7 p7Var) {
        m();
        boolean z9 = (p7Var.y() && p7Var.x()) || s().d0();
        if (z9 != this.f6276a.p()) {
            this.f6276a.v(z9);
            Boolean K = g().K();
            if (!z9 || K == null || K.booleanValue()) {
                R(Boolean.valueOf(z9), false);
            }
        }
    }

    public final void J(p7 p7Var, long j10) {
        p7 p7Var2;
        boolean z9;
        boolean z10;
        boolean z11;
        p7 p7Var3 = p7Var;
        u();
        int b10 = p7Var.b();
        if (b10 != -10 && p7Var.s() == null && p7Var.u() == null) {
            k().L().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f6736h) {
            p7Var2 = this.f6739k;
            z9 = true;
            z10 = false;
            if (p7.k(b10, p7Var2.b())) {
                boolean t9 = p7Var3.t(this.f6739k);
                if (p7Var.y() && !this.f6739k.y()) {
                    z10 = true;
                }
                p7Var3 = p7Var3.p(this.f6739k);
                this.f6739k = p7Var3;
                z11 = z10;
                z10 = t9;
            } else {
                z9 = false;
                z11 = false;
            }
        }
        if (!z9) {
            k().I().b("Ignoring lower-priority consent settings, proposed settings", p7Var3);
            return;
        }
        long andIncrement = this.f6740l.getAndIncrement();
        if (z10) {
            S((String) null);
            i().F(new d9(this, p7Var3, j10, andIncrement, z11, p7Var2));
            return;
        }
        g9 g9Var = new g9(this, p7Var3, andIncrement, z11, p7Var2);
        if (b10 == 30 || b10 == -10) {
            i().F(g9Var);
        } else {
            i().C(g9Var);
        }
    }

    public final void K(t7 t7Var) {
        u();
        p.j(t7Var);
        if (!this.f6733e.add(t7Var)) {
            k().K().a("OnEventListener already registered");
        }
    }

    public final void L(u7 u7Var) {
        u7 u7Var2;
        m();
        u();
        if (!(u7Var == null || u7Var == (u7Var2 = this.f6732d))) {
            p.n(u7Var2 == null, "EventInterceptor already set.");
        }
        this.f6732d = u7Var;
    }

    public final void Q(Boolean bool) {
        u();
        i().C(new b9(this, bool));
    }

    /* access modifiers changed from: package-private */
    public final void S(String str) {
        this.f6735g.set(str);
    }

    /* access modifiers changed from: package-private */
    public final void T(String str, String str2, long j10, Bundle bundle) {
        m();
        U(str, str2, j10, bundle, true, this.f6732d == null || oc.G0(str2), true, (String) null);
    }

    /* access modifiers changed from: protected */
    public final void U(String str, String str2, long j10, Bundle bundle, boolean z9, boolean z10, boolean z11, String str3) {
        String str4;
        long j11;
        y7 y7Var;
        String str5;
        String str6;
        boolean z12;
        String str7 = str;
        String str8 = str2;
        long j12 = j10;
        Bundle bundle2 = bundle;
        p.f(str);
        p.j(bundle);
        m();
        u();
        if (!this.f6276a.o()) {
            k().E().a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> G = o().G();
        if (G == null || G.contains(str8)) {
            int i10 = 0;
            if (!this.f6734f) {
                this.f6734f = true;
                try {
                    try {
                        (!this.f6276a.s() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{zza()});
                    } catch (Exception e10) {
                        k().K().b("Failed to invoke Tag Manager's initialize() method", e10);
                    }
                } catch (ClassNotFoundException unused) {
                    k().I().a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str8)) {
                if (bundle2.containsKey("gclid")) {
                    Z("auto", "_lgclid", bundle2.getString("gclid"), a().a());
                }
                if (ee.a() && d().r(k0.Z0) && bundle2.containsKey("gbraid")) {
                    Z("auto", "_gbraid", bundle2.getString("gbraid"), a().a());
                }
            }
            if (z9 && oc.K0(str2)) {
                h().L(bundle2, g().f6254y.a());
            }
            if (!z11 && !"_iap".equals(str8)) {
                oc K = this.f6276a.K();
                int i11 = 2;
                if (K.B0("event", str8)) {
                    if (!K.n0("event", q7.f6466a, q7.f6467b, str8)) {
                        i11 = 13;
                    } else if (K.h0("event", 40, str8)) {
                        i11 = 0;
                    }
                }
                if (i11 != 0) {
                    k().G().b("Invalid public event name. Event will not be logged (FE)", f().c(str8));
                    this.f6276a.K();
                    String H = oc.H(str8, 40, true);
                    if (str8 != null) {
                        i10 = str2.length();
                    }
                    this.f6276a.K();
                    oc.W(this.f6745q, i11, "_ev", H, i10);
                    return;
                }
            }
            r9 B = r().B(false);
            if (B != null && !bundle2.containsKey("_sc")) {
                B.f6519d = true;
            }
            oc.V(B, bundle2, z9 && !z11);
            boolean equals = "am".equals(str7);
            boolean G0 = oc.G0(str2);
            if (z9 && this.f6732d != null && !G0 && !equals) {
                k().E().c("Passing event to registered event handler (FE)", f().c(str8), f().a(bundle2));
                p.j(this.f6732d);
                this.f6732d.a(str, str2, bundle, j10);
            } else if (this.f6276a.r()) {
                int u9 = h().u(str8);
                if (u9 != 0) {
                    k().G().b("Invalid event name. Event will not be logged (FE)", f().c(str8));
                    h();
                    String H2 = oc.H(str8, 40, true);
                    if (str8 != null) {
                        i10 = str2.length();
                    }
                    this.f6276a.K();
                    oc.X(this.f6745q, str3, u9, "_ev", H2, i10);
                    return;
                }
                Bundle D = h().D(str3, str2, bundle, e.c("_o", "_sn", "_sc", "_si"), z11);
                p.j(D);
                if (r().B(false) != null && "_ae".equals(str8)) {
                    nb nbVar = t().f6068f;
                    long b10 = nbVar.f6357d.a().b();
                    long j13 = b10 - nbVar.f6355b;
                    nbVar.f6355b = b10;
                    if (j13 > 0) {
                        h().K(D, j13);
                    }
                }
                if (qd.a() && d().r(k0.f6206p0)) {
                    if (!"auto".equals(str7) && "_ssr".equals(str8)) {
                        oc h10 = h();
                        String string = D.getString("_ffr");
                        String trim = m.a(string) ? null : string != null ? string.trim() : string;
                        if (rc.a(trim, h10.g().f6251v.a())) {
                            h10.k().E().a("Not logging duplicate session_start_with_rollout event");
                            z12 = false;
                        } else {
                            h10.g().f6251v.b(trim);
                            z12 = true;
                        }
                        if (!z12) {
                            return;
                        }
                    } else if ("_ae".equals(str8)) {
                        String a10 = h().g().f6251v.a();
                        if (!TextUtils.isEmpty(a10)) {
                            D.putString("_ffr", a10);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(D);
                boolean E = d().r(k0.Q0) ? t().E() : g().f6248s.b();
                if (g().f6245p.a() <= 0 || !g().x(j12) || !E) {
                    j11 = 0;
                    str4 = "_ae";
                } else {
                    k().J().a("Current session is expired, remove the session number, ID, and engagement time");
                    j11 = 0;
                    str4 = "_ae";
                    Z("auto", "_sid", (Object) null, a().a());
                    Z("auto", "_sno", (Object) null, a().a());
                    Z("auto", "_se", (Object) null, a().a());
                    g().f6246q.b(0);
                }
                if (D.getLong("extend_session", j11) == 1) {
                    k().J().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    y7Var = this;
                    y7Var.f6276a.J().f6067e.b(j12, true);
                } else {
                    y7Var = this;
                }
                ArrayList arrayList2 = new ArrayList(D.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    String str9 = (String) obj;
                    if (str9 != null) {
                        h();
                        Bundle[] w02 = oc.w0(D.get(str9));
                        if (w02 != null) {
                            D.putParcelableArray(str9, w02);
                        }
                    }
                }
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    Bundle bundle3 = (Bundle) arrayList.get(i13);
                    if (i13 != 0) {
                        str6 = "_ep";
                        str5 = str;
                    } else {
                        str5 = str;
                        str6 = str2;
                    }
                    bundle3.putString("_o", str5);
                    if (z10) {
                        bundle3 = h().q0(bundle3);
                    }
                    Bundle bundle4 = bundle3;
                    s().H(new i0(str6, new d0(bundle4), str, j10), str3);
                    if (!equals) {
                        for (t7 a11 : y7Var.f6733e) {
                            a11.a(str, str2, new Bundle(bundle4), j10);
                            String str10 = str3;
                        }
                    }
                    i13++;
                }
                if (r().B(false) != null) {
                    if (str4.equals(str2)) {
                        t().D(true, true, a().b());
                    }
                }
            }
        } else {
            k().E().c("Dropping non-safelisted event. event name, origin", str8, str7);
        }
    }

    public final void W(String str, String str2, Bundle bundle) {
        long a10 = a().a();
        p.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a10);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        i().C(new t8(this, bundle2));
    }

    public final void X(String str, String str2, Bundle bundle, String str3) {
        l();
        w0(str, str2, a().a(), bundle, false, true, true, str3);
    }

    public final void Y(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j10) {
        String str3 = str2;
        String str4 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str3 == "screen_view" || (str3 != null && str2.equals("screen_view"))) {
            r().H(bundle2, j10);
            return;
        }
        long j11 = j10;
        w0(str4, str2, j10, bundle2, z10, !z10 || this.f6732d == null || oc.G0(str2), z9, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            h2.p.f(r9)
            h2.p.f(r10)
            r8.m()
            r8.u()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0060
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0050
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0050
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x0035
            r4 = r2
            goto L_0x0037
        L_0x0035:
            r4 = 0
        L_0x0037:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.k5 r0 = r8.g()
            com.google.android.gms.measurement.internal.q5 r0 = r0.f6242m
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004b
            java.lang.String r11 = "true"
        L_0x004b:
            r0.b(r11)
            r6 = r10
            goto L_0x005e
        L_0x0050:
            if (r11 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.k5 r10 = r8.g()
            com.google.android.gms.measurement.internal.q5 r10 = r10.f6242m
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
        L_0x005e:
            r3 = r1
            goto L_0x0062
        L_0x0060:
            r3 = r10
            r6 = r11
        L_0x0062:
            com.google.android.gms.measurement.internal.m6 r10 = r8.f6276a
            boolean r10 = r10.o()
            if (r10 != 0) goto L_0x0078
            com.google.android.gms.measurement.internal.x4 r9 = r8.k()
            com.google.android.gms.measurement.internal.z4 r9 = r9.J()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L_0x0078:
            com.google.android.gms.measurement.internal.m6 r10 = r8.f6276a
            boolean r10 = r10.r()
            if (r10 != 0) goto L_0x0081
            return
        L_0x0081:
            com.google.android.gms.measurement.internal.nc r10 = new com.google.android.gms.measurement.internal.nc
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.y9 r9 = r8.s()
            r9.N(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y7.Z(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final /* bridge */ /* synthetic */ d a() {
        return super.a();
    }

    public final void a0(String str, String str2, Object obj, boolean z9) {
        b0(str, str2, obj, z9, a().a());
    }

    public final void b0(String str, String str2, Object obj, boolean z9, long j10) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i10 = 6;
        int i11 = 0;
        if (z9) {
            i10 = h().p0(str2);
        } else {
            oc h10 = h();
            if (h10.B0("user property", str2)) {
                if (!h10.m0("user property", r7.f6512a, str2)) {
                    i10 = 15;
                } else if (h10.h0("user property", 24, str2)) {
                    i10 = 0;
                }
            }
        }
        if (i10 != 0) {
            h();
            String H = oc.H(str2, 24, true);
            if (str2 != null) {
                i11 = str2.length();
            }
            this.f6276a.K();
            oc.W(this.f6745q, i10, "_ev", H, i11);
        } else if (obj != null) {
            int v9 = h().v(str2, obj);
            if (v9 != 0) {
                h();
                String H2 = oc.H(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i11 = String.valueOf(obj).length();
                }
                this.f6276a.K();
                oc.W(this.f6745q, v9, "_ev", H2, i11);
                return;
            }
            Object z02 = h().z0(str2, obj);
            if (z02 != null) {
                V(str3, str2, j10, z02);
            }
        } else {
            V(str3, str2, j10, (Object) null);
        }
    }

    public final /* bridge */ /* synthetic */ f c() {
        return super.c();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c0(List list) {
        m();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> G = g().G();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rb rbVar = (rb) it.next();
                if (!G.contains(rbVar.f6530o) || G.get(rbVar.f6530o).longValue() < rbVar.f6529n) {
                    r0().add(rbVar);
                }
            }
            q0();
        }
    }

    public final /* bridge */ /* synthetic */ g d() {
        return super.d();
    }

    public final Boolean d0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) i().u(atomicReference, 15000, "boolean test flag value", new j8(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ c0 e() {
        return super.e();
    }

    public final Double e0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) i().u(atomicReference, 15000, "double test flag value", new c9(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ w4 f() {
        return super.f();
    }

    public final Integer f0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) i().u(atomicReference, 15000, "int test flag value", new z8(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ k5 g() {
        return super.g();
    }

    public final Long g0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) i().u(atomicReference, 15000, "long test flag value", new a9(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ oc h() {
        return super.h();
    }

    public final String h0() {
        return this.f6735g.get();
    }

    public final /* bridge */ /* synthetic */ f6 i() {
        return super.i();
    }

    public final String i0() {
        r9 O = this.f6276a.H().O();
        if (O != null) {
            return O.f6517b;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final String j0() {
        r9 O = this.f6276a.H().O();
        if (O != null) {
            return O.f6516a;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ x4 k() {
        return super.k();
    }

    public final String k0() {
        if (this.f6276a.L() != null) {
            return this.f6276a.L();
        }
        try {
            return new g6(zza(), this.f6276a.O()).b("google_app_id");
        } catch (IllegalStateException e10) {
            this.f6276a.k().F().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final String l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) i().u(atomicReference, 15000, "String test flag value", new r8(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public final void m0() {
        m();
        u();
        if (this.f6276a.r()) {
            if (d().r(k0.f6196k0)) {
                Boolean E = d().E("google_analytics_deferred_deep_link_enabled");
                if (E != null && E.booleanValue()) {
                    k().E().a("Deferred Deep Link feature enabled.");
                    i().C(new d8(this));
                }
            }
            s().W();
            this.f6743o = false;
            String M = g().M();
            if (!TextUtils.isEmpty(M)) {
                e().n();
                if (!M.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", M);
                    y0("auto", "_ou", bundle);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ b0 n() {
        return super.n();
    }

    public final void n0() {
        if ((zza().getApplicationContext() instanceof Application) && this.f6731c != null) {
            ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f6731c);
        }
    }

    public final /* bridge */ /* synthetic */ r4 o() {
        return super.o();
    }

    /* access modifiers changed from: package-private */
    public final void o0() {
        if (df.a() && d().r(k0.M0)) {
            if (i().I()) {
                k().F().a("Cannot get trigger URIs from analytics worker thread");
            } else if (f.a()) {
                k().F().a("Cannot get trigger URIs from main thread");
            } else {
                u();
                k().J().a("Getting trigger URIs (FE)");
                AtomicReference atomicReference = new AtomicReference();
                i().u(atomicReference, 5000, "get trigger URIs", new z7(this, atomicReference));
                List list = (List) atomicReference.get();
                if (list == null) {
                    k().F().a("Timed out waiting for get trigger URIs");
                } else {
                    i().C(new c8(this, list));
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ u4 p() {
        return super.p();
    }

    public final void p0() {
        m();
        if (g().f6249t.b()) {
            k().E().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a10 = g().f6250u.a();
        g().f6250u.b(1 + a10);
        if (a10 >= 5) {
            k().K().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            g().f6249t.a(true);
        } else if (!kd.a() || !d().r(k0.U0)) {
            this.f6276a.t();
        } else {
            if (this.f6744p == null) {
                this.f6744p = new q8(this, this.f6276a);
            }
            this.f6744p.b(0);
        }
    }

    public final /* bridge */ /* synthetic */ y7 q() {
        return super.q();
    }

    /* access modifiers changed from: package-private */
    @TargetApi(30)
    public final void q0() {
        rb poll;
        p0.a P0;
        m();
        if (!r0().isEmpty() && !this.f6737i && (poll = r0().poll()) != null && (P0 = h().P0()) != null) {
            this.f6737i = true;
            k().J().b("Registering trigger URI", poll.f6528m);
            r3.d<s> c10 = P0.c(Uri.parse(poll.f6528m));
            if (c10 == null) {
                this.f6737i = false;
                r0().add(poll);
                return;
            }
            SparseArray<Long> G = g().G();
            G.put(poll.f6530o, Long.valueOf(poll.f6529n));
            k5 g10 = g();
            int[] iArr = new int[G.size()];
            long[] jArr = new long[G.size()];
            for (int i10 = 0; i10 < G.size(); i10++) {
                iArr[i10] = G.keyAt(i10);
                jArr[i10] = G.valueAt(i10).longValue();
            }
            Bundle bundle = new Bundle();
            bundle.putIntArray("uriSources", iArr);
            bundle.putLongArray("uriTimestamps", jArr);
            g10.f6243n.b(bundle);
            b.a(c10, new l8(this, poll), new h8(this));
        }
    }

    public final /* bridge */ /* synthetic */ q9 r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ y9 s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ gb t() {
        return super.t();
    }

    public final void t0(Bundle bundle) {
        G(bundle, a().a());
    }

    public final void u0(t7 t7Var) {
        u();
        p.j(t7Var);
        if (!this.f6733e.remove(t7Var)) {
            k().K().a("OnEventListener had not been registered");
        }
    }

    public final void x0(String str, String str2, Bundle bundle) {
        Y(str, str2, bundle, true, true, a().a());
    }

    /* access modifiers changed from: package-private */
    public final void y0(String str, String str2, Bundle bundle) {
        m();
        T(str, str2, a().a(), bundle);
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        return false;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
