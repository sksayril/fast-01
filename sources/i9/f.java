package i9;

import b9.h1;
import j8.g;

public class f extends h1 {

    /* renamed from: p  reason: collision with root package name */
    private final int f9636p;

    /* renamed from: q  reason: collision with root package name */
    private final int f9637q;

    /* renamed from: r  reason: collision with root package name */
    private final long f9638r;

    /* renamed from: s  reason: collision with root package name */
    private final String f9639s;

    /* renamed from: t  reason: collision with root package name */
    private a f9640t = L();

    public f(int i10, int i11, long j10, String str) {
        this.f9636p = i10;
        this.f9637q = i11;
        this.f9638r = j10;
        this.f9639s = str;
    }

    private final a L() {
        return new a(this.f9636p, this.f9637q, this.f9638r, this.f9639s);
    }

    public void I(g gVar, Runnable runnable) {
        a.m(this.f9640t, runnable, (i) null, false, 6, (Object) null);
    }

    public final void M(Runnable runnable, i iVar, boolean z9) {
        this.f9640t.l(runnable, iVar, z9);
    }
}
