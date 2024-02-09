package h2;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import e2.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c<T extends IInterface> {
    public static final String[] D = {"service_esmobile", "service_googleme"};
    private static final e2.d[] E = new e2.d[0];
    /* access modifiers changed from: private */
    public boolean A;
    private volatile d1 B;
    protected AtomicInteger C;

    /* renamed from: a  reason: collision with root package name */
    private int f9110a;

    /* renamed from: b  reason: collision with root package name */
    private long f9111b;

    /* renamed from: c  reason: collision with root package name */
    private long f9112c;

    /* renamed from: d  reason: collision with root package name */
    private int f9113d;

    /* renamed from: e  reason: collision with root package name */
    private long f9114e;

    /* renamed from: f  reason: collision with root package name */
    private volatile String f9115f;

    /* renamed from: g  reason: collision with root package name */
    o1 f9116g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f9117h;

    /* renamed from: i  reason: collision with root package name */
    private final Looper f9118i;

    /* renamed from: j  reason: collision with root package name */
    private final i f9119j;

    /* renamed from: k  reason: collision with root package name */
    private final f f9120k;

    /* renamed from: l  reason: collision with root package name */
    final Handler f9121l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f9122m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Object f9123n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public m f9124o;

    /* renamed from: p  reason: collision with root package name */
    protected C0142c f9125p;

    /* renamed from: q  reason: collision with root package name */
    private IInterface f9126q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f9127r;

    /* renamed from: s  reason: collision with root package name */
    private a1 f9128s;

    /* renamed from: t  reason: collision with root package name */
    private int f9129t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final a f9130u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final b f9131v;

    /* renamed from: w  reason: collision with root package name */
    private final int f9132w;

    /* renamed from: x  reason: collision with root package name */
    private final String f9133x;

    /* renamed from: y  reason: collision with root package name */
    private volatile String f9134y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public e2.b f9135z;

    public interface a {
        void B(int i10);

        void Y(Bundle bundle);
    }

    public interface b {
        void J(e2.b bVar);
    }

    /* renamed from: h2.c$c  reason: collision with other inner class name */
    public interface C0142c {
        void a(e2.b bVar);
    }

    protected class d implements C0142c {
        public d() {
        }

        public final void a(e2.b bVar) {
            if (bVar.k()) {
                c cVar = c.this;
                cVar.c((j) null, cVar.C());
            } else if (c.this.f9131v != null) {
                c.this.f9131v.J(bVar);
            }
        }
    }

    public interface e {
        void a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected c(android.content.Context r10, android.os.Looper r11, int r12, h2.c.a r13, h2.c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            h2.i r3 = h2.i.b(r10)
            e2.f r4 = e2.f.f()
            h2.p.j(r13)
            h2.p.j(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.c.<init>(android.content.Context, android.os.Looper, int, h2.c$a, h2.c$b, java.lang.String):void");
    }

    protected c(Context context, Looper looper, i iVar, f fVar, int i10, a aVar, b bVar, String str) {
        this.f9115f = null;
        this.f9122m = new Object();
        this.f9123n = new Object();
        this.f9127r = new ArrayList();
        this.f9129t = 1;
        this.f9135z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        p.k(context, "Context must not be null");
        this.f9117h = context;
        p.k(looper, "Looper must not be null");
        this.f9118i = looper;
        p.k(iVar, "Supervisor must not be null");
        this.f9119j = iVar;
        p.k(fVar, "API availability must not be null");
        this.f9120k = fVar;
        this.f9121l = new x0(this, looper);
        this.f9132w = i10;
        this.f9130u = aVar;
        this.f9131v = bVar;
        this.f9133x = str;
    }

    static /* bridge */ /* synthetic */ void c0(c cVar, d1 d1Var) {
        cVar.B = d1Var;
        if (cVar.S()) {
            f fVar = d1Var.f9148p;
            q.b().c(fVar == null ? null : fVar.l());
        }
    }

    static /* bridge */ /* synthetic */ void d0(c cVar, int i10) {
        int i11;
        int i12;
        synchronized (cVar.f9122m) {
            i11 = cVar.f9129t;
        }
        if (i11 == 3) {
            cVar.A = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = cVar.f9121l;
        handler.sendMessage(handler.obtainMessage(i12, cVar.C.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean g0(c cVar, int i10, int i11, IInterface iInterface) {
        synchronized (cVar.f9122m) {
            if (cVar.f9129t != i10) {
                return false;
            }
            cVar.i0(i11, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean h0(c cVar) {
        if (cVar.A || TextUtils.isEmpty(cVar.E()) || TextUtils.isEmpty(cVar.B())) {
            return false;
        }
        try {
            Class.forName(cVar.E());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final void i0(int i10, IInterface iInterface) {
        o1 o1Var;
        boolean z9 = false;
        if ((i10 == 4) == (iInterface != null)) {
            z9 = true;
        }
        p.a(z9);
        synchronized (this.f9122m) {
            this.f9129t = i10;
            this.f9126q = iInterface;
            if (i10 == 1) {
                a1 a1Var = this.f9128s;
                if (a1Var != null) {
                    i iVar = this.f9119j;
                    String c10 = this.f9116g.c();
                    p.j(c10);
                    iVar.e(c10, this.f9116g.b(), this.f9116g.a(), a1Var, X(), this.f9116g.d());
                    this.f9128s = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                a1 a1Var2 = this.f9128s;
                if (!(a1Var2 == null || (o1Var = this.f9116g) == null)) {
                    String c11 = o1Var.c();
                    String b10 = o1Var.b();
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c11 + " on " + b10);
                    i iVar2 = this.f9119j;
                    String c12 = this.f9116g.c();
                    p.j(c12);
                    iVar2.e(c12, this.f9116g.b(), this.f9116g.a(), a1Var2, X(), this.f9116g.d());
                    this.C.incrementAndGet();
                }
                a1 a1Var3 = new a1(this, this.C.get());
                this.f9128s = a1Var3;
                o1 o1Var2 = (this.f9129t != 3 || B() == null) ? new o1(G(), F(), false, i.a(), I()) : new o1(y().getPackageName(), B(), true, i.a(), false);
                this.f9116g = o1Var2;
                if (o1Var2.d()) {
                    if (g() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f9116g.c())));
                    }
                }
                i iVar3 = this.f9119j;
                String c13 = this.f9116g.c();
                p.j(c13);
                if (!iVar3.f(new h1(c13, this.f9116g.b(), this.f9116g.a(), this.f9116g.d()), a1Var3, X(), w())) {
                    String c14 = this.f9116g.c();
                    String b11 = this.f9116g.b();
                    Log.w("GmsClient", "unable to connect to service: " + c14 + " on " + b11);
                    e0(16, (Bundle) null, this.C.get());
                }
            } else if (i10 == 4) {
                p.j(iInterface);
                K(iInterface);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Bundle A() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    public String B() {
        return null;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> C() {
        return Collections.emptySet();
    }

    public final T D() {
        T t9;
        synchronized (this.f9122m) {
            if (this.f9129t != 5) {
                r();
                t9 = this.f9126q;
                p.k(t9, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t9;
    }

    /* access modifiers changed from: protected */
    public abstract String E();

    /* access modifiers changed from: protected */
    public abstract String F();

    /* access modifiers changed from: protected */
    public String G() {
        return "com.google.android.gms";
    }

    public f H() {
        d1 d1Var = this.B;
        if (d1Var == null) {
            return null;
        }
        return d1Var.f9148p;
    }

    /* access modifiers changed from: protected */
    public boolean I() {
        return g() >= 211700000;
    }

    public boolean J() {
        return this.B != null;
    }

    /* access modifiers changed from: protected */
    public void K(T t9) {
        this.f9112c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void L(e2.b bVar) {
        this.f9113d = bVar.d();
        this.f9114e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void M(int i10) {
        this.f9110a = i10;
        this.f9111b = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void N(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.f9121l;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new b1(this, i10, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.f9134y = str;
    }

    public void Q(int i10) {
        Handler handler = this.f9121l;
        handler.sendMessage(handler.obtainMessage(6, this.C.get(), i10));
    }

    /* access modifiers changed from: protected */
    public void R(C0142c cVar, int i10, PendingIntent pendingIntent) {
        p.k(cVar, "Connection progress callbacks cannot be null.");
        this.f9125p = cVar;
        Handler handler = this.f9121l;
        handler.sendMessage(handler.obtainMessage(3, this.C.get(), i10, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String X() {
        String str = this.f9133x;
        return str == null ? this.f9117h.getClass().getName() : str;
    }

    public boolean a() {
        boolean z9;
        synchronized (this.f9122m) {
            z9 = this.f9129t == 4;
        }
        return z9;
    }

    public void c(j jVar, Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle A2 = A();
        int i10 = this.f9132w;
        String str = this.f9134y;
        int i11 = f.f8350a;
        Scope[] scopeArr = g.A;
        Bundle bundle = new Bundle();
        e2.d[] dVarArr = g.B;
        g gVar = r3;
        g gVar2 = new g(6, i10, i11, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, dVarArr, dVarArr, true, 0, false, str);
        g gVar3 = gVar;
        gVar3.f9175p = this.f9117h.getPackageName();
        gVar3.f9178s = A2;
        if (set2 != null) {
            gVar3.f9177r = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (n()) {
            Account u9 = u();
            if (u9 == null) {
                u9 = new Account("<<default account>>", "com.google");
            }
            gVar3.f9179t = u9;
            if (jVar != null) {
                gVar3.f9176q = jVar.asBinder();
            }
        } else if (O()) {
            gVar3.f9179t = u();
        }
        gVar3.f9180u = E;
        gVar3.f9181v = v();
        if (S()) {
            gVar3.f9184y = true;
        }
        try {
            synchronized (this.f9123n) {
                m mVar = this.f9124o;
                if (mVar != null) {
                    mVar.M2(new z0(this, this.C.get()), gVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            Q(3);
        } catch (SecurityException e11) {
            throw e11;
        } catch (RemoteException | RuntimeException e12) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e12);
            N(8, (IBinder) null, (Bundle) null, this.C.get());
        }
    }

    public void e(String str) {
        this.f9115f = str;
        m();
    }

    /* access modifiers changed from: protected */
    public final void e0(int i10, Bundle bundle, int i11) {
        Handler handler = this.f9121l;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new c1(this, i10, (Bundle) null)));
    }

    public boolean f() {
        return true;
    }

    public int g() {
        return f.f8350a;
    }

    public boolean h() {
        boolean z9;
        synchronized (this.f9122m) {
            int i10 = this.f9129t;
            z9 = true;
            if (i10 != 2) {
                if (i10 != 3) {
                    z9 = false;
                }
            }
        }
        return z9;
    }

    public final e2.d[] i() {
        d1 d1Var = this.B;
        if (d1Var == null) {
            return null;
        }
        return d1Var.f9146n;
    }

    public String j() {
        o1 o1Var;
        if (a() && (o1Var = this.f9116g) != null) {
            return o1Var.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public String k() {
        return this.f9115f;
    }

    public void l(e eVar) {
        eVar.a();
    }

    public void m() {
        this.C.incrementAndGet();
        synchronized (this.f9127r) {
            int size = this.f9127r.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((y0) this.f9127r.get(i10)).d();
            }
            this.f9127r.clear();
        }
        synchronized (this.f9123n) {
            this.f9124o = null;
        }
        i0(1, (IInterface) null);
    }

    public boolean n() {
        return false;
    }

    public void p(C0142c cVar) {
        p.k(cVar, "Connection progress callbacks cannot be null.");
        this.f9125p = cVar;
        i0(2, (IInterface) null);
    }

    public void q() {
        int h10 = this.f9120k.h(this.f9117h, g());
        if (h10 != 0) {
            i0(1, (IInterface) null);
            R(new d(), h10, (PendingIntent) null);
            return;
        }
        p(new d());
    }

    /* access modifiers changed from: protected */
    public final void r() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    public abstract T s(IBinder iBinder);

    /* access modifiers changed from: protected */
    public boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public e2.d[] v() {
        return E;
    }

    /* access modifiers changed from: protected */
    public Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.f9117h;
    }

    public int z() {
        return this.f9132w;
    }
}
