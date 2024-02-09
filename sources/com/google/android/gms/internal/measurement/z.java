package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    final List<x0> f5734a = new ArrayList();

    protected z() {
    }

    /* access modifiers changed from: package-private */
    public final r a(String str) {
        if (this.f5734a.contains(r5.c(str))) {
            throw new UnsupportedOperationException("Command not implemented: " + str);
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract r b(String str, s6 s6Var, List<r> list);
}
