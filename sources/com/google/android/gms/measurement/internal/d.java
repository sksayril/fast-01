package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.o3;
import com.google.android.gms.internal.measurement.q3;
import h2.p;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

abstract class d {

    /* renamed from: a  reason: collision with root package name */
    String f5937a;

    /* renamed from: b  reason: collision with root package name */
    int f5938b;

    /* renamed from: c  reason: collision with root package name */
    Boolean f5939c;

    /* renamed from: d  reason: collision with root package name */
    Boolean f5940d;

    /* renamed from: e  reason: collision with root package name */
    Long f5941e;

    /* renamed from: f  reason: collision with root package name */
    Long f5942f;

    d(String str, int i10) {
        this.f5937a = str;
        this.f5938b = i10;
    }

    static Boolean b(double d10, o3 o3Var) {
        try {
            return h(new BigDecimal(d10), o3Var, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j10, o3 o3Var) {
        try {
            return h(new BigDecimal(j10), o3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z9) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z9);
    }

    static Boolean e(String str, o3 o3Var) {
        if (!jc.e0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), o3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, q3.a aVar, boolean z9, String str2, List<String> list, String str3, x4 x4Var) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (aVar == q3.a.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z9 && aVar != q3.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (ad.f5875a[aVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z9 ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (x4Var != null) {
                        x4Var.K().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                if (list != null) {
                    startsWith = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    static Boolean g(String str, q3 q3Var, x4 x4Var) {
        List<String> list;
        p.j(q3Var);
        if (str == null || !q3Var.R() || q3Var.J() == q3.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        q3.a J = q3Var.J();
        q3.a aVar = q3.a.IN_LIST;
        if (J == aVar) {
            if (q3Var.q() == 0) {
                return null;
            }
        } else if (!q3Var.Q()) {
            return null;
        }
        q3.a J2 = q3Var.J();
        boolean O = q3Var.O();
        String M = (O || J2 == q3.a.REGEXP || J2 == aVar) ? q3Var.M() : q3Var.M().toUpperCase(Locale.ENGLISH);
        if (q3Var.q() == 0) {
            list = null;
        } else {
            List<String> N = q3Var.N();
            if (!O) {
                ArrayList arrayList = new ArrayList(N.size());
                for (String upperCase : N) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                N = Collections.unmodifiableList(arrayList);
            }
            list = N;
        }
        return f(str, J2, O, M, list, J2 == q3.a.REGEXP ? M : null, x4Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r3 != null) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean h(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.o3 r9, double r10) {
        /*
            h2.p.j(r9)
            boolean r0 = r9.Q()
            r1 = 0
            if (r0 == 0) goto L_0x0114
            com.google.android.gms.internal.measurement.o3$b r0 = r9.J()
            com.google.android.gms.internal.measurement.o3$b r2 = com.google.android.gms.internal.measurement.o3.b.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x0114
        L_0x0014:
            com.google.android.gms.internal.measurement.o3$b r0 = r9.J()
            com.google.android.gms.internal.measurement.o3$b r2 = com.google.android.gms.internal.measurement.o3.b.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r9.U()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r9.T()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r9.R()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            com.google.android.gms.internal.measurement.o3$b r0 = r9.J()
            com.google.android.gms.internal.measurement.o3$b r3 = r9.J()
            if (r3 != r2) goto L_0x0065
            java.lang.String r3 = r9.O()
            boolean r3 = com.google.android.gms.measurement.internal.jc.e0(r3)
            if (r3 == 0) goto L_0x0064
            java.lang.String r3 = r9.N()
            boolean r3 = com.google.android.gms.measurement.internal.jc.e0(r3)
            if (r3 != 0) goto L_0x004f
            goto L_0x0064
        L_0x004f:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.String r4 = r9.O()     // Catch:{ NumberFormatException -> 0x0064 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0064 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0064 }
            java.lang.String r9 = r9.N()     // Catch:{ NumberFormatException -> 0x0064 }
            r4.<init>(r9)     // Catch:{ NumberFormatException -> 0x0064 }
            r9 = r3
            r3 = r1
            goto L_0x007b
        L_0x0064:
            return r1
        L_0x0065:
            java.lang.String r3 = r9.M()
            boolean r3 = com.google.android.gms.measurement.internal.jc.e0(r3)
            if (r3 != 0) goto L_0x0070
            return r1
        L_0x0070:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0114 }
            java.lang.String r9 = r9.M()     // Catch:{ NumberFormatException -> 0x0114 }
            r3.<init>(r9)     // Catch:{ NumberFormatException -> 0x0114 }
            r9 = r1
            r4 = r9
        L_0x007b:
            if (r0 != r2) goto L_0x0080
            if (r9 != 0) goto L_0x0082
            return r1
        L_0x0080:
            if (r3 == 0) goto L_0x0114
        L_0x0082:
            int[] r2 = com.google.android.gms.measurement.internal.ad.f5876b
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 0
            r5 = 1
            if (r0 == r5) goto L_0x0106
            r6 = 2
            if (r0 == r6) goto L_0x00f8
            r7 = 3
            if (r0 == r7) goto L_0x00ae
            r10 = 4
            if (r0 == r10) goto L_0x0099
            goto L_0x0114
        L_0x0099:
            if (r9 != 0) goto L_0x009c
            return r1
        L_0x009c:
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto L_0x00a9
            int r8 = r8.compareTo(r4)
            if (r8 > 0) goto L_0x00a9
            r2 = 1
        L_0x00a9:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00ae:
            if (r3 == 0) goto L_0x0114
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00ec
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r3.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto L_0x00e7
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r3.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x00e7
            r2 = 1
        L_0x00e7:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00ec:
            int r8 = r8.compareTo(r3)
            if (r8 != 0) goto L_0x00f3
            r2 = 1
        L_0x00f3:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00f8:
            if (r3 == 0) goto L_0x0114
            int r8 = r8.compareTo(r3)
            if (r8 <= 0) goto L_0x0101
            r2 = 1
        L_0x0101:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0106:
            if (r3 == 0) goto L_0x0114
            int r8 = r8.compareTo(r3)
            if (r8 >= 0) goto L_0x010f
            r2 = 1
        L_0x010f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0114:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.h(java.math.BigDecimal, com.google.android.gms.internal.measurement.o3, double):java.lang.Boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    /* access modifiers changed from: package-private */
    public abstract boolean j();
}
