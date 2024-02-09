package t2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import d3.k;
import e2.d;
import g2.c;
import h2.e;
import h2.h;
import p.g;
import w2.s;

public final class c0 extends h {
    private final g I = new g();
    private final g J = new g();
    private final g K = new g();

    public c0(Context context, Looper looper, e eVar, c cVar, g2.h hVar) {
        super(context, looper, 23, eVar, cVar, hVar);
    }

    private final boolean m0(d dVar) {
        d dVar2;
        d[] i10 = i();
        if (i10 == null) {
            return false;
        }
        int length = i10.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                dVar2 = null;
                break;
            }
            dVar2 = i10[i11];
            if (dVar.d().equals(dVar2.d())) {
                break;
            }
            i11++;
        }
        return dVar2 != null && dVar2.f() >= dVar.f();
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final void M(int i10) {
        super.M(i10);
        synchronized (this.I) {
            this.I.clear();
        }
        synchronized (this.J) {
            this.J.clear();
        }
        synchronized (this.K) {
            this.K.clear();
        }
    }

    public final boolean S() {
        return true;
    }

    public final int g() {
        return 11717000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l0(com.google.android.gms.common.api.internal.c.a r10, boolean r11, d3.k r12) {
        /*
            r9 = this;
            p.g r0 = r9.J
            monitor-enter(r0)
            p.g r1 = r9.J     // Catch:{ all -> 0x005b }
            java.lang.Object r10 = r1.remove(r10)     // Catch:{ all -> 0x005b }
            r5 = r10
            t2.a0 r5 = (t2.a0) r5     // Catch:{ all -> 0x005b }
            if (r5 != 0) goto L_0x0015
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x005b }
            r12.c(r10)     // Catch:{ all -> 0x005b }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x0015:
            r5.g()     // Catch:{ all -> 0x005b }
            if (r11 == 0) goto L_0x0054
            e2.d r10 = w2.s.f12864j     // Catch:{ all -> 0x005b }
            boolean r10 = r9.m0(r10)     // Catch:{ all -> 0x005b }
            if (r10 == 0) goto L_0x0038
            android.os.IInterface r10 = r9.D()     // Catch:{ all -> 0x005b }
            t2.d1 r10 = (t2.d1) r10     // Catch:{ all -> 0x005b }
            r11 = 0
            t2.d0 r11 = t2.d0.d(r11, r5, r11, r11)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            t2.r r2 = new t2.r     // Catch:{ all -> 0x005b }
            r2.<init>(r9, r1, r12)     // Catch:{ all -> 0x005b }
            r10.F2(r11, r2)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x0038:
            android.os.IInterface r10 = r9.D()     // Catch:{ all -> 0x005b }
            t2.d1 r10 = (t2.d1) r10     // Catch:{ all -> 0x005b }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            t2.t r7 = new t2.t     // Catch:{ all -> 0x005b }
            r7.<init>(r11, r12)     // Catch:{ all -> 0x005b }
            t2.h0 r11 = new t2.h0     // Catch:{ all -> 0x005b }
            r2 = 2
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x005b }
            r10.B1(r11)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x0054:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            r12.c(r10)     // Catch:{ all -> 0x005b }
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x005b:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.c0.l0(com.google.android.gms.common.api.internal.c$a, boolean, d3.k):void");
    }

    public final void n0(w2.d dVar, k kVar) {
        y();
        if (m0(s.f12860f)) {
            ((d1) D()).g1(dVar, new s(this, kVar));
        } else {
            kVar.c(((d1) D()).c());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o0(t2.w r18, com.google.android.gms.location.LocationRequest r19, d3.k r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            com.google.android.gms.common.api.internal.c r3 = r18.zza()
            com.google.android.gms.common.api.internal.c$a r4 = r3.b()
            r4.getClass()
            e2.d r5 = w2.s.f12864j
            boolean r5 = r1.m0(r5)
            p.g r6 = r1.J
            monitor-enter(r6)
            p.g r7 = r1.J     // Catch:{ all -> 0x0082 }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ all -> 0x0082 }
            t2.a0 r7 = (t2.a0) r7     // Catch:{ all -> 0x0082 }
            r8 = 0
            if (r7 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            r7.e3(r3)     // Catch:{ all -> 0x0082 }
            r13 = r7
            r7 = r8
            goto L_0x003b
        L_0x002e:
            t2.a0 r3 = new t2.a0     // Catch:{ all -> 0x0082 }
            r9 = r18
            r3.<init>(r9)     // Catch:{ all -> 0x0082 }
            p.g r9 = r1.J     // Catch:{ all -> 0x0082 }
            r9.put(r4, r3)     // Catch:{ all -> 0x0082 }
            r13 = r3
        L_0x003b:
            r17.y()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = r4.a()     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x0057
            android.os.IInterface r4 = r17.D()     // Catch:{ all -> 0x0082 }
            t2.d1 r4 = (t2.d1) r4     // Catch:{ all -> 0x0082 }
            t2.d0 r3 = t2.d0.d(r7, r13, r8, r3)     // Catch:{ all -> 0x0082 }
            t2.r r5 = new t2.r     // Catch:{ all -> 0x0082 }
            r5.<init>(r1, r8, r2)     // Catch:{ all -> 0x0082 }
            r4.v0(r3, r0, r5)     // Catch:{ all -> 0x0082 }
            goto L_0x0080
        L_0x0057:
            android.os.IInterface r4 = r17.D()     // Catch:{ all -> 0x0082 }
            t2.d1 r4 = (t2.d1) r4     // Catch:{ all -> 0x0082 }
            com.google.android.gms.location.LocationRequest$a r5 = new com.google.android.gms.location.LocationRequest$a     // Catch:{ all -> 0x0082 }
            r5.<init>((com.google.android.gms.location.LocationRequest) r0)     // Catch:{ all -> 0x0082 }
            r5.j(r8)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.location.LocationRequest r0 = r5.a()     // Catch:{ all -> 0x0082 }
            t2.f0 r11 = t2.f0.d(r8, r0)     // Catch:{ all -> 0x0082 }
            t2.u r15 = new t2.u     // Catch:{ all -> 0x0082 }
            r15.<init>(r2, r13)     // Catch:{ all -> 0x0082 }
            t2.h0 r0 = new t2.h0     // Catch:{ all -> 0x0082 }
            r10 = 1
            r12 = 0
            r14 = 0
            r9 = r0
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0082 }
            r4.B1(r0)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            return
        L_0x0082:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.c0.o0(t2.w, com.google.android.gms.location.LocationRequest, d3.k):void");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof d1 ? (d1) queryLocalInterface : new c1(iBinder);
    }

    public final d[] v() {
        return s.f12866l;
    }
}
