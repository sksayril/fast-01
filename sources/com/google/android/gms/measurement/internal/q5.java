package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import h2.p;

public final class q5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6458a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6459b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6460c;

    /* renamed from: d  reason: collision with root package name */
    private String f6461d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ k5 f6462e;

    public q5(k5 k5Var, String str, String str2) {
        this.f6462e = k5Var;
        p.f(str);
        this.f6458a = str;
    }

    public final String a() {
        if (!this.f6460c) {
            this.f6460c = true;
            this.f6461d = this.f6462e.E().getString(this.f6458a, (String) null);
        }
        return this.f6461d;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f6462e.E().edit();
        edit.putString(this.f6458a, str);
        edit.apply();
        this.f6461d = str;
    }
}
