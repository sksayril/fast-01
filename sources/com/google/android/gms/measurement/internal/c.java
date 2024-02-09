package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.p3;

final class c extends d {

    /* renamed from: g  reason: collision with root package name */
    private p3 f5908g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ xc f5909h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c(xc xcVar, String str, int i10, p3 p3Var) {
        super(str, i10);
        this.f5909h = xcVar;
        this.f5908g = p3Var;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f5908g.q();
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v15, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.w4 r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = com.google.android.gms.internal.measurement.xd.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.measurement.internal.xc r0 = r10.f5909h
            com.google.android.gms.measurement.internal.g r0 = r0.d()
            java.lang.String r3 = r10.f5937a
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.k0.f6190h0
            boolean r0 = r0.C(r3, r4)
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            com.google.android.gms.internal.measurement.p3 r3 = r10.f5908g
            boolean r3 = r3.P()
            com.google.android.gms.internal.measurement.p3 r4 = r10.f5908g
            boolean r4 = r4.Q()
            com.google.android.gms.internal.measurement.p3 r5 = r10.f5908g
            boolean r5 = r5.R()
            if (r3 != 0) goto L_0x0036
            if (r4 != 0) goto L_0x0036
            if (r5 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r3 = 0
            goto L_0x0037
        L_0x0036:
            r3 = 1
        L_0x0037:
            r4 = 0
            if (r14 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.xc r11 = r10.f5909h
            com.google.android.gms.measurement.internal.x4 r11 = r11.k()
            com.google.android.gms.measurement.internal.z4 r11 = r11.J()
            int r12 = r10.f5938b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.p3 r13 = r10.f5908g
            boolean r13 = r13.S()
            if (r13 == 0) goto L_0x005e
            com.google.android.gms.internal.measurement.p3 r13 = r10.f5908g
            int r13 = r13.q()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
        L_0x005e:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.c(r13, r12, r4)
            return r2
        L_0x0064:
            com.google.android.gms.internal.measurement.p3 r6 = r10.f5908g
            com.google.android.gms.internal.measurement.n3 r6 = r6.L()
            boolean r7 = r6.Q()
            boolean r8 = r13.g0()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.S()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.xc r6 = r10.f5909h
            com.google.android.gms.measurement.internal.x4 r6 = r6.k()
            com.google.android.gms.measurement.internal.z4 r6 = r6.K()
            com.google.android.gms.measurement.internal.xc r7 = r10.f5909h
            com.google.android.gms.measurement.internal.w4 r7 = r7.f()
            java.lang.String r8 = r13.c0()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "No number filter for long property. property"
        L_0x0094:
            r6.b(r8, r7)
            goto L_0x0175
        L_0x0099:
            long r8 = r13.X()
            com.google.android.gms.internal.measurement.o3 r4 = r6.N()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.d.c(r8, r4)
        L_0x00a5:
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.d.d(r4, r7)
            goto L_0x0175
        L_0x00ab:
            boolean r8 = r13.e0()
            if (r8 == 0) goto L_0x00df
            boolean r8 = r6.S()
            if (r8 != 0) goto L_0x00d2
            com.google.android.gms.measurement.internal.xc r6 = r10.f5909h
            com.google.android.gms.measurement.internal.x4 r6 = r6.k()
            com.google.android.gms.measurement.internal.z4 r6 = r6.K()
            com.google.android.gms.measurement.internal.xc r7 = r10.f5909h
            com.google.android.gms.measurement.internal.w4 r7 = r7.f()
            java.lang.String r8 = r13.c0()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "No number filter for double property. property"
            goto L_0x0094
        L_0x00d2:
            double r8 = r13.J()
            com.google.android.gms.internal.measurement.o3 r4 = r6.N()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.d.b(r8, r4)
            goto L_0x00a5
        L_0x00df:
            boolean r8 = r13.i0()
            if (r8 == 0) goto L_0x0159
            boolean r8 = r6.U()
            if (r8 != 0) goto L_0x0145
            boolean r8 = r6.S()
            if (r8 != 0) goto L_0x010c
            com.google.android.gms.measurement.internal.xc r6 = r10.f5909h
            com.google.android.gms.measurement.internal.x4 r6 = r6.k()
            com.google.android.gms.measurement.internal.z4 r6 = r6.K()
            com.google.android.gms.measurement.internal.xc r7 = r10.f5909h
            com.google.android.gms.measurement.internal.w4 r7 = r7.f()
            java.lang.String r8 = r13.c0()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            goto L_0x0094
        L_0x010c:
            java.lang.String r8 = r13.d0()
            boolean r8 = com.google.android.gms.measurement.internal.jc.e0(r8)
            if (r8 == 0) goto L_0x0123
            java.lang.String r4 = r13.d0()
            com.google.android.gms.internal.measurement.o3 r6 = r6.N()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.d.e(r4, r6)
            goto L_0x00a5
        L_0x0123:
            com.google.android.gms.measurement.internal.xc r6 = r10.f5909h
            com.google.android.gms.measurement.internal.x4 r6 = r6.k()
            com.google.android.gms.measurement.internal.z4 r6 = r6.K()
            com.google.android.gms.measurement.internal.xc r7 = r10.f5909h
            com.google.android.gms.measurement.internal.w4 r7 = r7.f()
            java.lang.String r8 = r13.c0()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = r13.d0()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.c(r9, r7, r8)
            goto L_0x0175
        L_0x0145:
            java.lang.String r4 = r13.d0()
            com.google.android.gms.internal.measurement.q3 r6 = r6.O()
            com.google.android.gms.measurement.internal.xc r8 = r10.f5909h
            com.google.android.gms.measurement.internal.x4 r8 = r8.k()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.d.g(r4, r6, r8)
            goto L_0x00a5
        L_0x0159:
            com.google.android.gms.measurement.internal.xc r6 = r10.f5909h
            com.google.android.gms.measurement.internal.x4 r6 = r6.k()
            com.google.android.gms.measurement.internal.z4 r6 = r6.K()
            com.google.android.gms.measurement.internal.xc r7 = r10.f5909h
            com.google.android.gms.measurement.internal.w4 r7 = r7.f()
            java.lang.String r8 = r13.c0()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "User property has no value, property"
            goto L_0x0094
        L_0x0175:
            com.google.android.gms.measurement.internal.xc r6 = r10.f5909h
            com.google.android.gms.measurement.internal.x4 r6 = r6.k()
            com.google.android.gms.measurement.internal.z4 r6 = r6.J()
            if (r4 != 0) goto L_0x0184
            java.lang.String r7 = "null"
            goto L_0x0185
        L_0x0184:
            r7 = r4
        L_0x0185:
            java.lang.String r8 = "Property filter result"
            r6.b(r8, r7)
            if (r4 != 0) goto L_0x018d
            return r1
        L_0x018d:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r10.f5939c = r1
            if (r5 == 0) goto L_0x019a
            boolean r1 = r4.booleanValue()
            if (r1 != 0) goto L_0x019a
            return r2
        L_0x019a:
            if (r14 == 0) goto L_0x01a4
            com.google.android.gms.internal.measurement.p3 r14 = r10.f5908g
            boolean r14 = r14.P()
            if (r14 == 0) goto L_0x01a6
        L_0x01a4:
            r10.f5940d = r4
        L_0x01a6:
            boolean r14 = r4.booleanValue()
            if (r14 == 0) goto L_0x01eb
            if (r3 == 0) goto L_0x01eb
            boolean r14 = r13.h0()
            if (r14 == 0) goto L_0x01eb
            long r13 = r13.Z()
            if (r11 == 0) goto L_0x01be
            long r13 = r11.longValue()
        L_0x01be:
            if (r0 == 0) goto L_0x01d6
            com.google.android.gms.internal.measurement.p3 r11 = r10.f5908g
            boolean r11 = r11.P()
            if (r11 == 0) goto L_0x01d6
            com.google.android.gms.internal.measurement.p3 r11 = r10.f5908g
            boolean r11 = r11.Q()
            if (r11 != 0) goto L_0x01d6
            if (r12 == 0) goto L_0x01d6
            long r13 = r12.longValue()
        L_0x01d6:
            com.google.android.gms.internal.measurement.p3 r11 = r10.f5908g
            boolean r11 = r11.Q()
            if (r11 == 0) goto L_0x01e5
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f5942f = r11
            goto L_0x01eb
        L_0x01e5:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f5941e = r11
        L_0x01eb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.w4, boolean):boolean");
    }
}
