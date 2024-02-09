package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class y6 implements Callable<List<pc>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f6727a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f6728b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f6729c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ q6 f6730d;

    y6(q6 q6Var, String str, String str2, String str3) {
        this.f6730d = q6Var;
        this.f6727a = str;
        this.f6728b = str2;
        this.f6729c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f6730d.f6463c.n0();
        return this.f6730d.f6463c.d0().x0(this.f6727a, this.f6728b, this.f6729c);
    }
}
