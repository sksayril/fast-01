package com.google.android.gms.measurement.internal;

import h2.p;
import java.lang.Thread;

final class i6 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final String f6124a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f6 f6125b;

    public i6(f6 f6Var, String str) {
        this.f6125b = f6Var;
        p.j(str);
        this.f6124a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f6125b.k().F().b(this.f6124a, th);
    }
}
