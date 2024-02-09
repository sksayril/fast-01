package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class v6 implements Callable<List<pc>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f6618a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f6619b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f6620c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ q6 f6621d;

    v6(q6 q6Var, String str, String str2, String str3) {
        this.f6621d = q6Var;
        this.f6618a = str;
        this.f6619b = str2;
        this.f6620c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f6621d.f6463c.n0();
        return this.f6621d.f6463c.d0().x0(this.f6618a, this.f6619b, this.f6620c);
    }
}
