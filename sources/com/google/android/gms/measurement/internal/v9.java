package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class v9 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ r9 f6629m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ r9 f6630n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ long f6631o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ boolean f6632p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ q9 f6633q;

    v9(q9 q9Var, r9 r9Var, r9 r9Var2, long j10, boolean z9) {
        this.f6633q = q9Var;
        this.f6629m = r9Var;
        this.f6630n = r9Var2;
        this.f6631o = j10;
        this.f6632p = z9;
    }

    public final void run() {
        this.f6633q.M(this.f6629m, this.f6630n, this.f6631o, this.f6632p, (Bundle) null);
    }
}
