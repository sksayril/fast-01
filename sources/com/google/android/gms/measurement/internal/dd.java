package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.m3;

final class dd extends d {

    /* renamed from: g  reason: collision with root package name */
    private m3 f5967g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ xc f5968h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dd(xc xcVar, String str, int i10, m3 m3Var) {
        super(str, i10);
        this.f5968h = xcVar;
        this.f5967g = m3Var;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f5967g.O();
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return this.f5967g.X();
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r7v11, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        if (r4.booleanValue() == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0107, code lost:
        r7 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0144, code lost:
        r4.b(r8, r5);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0394 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0395  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.n4 r18, long r19, com.google.android.gms.measurement.internal.e0 r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = com.google.android.gms.internal.measurement.xd.a()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001b
            com.google.android.gms.measurement.internal.xc r1 = r0.f5968h
            com.google.android.gms.measurement.internal.g r1 = r1.d()
            java.lang.String r4 = r0.f5937a
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.k0.f6194j0
            boolean r1 = r1.C(r4, r5)
            if (r1 == 0) goto L_0x001b
            r1 = 1
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            com.google.android.gms.internal.measurement.m3 r4 = r0.f5967g
            boolean r4 = r4.W()
            if (r4 == 0) goto L_0x0029
            r4 = r21
            long r4 = r4.f5984e
            goto L_0x002b
        L_0x0029:
            r4 = r19
        L_0x002b:
            com.google.android.gms.measurement.internal.xc r6 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r6 = r6.k()
            r7 = 2
            boolean r6 = r6.B(r7)
            r7 = 0
            if (r6 == 0) goto L_0x008d
            com.google.android.gms.measurement.internal.xc r6 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r6 = r6.k()
            com.google.android.gms.measurement.internal.z4 r6 = r6.J()
            int r8 = r0.f5938b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.google.android.gms.internal.measurement.m3 r9 = r0.f5967g
            boolean r9 = r9.Y()
            if (r9 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.m3 r9 = r0.f5967g
            int r9 = r9.O()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x005d
        L_0x005c:
            r9 = r7
        L_0x005d:
            com.google.android.gms.measurement.internal.xc r10 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r10 = r10.f()
            com.google.android.gms.internal.measurement.m3 r11 = r0.f5967g
            java.lang.String r11 = r11.S()
            java.lang.String r10 = r10.c(r11)
            java.lang.String r11 = "Evaluating filter. audience, filter, event"
            r6.d(r11, r8, r9, r10)
            com.google.android.gms.measurement.internal.xc r6 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r6 = r6.k()
            com.google.android.gms.measurement.internal.z4 r6 = r6.J()
            com.google.android.gms.measurement.internal.xc r8 = r0.f5968h
            com.google.android.gms.measurement.internal.jc r8 = r8.n()
            com.google.android.gms.internal.measurement.m3 r9 = r0.f5967g
            java.lang.String r8 = r8.H(r9)
            java.lang.String r9 = "Filter definition"
            r6.b(r9, r8)
        L_0x008d:
            com.google.android.gms.internal.measurement.m3 r6 = r0.f5967g
            boolean r6 = r6.Y()
            if (r6 == 0) goto L_0x03d8
            com.google.android.gms.internal.measurement.m3 r6 = r0.f5967g
            int r6 = r6.O()
            r8 = 256(0x100, float:3.59E-43)
            if (r6 <= r8) goto L_0x00a1
            goto L_0x03d8
        L_0x00a1:
            com.google.android.gms.internal.measurement.m3 r6 = r0.f5967g
            boolean r6 = r6.U()
            com.google.android.gms.internal.measurement.m3 r8 = r0.f5967g
            boolean r8 = r8.V()
            com.google.android.gms.internal.measurement.m3 r9 = r0.f5967g
            boolean r9 = r9.W()
            if (r6 != 0) goto L_0x00bc
            if (r8 != 0) goto L_0x00bc
            if (r9 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r6 = 0
            goto L_0x00bd
        L_0x00bc:
            r6 = 1
        L_0x00bd:
            if (r22 == 0) goto L_0x00e9
            if (r6 != 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.xc r1 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r1 = r1.k()
            com.google.android.gms.measurement.internal.z4 r1 = r1.J()
            int r2 = r0.f5938b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.m3 r4 = r0.f5967g
            boolean r4 = r4.Y()
            if (r4 == 0) goto L_0x00e3
            com.google.android.gms.internal.measurement.m3 r4 = r0.f5967g
            int r4 = r4.O()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x00e3:
            java.lang.String r4 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.c(r4, r2, r7)
            return r3
        L_0x00e9:
            com.google.android.gms.internal.measurement.m3 r8 = r0.f5967g
            java.lang.String r9 = r18.e0()
            boolean r10 = r8.X()
            if (r10 == 0) goto L_0x010b
            com.google.android.gms.internal.measurement.o3 r10 = r8.R()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.d.c(r4, r10)
            if (r4 != 0) goto L_0x0101
            goto L_0x037d
        L_0x0101:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x010b
        L_0x0107:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x037d
        L_0x010b:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.List r5 = r8.T()
            java.util.Iterator r5 = r5.iterator()
        L_0x0118:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0151
            java.lang.Object r10 = r5.next()
            com.google.android.gms.internal.measurement.n3 r10 = (com.google.android.gms.internal.measurement.n3) r10
            java.lang.String r11 = r10.P()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0149
            com.google.android.gms.measurement.internal.xc r4 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r4 = r4.k()
            com.google.android.gms.measurement.internal.z4 r4 = r4.K()
            com.google.android.gms.measurement.internal.xc r5 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r5 = r5.f()
            java.lang.String r5 = r5.c(r9)
            java.lang.String r8 = "null or empty param name in filter. event"
        L_0x0144:
            r4.b(r8, r5)
            goto L_0x037d
        L_0x0149:
            java.lang.String r10 = r10.P()
            r4.add(r10)
            goto L_0x0118
        L_0x0151:
            p.a r5 = new p.a
            r5.<init>()
            java.util.List r10 = r18.f0()
            java.util.Iterator r10 = r10.iterator()
        L_0x015e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01e3
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.p4 r11 = (com.google.android.gms.internal.measurement.p4) r11
            java.lang.String r12 = r11.f0()
            boolean r12 = r4.contains(r12)
            if (r12 == 0) goto L_0x015e
            boolean r12 = r11.k0()
            if (r12 == 0) goto L_0x018f
            java.lang.String r12 = r11.f0()
            boolean r13 = r11.k0()
            if (r13 == 0) goto L_0x018d
            long r13 = r11.a0()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x01b6
        L_0x018d:
            r11 = r7
            goto L_0x01b6
        L_0x018f:
            boolean r12 = r11.i0()
            if (r12 == 0) goto L_0x01a8
            java.lang.String r12 = r11.f0()
            boolean r13 = r11.i0()
            if (r13 == 0) goto L_0x018d
            double r13 = r11.J()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01b6
        L_0x01a8:
            boolean r12 = r11.m0()
            if (r12 == 0) goto L_0x01ba
            java.lang.String r12 = r11.f0()
            java.lang.String r11 = r11.g0()
        L_0x01b6:
            r5.put(r12, r11)
            goto L_0x015e
        L_0x01ba:
            com.google.android.gms.measurement.internal.xc r4 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r4 = r4.k()
            com.google.android.gms.measurement.internal.z4 r4 = r4.K()
            com.google.android.gms.measurement.internal.xc r5 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r5 = r5.f()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.xc r8 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r8 = r8.f()
            java.lang.String r9 = r11.f0()
            java.lang.String r8 = r8.f(r9)
            java.lang.String r9 = "Unknown value for param. event, param"
        L_0x01de:
            r4.c(r9, r5, r8)
            goto L_0x037d
        L_0x01e3:
            java.util.List r4 = r8.T()
            java.util.Iterator r4 = r4.iterator()
        L_0x01eb:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x037b
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.measurement.n3 r8 = (com.google.android.gms.internal.measurement.n3) r8
            boolean r10 = r8.R()
            if (r10 == 0) goto L_0x0205
            boolean r10 = r8.Q()
            if (r10 == 0) goto L_0x0205
            r10 = 1
            goto L_0x0206
        L_0x0205:
            r10 = 0
        L_0x0206:
            java.lang.String r11 = r8.P()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0228
            com.google.android.gms.measurement.internal.xc r4 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r4 = r4.k()
            com.google.android.gms.measurement.internal.z4 r4 = r4.K()
            com.google.android.gms.measurement.internal.xc r5 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r5 = r5.f()
            java.lang.String r5 = r5.c(r9)
            java.lang.String r8 = "Event has empty param name. event"
            goto L_0x0144
        L_0x0228:
            java.lang.Object r12 = r5.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x0271
            boolean r13 = r8.S()
            if (r13 != 0) goto L_0x0257
            com.google.android.gms.measurement.internal.xc r4 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r4 = r4.k()
            com.google.android.gms.measurement.internal.z4 r4 = r4.K()
            com.google.android.gms.measurement.internal.xc r5 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r5 = r5.f()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.xc r8 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r8 = r8.f()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "No number filter for long param. event, param"
            goto L_0x01de
        L_0x0257:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.o3 r8 = r8.N()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.d.c(r11, r8)
            if (r8 != 0) goto L_0x0269
            goto L_0x037d
        L_0x0269:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01eb
            goto L_0x0107
        L_0x0271:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02b7
            boolean r13 = r8.S()
            if (r13 != 0) goto L_0x029d
            com.google.android.gms.measurement.internal.xc r4 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r4 = r4.k()
            com.google.android.gms.measurement.internal.z4 r4 = r4.K()
            com.google.android.gms.measurement.internal.xc r5 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r5 = r5.f()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.xc r8 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r8 = r8.f()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "No number filter for double param. event, param"
            goto L_0x01de
        L_0x029d:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.o3 r8 = r8.N()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.d.b(r11, r8)
            if (r8 != 0) goto L_0x02af
            goto L_0x037d
        L_0x02af:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01eb
            goto L_0x0107
        L_0x02b7:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0338
            boolean r13 = r8.U()
            if (r13 == 0) goto L_0x02d2
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.q3 r8 = r8.O()
            com.google.android.gms.measurement.internal.xc r11 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r11 = r11.k()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.d.g(r12, r8, r11)
            goto L_0x02e8
        L_0x02d2:
            boolean r13 = r8.S()
            if (r13 == 0) goto L_0x0316
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.jc.e0(r12)
            if (r13 == 0) goto L_0x02f4
            com.google.android.gms.internal.measurement.o3 r8 = r8.N()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.d.e(r12, r8)
        L_0x02e8:
            if (r8 != 0) goto L_0x02ec
            goto L_0x037d
        L_0x02ec:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01eb
            goto L_0x0107
        L_0x02f4:
            com.google.android.gms.measurement.internal.xc r4 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r4 = r4.k()
            com.google.android.gms.measurement.internal.z4 r4 = r4.K()
            com.google.android.gms.measurement.internal.xc r5 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r5 = r5.f()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.xc r8 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r8 = r8.f()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "Invalid param value for number filter. event, param"
            goto L_0x01de
        L_0x0316:
            com.google.android.gms.measurement.internal.xc r4 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r4 = r4.k()
            com.google.android.gms.measurement.internal.z4 r4 = r4.K()
            com.google.android.gms.measurement.internal.xc r5 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r5 = r5.f()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.xc r8 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r8 = r8.f()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "No filter for String param. event, param"
            goto L_0x01de
        L_0x0338:
            com.google.android.gms.measurement.internal.xc r4 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r4 = r4.k()
            if (r12 != 0) goto L_0x035f
            com.google.android.gms.measurement.internal.z4 r4 = r4.J()
            com.google.android.gms.measurement.internal.xc r5 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r5 = r5.f()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.xc r7 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r7 = r7.f()
            java.lang.String r7 = r7.f(r11)
            java.lang.String r8 = "Missing param for filter. event, param"
            r4.c(r8, r5, r7)
            goto L_0x0107
        L_0x035f:
            com.google.android.gms.measurement.internal.z4 r4 = r4.K()
            com.google.android.gms.measurement.internal.xc r5 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r5 = r5.f()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.xc r8 = r0.f5968h
            com.google.android.gms.measurement.internal.w4 r8 = r8.f()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "Unknown param type. event, param"
            goto L_0x01de
        L_0x037b:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L_0x037d:
            com.google.android.gms.measurement.internal.xc r4 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r4 = r4.k()
            com.google.android.gms.measurement.internal.z4 r4 = r4.J()
            if (r7 != 0) goto L_0x038c
            java.lang.String r5 = "null"
            goto L_0x038d
        L_0x038c:
            r5 = r7
        L_0x038d:
            java.lang.String r8 = "Event filter result"
            r4.b(r8, r5)
            if (r7 != 0) goto L_0x0395
            return r2
        L_0x0395:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f5939c = r2
            boolean r4 = r7.booleanValue()
            if (r4 != 0) goto L_0x03a0
            return r3
        L_0x03a0:
            r0.f5940d = r2
            if (r6 == 0) goto L_0x03d7
            boolean r2 = r18.i0()
            if (r2 == 0) goto L_0x03d7
            long r4 = r18.b0()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.measurement.m3 r4 = r0.f5967g
            boolean r4 = r4.V()
            if (r4 == 0) goto L_0x03c9
            if (r1 == 0) goto L_0x03c6
            com.google.android.gms.internal.measurement.m3 r1 = r0.f5967g
            boolean r1 = r1.X()
            if (r1 == 0) goto L_0x03c6
            r2 = r16
        L_0x03c6:
            r0.f5942f = r2
            goto L_0x03d7
        L_0x03c9:
            if (r1 == 0) goto L_0x03d5
            com.google.android.gms.internal.measurement.m3 r1 = r0.f5967g
            boolean r1 = r1.X()
            if (r1 == 0) goto L_0x03d5
            r2 = r17
        L_0x03d5:
            r0.f5941e = r2
        L_0x03d7:
            return r3
        L_0x03d8:
            com.google.android.gms.measurement.internal.xc r1 = r0.f5968h
            com.google.android.gms.measurement.internal.x4 r1 = r1.k()
            com.google.android.gms.measurement.internal.z4 r1 = r1.K()
            java.lang.String r3 = r0.f5937a
            java.lang.Object r3 = com.google.android.gms.measurement.internal.x4.u(r3)
            com.google.android.gms.internal.measurement.m3 r4 = r0.f5967g
            boolean r4 = r4.Y()
            if (r4 == 0) goto L_0x03fa
            com.google.android.gms.internal.measurement.m3 r4 = r0.f5967g
            int r4 = r4.O()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x03fa:
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r5 = "Invalid event filter ID. appId, id"
            r1.c(r5, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.dd.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.n4, long, com.google.android.gms.measurement.internal.e0, boolean):boolean");
    }
}
