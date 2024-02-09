package com.google.android.gms.measurement.internal;

import h2.p;
import java.util.concurrent.Callable;

final class dc implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ sc f5965a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zb f5966b;

    dc(zb zbVar, sc scVar) {
        this.f5966b = zbVar;
        this.f5965a = scVar;
    }

    public final /* synthetic */ Object call() {
        z4 J;
        String str;
        if (!this.f5966b.P((String) p.j(this.f5965a.f6559m)).y() || !p7.e(this.f5965a.H).y()) {
            J = this.f5966b.k().J();
            str = "Analytics storage consent denied. Returning null app instance id";
        } else {
            h6 f10 = this.f5966b.f(this.f5965a);
            if (f10 != null) {
                return f10.u0();
            }
            J = this.f5966b.k().K();
            str = "App info was null when attempting to get app instance id";
        }
        J.a(str);
        return null;
    }
}
