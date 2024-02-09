package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class x6 implements Callable<List<e>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f6706a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f6707b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f6708c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ q6 f6709d;

    x6(q6 q6Var, String str, String str2, String str3) {
        this.f6709d = q6Var;
        this.f6706a = str;
        this.f6707b = str2;
        this.f6708c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f6709d.f6463c.n0();
        return this.f6709d.f6463c.d0().Q(this.f6706a, this.f6707b, this.f6708c);
    }
}
