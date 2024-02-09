package com.google.android.gms.measurement.internal;

final class a5 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ int f5849m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f5850n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ Object f5851o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ Object f5852p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ Object f5853q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ x4 f5854r;

    a5(x4 x4Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f5854r = x4Var;
        this.f5849m = i10;
        this.f5850n = str;
        this.f5851o = obj;
        this.f5852p = obj2;
        this.f5853q = obj3;
    }

    public final void run() {
        char c10;
        x4 x4Var;
        k5 E = this.f5854r.f6276a.E();
        if (!E.q()) {
            this.f5854r.x(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f5854r.f6692c == 0) {
            if (this.f5854r.d().S()) {
                x4Var = this.f5854r;
                c10 = 'C';
            } else {
                x4Var = this.f5854r;
                c10 = 'c';
            }
            x4Var.f6692c = c10;
        }
        if (this.f5854r.f6693d < 0) {
            this.f5854r.f6693d = 82001;
        }
        String str = "2" + "01VDIWEA?".charAt(this.f5849m) + this.f5854r.f6692c + this.f5854r.f6693d + ":" + x4.w(true, this.f5850n, this.f5851o, this.f5852p, this.f5853q);
        if (str.length() > 1024) {
            str = this.f5850n.substring(0, 1024);
        }
        o5 o5Var = E.f6233d;
        if (o5Var != null) {
            o5Var.b(str, 1);
        }
    }
}
