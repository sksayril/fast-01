package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class ha implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ r9 f6110m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y9 f6111n;

    ha(y9 y9Var, r9 r9Var) {
        this.f6111n = y9Var;
        this.f6110m = r9Var;
    }

    public final void run() {
        long j10;
        String str;
        String str2;
        String packageName;
        q4 A = this.f6111n.f6749d;
        if (A == null) {
            this.f6111n.k().F().a("Failed to send current screen to service");
            return;
        }
        try {
            r9 r9Var = this.f6110m;
            if (r9Var == null) {
                j10 = 0;
                str = null;
                str2 = null;
                packageName = this.f6111n.zza().getPackageName();
            } else {
                j10 = r9Var.f6518c;
                str = r9Var.f6516a;
                str2 = r9Var.f6517b;
                packageName = this.f6111n.zza().getPackageName();
            }
            A.s2(j10, str, str2, packageName);
            this.f6111n.f0();
        } catch (RemoteException e10) {
            this.f6111n.k().F().b("Failed to send current screen to the service", e10);
        }
    }
}
