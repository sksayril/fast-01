package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.measurement.internal.h9;
import java.util.List;
import java.util.Map;

final class a implements h9 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ h2 f7190a;

    a(h2 h2Var) {
        this.f7190a = h2Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        this.f7190a.r(str, str2, bundle);
    }

    public final List<Bundle> b(String str, String str2) {
        return this.f7190a.g(str, str2);
    }

    public final void c(String str) {
        this.f7190a.x(str);
    }

    public final Map<String, Object> d(String str, String str2, boolean z9) {
        return this.f7190a.h(str, str2, z9);
    }

    public final String e() {
        return this.f7190a.G();
    }

    public final String f() {
        return this.f7190a.D();
    }

    public final String g() {
        return this.f7190a.F();
    }

    public final String h() {
        return this.f7190a.E();
    }

    public final int i(String str) {
        return this.f7190a.a(str);
    }

    public final void j(String str, String str2, Bundle bundle) {
        this.f7190a.y(str, str2, bundle);
    }

    public final void k(String str) {
        this.f7190a.A(str);
    }

    public final void p(Bundle bundle) {
        this.f7190a.k(bundle);
    }

    public final long zza() {
        return this.f7190a.b();
    }
}
