package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import b2.a;
import com.google.android.gms.internal.measurement.rd;
import com.google.android.gms.measurement.internal.p7;
import h2.p;

final class k5 extends k7 {

    /* renamed from: z  reason: collision with root package name */
    static final Pair<String, Long> f6231z = new Pair<>("", 0L);

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f6232c;

    /* renamed from: d  reason: collision with root package name */
    public o5 f6233d;

    /* renamed from: e  reason: collision with root package name */
    public final p5 f6234e = new p5(this, "first_open_time", 0);

    /* renamed from: f  reason: collision with root package name */
    public final p5 f6235f = new p5(this, "app_install_time", 0);

    /* renamed from: g  reason: collision with root package name */
    public final q5 f6236g = new q5(this, "app_instance_id", (String) null);

    /* renamed from: h  reason: collision with root package name */
    private String f6237h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6238i;

    /* renamed from: j  reason: collision with root package name */
    private long f6239j;

    /* renamed from: k  reason: collision with root package name */
    public final p5 f6240k = new p5(this, "session_timeout", 1800000);

    /* renamed from: l  reason: collision with root package name */
    public final n5 f6241l = new n5(this, "start_new_session", true);

    /* renamed from: m  reason: collision with root package name */
    public final q5 f6242m = new q5(this, "non_personalized_ads", (String) null);

    /* renamed from: n  reason: collision with root package name */
    public final m5 f6243n = new m5(this, "last_received_uri_timestamps_by_source", (Bundle) null);

    /* renamed from: o  reason: collision with root package name */
    public final n5 f6244o = new n5(this, "allow_remote_dynamite", false);

    /* renamed from: p  reason: collision with root package name */
    public final p5 f6245p = new p5(this, "last_pause_time", 0);

    /* renamed from: q  reason: collision with root package name */
    public final p5 f6246q = new p5(this, "session_id", 0);

    /* renamed from: r  reason: collision with root package name */
    public boolean f6247r;

    /* renamed from: s  reason: collision with root package name */
    public n5 f6248s = new n5(this, "app_backgrounded", false);

    /* renamed from: t  reason: collision with root package name */
    public n5 f6249t = new n5(this, "deep_link_retrieval_complete", false);

    /* renamed from: u  reason: collision with root package name */
    public p5 f6250u = new p5(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: v  reason: collision with root package name */
    public final q5 f6251v = new q5(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: w  reason: collision with root package name */
    public final q5 f6252w = new q5(this, "deferred_attribution_cache", (String) null);

    /* renamed from: x  reason: collision with root package name */
    public final p5 f6253x = new p5(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: y  reason: collision with root package name */
    public final m5 f6254y = new m5(this, "default_event_parameters", (Bundle) null);

    k5(m6 m6Var) {
        super(m6Var);
    }

    /* access modifiers changed from: package-private */
    public final boolean A() {
        SharedPreferences sharedPreferences = this.f6232c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    public final void B(Boolean bool) {
        m();
        SharedPreferences.Editor edit = E().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void C(String str) {
        m();
        SharedPreferences.Editor edit = E().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void D(boolean z9) {
        m();
        k().J().b("App measurement setting deferred collection", Boolean.valueOf(z9));
        SharedPreferences.Editor edit = E().edit();
        edit.putBoolean("deferred_analytics_collection", z9);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences E() {
        m();
        n();
        p.j(this.f6232c);
        return this.f6232c;
    }

    /* access modifiers changed from: package-private */
    public final void F(String str) {
        m();
        SharedPreferences.Editor edit = E().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final SparseArray<Long> G() {
        Bundle a10 = this.f6243n.a();
        if (a10 == null) {
            return new SparseArray<>();
        }
        int[] intArray = a10.getIntArray("uriSources");
        long[] longArray = a10.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            k().F().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    /* access modifiers changed from: package-private */
    public final z H() {
        m();
        return z.c(E().getString("dma_consent_settings", (String) null));
    }

    /* access modifiers changed from: package-private */
    public final p7 I() {
        m();
        return p7.f(E().getString("consent_settings", "G1"), E().getInt("consent_source", 100));
    }

    /* access modifiers changed from: package-private */
    public final Boolean J() {
        m();
        if (!E().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(E().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    public final Boolean K() {
        m();
        if (E().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(E().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Boolean L() {
        m();
        if (E().contains("measurement_enabled")) {
            return Boolean.valueOf(E().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String M() {
        m();
        String string = E().getString("previous_os_version", (String) null);
        e().n();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = E().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    public final String N() {
        m();
        return E().getString("admob_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final String O() {
        m();
        return E().getString("gmp_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final void P() {
        m();
        Boolean L = L();
        SharedPreferences.Editor edit = E().edit();
        edit.clear();
        edit.apply();
        if (L != null) {
            u(L);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void s() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f6232c = sharedPreferences;
        boolean z9 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f6247r = z9;
        if (!z9) {
            SharedPreferences.Editor edit = this.f6232c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f6233d = new o5(this, "health_monitor", Math.max(0, k0.f6183e.a(null).longValue()));
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> t(String str) {
        m();
        if (rd.a() && d().r(k0.R0) && !I().l(p7.a.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long b10 = a().b();
        if (this.f6237h != null && b10 < this.f6239j) {
            return new Pair<>(this.f6237h, Boolean.valueOf(this.f6238i));
        }
        this.f6239j = b10 + d().B(str);
        a.b(true);
        try {
            a.C0069a a10 = a.a(zza());
            this.f6237h = "";
            String a11 = a10.a();
            if (a11 != null) {
                this.f6237h = a11;
            }
            this.f6238i = a10.b();
        } catch (Exception e10) {
            k().E().b("Unable to get advertising id", e10);
            this.f6237h = "";
        }
        a.b(false);
        return new Pair<>(this.f6237h, Boolean.valueOf(this.f6238i));
    }

    /* access modifiers changed from: package-private */
    public final void u(Boolean bool) {
        m();
        SharedPreferences.Editor edit = E().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void v(boolean z9) {
        m();
        SharedPreferences.Editor edit = E().edit();
        edit.putBoolean("use_service", z9);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final boolean w(int i10) {
        return p7.k(i10, E().getInt("consent_source", 100));
    }

    /* access modifiers changed from: package-private */
    public final boolean x(long j10) {
        return j10 - this.f6240k.a() > this.f6245p.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean y(z zVar) {
        m();
        if (!p7.k(zVar.a(), H().a())) {
            return false;
        }
        SharedPreferences.Editor edit = E().edit();
        edit.putString("dma_consent_settings", zVar.i());
        edit.apply();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean z(p7 p7Var) {
        m();
        int b10 = p7Var.b();
        if (!w(b10)) {
            return false;
        }
        SharedPreferences.Editor edit = E().edit();
        edit.putString("consent_settings", p7Var.v());
        edit.putInt("consent_source", b10);
        edit.apply();
        return true;
    }
}
