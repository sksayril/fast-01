package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import h2.p;

public final class o5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6379a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6380b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6381c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6382d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ k5 f6383e;

    private o5(k5 k5Var, String str, long j10) {
        this.f6383e = k5Var;
        p.f(str);
        p.a(j10 > 0);
        this.f6379a = str + ":start";
        this.f6380b = str + ":count";
        this.f6381c = str + ":value";
        this.f6382d = j10;
    }

    private final long c() {
        return this.f6383e.E().getLong(this.f6379a, 0);
    }

    private final void d() {
        this.f6383e.m();
        long a10 = this.f6383e.a().a();
        SharedPreferences.Editor edit = this.f6383e.E().edit();
        edit.remove(this.f6380b);
        edit.remove(this.f6381c);
        edit.putLong(this.f6379a, a10);
        edit.apply();
    }

    public final Pair<String, Long> a() {
        long j10;
        this.f6383e.m();
        this.f6383e.m();
        long c10 = c();
        if (c10 == 0) {
            d();
            j10 = 0;
        } else {
            j10 = Math.abs(c10 - this.f6383e.a().a());
        }
        long j11 = this.f6382d;
        if (j10 < j11) {
            return null;
        }
        if (j10 > (j11 << 1)) {
            d();
            return null;
        }
        String string = this.f6383e.E().getString(this.f6381c, (String) null);
        long j12 = this.f6383e.E().getLong(this.f6380b, 0);
        d();
        return (string == null || j12 <= 0) ? k5.f6231z : new Pair<>(string, Long.valueOf(j12));
    }

    public final void b(String str, long j10) {
        this.f6383e.m();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f6383e.E().getLong(this.f6380b, 0);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f6383e.E().edit();
            edit.putString(this.f6381c, str);
            edit.putLong(this.f6380b, 1);
            edit.apply();
            return;
        }
        long j12 = j11 + 1;
        boolean z9 = (this.f6383e.h().T0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12;
        SharedPreferences.Editor edit2 = this.f6383e.E().edit();
        if (z9) {
            edit2.putString(this.f6381c, str);
        }
        edit2.putLong(this.f6380b, j12);
        edit2.apply();
    }
}
