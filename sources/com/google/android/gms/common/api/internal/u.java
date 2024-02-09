package com.google.android.gms.common.api.internal;

import android.util.Log;
import f2.a;
import g2.b;
import g2.b0;
import h2.c;
import h2.j;
import java.util.Set;

final class u implements c.C0142c, b0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a.f f5035a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f5036b;

    /* renamed from: c  reason: collision with root package name */
    private j f5037c = null;

    /* renamed from: d  reason: collision with root package name */
    private Set f5038d = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f5039e = false;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ b f5040f;

    public u(b bVar, a.f fVar, b bVar2) {
        this.f5040f = bVar;
        this.f5035a = fVar;
        this.f5036b = bVar2;
    }

    /* access modifiers changed from: private */
    public final void h() {
        j jVar;
        if (this.f5039e && (jVar = this.f5037c) != null) {
            this.f5035a.c(jVar, this.f5038d);
        }
    }

    public final void a(e2.b bVar) {
        this.f5040f.f4957p.post(new t(this, bVar));
    }

    public final void b(e2.b bVar) {
        r rVar = (r) this.f5040f.f4953l.get(this.f5036b);
        if (rVar != null) {
            rVar.G(bVar);
        }
    }

    public final void c(j jVar, Set set) {
        if (jVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new e2.b(4));
            return;
        }
        this.f5037c = jVar;
        this.f5038d = set;
        h();
    }
}
