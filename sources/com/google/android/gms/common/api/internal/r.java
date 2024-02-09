package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c;
import d3.k;
import e2.d;
import f2.a;
import f2.e;
import f2.f;
import f2.m;
import g2.b;
import g2.c0;
import g2.e0;
import g2.n;
import g2.v;
import h2.o;
import h2.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class r implements f.a, f.b {

    /* renamed from: c  reason: collision with root package name */
    private final Queue f5018c = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final a.f f5019d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final b f5020e;

    /* renamed from: f  reason: collision with root package name */
    private final j f5021f;

    /* renamed from: g  reason: collision with root package name */
    private final Set f5022g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    private final Map f5023h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private final int f5024i;

    /* renamed from: j  reason: collision with root package name */
    private final c0 f5025j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5026k;

    /* renamed from: l  reason: collision with root package name */
    private final List f5027l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private e2.b f5028m = null;

    /* renamed from: n  reason: collision with root package name */
    private int f5029n = 0;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ b f5030o;

    public r(b bVar, e eVar) {
        this.f5030o = bVar;
        a.f n10 = eVar.n(bVar.f4957p.getLooper(), this);
        this.f5019d = n10;
        this.f5020e = eVar.k();
        this.f5021f = new j();
        this.f5024i = eVar.m();
        if (n10.n()) {
            this.f5025j = eVar.o(bVar.f4948g, bVar.f4957p);
        } else {
            this.f5025j = null;
        }
    }

    private final d b(d[] dVarArr) {
        if (!(dVarArr == null || dVarArr.length == 0)) {
            d[] i10 = this.f5019d.i();
            if (i10 == null) {
                i10 = new d[0];
            }
            p.a aVar = new p.a(r3);
            for (d dVar : i10) {
                aVar.put(dVar.d(), Long.valueOf(dVar.f()));
            }
            for (d dVar2 : dVarArr) {
                Long l10 = (Long) aVar.get(dVar2.d());
                if (l10 == null || l10.longValue() < dVar2.f()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    private final void c(e2.b bVar) {
        for (e0 b10 : this.f5022g) {
            b10.b(this.f5020e, bVar, o.a(bVar, e2.b.f8327q) ? this.f5019d.j() : null);
        }
        this.f5022g.clear();
    }

    /* access modifiers changed from: private */
    public final void d(Status status) {
        p.d(this.f5030o.f4957p);
        e(status, (Exception) null, false);
    }

    private final void e(Status status, Exception exc, boolean z9) {
        p.d(this.f5030o.f4957p);
        boolean z10 = false;
        boolean z11 = status == null;
        if (exc == null) {
            z10 = true;
        }
        if (z11 != z10) {
            Iterator it = this.f5018c.iterator();
            while (it.hasNext()) {
                g0 g0Var = (g0) it.next();
                if (!z9 || g0Var.f4991a == 2) {
                    if (status != null) {
                        g0Var.a(status);
                    } else {
                        g0Var.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void f() {
        ArrayList arrayList = new ArrayList(this.f5018c);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            g0 g0Var = (g0) arrayList.get(i10);
            if (this.f5019d.a()) {
                if (l(g0Var)) {
                    this.f5018c.remove(g0Var);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void g() {
        A();
        c(e2.b.f8327q);
        k();
        Iterator it = this.f5023h.values().iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (b(vVar.f8913a.c()) == null) {
                try {
                    vVar.f8913a.d(this.f5019d, new k());
                } catch (DeadObjectException unused) {
                    B(3);
                    this.f5019d.e("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                }
            }
            it.remove();
        }
        f();
        i();
    }

    /* access modifiers changed from: private */
    public final void h(int i10) {
        A();
        this.f5026k = true;
        this.f5021f.c(i10, this.f5019d.k());
        b bVar = this.f5030o;
        bVar.f4957p.sendMessageDelayed(Message.obtain(bVar.f4957p, 9, this.f5020e), this.f5030o.f4942a);
        b bVar2 = this.f5030o;
        bVar2.f4957p.sendMessageDelayed(Message.obtain(bVar2.f4957p, 11, this.f5020e), this.f5030o.f4943b);
        this.f5030o.f4950i.c();
        for (v vVar : this.f5023h.values()) {
            vVar.f8915c.run();
        }
    }

    private final void i() {
        this.f5030o.f4957p.removeMessages(12, this.f5020e);
        b bVar = this.f5030o;
        bVar.f4957p.sendMessageDelayed(bVar.f4957p.obtainMessage(12, this.f5020e), this.f5030o.f4944c);
    }

    private final void j(g0 g0Var) {
        g0Var.d(this.f5021f, O());
        try {
            g0Var.c(this);
        } catch (DeadObjectException unused) {
            B(1);
            this.f5019d.e("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void k() {
        if (this.f5026k) {
            this.f5030o.f4957p.removeMessages(11, this.f5020e);
            this.f5030o.f4957p.removeMessages(9, this.f5020e);
            this.f5026k = false;
        }
    }

    private final boolean l(g0 g0Var) {
        if (!(g0Var instanceof g2.r)) {
            j(g0Var);
            return true;
        }
        g2.r rVar = (g2.r) g0Var;
        d b10 = b(rVar.g(this));
        if (b10 == null) {
            j(g0Var);
            return true;
        }
        String name = this.f5019d.getClass().getName();
        String d10 = b10.d();
        long f10 = b10.f();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + d10 + ", " + f10 + ").");
        if (!this.f5030o.f4958q || !rVar.f(this)) {
            rVar.b(new m(b10));
            return true;
        }
        s sVar = new s(this.f5020e, b10, (n) null);
        int indexOf = this.f5027l.indexOf(sVar);
        if (indexOf >= 0) {
            s sVar2 = (s) this.f5027l.get(indexOf);
            this.f5030o.f4957p.removeMessages(15, sVar2);
            b bVar = this.f5030o;
            bVar.f4957p.sendMessageDelayed(Message.obtain(bVar.f4957p, 15, sVar2), this.f5030o.f4942a);
            return false;
        }
        this.f5027l.add(sVar);
        b bVar2 = this.f5030o;
        bVar2.f4957p.sendMessageDelayed(Message.obtain(bVar2.f4957p, 15, sVar), this.f5030o.f4942a);
        b bVar3 = this.f5030o;
        bVar3.f4957p.sendMessageDelayed(Message.obtain(bVar3.f4957p, 16, sVar), this.f5030o.f4943b);
        e2.b bVar4 = new e2.b(2, (PendingIntent) null);
        if (m(bVar4)) {
            return false;
        }
        this.f5030o.g(bVar4, this.f5024i);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m(e2.b r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.b.f4940t
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.b r1 = r3.f5030o     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.k r2 = r1.f4954m     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f4955n     // Catch:{ all -> 0x002a }
            g2.b r2 = r3.f5020e     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.b r1 = r3.f5030o     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.k r1 = r1.f4954m     // Catch:{ all -> 0x002a }
            int r2 = r3.f5024i     // Catch:{ all -> 0x002a }
            r1.s(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.r.m(e2.b):boolean");
    }

    /* access modifiers changed from: private */
    public final boolean n(boolean z9) {
        p.d(this.f5030o.f4957p);
        if (!this.f5019d.a() || this.f5023h.size() != 0) {
            return false;
        }
        if (this.f5021f.e()) {
            if (z9) {
                i();
            }
            return false;
        }
        this.f5019d.e("Timing out service connection.");
        return true;
    }

    static /* bridge */ /* synthetic */ void y(r rVar, s sVar) {
        if (!rVar.f5027l.contains(sVar) || rVar.f5026k) {
            return;
        }
        if (!rVar.f5019d.a()) {
            rVar.C();
        } else {
            rVar.f();
        }
    }

    static /* bridge */ /* synthetic */ void z(r rVar, s sVar) {
        d[] g10;
        if (rVar.f5027l.remove(sVar)) {
            rVar.f5030o.f4957p.removeMessages(15, sVar);
            rVar.f5030o.f4957p.removeMessages(16, sVar);
            d a10 = sVar.f5032b;
            ArrayList arrayList = new ArrayList(rVar.f5018c.size());
            for (g0 g0Var : rVar.f5018c) {
                if ((g0Var instanceof g2.r) && (g10 = ((g2.r) g0Var).g(rVar)) != null && l2.b.b(g10, a10)) {
                    arrayList.add(g0Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                g0 g0Var2 = (g0) arrayList.get(i10);
                rVar.f5018c.remove(g0Var2);
                g0Var2.b(new m(a10));
            }
        }
    }

    public final void A() {
        p.d(this.f5030o.f4957p);
        this.f5028m = null;
    }

    public final void B(int i10) {
        if (Looper.myLooper() == this.f5030o.f4957p.getLooper()) {
            h(i10);
        } else {
            this.f5030o.f4957p.post(new o(this, i10));
        }
    }

    public final void C() {
        e2.b bVar;
        p.d(this.f5030o.f4957p);
        if (!this.f5019d.a() && !this.f5019d.h()) {
            try {
                b bVar2 = this.f5030o;
                int b10 = bVar2.f4950i.b(bVar2.f4948g, this.f5019d);
                if (b10 != 0) {
                    e2.b bVar3 = new e2.b(b10, (PendingIntent) null);
                    String name = this.f5019d.getClass().getName();
                    String obj = bVar3.toString();
                    Log.w("GoogleApiManager", "The service for " + name + " is not available: " + obj);
                    F(bVar3, (Exception) null);
                    return;
                }
                b bVar4 = this.f5030o;
                a.f fVar = this.f5019d;
                u uVar = new u(bVar4, fVar, this.f5020e);
                if (fVar.n()) {
                    ((c0) p.j(this.f5025j)).h3(uVar);
                }
                try {
                    this.f5019d.p(uVar);
                } catch (SecurityException e10) {
                    e = e10;
                    bVar = new e2.b(10);
                    F(bVar, e);
                }
            } catch (IllegalStateException e11) {
                e = e11;
                bVar = new e2.b(10);
                F(bVar, e);
            }
        }
    }

    public final void D(g0 g0Var) {
        p.d(this.f5030o.f4957p);
        if (!this.f5019d.a()) {
            this.f5018c.add(g0Var);
            e2.b bVar = this.f5028m;
            if (bVar == null || !bVar.i()) {
                C();
            } else {
                F(this.f5028m, (Exception) null);
            }
        } else if (l(g0Var)) {
            i();
        } else {
            this.f5018c.add(g0Var);
        }
    }

    /* access modifiers changed from: package-private */
    public final void E() {
        this.f5029n++;
    }

    public final void F(e2.b bVar, Exception exc) {
        p.d(this.f5030o.f4957p);
        c0 c0Var = this.f5025j;
        if (c0Var != null) {
            c0Var.i3();
        }
        A();
        this.f5030o.f4950i.c();
        c(bVar);
        if ((this.f5019d instanceof j2.e) && bVar.d() != 24) {
            this.f5030o.f4945d = true;
            b bVar2 = this.f5030o;
            bVar2.f4957p.sendMessageDelayed(bVar2.f4957p.obtainMessage(19), 300000);
        }
        if (bVar.d() == 4) {
            d(b.f4939s);
        } else if (this.f5018c.isEmpty()) {
            this.f5028m = bVar;
        } else if (exc != null) {
            p.d(this.f5030o.f4957p);
            e((Status) null, exc, false);
        } else if (this.f5030o.f4958q) {
            e(b.h(this.f5020e, bVar), (Exception) null, true);
            if (!this.f5018c.isEmpty() && !m(bVar) && !this.f5030o.g(bVar, this.f5024i)) {
                if (bVar.d() == 18) {
                    this.f5026k = true;
                }
                if (this.f5026k) {
                    b bVar3 = this.f5030o;
                    bVar3.f4957p.sendMessageDelayed(Message.obtain(bVar3.f4957p, 9, this.f5020e), this.f5030o.f4942a);
                    return;
                }
                d(b.h(this.f5020e, bVar));
            }
        } else {
            d(b.h(this.f5020e, bVar));
        }
    }

    public final void G(e2.b bVar) {
        p.d(this.f5030o.f4957p);
        a.f fVar = this.f5019d;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(bVar);
        fVar.e("onSignInFailed for " + name + " with " + valueOf);
        F(bVar, (Exception) null);
    }

    public final void H(e0 e0Var) {
        p.d(this.f5030o.f4957p);
        this.f5022g.add(e0Var);
    }

    public final void I() {
        p.d(this.f5030o.f4957p);
        if (this.f5026k) {
            C();
        }
    }

    public final void J(e2.b bVar) {
        F(bVar, (Exception) null);
    }

    public final void K() {
        p.d(this.f5030o.f4957p);
        d(b.f4938r);
        this.f5021f.d();
        for (c.a f0Var : (c.a[]) this.f5023h.keySet().toArray(new c.a[0])) {
            D(new f0(f0Var, new k()));
        }
        c(new e2.b(4));
        if (this.f5019d.a()) {
            this.f5019d.l(new q(this));
        }
    }

    public final void L() {
        p.d(this.f5030o.f4957p);
        if (this.f5026k) {
            k();
            b bVar = this.f5030o;
            d(bVar.f4949h.g(bVar.f4948g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f5019d.e("Timing out connection while resuming.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean N() {
        return this.f5019d.a();
    }

    public final boolean O() {
        return this.f5019d.n();
    }

    public final void Y(Bundle bundle) {
        if (Looper.myLooper() == this.f5030o.f4957p.getLooper()) {
            g();
        } else {
            this.f5030o.f4957p.post(new n(this));
        }
    }

    public final boolean a() {
        return n(true);
    }

    public final int o() {
        return this.f5024i;
    }

    /* access modifiers changed from: package-private */
    public final int p() {
        return this.f5029n;
    }

    public final e2.b q() {
        p.d(this.f5030o.f4957p);
        return this.f5028m;
    }

    public final a.f s() {
        return this.f5019d;
    }

    public final Map u() {
        return this.f5023h;
    }
}
