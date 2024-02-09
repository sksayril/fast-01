package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.tb;
import java.util.concurrent.Callable;

public final /* synthetic */ class x5 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ w5 f6704a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f6705b;

    public /* synthetic */ x5(w5 w5Var, String str) {
        this.f6704a = w5Var;
        this.f6705b = str;
    }

    public final Object call() {
        return new tb("internal.remoteConfig", new e6(this.f6704a, this.f6705b));
    }
}
