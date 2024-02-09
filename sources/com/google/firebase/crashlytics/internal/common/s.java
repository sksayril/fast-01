package com.google.firebase.crashlytics.internal.common;

import g4.f;
import java.io.File;
import java.io.IOException;
import z3.g;

class s {

    /* renamed from: a  reason: collision with root package name */
    private final String f7411a;

    /* renamed from: b  reason: collision with root package name */
    private final f f7412b;

    public s(String str, f fVar) {
        this.f7411a = str;
        this.f7412b = fVar;
    }

    private File b() {
        return this.f7412b.e(this.f7411a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            g f10 = g.f();
            f10.e("Error creating marker: " + this.f7411a, e10);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
