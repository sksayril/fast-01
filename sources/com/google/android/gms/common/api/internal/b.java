package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c;
import d3.k;
import e2.e;
import g2.e0;
import g2.m;
import h2.i;
import h2.i0;
import h2.n;
import h2.q;
import h2.r;
import h2.t;
import h2.u;
import h2.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import l2.h;
import r2.j;

public class b implements Handler.Callback {

    /* renamed from: r  reason: collision with root package name */
    public static final Status f4938r = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final Status f4939s = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static final Object f4940t = new Object();

    /* renamed from: u  reason: collision with root package name */
    private static b f4941u;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f4942a = 5000;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public long f4943b = 120000;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public long f4944c = 10000;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f4945d = false;

    /* renamed from: e  reason: collision with root package name */
    private t f4946e;

    /* renamed from: f  reason: collision with root package name */
    private v f4947f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Context f4948g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final e f4949h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final i0 f4950i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicInteger f4951j = new AtomicInteger(1);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f4952k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final Map f4953l = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public k f4954m = null;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Set f4955n = new p.b();

    /* renamed from: o  reason: collision with root package name */
    private final Set f4956o = new p.b();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Handler f4957p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public volatile boolean f4958q = true;

    private b(Context context, Looper looper, e eVar) {
        this.f4948g = context;
        j jVar = new j(looper, this);
        this.f4957p = jVar;
        this.f4949h = eVar;
        this.f4950i = new i0(eVar);
        if (h.a(context)) {
            this.f4958q = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    /* access modifiers changed from: private */
    public static Status h(g2.b bVar, e2.b bVar2) {
        String b10 = bVar.b();
        String valueOf = String.valueOf(bVar2);
        return new Status(bVar2, "API: " + b10 + " is not available on this device. Connection failed with: " + valueOf);
    }

    private final r i(f2.e eVar) {
        g2.b k10 = eVar.k();
        r rVar = (r) this.f4953l.get(k10);
        if (rVar == null) {
            rVar = new r(this, eVar);
            this.f4953l.put(k10, rVar);
        }
        if (rVar.O()) {
            this.f4956o.add(k10);
        }
        rVar.C();
        return rVar;
    }

    private final v j() {
        if (this.f4947f == null) {
            this.f4947f = u.a(this.f4948g);
        }
        return this.f4947f;
    }

    private final void k() {
        t tVar = this.f4946e;
        if (tVar != null) {
            if (tVar.d() > 0 || f()) {
                j().e(tVar);
            }
            this.f4946e = null;
        }
    }

    private final void l(k kVar, int i10, f2.e eVar) {
        w b10;
        if (i10 != 0 && (b10 = w.b(this, i10, eVar.k())) != null) {
            d3.j a10 = kVar.a();
            Handler handler = this.f4957p;
            handler.getClass();
            a10.c(new m(handler), b10);
        }
    }

    public static b x(Context context) {
        b bVar;
        synchronized (f4940t) {
            if (f4941u == null) {
                f4941u = new b(context.getApplicationContext(), i.c().getLooper(), e.m());
            }
            bVar = f4941u;
        }
        return bVar;
    }

    public final d3.j A(f2.e eVar, c.a aVar, int i10) {
        k kVar = new k();
        l(kVar, i10, eVar);
        f0 f0Var = new f0(aVar, kVar);
        Handler handler = this.f4957p;
        handler.sendMessage(handler.obtainMessage(13, new g2.u(f0Var, this.f4952k.get(), eVar)));
        return kVar.a();
    }

    public final void F(f2.e eVar, int i10, g gVar, k kVar, g2.j jVar) {
        l(kVar, gVar.d(), eVar);
        e0 e0Var = new e0(i10, gVar, kVar, jVar);
        Handler handler = this.f4957p;
        handler.sendMessage(handler.obtainMessage(4, new g2.u(e0Var, this.f4952k.get(), eVar)));
    }

    /* access modifiers changed from: package-private */
    public final void G(n nVar, int i10, long j10, int i11) {
        Handler handler = this.f4957p;
        handler.sendMessage(handler.obtainMessage(18, new x(nVar, i10, j10, i11)));
    }

    public final void H(e2.b bVar, int i10) {
        if (!g(bVar, i10)) {
            Handler handler = this.f4957p;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, bVar));
        }
    }

    public final void a() {
        Handler handler = this.f4957p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(f2.e eVar) {
        Handler handler = this.f4957p;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void c(k kVar) {
        synchronized (f4940t) {
            if (this.f4954m != kVar) {
                this.f4954m = kVar;
                this.f4955n.clear();
            }
            this.f4955n.addAll(kVar.t());
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(k kVar) {
        synchronized (f4940t) {
            if (this.f4954m == kVar) {
                this.f4954m = null;
                this.f4955n.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        if (this.f4945d) {
            return false;
        }
        r a10 = q.b().a();
        if (a10 != null && !a10.g()) {
            return false;
        }
        int a11 = this.f4950i.a(this.f4948g, 203400000);
        return a11 == -1 || a11 == 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean g(e2.b bVar, int i10) {
        return this.f4949h.w(this.f4948g, bVar, i10);
    }

    public final boolean handleMessage(Message message) {
        k kVar;
        Boolean bool;
        int i10 = message.what;
        long j10 = 300000;
        r rVar = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f4944c = j10;
                this.f4957p.removeMessages(12);
                for (g2.b obtainMessage : this.f4953l.keySet()) {
                    Handler handler = this.f4957p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f4944c);
                }
                break;
            case 2:
                e0 e0Var = (e0) message.obj;
                Iterator it = e0Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        g2.b bVar = (g2.b) it.next();
                        r rVar2 = (r) this.f4953l.get(bVar);
                        if (rVar2 == null) {
                            e0Var.b(bVar, new e2.b(13), (String) null);
                            break;
                        } else if (rVar2.N()) {
                            e0Var.b(bVar, e2.b.f8327q, rVar2.s().j());
                        } else {
                            e2.b q9 = rVar2.q();
                            if (q9 != null) {
                                e0Var.b(bVar, q9, (String) null);
                            } else {
                                rVar2.H(e0Var);
                                rVar2.C();
                            }
                        }
                    }
                }
            case 3:
                for (r rVar3 : this.f4953l.values()) {
                    rVar3.A();
                    rVar3.C();
                }
                break;
            case 4:
            case 8:
            case 13:
                g2.u uVar = (g2.u) message.obj;
                r rVar4 = (r) this.f4953l.get(uVar.f8912c.k());
                if (rVar4 == null) {
                    rVar4 = i(uVar.f8912c);
                }
                if (rVar4.O() && this.f4952k.get() != uVar.f8911b) {
                    uVar.f8910a.a(f4938r);
                    rVar4.K();
                    break;
                } else {
                    rVar4.D(uVar.f8910a);
                    break;
                }
                break;
            case 5:
                int i11 = message.arg1;
                e2.b bVar2 = (e2.b) message.obj;
                Iterator it2 = this.f4953l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        r rVar5 = (r) it2.next();
                        if (rVar5.o() == i11) {
                            rVar = rVar5;
                        }
                    }
                }
                if (rVar != null) {
                    if (bVar2.d() != 13) {
                        rVar.d(h(rVar.f5020e, bVar2));
                        break;
                    } else {
                        String e10 = this.f4949h.e(bVar2.d());
                        String f10 = bVar2.f();
                        rVar.d(new Status(17, "Error resolution was canceled by the user, original error message: " + e10 + ": " + f10));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.f4948g.getApplicationContext() instanceof Application) {
                    a.c((Application) this.f4948g.getApplicationContext());
                    a.b().a(new m(this));
                    if (!a.b().e(true)) {
                        this.f4944c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                i((f2.e) message.obj);
                break;
            case 9:
                if (this.f4953l.containsKey(message.obj)) {
                    ((r) this.f4953l.get(message.obj)).I();
                    break;
                }
                break;
            case 10:
                for (g2.b remove : this.f4956o) {
                    r rVar6 = (r) this.f4953l.remove(remove);
                    if (rVar6 != null) {
                        rVar6.K();
                    }
                }
                this.f4956o.clear();
                break;
            case 11:
                if (this.f4953l.containsKey(message.obj)) {
                    ((r) this.f4953l.get(message.obj)).L();
                    break;
                }
                break;
            case 12:
                if (this.f4953l.containsKey(message.obj)) {
                    ((r) this.f4953l.get(message.obj)).a();
                    break;
                }
                break;
            case 14:
                l lVar = (l) message.obj;
                g2.b a10 = lVar.a();
                if (!this.f4953l.containsKey(a10)) {
                    kVar = lVar.b();
                    bool = Boolean.FALSE;
                } else {
                    boolean M = ((r) this.f4953l.get(a10)).n(false);
                    kVar = lVar.b();
                    bool = Boolean.valueOf(M);
                }
                kVar.c(bool);
                break;
            case 15:
                s sVar = (s) message.obj;
                if (this.f4953l.containsKey(sVar.f5031a)) {
                    r.y((r) this.f4953l.get(sVar.f5031a), sVar);
                    break;
                }
                break;
            case 16:
                s sVar2 = (s) message.obj;
                if (this.f4953l.containsKey(sVar2.f5031a)) {
                    r.z((r) this.f4953l.get(sVar2.f5031a), sVar2);
                    break;
                }
                break;
            case 17:
                k();
                break;
            case 18:
                x xVar = (x) message.obj;
                if (xVar.f5050c != 0) {
                    t tVar = this.f4946e;
                    if (tVar != null) {
                        List f11 = tVar.f();
                        if (tVar.d() != xVar.f5049b || (f11 != null && f11.size() >= xVar.f5051d)) {
                            this.f4957p.removeMessages(17);
                            k();
                        } else {
                            this.f4946e.g(xVar.f5048a);
                        }
                    }
                    if (this.f4946e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(xVar.f5048a);
                        this.f4946e = new t(xVar.f5049b, arrayList);
                        Handler handler2 = this.f4957p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), xVar.f5050c);
                        break;
                    }
                } else {
                    j().e(new t(xVar.f5049b, Arrays.asList(new n[]{xVar.f5048a})));
                    break;
                }
                break;
            case 19:
                this.f4945d = false;
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
        return true;
    }

    public final int m() {
        return this.f4951j.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final r w(g2.b bVar) {
        return (r) this.f4953l.get(bVar);
    }

    public final d3.j z(f2.e eVar, e eVar2, h hVar, Runnable runnable) {
        k kVar = new k();
        l(kVar, eVar2.e(), eVar);
        d0 d0Var = new d0(new g2.v(eVar2, hVar, runnable), kVar);
        Handler handler = this.f4957p;
        handler.sendMessage(handler.obtainMessage(8, new g2.u(d0Var, this.f4952k.get(), eVar)));
        return kVar.a();
    }
}
