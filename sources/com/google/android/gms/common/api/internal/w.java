package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import d3.e;
import d3.j;
import g2.b;
import h2.c;
import h2.f;
import h2.n;
import h2.q;
import h2.r;

final class w implements e {

    /* renamed from: a  reason: collision with root package name */
    private final b f5043a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5044b;

    /* renamed from: c  reason: collision with root package name */
    private final b f5045c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5046d;

    /* renamed from: e  reason: collision with root package name */
    private final long f5047e;

    w(b bVar, int i10, b bVar2, long j10, long j11, String str, String str2) {
        this.f5043a = bVar;
        this.f5044b = i10;
        this.f5045c = bVar2;
        this.f5046d = j10;
        this.f5047e = j11;
    }

    static w b(b bVar, int i10, b bVar2) {
        boolean z9;
        if (!bVar.f()) {
            return null;
        }
        r a10 = q.b().a();
        if (a10 == null) {
            z9 = true;
        } else if (!a10.g()) {
            return null;
        } else {
            z9 = a10.i();
            r w9 = bVar.w(bVar2);
            if (w9 != null) {
                if (!(w9.s() instanceof c)) {
                    return null;
                }
                c cVar = (c) w9.s();
                if (cVar.J() && !cVar.h()) {
                    f c10 = c(w9, cVar, i10);
                    if (c10 == null) {
                        return null;
                    }
                    w9.E();
                    z9 = c10.k();
                }
            }
        }
        return new w(bVar, i10, bVar2, z9 ? System.currentTimeMillis() : 0, z9 ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    private static f c(r rVar, c cVar, int i10) {
        int[] f10;
        int[] g10;
        f H = cVar.H();
        if (H == null || !H.i() || ((f10 = H.f()) != null ? !l2.b.a(f10, i10) : !((g10 = H.g()) == null || !l2.b.a(g10, i10))) || rVar.p() >= H.d()) {
            return null;
        }
        return H;
    }

    public final void a(j jVar) {
        r w9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        long j11;
        if (this.f5043a.f()) {
            r a10 = q.b().a();
            if ((a10 == null || a10.g()) && (w9 = this.f5043a.w(this.f5045c)) != null && (w9.s() instanceof c)) {
                c cVar = (c) w9.s();
                boolean z9 = true;
                boolean z10 = this.f5046d > 0;
                int z11 = cVar.z();
                if (a10 != null) {
                    boolean i16 = z10 & a10.i();
                    int d10 = a10.d();
                    int f10 = a10.f();
                    i12 = a10.k();
                    if (cVar.J() && !cVar.h()) {
                        f c10 = c(w9, cVar, this.f5044b);
                        if (c10 != null) {
                            if (!c10.k() || this.f5046d <= 0) {
                                z9 = false;
                            }
                            f10 = c10.d();
                            i16 = z9;
                        } else {
                            return;
                        }
                    }
                    i11 = d10;
                    i10 = f10;
                } else {
                    i12 = 0;
                    i11 = 5000;
                    i10 = 100;
                }
                b bVar = this.f5043a;
                if (jVar.q()) {
                    i14 = 0;
                    i13 = 0;
                } else {
                    if (jVar.o()) {
                        i14 = 100;
                    } else {
                        Exception m10 = jVar.m();
                        if (m10 instanceof f2.b) {
                            Status a11 = ((f2.b) m10).a();
                            int f11 = a11.f();
                            e2.b d11 = a11.d();
                            i13 = d11 == null ? -1 : d11.d();
                            i14 = f11;
                        } else {
                            i14 = 101;
                        }
                    }
                    i13 = -1;
                }
                if (z10) {
                    long j12 = this.f5046d;
                    j10 = System.currentTimeMillis();
                    j11 = j12;
                    i15 = (int) (SystemClock.elapsedRealtime() - this.f5047e);
                } else {
                    j11 = 0;
                    j10 = 0;
                    i15 = -1;
                }
                bVar.G(new n(this.f5044b, i14, i13, j11, j10, (String) null, (String) null, z11, i15), i12, (long) i11, i10);
            }
        }
    }
}
