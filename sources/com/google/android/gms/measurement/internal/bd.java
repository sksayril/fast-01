package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.n4;

final class bd {

    /* renamed from: a  reason: collision with root package name */
    private n4 f5904a;

    /* renamed from: b  reason: collision with root package name */
    private Long f5905b;

    /* renamed from: c  reason: collision with root package name */
    private long f5906c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ xc f5907d;

    private bd(xc xcVar) {
        this.f5907d = xcVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.n4 a(java.lang.String r18, com.google.android.gms.internal.measurement.n4 r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r8 = r19
            java.lang.String r9 = r19.e0()
            java.util.List r10 = r19.f0()
            com.google.android.gms.measurement.internal.xc r2 = r1.f5907d
            r2.n()
            java.lang.String r2 = "_eid"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.jc.d0(r8, r2)
            r4 = r3
            java.lang.Long r4 = (java.lang.Long) r4
            r3 = 1
            r5 = 0
            if (r4 == 0) goto L_0x0022
            r6 = 1
            goto L_0x0023
        L_0x0022:
            r6 = 0
        L_0x0023:
            if (r6 == 0) goto L_0x002f
            java.lang.String r7 = "_ep"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x002f
            r7 = 1
            goto L_0x0030
        L_0x002f:
            r7 = 0
        L_0x0030:
            r11 = 0
            if (r7 == 0) goto L_0x0147
            h2.p.j(r4)
            com.google.android.gms.measurement.internal.xc r6 = r1.f5907d
            r6.n()
            java.lang.String r6 = "_en"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.jc.d0(r8, r6)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            r7 = 0
            if (r6 == 0) goto L_0x005c
            com.google.android.gms.measurement.internal.xc r0 = r1.f5907d
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.H()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.b(r2, r4)
            return r7
        L_0x005c:
            com.google.android.gms.internal.measurement.n4 r6 = r1.f5904a
            if (r6 == 0) goto L_0x0072
            java.lang.Long r6 = r1.f5905b
            if (r6 == 0) goto L_0x0072
            long r13 = r4.longValue()
            java.lang.Long r6 = r1.f5905b
            long r15 = r6.longValue()
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x00a1
        L_0x0072:
            com.google.android.gms.measurement.internal.xc r6 = r1.f5907d
            com.google.android.gms.measurement.internal.p r6 = r6.p()
            android.util.Pair r6 = r6.G(r0, r4)
            if (r6 == 0) goto L_0x0137
            java.lang.Object r13 = r6.first
            if (r13 != 0) goto L_0x0084
            goto L_0x0137
        L_0x0084:
            com.google.android.gms.internal.measurement.n4 r13 = (com.google.android.gms.internal.measurement.n4) r13
            r1.f5904a = r13
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r1.f5906c = r6
            com.google.android.gms.measurement.internal.xc r6 = r1.f5907d
            r6.n()
            com.google.android.gms.internal.measurement.n4 r6 = r1.f5904a
            java.lang.Object r2 = com.google.android.gms.measurement.internal.jc.d0(r6, r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r1.f5905b = r2
        L_0x00a1:
            long r6 = r1.f5906c
            r13 = 1
            long r6 = r6 - r13
            r1.f5906c = r6
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x00df
            com.google.android.gms.measurement.internal.xc r2 = r1.f5907d
            com.google.android.gms.measurement.internal.p r2 = r2.p()
            r2.m()
            com.google.android.gms.measurement.internal.x4 r4 = r2.k()
            com.google.android.gms.measurement.internal.z4 r4 = r4.J()
            java.lang.String r6 = "Clearing complex main event info. appId"
            r4.b(r6, r0)
            android.database.sqlite.SQLiteDatabase r4 = r2.A()     // Catch:{ SQLiteException -> 0x00d0 }
            java.lang.String r6 = "delete from main_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00d0 }
            r3[r5] = r0     // Catch:{ SQLiteException -> 0x00d0 }
            r4.execSQL(r6, r3)     // Catch:{ SQLiteException -> 0x00d0 }
            goto L_0x00ee
        L_0x00d0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.x4 r2 = r2.k()
            com.google.android.gms.measurement.internal.z4 r2 = r2.F()
            java.lang.String r3 = "Error clearing complex main event"
            r2.b(r3, r0)
            goto L_0x00ee
        L_0x00df:
            com.google.android.gms.measurement.internal.xc r2 = r1.f5907d
            com.google.android.gms.measurement.internal.p r2 = r2.p()
            long r5 = r1.f5906c
            com.google.android.gms.internal.measurement.n4 r7 = r1.f5904a
            r3 = r18
            r2.i0(r3, r4, r5, r7)
        L_0x00ee:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.n4 r2 = r1.f5904a
            java.util.List r2 = r2.f0()
            java.util.Iterator r2 = r2.iterator()
        L_0x00fd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x011c
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.p4 r3 = (com.google.android.gms.internal.measurement.p4) r3
            com.google.android.gms.measurement.internal.xc r4 = r1.f5907d
            r4.n()
            java.lang.String r4 = r3.f0()
            com.google.android.gms.internal.measurement.p4 r4 = com.google.android.gms.measurement.internal.jc.D(r8, r4)
            if (r4 != 0) goto L_0x00fd
            r0.add(r3)
            goto L_0x00fd
        L_0x011c:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0127
            r0.addAll(r10)
            r10 = r0
            goto L_0x018f
        L_0x0127:
            com.google.android.gms.measurement.internal.xc r0 = r1.f5907d
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.H()
            java.lang.String r2 = "No unique parameters in main event. eventName"
        L_0x0133:
            r0.b(r2, r9)
            goto L_0x018f
        L_0x0137:
            com.google.android.gms.measurement.internal.xc r0 = r1.f5907d
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.H()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.c(r2, r9, r4)
            return r7
        L_0x0147:
            if (r6 == 0) goto L_0x018f
            r1.f5905b = r4
            r1.f5904a = r8
            com.google.android.gms.measurement.internal.xc r2 = r1.f5907d
            r2.n()
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            java.lang.String r3 = "_epc"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.jc.d0(r8, r3)
            if (r3 != 0) goto L_0x015f
            goto L_0x0160
        L_0x015f:
            r2 = r3
        L_0x0160:
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r1.f5906c = r2
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x0179
            com.google.android.gms.measurement.internal.xc r0 = r1.f5907d
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.H()
            java.lang.String r2 = "Complex event with zero extra param count. eventName"
            goto L_0x0133
        L_0x0179:
            com.google.android.gms.measurement.internal.xc r2 = r1.f5907d
            com.google.android.gms.measurement.internal.p r2 = r2.p()
            java.lang.Object r3 = h2.p.j(r4)
            r4 = r3
            java.lang.Long r4 = (java.lang.Long) r4
            long r5 = r1.f5906c
            r3 = r18
            r7 = r19
            r2.i0(r3, r4, r5, r7)
        L_0x018f:
            com.google.android.gms.internal.measurement.p8$b r0 = r19.B()
            com.google.android.gms.internal.measurement.n4$a r0 = (com.google.android.gms.internal.measurement.n4.a) r0
            com.google.android.gms.internal.measurement.n4$a r0 = r0.F(r9)
            com.google.android.gms.internal.measurement.n4$a r0 = r0.K()
            com.google.android.gms.internal.measurement.n4$a r0 = r0.E(r10)
            com.google.android.gms.internal.measurement.da r0 = r0.l()
            com.google.android.gms.internal.measurement.p8 r0 = (com.google.android.gms.internal.measurement.p8) r0
            com.google.android.gms.internal.measurement.n4 r0 = (com.google.android.gms.internal.measurement.n4) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.bd.a(java.lang.String, com.google.android.gms.internal.measurement.n4):com.google.android.gms.internal.measurement.n4");
    }
}
