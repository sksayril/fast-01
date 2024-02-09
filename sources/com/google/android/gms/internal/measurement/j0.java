package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

final class j0 implements Comparator<r> {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ m f5366m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ s6 f5367n;

    j0(m mVar, s6 s6Var) {
        this.f5366m = mVar;
        this.f5367n = s6Var;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        m mVar = this.f5366m;
        s6 s6Var = this.f5367n;
        if (rVar instanceof y) {
            return !(rVar2 instanceof y) ? 1 : 0;
        }
        if (rVar2 instanceof y) {
            return -1;
        }
        if (mVar == null) {
            return rVar.f().compareTo(rVar2.f());
        }
        return (int) r5.a(mVar.a(s6Var, Arrays.asList(new r[]{rVar, rVar2})).d().doubleValue());
    }
}
