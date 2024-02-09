package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.df;
import com.google.android.gms.internal.measurement.ga;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.kd;
import com.google.android.gms.internal.measurement.l4;
import com.google.android.gms.internal.measurement.m3;
import com.google.android.gms.internal.measurement.m4;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.o3;
import com.google.android.gms.internal.measurement.p3;
import com.google.android.gms.internal.measurement.p4;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.pf;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.r4;
import com.google.android.gms.internal.measurement.s4;
import com.google.android.gms.internal.measurement.u4;
import com.google.android.gms.internal.measurement.v4;
import com.google.android.gms.internal.measurement.w4;
import com.google.android.gms.measurement.internal.p7;
import h2.p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import l2.d;

public final class jc extends yb {
    jc(zb zbVar) {
        super(zbVar);
    }

    private final Bundle A(Map<String, Object> map, boolean z9) {
        String obj;
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            Object obj2 = map.get(next);
            if (obj2 == null) {
                obj = null;
            } else if (obj2 instanceof Long) {
                bundle.putLong(next, ((Long) obj2).longValue());
            } else if (obj2 instanceof Double) {
                bundle.putDouble(next, ((Double) obj2).doubleValue());
            } else if (!(obj2 instanceof ArrayList)) {
                obj = obj2.toString();
            } else if (z9) {
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(A((Map) obj3, false));
                }
                bundle.putParcelableArray(next, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(next, obj);
        }
        return bundle;
    }

    static p4 D(n4 n4Var, String str) {
        for (p4 next : n4Var.f0()) {
            if (next.f0().equals(str)) {
                return next;
            }
        }
        return null;
    }

    static <BuilderT extends ga> BuilderT E(BuilderT buildert, byte[] bArr) {
        c8 a10 = c8.a();
        return a10 != null ? buildert.o(bArr, a10) : buildert.m(bArr);
    }

    private static String K(boolean z9, boolean z10, boolean z11) {
        StringBuilder sb = new StringBuilder();
        if (z9) {
            sb.append("Dynamic ");
        }
        if (z10) {
            sb.append("Sequence ");
        }
        if (z11) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List<Long> L(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 << 6) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    private static void O(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    private static void P(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String split : strArr) {
            String[] split2 = split.split(",");
            String str = split2[0];
            String str2 = split2[split2.length - 1];
            String string = bundle.getString(str);
            if (string != null) {
                O(builder, str2, string, set);
            }
        }
    }

    static void Q(n4.a aVar, String str, Object obj) {
        List<p4> M = aVar.M();
        int i10 = 0;
        while (true) {
            if (i10 >= M.size()) {
                i10 = -1;
                break;
            } else if (str.equals(M.get(i10).f0())) {
                break;
            } else {
                i10++;
            }
        }
        p4.a C = p4.c0().C(str);
        if (obj instanceof Long) {
            C.z(((Long) obj).longValue());
        } else if (obj instanceof String) {
            C.E((String) obj);
        } else if (obj instanceof Double) {
            C.y(((Double) obj).doubleValue());
        }
        if (i10 >= 0) {
            aVar.z(i10, C);
        } else {
            aVar.C(C);
        }
    }

    private static void U(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
    }

    private final void V(StringBuilder sb, int i10, n3 n3Var) {
        if (n3Var != null) {
            U(sb, i10);
            sb.append("filter {\n");
            if (n3Var.R()) {
                Y(sb, i10, "complement", Boolean.valueOf(n3Var.Q()));
            }
            if (n3Var.T()) {
                Y(sb, i10, "param_name", f().f(n3Var.P()));
            }
            if (n3Var.U()) {
                int i11 = i10 + 1;
                q3 O = n3Var.O();
                if (O != null) {
                    U(sb, i11);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if (O.R()) {
                        Y(sb, i11, "match_type", O.J().name());
                    }
                    if (O.Q()) {
                        Y(sb, i11, "expression", O.M());
                    }
                    if (O.P()) {
                        Y(sb, i11, "case_sensitive", Boolean.valueOf(O.O()));
                    }
                    if (O.q() > 0) {
                        U(sb, i11 + 1);
                        sb.append("expression_list {\n");
                        for (String append : O.N()) {
                            U(sb, i11 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    U(sb, i11);
                    sb.append("}\n");
                }
            }
            if (n3Var.S()) {
                W(sb, i10 + 1, "number_filter", n3Var.N());
            }
            U(sb, i10);
            sb.append("}\n");
        }
    }

    private static void W(StringBuilder sb, int i10, String str, o3 o3Var) {
        if (o3Var != null) {
            U(sb, i10);
            sb.append(str);
            sb.append(" {\n");
            if (o3Var.Q()) {
                Y(sb, i10, "comparison_type", o3Var.J().name());
            }
            if (o3Var.S()) {
                Y(sb, i10, "match_as_float", Boolean.valueOf(o3Var.P()));
            }
            if (o3Var.R()) {
                Y(sb, i10, "comparison_value", o3Var.M());
            }
            if (o3Var.U()) {
                Y(sb, i10, "min_comparison_value", o3Var.O());
            }
            if (o3Var.T()) {
                Y(sb, i10, "max_comparison_value", o3Var.N());
            }
            U(sb, i10);
            sb.append("}\n");
        }
    }

    private static void X(StringBuilder sb, int i10, String str, u4 u4Var) {
        if (u4Var != null) {
            U(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (u4Var.M() != 0) {
                U(sb, 4);
                sb.append("results: ");
                int i11 = 0;
                for (Long next : u4Var.c0()) {
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i11 = i12;
                }
                sb.append(10);
            }
            if (u4Var.U() != 0) {
                U(sb, 4);
                sb.append("status: ");
                int i13 = 0;
                for (Long next2 : u4Var.e0()) {
                    int i14 = i13 + 1;
                    if (i13 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i13 = i14;
                }
                sb.append(10);
            }
            if (u4Var.q() != 0) {
                U(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i15 = 0;
                for (m4 next3 : u4Var.b0()) {
                    int i16 = i15 + 1;
                    if (i15 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next3.R() ? Integer.valueOf(next3.q()) : null);
                    sb.append(":");
                    sb.append(next3.Q() ? Long.valueOf(next3.N()) : null);
                    i15 = i16;
                }
                sb.append("}\n");
            }
            if (u4Var.Q() != 0) {
                U(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i17 = 0;
                for (v4 next4 : u4Var.d0()) {
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next4.S() ? Integer.valueOf(next4.N()) : null);
                    sb.append(": [");
                    int i19 = 0;
                    for (Long longValue : next4.R()) {
                        long longValue2 = longValue.longValue();
                        int i20 = i19 + 1;
                        if (i19 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i19 = i20;
                    }
                    sb.append("]");
                    i17 = i18;
                }
                sb.append("}\n");
            }
            U(sb, 3);
            sb.append("}\n");
        }
    }

    private static void Y(StringBuilder sb, int i10, String str, Object obj) {
        if (obj != null) {
            U(sb, i10 + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    private final void Z(StringBuilder sb, int i10, List<p4> list) {
        if (list != null) {
            int i11 = i10 + 1;
            for (p4 next : list) {
                if (next != null) {
                    U(sb, i11);
                    sb.append("param {\n");
                    Double d10 = null;
                    Y(sb, i11, "name", next.l0() ? f().f(next.f0()) : null);
                    Y(sb, i11, "string_value", next.m0() ? next.g0() : null);
                    Y(sb, i11, "int_value", next.k0() ? Long.valueOf(next.a0()) : null);
                    if (next.i0()) {
                        d10 = Double.valueOf(next.J());
                    }
                    Y(sb, i11, "double_value", d10);
                    if (next.Y() > 0) {
                        Z(sb, i11, next.h0());
                    }
                    U(sb, i11);
                    sb.append("}\n");
                }
            }
        }
    }

    static boolean b0(i0 i0Var, sc scVar) {
        p.j(i0Var);
        p.j(scVar);
        return !TextUtils.isEmpty(scVar.f6560n) || !TextUtils.isEmpty(scVar.C);
    }

    static boolean c0(List<Long> list, int i10) {
        if (i10 >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i10 % 64)) & list.get(i10 / 64).longValue()) != 0;
    }

    static Object d0(n4 n4Var, String str) {
        p4 D = D(n4Var, str);
        if (D == null) {
            return null;
        }
        if (D.m0()) {
            return D.g0();
        }
        if (D.k0()) {
            return Long.valueOf(D.a0());
        }
        if (D.i0()) {
            return Double.valueOf(D.J());
        }
        if (D.Y() <= 0) {
            return null;
        }
        List<p4> h02 = D.h0();
        ArrayList arrayList = new ArrayList();
        for (p4 next : h02) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (p4 next2 : next.h0()) {
                    if (next2.m0()) {
                        bundle.putString(next2.f0(), next2.g0());
                    } else if (next2.k0()) {
                        bundle.putLong(next2.f0(), next2.a0());
                    } else if (next2.i0()) {
                        bundle.putDouble(next2.f0(), next2.J());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static boolean e0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static int x(s4.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i10 = 0; i10 < aVar.L(); i10++) {
            if (str.equals(aVar.B0(i10).c0())) {
                return i10;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        k().F().a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T B(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.x4 r5 = r4.k()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.z4 r5 = r5.F()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.jc.B(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    public final n4 C(a0 a0Var) {
        n4.a B = n4.c0().B(a0Var.f5843e);
        Iterator<String> it = a0Var.f5844f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            p4.a C = p4.c0().C(next);
            Object l10 = a0Var.f5844f.l(next);
            p.j(l10);
            R(C, l10);
            B.C(C);
        }
        return (n4) ((p8) B.l());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.i0 F(com.google.android.gms.internal.measurement.e r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.g()
            r1 = 1
            android.os.Bundle r0 = r8.A(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "app"
        L_0x001e:
            r5 = r1
            java.lang.String r1 = r9.e()
            java.lang.String r1 = com.google.android.gms.measurement.internal.q7.b(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r9.e()
        L_0x002d:
            r3 = r1
            com.google.android.gms.measurement.internal.i0 r1 = new com.google.android.gms.measurement.internal.i0
            com.google.android.gms.measurement.internal.d0 r4 = new com.google.android.gms.measurement.internal.d0
            r4.<init>(r0)
            long r6 = r9.a()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.jc.F(com.google.android.gms.internal.measurement.e):com.google.android.gms.measurement.internal.i0");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0294  */
    @android.annotation.TargetApi(30)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.rb G(java.lang.String r12, com.google.android.gms.internal.measurement.s4 r13, com.google.android.gms.internal.measurement.n4.a r14, java.lang.String r15) {
        /*
            r11 = this;
            boolean r0 = com.google.android.gms.internal.measurement.df.a()
            if (r0 == 0) goto L_0x02ac
            com.google.android.gms.measurement.internal.g r0 = r11.d()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.k0.L0
            boolean r0 = r0.A(r12, r1)
            if (r0 != 0) goto L_0x0014
            goto L_0x02ac
        L_0x0014:
            l2.d r0 = r11.a()
            long r0 = r0.a()
            com.google.android.gms.measurement.internal.g r2 = r11.d()
            com.google.android.gms.measurement.internal.o4<java.lang.String> r3 = com.google.android.gms.measurement.internal.k0.f6184e0
            java.lang.String r2 = r2.y(r12, r3)
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            java.util.HashSet r3 = new java.util.HashSet
            int r4 = r2.length
            r3.<init>(r4)
            int r4 = r2.length
            r5 = 0
            r6 = 0
        L_0x0035:
            if (r6 >= r4) goto L_0x0059
            r7 = r2[r6]
            r7.getClass()
            boolean r8 = r3.add(r7)
            if (r8 == 0) goto L_0x0045
            int r6 = r6 + 1
            goto L_0x0035
        L_0x0045:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "duplicate element: "
            r13.<init>(r14)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0059:
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r3)
            com.google.android.gms.measurement.internal.xb r3 = r11.s()
            com.google.android.gms.measurement.internal.w5 r4 = r3.q()
            java.lang.String r4 = r4.P(r12)
            android.net.Uri$Builder r6 = new android.net.Uri$Builder
            r6.<init>()
            com.google.android.gms.measurement.internal.g r7 = r3.d()
            com.google.android.gms.measurement.internal.o4<java.lang.String> r8 = com.google.android.gms.measurement.internal.k0.Y
            java.lang.String r7 = r7.y(r12, r8)
            r6.scheme(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r8 = "."
            if (r7 != 0) goto L_0x00a0
            com.google.android.gms.measurement.internal.g r7 = r3.d()
            com.google.android.gms.measurement.internal.o4<java.lang.String> r9 = com.google.android.gms.measurement.internal.k0.Z
            java.lang.String r7 = r7.y(r12, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r8)
            r9.append(r7)
            java.lang.String r4 = r9.toString()
            goto L_0x00aa
        L_0x00a0:
            com.google.android.gms.measurement.internal.g r4 = r3.d()
            com.google.android.gms.measurement.internal.o4<java.lang.String> r7 = com.google.android.gms.measurement.internal.k0.Z
            java.lang.String r4 = r4.y(r12, r7)
        L_0x00aa:
            r6.authority(r4)
            com.google.android.gms.measurement.internal.g r3 = r3.d()
            com.google.android.gms.measurement.internal.o4<java.lang.String> r4 = com.google.android.gms.measurement.internal.k0.f6174a0
            java.lang.String r3 = r3.y(r12, r4)
            r6.path(r3)
            java.lang.String r3 = r13.n0()
            java.lang.String r4 = "gmp_app_id"
            O(r6, r4, r3, r2)
            java.lang.String r3 = "gmp_version"
            java.lang.String r4 = "82001"
            O(r6, r3, r4, r2)
            java.lang.String r3 = r13.H3()
            com.google.android.gms.measurement.internal.g r4 = r11.d()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.k0.O0
            boolean r4 = r4.A(r12, r7)
            java.lang.String r9 = ""
            if (r4 == 0) goto L_0x00e7
            com.google.android.gms.measurement.internal.w5 r4 = r11.q()
            boolean r4 = r4.Z(r12)
            if (r4 == 0) goto L_0x00e7
            r3 = r9
        L_0x00e7:
            java.lang.String r4 = "app_instance_id"
            O(r6, r4, r3, r2)
            java.lang.String r3 = r13.r0()
            java.lang.String r4 = "rdid"
            O(r6, r4, r3, r2)
            java.lang.String r3 = r13.G3()
            java.lang.String r4 = "bundle_id"
            O(r6, r4, r3, r2)
            java.lang.String r3 = r14.L()
            java.lang.String r4 = com.google.android.gms.measurement.internal.q7.a(r3)
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 != 0) goto L_0x010d
            r3 = r4
        L_0x010d:
            java.lang.String r4 = "app_event_name"
            O(r6, r4, r3, r2)
            int r3 = r13.G0()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "app_version"
            O(r6, r4, r3, r2)
            java.lang.String r3 = r13.p0()
            com.google.android.gms.measurement.internal.g r4 = r11.d()
            boolean r4 = r4.A(r12, r7)
            if (r4 == 0) goto L_0x0154
            com.google.android.gms.measurement.internal.w5 r4 = r11.q()
            boolean r4 = r4.d0(r12)
            if (r4 == 0) goto L_0x0154
            com.google.android.gms.measurement.internal.g r4 = r11.d()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.k0.B0
            boolean r4 = r4.A(r12, r7)
            if (r4 == 0) goto L_0x0155
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0154
            int r4 = r3.indexOf(r8)
            r7 = -1
            if (r4 == r7) goto L_0x0154
            java.lang.String r3 = r3.substring(r5, r4)
        L_0x0154:
            r9 = r3
        L_0x0155:
            java.lang.String r3 = "os_version"
            O(r6, r3, r9, r2)
            long r3 = r14.J()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "timestamp"
            O(r6, r4, r3, r2)
            boolean r3 = r13.z0()
            java.lang.String r4 = "1"
            if (r3 == 0) goto L_0x0174
            java.lang.String r3 = "lat"
            O(r6, r3, r4, r2)
        L_0x0174:
            int r3 = r13.q()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "privacy_sandbox_version"
            O(r6, r5, r3, r2)
            java.lang.String r3 = "trigger_uri_source"
            O(r6, r3, r4, r2)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "trigger_uri_timestamp"
            O(r6, r5, r3, r2)
            if (r15 == 0) goto L_0x0196
            java.lang.String r3 = "request_uuid"
            O(r6, r3, r15, r2)
        L_0x0196:
            java.util.List r14 = r14.M()
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x01a3:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x01ee
            java.lang.Object r3 = r14.next()
            com.google.android.gms.internal.measurement.p4 r3 = (com.google.android.gms.internal.measurement.p4) r3
            java.lang.String r5 = r3.f0()
            boolean r7 = r3.i0()
            if (r7 == 0) goto L_0x01c5
            double r7 = r3.J()
            java.lang.String r3 = java.lang.String.valueOf(r7)
        L_0x01c1:
            r15.putString(r5, r3)
            goto L_0x01a3
        L_0x01c5:
            boolean r7 = r3.j0()
            if (r7 == 0) goto L_0x01d4
            float r3 = r3.U()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x01c1
        L_0x01d4:
            boolean r7 = r3.m0()
            if (r7 == 0) goto L_0x01df
            java.lang.String r3 = r3.g0()
            goto L_0x01c1
        L_0x01df:
            boolean r7 = r3.k0()
            if (r7 == 0) goto L_0x01a3
            long r7 = r3.a0()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            goto L_0x01c1
        L_0x01ee:
            com.google.android.gms.measurement.internal.g r14 = r11.d()
            com.google.android.gms.measurement.internal.o4<java.lang.String> r3 = com.google.android.gms.measurement.internal.k0.f6182d0
            java.lang.String r14 = r14.y(r12, r3)
            java.lang.String r3 = "\\|"
            java.lang.String[] r14 = r14.split(r3)
            P(r6, r14, r15, r2)
            java.util.List r14 = r13.w0()
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x020e:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x0259
            java.lang.Object r5 = r14.next()
            com.google.android.gms.internal.measurement.w4 r5 = (com.google.android.gms.internal.measurement.w4) r5
            java.lang.String r7 = r5.c0()
            boolean r8 = r5.e0()
            if (r8 == 0) goto L_0x0230
            double r8 = r5.J()
            java.lang.String r5 = java.lang.String.valueOf(r8)
        L_0x022c:
            r15.putString(r7, r5)
            goto L_0x020e
        L_0x0230:
            boolean r8 = r5.f0()
            if (r8 == 0) goto L_0x023f
            float r5 = r5.R()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L_0x022c
        L_0x023f:
            boolean r8 = r5.i0()
            if (r8 == 0) goto L_0x024a
            java.lang.String r5 = r5.d0()
            goto L_0x022c
        L_0x024a:
            boolean r8 = r5.g0()
            if (r8 == 0) goto L_0x020e
            long r8 = r5.X()
            java.lang.String r5 = java.lang.String.valueOf(r8)
            goto L_0x022c
        L_0x0259:
            com.google.android.gms.measurement.internal.g r14 = r11.d()
            com.google.android.gms.measurement.internal.o4<java.lang.String> r5 = com.google.android.gms.measurement.internal.k0.f6180c0
            java.lang.String r12 = r14.y(r12, r5)
            java.lang.String[] r12 = r12.split(r3)
            P(r6, r12, r15, r2)
            boolean r12 = com.google.android.gms.internal.measurement.kd.a()
            if (r12 == 0) goto L_0x029d
            com.google.android.gms.measurement.internal.g r12 = r11.d()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.k0.T0
            boolean r12 = r12.r(r14)
            if (r12 == 0) goto L_0x029d
            boolean r12 = r13.y0()
            if (r12 == 0) goto L_0x0283
            goto L_0x0285
        L_0x0283:
            java.lang.String r4 = "0"
        L_0x0285:
            java.lang.String r12 = "dma"
            O(r6, r12, r4, r2)
            java.lang.String r12 = r13.j0()
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x029d
            java.lang.String r12 = r13.j0()
            java.lang.String r13 = "dma_cps"
            O(r6, r13, r12, r2)
        L_0x029d:
            com.google.android.gms.measurement.internal.rb r12 = new com.google.android.gms.measurement.internal.rb
            android.net.Uri r13 = r6.build()
            java.lang.String r13 = r13.toString()
            r14 = 1
            r12.<init>(r13, r0, r14)
            return r12
        L_0x02ac:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.jc.G(java.lang.String, com.google.android.gms.internal.measurement.s4, com.google.android.gms.internal.measurement.n4$a, java.lang.String):com.google.android.gms.measurement.internal.rb");
    }

    /* access modifiers changed from: package-private */
    public final String H(m3 m3Var) {
        if (m3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (m3Var.Y()) {
            Y(sb, 0, "filter_id", Integer.valueOf(m3Var.O()));
        }
        Y(sb, 0, "event_name", f().c(m3Var.S()));
        String K = K(m3Var.U(), m3Var.V(), m3Var.W());
        if (!K.isEmpty()) {
            Y(sb, 0, "filter_type", K);
        }
        if (m3Var.X()) {
            W(sb, 1, "event_count_filter", m3Var.R());
        }
        if (m3Var.q() > 0) {
            sb.append("  filters {\n");
            for (n3 V : m3Var.T()) {
                V(sb, 2, V);
            }
        }
        U(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String I(p3 p3Var) {
        if (p3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (p3Var.S()) {
            Y(sb, 0, "filter_id", Integer.valueOf(p3Var.q()));
        }
        Y(sb, 0, "property_name", f().g(p3Var.O()));
        String K = K(p3Var.P(), p3Var.Q(), p3Var.R());
        if (!K.isEmpty()) {
            Y(sb, 0, "filter_type", K);
        }
        V(sb, 1, p3Var.L());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String J(r4 r4Var) {
        k4 C3;
        if (r4Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (s4 next : r4Var.O()) {
            if (next != null) {
                U(sb, 1);
                sb.append("bundle {\n");
                if (next.c1()) {
                    Y(sb, 1, "protocol_version", Integer.valueOf(next.X1()));
                }
                if (pf.a() && d().A(next.G3(), k0.f6224y0) && next.f1()) {
                    Y(sb, 1, "session_stitching_token", next.s0());
                }
                Y(sb, 1, "platform", next.q0());
                if (next.X0()) {
                    Y(sb, 1, "gmp_version", Long.valueOf(next.g3()));
                }
                if (next.k1()) {
                    Y(sb, 1, "uploading_gmp_version", Long.valueOf(next.z3()));
                }
                if (next.V0()) {
                    Y(sb, 1, "dynamite_version", Long.valueOf(next.T2()));
                }
                if (next.E0()) {
                    Y(sb, 1, "config_version", Long.valueOf(next.F2()));
                }
                Y(sb, 1, "gmp_app_id", next.n0());
                Y(sb, 1, "admob_app_id", next.F3());
                Y(sb, 1, "app_id", next.G3());
                Y(sb, 1, "app_version", next.g0());
                if (next.B0()) {
                    Y(sb, 1, "app_version_major", Integer.valueOf(next.G0()));
                }
                Y(sb, 1, "firebase_instance_id", next.m0());
                if (next.U0()) {
                    Y(sb, 1, "dev_cert_hash", Long.valueOf(next.M2()));
                }
                Y(sb, 1, "app_store", next.I3());
                if (next.j1()) {
                    Y(sb, 1, "upload_timestamp_millis", Long.valueOf(next.w3()));
                }
                if (next.g1()) {
                    Y(sb, 1, "start_timestamp_millis", Long.valueOf(next.q3()));
                }
                if (next.W0()) {
                    Y(sb, 1, "end_timestamp_millis", Long.valueOf(next.a3()));
                }
                if (next.b1()) {
                    Y(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.n3()));
                }
                if (next.a1()) {
                    Y(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.k3()));
                }
                Y(sb, 1, "app_instance_id", next.H3());
                Y(sb, 1, "resettable_device_id", next.r0());
                Y(sb, 1, "ds_id", next.l0());
                if (next.Z0()) {
                    Y(sb, 1, "limited_ad_tracking", Boolean.valueOf(next.z0()));
                }
                Y(sb, 1, "os_version", next.p0());
                Y(sb, 1, "device_model", next.k0());
                Y(sb, 1, "user_default_language", next.t0());
                if (next.i1()) {
                    Y(sb, 1, "time_zone_offset_minutes", Integer.valueOf(next.p2()));
                }
                if (next.D0()) {
                    Y(sb, 1, "bundle_sequential_index", Integer.valueOf(next.l1()));
                }
                if (next.e1()) {
                    Y(sb, 1, "service_upload", Boolean.valueOf(next.A0()));
                }
                Y(sb, 1, "health_monitor", next.o0());
                if (next.d1()) {
                    Y(sb, 1, "retry_counter", Integer.valueOf(next.h2()));
                }
                if (next.S0()) {
                    Y(sb, 1, "consent_signals", next.i0());
                }
                if (next.Y0()) {
                    Y(sb, 1, "is_dma_region", Boolean.valueOf(next.y0()));
                }
                if (next.T0()) {
                    Y(sb, 1, "core_platform_services", next.j0());
                }
                if (next.F0()) {
                    Y(sb, 1, "consent_diagnostics", next.h0());
                }
                if (next.h1()) {
                    Y(sb, 1, "target_os_version", Long.valueOf(next.t3()));
                }
                if (df.a() && d().A(next.G3(), k0.L0)) {
                    Y(sb, 1, "ad_services_version", Integer.valueOf(next.q()));
                    if (next.C0() && (C3 = next.C3()) != null) {
                        U(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        Y(sb, 2, "eligible", Boolean.valueOf(C3.a0()));
                        Y(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(C3.e0()));
                        Y(sb, 2, "pre_r", Boolean.valueOf(C3.f0()));
                        Y(sb, 2, "r_extensions_too_old", Boolean.valueOf(C3.g0()));
                        Y(sb, 2, "adservices_extension_too_old", Boolean.valueOf(C3.X()));
                        Y(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(C3.U()));
                        Y(sb, 2, "measurement_manager_disabled", Boolean.valueOf(C3.d0()));
                        U(sb, 2);
                        sb.append("}\n");
                    }
                }
                List<w4> w02 = next.w0();
                if (w02 != null) {
                    for (w4 next2 : w02) {
                        if (next2 != null) {
                            U(sb, 2);
                            sb.append("user_property {\n");
                            Double d10 = null;
                            Y(sb, 2, "set_timestamp_millis", next2.h0() ? Long.valueOf(next2.Z()) : null);
                            Y(sb, 2, "name", f().g(next2.c0()));
                            Y(sb, 2, "string_value", next2.d0());
                            Y(sb, 2, "int_value", next2.g0() ? Long.valueOf(next2.X()) : null);
                            if (next2.e0()) {
                                d10 = Double.valueOf(next2.J());
                            }
                            Y(sb, 2, "double_value", d10);
                            U(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<l4> u02 = next.u0();
                next.G3();
                if (u02 != null) {
                    for (l4 next3 : u02) {
                        if (next3 != null) {
                            U(sb, 2);
                            sb.append("audience_membership {\n");
                            if (next3.W()) {
                                Y(sb, 2, "audience_id", Integer.valueOf(next3.q()));
                            }
                            if (next3.X()) {
                                Y(sb, 2, "new_audience", Boolean.valueOf(next3.V()));
                            }
                            X(sb, 2, "current_data", next3.T());
                            if (next3.Y()) {
                                X(sb, 2, "previous_data", next3.U());
                            }
                            U(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<n4> v02 = next.v0();
                if (v02 != null) {
                    for (n4 next4 : v02) {
                        if (next4 != null) {
                            U(sb, 2);
                            sb.append("event {\n");
                            Y(sb, 2, "name", f().c(next4.e0()));
                            if (next4.i0()) {
                                Y(sb, 2, "timestamp_millis", Long.valueOf(next4.b0()));
                            }
                            if (next4.h0()) {
                                Y(sb, 2, "previous_timestamp_millis", Long.valueOf(next4.a0()));
                            }
                            if (next4.g0()) {
                                Y(sb, 2, "count", Integer.valueOf(next4.q()));
                            }
                            if (next4.W() != 0) {
                                Z(sb, 2, next4.f0());
                            }
                            U(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                U(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final List<Long> M(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                k().K().b("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    k().K().c("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (next.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i10);
    }

    /* access modifiers changed from: package-private */
    public final Map<String, Object> N(Bundle bundle, boolean z9) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z10 = obj instanceof Parcelable[];
            if (z10 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z9) {
                    ArrayList arrayList = new ArrayList();
                    if (z10) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(N((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(N((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(N((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void R(p4.a aVar, Object obj) {
        p.j(obj);
        aVar.H().F().D().G();
        if (obj instanceof String) {
            aVar.E((String) obj);
        } else if (obj instanceof Long) {
            aVar.z(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.y(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    p4.a c02 = p4.c0();
                    for (String str : bundle.keySet()) {
                        p4.a C = p4.c0().C(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            C.z(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            C.E((String) obj2);
                        } else if (obj2 instanceof Double) {
                            C.y(((Double) obj2).doubleValue());
                        }
                        c02.A(C);
                    }
                    if (c02.x() > 0) {
                        arrayList.add((p4) ((p8) c02.l()));
                    }
                }
            }
            aVar.B(arrayList);
        } else {
            k().F().b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void S(s4.a aVar) {
        k().J().a("Checking account type status for ad personalization signals");
        if (g0(aVar.T0())) {
            k().E().a("Turning off ad personalization due to account type");
            w4 w4Var = (w4) ((p8) w4.a0().A("_npa").C(e().t()).z(1).l());
            boolean z9 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= aVar.L()) {
                    break;
                } else if ("_npa".equals(aVar.B0(i10).c0())) {
                    aVar.B(i10, w4Var);
                    z9 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (!z9) {
                aVar.H(w4Var);
            }
            if (kd.a() && d().r(k0.T0)) {
                l b10 = l.b(aVar.V0());
                b10.d(p7.a.AD_PERSONALIZATION, k.CHILD_ACCOUNT);
                aVar.l0(b10.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void T(w4.a aVar, Object obj) {
        p.j(obj);
        aVar.E().B().x();
        if (obj instanceof String) {
            aVar.D((String) obj);
        } else if (obj instanceof Long) {
            aVar.z(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.y(((Double) obj).doubleValue());
        } else {
            k().F().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final /* bridge */ /* synthetic */ d a() {
        return super.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean a0(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(a().a() - j10) > j11;
    }

    public final /* bridge */ /* synthetic */ f c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ g d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ c0 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ w4 f() {
        return super.f();
    }

    /* access modifiers changed from: package-private */
    public final byte[] f0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            k().F().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    public final /* bridge */ /* synthetic */ k5 g() {
        return super.g();
    }

    /* access modifiers changed from: package-private */
    public final boolean g0(String str) {
        p.j(str);
        h6 C0 = p().C0(str);
        return C0 != null && e().x() && C0.q() && q().U(str);
    }

    public final /* bridge */ /* synthetic */ oc h() {
        return super.h();
    }

    /* access modifiers changed from: package-private */
    public final byte[] h0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e10) {
            k().F().b("Failed to ungzip content", e10);
            throw e10;
        }
    }

    public final /* bridge */ /* synthetic */ f6 i() {
        return super.i();
    }

    /* access modifiers changed from: package-private */
    public final List<Integer> i0() {
        Map<String, String> c10 = k0.c(this.f6637b.zza());
        if (c10 == null || c10.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = k0.R.a(null).intValue();
        Iterator<Map.Entry<String, String>> it = c10.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((String) next.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            k().K().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e10) {
                    k().K().b("Experiment ID NumberFormatException", e10);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final /* bridge */ /* synthetic */ x4 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public final /* bridge */ /* synthetic */ jc n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ xc o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ p p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ w5 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ bb r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ xb s() {
        return super.s();
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long y(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return z(str.getBytes(Charset.forName("UTF-8")));
    }

    /* access modifiers changed from: package-private */
    public final long z(byte[] bArr) {
        p.j(bArr);
        h().m();
        MessageDigest S0 = oc.S0();
        if (S0 != null) {
            return oc.A(S0.digest(bArr));
        }
        k().F().a("Failed to get MD5");
        return 0;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
