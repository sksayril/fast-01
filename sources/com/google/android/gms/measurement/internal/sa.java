package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import h2.p;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class sa implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f6550m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f6551n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ String f6552o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ String f6553p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ sc f6554q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ boolean f6555r;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ y9 f6556s;

    sa(y9 y9Var, AtomicReference atomicReference, String str, String str2, String str3, sc scVar, boolean z9) {
        this.f6556s = y9Var;
        this.f6550m = atomicReference;
        this.f6551n = str;
        this.f6552o = str2;
        this.f6553p = str3;
        this.f6554q = scVar;
        this.f6555r = z9;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<nc> V0;
        synchronized (this.f6550m) {
            try {
                q4 A = this.f6556s.f6749d;
                if (A == null) {
                    this.f6556s.k().F().d("(legacy) Failed to get user properties; not connected to service", x4.u(this.f6551n), this.f6552o, this.f6553p);
                    this.f6550m.set(Collections.emptyList());
                    this.f6550m.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f6551n)) {
                    p.j(this.f6554q);
                    atomicReference2 = this.f6550m;
                    V0 = A.u1(this.f6552o, this.f6553p, this.f6555r, this.f6554q);
                } else {
                    atomicReference2 = this.f6550m;
                    V0 = A.V0(this.f6551n, this.f6552o, this.f6553p, this.f6555r);
                }
                atomicReference2.set(V0);
                this.f6556s.f0();
                atomicReference = this.f6550m;
                atomicReference.notify();
            } catch (RemoteException e10) {
                try {
                    this.f6556s.k().F().d("(legacy) Failed to get user properties; remote exception", x4.u(this.f6551n), this.f6552o, e10);
                    this.f6550m.set(Collections.emptyList());
                    atomicReference = this.f6550m;
                } catch (Throwable th) {
                    this.f6550m.notify();
                    throw th;
                }
            }
        }
    }
}
