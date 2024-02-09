package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import d3.k;
import e2.d;
import g2.j;
import g2.r;

public final class e0 extends r {

    /* renamed from: b  reason: collision with root package name */
    private final g f4970b;

    /* renamed from: c  reason: collision with root package name */
    private final k f4971c;

    /* renamed from: d  reason: collision with root package name */
    private final j f4972d;

    public e0(int i10, g gVar, k kVar, j jVar) {
        super(i10);
        this.f4971c = kVar;
        this.f4970b = gVar;
        this.f4972d = jVar;
        if (i10 == 2 && gVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.f4971c.d(this.f4972d.a(status));
    }

    public final void b(Exception exc) {
        this.f4971c.d(exc);
    }

    public final void c(r rVar) {
        try {
            this.f4970b.b(rVar.s(), this.f4971c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(g0.e(e11));
        } catch (RuntimeException e12) {
            this.f4971c.d(e12);
        }
    }

    public final void d(j jVar, boolean z9) {
        jVar.b(this.f4971c, z9);
    }

    public final boolean f(r rVar) {
        return this.f4970b.c();
    }

    public final d[] g(r rVar) {
        return this.f4970b.e();
    }
}
