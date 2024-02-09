package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

public final class sg extends m {

    /* renamed from: o  reason: collision with root package name */
    private final Callable<Object> f5611o;

    public sg(String str, Callable<Object> callable) {
        super(str);
        this.f5611o = callable;
    }

    public final r a(s6 s6Var, List<r> list) {
        try {
            return s8.b(this.f5611o.call());
        } catch (Exception unused) {
            return r.f5547d;
        }
    }
}
