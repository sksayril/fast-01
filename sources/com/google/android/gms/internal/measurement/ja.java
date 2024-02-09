package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class ja<T> implements va<T> {

    /* renamed from: a  reason: collision with root package name */
    private final da f5381a;

    /* renamed from: b  reason: collision with root package name */
    private final ub<?, ?> f5382b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5383c;

    /* renamed from: d  reason: collision with root package name */
    private final e8<?> f5384d;

    private ja(ub<?, ?> ubVar, e8<?> e8Var, da daVar) {
        this.f5382b = ubVar;
        this.f5383c = e8Var.e(daVar);
        this.f5384d = e8Var;
        this.f5381a = daVar;
    }

    static <T> ja<T> i(ub<?, ?> ubVar, e8<?> e8Var, da daVar) {
        return new ja<>(ubVar, e8Var, daVar);
    }

    public final int a(T t9) {
        ub<?, ?> ubVar = this.f5382b;
        int e10 = ubVar.e(ubVar.k(t9)) + 0;
        return this.f5383c ? e10 + this.f5384d.b(t9).a() : e10;
    }

    public final boolean b(T t9) {
        return this.f5384d.b(t9).s();
    }

    public final void c(T t9, T t10) {
        wa.n(this.f5382b, t9, t10);
        if (this.f5383c) {
            wa.l(this.f5384d, t9, t10);
        }
    }

    public final void d(T t9) {
        this.f5382b.l(t9);
        this.f5384d.g(t9);
    }

    public final int e(T t9) {
        int hashCode = this.f5382b.k(t9).hashCode();
        return this.f5383c ? (hashCode * 53) + this.f5384d.b(t9).hashCode() : hashCode;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.measurement.p8$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.e7 r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.p8 r0 = (com.google.android.gms.internal.measurement.p8) r0
            com.google.android.gms.internal.measurement.sb r1 = r0.zzb
            com.google.android.gms.internal.measurement.sb r2 = com.google.android.gms.internal.measurement.sb.k()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.measurement.sb r1 = com.google.android.gms.internal.measurement.sb.l()
            r0.zzb = r1
        L_0x0011:
            com.google.android.gms.internal.measurement.p8$d r10 = (com.google.android.gms.internal.measurement.p8.d) r10
            r10.J()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.measurement.b7.p(r11, r12, r14)
            int r2 = r14.f5207a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.measurement.e8<?> r12 = r9.f5384d
            com.google.android.gms.internal.measurement.c8 r0 = r14.f5210d
            com.google.android.gms.internal.measurement.da r3 = r9.f5381a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.p8$f r0 = (com.google.android.gms.internal.measurement.p8.f) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.b7.d(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.measurement.qa.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.measurement.b7.b(r2, r11, r4, r13, r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.b7.p(r11, r4, r14)
            int r5 = r14.f5207a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.b7.k(r11, r4, r14)
            java.lang.Object r2 = r14.f5209c
            com.google.android.gms.internal.measurement.f7 r2 = (com.google.android.gms.internal.measurement.f7) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.measurement.qa.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.b7.p(r11, r4, r14)
            int r12 = r14.f5207a
            com.google.android.gms.internal.measurement.e8<?> r0 = r9.f5384d
            com.google.android.gms.internal.measurement.c8 r5 = r14.f5210d
            com.google.android.gms.internal.measurement.da r6 = r9.f5381a
            java.lang.Object r0 = r0.c(r5, r6, r12)
            com.google.android.gms.internal.measurement.p8$f r0 = (com.google.android.gms.internal.measurement.p8.f) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.b7.b(r5, r11, r4, r13, r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.e(r12, r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.measurement.b9 r10 = com.google.android.gms.internal.measurement.b9.e()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ja.f(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.e7):void");
    }

    public final boolean g(T t9, T t10) {
        if (!this.f5382b.k(t9).equals(this.f5382b.k(t10))) {
            return false;
        }
        if (this.f5383c) {
            return this.f5384d.b(t9).equals(this.f5384d.b(t10));
        }
        return true;
    }

    public final void h(T t9, qc qcVar) {
        Iterator<Map.Entry<?, Object>> p10 = this.f5384d.b(t9).p();
        while (p10.hasNext()) {
            Map.Entry next = p10.next();
            k8 k8Var = (k8) next.getKey();
            if (k8Var.b() != rc.MESSAGE || k8Var.d() || k8Var.c()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            qcVar.s(k8Var.zza(), next instanceof f9 ? ((f9) next).a().d() : next.getValue());
        }
        ub<?, ?> ubVar = this.f5382b;
        ubVar.d(ubVar.k(t9), qcVar);
    }

    public final T zza() {
        da daVar = this.f5381a;
        return daVar instanceof p8 ? ((p8) daVar).C() : daVar.i().j();
    }
}
