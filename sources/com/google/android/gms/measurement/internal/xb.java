package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.bg;
import java.util.HashMap;
import l2.d;

public final class xb extends vb {
    xb(zb zbVar) {
        super(zbVar);
    }

    private final String u(String str) {
        String P = q().P(str);
        if (TextUtils.isEmpty(P)) {
            return k0.f6211s.a(null);
        }
        Uri parse = Uri.parse(k0.f6211s.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        buildUpon.authority(P + "." + authority);
        return buildUpon.build().toString();
    }

    public final /* bridge */ /* synthetic */ d a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ f c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ g d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ c0 e() {
        return super.e();
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

    public final ac t(String str) {
        if (bg.a() && d().r(k0.A0)) {
            k().J().a("sgtm feature flag enabled.");
            h6 C0 = p().C0(str);
            if (C0 == null) {
                return new ac(u(str));
            }
            ac acVar = null;
            if (C0.t()) {
                k().J().a("sgtm upload enabled in manifest.");
                a4 K = q().K(C0.t0());
                if (K != null) {
                    String V = K.V();
                    if (!TextUtils.isEmpty(V)) {
                        String U = K.U();
                        k().J().c("sgtm configured with upload_url, server_info", V, TextUtils.isEmpty(U) ? "Y" : "N");
                        if (TextUtils.isEmpty(U)) {
                            acVar = new ac(V);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", U);
                            acVar = new ac(V, hashMap);
                        }
                    }
                }
            }
            if (acVar != null) {
                return acVar;
            }
        }
        return new ac(u(str));
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
