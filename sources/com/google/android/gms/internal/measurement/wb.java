package com.google.android.gms.internal.measurement;

final class wb extends ub<sb, sb> {
    wb() {
    }

    private static void m(Object obj, sb sbVar) {
        ((p8) obj).zzb = sbVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int a(Object obj) {
        return ((sb) obj).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b(Object obj, Object obj2) {
        sb sbVar = (sb) obj;
        sb sbVar2 = (sb) obj2;
        return sb.k().equals(sbVar2) ? sbVar : sb.k().equals(sbVar) ? sb.c(sbVar, sbVar2) : sbVar.b(sbVar2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(Object obj, int i10, f7 f7Var) {
        ((sb) obj).e((i10 << 3) | 2, f7Var);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(Object obj, qc qcVar) {
        ((sb) obj).g(qcVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int e(Object obj) {
        return ((sb) obj).i();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(Object obj, int i10, long j10) {
        ((sb) obj).e(i10 << 3, Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(Object obj, qc qcVar) {
        ((sb) obj).j(qcVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(Object obj, Object obj2) {
        m(obj, (sb) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object i(Object obj) {
        sb sbVar = ((p8) obj).zzb;
        if (sbVar != sb.k()) {
            return sbVar;
        }
        sb l10 = sb.l();
        m(obj, l10);
        return l10;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j(Object obj, Object obj2) {
        m(obj, (sb) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object k(Object obj) {
        return ((p8) obj).zzb;
    }

    /* access modifiers changed from: package-private */
    public final void l(Object obj) {
        ((p8) obj).zzb.m();
    }
}
