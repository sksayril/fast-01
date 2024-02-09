package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import d3.k;
import f2.b;
import g2.r;

abstract class b0 extends r {

    /* renamed from: b  reason: collision with root package name */
    protected final k f4959b;

    public b0(int i10, k kVar) {
        super(i10);
        this.f4959b = kVar;
    }

    public final void a(Status status) {
        this.f4959b.d(new b(status));
    }

    public final void b(Exception exc) {
        this.f4959b.d(exc);
    }

    public final void c(r rVar) {
        try {
            h(rVar);
        } catch (DeadObjectException e10) {
            a(g0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(g0.e(e11));
        } catch (RuntimeException e12) {
            this.f4959b.d(e12);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void h(r rVar);
}
