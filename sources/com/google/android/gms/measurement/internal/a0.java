package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import h2.p;
import java.util.Iterator;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    final String f5839a;

    /* renamed from: b  reason: collision with root package name */
    final String f5840b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5841c;

    /* renamed from: d  reason: collision with root package name */
    final long f5842d;

    /* renamed from: e  reason: collision with root package name */
    final long f5843e;

    /* renamed from: f  reason: collision with root package name */
    final d0 f5844f;

    a0(m6 m6Var, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        d0 d0Var;
        p.f(str2);
        p.f(str3);
        this.f5839a = str2;
        this.f5840b = str3;
        this.f5841c = TextUtils.isEmpty(str) ? null : str;
        this.f5842d = j10;
        this.f5843e = j11;
        if (j11 != 0 && j11 > j10) {
            m6Var.k().K().b("Event created with reverse previous/current timestamps. appId", x4.u(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            d0Var = new d0(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    m6Var.k().F().a("Param name can't be null");
                } else {
                    Object r02 = m6Var.K().r0(str4, bundle2.get(str4));
                    if (r02 == null) {
                        m6Var.k().K().b("Param value can't be null", m6Var.C().f(str4));
                    } else {
                        m6Var.K().M(bundle2, str4, r02);
                    }
                }
                it.remove();
            }
            d0Var = new d0(bundle2);
        }
        this.f5844f = d0Var;
    }

    private a0(m6 m6Var, String str, String str2, String str3, long j10, long j11, d0 d0Var) {
        p.f(str2);
        p.f(str3);
        p.j(d0Var);
        this.f5839a = str2;
        this.f5840b = str3;
        this.f5841c = TextUtils.isEmpty(str) ? null : str;
        this.f5842d = j10;
        this.f5843e = j11;
        if (j11 != 0 && j11 > j10) {
            m6Var.k().K().c("Event created with reverse previous/current timestamps. appId, name", x4.u(str2), x4.u(str3));
        }
        this.f5844f = d0Var;
    }

    /* access modifiers changed from: package-private */
    public final a0 a(m6 m6Var, long j10) {
        return new a0(m6Var, this.f5841c, this.f5839a, this.f5840b, this.f5842d, j10, this.f5844f);
    }

    public final String toString() {
        String str = this.f5839a;
        String str2 = this.f5840b;
        String valueOf = String.valueOf(this.f5844f);
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + valueOf + "}";
    }
}
