package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import g2.e;
import g2.f;
import g2.h0;
import g2.j0;
import h2.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: m  reason: collision with root package name */
    protected final f f4931m;

    protected LifecycleCallback(f fVar) {
        this.f4931m = fVar;
    }

    public static f c(Activity activity) {
        return d(new e(activity));
    }

    protected static f d(e eVar) {
        if (eVar.d()) {
            return j0.G1(eVar.b());
        }
        if (eVar.c()) {
            return h0.f(eVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static f getChimeraLifecycleFragmentImpl(e eVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity d10 = this.f4931m.d();
        p.j(d10);
        return d10;
    }

    public void e(int i10, int i11, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
