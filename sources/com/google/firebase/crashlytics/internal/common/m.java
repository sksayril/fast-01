package com.google.firebase.crashlytics.internal.common;

import d5.b;
import g4.f;
import z3.g;

public class m implements b {

    /* renamed from: a  reason: collision with root package name */
    private final x f7318a;

    /* renamed from: b  reason: collision with root package name */
    private final l f7319b;

    public m(x xVar, f fVar) {
        this.f7318a = xVar;
        this.f7319b = new l(fVar);
    }

    public b.a a() {
        return b.a.CRASHLYTICS;
    }

    public void b(b.C0125b bVar) {
        g f10 = g.f();
        f10.b("App Quality Sessions session changed: " + bVar);
        this.f7319b.h(bVar.a());
    }

    public boolean c() {
        return this.f7318a.d();
    }

    public String d(String str) {
        return this.f7319b.c(str);
    }

    public void e(String str) {
        this.f7319b.i(str);
    }
}
