package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.w1;
import h2.p;
import java.util.ArrayList;

final class ta implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ String f6584m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f6585n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ sc f6586o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ w1 f6587p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ y9 f6588q;

    ta(y9 y9Var, String str, String str2, sc scVar, w1 w1Var) {
        this.f6588q = y9Var;
        this.f6584m = str;
        this.f6585n = str2;
        this.f6586o = scVar;
        this.f6587p = w1Var;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            q4 A = this.f6588q.f6749d;
            if (A == null) {
                this.f6588q.k().F().c("Failed to get conditional properties; not connected to service", this.f6584m, this.f6585n);
            } else {
                p.j(this.f6586o);
                arrayList = oc.s0(A.c0(this.f6584m, this.f6585n, this.f6586o));
                this.f6588q.f0();
            }
        } catch (RemoteException e10) {
            this.f6588q.k().F().d("Failed to get conditional properties; remote exception", this.f6584m, this.f6585n, e10);
        } catch (Throwable th) {
            this.f6588q.h().R(this.f6587p, arrayList);
            throw th;
        }
        this.f6588q.h().R(this.f6587p, arrayList);
    }
}
