package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.f5;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.qg;
import com.google.android.gms.internal.measurement.x3;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.measurement.internal.p7;
import h2.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import l2.d;
import p.a;
import p.e;

public final class w5 extends yb implements i {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Map<String, String>> f6649d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Set<String>> f6650e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f6651f = new a();

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f6652g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, a4> f6653h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, Map<String, Integer>> f6654i = new a();

    /* renamed from: j  reason: collision with root package name */
    final e<String, b0> f6655j = new c6(this, 20);

    /* renamed from: k  reason: collision with root package name */
    final qg f6656k = new b6(this);

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, String> f6657l = new a();

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, String> f6658m = new a();

    /* renamed from: n  reason: collision with root package name */
    private final Map<String, String> f6659n = new a();

    w5(zb zbVar) {
        super(zbVar);
    }

    private static p7.a A(x3.e eVar) {
        int i10 = d6.f5951b[eVar.ordinal()];
        if (i10 == 1) {
            return p7.a.AD_STORAGE;
        }
        if (i10 == 2) {
            return p7.a.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return p7.a.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return p7.a.AD_PERSONALIZATION;
    }

    private static Map<String, String> C(a4 a4Var) {
        a aVar = new a();
        if (a4Var != null) {
            for (d4 next : a4Var.a0()) {
                aVar.put(next.K(), next.L());
            }
        }
        return aVar;
    }

    private final void E(String str, a4.a aVar) {
        HashSet hashSet = new HashSet();
        a aVar2 = new a();
        a aVar3 = new a();
        a aVar4 = new a();
        if (aVar != null) {
            for (y3 K : aVar.D()) {
                hashSet.add(K.K());
            }
            for (int i10 = 0; i10 < aVar.x(); i10++) {
                z3.a aVar5 = (z3.a) aVar.y(i10).B();
                if (aVar5.z().isEmpty()) {
                    k().K().a("EventConfig contained null event name");
                } else {
                    String z9 = aVar5.z();
                    String b10 = q7.b(aVar5.z());
                    if (!TextUtils.isEmpty(b10)) {
                        aVar5 = aVar5.y(b10);
                        aVar.z(i10, aVar5);
                    }
                    if (aVar5.C() && aVar5.A()) {
                        aVar2.put(z9, Boolean.TRUE);
                    }
                    if (aVar5.D() && aVar5.B()) {
                        aVar3.put(aVar5.z(), Boolean.TRUE);
                    }
                    if (aVar5.E()) {
                        if (aVar5.x() < 2 || aVar5.x() > 65535) {
                            k().K().c("Invalid sampling rate. Event name, sample rate", aVar5.z(), Integer.valueOf(aVar5.x()));
                        } else {
                            aVar4.put(aVar5.z(), Integer.valueOf(aVar5.x()));
                        }
                    }
                }
            }
        }
        this.f6650e.put(str, hashSet);
        this.f6651f.put(str, aVar2);
        this.f6652g.put(str, aVar3);
        this.f6654i.put(str, aVar4);
    }

    private final void F(String str, a4 a4Var) {
        if (a4Var.q() == 0) {
            this.f6655j.e(str);
            return;
        }
        k().J().b("EES programs found", Integer.valueOf(a4Var.q()));
        f5 f5Var = a4Var.Z().get(0);
        try {
            b0 b0Var = new b0();
            b0Var.c("internal.remoteConfig", new x5(this, str));
            b0Var.c("internal.appMetadata", new a6(this, str));
            b0Var.c("internal.logger", new z5(this));
            b0Var.b(f5Var);
            this.f6655j.d(str, b0Var);
            k().J().c("EES program loaded for appId, activities", str, Integer.valueOf(f5Var.J().q()));
            for (e5 K : f5Var.J().L()) {
                k().J().b("EES program activity", K.K());
            }
        } catch (b1 unused) {
            k().F().b("Failed to load EES program. appId", str);
        }
    }

    private final void f0(String str) {
        t();
        m();
        p.f(str);
        if (this.f6653h.get(str) == null) {
            r D0 = p().D0(str);
            if (D0 == null) {
                this.f6649d.put(str, (Object) null);
                this.f6651f.put(str, (Object) null);
                this.f6650e.put(str, (Object) null);
                this.f6652g.put(str, (Object) null);
                this.f6653h.put(str, (Object) null);
                this.f6657l.put(str, (Object) null);
                this.f6658m.put(str, (Object) null);
                this.f6659n.put(str, (Object) null);
                this.f6654i.put(str, (Object) null);
                return;
            }
            a4.a aVar = (a4.a) z(str, D0.f6488a).B();
            E(str, aVar);
            this.f6649d.put(str, C((a4) ((p8) aVar.l())));
            this.f6653h.put(str, (a4) ((p8) aVar.l()));
            F(str, (a4) ((p8) aVar.l()));
            this.f6657l.put(str, aVar.B());
            this.f6658m.put(str, D0.f6489b);
            this.f6659n.put(str, D0.f6490c);
        }
    }

    static /* synthetic */ b0 y(w5 w5Var, String str) {
        w5Var.t();
        p.f(str);
        if (!w5Var.V(str)) {
            return null;
        }
        if (!w5Var.f6653h.containsKey(str) || w5Var.f6653h.get(str) == null) {
            w5Var.f0(str);
        } else {
            w5Var.F(str, w5Var.f6653h.get(str));
        }
        return w5Var.f6655j.h().get(str);
    }

    private final a4 z(String str, byte[] bArr) {
        if (bArr == null) {
            return a4.S();
        }
        try {
            a4 a4Var = (a4) ((p8) ((a4.a) jc.E(a4.Q(), bArr)).l());
            z4 J = k().J();
            String str2 = null;
            Long valueOf = a4Var.e0() ? Long.valueOf(a4Var.O()) : null;
            if (a4Var.d0()) {
                str2 = a4Var.T();
            }
            J.c("Parsed config. version, gmp_app_id", valueOf, str2);
            return a4Var;
        } catch (b9 | RuntimeException e10) {
            k().K().c("Unable to merge remote config. appId", x4.u(str), e10);
            return a4.S();
        }
    }

    /* access modifiers changed from: package-private */
    public final p7.a B(String str, p7.a aVar) {
        m();
        f0(str);
        x3 I = I(str);
        if (I == null) {
            return null;
        }
        for (x3.c next : I.N()) {
            if (aVar == A(next.L())) {
                return A(next.K());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean G(String str, byte[] bArr, String str2, String str3) {
        t();
        m();
        p.f(str);
        a4.a aVar = (a4.a) z(str, bArr).B();
        if (aVar == null) {
            return false;
        }
        E(str, aVar);
        F(str, (a4) ((p8) aVar.l()));
        this.f6653h.put(str, (a4) ((p8) aVar.l()));
        this.f6657l.put(str, aVar.B());
        this.f6658m.put(str, str2);
        this.f6659n.put(str, str3);
        this.f6649d.put(str, C((a4) ((p8) aVar.l())));
        p().Y(str, new ArrayList(aVar.C()));
        try {
            aVar.A();
            bArr = ((a4) ((p8) aVar.l())).n();
        } catch (RuntimeException e10) {
            k().K().c("Unable to serialize reduced-size config. Storing full config instead. appId", x4.u(str), e10);
        }
        p p10 = p();
        p.f(str);
        p10.m();
        p10.t();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (((long) p10.A().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                p10.k().F().b("Failed to update remote config (got 0). appId", x4.u(str));
            }
        } catch (SQLiteException e11) {
            p10.k().F().c("Error storing remote config. appId", x4.u(str), e11);
        }
        this.f6653h.put(str, (a4) ((p8) aVar.l()));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int H(String str, String str2) {
        Integer num;
        m();
        f0(str);
        Map map = this.f6654i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public final x3 I(String str) {
        m();
        f0(str);
        a4 K = K(str);
        if (K == null || !K.c0()) {
            return null;
        }
        return K.P();
    }

    /* access modifiers changed from: package-private */
    public final boolean J(String str, p7.a aVar) {
        m();
        f0(str);
        x3 I = I(str);
        if (I == null) {
            return false;
        }
        Iterator<x3.b> it = I.M().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            x3.b next = it.next();
            if (aVar == A(next.L())) {
                if (next.K() == x3.d.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final a4 K(String str) {
        t();
        m();
        p.f(str);
        f0(str);
        return this.f6653h.get(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean L(String str, String str2) {
        Boolean bool;
        m();
        f0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = this.f6652g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final String M(String str) {
        m();
        return this.f6659n.get(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean N(String str, String str2) {
        Boolean bool;
        m();
        f0(str);
        if (W(str) && oc.G0(str2)) {
            return true;
        }
        if (Y(str) && oc.I0(str2)) {
            return true;
        }
        Map map = this.f6651f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final String O(String str) {
        m();
        return this.f6658m.get(str);
    }

    /* access modifiers changed from: package-private */
    public final String P(String str) {
        m();
        f0(str);
        return this.f6657l.get(str);
    }

    /* access modifiers changed from: package-private */
    public final Set<String> Q(String str) {
        m();
        f0(str);
        return this.f6650e.get(str);
    }

    /* access modifiers changed from: package-private */
    public final SortedSet<String> R(String str) {
        m();
        f0(str);
        TreeSet treeSet = new TreeSet();
        x3 I = I(str);
        if (I == null) {
            return treeSet;
        }
        for (x3.f K : I.L()) {
            treeSet.add(K.K());
        }
        return treeSet;
    }

    /* access modifiers changed from: protected */
    public final void S(String str) {
        m();
        this.f6658m.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final void T(String str) {
        m();
        this.f6653h.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean U(String str) {
        m();
        a4 K = K(str);
        if (K == null) {
            return false;
        }
        return K.b0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = r2.f6653h.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean V(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.a4> r0 = r2.f6653h
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.a4 r3 = (com.google.android.gms.internal.measurement.a4) r3
            if (r3 != 0) goto L_0x0013
            return r1
        L_0x0013:
            int r3 = r3.q()
            if (r3 == 0) goto L_0x001b
            r3 = 1
            return r3
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w5.V(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean W(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean X(String str) {
        m();
        f0(str);
        x3 I = I(str);
        return I == null || !I.P() || I.O();
    }

    /* access modifiers changed from: package-private */
    public final boolean Y(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: package-private */
    public final boolean Z(String str) {
        m();
        f0(str);
        return this.f6650e.get(str) != null && this.f6650e.get(str).contains("app_instance_id");
    }

    public final /* bridge */ /* synthetic */ d a() {
        return super.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean a0(String str) {
        m();
        f0(str);
        if (this.f6650e.get(str) != null) {
            return this.f6650e.get(str).contains("device_model") || this.f6650e.get(str).contains("device_info");
        }
        return false;
    }

    public final String b(String str, String str2) {
        m();
        f0(str);
        Map map = this.f6649d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean b0(String str) {
        m();
        f0(str);
        return this.f6650e.get(str) != null && this.f6650e.get(str).contains("enhanced_user_id");
    }

    public final /* bridge */ /* synthetic */ f c() {
        return super.c();
    }

    /* access modifiers changed from: package-private */
    public final boolean c0(String str) {
        m();
        f0(str);
        return this.f6650e.get(str) != null && this.f6650e.get(str).contains("google_signals");
    }

    public final /* bridge */ /* synthetic */ g d() {
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public final boolean d0(String str) {
        m();
        f0(str);
        if (this.f6650e.get(str) != null) {
            return this.f6650e.get(str).contains("os_version") || this.f6650e.get(str).contains("device_info");
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ c0 e() {
        return super.e();
    }

    /* access modifiers changed from: package-private */
    public final boolean e0(String str) {
        m();
        f0(str);
        return this.f6650e.get(str) != null && this.f6650e.get(str).contains("user_id");
    }

    public final /* bridge */ /* synthetic */ w4 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ k5 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ oc h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ f6 i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final /* bridge */ /* synthetic */ x4 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public final /* bridge */ /* synthetic */ jc n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ xc o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ p p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ w5 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ bb r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ xb s() {
        return super.s();
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long x(String str) {
        String b10 = b(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(b10)) {
            return 0;
        }
        try {
            return Long.parseLong(b10);
        } catch (NumberFormatException e10) {
            k().K().c("Unable to parse timezone offset. appId", x4.u(str), e10);
            return 0;
        }
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
