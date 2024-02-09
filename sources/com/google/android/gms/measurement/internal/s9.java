package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class s9 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ Bundle f6545m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ r9 f6546n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ r9 f6547o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ long f6548p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ q9 f6549q;

    s9(q9 q9Var, Bundle bundle, r9 r9Var, r9 r9Var2, long j10) {
        this.f6549q = q9Var;
        this.f6545m = bundle;
        this.f6546n = r9Var;
        this.f6547o = r9Var2;
        this.f6548p = j10;
    }

    public final void run() {
        q9.I(this.f6549q, this.f6545m, this.f6546n, this.f6547o, this.f6548p);
    }
}
