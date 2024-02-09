package com.google.android.gms.internal.measurement;

import p3.h;

public final class q6 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5534a;

    public q6(u6 u6Var) {
        h.j(u6Var, "BuildInfo must be non-null");
        this.f5534a = !u6Var.zza();
    }

    public final boolean a(String str) {
        h.j(str, "flagName must not be null");
        if (!this.f5534a) {
            return true;
        }
        return t6.f5619a.get().b(str);
    }
}
