package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f4991a;

    public g0(int i10) {
        this.f4991a = i10;
    }

    static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(r rVar);

    public abstract void d(j jVar, boolean z9);
}
