package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import e2.b;
import e2.e;
import g2.f;
import java.util.concurrent.atomic.AtomicReference;
import r2.j;

public abstract class k0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: n  reason: collision with root package name */
    protected volatile boolean f5005n;

    /* renamed from: o  reason: collision with root package name */
    protected final AtomicReference f5006o = new AtomicReference((Object) null);

    /* renamed from: p  reason: collision with root package name */
    private final Handler f5007p = new j(Looper.getMainLooper());

    /* renamed from: q  reason: collision with root package name */
    protected final e f5008q;

    k0(f fVar, e eVar) {
        super(fVar);
        this.f5008q = eVar;
    }

    /* access modifiers changed from: private */
    public final void l(b bVar, int i10) {
        this.f5006o.set((Object) null);
        m(bVar, i10);
    }

    /* access modifiers changed from: private */
    public final void o() {
        this.f5006o.set((Object) null);
        n();
    }

    private static final int p(h0 h0Var) {
        if (h0Var == null) {
            return -1;
        }
        return h0Var.a();
    }

    public final void e(int i10, int i11, Intent intent) {
        h0 h0Var = (h0) this.f5006o.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int g10 = this.f5008q.g(b());
                if (g10 == 0) {
                    o();
                    return;
                } else if (h0Var != null) {
                    if (h0Var.b().d() == 18 && g10 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (h0Var != null) {
                int i12 = 13;
                if (intent != null) {
                    i12 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                l(new b(i12, (PendingIntent) null, h0Var.b().toString()), p(h0Var));
                return;
            }
            return;
        }
        if (h0Var != null) {
            l(h0Var.b(), h0Var.a());
        }
    }

    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f5006o.set(bundle.getBoolean("resolving_error", false) ? new h0(new b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void i(Bundle bundle) {
        super.i(bundle);
        h0 h0Var = (h0) this.f5006o.get();
        if (h0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", h0Var.a());
            bundle.putInt("failed_status", h0Var.b().d());
            bundle.putParcelable("failed_resolution", h0Var.b().g());
        }
    }

    public void j() {
        super.j();
        this.f5005n = true;
    }

    public void k() {
        super.k();
        this.f5005n = false;
    }

    /* access modifiers changed from: protected */
    public abstract void m(b bVar, int i10);

    /* access modifiers changed from: protected */
    public abstract void n();

    public final void onCancel(DialogInterface dialogInterface) {
        l(new b(13, (PendingIntent) null), p((h0) this.f5006o.get()));
    }

    public final void s(b bVar, int i10) {
        h0 h0Var = new h0(bVar, i10);
        AtomicReference atomicReference = this.f5006o;
        while (!atomicReference.compareAndSet((Object) null, h0Var)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f5007p.post(new j0(this, h0Var));
    }
}
