package com.google.android.gms.measurement.internal;

import h2.p;
import java.util.List;
import java.util.Map;

final class h5 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final d5 f6075m;

    /* renamed from: n  reason: collision with root package name */
    private final int f6076n;

    /* renamed from: o  reason: collision with root package name */
    private final Throwable f6077o;

    /* renamed from: p  reason: collision with root package name */
    private final byte[] f6078p;

    /* renamed from: q  reason: collision with root package name */
    private final String f6079q;

    /* renamed from: r  reason: collision with root package name */
    private final Map<String, List<String>> f6080r;

    private h5(String str, d5 d5Var, int i10, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        p.j(d5Var);
        this.f6075m = d5Var;
        this.f6076n = i10;
        this.f6077o = th;
        this.f6078p = bArr;
        this.f6079q = str;
        this.f6080r = map;
    }

    public final void run() {
        this.f6075m.a(this.f6079q, this.f6076n, this.f6077o, this.f6078p, this.f6080r);
    }
}
