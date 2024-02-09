package com.google.android.gms.measurement.internal;

final class u6 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ String f6600m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f6601n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ String f6602o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ long f6603p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ q6 f6604q;

    u6(q6 q6Var, String str, String str2, String str3, long j10) {
        this.f6604q = q6Var;
        this.f6600m = str;
        this.f6601n = str2;
        this.f6602o = str3;
        this.f6603p = j10;
    }

    public final void run() {
        String str = this.f6600m;
        if (str == null) {
            this.f6604q.f6463c.C(this.f6601n, (r9) null);
            return;
        }
        this.f6604q.f6463c.C(this.f6601n, new r9(this.f6602o, str, this.f6603p));
    }
}
