package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.sg;
import java.util.concurrent.Callable;

public final /* synthetic */ class a6 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ w5 f5855a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f5856b;

    public /* synthetic */ a6(w5 w5Var, String str) {
        this.f5855a = w5Var;
        this.f5856b = str;
    }

    public final Object call() {
        return new sg("internal.appMetadata", new y5(this.f5855a, this.f5856b));
    }
}
