package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class g0 {
    private static g a(g gVar, s6 s6Var, m mVar) {
        return b(gVar, s6Var, mVar, (Boolean) null, (Boolean) null);
    }

    private static g b(g gVar, s6 s6Var, m mVar, Boolean bool, Boolean bool2) {
        g gVar2 = new g();
        Iterator<Integer> H = gVar.H();
        while (H.hasNext()) {
            int intValue = H.next().intValue();
            if (gVar.G(intValue)) {
                r a10 = mVar.a(s6Var, Arrays.asList(new r[]{gVar.z(intValue), new j(Double.valueOf((double) intValue)), gVar}));
                if (a10.c().equals(bool)) {
                    return gVar2;
                }
                if (bool2 == null || a10.c().equals(bool2)) {
                    gVar2.F(intValue, a10);
                }
            }
        }
        return gVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.measurement.r c(com.google.android.gms.internal.measurement.g r9, com.google.android.gms.internal.measurement.s6 r10, java.util.List<com.google.android.gms.internal.measurement.r> r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            com.google.android.gms.internal.measurement.r5.k(r0, r1, r11)
            r2 = 2
            com.google.android.gms.internal.measurement.r5.n(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            com.google.android.gms.internal.measurement.r r3 = (com.google.android.gms.internal.measurement.r) r3
            com.google.android.gms.internal.measurement.r r3 = r10.b(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.m
            if (r4 == 0) goto L_0x00a0
            int r4 = r11.size()
            if (r4 != r2) goto L_0x0036
            java.lang.Object r11 = r11.get(r1)
            com.google.android.gms.internal.measurement.r r11 = (com.google.android.gms.internal.measurement.r) r11
            com.google.android.gms.internal.measurement.r r11 = r10.b(r11)
            boolean r4 = r11 instanceof com.google.android.gms.internal.measurement.k
            if (r4 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            r11 = 0
            int r4 = r9.C()
            if (r4 == 0) goto L_0x0098
        L_0x003d:
            com.google.android.gms.internal.measurement.m r3 = (com.google.android.gms.internal.measurement.m) r3
            int r4 = r9.C()
            if (r12 == 0) goto L_0x0047
            r5 = 0
            goto L_0x0049
        L_0x0047:
            int r5 = r4 + -1
        L_0x0049:
            if (r12 == 0) goto L_0x004d
            int r4 = r4 - r1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r12 == 0) goto L_0x0052
            r12 = 1
            goto L_0x0053
        L_0x0052:
            r12 = -1
        L_0x0053:
            if (r11 != 0) goto L_0x005a
            com.google.android.gms.internal.measurement.r r11 = r9.z(r5)
            goto L_0x0095
        L_0x005a:
            int r6 = r4 - r5
            int r6 = r6 * r12
            if (r6 < 0) goto L_0x0097
            boolean r6 = r9.G(r5)
            if (r6 == 0) goto L_0x0095
            r6 = 4
            com.google.android.gms.internal.measurement.r[] r6 = new com.google.android.gms.internal.measurement.r[r6]
            r6[r0] = r11
            com.google.android.gms.internal.measurement.r r11 = r9.z(r5)
            r6[r1] = r11
            com.google.android.gms.internal.measurement.j r11 = new com.google.android.gms.internal.measurement.j
            double r7 = (double) r5
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r6[r2] = r11
            r11 = 3
            r6[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r6)
            com.google.android.gms.internal.measurement.r r11 = r3.a(r10, r11)
            boolean r6 = r11 instanceof com.google.android.gms.internal.measurement.k
            if (r6 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0095:
            int r5 = r5 + r12
            goto L_0x005a
        L_0x0097:
            return r11
        L_0x0098:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x00a0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g0.c(com.google.android.gms.internal.measurement.g, com.google.android.gms.internal.measurement.s6, java.util.List, boolean):com.google.android.gms.internal.measurement.r");
    }

    public static r d(String str, g gVar, s6 s6Var, List<r> list) {
        String str2;
        m mVar;
        s6 s6Var2;
        String str3 = str;
        g gVar2 = gVar;
        s6 s6Var3 = s6Var;
        List<r> list2 = list;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1776922004:
                if (str3.equals("toString")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1354795244:
                if (str3.equals("concat")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1274492040:
                if (str3.equals("filter")) {
                    c10 = 2;
                    break;
                }
                break;
            case -934873754:
                if (str3.equals("reduce")) {
                    c10 = 3;
                    break;
                }
                break;
            case -895859076:
                if (str3.equals("splice")) {
                    c10 = 4;
                    break;
                }
                break;
            case -678635926:
                if (str3.equals("forEach")) {
                    c10 = 5;
                    break;
                }
                break;
            case -467511597:
                if (str3.equals("lastIndexOf")) {
                    c10 = 6;
                    break;
                }
                break;
            case -277637751:
                if (str3.equals("unshift")) {
                    c10 = 7;
                    break;
                }
                break;
            case 107868:
                if (str3.equals("map")) {
                    c10 = 8;
                    break;
                }
                break;
            case 111185:
                if (str3.equals("pop")) {
                    c10 = 9;
                    break;
                }
                break;
            case 3267882:
                if (str3.equals("join")) {
                    c10 = 10;
                    break;
                }
                break;
            case 3452698:
                if (str3.equals("push")) {
                    c10 = 11;
                    break;
                }
                break;
            case 3536116:
                if (str3.equals("some")) {
                    c10 = 12;
                    break;
                }
                break;
            case 3536286:
                if (str3.equals("sort")) {
                    c10 = 13;
                    break;
                }
                break;
            case 96891675:
                if (str3.equals("every")) {
                    c10 = 14;
                    break;
                }
                break;
            case 109407362:
                if (str3.equals("shift")) {
                    c10 = 15;
                    break;
                }
                break;
            case 109526418:
                if (str3.equals("slice")) {
                    c10 = 16;
                    break;
                }
                break;
            case 965561430:
                if (str3.equals("reduceRight")) {
                    c10 = 17;
                    break;
                }
                break;
            case 1099846370:
                if (str3.equals("reverse")) {
                    c10 = 18;
                    break;
                }
                break;
            case 1943291465:
                if (str3.equals("indexOf")) {
                    c10 = 19;
                    break;
                }
                break;
        }
        String str4 = "filter";
        double d10 = 0.0d;
        switch (c10) {
            case 0:
                g gVar3 = gVar;
                r5.g("toString", 0, list);
                return new t(gVar.toString());
            case 1:
                g gVar4 = gVar;
                s6 s6Var4 = s6Var;
                List<r> list3 = list;
                g gVar5 = (g) gVar.b();
                if (!list.isEmpty()) {
                    for (r b10 : list) {
                        r b11 = s6Var4.b(b10);
                        if (!(b11 instanceof k)) {
                            int C = gVar5.C();
                            if (b11 instanceof g) {
                                g gVar6 = (g) b11;
                                Iterator<Integer> H = gVar6.H();
                                while (H.hasNext()) {
                                    Integer next = H.next();
                                    gVar5.F(next.intValue() + C, gVar6.z(next.intValue()));
                                }
                            } else {
                                gVar5.F(C, b11);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return gVar5;
            case 2:
                g gVar7 = gVar;
                s6 s6Var5 = s6Var;
                List<r> list4 = list;
                r5.g(str4, 1, list4);
                r b12 = s6Var5.b(list4.get(0));
                if (!(b12 instanceof s)) {
                    throw new IllegalArgumentException("Callback should be a method");
                } else if (gVar.y() == 0) {
                    return new g();
                } else {
                    g gVar8 = (g) gVar.b();
                    g b13 = b(gVar7, s6Var5, (s) b12, (Boolean) null, Boolean.TRUE);
                    g gVar9 = new g();
                    Iterator<Integer> H2 = b13.H();
                    while (H2.hasNext()) {
                        gVar9.B(gVar8.z(H2.next().intValue()));
                    }
                    return gVar9;
                }
            case 3:
                return c(gVar, s6Var, list, true);
            case 4:
                g gVar10 = gVar;
                s6 s6Var6 = s6Var;
                List<r> list5 = list;
                if (list.isEmpty()) {
                    return new g();
                }
                int a10 = (int) r5.a(s6Var6.b(list5.get(0)).d().doubleValue());
                if (a10 < 0) {
                    a10 = Math.max(0, a10 + gVar.C());
                } else if (a10 > gVar.C()) {
                    a10 = gVar.C();
                }
                int C2 = gVar.C();
                g gVar11 = new g();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) r5.a(s6Var6.b(list5.get(1)).d().doubleValue()));
                    if (max > 0) {
                        for (int i10 = a10; i10 < Math.min(C2, a10 + max); i10++) {
                            gVar11.B(gVar10.z(a10));
                            gVar10.E(a10);
                        }
                    }
                    if (list.size() > 2) {
                        int i11 = 2;
                        while (i11 < list.size()) {
                            r b14 = s6Var6.b(list5.get(i11));
                            if (!(b14 instanceof k)) {
                                gVar10.A((a10 + i11) - 2, b14);
                                i11++;
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                    return gVar11;
                }
                while (a10 < C2) {
                    gVar11.B(gVar10.z(a10));
                    gVar10.F(a10, (r) null);
                    a10++;
                }
                return gVar11;
            case 5:
                g gVar12 = gVar;
                s6 s6Var7 = s6Var;
                List<r> list6 = list;
                r5.g("forEach", 1, list6);
                r b15 = s6Var7.b(list6.get(0));
                if (!(b15 instanceof s)) {
                    throw new IllegalArgumentException("Callback should be a method");
                } else if (gVar.y() == 0) {
                    return r.f5547d;
                } else {
                    a(gVar12, s6Var7, (s) b15);
                    return r.f5547d;
                }
            case 6:
                g gVar13 = gVar;
                s6 s6Var8 = s6Var;
                List<r> list7 = list;
                r5.n("lastIndexOf", 2, list7);
                r rVar = r.f5547d;
                if (!list.isEmpty()) {
                    rVar = s6Var8.b(list7.get(0));
                }
                double C3 = (double) (gVar.C() - 1);
                if (list.size() > 1) {
                    r b16 = s6Var8.b(list7.get(1));
                    C3 = Double.isNaN(b16.d().doubleValue()) ? (double) (gVar.C() - 1) : r5.a(b16.d().doubleValue());
                    if (C3 < 0.0d) {
                        C3 += (double) gVar.C();
                    }
                }
                if (C3 < 0.0d) {
                    return new j(Double.valueOf(-1.0d));
                }
                for (int min = (int) Math.min((double) gVar.C(), C3); min >= 0; min--) {
                    if (gVar13.G(min) && r5.h(gVar13.z(min), rVar)) {
                        return new j(Double.valueOf((double) min));
                    }
                }
                return new j(Double.valueOf(-1.0d));
            case 7:
                g gVar14 = gVar;
                s6 s6Var9 = s6Var;
                List<r> list8 = list;
                if (!list.isEmpty()) {
                    g gVar15 = new g();
                    for (r b17 : list) {
                        r b18 = s6Var9.b(b17);
                        if (!(b18 instanceof k)) {
                            gVar15.B(b18);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int C4 = gVar15.C();
                    Iterator<Integer> H3 = gVar.H();
                    while (H3.hasNext()) {
                        Integer next2 = H3.next();
                        gVar15.F(next2.intValue() + C4, gVar14.z(next2.intValue()));
                    }
                    gVar.J();
                    Iterator<Integer> H4 = gVar15.H();
                    while (H4.hasNext()) {
                        Integer next3 = H4.next();
                        gVar14.F(next3.intValue(), gVar15.z(next3.intValue()));
                    }
                }
                return new j(Double.valueOf((double) gVar.C()));
            case 8:
                g gVar16 = gVar;
                s6 s6Var10 = s6Var;
                List<r> list9 = list;
                r5.g("map", 1, list9);
                r b19 = s6Var10.b(list9.get(0));
                if (b19 instanceof s) {
                    return gVar.C() == 0 ? new g() : a(gVar16, s6Var10, (s) b19);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 9:
                g gVar17 = gVar;
                r5.g("pop", 0, list);
                int C5 = gVar.C();
                if (C5 == 0) {
                    return r.f5547d;
                }
                int i12 = C5 - 1;
                r z9 = gVar17.z(i12);
                gVar17.E(i12);
                return z9;
            case 10:
                g gVar18 = gVar;
                s6 s6Var11 = s6Var;
                List<r> list10 = list;
                r5.n("join", 1, list10);
                if (gVar.C() == 0) {
                    return r.f5554k;
                }
                if (!list.isEmpty()) {
                    r b20 = s6Var11.b(list10.get(0));
                    str2 = ((b20 instanceof p) || (b20 instanceof y)) ? "" : b20.f();
                } else {
                    str2 = ",";
                }
                return new t(gVar18.D(str2));
            case 11:
                g gVar19 = gVar;
                s6 s6Var12 = s6Var;
                List<r> list11 = list;
                if (!list.isEmpty()) {
                    for (r b21 : list) {
                        gVar19.B(s6Var12.b(b21));
                    }
                }
                return new j(Double.valueOf((double) gVar.C()));
            case 12:
                g gVar20 = gVar;
                s6 s6Var13 = s6Var;
                List<r> list12 = list;
                r5.g("some", 1, list12);
                r b22 = s6Var13.b(list12.get(0));
                if (b22 instanceof m) {
                    if (gVar.C() != 0) {
                        m mVar2 = (m) b22;
                        Iterator<Integer> H5 = gVar.H();
                        while (H5.hasNext()) {
                            int intValue = H5.next().intValue();
                            if (gVar20.G(intValue)) {
                                if (mVar2.a(s6Var13, Arrays.asList(new r[]{gVar20.z(intValue), new j(Double.valueOf((double) intValue)), gVar20})).c().booleanValue()) {
                                    return r.f5552i;
                                }
                            }
                        }
                    }
                    return r.f5553j;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 13:
                g gVar21 = gVar;
                s6 s6Var14 = s6Var;
                List<r> list13 = list;
                r5.n("sort", 1, list13);
                if (gVar.C() >= 2) {
                    List<r> I = gVar.I();
                    if (!list.isEmpty()) {
                        r b23 = s6Var14.b(list13.get(0));
                        if (b23 instanceof m) {
                            mVar = (m) b23;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    } else {
                        mVar = null;
                    }
                    Collections.sort(I, new j0(mVar, s6Var14));
                    gVar.J();
                    int i13 = 0;
                    for (r F : I) {
                        gVar21.F(i13, F);
                        i13++;
                    }
                }
                return gVar21;
            case 14:
                g gVar22 = gVar;
                s6 s6Var15 = s6Var;
                List<r> list14 = list;
                r5.g("every", 1, list14);
                r b24 = s6Var15.b(list14.get(0));
                if (b24 instanceof s) {
                    return (gVar.C() == 0 || b(gVar22, s6Var15, (s) b24, Boolean.FALSE, Boolean.TRUE).C() == gVar.C()) ? r.f5552i : r.f5553j;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                g gVar23 = gVar;
                r5.g("shift", 0, list);
                if (gVar.C() == 0) {
                    return r.f5547d;
                }
                r z10 = gVar23.z(0);
                gVar23.E(0);
                return z10;
            case 16:
                g gVar24 = gVar;
                s6 s6Var16 = s6Var;
                List<r> list15 = list;
                r5.n("slice", 2, list15);
                if (list.isEmpty()) {
                    return gVar.b();
                }
                double C6 = (double) gVar.C();
                double a11 = r5.a(s6Var16.b(list15.get(0)).d().doubleValue());
                double max2 = a11 < 0.0d ? Math.max(a11 + C6, 0.0d) : Math.min(a11, C6);
                if (list.size() == 2) {
                    double a12 = r5.a(s6Var16.b(list15.get(1)).d().doubleValue());
                    C6 = a12 < 0.0d ? Math.max(C6 + a12, 0.0d) : Math.min(C6, a12);
                }
                g gVar25 = new g();
                for (int i14 = (int) max2; ((double) i14) < C6; i14++) {
                    gVar25.B(gVar24.z(i14));
                }
                return gVar25;
            case 17:
                return c(gVar, s6Var, list, false);
            case 18:
                g gVar26 = gVar;
                r5.g("reverse", 0, list);
                int C7 = gVar.C();
                if (C7 != 0) {
                    for (int i15 = 0; i15 < C7 / 2; i15++) {
                        if (gVar26.G(i15)) {
                            r z11 = gVar26.z(i15);
                            gVar26.F(i15, (r) null);
                            int i16 = (C7 - 1) - i15;
                            if (gVar26.G(i16)) {
                                gVar26.F(i15, gVar26.z(i16));
                            }
                            gVar26.F(i16, z11);
                        }
                    }
                }
                return gVar26;
            case 19:
                List<r> list16 = list;
                r5.n("indexOf", 2, list16);
                r rVar2 = r.f5547d;
                if (!list.isEmpty()) {
                    s6Var2 = s6Var;
                    rVar2 = s6Var2.b(list16.get(0));
                } else {
                    s6Var2 = s6Var;
                }
                if (list.size() > 1) {
                    double a13 = r5.a(s6Var2.b(list16.get(1)).d().doubleValue());
                    if (a13 >= ((double) gVar.C())) {
                        return new j(Double.valueOf(-1.0d));
                    }
                    d10 = a13 < 0.0d ? ((double) gVar.C()) + a13 : a13;
                }
                Iterator<Integer> H6 = gVar.H();
                while (H6.hasNext()) {
                    int intValue2 = H6.next().intValue();
                    double d11 = (double) intValue2;
                    g gVar27 = gVar;
                    if (d11 >= d10 && r5.h(gVar27.z(intValue2), rVar2)) {
                        return new j(Double.valueOf(d11));
                    }
                }
                return new j(Double.valueOf(-1.0d));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
