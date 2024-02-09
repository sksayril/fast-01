package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.a1;
import n2.b;
import n2.c;

public final class t5 {

    /* renamed from: a  reason: collision with root package name */
    final m6 f6578a;

    t5(zb zbVar) {
        this.f6578a = zbVar.h0();
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(String str, a1 a1Var) {
        this.f6578a.i().m();
        if (a1Var == null) {
            this.f6578a.k().K().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle p10 = a1Var.p(bundle);
            if (p10 != null) {
                return p10;
            }
            this.f6578a.k().F().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e10) {
            this.f6578a.k().F().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        try {
            b a10 = c.a(this.f6578a.zza());
            if (a10 != null) {
                return a10.d("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f6578a.k().J().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f6578a.k().J().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
