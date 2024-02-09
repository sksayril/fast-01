package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.w1;

final class na implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ i0 f6350m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f6351n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ w1 f6352o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ y9 f6353p;

    na(y9 y9Var, i0 i0Var, String str, w1 w1Var) {
        this.f6353p = y9Var;
        this.f6350m = i0Var;
        this.f6351n = str;
        this.f6352o = w1Var;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            q4 A = this.f6353p.f6749d;
            if (A == null) {
                this.f6353p.k().F().a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = A.v2(this.f6350m, this.f6351n);
                this.f6353p.f0();
            }
        } catch (RemoteException e10) {
            this.f6353p.k().F().b("Failed to send event to the service to bundle", e10);
        } catch (Throwable th) {
            this.f6353p.h().T(this.f6352o, bArr);
            throw th;
        }
        this.f6353p.h().T(this.f6352o, bArr);
    }
}
