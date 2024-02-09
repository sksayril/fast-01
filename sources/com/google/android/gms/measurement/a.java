package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.m6;
import com.google.android.gms.measurement.internal.y7;
import h2.p;
import java.util.List;
import java.util.Map;

final class a extends AppMeasurement.a {

    /* renamed from: a  reason: collision with root package name */
    private final m6 f5827a;

    /* renamed from: b  reason: collision with root package name */
    private final y7 f5828b;

    public a(m6 m6Var) {
        super();
        p.j(m6Var);
        this.f5827a = m6Var;
        this.f5828b = m6Var.G();
    }

    public final void a(String str, String str2, Bundle bundle) {
        this.f5827a.G().W(str, str2, bundle);
    }

    public final List<Bundle> b(String str, String str2) {
        return this.f5828b.B(str, str2);
    }

    public final void c(String str) {
        this.f5827a.x().y(str, this.f5827a.a().b());
    }

    public final Map<String, Object> d(String str, String str2, boolean z9) {
        return this.f5828b.C(str, str2, z9);
    }

    public final String e() {
        return this.f5828b.h0();
    }

    public final String f() {
        return this.f5828b.h0();
    }

    public final String g() {
        return this.f5828b.j0();
    }

    public final String h() {
        return this.f5828b.i0();
    }

    public final int i(String str) {
        p.f(str);
        return 25;
    }

    public final void j(String str, String str2, Bundle bundle) {
        this.f5828b.x0(str, str2, bundle);
    }

    public final void k(String str) {
        this.f5827a.x().C(str, this.f5827a.a().b());
    }

    public final void p(Bundle bundle) {
        this.f5828b.t0(bundle);
    }

    public final long zza() {
        return this.f5827a.K().O0();
    }
}
