package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import androidx.lifecycle.g0;
import androidx.lifecycle.m;
import j0.a;
import s0.c;
import s0.d;

class a0 implements f, d, g0 {

    /* renamed from: m  reason: collision with root package name */
    private final Fragment f2365m;

    /* renamed from: n  reason: collision with root package name */
    private final f0 f2366n;

    /* renamed from: o  reason: collision with root package name */
    private m f2367o = null;

    /* renamed from: p  reason: collision with root package name */
    private c f2368p = null;

    a0(Fragment fragment, f0 f0Var) {
        this.f2365m = fragment;
        this.f2366n = f0Var;
    }

    public g a() {
        c();
        return this.f2367o;
    }

    /* access modifiers changed from: package-private */
    public void b(g.a aVar) {
        this.f2367o.h(aVar);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f2367o == null) {
            this.f2367o = new m(this);
            this.f2368p = c.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f2367o != null;
    }

    public /* synthetic */ a e() {
        return e.a(this);
    }

    /* access modifiers changed from: package-private */
    public void f(Bundle bundle) {
        this.f2368p.d(bundle);
    }

    /* access modifiers changed from: package-private */
    public void g(Bundle bundle) {
        this.f2368p.e(bundle);
    }

    /* access modifiers changed from: package-private */
    public void h(g.b bVar) {
        this.f2367o.n(bVar);
    }

    public androidx.savedstate.a k() {
        c();
        return this.f2368p.b();
    }

    public f0 l() {
        c();
        return this.f2366n;
    }
}
