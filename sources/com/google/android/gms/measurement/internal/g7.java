package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class g7 implements Callable<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i0 f6052a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f6053b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ q6 f6054c;

    g7(q6 q6Var, i0 i0Var, String str) {
        this.f6054c = q6Var;
        this.f6052a = i0Var;
        this.f6053b = str;
    }

    public final /* synthetic */ Object call() {
        this.f6054c.f6463c.n0();
        return this.f6054c.f6463c.i0().x(this.f6052a, this.f6053b);
    }
}
