package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import e2.b;
import h2.c;
import h2.p;
import k2.a;

public final class va implements ServiceConnection, c.a, c.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f6634a;

    /* renamed from: b  reason: collision with root package name */
    private volatile y4 f6635b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ y9 f6636c;

    protected va(y9 y9Var) {
        this.f6636c = y9Var;
    }

    public final void B(int i10) {
        p.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f6636c.k().E().a("Service connection suspended");
        this.f6636c.i().C(new za(this));
    }

    public final void J(b bVar) {
        p.e("MeasurementServiceConnection.onConnectionFailed");
        x4 D = this.f6636c.f6276a.D();
        if (D != null) {
            D.K().b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f6634a = false;
            this.f6635b = null;
        }
        this.f6636c.i().C(new ya(this));
    }

    public final void Y(Bundle bundle) {
        p.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                p.j(this.f6635b);
                this.f6636c.i().C(new wa(this, (q4) this.f6635b.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f6635b = null;
                this.f6634a = false;
            }
        }
    }

    public final void a() {
        this.f6636c.m();
        Context zza = this.f6636c.zza();
        synchronized (this) {
            if (this.f6634a) {
                this.f6636c.k().J().a("Connection attempt already in progress");
            } else if (this.f6635b == null || (!this.f6635b.h() && !this.f6635b.a())) {
                this.f6635b = new y4(zza, Looper.getMainLooper(), this, this);
                this.f6636c.k().J().a("Connecting to remote service");
                this.f6634a = true;
                p.j(this.f6635b);
                this.f6635b.q();
            } else {
                this.f6636c.k().J().a("Already awaiting connection attempt");
            }
        }
    }

    public final void b(Intent intent) {
        this.f6636c.m();
        Context zza = this.f6636c.zza();
        a b10 = a.b();
        synchronized (this) {
            if (this.f6634a) {
                this.f6636c.k().J().a("Connection attempt already in progress");
                return;
            }
            this.f6636c.k().J().a("Using local app measurement service");
            this.f6634a = true;
            b10.a(zza, intent, this.f6636c.f6748c, 129);
        }
    }

    public final void d() {
        if (this.f6635b != null && (this.f6635b.a() || this.f6635b.h())) {
            this.f6635b.m();
        }
        this.f6635b = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.f6636c.k().F().a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            h2.p.e(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f6634a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.y9 r4 = r3.f6636c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.x4 r4 = r4.k()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.z4 r4 = r4.F()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0096
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x005f }
            if (r2 == 0) goto L_0x004f
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x005f }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.q4     // Catch:{ RemoteException -> 0x005f }
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.internal.q4 r1 = (com.google.android.gms.measurement.internal.q4) r1     // Catch:{ RemoteException -> 0x005f }
            goto L_0x003e
        L_0x0039:
            com.google.android.gms.measurement.internal.s4 r1 = new com.google.android.gms.measurement.internal.s4     // Catch:{ RemoteException -> 0x005f }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x005f }
        L_0x003e:
            r0 = r1
            com.google.android.gms.measurement.internal.y9 r5 = r3.f6636c     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.x4 r5 = r5.k()     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.z4 r5 = r5.J()     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x005f }
            goto L_0x006e
        L_0x004f:
            com.google.android.gms.measurement.internal.y9 r5 = r3.f6636c     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.x4 r5 = r5.k()     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.z4 r5 = r5.F()     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r2, r1)     // Catch:{ RemoteException -> 0x005f }
            goto L_0x006e
        L_0x005f:
            com.google.android.gms.measurement.internal.y9 r5 = r3.f6636c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.x4 r5 = r5.k()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.z4 r5 = r5.F()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001c }
        L_0x006e:
            if (r0 != 0) goto L_0x0086
            r3.f6634a = r4     // Catch:{ all -> 0x001c }
            k2.a r4 = k2.a.b()     // Catch:{ IllegalArgumentException -> 0x0094 }
            com.google.android.gms.measurement.internal.y9 r5 = r3.f6636c     // Catch:{ IllegalArgumentException -> 0x0094 }
            android.content.Context r5 = r5.zza()     // Catch:{ IllegalArgumentException -> 0x0094 }
            com.google.android.gms.measurement.internal.y9 r0 = r3.f6636c     // Catch:{ IllegalArgumentException -> 0x0094 }
            com.google.android.gms.measurement.internal.va r0 = r0.f6748c     // Catch:{ IllegalArgumentException -> 0x0094 }
            r4.c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0094 }
            goto L_0x0094
        L_0x0086:
            com.google.android.gms.measurement.internal.y9 r4 = r3.f6636c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.f6 r4 = r4.i()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.ua r5 = new com.google.android.gms.measurement.internal.ua     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.C(r5)     // Catch:{ all -> 0x001c }
        L_0x0094:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0096:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        p.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f6636c.k().E().a("Service disconnected");
        this.f6636c.i().C(new xa(this, componentName));
    }
}
