package com.google.android.gms.measurement.internal;

final class o8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ String f6385m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f6386n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ Object f6387o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ long f6388p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ y7 f6389q;

    o8(y7 y7Var, String str, String str2, Object obj, long j10) {
        this.f6389q = y7Var;
        this.f6385m = str;
        this.f6386n = str2;
        this.f6387o = obj;
        this.f6388p = j10;
    }

    public final void run() {
        this.f6389q.Z(this.f6385m, this.f6386n, this.f6387o, this.f6388p);
    }
}
