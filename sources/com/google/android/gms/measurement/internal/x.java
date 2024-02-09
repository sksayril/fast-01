package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.internal.measurement.r1;
import h2.p;

abstract class x {

    /* renamed from: d  reason: collision with root package name */
    private static volatile Handler f6684d;

    /* renamed from: a  reason: collision with root package name */
    private final n7 f6685a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f6686b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile long f6687c;

    x(n7 n7Var) {
        p.j(n7Var);
        this.f6685a = n7Var;
        this.f6686b = new w(this, n7Var);
    }

    private final Handler f() {
        Handler handler;
        if (f6684d != null) {
            return f6684d;
        }
        synchronized (x.class) {
            if (f6684d == null) {
                f6684d = new r1(this.f6685a.zza().getMainLooper());
            }
            handler = f6684d;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f6687c = 0;
        f().removeCallbacks(this.f6686b);
    }

    public final void b(long j10) {
        a();
        if (j10 >= 0) {
            this.f6687c = this.f6685a.a().a();
            if (!f().postDelayed(this.f6686b, j10)) {
                this.f6685a.k().F().b("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.f6687c != 0;
    }
}
