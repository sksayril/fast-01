package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.h9;
import h2.p;
import java.util.List;
import java.util.Map;

final class c extends AppMeasurement.a {

    /* renamed from: a  reason: collision with root package name */
    private final h9 f5829a;

    public c(h9 h9Var) {
        super();
        p.j(h9Var);
        this.f5829a = h9Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        this.f5829a.a(str, str2, bundle);
    }

    public final List<Bundle> b(String str, String str2) {
        return this.f5829a.b(str, str2);
    }

    public final void c(String str) {
        this.f5829a.c(str);
    }

    public final Map<String, Object> d(String str, String str2, boolean z9) {
        return this.f5829a.d(str, str2, z9);
    }

    public final String e() {
        return this.f5829a.e();
    }

    public final String f() {
        return this.f5829a.f();
    }

    public final String g() {
        return this.f5829a.g();
    }

    public final String h() {
        return this.f5829a.h();
    }

    public final int i(String str) {
        return this.f5829a.i(str);
    }

    public final void j(String str, String str2, Bundle bundle) {
        this.f5829a.j(str, str2, bundle);
    }

    public final void k(String str) {
        this.f5829a.k(str);
    }

    public final void p(Bundle bundle) {
        this.f5829a.p(bundle);
    }

    public final long zza() {
        return this.f5829a.zza();
    }
}
