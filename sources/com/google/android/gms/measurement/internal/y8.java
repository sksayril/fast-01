package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.w1;

final class y8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ w1 f6746m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y7 f6747n;

    y8(y7 y7Var, w1 w1Var) {
        this.f6747n = y7Var;
        this.f6746m = w1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0086 A[SYNTHETIC, Splitter:B:18:0x0086] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.y7 r0 = r7.f6747n
            com.google.android.gms.measurement.internal.gb r0 = r0.t()
            boolean r1 = com.google.android.gms.internal.measurement.of.a()
            r2 = 0
            if (r1 == 0) goto L_0x0064
            com.google.android.gms.measurement.internal.g r1 = r0.d()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.k0.D0
            boolean r1 = r1.r(r3)
            if (r1 == 0) goto L_0x0064
            com.google.android.gms.measurement.internal.k5 r1 = r0.g()
            com.google.android.gms.measurement.internal.p7 r1 = r1.I()
            boolean r1 = r1.y()
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.L()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            goto L_0x006e
        L_0x0032:
            com.google.android.gms.measurement.internal.k5 r1 = r0.g()
            l2.d r3 = r0.a()
            long r3 = r3.a()
            boolean r1 = r1.x(r3)
            if (r1 != 0) goto L_0x0071
            com.google.android.gms.measurement.internal.k5 r1 = r0.g()
            com.google.android.gms.measurement.internal.p5 r1 = r1.f6246q
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0055
            goto L_0x0071
        L_0x0055:
            com.google.android.gms.measurement.internal.k5 r0 = r0.g()
            com.google.android.gms.measurement.internal.p5 r0 = r0.f6246q
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0072
        L_0x0064:
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.L()
            java.lang.String r1 = "getSessionId has been disabled."
        L_0x006e:
            r0.a(r1)
        L_0x0071:
            r0 = r2
        L_0x0072:
            if (r0 == 0) goto L_0x0086
            com.google.android.gms.measurement.internal.y7 r1 = r7.f6747n
            com.google.android.gms.measurement.internal.m6 r1 = r1.f6276a
            com.google.android.gms.measurement.internal.oc r1 = r1.K()
            com.google.android.gms.internal.measurement.w1 r2 = r7.f6746m
            long r3 = r0.longValue()
            r1.O(r2, r3)
            return
        L_0x0086:
            com.google.android.gms.internal.measurement.w1 r0 = r7.f6746m     // Catch:{ RemoteException -> 0x008c }
            r0.p(r2)     // Catch:{ RemoteException -> 0x008c }
            return
        L_0x008c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.y7 r1 = r7.f6747n
            com.google.android.gms.measurement.internal.m6 r1 = r1.f6276a
            com.google.android.gms.measurement.internal.x4 r1 = r1.k()
            com.google.android.gms.measurement.internal.z4 r1 = r1.F()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y8.run():void");
    }
}
