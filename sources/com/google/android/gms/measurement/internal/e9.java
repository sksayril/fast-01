package com.google.android.gms.measurement.internal;

final class e9 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ z f6003m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y7 f6004n;

    e9(y7 y7Var, z zVar) {
        this.f6004n = y7Var;
        this.f6003m = zVar;
    }

    public final void run() {
        if (this.f6004n.g().y(this.f6003m)) {
            this.f6004n.s().T(false);
        } else {
            this.f6004n.k().I().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f6003m.a()));
        }
    }
}
