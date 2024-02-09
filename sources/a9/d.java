package a9;

import kotlin.jvm.internal.l;
import w8.f;

public final class d {
    /* access modifiers changed from: private */
    public static final long d(long j10, int i10) {
        return b.m((j10 << 1) + ((long) i10));
    }

    /* access modifiers changed from: private */
    public static final long e(long j10) {
        return b.m((j10 << 1) + 1);
    }

    private static final long f(long j10) {
        return b.m(j10 << 1);
    }

    /* access modifiers changed from: private */
    public static final long g(long j10) {
        return j10 * ((long) 1000000);
    }

    public static final long h(int i10, e eVar) {
        l.e(eVar, "unit");
        return eVar.compareTo(e.SECONDS) <= 0 ? f(f.b((long) i10, eVar, e.NANOSECONDS)) : i((long) i10, eVar);
    }

    public static final long i(long j10, e eVar) {
        l.e(eVar, "unit");
        e eVar2 = e.NANOSECONDS;
        long b10 = f.b(4611686018426999999L, eVar2, eVar);
        return new f(-b10, b10).g(j10) ? f(f.b(j10, eVar, eVar2)) : e(i.f(f.a(j10, eVar, e.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }
}
