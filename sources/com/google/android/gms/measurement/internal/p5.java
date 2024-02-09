package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import h2.p;

public final class p5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6421a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6422b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6423c;

    /* renamed from: d  reason: collision with root package name */
    private long f6424d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ k5 f6425e;

    public p5(k5 k5Var, String str, long j10) {
        this.f6425e = k5Var;
        p.f(str);
        this.f6421a = str;
        this.f6422b = j10;
    }

    public final long a() {
        if (!this.f6423c) {
            this.f6423c = true;
            this.f6424d = this.f6425e.E().getLong(this.f6421a, this.f6422b);
        }
        return this.f6424d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f6425e.E().edit();
        edit.putLong(this.f6421a, j10);
        edit.apply();
        this.f6424d = j10;
    }
}
