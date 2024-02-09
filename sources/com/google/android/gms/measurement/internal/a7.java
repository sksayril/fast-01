package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class a7 implements Callable<List<e>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f5857a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5858b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5859c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ q6 f5860d;

    a7(q6 q6Var, String str, String str2, String str3) {
        this.f5860d = q6Var;
        this.f5857a = str;
        this.f5858b = str2;
        this.f5859c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f5860d.f6463c.n0();
        return this.f5860d.f6463c.d0().Q(this.f5857a, this.f5858b, this.f5859c);
    }
}
