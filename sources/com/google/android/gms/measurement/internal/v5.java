package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.ee;
import com.google.android.gms.internal.measurement.vf;
import k2.a;

final class v5 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ a1 f6615m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f6616n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ s5 f6617o;

    v5(s5 s5Var, a1 a1Var, ServiceConnection serviceConnection) {
        this.f6617o = s5Var;
        this.f6615m = a1Var;
        this.f6616n = serviceConnection;
    }

    public final void run() {
        z4 F;
        String str;
        s5 s5Var = this.f6617o;
        t5 t5Var = s5Var.f6536b;
        String a10 = s5Var.f6535a;
        a1 a1Var = this.f6615m;
        ServiceConnection serviceConnection = this.f6616n;
        Bundle a11 = t5Var.a(a10, a1Var);
        t5Var.f6578a.i().m();
        t5Var.f6578a.P();
        if (a11 != null) {
            long j10 = a11.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j10 == 0) {
                F = t5Var.f6578a.k().K();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = a11.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    F = t5Var.f6578a.k().F();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    t5Var.f6578a.k().J().b("InstallReferrer API result", string);
                    oc K = t5Var.f6578a.K();
                    Bundle B = K.B(Uri.parse("?" + string), vf.a() && t5Var.f6578a.y().r(k0.F0), ee.a() && t5Var.f6578a.y().r(k0.f6175a1));
                    if (B == null) {
                        F = t5Var.f6578a.k().F();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = B.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = a11.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j11 == 0) {
                                F = t5Var.f6578a.k().F();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                B.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == t5Var.f6578a.E().f6235f.a()) {
                            t5Var.f6578a.k().J().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (t5Var.f6578a.o()) {
                            t5Var.f6578a.E().f6235f.b(j10);
                            t5Var.f6578a.k().J().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            B.putString("_cis", "referrer API v2");
                            t5Var.f6578a.G().X("auto", "_cmp", B, a10);
                        }
                    }
                }
            }
            F.a(str);
        }
        if (serviceConnection != null) {
            a.b().c(t5Var.f6578a.zza(), serviceConnection);
        }
    }
}
