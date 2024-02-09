package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import h2.p;

public final class n5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6336a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6337b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6338c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6339d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ k5 f6340e;

    public n5(k5 k5Var, String str, boolean z9) {
        this.f6340e = k5Var;
        p.f(str);
        this.f6336a = str;
        this.f6337b = z9;
    }

    public final void a(boolean z9) {
        SharedPreferences.Editor edit = this.f6340e.E().edit();
        edit.putBoolean(this.f6336a, z9);
        edit.apply();
        this.f6339d = z9;
    }

    public final boolean b() {
        if (!this.f6338c) {
            this.f6338c = true;
            this.f6339d = this.f6340e.E().getBoolean(this.f6336a, this.f6337b);
        }
        return this.f6339d;
    }
}
